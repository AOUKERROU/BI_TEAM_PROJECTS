
package bi_team_projects.test_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.SQLike;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;

@SuppressWarnings("unused")

/**
 * Job: TEST Purpose: <br>
 * Description: <br>
 * 
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status
 */
public class TEST implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "TEST.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(TEST.class);

	protected static void logIgnoredError(String message, Throwable cause) {
		log.error(message, cause);

	}

	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}

	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	private final static String utf8Charset = "UTF-8";

	// contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String, String> propertyTypes = new java.util.HashMap<>();

		public PropertiesWithType(java.util.Properties properties) {
			super(properties);
		}

		public PropertiesWithType() {
			super();
		}

		public void setContextType(String key, String type) {
			propertyTypes.put(key, type);
		}

		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}

	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();

	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public void synchronizeContext() {

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "TEST";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";

	private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();

	private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
	public final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

	private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName,
			"_0-AqwAmpEe2IX-E-61NGPg", "0.1");
	private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

	private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";

	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(),
					new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	public void setDataSourceReferences(List serviceReferences) throws Exception {

		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();

		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils
				.getServices(serviceReferences, javax.sql.DataSource.class).entrySet()) {
			dataSources.put(entry.getKey(), entry.getValue());
			talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
	private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

	public String getExceptionStackTrace() {
		if ("failure".equals(this.getStatus())) {
			errorMessagePS.flush();
			return baos.toString();
		}
		return null;
	}

	private Exception exception;

	public Exception getException() {
		if ("failure".equals(this.getStatus())) {
			return this.exception;
		}
		return null;
	}

	private class TalendException extends Exception {

		private static final long serialVersionUID = 1L;

		private java.util.Map<String, Object> globalMap = null;
		private Exception e = null;
		private String currentComponent = null;
		private String virtualComponentName = null;

		public void setVirtualComponentName(String virtualComponentName) {
			this.virtualComponentName = virtualComponentName;
		}

		private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
			this.currentComponent = errorComponent;
			this.globalMap = globalMap;
			this.e = e;
		}

		public Exception getException() {
			return this.e;
		}

		public String getCurrentComponent() {
			return this.currentComponent;
		}

		public String getExceptionCauseMessage(Exception e) {
			Throwable cause = e;
			String message = null;
			int i = 10;
			while (null != cause && 0 < i--) {
				message = cause.getMessage();
				if (null == message) {
					cause = cause.getCause();
				} else {
					break;
				}
			}
			if (null == message) {
				message = e.getClass().getName();
			}
			return message;
		}

		@Override
		public void printStackTrace() {
			if (!(e instanceof TalendException || e instanceof TDieException)) {
				if (virtualComponentName != null && currentComponent.indexOf(virtualComponentName + "_") == 0) {
					globalMap.put(virtualComponentName + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				}
				globalMap.put(currentComponent + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
			}
			if (!(e instanceof TDieException)) {
				if (e instanceof TalendException) {
					e.printStackTrace();
				} else {
					e.printStackTrace();
					e.printStackTrace(errorMessagePS);
					TEST.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(TEST.this, new Object[] { e, currentComponent, globalMap });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
					}
				} catch (Exception e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void tDBConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tHashOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tHashInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tAdvancedHash_row5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tAggregateRow_1_AGGOUT_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		tAggregateRow_1_AGGIN_error(exception, errorComponent, globalMap);

	}

	public void tAggregateRow_1_AGGIN_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tDBConnection_1 begin ] start
				 */

				ok_Hash.put("tDBConnection_1", false);
				start_Hash.put("tDBConnection_1", System.currentTimeMillis());

				currentComponent = "tDBConnection_1";

				int tos_count_tDBConnection_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBConnection_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_1 = new StringBuilder();
							log4jParamters_tDBConnection_1.append("Parameters:");
							log4jParamters_tDBConnection_1.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("DB_VERSION" + " = " + "ORACLE_18");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("USE_TNS_FILE" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("HOST" + " = " + "context.host_gold");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("PORT" + " = " + "context.port_gold");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("DBNAME" + " = " + "context.sid_gold");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("SCHEMA_DB" + " = " + "\"\"");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("USER" + " = " + "context.user_gold");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.mdp_gold))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleConnection");
							log4jParamters_tDBConnection_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_1 - " + (log4jParamters_tDBConnection_1));
						}
					}
					new BytesLimit65535_tDBConnection_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_1", "GOLD", "tOracleConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_1 = "jdbc:oracle:thin:@" + context.host_gold + ":" + context.port_gold + ":"
						+ context.sid_gold;
				globalMap.put("connectionType_" + "tDBConnection_1", "ORACLE_SID");
				String dbUser_tDBConnection_1 = context.user_gold;

				final String decryptedPassword_tDBConnection_1 = context.mdp_gold;
				String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;

				java.sql.Connection conn_tDBConnection_1 = null;

				String driverClass_tDBConnection_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
				globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);

				log.debug("tDBConnection_1 - Driver ClassName: " + driverClass_tDBConnection_1 + ".");

				log.debug("tDBConnection_1 - Connection attempt to '" + url_tDBConnection_1 + "' with the username '"
						+ dbUser_tDBConnection_1 + "'.");

				conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1, dbUser_tDBConnection_1,
						dbPwd_tDBConnection_1);
				log.debug("tDBConnection_1 - Connection to '" + url_tDBConnection_1 + "' has succeeded.");

				globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
				if (null != conn_tDBConnection_1) {

					log.debug("tDBConnection_1 - Connection is set auto commit to 'false'.");
					conn_tDBConnection_1.setAutoCommit(false);
				}
				globalMap.put("host_" + "tDBConnection_1", context.host_gold);
				globalMap.put("port_" + "tDBConnection_1", context.port_gold);
				globalMap.put("dbname_" + "tDBConnection_1", context.sid_gold);

				globalMap.put("dbschema_" + "tDBConnection_1", "");
				globalMap.put("username_" + "tDBConnection_1", context.user_gold);
				globalMap.put("password_" + "tDBConnection_1", dbPwd_tDBConnection_1);

				/**
				 * [tDBConnection_1 begin ] stop
				 */

				/**
				 * [tDBConnection_1 main ] start
				 */

				currentComponent = "tDBConnection_1";

				tos_count_tDBConnection_1++;

				/**
				 * [tDBConnection_1 main ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_end ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_1 end ] start
				 */

				currentComponent = "tDBConnection_1";

				if (log.isDebugEnabled())
					log.debug("tDBConnection_1 - " + ("Done."));

				ok_Hash.put("tDBConnection_1", true);
				end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				/**
				 * [tDBConnection_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tDBConnection_1 finally ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}

	public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEST = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[0];

		public Integer FOUCFIN;

		public Integer getFOUCFIN() {
			return this.FOUCFIN;
		}

		public String FOULIB;

		public String getFOULIB() {
			return this.FOULIB;
		}

		public String FOUCNUF;

		public String getFOUCNUF() {
			return this.FOUCNUF;
		}

		public Integer COUNTFRN;

		public Integer getCOUNTFRN() {
			return this.COUNTFRN;
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

					this.COUNTFRN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

					this.COUNTFRN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("FOUCFIN=" + String.valueOf(FOUCFIN));
			sb.append(",FOULIB=" + FOULIB);
			sb.append(",FOUCNUF=" + FOUCNUF);
			sb.append(",COUNTFRN=" + String.valueOf(COUNTFRN));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (FOUCFIN == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCFIN);
			}

			sb.append("|");

			if (FOULIB == null) {
				sb.append("<null>");
			} else {
				sb.append(FOULIB);
			}

			sb.append("|");

			if (FOUCNUF == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCNUF);
			}

			sb.append("|");

			if (COUNTFRN == null) {
				sb.append("<null>");
			} else {
				sb.append(COUNTFRN);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row9Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEST = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[0];

		public Integer FOUCFIN;

		public Integer getFOUCFIN() {
			return this.FOUCFIN;
		}

		public String FOULIB;

		public String getFOULIB() {
			return this.FOULIB;
		}

		public String FOUCNUF;

		public String getFOUCNUF() {
			return this.FOUCNUF;
		}

		public Integer COUNTFRN;

		public Integer getCOUNTFRN() {
			return this.COUNTFRN;
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

					this.COUNTFRN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

					this.COUNTFRN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("FOUCFIN=" + String.valueOf(FOUCFIN));
			sb.append(",FOULIB=" + FOULIB);
			sb.append(",FOUCNUF=" + FOUCNUF);
			sb.append(",COUNTFRN=" + String.valueOf(COUNTFRN));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (FOUCFIN == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCFIN);
			}

			sb.append("|");

			if (FOULIB == null) {
				sb.append("<null>");
			} else {
				sb.append(FOULIB);
			}

			sb.append("|");

			if (FOUCNUF == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCNUF);
			}

			sb.append("|");

			if (COUNTFRN == null) {
				sb.append("<null>");
			} else {
				sb.append(COUNTFRN);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row4Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class OnRowsEndStructtAggregateRow_1
			implements routines.system.IPersistableRow<OnRowsEndStructtAggregateRow_1> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEST = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[0];

		public Integer FOUCFIN;

		public Integer getFOUCFIN() {
			return this.FOUCFIN;
		}

		public String FOULIB;

		public String getFOULIB() {
			return this.FOULIB;
		}

		public String FOUCNUF;

		public String getFOUCNUF() {
			return this.FOUCNUF;
		}

		public Integer COUNTFRN;

		public Integer getCOUNTFRN() {
			return this.COUNTFRN;
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

					this.COUNTFRN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

					this.COUNTFRN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("FOUCFIN=" + String.valueOf(FOUCFIN));
			sb.append(",FOULIB=" + FOULIB);
			sb.append(",FOUCNUF=" + FOUCNUF);
			sb.append(",COUNTFRN=" + String.valueOf(COUNTFRN));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (FOUCFIN == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCFIN);
			}

			sb.append("|");

			if (FOULIB == null) {
				sb.append("<null>");
			} else {
				sb.append(FOULIB);
			}

			sb.append("|");

			if (FOUCNUF == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCNUF);
			}

			sb.append("|");

			if (COUNTFRN == null) {
				sb.append("<null>");
			} else {
				sb.append(COUNTFRN);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OnRowsEndStructtAggregateRow_1 other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class fouciStruct implements routines.system.IPersistableRow<fouciStruct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEST = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[0];

		public Integer FOUCFIN;

		public Integer getFOUCFIN() {
			return this.FOUCFIN;
		}

		public String FOULIB;

		public String getFOULIB() {
			return this.FOULIB;
		}

		public String FOUCNUF;

		public String getFOUCNUF() {
			return this.FOUCNUF;
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.FOULIB = readString(dis);

					this.FOUCNUF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

				// String

				writeString(this.FOULIB, dos);

				// String

				writeString(this.FOUCNUF, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("FOUCFIN=" + String.valueOf(FOUCFIN));
			sb.append(",FOULIB=" + FOULIB);
			sb.append(",FOUCNUF=" + FOUCNUF);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (FOUCFIN == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCFIN);
			}

			sb.append("|");

			if (FOULIB == null) {
				sb.append("<null>");
			} else {
				sb.append(FOULIB);
			}

			sb.append("|");

			if (FOUCNUF == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCNUF);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(fouciStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEST = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[0];

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
		}

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public String DATE_DEBUT;

		public String getDATE_DEBUT() {
			return this.DATE_DEBUT;
		}

		public String DATE_FIN;

		public String getDATE_FIN() {
			return this.DATE_FIN;
		}

		public Long CODEENSEIGNE;

		public Long getCODEENSEIGNE() {
			return this.CODEENSEIGNE;
		}

		public Long CODE_ARTICLE;

		public Long getCODE_ARTICLE() {
			return this.CODE_ARTICLE;
		}

		public BigDecimal QTE;

		public BigDecimal getQTE() {
			return this.QTE;
		}

		public BigDecimal CA_TTC;

		public BigDecimal getCA_TTC() {
			return this.CA_TTC;
		}

		public BigDecimal CA_HT;

		public BigDecimal getCA_HT() {
			return this.CA_HT;
		}

		public java.util.Date DateLastUpdateWebJob;

		public java.util.Date getDateLastUpdateWebJob() {
			return this.DateLastUpdateWebJob;
		}

		public Integer FOUCIN;

		public Integer getFOUCIN() {
			return this.FOUCIN;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_INTERNE_ARTICLE = null;
					} else {
						this.CODE_INTERNE_ARTICLE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODESITE = null;
					} else {
						this.CODESITE = dis.readLong();
					}

					this.DATE_DEBUT = readString(dis);

					this.DATE_FIN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.CODEENSEIGNE = null;
					} else {
						this.CODEENSEIGNE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_ARTICLE = null;
					} else {
						this.CODE_ARTICLE = dis.readLong();
					}

					this.QTE = (BigDecimal) dis.readObject();

					this.CA_TTC = (BigDecimal) dis.readObject();

					this.CA_HT = (BigDecimal) dis.readObject();

					this.DateLastUpdateWebJob = readDate(dis);

					this.FOUCIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_INTERNE_ARTICLE = null;
					} else {
						this.CODE_INTERNE_ARTICLE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODESITE = null;
					} else {
						this.CODESITE = dis.readLong();
					}

					this.DATE_DEBUT = readString(dis);

					this.DATE_FIN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.CODEENSEIGNE = null;
					} else {
						this.CODEENSEIGNE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_ARTICLE = null;
					} else {
						this.CODE_ARTICLE = dis.readLong();
					}

					this.QTE = (BigDecimal) dis.readObject();

					this.CA_TTC = (BigDecimal) dis.readObject();

					this.CA_HT = (BigDecimal) dis.readObject();

					this.DateLastUpdateWebJob = readDate(dis);

					this.FOUCIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
				}

				// Long

				if (this.CODE_INTERNE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_INTERNE_ARTICLE);
				}

				// Long

				if (this.CODESITE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODESITE);
				}

				// String

				writeString(this.DATE_DEBUT, dos);

				// String

				writeString(this.DATE_FIN, dos);

				// Long

				if (this.CODEENSEIGNE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODEENSEIGNE);
				}

				// Long

				if (this.CODE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_ARTICLE);
				}

				// BigDecimal

				dos.writeObject(this.QTE);

				// BigDecimal

				dos.writeObject(this.CA_TTC);

				// BigDecimal

				dos.writeObject(this.CA_HT);

				// java.util.Date

				writeDate(this.DateLastUpdateWebJob, dos);

				// Integer

				writeInteger(this.FOUCIN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
				}

				// Long

				if (this.CODE_INTERNE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_INTERNE_ARTICLE);
				}

				// Long

				if (this.CODESITE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODESITE);
				}

				// String

				writeString(this.DATE_DEBUT, dos);

				// String

				writeString(this.DATE_FIN, dos);

				// Long

				if (this.CODEENSEIGNE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODEENSEIGNE);
				}

				// Long

				if (this.CODE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_ARTICLE);
				}

				// BigDecimal

				dos.writeObject(this.QTE);

				// BigDecimal

				dos.writeObject(this.CA_TTC);

				// BigDecimal

				dos.writeObject(this.CA_HT);

				// java.util.Date

				writeDate(this.DateLastUpdateWebJob, dos);

				// Integer

				writeInteger(this.FOUCIN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("EAN=" + String.valueOf(EAN));
			sb.append(",CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",DATE_DEBUT=" + DATE_DEBUT);
			sb.append(",DATE_FIN=" + DATE_FIN);
			sb.append(",CODEENSEIGNE=" + String.valueOf(CODEENSEIGNE));
			sb.append(",CODE_ARTICLE=" + String.valueOf(CODE_ARTICLE));
			sb.append(",QTE=" + String.valueOf(QTE));
			sb.append(",CA_TTC=" + String.valueOf(CA_TTC));
			sb.append(",CA_HT=" + String.valueOf(CA_HT));
			sb.append(",DateLastUpdateWebJob=" + String.valueOf(DateLastUpdateWebJob));
			sb.append(",FOUCIN=" + String.valueOf(FOUCIN));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
			}

			sb.append("|");

			if (CODE_INTERNE_ARTICLE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODE_INTERNE_ARTICLE);
			}

			sb.append("|");

			if (CODESITE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODESITE);
			}

			sb.append("|");

			if (DATE_DEBUT == null) {
				sb.append("<null>");
			} else {
				sb.append(DATE_DEBUT);
			}

			sb.append("|");

			if (DATE_FIN == null) {
				sb.append("<null>");
			} else {
				sb.append(DATE_FIN);
			}

			sb.append("|");

			if (CODEENSEIGNE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODEENSEIGNE);
			}

			sb.append("|");

			if (CODE_ARTICLE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODE_ARTICLE);
			}

			sb.append("|");

			if (QTE == null) {
				sb.append("<null>");
			} else {
				sb.append(QTE);
			}

			sb.append("|");

			if (CA_TTC == null) {
				sb.append("<null>");
			} else {
				sb.append(CA_TTC);
			}

			sb.append("|");

			if (CA_HT == null) {
				sb.append("<null>");
			} else {
				sb.append(CA_HT);
			}

			sb.append("|");

			if (DateLastUpdateWebJob == null) {
				sb.append("<null>");
			} else {
				sb.append(DateLastUpdateWebJob);
			}

			sb.append("|");

			if (FOUCIN == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCIN);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row1Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class after_tDBInput_1Struct implements routines.system.IPersistableRow<after_tDBInput_1Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEST = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[0];

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
		}

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public String DATE_DEBUT;

		public String getDATE_DEBUT() {
			return this.DATE_DEBUT;
		}

		public String DATE_FIN;

		public String getDATE_FIN() {
			return this.DATE_FIN;
		}

		public Long CODEENSEIGNE;

		public Long getCODEENSEIGNE() {
			return this.CODEENSEIGNE;
		}

		public Long CODE_ARTICLE;

		public Long getCODE_ARTICLE() {
			return this.CODE_ARTICLE;
		}

		public BigDecimal QTE;

		public BigDecimal getQTE() {
			return this.QTE;
		}

		public BigDecimal CA_TTC;

		public BigDecimal getCA_TTC() {
			return this.CA_TTC;
		}

		public BigDecimal CA_HT;

		public BigDecimal getCA_HT() {
			return this.CA_HT;
		}

		public java.util.Date DateLastUpdateWebJob;

		public java.util.Date getDateLastUpdateWebJob() {
			return this.DateLastUpdateWebJob;
		}

		public Integer FOUCIN;

		public Integer getFOUCIN() {
			return this.FOUCIN;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEST.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEST.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEST, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_INTERNE_ARTICLE = null;
					} else {
						this.CODE_INTERNE_ARTICLE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODESITE = null;
					} else {
						this.CODESITE = dis.readLong();
					}

					this.DATE_DEBUT = readString(dis);

					this.DATE_FIN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.CODEENSEIGNE = null;
					} else {
						this.CODEENSEIGNE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_ARTICLE = null;
					} else {
						this.CODE_ARTICLE = dis.readLong();
					}

					this.QTE = (BigDecimal) dis.readObject();

					this.CA_TTC = (BigDecimal) dis.readObject();

					this.CA_HT = (BigDecimal) dis.readObject();

					this.DateLastUpdateWebJob = readDate(dis);

					this.FOUCIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_INTERNE_ARTICLE = null;
					} else {
						this.CODE_INTERNE_ARTICLE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODESITE = null;
					} else {
						this.CODESITE = dis.readLong();
					}

					this.DATE_DEBUT = readString(dis);

					this.DATE_FIN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.CODEENSEIGNE = null;
					} else {
						this.CODEENSEIGNE = dis.readLong();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CODE_ARTICLE = null;
					} else {
						this.CODE_ARTICLE = dis.readLong();
					}

					this.QTE = (BigDecimal) dis.readObject();

					this.CA_TTC = (BigDecimal) dis.readObject();

					this.CA_HT = (BigDecimal) dis.readObject();

					this.DateLastUpdateWebJob = readDate(dis);

					this.FOUCIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
				}

				// Long

				if (this.CODE_INTERNE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_INTERNE_ARTICLE);
				}

				// Long

				if (this.CODESITE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODESITE);
				}

				// String

				writeString(this.DATE_DEBUT, dos);

				// String

				writeString(this.DATE_FIN, dos);

				// Long

				if (this.CODEENSEIGNE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODEENSEIGNE);
				}

				// Long

				if (this.CODE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_ARTICLE);
				}

				// BigDecimal

				dos.writeObject(this.QTE);

				// BigDecimal

				dos.writeObject(this.CA_TTC);

				// BigDecimal

				dos.writeObject(this.CA_HT);

				// java.util.Date

				writeDate(this.DateLastUpdateWebJob, dos);

				// Integer

				writeInteger(this.FOUCIN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
				}

				// Long

				if (this.CODE_INTERNE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_INTERNE_ARTICLE);
				}

				// Long

				if (this.CODESITE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODESITE);
				}

				// String

				writeString(this.DATE_DEBUT, dos);

				// String

				writeString(this.DATE_FIN, dos);

				// Long

				if (this.CODEENSEIGNE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODEENSEIGNE);
				}

				// Long

				if (this.CODE_ARTICLE == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.CODE_ARTICLE);
				}

				// BigDecimal

				dos.writeObject(this.QTE);

				// BigDecimal

				dos.writeObject(this.CA_TTC);

				// BigDecimal

				dos.writeObject(this.CA_HT);

				// java.util.Date

				writeDate(this.DateLastUpdateWebJob, dos);

				// Integer

				writeInteger(this.FOUCIN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("EAN=" + String.valueOf(EAN));
			sb.append(",CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",DATE_DEBUT=" + DATE_DEBUT);
			sb.append(",DATE_FIN=" + DATE_FIN);
			sb.append(",CODEENSEIGNE=" + String.valueOf(CODEENSEIGNE));
			sb.append(",CODE_ARTICLE=" + String.valueOf(CODE_ARTICLE));
			sb.append(",QTE=" + String.valueOf(QTE));
			sb.append(",CA_TTC=" + String.valueOf(CA_TTC));
			sb.append(",CA_HT=" + String.valueOf(CA_HT));
			sb.append(",DateLastUpdateWebJob=" + String.valueOf(DateLastUpdateWebJob));
			sb.append(",FOUCIN=" + String.valueOf(FOUCIN));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
			}

			sb.append("|");

			if (CODE_INTERNE_ARTICLE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODE_INTERNE_ARTICLE);
			}

			sb.append("|");

			if (CODESITE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODESITE);
			}

			sb.append("|");

			if (DATE_DEBUT == null) {
				sb.append("<null>");
			} else {
				sb.append(DATE_DEBUT);
			}

			sb.append("|");

			if (DATE_FIN == null) {
				sb.append("<null>");
			} else {
				sb.append(DATE_FIN);
			}

			sb.append("|");

			if (CODEENSEIGNE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODEENSEIGNE);
			}

			sb.append("|");

			if (CODE_ARTICLE == null) {
				sb.append("<null>");
			} else {
				sb.append(CODE_ARTICLE);
			}

			sb.append("|");

			if (QTE == null) {
				sb.append("<null>");
			} else {
				sb.append(QTE);
			}

			sb.append("|");

			if (CA_TTC == null) {
				sb.append("<null>");
			} else {
				sb.append(CA_TTC);
			}

			sb.append("|");

			if (CA_HT == null) {
				sb.append("<null>");
			} else {
				sb.append(CA_HT);
			}

			sb.append("|");

			if (DateLastUpdateWebJob == null) {
				sb.append("<null>");
			} else {
				sb.append(DateLastUpdateWebJob);
			}

			sb.append("|");

			if (FOUCIN == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCIN);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(after_tDBInput_1Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;
		String currentVirtualComponent = null;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				tHashInput_1Process(globalMap);

				row1Struct row1 = new row1Struct();
				fouciStruct fouci = new fouciStruct();
				row4Struct row4 = new row4Struct();
				row4Struct row9 = row4;

				/**
				 * [tAggregateRow_1_AGGOUT begin ] start
				 */

				ok_Hash.put("tAggregateRow_1_AGGOUT", false);
				start_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());

				currentVirtualComponent = "tAggregateRow_1";

				currentComponent = "tAggregateRow_1_AGGOUT";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "fouci");

				int tos_count_tAggregateRow_1_AGGOUT = 0;

				if (log.isDebugEnabled())
					log.debug("tAggregateRow_1_AGGOUT - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tAggregateRow_1_AGGOUT {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tAggregateRow_1_AGGOUT = new StringBuilder();
							log4jParamters_tAggregateRow_1_AGGOUT.append("Parameters:");
							log4jParamters_tAggregateRow_1_AGGOUT.append("DESTINATION" + " = " + "tAggregateRow_1");
							log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
							log4jParamters_tAggregateRow_1_AGGOUT.append("GROUPBYS" + " = " + "[{OUTPUT_COLUMN="
									+ ("FOUCFIN") + ", INPUT_COLUMN=" + ("FOUCFIN") + "}, {OUTPUT_COLUMN=" + ("FOULIB")
									+ ", INPUT_COLUMN=" + ("FOULIB") + "}, {OUTPUT_COLUMN=" + ("FOUCNUF")
									+ ", INPUT_COLUMN=" + ("FOUCNUF") + "}]");
							log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
							log4jParamters_tAggregateRow_1_AGGOUT.append("OPERATIONS" + " = " + "[{OUTPUT_COLUMN="
									+ ("COUNTFRN") + ", INPUT_COLUMN=" + ("FOUCFIN") + ", IGNORE_NULL=" + ("false")
									+ ", FUNCTION=" + ("count") + "}]");
							log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
							log4jParamters_tAggregateRow_1_AGGOUT.append("LIST_DELIMITER" + " = " + "\",\"");
							log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
							log4jParamters_tAggregateRow_1_AGGOUT.append("USE_FINANCIAL_PRECISION" + " = " + "true");
							log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
							log4jParamters_tAggregateRow_1_AGGOUT.append("CHECK_TYPE_OVERFLOW" + " = " + "false");
							log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
							log4jParamters_tAggregateRow_1_AGGOUT.append("CHECK_ULP" + " = " + "false");
							log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tAggregateRow_1_AGGOUT - " + (log4jParamters_tAggregateRow_1_AGGOUT));
						}
					}
					new BytesLimit65535_tAggregateRow_1_AGGOUT().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tAggregateRow_1_AGGOUT", "tAggregateRow_1_AGGOUT", "tAggregateOut");
					talendJobLogProcess(globalMap);
				}

