FROM maven AS builder

WORKDIR /tmp/source
COPY . . 
RUN mvn clean install


FROM quay.io/wildfly/wildfly:35.0.1.Final-jdk21


COPY --from=builder /tmp/source/target/jakartaee-faces.war /opt/jboss/wildfly/standalone/deployments/

