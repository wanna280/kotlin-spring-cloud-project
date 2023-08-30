dependencies {
    implementation("com.wanna.spring:kotlin-spring-core:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-beans:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-context:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-aop:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-web:$kotlinSpringFrameworkVersion")

    compileOnly("com.wanna.spring:kotlin-spring-jcl:$kotlinSpringFrameworkVersion")

    implementation("com.wanna.spring:kotlin-spring-boot:$kotlinSpringBootVersion")
    implementation("com.wanna.spring:kotlin-spring-boot-autoconfigure:$kotlinSpringBootVersion")

    implementation(project(":kotlin-spring-cloud-common"))
    implementation(project(":kotlin-spring-cloud-context"))


    implementation("com.netflix.ribbon:ribbon-loadbalancer:$ribbonVersion")
    implementation("com.netflix.ribbon:ribbon-core:$ribbonVersion")
    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonDatabindVersion")  // jackson
    implementation("org.slf4j:slf4j-api:$slf4jApiVersion")
    implementation("io.github.openfeign:feign-httpclient:$feignHttpClientVersion")
    implementation("io.github.openfeign:feign-core:$feignVersion")

    // compileOnly
    compileOnly(project(":kotlin-spring-cloud-ribbon"))
    compileOnly("org.apache.httpcomponents:httpclient:$apacheHttpClientVersion")

    testImplementation("io.netty:netty-codec-http:$nettyVersion")
    testImplementation(project(":kotlin-spring-cloud-ribbon"))
    testImplementation(project(":kotlin-spring-cloud-nacos:kotlin-spring-cloud-nacos-discovery"))
}