// ------------ Seems it is not used

				java.util.Map hashAggreg_tAggregateRow_1 = new java.util.HashMap();

// ------------

				class UtilClass_tAggregateRow_1 { // G_OutBegin_AggR_144

					public double sd(Double[] data) {
						final int n = data.length;
						if (n < 2) {
							return Double.NaN;
						}
						double d1 = 0d;
						double d2 = 0d;

						for (int i = 0; i < data.length; i++) {
							d1 += (data[i] * data[i]);
							d2 += data[i];
						}

						return Math.sqrt((n * d1 - d2 * d2) / n / (n - 1));
					}

					public void checkedIADD(byte a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
						byte r = (byte) (a + b);
						if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'short/Short'", "'byte/Byte'"));
						}
					}

					public void checkedIADD(short a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
						short r = (short) (a + b);
						if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'int/Integer'", "'short/Short'"));
						}
					}

					public void checkedIADD(int a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
						int r = a + b;
						if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'long/Long'", "'int/Integer'"));
						}
					}

					public void checkedIADD(long a, long b, boolean checkTypeOverFlow, boolean checkUlp) {
						long r = a + b;
						if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'BigDecimal'", "'long/Long'"));
						}
					}

					public void checkedIADD(float a, float b, boolean checkTypeOverFlow, boolean checkUlp) {

						if (checkUlp) {
							float minAddedValue = Math.ulp(a);
							if (minAddedValue > Math.abs(b)) {
								throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(b),
										"'double' or 'BigDecimal'", "'float/Float'"));
							}
						}

						if (checkTypeOverFlow && ((double) a + (double) b > (double) Float.MAX_VALUE)
								|| ((double) a + (double) b < (double) -Float.MAX_VALUE)) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'double' or 'BigDecimal'", "'float/Float'"));
						}
					}

					public void checkedIADD(double a, double b, boolean checkTypeOverFlow, boolean checkUlp) {

						if (checkUlp) {
							double minAddedValue = Math.ulp(a);
							if (minAddedValue > Math.abs(b)) {
								throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a),
										"'BigDecimal'", "'double/Double'"));
							}
						}

						if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE)) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'BigDecimal'", "'double/Double'"));
						}
					}

					public void checkedIADD(double a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {

						if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE)) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'BigDecimal'", "'double/Double'"));
						}
					}

					public void checkedIADD(double a, short b, boolean checkTypeOverFlow, boolean checkUlp) {

						if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE)) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'BigDecimal'", "'double/Double'"));
						}
					}

					public void checkedIADD(double a, int b, boolean checkTypeOverFlow, boolean checkUlp) {

						if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE)) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'BigDecimal'", "'double/Double'"));
						}
					}

					public void checkedIADD(double a, float b, boolean checkTypeOverFlow, boolean checkUlp) {

						if (checkUlp) {
							double minAddedValue = Math.ulp(a);
							if (minAddedValue > Math.abs(b)) {
								throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a),
										"'BigDecimal'", "'double/Double'"));
							}
						}

						if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE)) {
							throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b),
									"'BigDecimal'", "'double/Double'"));
						}
					}

					private String buildOverflowMessage(String a, String b, String advicedTypes, String originalType) {
						return "Type overflow when adding " + b + " to " + a
								+ ", to resolve this problem, increase the precision by using " + advicedTypes
								+ " type in place of " + originalType + ".";
					}

					private String buildPrecisionMessage(String a, String b, String advicedTypes, String originalType) {
						return "The double precision is unsufficient to add the value " + b + " to " + a
								+ ", to resolve this problem, increase the precision by using " + advicedTypes
								+ " type in place of " + originalType + ".";
					}

				} // G_OutBegin_AggR_144

				UtilClass_tAggregateRow_1 utilClass_tAggregateRow_1 = new UtilClass_tAggregateRow_1();

				class AggOperationStruct_tAggregateRow_1 { // G_OutBegin_AggR_100

					private static final int DEFAULT_HASHCODE = 1;
					private static final int PRIME = 31;
					private int hashCode = DEFAULT_HASHCODE;
					public boolean hashCodeDirty = true;

					Integer FOUCFIN;
					String FOULIB;
					String FOUCNUF;
					int count = 0;
					int COUNTFRN_clmCount = 0;

					@Override
					public int hashCode() {
						if (this.hashCodeDirty) {
							final int prime = PRIME;
							int result = DEFAULT_HASHCODE;

							result = prime * result + ((this.FOUCFIN == null) ? 0 : this.FOUCFIN.hashCode());

							result = prime * result + ((this.FOULIB == null) ? 0 : this.FOULIB.hashCode());

							result = prime * result + ((this.FOUCNUF == null) ? 0 : this.FOUCNUF.hashCode());

							this.hashCode = result;
							this.hashCodeDirty = false;
						}
						return this.hashCode;
					}

					@Override
					public boolean equals(Object obj) {
						if (this == obj)
							return true;
						if (obj == null)
							return false;
						if (getClass() != obj.getClass())
							return false;
						final AggOperationStruct_tAggregateRow_1 other = (AggOperationStruct_tAggregateRow_1) obj;

						if (this.FOUCFIN == null) {
							if (other.FOUCFIN != null)
								return false;
						} else if (!this.FOUCFIN.equals(other.FOUCFIN))
							return false;

						if (this.FOULIB == null) {
							if (other.FOULIB != null)
								return false;
						} else if (!this.FOULIB.equals(other.FOULIB))
							return false;

						if (this.FOUCNUF == null) {
							if (other.FOUCNUF != null)
								return false;
						} else if (!this.FOUCNUF.equals(other.FOUCNUF))
							return false;

						return true;
					}

				} // G_OutBegin_AggR_100

				AggOperationStruct_tAggregateRow_1 operation_result_tAggregateRow_1 = null;
				AggOperationStruct_tAggregateRow_1 operation_finder_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();
				java.util.Map<AggOperationStruct_tAggregateRow_1, AggOperationStruct_tAggregateRow_1> hash_tAggregateRow_1 = new java.util.HashMap<AggOperationStruct_tAggregateRow_1, AggOperationStruct_tAggregateRow_1>();

				/**
				 * [tAggregateRow_1_AGGOUT begin ] stop
				 */

				/**
				 * [tMap_1 begin ] start
				 */

				ok_Hash.put("tMap_1", false);
				start_Hash.put("tMap_1", System.currentTimeMillis());

				currentComponent = "tMap_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row1");

				int tos_count_tMap_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_1 = new StringBuilder();
							log4jParamters_tMap_1.append("Parameters:");
							log4jParamters_tMap_1.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_1.append(" | ");
							log4jParamters_tMap_1.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_1.append(" | ");
							log4jParamters_tMap_1.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_1.append(" | ");
							log4jParamters_tMap_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_1 - " + (log4jParamters_tMap_1));
						}
					}
					new BytesLimit65535_tMap_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_1", "tMap_1", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row1_tMap_1 = 0;

				int count_row5_tMap_1 = 0;

				org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) ((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) globalMap
						.get("tHash_Lookup_row5"));

				row5Struct row5HashKey = new row5Struct();
				row5Struct row5Default = new row5Struct();
// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_1__Struct {
				}
				Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_fouci_tMap_1 = 0;

				fouciStruct fouci_tmp = new fouciStruct();
// ###############################

				/**
				 * [tMap_1 begin ] stop
				 */

				/**
				 * [tDBInput_1 begin ] start
				 */

				ok_Hash.put("tDBInput_1", false);
				start_Hash.put("tDBInput_1", System.currentTimeMillis());

				currentComponent = "tDBInput_1";

				int tos_count_tDBInput_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_1 = new StringBuilder();
							log4jParamters_tDBInput_1.append("Parameters:");
							log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_1");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = "
									+ "\"WITH VTEVMOIS AS   (SELECT V.SMMCINL,           V.SMMSITE,           SOCCHAIN,           NVL(SUM(V.SMMSAIU), 0) QTE,           NVL(SUM(V.SMMSAAR), 0) CA_TTC,           NVL(SUM(V.SMMSAAR / (1 + (V.SMMTTVA / 100))), 0) CA_HT      FROM STOMVMOIS V, SITDGENE NE     WHERE V.SMMMOIS BETWEEN           TO_NUMBER(TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -2)) + 1),                             'yyyyMM')) AND           TO_NUMBER(TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -2)) + 1),                             'yyyyMM'))       AND NE.SOCCMAG = 10       AND NE.SOCSITE = V.SMMSITE     GROUP BY V.SMMCINL, V.SMMSITE, SOCCHAIN    HAVING NVL(SUM(V.SMMSAAR), 0) <> 0)  SELECT PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,         U.ARVCINR CODE_INTERNE_ARTICLE,         VV.SMMSITE CODESITE,         TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -2)) + 1), 'yyyy-MM-dd') DATE_DEBUT,         TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -1))), 'yyyy-MM-dd') DATE_FIN,         VV.SOCCHAIN CODEENSEIGNE,         U.ARVCEXR CODE_ARTICLE,         QTE,         CA_TTC,         CA_HT,         F.FCLCFIN FOUCIN    FROM ARTUV U, FOUCATALOG F, VTEVMOIS VV   WHERE VV.SMMCINL = U.ARVCINV     AND F.FCLCINV = U.ARVCINV     AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN  \"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("IS_CONVERT_XMLTYPE" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "true");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("CURSOR_SIZE" + " = " + "1000");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("EAN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CODE_INTERNE_ARTICLE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CODESITE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DATE_DEBUT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DATE_FIN") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CODEENSEIGNE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CODE_ARTICLE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("QTE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CA_TTC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CA_HT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DateLastUpdateWebJob")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("FOUCIN") + "}]");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("NO_NULL_VALUES" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
							log4jParamters_tDBInput_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_1 - " + (log4jParamters_tDBInput_1));
						}
					}
					new BytesLimit65535_tDBInput_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_1", "ORACLE_GOLD", "tOracleInput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_1 = 0;
				java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");

				if (conn_tDBInput_1 != null) {
					if (conn_tDBInput_1.getMetaData() != null) {

						log.debug("tDBInput_1 - Uses an existing connection with username '"
								+ conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBInput_1.getMetaData().getURL() + ".");

					}
				}

				boolean isTimeZoneNull_tDBInput_1 = false;
				boolean isConnectionWrapped_tDBInput_1 = !(conn_tDBInput_1 instanceof oracle.jdbc.OracleConnection)
						&& conn_tDBInput_1.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_1 = null;
				if (isConnectionWrapped_tDBInput_1) {
					unwrappedOraConn_tDBInput_1 = conn_tDBInput_1.unwrap(oracle.jdbc.OracleConnection.class);
					if (unwrappedOraConn_tDBInput_1 != null) {
						isTimeZoneNull_tDBInput_1 = (unwrappedOraConn_tDBInput_1.getSessionTimeZone() == null);
					}
				} else {
					isTimeZoneNull_tDBInput_1 = (((oracle.jdbc.OracleConnection) conn_tDBInput_1)
							.getSessionTimeZone() == null);
				}

				if (isTimeZoneNull_tDBInput_1) {
					java.sql.Statement stmtGetTZ_tDBInput_1 = conn_tDBInput_1.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_1 = stmtGetTZ_tDBInput_1
							.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_1 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_1.next()) {
						sessionTimezone_tDBInput_1 = rsGetTZ_tDBInput_1.getString(1);
					}
					if (isConnectionWrapped_tDBInput_1 && unwrappedOraConn_tDBInput_1 != null) {
						unwrappedOraConn_tDBInput_1.setSessionTimeZone(sessionTimezone_tDBInput_1);
					} else {
						((oracle.jdbc.OracleConnection) conn_tDBInput_1).setSessionTimeZone(sessionTimezone_tDBInput_1);
					}
				}

				java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1
						.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY, java.sql.ResultSet.CONCUR_READ_ONLY);

				stmt_tDBInput_1.setFetchSize(1000);

				String dbquery_tDBInput_1 = "WITH VTEVMOIS AS\n (SELECT V.SMMCINL,\n         V.SMMSITE,\n         SOCCHAIN,\n         NVL(SUM(V.SMMSAIU), 0) QTE,\n "
						+ "        NVL(SUM(V.SMMSAAR), 0) CA_TTC,\n         NVL(SUM(V.SMMSAAR / (1 + (V.SMMTTVA / 100))), 0) CA_HT\n    FROM STOMVM"
						+ "OIS V, SITDGENE NE\n   WHERE V.SMMMOIS BETWEEN\n         TO_NUMBER(TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -2)) + 1),"
						+ "\n                           'yyyyMM')) AND\n         TO_NUMBER(TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -2)) + 1),\n "
						+ "                          'yyyyMM'))\n     AND NE.SOCCMAG = 10\n     AND NE.SOCSITE = V.SMMSITE\n   GROUP BY V.SMMCINL, "
						+ "V.SMMSITE, SOCCHAIN\n  HAVING NVL(SUM(V.SMMSAAR), 0) <> 0)\nSELECT PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,\n       U.AR"
						+ "VCINR CODE_INTERNE_ARTICLE,\n       VV.SMMSITE CODESITE,\n       TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -2)) + 1), '"
						+ "yyyy-MM-dd') DATE_DEBUT,\n       TO_CHAR(TRUNC(LAST_DAY(ADD_MONTHS(SYSDATE, -1))), 'yyyy-MM-dd') DATE_FIN,\n       VV.SO"
						+ "CCHAIN CODEENSEIGNE,\n       U.ARVCEXR CODE_ARTICLE,\n       QTE,\n       CA_TTC,\n       CA_HT,\n       F.FCLCFIN FOUCI"
						+ "N\n  FROM ARTUV U, FOUCATALOG F, VTEVMOIS VV\n WHERE VV.SMMCINL = U.ARVCINV\n   AND F.FCLCINV = U.ARVCINV\n   AND TRUNC("
						+ "SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN\n";

				log.debug("tDBInput_1 - Executing the query: '" + dbquery_tDBInput_1 + "'.");

				globalMap.put("tDBInput_1_QUERY", dbquery_tDBInput_1);
				java.sql.ResultSet rs_tDBInput_1 = null;

				try {
					rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
					java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
					int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

					String tmpContent_tDBInput_1 = null;

					log.debug("tDBInput_1 - Retrieving records from the database.");

					while (rs_tDBInput_1.next()) {
						nb_line_tDBInput_1++;

						if (colQtyInRs_tDBInput_1 < 1) {
							row1.EAN = null;
						} else {

							if (rs_tDBInput_1.getObject(1) != null) {
								row1.EAN = rs_tDBInput_1.getLong(1);
							} else {

								row1.EAN = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row1.CODE_INTERNE_ARTICLE = null;
						} else {

							if (rs_tDBInput_1.getObject(2) != null) {
								row1.CODE_INTERNE_ARTICLE = rs_tDBInput_1.getLong(2);
							} else {

								row1.CODE_INTERNE_ARTICLE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row1.CODESITE = null;
						} else {

							if (rs_tDBInput_1.getObject(3) != null) {
								row1.CODESITE = rs_tDBInput_1.getLong(3);
							} else {

								row1.CODESITE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row1.DATE_DEBUT = null;
						} else {

							row1.DATE_DEBUT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							row1.DATE_FIN = null;
						} else {

							row1.DATE_FIN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							row1.CODEENSEIGNE = null;
						} else {

							if (rs_tDBInput_1.getObject(6) != null) {
								row1.CODEENSEIGNE = rs_tDBInput_1.getLong(6);
							} else {

								row1.CODEENSEIGNE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							row1.CODE_ARTICLE = null;
						} else {

							if (rs_tDBInput_1.getObject(7) != null) {
								row1.CODE_ARTICLE = rs_tDBInput_1.getLong(7);
							} else {

								row1.CODE_ARTICLE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							row1.QTE = null;
						} else {

							if (rs_tDBInput_1.getObject(8) != null) {
								row1.QTE = rs_tDBInput_1.getBigDecimal(8);
							} else {

								row1.QTE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							row1.CA_TTC = null;
						} else {

							if (rs_tDBInput_1.getObject(9) != null) {
								row1.CA_TTC = rs_tDBInput_1.getBigDecimal(9);
							} else {

								row1.CA_TTC = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							row1.CA_HT = null;
						} else {

							if (rs_tDBInput_1.getObject(10) != null) {
								row1.CA_HT = rs_tDBInput_1.getBigDecimal(10);
							} else {

								row1.CA_HT = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 11) {
							row1.DateLastUpdateWebJob = null;
						} else {

							row1.DateLastUpdateWebJob = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 11);
						}
						if (colQtyInRs_tDBInput_1 < 12) {
							row1.FOUCIN = null;
						} else {

							if (rs_tDBInput_1.getObject(12) != null) {
								row1.FOUCIN = rs_tDBInput_1.getInt(12);
							} else {

								row1.FOUCIN = null;
							}
						}

						log.debug("tDBInput_1 - Retrieving the record " + nb_line_tDBInput_1 + ".");

						/**
						 * [tDBInput_1 begin ] stop
						 */

						/**
						 * [tDBInput_1 main ] start
						 */

						currentComponent = "tDBInput_1";

						tos_count_tDBInput_1++;

						/**
						 * [tDBInput_1 main ] stop
						 */

						/**
						 * [tDBInput_1 process_data_begin ] start
						 */

						currentComponent = "tDBInput_1";

						/**
						 * [tDBInput_1 process_data_begin ] stop
						 */

						/**
						 * [tMap_1 main ] start
						 */

						currentComponent = "tMap_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row1", "tDBInput_1", "ORACLE_GOLD", "tOracleInput", "tMap_1", "tMap_1", "tMap"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row1 - " + (row1 == null ? "" : row1.toLogString()));
						}

						boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;

						// ###############################
						// # Input tables (lookups)
						boolean rejectedInnerJoin_tMap_1 = false;
						boolean mainRowRejected_tMap_1 = false;

						///////////////////////////////////////////////
						// Starting Lookup Table "row5"
						///////////////////////////////////////////////

						boolean forceLooprow5 = false;

						row5Struct row5ObjectFromLookup = null;

						if (!rejectedInnerJoin_tMap_1) { // G_TM_M_020

							hasCasePrimitiveKeyWithNull_tMap_1 = false;

							row5HashKey.FOUCFIN = row1.FOUCIN;

							row5HashKey.hashCodeDirty = true;

							tHash_Lookup_row5.lookup(row5HashKey);

						} // G_TM_M_020

						if (tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071

							// System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5'
							// and it contains more one result from keys : row5.FOUCFIN = '" +
							// row5HashKey.FOUCFIN + "'");
						} // G 071

						row5Struct row5 = null;

						row5Struct fromLookup_row5 = null;
						row5 = row5Default;

						if (tHash_Lookup_row5 != null && tHash_Lookup_row5.hasNext()) { // G 099

							fromLookup_row5 = tHash_Lookup_row5.next();

						} // G 099

						if (fromLookup_row5 != null) {
							row5 = fromLookup_row5;
						}

						// ###############################
						{ // start of Var scope

							// ###############################
							// # Vars tables

							Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
							// ###############################
							// # Output tables

							fouci = null;

// # Output table : 'fouci'
							count_fouci_tMap_1++;

							fouci_tmp.FOUCFIN = row5.FOUCFIN;
							fouci_tmp.FOULIB = row5.LIBFRS;
							fouci_tmp.FOUCNUF = row5.FOUCNUF;
							fouci = fouci_tmp;
							log.debug("tMap_1 - Outputting the record " + count_fouci_tMap_1
									+ " of the output table 'fouci'.");

// ###############################

						} // end of Var scope

						rejectedInnerJoin_tMap_1 = false;

						tos_count_tMap_1++;

						/**
						 * [tMap_1 main ] stop
						 */

						/**
						 * [tMap_1 process_data_begin ] start
						 */

						currentComponent = "tMap_1";

						/**
						 * [tMap_1 process_data_begin ] stop
						 */
// Start of branch "fouci"
						if (fouci != null) {

							/**
							 * [tAggregateRow_1_AGGOUT main ] start
							 */

							currentVirtualComponent = "tAggregateRow_1";

							currentComponent = "tAggregateRow_1_AGGOUT";

							if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

									, "fouci", "tMap_1", "tMap_1", "tMap", "tAggregateRow_1_AGGOUT",
									"tAggregateRow_1_AGGOUT", "tAggregateOut"

							)) {
								talendJobLogProcess(globalMap);
							}

							if (log.isTraceEnabled()) {
								log.trace("fouci - " + (fouci == null ? "" : fouci.toLogString()));
							}

							operation_finder_tAggregateRow_1.FOUCFIN = fouci.FOUCFIN;
							operation_finder_tAggregateRow_1.FOULIB = fouci.FOULIB;
							operation_finder_tAggregateRow_1.FOUCNUF = fouci.FOUCNUF;

							operation_finder_tAggregateRow_1.hashCodeDirty = true;

							operation_result_tAggregateRow_1 = hash_tAggregateRow_1
									.get(operation_finder_tAggregateRow_1);

							if (operation_result_tAggregateRow_1 == null) { // G_OutMain_AggR_001

								operation_result_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();

								operation_result_tAggregateRow_1.FOUCFIN = operation_finder_tAggregateRow_1.FOUCFIN;
								operation_result_tAggregateRow_1.FOULIB = operation_finder_tAggregateRow_1.FOULIB;
								operation_result_tAggregateRow_1.FOUCNUF = operation_finder_tAggregateRow_1.FOUCNUF;

								hash_tAggregateRow_1.put(operation_result_tAggregateRow_1,
										operation_result_tAggregateRow_1);

							} // G_OutMain_AggR_001

							operation_result_tAggregateRow_1.COUNTFRN_clmCount++;
							operation_result_tAggregateRow_1.count++;

							tos_count_tAggregateRow_1_AGGOUT++;

							/**
							 * [tAggregateRow_1_AGGOUT main ] stop
							 */

							/**
							 * [tAggregateRow_1_AGGOUT process_data_begin ] start
							 */

							currentVirtualComponent = "tAggregateRow_1";

							currentComponent = "tAggregateRow_1_AGGOUT";

							/**
							 * [tAggregateRow_1_AGGOUT process_data_begin ] stop
							 */

							/**
							 * [tAggregateRow_1_AGGOUT process_data_end ] start
							 */

							currentVirtualComponent = "tAggregateRow_1";

							currentComponent = "tAggregateRow_1_AGGOUT";

							/**
							 * [tAggregateRow_1_AGGOUT process_data_end ] stop
							 */

						} // End of branch "fouci"

						/**
						 * [tMap_1 process_data_end ] start
						 */

						currentComponent = "tMap_1";

						/**
						 * [tMap_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_1 process_data_end ] start
						 */

						currentComponent = "tDBInput_1";

						/**
						 * [tDBInput_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_1 end ] start
						 */

						currentComponent = "tDBInput_1";

					}
				} finally {
					if (rs_tDBInput_1 != null) {
						rs_tDBInput_1.close();
					}
					if (stmt_tDBInput_1 != null) {
						stmt_tDBInput_1.close();
					}
				}

				globalMap.put("tDBInput_1_NB_LINE", nb_line_tDBInput_1);
				log.debug("tDBInput_1 - Retrieved records count: " + nb_line_tDBInput_1 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_1 - " + ("Done."));

				ok_Hash.put("tDBInput_1", true);
				end_Hash.put("tDBInput_1", System.currentTimeMillis());

				/**
				 * [tDBInput_1 end ] stop
				 */

				/**
				 * [tMap_1 end ] start
				 */

				currentComponent = "tMap_1";

// ###############################
// # Lookup hashes releasing
				if (tHash_Lookup_row5 != null) {
					tHash_Lookup_row5.endGet();
				}
				globalMap.remove("tHash_Lookup_row5");

// ###############################      
				log.debug("tMap_1 - Written records count in the table 'fouci': " + count_fouci_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row1", 2, 0,
						"tDBInput_1", "ORACLE_GOLD", "tOracleInput", "tMap_1", "tMap_1", "tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_1 - " + ("Done."));

				ok_Hash.put("tMap_1", true);
				end_Hash.put("tMap_1", System.currentTimeMillis());

				/**
				 * [tMap_1 end ] stop
				 */

				/**
				 * [tAggregateRow_1_AGGOUT end ] start
				 */

				currentVirtualComponent = "tAggregateRow_1";

				currentComponent = "tAggregateRow_1_AGGOUT";

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "fouci", 2, 0, "tMap_1",
						"tMap_1", "tMap", "tAggregateRow_1_AGGOUT", "tAggregateRow_1_AGGOUT", "tAggregateOut",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tAggregateRow_1_AGGOUT - " + ("Done."));

				ok_Hash.put("tAggregateRow_1_AGGOUT", true);
				end_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());

				/**
				 * [tAggregateRow_1_AGGOUT end ] stop
				 */

				/**
				 * [tLogRow_1 begin ] start
				 */

				ok_Hash.put("tLogRow_1", false);
				start_Hash.put("tLogRow_1", System.currentTimeMillis());

				currentComponent = "tLogRow_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row9");

				int tos_count_tLogRow_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tLogRow_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tLogRow_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tLogRow_1 = new StringBuilder();
							log4jParamters_tLogRow_1.append("Parameters:");
							log4jParamters_tLogRow_1.append("BASIC_MODE" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tLogRow_1 - " + (log4jParamters_tLogRow_1));
						}
					}
					new BytesLimit65535_tLogRow_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tLogRow_1", "tLogRow_1", "tLogRow");
					talendJobLogProcess(globalMap);
				}

				///////////////////////

				class Util_tLogRow_1 {

					String[] des_top = { ".", ".", "-", "+" };

					String[] des_head = { "|=", "=|", "-", "+" };

					String[] des_bottom = { "'", "'", "-", "+" };

					String name = "";

					java.util.List<String[]> list = new java.util.ArrayList<String[]>();

					int[] colLengths = new int[4];

					public void addRow(String[] row) {

						for (int i = 0; i < 4; i++) {
							if (row[i] != null) {
								colLengths[i] = Math.max(colLengths[i], row[i].length());
							}
						}
						list.add(row);
					}

					public void setTableName(String name) {

						this.name = name;
					}

					public StringBuilder format() {

						StringBuilder sb = new StringBuilder();

						sb.append(print(des_top));

						int totals = 0;
						for (int i = 0; i < colLengths.length; i++) {
							totals = totals + colLengths[i];
						}

						// name
						sb.append("|");
						int k = 0;
						for (k = 0; k < (totals + 3 - name.length()) / 2; k++) {
							sb.append(' ');
						}
						sb.append(name);
						for (int i = 0; i < totals + 3 - name.length() - k; i++) {
							sb.append(' ');
						}
						sb.append("|\n");

						// head and rows
						sb.append(print(des_head));
						for (int i = 0; i < list.size(); i++) {

							String[] row = list.get(i);

							java.util.Formatter formatter = new java.util.Formatter(new StringBuilder());

							StringBuilder sbformat = new StringBuilder();
							sbformat.append("|%1$-");
							sbformat.append(colLengths[0]);
							sbformat.append("s");

							sbformat.append("|%2$-");
							sbformat.append(colLengths[1]);
							sbformat.append("s");

							sbformat.append("|%3$-");
							sbformat.append(colLengths[2]);
							sbformat.append("s");

							sbformat.append("|%4$-");
							sbformat.append(colLengths[3]);
							sbformat.append("s");

							sbformat.append("|\n");

							formatter.format(sbformat.toString(), (Object[]) row);

							sb.append(formatter.toString());
							if (i == 0)
								sb.append(print(des_head)); // print the head
						}

						// end
						sb.append(print(des_bottom));
						return sb;
					}

					private StringBuilder print(String[] fillChars) {
						StringBuilder sb = new StringBuilder();
						// first column
						sb.append(fillChars[0]);
						for (int i = 0; i < colLengths[0] - fillChars[0].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[3]);

						for (int i = 0; i < colLengths[1] - fillChars[3].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[3]);
						for (int i = 0; i < colLengths[2] - fillChars[3].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[3]);

						// last column
						for (int i = 0; i < colLengths[3] - fillChars[1].length() + 1; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[1]);
						sb.append("\n");
						return sb;
					}

					public boolean isTableEmpty() {
						if (list.size() > 1)
							return false;
						return true;
					}
				}
				Util_tLogRow_1 util_tLogRow_1 = new Util_tLogRow_1();
				util_tLogRow_1.setTableName("tLogRow_1");
				util_tLogRow_1.addRow(new String[] { "FOUCFIN", "FOULIB", "FOUCNUF", "COUNTFRN", });
				StringBuilder strBuffer_tLogRow_1 = null;
				int nb_line_tLogRow_1 = 0;
///////////////////////    			

				/**
				 * [tLogRow_1 begin ] stop
				 */

				/**
				 * [tHashOutput_1 begin ] start
				 */

				ok_Hash.put("tHashOutput_1", false);
				start_Hash.put("tHashOutput_1", System.currentTimeMillis());

				currentComponent = "tHashOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row4");

				int tos_count_tHashOutput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tHashOutput_1", "COUNTFRN", "tHashOutput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.hashfile.common.MapHashFile mf_tHashOutput_1 = org.talend.designer.components.hashfile.common.MapHashFile
						.getMapHashFile();
				org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row4Struct> tHashFile_tHashOutput_1 = null;
				String hashKey_tHashOutput_1 = "tHashFile_TEST_" + pid + "_tHashOutput_1";
				synchronized (org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap
						.get(hashKey_tHashOutput_1)) {
					if (mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1) == null) {
						mf_tHashOutput_1.getResourceMap().put(hashKey_tHashOutput_1,
								new org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row4Struct>(
										org.talend.designer.components.hashfile.common.MATCHING_MODE.KEEP_ALL));
						tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
					} else {
						tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
					}
				}
				int nb_line_tHashOutput_1 = 0;

				/**
				 * [tHashOutput_1 begin ] stop
				 */

				/**
				 * [tAggregateRow_1_AGGIN begin ] start
				 */

				ok_Hash.put("tAggregateRow_1_AGGIN", false);
				start_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());

				currentVirtualComponent = "tAggregateRow_1";

				currentComponent = "tAggregateRow_1_AGGIN";

				int tos_count_tAggregateRow_1_AGGIN = 0;

				if (log.isDebugEnabled())
					log.debug("tAggregateRow_1_AGGIN - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tAggregateRow_1_AGGIN {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tAggregateRow_1_AGGIN = new StringBuilder();
							log4jParamters_tAggregateRow_1_AGGIN.append("Parameters:");
							log4jParamters_tAggregateRow_1_AGGIN.append("ORIGIN" + " = " + "tAggregateRow_1");
							log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
							log4jParamters_tAggregateRow_1_AGGIN.append("GROUPBYS" + " = " + "[{OUTPUT_COLUMN="
									+ ("FOUCFIN") + ", INPUT_COLUMN=" + ("FOUCFIN") + "}, {OUTPUT_COLUMN=" + ("FOULIB")
									+ ", INPUT_COLUMN=" + ("FOULIB") + "}, {OUTPUT_COLUMN=" + ("FOUCNUF")
									+ ", INPUT_COLUMN=" + ("FOUCNUF") + "}]");
							log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
							log4jParamters_tAggregateRow_1_AGGIN.append("OPERATIONS" + " = " + "[{OUTPUT_COLUMN="
									+ ("COUNTFRN") + ", INPUT_COLUMN=" + ("FOUCFIN") + ", IGNORE_NULL=" + ("false")
									+ ", FUNCTION=" + ("count") + "}]");
							log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
							log4jParamters_tAggregateRow_1_AGGIN.append("LIST_DELIMITER" + " = " + "\",\"");
							log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
							log4jParamters_tAggregateRow_1_AGGIN.append("USE_FINANCIAL_PRECISION" + " = " + "true");
							log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
							log4jParamters_tAggregateRow_1_AGGIN.append("CHECK_TYPE_OVERFLOW" + " = " + "false");
							log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
							log4jParamters_tAggregateRow_1_AGGIN.append("CHECK_ULP" + " = " + "false");
							log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tAggregateRow_1_AGGIN - " + (log4jParamters_tAggregateRow_1_AGGIN));
						}
					}
					new BytesLimit65535_tAggregateRow_1_AGGIN().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tAggregateRow_1_AGGIN", "tAggregateRow_1_AGGIN", "tAggregateIn");
					talendJobLogProcess(globalMap);
				}

				java.util.Collection<AggOperationStruct_tAggregateRow_1> values_tAggregateRow_1 = hash_tAggregateRow_1
						.values();

				globalMap.put("tAggregateRow_1_NB_LINE", values_tAggregateRow_1.size());

				if (log.isInfoEnabled())
					log.info("tAggregateRow_1_AGGIN - " + ("Retrieving the aggregation results."));
				for (AggOperationStruct_tAggregateRow_1 aggregated_row_tAggregateRow_1 : values_tAggregateRow_1) { // G_AggR_600

					/**
					 * [tAggregateRow_1_AGGIN begin ] stop
					 */

					/**
					 * [tAggregateRow_1_AGGIN main ] start
					 */

					currentVirtualComponent = "tAggregateRow_1";

					currentComponent = "tAggregateRow_1_AGGIN";

					row4.FOUCFIN = aggregated_row_tAggregateRow_1.FOUCFIN;

					row4.FOULIB = aggregated_row_tAggregateRow_1.FOULIB;

					row4.FOUCNUF = aggregated_row_tAggregateRow_1.FOUCNUF;
					row4.COUNTFRN = (int) aggregated_row_tAggregateRow_1.count;
					row4.COUNTFRN = (int) aggregated_row_tAggregateRow_1.COUNTFRN_clmCount;

					if (log.isDebugEnabled())
						log.debug(
								"tAggregateRow_1_AGGIN - " + ("Operation function: 'count' on the column 'FOUCFIN'."));

					tos_count_tAggregateRow_1_AGGIN++;

					/**
					 * [tAggregateRow_1_AGGIN main ] stop
					 */

					/**
					 * [tAggregateRow_1_AGGIN process_data_begin ] start
					 */

					currentVirtualComponent = "tAggregateRow_1";

					currentComponent = "tAggregateRow_1_AGGIN";

					/**
					 * [tAggregateRow_1_AGGIN process_data_begin ] stop
					 */

					/**
					 * [tHashOutput_1 main ] start
					 */

					currentComponent = "tHashOutput_1";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row4", "tAggregateRow_1_AGGIN", "tAggregateRow_1_AGGIN", "tAggregateIn", "tHashOutput_1",
							"COUNTFRN", "tHashOutput"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row4 - " + (row4 == null ? "" : row4.toLogString()));
					}

					row4Struct oneRow_tHashOutput_1 = new row4Struct();

					oneRow_tHashOutput_1.FOUCFIN = row4.FOUCFIN;
					oneRow_tHashOutput_1.FOULIB = row4.FOULIB;
					oneRow_tHashOutput_1.FOUCNUF = row4.FOUCNUF;
					oneRow_tHashOutput_1.COUNTFRN = row4.COUNTFRN;

					tHashFile_tHashOutput_1.put(oneRow_tHashOutput_1);
					nb_line_tHashOutput_1++;

					row9 = row4;

					tos_count_tHashOutput_1++;

					/**
					 * [tHashOutput_1 main ] stop
					 */

					/**
					 * [tHashOutput_1 process_data_begin ] start
					 */

					currentComponent = "tHashOutput_1";

					/**
					 * [tHashOutput_1 process_data_begin ] stop
					 */

					/**
					 * [tLogRow_1 main ] start
					 */

					currentComponent = "tLogRow_1";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row9", "tHashOutput_1", "COUNTFRN", "tHashOutput", "tLogRow_1", "tLogRow_1", "tLogRow"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row9 - " + (row9 == null ? "" : row9.toLogString()));
					}

