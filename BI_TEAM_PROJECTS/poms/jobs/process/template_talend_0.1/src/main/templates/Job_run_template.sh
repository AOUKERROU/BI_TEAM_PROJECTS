#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/log4j-slf4j-impl-2.17.1.jar:$ROOT_PATH/../lib/log4j-api-2.17.1.jar:$ROOT_PATH/../lib/log4j-core-2.17.1.jar:$ROOT_PATH/../lib/log4j-1.2-api-2.17.1.jar:$ROOT_PATH/../lib/accessors-smart-2.4.7.jar:$ROOT_PATH/../lib/activation.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/javax.mail-1.6.2.jar:$ROOT_PATH/../lib/job-audit-1.4.jar:$ROOT_PATH/../lib/advancedPersistentLookupLib-1.4.jar:$ROOT_PATH/../lib/asm-9.1.jar:$ROOT_PATH/../lib/jboss-marshalling-2.0.12.Final.jar:$ROOT_PATH/../lib/talend_file_enhanced-1.1.jar:$ROOT_PATH/../lib/json-smart-2.4.7.jar:$ROOT_PATH/../lib/dom4j-2.1.3.jar:$ROOT_PATH/../lib/slf4j-api-1.7.29.jar:$ROOT_PATH/../lib/talendcsv-1.0.0.jar:$ROOT_PATH/../lib/crypto-utils-0.31.12.jar:$ROOT_PATH/../lib/jtds-1.3.1-patch-20190523.jar:$ROOT_PATH/../lib/ojdbc8-19.3.0.0.jar:$ROOT_PATH/../lib/audit-log4j2-1.16.1.jar:$ROOT_PATH/../lib/thashfile-3.1-20190910.jar:$ROOT_PATH/../lib/logging-event-layout-1.16.1.jar:$ROOT_PATH/../lib/commons-lang3-3.10.jar:$ROOT_PATH/../lib/talend_DB_mssqlUtil-1.4.jar:$ROOT_PATH/../lib/talend-oracle-timestamptz.jar:$ROOT_PATH/../lib/trove.jar:$ROOT_PATH/../lib/audit-common-1.16.1.jar:$ROOT_PATH/../lib/jboss-marshalling-river-2.0.12.Final.jar:$ROOT_PATH/template_talend_0_1.jar: bi_team_projects.template_talend_0_1.TEMPLATE_TALEND --context=DEV "$@"
