
# command
gradle build can generate all the archive artifacts.

gradle build

about various tips on gpg:

https://stackoverflow.com/questions/27936119/gradle-uploadarchives-task-unable-to-read-secret-key

gpg --export-secret-keys -o secring.gpg

gpg --list-keys --keyid-format short

gradle uploadArchives

SNAPSHOT version will not be released to central repository, that is why if we upload snapshot version, it will not show in "Staging Repositories" section.

------------------------------------------------------------
Gradle 5.1
------------------------------------------------------------

Build time:   2019-01-02 18:57:47 UTC
Revision:     d09c2e354576ac41078c322815cc6db2b66d976e

Kotlin DSL:   1.1.0
Kotlin:       1.3.11
Groovy:       2.5.4
Ant:          Apache Ant(TM) version 1.9.13 compiled on July 10 2018
JVM:          1.8.0_231 (Oracle Corporation 25.231-b11)
OS:           Mac OS X 10.14.6 x86_64