///////////////////////		

					String[] row_tLogRow_1 = new String[4];

					if (row9.FOUCFIN != null) { //
						row_tLogRow_1[0] = String.valueOf(row9.FOUCFIN);

					} //

					if (row9.FOULIB != null) { //
						row_tLogRow_1[1] = String.valueOf(row9.FOULIB);

					} //

					if (row9.FOUCNUF != null) { //
						row_tLogRow_1[2] = String.valueOf(row9.FOUCNUF);

					} //

					if (row9.COUNTFRN != null) { //
						row_tLogRow_1[3] = String.valueOf(row9.COUNTFRN);

					} //

					util_tLogRow_1.addRow(row_tLogRow_1);
					nb_line_tLogRow_1++;
					log.info("tLogRow_1 - Content of row " + nb_line_tLogRow_1 + ": "
							+ TalendString.unionString("|", row_tLogRow_1));
//////

//////                    

///////////////////////    			

					tos_count_tLogRow_1++;

					/**
					 * [tLogRow_1 main ] stop
					 */

					/**
					 * [tLogRow_1 process_data_begin ] start
					 */

					currentComponent = "tLogRow_1";

					/**
					 * [tLogRow_1 process_data_begin ] stop
					 */

					/**
					 * [tLogRow_1 process_data_end ] start
					 */

					currentComponent = "tLogRow_1";

					/**
					 * [tLogRow_1 process_data_end ] stop
					 */

					/**
					 * [tHashOutput_1 process_data_end ] start
					 */

					currentComponent = "tHashOutput_1";

					/**
					 * [tHashOutput_1 process_data_end ] stop
					 */

					/**
					 * [tAggregateRow_1_AGGIN process_data_end ] start
					 */

					currentVirtualComponent = "tAggregateRow_1";

					currentComponent = "tAggregateRow_1_AGGIN";

					/**
					 * [tAggregateRow_1_AGGIN process_data_end ] stop
					 */

					/**
					 * [tAggregateRow_1_AGGIN end ] start
					 */

					currentVirtualComponent = "tAggregateRow_1";

					currentComponent = "tAggregateRow_1_AGGIN";

				} // G_AggR_600

				if (log.isDebugEnabled())
					log.debug("tAggregateRow_1_AGGIN - " + ("Done."));

				ok_Hash.put("tAggregateRow_1_AGGIN", true);
				end_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());

				/**
				 * [tAggregateRow_1_AGGIN end ] stop
				 */

				/**
				 * [tHashOutput_1 end ] start
				 */

				currentComponent = "tHashOutput_1";

				globalMap.put("tHashOutput_1_NB_LINE", nb_line_tHashOutput_1);
				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row4", 2, 0,
						"tAggregateRow_1_AGGIN", "tAggregateRow_1_AGGIN", "tAggregateIn", "tHashOutput_1", "COUNTFRN",
						"tHashOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tHashOutput_1", true);
				end_Hash.put("tHashOutput_1", System.currentTimeMillis());

				/**
				 * [tHashOutput_1 end ] stop
				 */

				/**
				 * [tLogRow_1 end ] start
				 */

				currentComponent = "tLogRow_1";

