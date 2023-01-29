package lis.security;


import lis.services.UserService;
import org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private JwtAuthEntryPoint authEntryPoint;
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    public SecurityConfig(JwtAuthEntryPoint authEntryPoint, CustomUserDetailsService customUserDetailsService) {
        this.authEntryPoint = authEntryPoint;
        this.customUserDetailsService = customUserDetailsService;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf().disable()
                .exceptionHandling()
                .authenticationEntryPoint(authEntryPoint)
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeHttpRequests()
                .requestMatchers("/api/auth/login").permitAll()
                .requestMatchers("/medical-records/validate/**").hasAnyAuthority(SecurityConsts.ADMIN,
                        SecurityConsts.DOCTOR)
                .requestMatchers("/medical-records/**").hasAnyAuthority(SecurityConsts.ADMIN,
                        SecurityConsts.DOCTOR, SecurityConsts.NURSE)

                .requestMatchers("/hematologies/**").hasAnyAuthority(SecurityConsts.ADMIN,
                        SecurityConsts.DOCTOR, SecurityConsts.NURSE)
                .requestMatchers("/urines/**").hasAnyAuthority(SecurityConsts.ADMIN,
                        SecurityConsts.DOCTOR, SecurityConsts.NURSE)
                .requestMatchers("/users/current-role").permitAll()
                .requestMatchers("/users/current-id").permitAll()
                .requestMatchers("/users/current-user").permitAll()
                .requestMatchers("/users/**").hasAuthority(SecurityConsts.ADMIN)
                .requestMatchers("/biochemistries/**").hasAnyAuthority(SecurityConsts.ADMIN,
                        SecurityConsts.DOCTOR, SecurityConsts.NURSE)
                .requestMatchers("/patients/**").hasAnyAuthority(SecurityConsts.ADMIN,
                        SecurityConsts.DOCTOR, SecurityConsts.NURSE)
                .requestMatchers("/api/auth/register").hasAuthority(SecurityConsts.ADMIN)
                .requestMatchers("/api/auth/change-password").hasAnyAuthority(SecurityConsts.ADMIN,
                        SecurityConsts.DOCTOR, SecurityConsts.NURSE)
                .and()
                .httpBasic();
        http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public  JwtAuthenticationFilter jwtAuthenticationFilter() {
        return new JwtAuthenticationFilter();
    }
}
