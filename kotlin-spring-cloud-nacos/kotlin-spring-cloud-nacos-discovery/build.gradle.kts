dependencies {
    implementation(project(":kotlin-spring-cloud-ribbon"))
    implementation(project(":kotlin-spring-cloud-context"))
    implementation(project(":kotlin-spring-cloud-common"))

    implementation("com.wanna.spring:kotlin-spring-core:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-beans:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-context:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-aop:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-web:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-jcl:$kotlinSpringFrameworkVersion")

    implementation("com.wanna.spring:kotlin-spring-boot:$kotlinSpringBootVersion")
    implementation("com.wanna.spring:kotlin-spring-boot-autoconfigure:$kotlinSpringBootVersion")

    implementation("com.netflix.ribbon:ribbon-loadbalancer:$ribbonVersion")
    implementation("com.netflix.ribbon:ribbon-core:$ribbonVersion")
    implementation("org.slf4j:slf4j-api:$slf4jApiVersion")
    implementation("com.alibaba.nacos:nacos-client:$nacosClientVersion")
    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonDatabindVersion")  // jackson

    // for Test
    testImplementation(project(":kotlin-spring-cloud-ribbon"))
    testImplementation("io.netty:netty-codec-http:$nettyVersion")
}