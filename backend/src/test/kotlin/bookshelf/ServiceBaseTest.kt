package kbookshelf

import bookshelf.aspect.LoggingAspect
import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.StringSpec
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestPropertySource

@Suppress("UNCHECKED_CAST")
@ContextConfiguration(
        initializers = [ConfigFileApplicationContextInitializer::class], classes = [MyTestConfiguration::class]
)

@ActiveProfiles("test")
abstract class ServiceBaseTest(body: ServiceBaseTest.() -> Unit) : StringSpec(body as StringSpec.() -> Unit) {

    @MockkBean
    lateinit var loggingAspect: LoggingAspect
}

//@ComponentScan(
//        basePackages = ["bookshelf.models.services"]
//)
@TestPropertySource("classpath:application-test.yaml")
open class MyTestConfiguration{
    @Bean
    open fun propertiesResolver(): PropertySourcesPlaceholderConfigurer = PropertySourcesPlaceholderConfigurer()

}