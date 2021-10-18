//package za.ac.cput.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//     auth.inMemoryAuthentication()
//             .withUser("adminA")
//             .password("{noop}12345")
//             .roles("ADMIN")
//             .and()
//             .withUser("client")
//             .password("{noop}54321")
//             .roles("USER");
//
//    }
//
//    @Override
//    protected  void configure(HttpSecurity http) throws  Exception{
////        super.configure(http);
//
//        http.httpBasic()
//                .and()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.POST,"**/create").hasRole("ADMIN")
//                .antMatchers(HttpMethod.DELETE,"**/delete").hasRole("ADMIN")
//                .antMatchers(HttpMethod.POST, "**/update").hasRole("USER")
//                .antMatchers(HttpMethod.GET, "**/getAll").hasAnyRole("ADMIN","USER")
//                .and()
//                .csrf().disable()
//                .formLogin().disable();
//
//
//    }
//
////    @Bean
////    public BCryptPasswordEncoder encodePWD(){
////        return new BCryptPasswordEncoder();
////    }
//
//}
//
