## Release Checklist

0. Make sure to reference just public artifacts in `gradle.build`

1. Increment version in `README.md`, `gradle.build`

3. Update [CHANGES.md](../CHANGES.md)

5. Do the release

```bash
export KORTOOLS_HOME="/d/projects/scheduling/kortools";

trim() { while read -r line; do echo "$line"; done; }
kortools_version='v'$(grep '^version' ${KORTOOLS_HOME}/build.gradle | cut -f2 -d' ' | tr -d "'" | trim)

echo "new version is $kortools_version"


if [[ $kortools_version == *"-SNAPSHOT" ]]; then
  echo "ERROR: Won't publish snapshot build $kortools_version}!" 1>&2
  exit 1
fi

cd  $KORTOOLS_HOME

git status
git commit -am "${kortools_version} release"
#git diff --exit-code  || echo "There are uncomitted changes"

git tag "${kortools_version}"

git push origin 
git push origin --tags


########################################################################
### Build and publish the binary release to maven-central

#./gradlew install

# careful with this one!
# https://getstream.io/blog/publishing-libraries-to-mavencentral-2021/
# https://central.sonatype.org/pages/gradle.html
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository


## also see https://oss.sonatype.org/
## tutorial https://getstream.io/blog/publishing-libraries-to-mavencentral-2021/
```

--

4. Increment version to *-SNAPSHOT for next release cycle