//////

				java.io.PrintStream consoleOut_tLogRow_1 = null;
				if (globalMap.get("tLogRow_CONSOLE") != null) {
					consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
				} else {
					consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
					globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_1);
				}

				consoleOut_tLogRow_1.println(util_tLogRow_1.format().toString());
				consoleOut_tLogRow_1.flush();
//////
				globalMap.put("tLogRow_1_NB_LINE", nb_line_tLogRow_1);
				if (log.isInfoEnabled())
					log.info("tLogRow_1 - " + ("Printed row count: ") + (nb_line_tLogRow_1) + ("."));

///////////////////////    			

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row9", 2, 0,
						"tHashOutput_1", "COUNTFRN", "tHashOutput", "tLogRow_1", "tLogRow_1", "tLogRow", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tLogRow_1 - " + ("Done."));

				ok_Hash.put("tLogRow_1", true);
				end_Hash.put("tLogRow_1", System.currentTimeMillis());

				/**
				 * [tLogRow_1 end ] stop
				 */

			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			te.setVirtualComponentName(currentVirtualComponent);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			// free memory for "tAggregateRow_1_AGGIN"
			globalMap.remove("tAggregateRow_1");

			// free memory for "tMap_1"
			globalMap.remove("tHash_Lookup_row5");

			try {

				/**
				 * [tDBInput_1 finally ] start
				 */

				currentComponent = "tDBInput_1";

				/**
				 * [tDBInput_1 finally ] stop
				 */

				/**
				 * [tMap_1 finally ] start
				 */

				currentComponent = "tMap_1";

				/**
				 * [tMap_1 finally ] stop
				 */

				/**
				 * [tAggregateRow_1_AGGOUT finally ] start
				 */

				currentVirtualComponent = "tAggregateRow_1";

				currentComponent = "tAggregateRow_1_AGGOUT";

				/**
				 * [tAggregateRow_1_AGGOUT finally ] stop
				 */

				/**
				 * [tAggregateRow_1_AGGIN finally ] start
				 */

				currentVirtualComponent = "tAggregateRow_1";

				currentComponent = "tAggregateRow_1_AGGIN";

				/**
				 * [tAggregateRow_1_AGGIN finally ] stop
				 */

				/**
				 * [tHashOutput_1 finally ] start
				 */

				currentComponent = "tHashOutput_1";

				/**
				 * [tHashOutput_1 finally ] stop
				 */

				/**
				 * [tLogRow_1 finally ] start
				 */

				currentComponent = "tLogRow_1";

				/**
				 * [tLogRow_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}

	public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEST = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEST = new byte[0];
		protected static final int DEFAULT_HASHCODE = 1;
		protected static final int PRIME = 31;
		protected int hashCode = DEFAULT_HASHCODE;
		public boolean hashCodeDirty = true;

		public String loopKey;

		public Integer FOUCFIN;

		public Integer getFOUCFIN() {
			return this.FOUCFIN;
		}

		public String LIBFRS;

		public String getLIBFRS() {
			return this.LIBFRS;
		}

		public String FOUCNUF;

		public String getFOUCNUF() {
			return this.FOUCNUF;
		}

		@Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;

				result = prime * result + ((this.FOUCFIN == null) ? 0 : this.FOUCFIN.hashCode());

				this.hashCode = result;
				this.hashCodeDirty = false;
			}
			return this.hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final row5Struct other = (row5Struct) obj;

			if (this.FOUCFIN == null) {
				if (other.FOUCFIN != null)
					return false;

			} else if (!this.FOUCFIN.equals(other.FOUCFIN))

				return false;

			return true;
		}

		public void copyDataTo(row5Struct other) {

			other.FOUCFIN = this.FOUCFIN;
			other.LIBFRS = this.LIBFRS;
			other.FOUCNUF = this.FOUCNUF;

		}

		public void copyKeysDataTo(row5Struct other) {

			other.FOUCFIN = this.FOUCFIN;

		}

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				byte[] byteArray = new byte[length];
				dis.read(byteArray);
				strReturn = new String(byteArray, utf8Charset);
			}
			return strReturn;
		}

		private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller)
				throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				byte[] byteArray = new byte[length];
				unmarshaller.read(byteArray);
				strReturn = new String(byteArray, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller)
				throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		public void readKeysData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEST) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeKeysData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		/**
		 * Fill Values data by reading ObjectInputStream.
		 */
		public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
			try {

				int length = 0;

				this.LIBFRS = readString(dis, ois);

				this.FOUCNUF = readString(dis, ois);

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
			try {
				int length = 0;

				this.LIBFRS = readString(dis, objectIn);

				this.FOUCNUF = readString(dis, objectIn);

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		/**
		 * Return a byte array which represents Values data.
		 */
		public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
			try {

				writeString(this.LIBFRS, dos, oos);

				writeString(this.FOUCNUF, dos, oos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut) {
			try {

				writeString(this.LIBFRS, dos, objectOut);

				writeString(this.FOUCNUF, dos, objectOut);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		public boolean supportMarshaller() {
			return true;
		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("FOUCFIN=" + String.valueOf(FOUCFIN));
			sb.append(",LIBFRS=" + LIBFRS);
			sb.append(",FOUCNUF=" + FOUCNUF);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (FOUCFIN == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCFIN);
			}

			sb.append("|");

			if (LIBFRS == null) {
				sb.append("<null>");
			} else {
				sb.append(LIBFRS);
			}

			sb.append("|");

			if (FOUCNUF == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCNUF);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row5Struct other) {

			int returnValue = -1;

			returnValue = checkNullsAndCompare(this.FOUCFIN, other.FOUCFIN);
			if (returnValue != 0) {
				return returnValue;
			}

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tHashInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tHashInput_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				row5Struct row5 = new row5Struct();

				/**
				 * [tAdvancedHash_row5 begin ] start
				 */

				ok_Hash.put("tAdvancedHash_row5", false);
				start_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());

				currentComponent = "tAdvancedHash_row5";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row5");

				int tos_count_tAdvancedHash_row5 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tAdvancedHash_row5", "tAdvancedHash_row5", "tAdvancedHash");
					talendJobLogProcess(globalMap);
				}

				// connection name:row5
				// source node:tHashInput_1 - inputs:(after_tDBInput_1) outputs:(row5,row5) |
				// target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
				// linked node: tMap_1 - inputs:(row1,row5) outputs:(fouci)

				org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;

				org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = org.talend.designer.components.lookup.memory.AdvancedMemoryLookup
						.<row5Struct>getLookup(matchingModeEnum_row5);

				globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);

				/**
				 * [tAdvancedHash_row5 begin ] stop
				 */

				/**
				 * [tHashInput_1 begin ] start
				 */

				ok_Hash.put("tHashInput_1", false);
				start_Hash.put("tHashInput_1", System.currentTimeMillis());

				currentComponent = "tHashInput_1";

				int tos_count_tHashInput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tHashInput_1", "FOURNISSEUR", "tHashInput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tHashInput_1 = 0;

				org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_1 = org.talend.designer.components.hashfile.common.MapHashFile
						.getMapHashFile();
				org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row4Struct> tHashFile_tHashInput_1 = mf_tHashInput_1
						.getAdvancedMemoryHashFile("tHashFile_TEST_" + pid + "_tHashOutput_1");
				if (tHashFile_tHashInput_1 == null) {
					throw new RuntimeException(
							"The hash is not initialized : The hash must exist before you read from it");
				}
				java.util.Iterator<row4Struct> iterator_tHashInput_1 = tHashFile_tHashInput_1.iterator();
				while (iterator_tHashInput_1.hasNext()) {
					row4Struct next_tHashInput_1 = iterator_tHashInput_1.next();

					row5.FOUCFIN = next_tHashInput_1.FOUCFIN;
					row5.LIBFRS = next_tHashInput_1.FOULIB;
					row5.FOUCNUF = next_tHashInput_1.FOUCNUF;

					/**
					 * [tHashInput_1 begin ] stop
					 */

					/**
					 * [tHashInput_1 main ] start
					 */

					currentComponent = "tHashInput_1";

					tos_count_tHashInput_1++;

					/**
					 * [tHashInput_1 main ] stop
					 */

					/**
					 * [tHashInput_1 process_data_begin ] start
					 */

					currentComponent = "tHashInput_1";

					/**
					 * [tHashInput_1 process_data_begin ] stop
					 */

					/**
					 * [tAdvancedHash_row5 main ] start
					 */

					currentComponent = "tAdvancedHash_row5";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row5", "tHashInput_1", "FOURNISSEUR", "tHashInput", "tAdvancedHash_row5",
							"tAdvancedHash_row5", "tAdvancedHash"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row5 - " + (row5 == null ? "" : row5.toLogString()));
					}

					row5Struct row5_HashRow = new row5Struct();

					row5_HashRow.FOUCFIN = row5.FOUCFIN;

					row5_HashRow.LIBFRS = row5.LIBFRS;

					row5_HashRow.FOUCNUF = row5.FOUCNUF;

					tHash_Lookup_row5.put(row5_HashRow);

					tos_count_tAdvancedHash_row5++;

					/**
					 * [tAdvancedHash_row5 main ] stop
					 */

					/**
					 * [tAdvancedHash_row5 process_data_begin ] start
					 */

					currentComponent = "tAdvancedHash_row5";

					/**
					 * [tAdvancedHash_row5 process_data_begin ] stop
					 */

					/**
					 * [tAdvancedHash_row5 process_data_end ] start
					 */

					currentComponent = "tAdvancedHash_row5";

					/**
					 * [tAdvancedHash_row5 process_data_end ] stop
					 */

					/**
					 * [tHashInput_1 process_data_end ] start
					 */

					currentComponent = "tHashInput_1";

					/**
					 * [tHashInput_1 process_data_end ] stop
					 */

					/**
					 * [tHashInput_1 end ] start
					 */

					currentComponent = "tHashInput_1";

					nb_line_tHashInput_1++;
				}

				org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap
						.remove("tHashFile_TEST_" + pid + "_tHashOutput_1");

				globalMap.put("tHashInput_1_NB_LINE", nb_line_tHashInput_1);

				ok_Hash.put("tHashInput_1", true);
				end_Hash.put("tHashInput_1", System.currentTimeMillis());

				/**
				 * [tHashInput_1 end ] stop
				 */

				/**
				 * [tAdvancedHash_row5 end ] start
				 */

				currentComponent = "tAdvancedHash_row5";

				tHash_Lookup_row5.endPut();

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row5", 2, 0,
						"tHashInput_1", "FOURNISSEUR", "tHashInput", "tAdvancedHash_row5", "tAdvancedHash_row5",
						"tAdvancedHash", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tAdvancedHash_row5", true);
				end_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());

				/**
				 * [tAdvancedHash_row5 end ] stop
				 */

			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tHashInput_1 finally ] start
				 */

				currentComponent = "tHashInput_1";

				/**
				 * [tHashInput_1 finally ] stop
				 */

				/**
				 * [tAdvancedHash_row5 finally ] start
				 */

				currentComponent = "tAdvancedHash_row5";

				/**
				 * [tAdvancedHash_row5 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tHashInput_1_SUBPROCESS_STATE", 1);
	}

	public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		String iterateId = "";

		String currentComponent = "";
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [talendJobLog begin ] start
				 */

				ok_Hash.put("talendJobLog", false);
				start_Hash.put("talendJobLog", System.currentTimeMillis());

				currentComponent = "talendJobLog";

				int tos_count_talendJobLog = 0;

				for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
					org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder
							.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
							.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid)
							.custom("father_pid", fatherPid).custom("root_pid", rootPid);
					org.talend.logging.audit.Context log_context_talendJobLog = null;

					if (jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE) {
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.sourceId(jcm.sourceId)
								.sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
								.targetId(jcm.targetId).targetLabel(jcm.targetLabel)
								.targetConnectorType(jcm.targetComponentName).connectionName(jcm.current_connector)
								.rows(jcm.row_count).duration(duration).build();
						auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
						auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).duration(duration)
								.status(jcm.status).build();
						auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
								.connectorType(jcm.component_name).connectorId(jcm.component_id)
								.connectorLabel(jcm.component_label).build();
						auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {// log current component
																							// input line
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.connectorType(jcm.component_name)
								.connectorId(jcm.component_id).connectorLabel(jcm.component_label)
								.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
								.rows(jcm.total_row_number).duration(duration).build();
						auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {// log current component
																								// output/reject line
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.connectorType(jcm.component_name)
								.connectorId(jcm.component_id).connectorLabel(jcm.component_label)
								.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
								.rows(jcm.total_row_number).duration(duration).build();
						auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
					}

				}

				/**
				 * [talendJobLog begin ] stop
				 */

				/**
				 * [talendJobLog main ] start
				 */

				currentComponent = "talendJobLog";

				tos_count_talendJobLog++;

				/**
				 * [talendJobLog main ] stop
				 */

				/**
				 * [talendJobLog process_data_begin ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog process_data_begin ] stop
				 */

				/**
				 * [talendJobLog process_data_end ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog process_data_end ] stop
				 */

				/**
				 * [talendJobLog end ] start
				 */

				currentComponent = "talendJobLog";

				ok_Hash.put("talendJobLog", true);
				end_Hash.put("talendJobLog", System.currentTimeMillis());

				/**
				 * [talendJobLog end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [talendJobLog finally ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}

	public String resuming_logs_dir_path = null;
	public String resuming_checkpoint_path = null;
	public String parent_part_launcher = null;
	private String resumeEntryMethodName = null;
	private boolean globalResumeTicket = false;

	public boolean watch = false;
	// portStats is null, it means don't execute the statistics
	public Integer portStats = null;
	public int portTraces = 4334;
	public String clientHost;
	public String defaultClientHost = "localhost";
	public String contextStr = "Default";
	public boolean isDefaultContext = true;
	public String pid = "0";
	public String rootPid = null;
	public String fatherPid = null;
	public String fatherNode = null;
	public long startTime = 0;
	public boolean isChildJob = false;
	public String log4jLevel = "";

	private boolean enableLogStash;

	private boolean execStat = true;

	private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
		protected java.util.Map<String, String> initialValue() {
			java.util.Map<String, String> threadRunResultMap = new java.util.HashMap<String, String>();
			threadRunResultMap.put("errorCode", null);
			threadRunResultMap.put("status", "");
			return threadRunResultMap;
		};
	};

	protected PropertiesWithType context_param = new PropertiesWithType();
	public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

	public String status = "";

	public static void main(String[] args) {
		final TEST TESTClass = new TEST();

		int exitCode = TESTClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'TEST' - Done.");
		}

		System.exit(exitCode);
	}

	public String[][] runJob(String[] args) {

		int exitCode = runJobInTOS(args);
		String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

		return bufferValue;
	}

	public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;

		return hastBufferOutput;
	}

	public int runJobInTOS(String[] args) {
		// reset status
		status = "";

		String lastStr = "";
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--context_param")) {
				lastStr = arg;
			} else if (lastStr.equals("")) {
				evalParam(arg);
			} else {
				evalParam(lastStr + " " + arg);
				lastStr = "";
			}
		}
		enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

		if (!"".equals(log4jLevel)) {

			if ("trace".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.TRACE);
			} else if ("debug".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.DEBUG);
			} else if ("info".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.INFO);
			} else if ("warn".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.WARN);
			} else if ("error".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.ERROR);
			} else if ("fatal".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.FATAL);
			} else if ("off".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.OFF);
			}
			org.apache.logging.log4j.core.config.Configurator
					.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());

		}
		log.info("TalendJob: 'TEST' - Start.");

		if (enableLogStash) {
			java.util.Properties properties_talendJobLog = new java.util.Properties();
			properties_talendJobLog.setProperty("root.logger", "audit");
			properties_talendJobLog.setProperty("encoding", "UTF-8");
			properties_talendJobLog.setProperty("application.name", "Talend Studio");
			properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
			properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
			properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
			properties_talendJobLog.setProperty("log.appender", "file");
			properties_talendJobLog.setProperty("appender.file.path", "audit.json");
			properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
			properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
			properties_talendJobLog.setProperty("host", "false");

			System.getProperties().stringPropertyNames().stream().filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()),
							System.getProperty(key)));

			org.apache.logging.log4j.core.config.Configurator
					.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);

			auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory
					.createJobAuditLogger(properties_talendJobLog);
		}

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		if (pid == null || "0".equals(pid)) {
			pid = TalendString.getAsciiRandomString(6);
		}

		if (rootPid == null) {
			rootPid = pid;
		}
		if (fatherPid == null) {
			fatherPid = pid;
		} else {
			isChildJob = true;
		}

		if (portStats != null) {
			// portStats = -1; //for testing
			if (portStats < 0 || portStats > 65535) {
				// issue:10869, the portStats is invalid, so this client socket can't open
				System.err.println("The statistics socket port " + portStats + " is invalid.");
				execStat = false;
			}
		} else {
			execStat = false;
		}
		boolean inOSGi = routines.system.BundleUtils.inOSGi();

		if (inOSGi) {
			java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

			if (jobProperties != null && jobProperties.get("context") != null) {
				contextStr = (String) jobProperties.get("context");
			}
		}

		try {
			// call job/subjob with an existing context, like: --context=production. if
			// without this parameter, there will use the default context instead.
			java.io.InputStream inContext = TEST.class.getClassLoader()
					.getResourceAsStream("bi_team_projects/test_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = TEST.class.getClassLoader()
						.getResourceAsStream("config/contexts/" + contextStr + ".properties");
			}
			if (inContext != null) {
				try {
					// defaultProps is in order to keep the original context value
					if (context != null && context.isEmpty()) {
						defaultProps.load(inContext);
						context = new ContextProperties(defaultProps);
					}
				} finally {
					inContext.close();
				}
			} else if (!isDefaultContext) {
				// print info and job continue to run, for case: context_param is not empty.
				System.err.println("Could not find the context " + contextStr);
			}

			if (!context_param.isEmpty()) {
				context.putAll(context_param);
				// set types for params from parentJobs
				for (Object key : context_param.keySet()) {
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
			}
			class ContextProcessing {
				private void processContext_0() {
				}

				public void processAllContext() {
					processContext_0();
				}
			}

			new ContextProcessing().processAllContext();
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, parametersToEncrypt));

		if (execStat) {
			try {
				runStat.openSocket(!isChildJob);
				runStat.setAllPID(rootPid, fatherPid, pid, jobName);
				runStat.startThreadStat(clientHost, portStats);
				runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
			} catch (java.io.IOException ioException) {
				ioException.printStackTrace();
			}
		}

		java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
		globalMap.put("concurrentHashMap", concurrentHashMap);

		long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long endUsedMemory = 0;
		long end = 0;

		startTime = System.currentTimeMillis();

		this.globalResumeTicket = true;// to run tPreJob

		if (enableLogStash) {
			talendJobLog.addJobStartMessage();
			try {
				talendJobLogProcess(globalMap);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		this.globalResumeTicket = false;// to run others jobs

		try {
			errorCode = null;
			tDBConnection_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tDBConnection_1) {
			globalMap.put("tDBConnection_1_SUBPROCESS_STATE", -1);

			e_tDBConnection_1.printStackTrace();

		}
		try {
			errorCode = null;
			tDBInput_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tDBInput_1) {
			globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

			e_tDBInput_1.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : TEST");
		}
		if (enableLogStash) {
			talendJobLog.addJobEndMessage(startTime, end, status);
			try {
				talendJobLogProcess(globalMap);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		if (execStat) {
			runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
			runStat.stopThreadStat();
		}
		int returnCode = 0;

		if (errorCode == null) {
			returnCode = status != null && status.equals("failure") ? 1 : 0;
		} else {
			returnCode = errorCode.intValue();
		}
		resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "",
				"" + returnCode, "", "", "");

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {
		closeSqlDbConnections();

	}

	private void closeSqlDbConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tDBConnection_1");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
			obj_conn = globalMap.remove("conn_tDBConnection_1");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
		connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
		connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));

		return connections;
	}

	private void evalParam(String arg) {
		if (arg.startsWith("--resuming_logs_dir_path")) {
			resuming_logs_dir_path = arg.substring(25);
		} else if (arg.startsWith("--resuming_checkpoint_path")) {
			resuming_checkpoint_path = arg.substring(27);
		} else if (arg.startsWith("--parent_part_launcher")) {
			parent_part_launcher = arg.substring(23);
		} else if (arg.startsWith("--watch")) {
			watch = true;
		} else if (arg.startsWith("--stat_port=")) {
			String portStatsStr = arg.substring(12);
			if (portStatsStr != null && !portStatsStr.equals("null")) {
				portStats = Integer.parseInt(portStatsStr);
			}
		} else if (arg.startsWith("--trace_port=")) {
			portTraces = Integer.parseInt(arg.substring(13));
		} else if (arg.startsWith("--client_host=")) {
			clientHost = arg.substring(14);
		} else if (arg.startsWith("--context=")) {
			contextStr = arg.substring(10);
			isDefaultContext = false;
		} else if (arg.startsWith("--father_pid=")) {
			fatherPid = arg.substring(13);
		} else if (arg.startsWith("--root_pid=")) {
			rootPid = arg.substring(11);
		} else if (arg.startsWith("--father_node=")) {
			fatherNode = arg.substring(14);
		} else if (arg.startsWith("--pid=")) {
			pid = arg.substring(6);
		} else if (arg.startsWith("--context_type")) {
			String keyValue = arg.substring(15);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.setContextType(keyValue.substring(0, index),
							replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1));
				}

			}

		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1));
				}
			}
		} else if (arg.startsWith("--log4jLevel=")) {
			log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {// for trunjob call
			final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
	}

	private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

	private final String[][] escapeChars = { { "\\\\", "\\" }, { "\\n", "\n" }, { "\\'", "\'" }, { "\\r", "\r" },
			{ "\\f", "\f" }, { "\\b", "\b" }, { "\\t", "\t" } };

	private String replaceEscapeChars(String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0], currIndex);
				if (index >= 0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0],
							strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the
			// result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getStatus() {
		return status;
	}

	ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 * 187144 characters generated by Talend Cloud Data Management Platform on the
 * 22 juillet 2022 à 11:35:21 WEST
 ************************************************************************************************/