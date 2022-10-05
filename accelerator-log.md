# Accelerator Log

## Options
```json
{
  "artifactId" : "fleet-management-app",
  "groupId" : "com.wehaul",
  "packageName" : "com.wehaul.fleet",
  "projectName" : "fleet-mgmt"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Let(symbols, in: Chain(chain))
┃ ┃ ┃ engine.transformations[0].validated.chain (Let)
┃ ┃ ┃ Debug Adding symbol packageDirectory with value 'com/wehaul/fleet'
┃ ┃ ┃ Debug Adding symbol workloadResourceName with value 'fleet-management-app'
┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[0].merge (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug DEPLOYING.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/resources/testcontainers.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[0].<combo>.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug DEPLOYING.md didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/resources/testcontainers.properties didn't match [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug DEPLOYING.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/resources/testcontainers.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗  Info Will replace [<groupId>com.example</groupId>-><groupId>com.wehaul<...(truncated)]
┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.chain.in.transformations[0].merge.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[1].merge (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Exclude
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0].sources[0].exclude (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [**/application.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/application.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [**/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [**/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗  Info Will replace [customer-profile->fleet-management-app]
┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.chain.in.transformations[1].merge.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[2] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[2].merge (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Exclude
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0].sources[0].exclude (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [config/workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗  Info Will replace [customer-profile->fleet-management-app]
┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.chain.in.transformations[2].merge.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[3] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[3].merge (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Exclude
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0].sources[0].exclude (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [Tiltfile]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [Tiltfile]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗  Info Will replace [customer-profile->fleet-management-app]
┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.chain.in.transformations[3].merge.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[4].merge (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Exclude
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[0].exclude (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java matched [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let(symbols, in: Chain(Include, Chain(chain)))
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[1].<combo> (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol packageDirectory with value 'com/wehaul/fleet'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[1].<combo>.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[1].<combo>.in.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/TestData.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1.0__create_customer_profile_table.sql didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfile.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/testcontainers.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/domain/CustomerProfileService.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/Application.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-local.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/customerprofile/ApplicationTest.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug DEPLOYING.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[1].<combo>.in.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[1].<combo>.in.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [com.example.customerprofile->com.wehaul.fleet]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[0].sources[1].<combo>.in.transformations[1].transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/test/java/com/example/customerprofile/domain/TestData.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=test, currentpackage=com/example/, untouchedpath=/domain/TestData.java, g0=src/test/java/com/example/customerprofile/domain/TestData.java, g1=test, g2=com/example/, g3=/domain/TestData.java} and was rewritten to 'src/test/java/com/wehaul/fleet//domain/TestData.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/domain/CustomerProfile.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/domain/CustomerProfile.java, g0=src/main/java/com/example/customerprofile/domain/CustomerProfile.java, g1=main, g2=com/example/, g3=/domain/CustomerProfile.java} and was rewritten to 'src/main/java/com/wehaul/fleet//domain/CustomerProfile.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/domain/NewCustomerProfile.java, g0=src/main/java/com/example/customerprofile/domain/NewCustomerProfile.java, g1=main, g2=com/example/, g3=/domain/NewCustomerProfile.java} and was rewritten to 'src/main/java/com/wehaul/fleet//domain/NewCustomerProfile.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=test, currentpackage=com/example/, untouchedpath=/domain/CustomerProfileServiceTest.java, g0=src/test/java/com/example/customerprofile/domain/CustomerProfileServiceTest.java, g1=test, g2=com/example/, g3=/domain/CustomerProfileServiceTest.java} and was rewritten to 'src/test/java/com/wehaul/fleet//domain/CustomerProfileServiceTest.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/api/CustomerProfileController.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/api/CustomerProfileController.java, g0=src/main/java/com/example/customerprofile/api/CustomerProfileController.java, g1=main, g2=com/example/, g3=/api/CustomerProfileController.java} and was rewritten to 'src/main/java/com/wehaul/fleet//api/CustomerProfileController.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=test, currentpackage=com/example/, untouchedpath=/api/CustomerProfileControllerTest.java, g0=src/test/java/com/example/customerprofile/api/CustomerProfileControllerTest.java, g1=test, g2=com/example/, g3=/api/CustomerProfileControllerTest.java} and was rewritten to 'src/test/java/com/wehaul/fleet//api/CustomerProfileControllerTest.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=test, currentpackage=com/example/, untouchedpath=/data/CustomerProfileRepositoryTest.java, g0=src/test/java/com/example/customerprofile/data/CustomerProfileRepositoryTest.java, g1=test, g2=com/example/, g3=/data/CustomerProfileRepositoryTest.java} and was rewritten to 'src/test/java/com/wehaul/fleet//data/CustomerProfileRepositoryTest.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/data/CustomerProfileJpaRepository.java, g0=src/main/java/com/example/customerprofile/data/CustomerProfileJpaRepository.java, g1=main, g2=com/example/, g3=/data/CustomerProfileJpaRepository.java} and was rewritten to 'src/main/java/com/wehaul/fleet//data/CustomerProfileJpaRepository.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/api/CustomerProfileResponse.java, g0=src/main/java/com/example/customerprofile/api/CustomerProfileResponse.java, g1=main, g2=com/example/, g3=/api/CustomerProfileResponse.java} and was rewritten to 'src/main/java/com/wehaul/fleet//api/CustomerProfileResponse.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/api/CustomerProfileCreateRequest.java, g0=src/main/java/com/example/customerprofile/api/CustomerProfileCreateRequest.java, g1=main, g2=com/example/, g3=/api/CustomerProfileCreateRequest.java} and was rewritten to 'src/main/java/com/wehaul/fleet//api/CustomerProfileCreateRequest.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/domain/CustomerProfileService.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/domain/CustomerProfileService.java, g0=src/main/java/com/example/customerprofile/domain/CustomerProfileService.java, g1=main, g2=com/example/, g3=/domain/CustomerProfileService.java} and was rewritten to 'src/main/java/com/wehaul/fleet//domain/CustomerProfileService.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/Application.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/Application.java, g0=src/main/java/com/example/customerprofile/Application.java, g1=main, g2=com/example/, g3=/Application.java} and was rewritten to 'src/main/java/com/wehaul/fleet//Application.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/data/CustomerProfileEntity.java, g0=src/main/java/com/example/customerprofile/data/CustomerProfileEntity.java, g1=main, g2=com/example/, g3=/data/CustomerProfileEntity.java} and was rewritten to 'src/main/java/com/wehaul/fleet//data/CustomerProfileEntity.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/data/CustomerProfileRepository.java, g0=src/main/java/com/example/customerprofile/data/CustomerProfileRepository.java, g1=main, g2=com/example/, g3=/data/CustomerProfileRepository.java} and was rewritten to 'src/main/java/com/wehaul/fleet//data/CustomerProfileRepository.java'
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗ ┗ Debug Path 'src/test/java/com/example/customerprofile/ApplicationTest.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)customerprofile(?<untouchedpath>.*)' with groups {sourceset=test, currentpackage=com/example/, untouchedpath=/ApplicationTest.java, g0=src/test/java/com/example/customerprofile/ApplicationTest.java, g1=test, g2=com/example/, g3=/ApplicationTest.java} and was rewritten to 'src/test/java/com/wehaul/fleet//ApplicationTest.java'
┃ ┗ ┗ ┗ ┗ ╺ engine.transformations[0].validated.chain.in.transformations[4].merge.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
