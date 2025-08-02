/*
 * Copyright (c) 2012-2016 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */
pluginManagement {
    repositories {
        gradlePluginPortal()
        google{
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        //25.07.03 lock
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

// spoofing 은 app인데, 실행 버튼 옆 이름의 설정이라 기능적 지장 없어 그대로 둠
// 25.07.03 걍 app으로 바꿈 *기존 main
// rootProject = 왼쪽 상단의 앱 이름
rootProject.name = "AllinSafe"
include(":main")
//include(":tlsexternalcertprovider")
//include(":remoteExample")
//include(":yubikeyplugin")