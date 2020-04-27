# jdk8
This is a jdk8 source repository, the version number is jdk-8u212.

# FAQ
1. Unsafe是内部专用 API, 可能会在未来发行版中删除
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>2.5.1</version>
    <configuration>
        <source>${compile.version}</source>
        <target>${compile.version}</target>
        <encoding>${project.build.sourceEncoding}</encoding>
        <compilerArguments>
            <!-- 请仔细检查你本地rt.jar具体的硬盘路径 -->
            <extdirs>${java.home}/jre/lib/rt.jar</extdirs>
        </compilerArguments>
    </configuration>
</plugin>


