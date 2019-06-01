ARG ODI_VERSION=12.2.1.3.2
FROM r.cfcr.io/redpillanalytics/odi:$ODI_VERSION

ARG SDK_HOME=build/odi-sdk
ARG ODI_VERSION

ENV ODI_SDK=${SDK_HOME}/${ODI_VERSION}

COPY copy_jars.sh ./

RUN chmod u+x copy_jars.sh && \
    mkdir -p ${ODI_SDK} && \
    chmod -R u+wr ${ODI_SDK}
