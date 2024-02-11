package com.example.demoproject23333.configuration;


import com.example.test.jwt.filtert.JwtFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
//                .httpBasic().disable()
                .httpBasic(AbstractHttpConfigurer::disable)
//                .httpBasic(withDefaults())
//                .csrf().disable()
                .csrf(AbstractHttpConfigurer::disable)
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .sessionManagement(ss -> {
                    ss.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                })
//                .sessionManagement(manager -> manager.sessionCreationPolicy(STATELESS))
                .authorizeHttpRequests(
                        authz -> {
                            authz.requestMatchers("/auth/v1/login", "/auth/v1/token","/rest/v2/putRawParams").permitAll()
                                    .requestMatchers(new AntPathRequestMatcher("swagger-ui/")).permitAll()
                                    .requestMatchers(new AntPathRequestMatcher("/swagger-ui/")).permitAll()
                                    .requestMatchers(new AntPathRequestMatcher("v3/api-docs/")).permitAll()
                                    .requestMatchers(new AntPathRequestMatcher("/v3/api-docs/")).permitAll()
                                    .anyRequest().authenticated();
//                                    .and().addFilterAfter(jwtFilter, UsernamePasswordAuthenticationFilter.class);

                        }
                )
                .build();
    }


}
