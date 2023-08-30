
dependencies {
    implementation("com.wanna.spring:kotlin-spring-core:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-beans:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-context:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-aop:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-web:$kotlinSpringFrameworkVersion")
    implementation("com.wanna.spring:kotlin-spring-jcl:$kotlinSpringFrameworkVersion")

    implementation("com.wanna.spring:kotlin-spring-boot:$kotlinSpringBootVersion")
    implementation("com.wanna.spring:kotlin-spring-boot-autoconfigure:$kotlinSpringBootVersion")

    implementation(project(":kotlin-spring-cloud-context"))
    implementation(project(":kotlin-spring-cloud-common"))

    implementation("org.slf4j:slf4j-api:$slf4jApiVersion")
    implementation("com.alibaba.nacos:nacos-client:$nacosClientVersion")
    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonDatabindVersion")  // jackson

    // 添加这些依赖, 在test时才能正常启动
    testImplementation("io.netty:netty-codec-http:$nettyVersion")
    testImplementation(project(":kotlin-spring-cloud-ribbon"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}