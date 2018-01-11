# Serializable Temporal Amount

[![Current Version](https://badge.fury.io/gh/AuraDevelopmentTeam%2FSerializableTemporalAmount.svg)](https://maven.jnc.world/dev/aura/lib/sta/SerializableTemporalAmount/)
[![Build Status](https://gitlab.brainstonemod.com/AuraDev/SerializableTemporalAmount/badges/master/build.svg)](https://gitlab.brainstonemod.com/AuraDev/SerializableTemporalAmount/pipelines)
[![Coverage Report](https://gitlab.brainstonemod.com/AuraDev/SerializableTemporalAmount/badges/master/coverage.svg)](https://auradev.pages.brainstonemod.com/VersionLib/coverage/SerializableTemporalAmount/)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/53696b6ca12048fda1bfbf2d6c4ba412)](https://www.codacy.com/app/AuraDevelopmentTeam/SerializableTemporalAmount?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=AuraDevelopmentTeam/SerializableTemporalAmount&amp;utm_campaign=Badge_Grade)
[![Issue Stats](https://img.shields.io/issuestats/i/github/AuraDevelopmentTeam/SerializableTemporalAmount.svg)](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/issues)
[![License](https://img.shields.io/github/license/AuraDevelopmentTeam/SerializableTemporalAmount.svg)](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/blob/master/LICENSE)

A serializable implementation of java.time.TemporalAmount. Designed to work with ninja.leaping.configurate

## Table of Contents

- [Downloads](#downloads)
- [Developing with the Library](#developing-with-the-library)
	- [Maven](#maven)
	- [Gradle](#gradle)
- [Issue Reporting](#issue-reporting)
- [Feature Requests](#feature-requests)
- [Setting up a Workspace/Compiling from Source](#setting-up-a-workspacecompiling-from-source)
- [Development builds](#development-builds)
- [PGP Signing](#pgp-signing)
- [License](#license)
- [Support](#support)
	- [Getting Support](#getting-support)
	- [Supporting us!](#supporting-us)

## Downloads

You can download all builds from:

- Personal Maven: https://maven.jnc.world/dev/aura/lib/sta/SerializableTemporalAmount/

## Developing with the Library

You can easily use this library by including it as a maven dependency, as all releases get uploaded to our maven repository. (Replace `{version}` with the
appropriate version!)

### Maven

    <repositories>
        <repository>
            <id>AuraDevelopmentTeam</id>
            <url>https://maven.jnc.world</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>dev.aura.lib.sta</groupId>
            <artifactId>SerializableTemporalAmount</artifactId>
            <version>{version}</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>

### Gradle

    repositories {
        maven {
            name "AuraDevelopmentTeam"
            url "https://maven.jnc.world"
        }
    }

    dependencies {
        compile "dev.aura.lib.sta:SerializableTemporalAmount:{version}"
    }

## [Issue Reporting](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/issues)

If you found a bug or even are experiencing a crash please report it so we can fix it. Please check at first if a bug report for the issue already
[exits](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/issues). If not just create a
[new issue](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/issues/new) and fill out the form.

Please include the following:

* Version Lib version
* Java version
* For crashes:
  * Steps to reproduce
  * Logs if available

*(When creating a new issue please follow the template)*

## [Feature Requests](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/issues)

If you want a new feature added, go ahead an open a [new issue](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/issues/new), remove the existing form and
describe your feature the best you can. The more details you provide the easier it will be implementing it.  
You can also talk to us on [Discord](https://dicord.me/bungeechat).

## Setting up a Workspace/Compiling from Source

* Clone:  
  Clone the repository like this: `git clone --recursive https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount.git`
* IDE-Setup:  
  Run [gradle] in the repository root: `./gradlew installLombok <eclipse|idea>`
* Build:  
  Run [gradle] in the repository root: `./gradlew build`. The build will be in `build/libs`
* If obscure Gradle issues are found try running `./gradlew cleanCache clean`

## PGP Signing

All files will be signed with PGP.  
The public key to verify it can be found in `misc/publicKey.asc`. The signatures of the files will also be found in the maven.

## License

Version Lib is licensed under the [MIT License](https://github.com/AuraDevelopmentTeam/SerializableTemporalAmount/blob/master/LICENSE)

## Support

### Getting Support

If you need help with anything, want to discuss issues or suggestions, or just want to say hi, you can visit our
[Discord Server (https://discord.me/bungeechat)](https://discord.me/bungeechat).

### Supporting us!

Thanks for scrolling down so far!  
We are developing this plugin (and others!) as well as providing constant support for all our plugins free of charge so that as many people as possible can use
it! Since it is still a lot of work we would really appreciate it if you could support us on [Patreon](https://www.patreon.com/AuraDev)!

<p align="center"><a href="https://www.patreon.com/bePatron?u=6416598"><img alt="Become a Patreon" src="https://c5.patreon.com/external/logo/become_a_patron_button.png"></a></p>

## Random Quote

> We build our computer (systems) the way we build our cities: over time, without a plan, on top of ruins.
>
> — <cite>Ellen Ullman</cite>
