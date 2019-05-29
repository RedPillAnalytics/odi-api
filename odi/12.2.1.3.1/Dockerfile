FROM r.cfcr.io/redpillanalytics/odi:12.2.1.3.1

ARG SDK_HOME=odi-sdk

ENV ODI_SDK=${SDK_HOME}/${VERSION}

COPY copy_jars.sh ./

RUN chmod u+x copy_jars.sh && \
    mkdir -p ${ODI_SDK} && \
    chmod -R u+wr ${ODI_SDK}
