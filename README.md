# Deep-Combat

Minecraft Paper 서버용 플러그인입니다.

## 대상 환경

| 항목 | 버전 |
|------|------|
| Minecraft / Paper | 26.3 |
| Java | 25 |
| Gradle | 9.8.2 (wrapper 포함) |

## 빌드

```bash
./gradlew build
```

빌드된 jar는 `build/libs/`에 생성됩니다. 서버의 `plugins/` 폴더에 넣어 사용합니다.

## 구조

```
src/main/java/io/github/dbstjr3377/deepcombat/DeepCombat.java  # 플러그인 메인 클래스
src/main/resources/plugin.yml                                  # 플러그인 정보
gradle.properties                                              # 버전 설정 (mcVersion 등)
```
