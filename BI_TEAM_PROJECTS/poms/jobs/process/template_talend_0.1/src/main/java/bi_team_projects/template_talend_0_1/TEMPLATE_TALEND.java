
package bi_team_projects.template_talend_0_1;

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
 * Job: TEMPLATE_TALEND Purpose: <br>
 * Description: Template Talend <br>
 * 
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status
 */
public class TEMPLATE_TALEND implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "TEMPLATE_TALEND.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(TEMPLATE_TALEND.class);

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

			if (host != null) {

				this.setProperty("host", host.toString());

			}

			if (sid != null) {

				this.setProperty("sid", sid.toString());

			}

			if (port != null) {

				this.setProperty("port", port.toString());

			}

			if (user != null) {

				this.setProperty("user", user.toString());

			}

			if (mdp != null) {

				this.setProperty("mdp", mdp.toString());

			}

			if (ENVIRONNEMENT != null) {

				this.setProperty("ENVIRONNEMENT", ENVIRONNEMENT.toString());

			}

			if (host_ods != null) {

				this.setProperty("host_ods", host_ods.toString());

			}

			if (sid_ods != null) {

				this.setProperty("sid_ods", sid_ods.toString());

			}

			if (port_ods != null) {

				this.setProperty("port_ods", port_ods.toString());

			}

			if (user_ods != null) {

				this.setProperty("user_ods", user_ods.toString());

			}

			if (mdp_ods != null) {

				this.setProperty("mdp_ods", mdp_ods.toString());

			}

			if (user_gold != null) {

				this.setProperty("user_gold", user_gold.toString());

			}

			if (sid_gold != null) {

				this.setProperty("sid_gold", sid_gold.toString());

			}

			if (port_gold != null) {

				this.setProperty("port_gold", port_gold.toString());

			}

			if (host_gold != null) {

				this.setProperty("host_gold", host_gold.toString());

			}

			if (mdp_gold != null) {

				this.setProperty("mdp_gold", mdp_gold.toString());

			}

			if (PORTAIL_FOURNISSEUR_AZURE_Login != null) {

				this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Login", PORTAIL_FOURNISSEUR_AZURE_Login.toString());

			}

			if (PORTAIL_FOURNISSEUR_AZURE_AdditionalParams != null) {

				this.setProperty("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams",
						PORTAIL_FOURNISSEUR_AZURE_AdditionalParams.toString());

			}

			if (PORTAIL_FOURNISSEUR_AZURE_Schema != null) {

				this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Schema", PORTAIL_FOURNISSEUR_AZURE_Schema.toString());

			}

			if (PORTAIL_FOURNISSEUR_AZURE_Server != null) {

				this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Server", PORTAIL_FOURNISSEUR_AZURE_Server.toString());

			}

			if (PORTAIL_FOURNISSEUR_AZURE_Port != null) {

				this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Port", PORTAIL_FOURNISSEUR_AZURE_Port.toString());

			}

			if (PORTAIL_FOURNISSEUR_AZURE_Password != null) {

				this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Password", PORTAIL_FOURNISSEUR_AZURE_Password.toString());

			}

			if (ENV != null) {

				this.setProperty("ENV", ENV.toString());

			}

			if (PORTAIL_FOURNISSEUR_AZURE_Database != null) {

				this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Database", PORTAIL_FOURNISSEUR_AZURE_Database.toString());

			}

			if (PATH_VENTE_HEBDO != null) {

				this.setProperty("PATH_VENTE_HEBDO", PATH_VENTE_HEBDO.toString());

			}

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

		public String host;

		public String getHost() {
			return this.host;
		}

		public String sid;

		public String getSid() {
			return this.sid;
		}

		public String port;

		public String getPort() {
			return this.port;
		}

		public String user;

		public String getUser() {
			return this.user;
		}

		public java.lang.String mdp;

		public java.lang.String getMdp() {
			return this.mdp;
		}

		public String ENVIRONNEMENT;

		public String getENVIRONNEMENT() {
			return this.ENVIRONNEMENT;
		}

		public String host_ods;

		public String getHost_ods() {
			return this.host_ods;
		}

		public String sid_ods;

		public String getSid_ods() {
			return this.sid_ods;
		}

		public String port_ods;

		public String getPort_ods() {
			return this.port_ods;
		}

		public String user_ods;

		public String getUser_ods() {
			return this.user_ods;
		}

		public java.lang.String mdp_ods;

		public java.lang.String getMdp_ods() {
			return this.mdp_ods;
		}

		public String user_gold;

		public String getUser_gold() {
			return this.user_gold;
		}

		public String sid_gold;

		public String getSid_gold() {
			return this.sid_gold;
		}

		public String port_gold;

		public String getPort_gold() {
			return this.port_gold;
		}

		public String host_gold;

		public String getHost_gold() {
			return this.host_gold;
		}

		public java.lang.String mdp_gold;

		public java.lang.String getMdp_gold() {
			return this.mdp_gold;
		}

		public String PORTAIL_FOURNISSEUR_AZURE_Login;

		public String getPORTAIL_FOURNISSEUR_AZURE_Login() {
			return this.PORTAIL_FOURNISSEUR_AZURE_Login;
		}

		public String PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;

		public String getPORTAIL_FOURNISSEUR_AZURE_AdditionalParams() {
			return this.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;
		}

		public String PORTAIL_FOURNISSEUR_AZURE_Schema;

		public String getPORTAIL_FOURNISSEUR_AZURE_Schema() {
			return this.PORTAIL_FOURNISSEUR_AZURE_Schema;
		}

		public String PORTAIL_FOURNISSEUR_AZURE_Server;

		public String getPORTAIL_FOURNISSEUR_AZURE_Server() {
			return this.PORTAIL_FOURNISSEUR_AZURE_Server;
		}

		public String PORTAIL_FOURNISSEUR_AZURE_Port;

		public String getPORTAIL_FOURNISSEUR_AZURE_Port() {
			return this.PORTAIL_FOURNISSEUR_AZURE_Port;
		}

		public java.lang.String PORTAIL_FOURNISSEUR_AZURE_Password;

		public java.lang.String getPORTAIL_FOURNISSEUR_AZURE_Password() {
			return this.PORTAIL_FOURNISSEUR_AZURE_Password;
		}

		public String ENV;

		public String getENV() {
			return this.ENV;
		}

		public String PORTAIL_FOURNISSEUR_AZURE_Database;

		public String getPORTAIL_FOURNISSEUR_AZURE_Database() {
			return this.PORTAIL_FOURNISSEUR_AZURE_Database;
		}

		public String PATH_VENTE_HEBDO;

		public String getPATH_VENTE_HEBDO() {
			return this.PATH_VENTE_HEBDO;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "TEMPLATE_TALEND";
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

	MetterCatcherUtils tFlowMeterCatcher_1 = new MetterCatcherUtils("_0-AqwAmpEe2IX-E-61NGPg", "0.1");

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
					TEMPLATE_TALEND.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(TEMPLATE_TALEND.this, new Object[] { e, currentComponent, globalMap });
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

	public void tChronometerStart_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSetGlobalVar_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tSetGlobalVar_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tHashOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tHashOutput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tUniqRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFlowMeter_15_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBCommit_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBCommit_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDie_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tWarn_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tWarn_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBCommit_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSetGlobalVar_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tSetGlobalVar_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tHashInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileExist_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileExist_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tSendMail_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tChronometerStop_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFixedFlowInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFixedFlowInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFixedFlowInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFixedFlowInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tHashInput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tHashInput_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFlowMeterCatcher_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFlowMeterCatcher_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFlowMeterCatcher_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPostjob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tAdvancedHash_row5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tAdvancedHash_row7_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tHashInput_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSetGlobalVar_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBClose_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBCommit_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "ERROR", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

		try {

			if (this.execStat) {
				runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
			}

			errorCode = null;
			tDie_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tDie_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tWarn_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSetGlobalVar_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tHashInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileExist_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSendMail_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFixedFlowInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFlowMeterCatcher_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPostjob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBClose_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBClose_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBClose_4_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_4_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

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
				 * [tChronometerStart_1 begin ] start
				 */

				ok_Hash.put("tChronometerStart_1", false);
				start_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				currentComponent = "tChronometerStart_1";

				int tos_count_tChronometerStart_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tChronometerStart_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tChronometerStart_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tChronometerStart_1 = new StringBuilder();
							log4jParamters_tChronometerStart_1.append("Parameters:");
							if (log.isDebugEnabled())
								log.debug("tChronometerStart_1 - " + (log4jParamters_tChronometerStart_1));
						}
					}
					new BytesLimit65535_tChronometerStart_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tChronometerStart_1", "tChronometerStart_1", "tChronometerStart");
					talendJobLogProcess(globalMap);
				}

				Long currentTimetChronometerStart_1 = System.currentTimeMillis();

				log.info("tChronometerStart_1 - Start time: " + currentTimetChronometerStart_1 + " milliseconds");

				globalMap.put("tChronometerStart_1", currentTimetChronometerStart_1);
				globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);

				/**
				 * [tChronometerStart_1 begin ] stop
				 */

				/**
				 * [tChronometerStart_1 main ] start
				 */

				currentComponent = "tChronometerStart_1";

				tos_count_tChronometerStart_1++;

				/**
				 * [tChronometerStart_1 main ] stop
				 */

				/**
				 * [tChronometerStart_1 process_data_begin ] start
				 */

				currentComponent = "tChronometerStart_1";

				/**
				 * [tChronometerStart_1 process_data_begin ] stop
				 */

				/**
				 * [tChronometerStart_1 process_data_end ] start
				 */

				currentComponent = "tChronometerStart_1";

				/**
				 * [tChronometerStart_1 process_data_end ] stop
				 */

				/**
				 * [tChronometerStart_1 end ] start
				 */

				currentComponent = "tChronometerStart_1";

				if (log.isDebugEnabled())
					log.debug("tChronometerStart_1 - " + ("Done."));

				ok_Hash.put("tChronometerStart_1", true);
				end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tSetGlobalVar_2Process(globalMap);

				/**
				 * [tChronometerStart_1 end ] stop
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
				 * [tChronometerStart_1 finally ] start
				 */

				currentComponent = "tChronometerStart_1";

				/**
				 * [tChronometerStart_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}

	public void tSetGlobalVar_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tSetGlobalVar_2_SUBPROCESS_STATE", 0);

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
				 * [tSetGlobalVar_2 begin ] start
				 */

				ok_Hash.put("tSetGlobalVar_2", false);
				start_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());

				currentComponent = "tSetGlobalVar_2";

				int tos_count_tSetGlobalVar_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tSetGlobalVar_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tSetGlobalVar_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tSetGlobalVar_2 = new StringBuilder();
							log4jParamters_tSetGlobalVar_2.append("Parameters:");
							log4jParamters_tSetGlobalVar_2.append("VARIABLES" + " = " + "[{VALUE="
									+ ("TalendDate.formatDate(\"yyyy-MM-dd_HH-mm-ss\",TalendDate.getCurrentDate())")
									+ ", KEY=" + ("\"CurrentDate\"") + "}, {VALUE=" + ("\"Integration de Données\"")
									+ ", KEY=" + ("\"TaskType\"") + "}, {VALUE=" + ("\"VenteHebdo\"") + ", KEY="
									+ ("\"TaskName\"") + "}, {VALUE="
									+ ("\"Integration des Ventes Hebdo dans le Protail Fournisseur\"") + ", KEY="
									+ ("\"TaskDetail\"") + "}]");
							log4jParamters_tSetGlobalVar_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tSetGlobalVar_2 - " + (log4jParamters_tSetGlobalVar_2));
						}
					}
					new BytesLimit65535_tSetGlobalVar_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tSetGlobalVar_2", "tSetGlobalVar_2", "tSetGlobalVar");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tSetGlobalVar_2 begin ] stop
				 */

				/**
				 * [tSetGlobalVar_2 main ] start
				 */

				currentComponent = "tSetGlobalVar_2";

				globalMap.put("CurrentDate", TalendDate.formatDate("yyyy-MM-dd_HH-mm-ss", TalendDate.getCurrentDate()));
				globalMap.put("TaskType", "Integration de Données");
				globalMap.put("TaskName", "VenteHebdo");
				globalMap.put("TaskDetail", "Integration des Ventes Hebdo dans le Protail Fournisseur");

				tos_count_tSetGlobalVar_2++;

				/**
				 * [tSetGlobalVar_2 main ] stop
				 */

				/**
				 * [tSetGlobalVar_2 process_data_begin ] start
				 */

				currentComponent = "tSetGlobalVar_2";

				/**
				 * [tSetGlobalVar_2 process_data_begin ] stop
				 */

				/**
				 * [tSetGlobalVar_2 process_data_end ] start
				 */

				currentComponent = "tSetGlobalVar_2";

				/**
				 * [tSetGlobalVar_2 process_data_end ] stop
				 */

				/**
				 * [tSetGlobalVar_2 end ] start
				 */

				currentComponent = "tSetGlobalVar_2";

				if (log.isDebugEnabled())
					log.debug("tSetGlobalVar_2 - " + ("Done."));

				ok_Hash.put("tSetGlobalVar_2", true);
				end_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBInput_3Process(globalMap);

				/**
				 * [tSetGlobalVar_2 end ] stop
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
				 * [tSetGlobalVar_2 finally ] start
				 */

				currentComponent = "tSetGlobalVar_2";

				/**
				 * [tSetGlobalVar_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSetGlobalVar_2_SUBPROCESS_STATE", 1);
	}

	public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.LIBFRS = readString(dis);

					this.FOUCNUF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.LIBFRS = readString(dis);

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

				writeString(this.LIBFRS, dos);

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

				writeString(this.LIBFRS, dos);

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
		public int compareTo(row3Struct other) {

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

	public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

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

				row3Struct row3 = new row3Struct();

				/**
				 * [tHashOutput_1 begin ] start
				 */

				ok_Hash.put("tHashOutput_1", false);
				start_Hash.put("tHashOutput_1", System.currentTimeMillis());

				currentComponent = "tHashOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row3");

				int tos_count_tHashOutput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tHashOutput_1", "FOURNISSEUR", "tHashOutput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.hashfile.common.MapHashFile mf_tHashOutput_1 = org.talend.designer.components.hashfile.common.MapHashFile
						.getMapHashFile();
				org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct> tHashFile_tHashOutput_1 = null;
				String hashKey_tHashOutput_1 = "tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_1";
				synchronized (org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap
						.get(hashKey_tHashOutput_1)) {
					if (mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1) == null) {
						mf_tHashOutput_1.getResourceMap().put(hashKey_tHashOutput_1,
								new org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct>(
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
				 * [tDBInput_3 begin ] start
				 */

				ok_Hash.put("tDBInput_3", false);
				start_Hash.put("tDBInput_3", System.currentTimeMillis());

				currentComponent = "tDBInput_3";

				int tos_count_tDBInput_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_3 = new StringBuilder();
							log4jParamters_tDBInput_3.append("Parameters:");
							log4jParamters_tDBInput_3.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("CONNECTION" + " = " + "tDBConnection_4");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("QUERY" + " = "
									+ "\"Select FOUCFIN,LIBFRS, FOUCNUF  from Fournisseur  where ISABONNE = 1  order by FOUCFIN\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("FOUCFIN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LIBFRS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("FOUCNUF") + "}]");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlInput");
							log4jParamters_tDBInput_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_3 - " + (log4jParamters_tDBInput_3));
						}
					}
					new BytesLimit65535_tDBInput_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_3", "PORTAIL_FOURNISSEUR_AZURE", "tMSSqlInput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_3 = org.talend.designer.components.util.mssql.MSSqlUtilFactory
						.getMSSqlGenerateTimestampUtil();

				java.util.List<String> talendToDBList_tDBInput_3 = new java.util.ArrayList();
				String[] talendToDBArray_tDBInput_3 = new String[] { "FLOAT", "NUMERIC", "NUMERIC IDENTITY", "DECIMAL",
						"DECIMAL IDENTITY", "REAL" };
				java.util.Collections.addAll(talendToDBList_tDBInput_3, talendToDBArray_tDBInput_3);
				int nb_line_tDBInput_3 = 0;
				java.sql.Connection conn_tDBInput_3 = null;
				conn_tDBInput_3 = (java.sql.Connection) globalMap.get("conn_tDBConnection_4");

				if (conn_tDBInput_3 != null) {
					if (conn_tDBInput_3.getMetaData() != null) {

						log.debug("tDBInput_3 - Uses an existing connection with username '"
								+ conn_tDBInput_3.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBInput_3.getMetaData().getURL() + ".");

					}
				}

				String dbschema_tDBInput_3 = (String) globalMap.get("dbschema_tDBConnection_4");

				java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

				String dbquery_tDBInput_3 = "Select FOUCFIN,LIBFRS, FOUCNUF\nfrom Fournisseur\nwhere ISABONNE = 1\norder by FOUCFIN";

				log.debug("tDBInput_3 - Executing the query: '" + dbquery_tDBInput_3 + "'.");

				globalMap.put("tDBInput_3_QUERY", dbquery_tDBInput_3);
				java.sql.ResultSet rs_tDBInput_3 = null;

				try {
					rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
					java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
					int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

					String tmpContent_tDBInput_3 = null;

					log.debug("tDBInput_3 - Retrieving records from the database.");

					while (rs_tDBInput_3.next()) {
						nb_line_tDBInput_3++;

						if (colQtyInRs_tDBInput_3 < 1) {
							row3.FOUCFIN = null;
						} else {

							row3.FOUCFIN = rs_tDBInput_3.getInt(1);
							if (rs_tDBInput_3.wasNull()) {
								row3.FOUCFIN = null;
							}
						}
						if (colQtyInRs_tDBInput_3 < 2) {
							row3.LIBFRS = null;
						} else {

							tmpContent_tDBInput_3 = rs_tDBInput_3.getString(2);
							if (tmpContent_tDBInput_3 != null) {
								if (talendToDBList_tDBInput_3.contains(
										rsmd_tDBInput_3.getColumnTypeName(2).toUpperCase(java.util.Locale.ENGLISH))) {
									row3.LIBFRS = FormatterUtils.formatUnwithE(tmpContent_tDBInput_3);
								} else {
									row3.LIBFRS = tmpContent_tDBInput_3;
								}
							} else {
								row3.LIBFRS = null;
							}
						}
						if (colQtyInRs_tDBInput_3 < 3) {
							row3.FOUCNUF = null;
						} else {

							tmpContent_tDBInput_3 = rs_tDBInput_3.getString(3);
							if (tmpContent_tDBInput_3 != null) {
								if (talendToDBList_tDBInput_3.contains(
										rsmd_tDBInput_3.getColumnTypeName(3).toUpperCase(java.util.Locale.ENGLISH))) {
									row3.FOUCNUF = FormatterUtils.formatUnwithE(tmpContent_tDBInput_3);
								} else {
									row3.FOUCNUF = tmpContent_tDBInput_3;
								}
							} else {
								row3.FOUCNUF = null;
							}
						}

						log.debug("tDBInput_3 - Retrieving the record " + nb_line_tDBInput_3 + ".");

						/**
						 * [tDBInput_3 begin ] stop
						 */

						/**
						 * [tDBInput_3 main ] start
						 */

						currentComponent = "tDBInput_3";

						tos_count_tDBInput_3++;

						/**
						 * [tDBInput_3 main ] stop
						 */

						/**
						 * [tDBInput_3 process_data_begin ] start
						 */

						currentComponent = "tDBInput_3";

						/**
						 * [tDBInput_3 process_data_begin ] stop
						 */

						/**
						 * [tHashOutput_1 main ] start
						 */

						currentComponent = "tHashOutput_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row3", "tDBInput_3", "PORTAIL_FOURNISSEUR_AZURE", "tMSSqlInput", "tHashOutput_1",
								"FOURNISSEUR", "tHashOutput"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row3 - " + (row3 == null ? "" : row3.toLogString()));
						}

						row3Struct oneRow_tHashOutput_1 = new row3Struct();

						oneRow_tHashOutput_1.FOUCFIN = row3.FOUCFIN;
						oneRow_tHashOutput_1.LIBFRS = row3.LIBFRS;
						oneRow_tHashOutput_1.FOUCNUF = row3.FOUCNUF;

						tHashFile_tHashOutput_1.put(oneRow_tHashOutput_1);
						nb_line_tHashOutput_1++;

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
						 * [tHashOutput_1 process_data_end ] start
						 */

						currentComponent = "tHashOutput_1";

						/**
						 * [tHashOutput_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_3 process_data_end ] start
						 */

						currentComponent = "tDBInput_3";

						/**
						 * [tDBInput_3 process_data_end ] stop
						 */

						/**
						 * [tDBInput_3 end ] start
						 */

						currentComponent = "tDBInput_3";

					}
				} finally {
					if (rs_tDBInput_3 != null) {
						rs_tDBInput_3.close();
					}
					if (stmt_tDBInput_3 != null) {
						stmt_tDBInput_3.close();
					}
				}
				globalMap.put("tDBInput_3_NB_LINE", nb_line_tDBInput_3);
				log.debug("tDBInput_3 - Retrieved records count: " + nb_line_tDBInput_3 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_3 - " + ("Done."));

				ok_Hash.put("tDBInput_3", true);
				end_Hash.put("tDBInput_3", System.currentTimeMillis());

				/**
				 * [tDBInput_3 end ] stop
				 */

				/**
				 * [tHashOutput_1 end ] start
				 */

				currentComponent = "tHashOutput_1";

				globalMap.put("tHashOutput_1_NB_LINE", nb_line_tHashOutput_1);
				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row3", 2, 0,
						"tDBInput_3", "PORTAIL_FOURNISSEUR_AZURE", "tMSSqlInput", "tHashOutput_1", "FOURNISSEUR",
						"tHashOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tHashOutput_1", true);
				end_Hash.put("tHashOutput_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk16", 0, "ok");
				}
				tDBClose_1Process(globalMap);

				/**
				 * [tHashOutput_1 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_3:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
			}

			tDBInput_1Process(globalMap);

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
				 * [tDBInput_3 finally ] start
				 */

				currentComponent = "tDBInput_3";

				/**
				 * [tDBInput_3 finally ] stop
				 */

				/**
				 * [tHashOutput_1 finally ] start
				 */

				currentComponent = "tHashOutput_1";

				/**
				 * [tHashOutput_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}

	public void tDBClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 0);

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
				 * [tDBClose_1 begin ] start
				 */

				ok_Hash.put("tDBClose_1", false);
				start_Hash.put("tDBClose_1", System.currentTimeMillis());

				currentComponent = "tDBClose_1";

				int tos_count_tDBClose_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBClose_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBClose_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBClose_1 = new StringBuilder();
							log4jParamters_tDBClose_1.append("Parameters:");
							log4jParamters_tDBClose_1.append("CONNECTION" + " = " + "tDBConnection_4");
							log4jParamters_tDBClose_1.append(" | ");
							log4jParamters_tDBClose_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlClose");
							log4jParamters_tDBClose_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_1 - " + (log4jParamters_tDBClose_1));
						}
					}
					new BytesLimit65535_tDBClose_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_1", "tDBClose_1", "tMSSqlClose");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_1 begin ] stop
				 */

				/**
				 * [tDBClose_1 main ] start
				 */

				currentComponent = "tDBClose_1";

				java.sql.Connection conn_tDBClose_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_4");
				if (conn_tDBClose_1 != null && !conn_tDBClose_1.isClosed()) {
					if (log.isDebugEnabled())
						log.debug("tDBClose_1 - " + ("Closing the connection ") + ("conn_tDBConnection_4")
								+ (" to the database."));
					conn_tDBClose_1.close();
					if (log.isDebugEnabled())
						log.debug("tDBClose_1 - " + ("Connection ") + ("conn_tDBConnection_4")
								+ (" to the database has closed."));
				}

				tos_count_tDBClose_1++;

				/**
				 * [tDBClose_1 main ] stop
				 */

				/**
				 * [tDBClose_1 process_data_begin ] start
				 */

				currentComponent = "tDBClose_1";

				/**
				 * [tDBClose_1 process_data_begin ] stop
				 */

				/**
				 * [tDBClose_1 process_data_end ] start
				 */

				currentComponent = "tDBClose_1";

				/**
				 * [tDBClose_1 process_data_end ] stop
				 */

				/**
				 * [tDBClose_1 end ] start
				 */

				currentComponent = "tDBClose_1";

				if (log.isDebugEnabled())
					log.debug("tDBClose_1 - " + ("Done."));

				ok_Hash.put("tDBClose_1", true);
				end_Hash.put("tDBClose_1", System.currentTimeMillis());

				/**
				 * [tDBClose_1 end ] stop
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
				 * [tDBClose_1 finally ] start
				 */

				currentComponent = "tDBClose_1";

				/**
				 * [tDBClose_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
	}

	public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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

	public static class out1Struct implements routines.system.IPersistableRow<out1Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
		}

		public java.util.Date DATE_DEBUT;

		public java.util.Date getDATE_DEBUT() {
			return this.DATE_DEBUT;
		}

		public java.util.Date DATE_FIN;

		public java.util.Date getDATE_FIN() {
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

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
					}

					this.DATE_DEBUT = readDate(dis);

					this.DATE_FIN = readDate(dis);

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

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
					}

					this.DATE_DEBUT = readDate(dis);

					this.DATE_FIN = readDate(dis);

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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
				}

				// java.util.Date

				writeDate(this.DATE_DEBUT, dos);

				// java.util.Date

				writeDate(this.DATE_FIN, dos);

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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
				}

				// java.util.Date

				writeDate(this.DATE_DEBUT, dos);

				// java.util.Date

				writeDate(this.DATE_FIN, dos);

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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",EAN=" + String.valueOf(EAN));
			sb.append(",DATE_DEBUT=" + String.valueOf(DATE_DEBUT));
			sb.append(",DATE_FIN=" + String.valueOf(DATE_FIN));
			sb.append(",CODEENSEIGNE=" + String.valueOf(CODEENSEIGNE));
			sb.append(",CODE_ARTICLE=" + String.valueOf(CODE_ARTICLE));
			sb.append(",QTE=" + String.valueOf(QTE));
			sb.append(",CA_TTC=" + String.valueOf(CA_TTC));
			sb.append(",CA_HT=" + String.valueOf(CA_HT));
			sb.append(",DateLastUpdateWebJob=" + String.valueOf(DateLastUpdateWebJob));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

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

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
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

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(out1Struct other) {

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
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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

	public static class Nbr_lignes_goldStruct implements routines.system.IPersistableRow<Nbr_lignes_goldStruct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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
			sb.append("CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",EAN=" + String.valueOf(EAN));
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

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
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
		public int compareTo(Nbr_lignes_goldStruct other) {

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
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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
			sb.append("CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",EAN=" + String.valueOf(EAN));
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

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
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

				tHashInput_2Process(globalMap);

				Nbr_lignes_goldStruct Nbr_lignes_gold = new Nbr_lignes_goldStruct();
				out1Struct out1 = new out1Struct();
				fouciStruct fouci = new fouciStruct();
				row4Struct row4 = new row4Struct();

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "out1");

				int tos_count_tDBOutput_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBOutput_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBOutput_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBOutput_1 = new StringBuilder();
							log4jParamters_tDBOutput_1.append("Parameters:");
							log4jParamters_tDBOutput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("CONNECTION" + " = " + "tDBConnection_3");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"ODS_VENTE_HEBDO\"");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("TABLE_ACTION" + " = " + "TRUNCATE");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("DATA_ACTION" + " = " + "INSERT");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("DIE_ON_ERROR" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("ADD_COLS" + " = " + "[]");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("USE_FIELD_OPTIONS" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("USE_HINT_OPTIONS" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("ENABLE_DEBUG_MODE" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("USE_BATCH_AND_USE_CONN" + " = " + "true");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("BATCH_SIZE" + " = " + "10000");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("SUPPORT_NULL_WHERE" + " = " + "false");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("TRIM_CHAR" + " = " + "true");
							log4jParamters_tDBOutput_1.append(" | ");
							log4jParamters_tDBOutput_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
							log4jParamters_tDBOutput_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBOutput_1 - " + (log4jParamters_tDBOutput_1));
						}
					}
					new BytesLimit65535_tDBOutput_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_1", "Oracle_ODS", "tOracleOutput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBOutput_1 = 0;
				int nb_line_update_tDBOutput_1 = 0;
				int nb_line_inserted_tDBOutput_1 = 0;
				int nb_line_deleted_tDBOutput_1 = 0;
				int nb_line_rejected_tDBOutput_1 = 0;

				int tmp_batchUpdateCount_tDBOutput_1 = 0;

				int deletedCount_tDBOutput_1 = 0;
				int updatedCount_tDBOutput_1 = 0;
				int insertedCount_tDBOutput_1 = 0;
				int rowsToCommitCount_tDBOutput_1 = 0;
				int rejectedCount_tDBOutput_1 = 0;

				boolean whetherReject_tDBOutput_1 = false;

				java.sql.Connection conn_tDBOutput_1 = null;

				// optional table
				String dbschema_tDBOutput_1 = null;
				String tableName_tDBOutput_1 = null;
				dbschema_tDBOutput_1 = (String) globalMap.get("dbschema_tDBConnection_3");

				conn_tDBOutput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_3");
				if (log.isDebugEnabled())
					log.debug("tDBOutput_1 - " + ("Uses an existing connection with username '")
							+ (conn_tDBOutput_1.getMetaData().getUserName()) + ("'. Connection URL: ")
							+ (conn_tDBOutput_1.getMetaData().getURL()) + ("."));
				if (log.isDebugEnabled())
					log.debug("tDBOutput_1 - " + ("Connection is set auto commit to '")
							+ (conn_tDBOutput_1.getAutoCommit()) + ("'."));
				int batchSize_tDBOutput_1 = 10000;
				int batchSizeCounter_tDBOutput_1 = 0;
				int count_tDBOutput_1 = 0;

				if (dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
					tableName_tDBOutput_1 = ("ODS_VENTE_HEBDO");
				} else {
					tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "." + ("ODS_VENTE_HEBDO");
				}
				int rsTruncCountNumber_tDBOutput_1 = 0;
				try (java.sql.Statement stmtTruncCount_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
					try (java.sql.ResultSet rsTruncCount_tDBOutput_1 = stmtTruncCount_tDBOutput_1
							.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_1 + "")) {
						if (rsTruncCount_tDBOutput_1.next()) {
							rsTruncCountNumber_tDBOutput_1 = rsTruncCount_tDBOutput_1.getInt(1);
						}
					}
				}
				try (java.sql.Statement stmtTrunc_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
					if (log.isDebugEnabled())
						log.debug("tDBOutput_1 - " + ("Truncating") + (" table '") + (tableName_tDBOutput_1) + ("'."));
					stmtTrunc_tDBOutput_1.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_1 + "");
					if (log.isDebugEnabled())
						log.debug("tDBOutput_1 - " + ("Truncate") + (" table '") + (tableName_tDBOutput_1)
								+ ("' has succeeded."));
					deletedCount_tDBOutput_1 += rsTruncCountNumber_tDBOutput_1;
				}
				String insert_tDBOutput_1 = "INSERT INTO " + tableName_tDBOutput_1
						+ " (CODE_INTERNE_ARTICLE,CODESITE,EAN,DATE_DEBUT,DATE_FIN,CODEENSEIGNE,CODE_ARTICLE,QTE,CA_TTC,CA_HT,DateLastUpdateWebJob) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

				java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
				resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);

				/**
				 * [tDBOutput_1 begin ] stop
				 */

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

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "Nbr_lignes_gold");

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
				int count_Nbr_lignes_gold_tMap_1 = 0;

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
				int count_out1_tMap_1 = 0;

				out1Struct out1_tmp = new out1Struct();
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
							log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_2");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = "
									+ "\"With VTEVMVT AS  (SELECT T.STMCINL,               T.STMSITE SOCSITE,               S.SOCCHAIN,               -NVL(SUM(STMVAL), 0) QTE,               -NVL(SUM(STMVPV), 0) CA_TTC,               -NVL(SUM(STMVPV - STMTVA), 0) CA_HT          FROM SITDGENE S, STOMVT T         WHERE S.SOCCMAG = 10           AND T.STMSITE = S.SOCSITE           AND STMTMVT BETWEEN 150 AND 174           AND TRUNC(T.STMDMVT) BETWEEN               TO_DATE(TO_CHAR(TRUNC(SYSDATE, 'IW') - 7, 'dd/MM/yyyy')) AND               TO_DATE(TO_CHAR(TRUNC(SYSDATE, 'IW') - 1, 'dd/MM/yyyy')) + 0.99999         GROUP BY T.STMSITE, T.STMCINL, S.SOCCHAIN        HAVING - NVL(SUM(STMVAL), 0) <> 0)    SELECT U.ARVCINR CODE_INTERNE_ARTICLE,         VV.SOCSITE CODESITE,         PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,         TO_CHAR(TRUNC(SYSDATE, 'IW') - 7, 'yyyy-MM-dd') DATE_DEBUT,         TO_CHAR(TRUNC(SYSDATE, 'IW') - 1, 'yyyy-MM-dd') DATE_FIN,         VV.SOCCHAIN CODEENSEIGNE,         U.ARVCEXR CODE_ARTICLE,         QTE,         CA_TTC,         CA_HT,         TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') DATELASTUPDATEWEBJOB,         F.FCLCFIN FOUCIN    FROM ARTUV U, FOUCATALOG F, VTEVMVT VV   WHERE F.FCLCINV = U.ARVCINV     AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN     AND VV.STMCINL = U.ARVCINV   AND ROWNUM<100\"");
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
									+ ", SCHEMA_COLUMN=" + ("CODE_INTERNE_ARTICLE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CODESITE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("EAN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DATE_DEBUT")
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
				conn_tDBInput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_2");

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

				String dbquery_tDBInput_1 = "With VTEVMVT AS\n(SELECT T.STMCINL,\n             T.STMSITE SOCSITE,\n             S.SOCCHAIN,\n             -NVL(SUM(S"
						+ "TMVAL), 0) QTE,\n             -NVL(SUM(STMVPV), 0) CA_TTC,\n             -NVL(SUM(STMVPV - STMTVA), 0) CA_HT\n        FR"
						+ "OM SITDGENE S, STOMVT T\n       WHERE S.SOCCMAG = 10\n         AND T.STMSITE = S.SOCSITE\n         AND STMTMVT BETWEEN 1"
						+ "50 AND 174\n         AND TRUNC(T.STMDMVT) BETWEEN\n             TO_DATE(TO_CHAR(TRUNC(SYSDATE, 'IW') - 7, 'dd/MM/yyyy'))"
						+ " AND\n             TO_DATE(TO_CHAR(TRUNC(SYSDATE, 'IW') - 1, 'dd/MM/yyyy')) + 0.99999\n       GROUP BY T.STMSITE, T.STMC"
						+ "INL, S.SOCCHAIN\n      HAVING - NVL(SUM(STMVAL), 0) <> 0)\n\nSELECT U.ARVCINR CODE_INTERNE_ARTICLE,\n       VV.SOCSITE C"
						+ "ODESITE,\n       PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,\n       TO_CHAR(TRUNC(SYSDATE, 'IW') - 7, 'yyyy-MM-dd') DATE_D"
						+ "EBUT,\n       TO_CHAR(TRUNC(SYSDATE, 'IW') - 1, 'yyyy-MM-dd') DATE_FIN,\n       VV.SOCCHAIN CODEENSEIGNE,\n       U.ARVC"
						+ "EXR CODE_ARTICLE,\n       QTE,\n       CA_TTC,\n       CA_HT,\n       TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') DATELAST"
						+ "UPDATEWEBJOB,\n       F.FCLCFIN FOUCIN\n  FROM ARTUV U, FOUCATALOG F, VTEVMVT VV\n WHERE F.FCLCINV = U.ARVCINV\n   AND T"
						+ "RUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN\n   AND VV.STMCINL = U.ARVCINV\n AND ROWNUM<100";

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
							Nbr_lignes_gold.CODE_INTERNE_ARTICLE = null;
						} else {

							if (rs_tDBInput_1.getObject(1) != null) {
								Nbr_lignes_gold.CODE_INTERNE_ARTICLE = rs_tDBInput_1.getLong(1);
							} else {

								Nbr_lignes_gold.CODE_INTERNE_ARTICLE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							Nbr_lignes_gold.CODESITE = null;
						} else {

							if (rs_tDBInput_1.getObject(2) != null) {
								Nbr_lignes_gold.CODESITE = rs_tDBInput_1.getLong(2);
							} else {

								Nbr_lignes_gold.CODESITE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							Nbr_lignes_gold.EAN = null;
						} else {

							if (rs_tDBInput_1.getObject(3) != null) {
								Nbr_lignes_gold.EAN = rs_tDBInput_1.getLong(3);
							} else {

								Nbr_lignes_gold.EAN = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							Nbr_lignes_gold.DATE_DEBUT = null;
						} else {

							Nbr_lignes_gold.DATE_DEBUT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							Nbr_lignes_gold.DATE_FIN = null;
						} else {

							Nbr_lignes_gold.DATE_FIN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							Nbr_lignes_gold.CODEENSEIGNE = null;
						} else {

							if (rs_tDBInput_1.getObject(6) != null) {
								Nbr_lignes_gold.CODEENSEIGNE = rs_tDBInput_1.getLong(6);
							} else {

								Nbr_lignes_gold.CODEENSEIGNE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							Nbr_lignes_gold.CODE_ARTICLE = null;
						} else {

							if (rs_tDBInput_1.getObject(7) != null) {
								Nbr_lignes_gold.CODE_ARTICLE = rs_tDBInput_1.getLong(7);
							} else {

								Nbr_lignes_gold.CODE_ARTICLE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							Nbr_lignes_gold.QTE = null;
						} else {

							if (rs_tDBInput_1.getObject(8) != null) {
								Nbr_lignes_gold.QTE = rs_tDBInput_1.getBigDecimal(8);
							} else {

								Nbr_lignes_gold.QTE = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							Nbr_lignes_gold.CA_TTC = null;
						} else {

							if (rs_tDBInput_1.getObject(9) != null) {
								Nbr_lignes_gold.CA_TTC = rs_tDBInput_1.getBigDecimal(9);
							} else {

								Nbr_lignes_gold.CA_TTC = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							Nbr_lignes_gold.CA_HT = null;
						} else {

							if (rs_tDBInput_1.getObject(10) != null) {
								Nbr_lignes_gold.CA_HT = rs_tDBInput_1.getBigDecimal(10);
							} else {

								Nbr_lignes_gold.CA_HT = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 11) {
							Nbr_lignes_gold.DateLastUpdateWebJob = null;
						} else {

							Nbr_lignes_gold.DateLastUpdateWebJob = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 11);
						}
						if (colQtyInRs_tDBInput_1 < 12) {
							Nbr_lignes_gold.FOUCIN = null;
						} else {

							if (rs_tDBInput_1.getObject(12) != null) {
								Nbr_lignes_gold.FOUCIN = rs_tDBInput_1.getInt(12);
							} else {

								Nbr_lignes_gold.FOUCIN = null;
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

						tFlowMeterCatcher_1.addLineToRow("Nbr_lignes_gold_count");

						currentComponent = "tMap_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "Nbr_lignes_gold", "tDBInput_1", "ORACLE_GOLD", "tOracleInput", "tMap_1", "tMap_1",
								"tMap"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("Nbr_lignes_gold - "
									+ (Nbr_lignes_gold == null ? "" : Nbr_lignes_gold.toLogString()));
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

							row5HashKey.FOUCFIN = Nbr_lignes_gold.FOUCIN;

							row5HashKey.hashCodeDirty = true;

							tHash_Lookup_row5.lookup(row5HashKey);

							if (!tHash_Lookup_row5.hasNext()) { // G_TM_M_090

								rejectedInnerJoin_tMap_1 = true;

								forceLooprow5 = true;

							} // G_TM_M_090

						} // G_TM_M_020

						else { // G 20 - G 21
							forceLooprow5 = true;
						} // G 21

						row5Struct row5 = null;

						while ((tHash_Lookup_row5 != null && tHash_Lookup_row5.hasNext()) || forceLooprow5) { // G_TM_M_043

							// CALL close loop of lookup 'row5'

							row5Struct fromLookup_row5 = null;
							row5 = row5Default;

							if (!forceLooprow5) { // G 46

								fromLookup_row5 = tHash_Lookup_row5.next();

								if (fromLookup_row5 != null) {
									row5 = fromLookup_row5;
								}

							} // G 46

							forceLooprow5 = false;

							// ###############################
							{ // start of Var scope

								// ###############################
								// # Vars tables

								Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
								// ###############################
								// # Output tables

								out1 = null;
								fouci = null;

								if (!rejectedInnerJoin_tMap_1) {

// # Output table : 'out1'
									count_out1_tMap_1++;

									out1_tmp.CODE_INTERNE_ARTICLE = Nbr_lignes_gold.CODE_INTERNE_ARTICLE;
									out1_tmp.CODESITE = Nbr_lignes_gold.CODESITE;
									out1_tmp.EAN = Nbr_lignes_gold.EAN;
									out1_tmp.DATE_DEBUT = TalendDate.parseDate("yyyy-MM-dd",
											Nbr_lignes_gold.DATE_DEBUT);
									out1_tmp.DATE_FIN = TalendDate.parseDate("yyyy-MM-dd", Nbr_lignes_gold.DATE_FIN);
									out1_tmp.CODEENSEIGNE = Nbr_lignes_gold.CODEENSEIGNE;
									out1_tmp.CODE_ARTICLE = Nbr_lignes_gold.CODE_ARTICLE;
									out1_tmp.QTE = Nbr_lignes_gold.QTE;
									out1_tmp.CA_TTC = Nbr_lignes_gold.CA_TTC;
									out1_tmp.CA_HT = Nbr_lignes_gold.CA_HT;
									out1_tmp.DateLastUpdateWebJob = Nbr_lignes_gold.DateLastUpdateWebJob;
									out1 = out1_tmp;
									log.debug("tMap_1 - Outputting the record " + count_out1_tMap_1
											+ " of the output table 'out1'.");

// # Output table : 'fouci'
									count_fouci_tMap_1++;

									fouci_tmp.FOUCFIN = row5.FOUCFIN;
									fouci_tmp.FOULIB = row5.LIBFRS;
									fouci_tmp.FOUCNUF = row5.FOUCNUF;
									fouci = fouci_tmp;
									log.debug("tMap_1 - Outputting the record " + count_fouci_tMap_1
											+ " of the output table 'fouci'.");

								} // closing inner join bracket (2)
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
// Start of branch "out1"
							if (out1 != null) {

								/**
								 * [tDBOutput_1 main ] start
								 */

								currentComponent = "tDBOutput_1";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "out1", "tMap_1", "tMap_1", "tMap", "tDBOutput_1", "Oracle_ODS",
										"tOracleOutput"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("out1 - " + (out1 == null ? "" : out1.toLogString()));
								}

								whetherReject_tDBOutput_1 = false;
								if (out1.CODE_INTERNE_ARTICLE == null) {
									pstmt_tDBOutput_1.setNull(1, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_1.setLong(1, out1.CODE_INTERNE_ARTICLE);
								}

								if (out1.CODESITE == null) {
									pstmt_tDBOutput_1.setNull(2, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_1.setLong(2, out1.CODESITE);
								}

								if (out1.EAN == null) {
									pstmt_tDBOutput_1.setNull(3, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_1.setLong(3, out1.EAN);
								}

								if (out1.DATE_DEBUT != null) {
									pstmt_tDBOutput_1.setObject(4, new java.sql.Timestamp(out1.DATE_DEBUT.getTime()),
											java.sql.Types.DATE);
								} else {
									pstmt_tDBOutput_1.setNull(4, java.sql.Types.DATE);
								}

								if (out1.DATE_FIN != null) {
									pstmt_tDBOutput_1.setObject(5, new java.sql.Timestamp(out1.DATE_FIN.getTime()),
											java.sql.Types.DATE);
								} else {
									pstmt_tDBOutput_1.setNull(5, java.sql.Types.DATE);
								}

								if (out1.CODEENSEIGNE == null) {
									pstmt_tDBOutput_1.setNull(6, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_1.setLong(6, out1.CODEENSEIGNE);
								}

								if (out1.CODE_ARTICLE == null) {
									pstmt_tDBOutput_1.setNull(7, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_1.setLong(7, out1.CODE_ARTICLE);
								}

								pstmt_tDBOutput_1.setBigDecimal(8, out1.QTE);

								pstmt_tDBOutput_1.setBigDecimal(9, out1.CA_TTC);

								pstmt_tDBOutput_1.setBigDecimal(10, out1.CA_HT);

								if (out1.DateLastUpdateWebJob != null) {
									pstmt_tDBOutput_1.setObject(11,
											new java.sql.Timestamp(out1.DateLastUpdateWebJob.getTime()),
											java.sql.Types.DATE);
								} else {
									pstmt_tDBOutput_1.setNull(11, java.sql.Types.DATE);
								}

								pstmt_tDBOutput_1.addBatch();
								nb_line_tDBOutput_1++;
								if (log.isDebugEnabled())
									log.debug("tDBOutput_1 - " + ("Adding the record ") + (nb_line_tDBOutput_1)
											+ (" to the ") + ("INSERT") + (" batch."));
								batchSizeCounter_tDBOutput_1++;
								if (batchSize_tDBOutput_1 > 0
										&& batchSize_tDBOutput_1 <= batchSizeCounter_tDBOutput_1) {
									try {
										if (log.isDebugEnabled())
											log.debug("tDBOutput_1 - " + ("Executing the ") + ("INSERT") + (" batch."));
										pstmt_tDBOutput_1.executeBatch();
										if (log.isDebugEnabled())
											log.debug("tDBOutput_1 - " + ("The ") + ("INSERT")
													+ (" batch execution has succeeded."));
									} catch (java.sql.BatchUpdateException e_tDBOutput_1) {
										globalMap.put("tDBOutput_1_ERROR_MESSAGE", e_tDBOutput_1.getMessage());
										java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),
												sqle_tDBOutput_1 = null;
										String errormessage_tDBOutput_1;
										if (ne_tDBOutput_1 != null) {
											// build new exception to provide the original cause
											sqle_tDBOutput_1 = new java.sql.SQLException(
													e_tDBOutput_1.getMessage() + "\ncaused by: "
															+ ne_tDBOutput_1.getMessage(),
													ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(),
													ne_tDBOutput_1);
											errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
										} else {
											errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
										}

										log.error("tDBOutput_1 - " + (errormessage_tDBOutput_1));
										System.err.println(errormessage_tDBOutput_1);

									}
									tmp_batchUpdateCount_tDBOutput_1 = pstmt_tDBOutput_1.getUpdateCount();
									insertedCount_tDBOutput_1 += (tmp_batchUpdateCount_tDBOutput_1 != -1
											? tmp_batchUpdateCount_tDBOutput_1
											: 0);
									rowsToCommitCount_tDBOutput_1 += (tmp_batchUpdateCount_tDBOutput_1 != -1
											? tmp_batchUpdateCount_tDBOutput_1
											: 0);
									batchSizeCounter_tDBOutput_1 = 0;
								}

								tos_count_tDBOutput_1++;

								/**
								 * [tDBOutput_1 main ] stop
								 */

								/**
								 * [tDBOutput_1 process_data_begin ] start
								 */

								currentComponent = "tDBOutput_1";

								/**
								 * [tDBOutput_1 process_data_begin ] stop
								 */

								/**
								 * [tDBOutput_1 process_data_end ] start
								 */

								currentComponent = "tDBOutput_1";

								/**
								 * [tDBOutput_1 process_data_end ] stop
								 */

							} // End of branch "out1"

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

						} // close loop of lookup 'row5' // G_TM_M_043

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
				log.debug("tMap_1 - Written records count in the table 'out1': " + count_out1_tMap_1 + ".");
				log.debug("tMap_1 - Written records count in the table 'fouci': " + count_fouci_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "Nbr_lignes_gold", 2, 0,
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
				 * [tDBOutput_1 end ] start
				 */

				currentComponent = "tDBOutput_1";

				if (batchSizeCounter_tDBOutput_1 > 0) {
					try {
						if (pstmt_tDBOutput_1 != null) {

							if (log.isDebugEnabled())
								log.debug("tDBOutput_1 - " + ("Executing the ") + ("INSERT") + (" batch."));
							pstmt_tDBOutput_1.executeBatch();

							if (log.isDebugEnabled())
								log.debug(
										"tDBOutput_1 - " + ("The ") + ("INSERT") + (" batch execution has succeeded."));
						}
					} catch (java.sql.BatchUpdateException e_tDBOutput_1) {
						globalMap.put("tDBOutput_1_ERROR_MESSAGE", e_tDBOutput_1.getMessage());
						java.sql.SQLException ne_tDBOutput_1 = e_tDBOutput_1.getNextException(),
								sqle_tDBOutput_1 = null;
						String errormessage_tDBOutput_1;
						if (ne_tDBOutput_1 != null) {
							// build new exception to provide the original cause
							sqle_tDBOutput_1 = new java.sql.SQLException(
									e_tDBOutput_1.getMessage() + "\ncaused by: " + ne_tDBOutput_1.getMessage(),
									ne_tDBOutput_1.getSQLState(), ne_tDBOutput_1.getErrorCode(), ne_tDBOutput_1);
							errormessage_tDBOutput_1 = sqle_tDBOutput_1.getMessage();
						} else {
							errormessage_tDBOutput_1 = e_tDBOutput_1.getMessage();
						}

						log.error("tDBOutput_1 - " + (errormessage_tDBOutput_1));
						System.err.println(errormessage_tDBOutput_1);

					}
					if (pstmt_tDBOutput_1 != null) {
						tmp_batchUpdateCount_tDBOutput_1 = pstmt_tDBOutput_1.getUpdateCount();

						insertedCount_tDBOutput_1

								+= (tmp_batchUpdateCount_tDBOutput_1 != -1 ? tmp_batchUpdateCount_tDBOutput_1 : 0);
						rowsToCommitCount_tDBOutput_1 += (tmp_batchUpdateCount_tDBOutput_1 != -1
								? tmp_batchUpdateCount_tDBOutput_1
								: 0);
					}
				}
				if (pstmt_tDBOutput_1 != null) {

					pstmt_tDBOutput_1.close();
					resourceMap.remove("pstmt_tDBOutput_1");

				}
				resourceMap.put("statementClosed_tDBOutput_1", true);

				nb_line_deleted_tDBOutput_1 = nb_line_deleted_tDBOutput_1 + deletedCount_tDBOutput_1;
				nb_line_update_tDBOutput_1 = nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
				nb_line_inserted_tDBOutput_1 = nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
				nb_line_rejected_tDBOutput_1 = nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;

				globalMap.put("tDBOutput_1_NB_LINE", nb_line_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_UPDATED", nb_line_update_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_INSERTED", nb_line_inserted_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_DELETED", nb_line_deleted_tDBOutput_1);
				globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "out1", 2, 0, "tMap_1",
						"tMap_1", "tMap", "tDBOutput_1", "Oracle_ODS", "tOracleOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tDBOutput_1 - " + ("Done."));

				ok_Hash.put("tDBOutput_1", true);
				end_Hash.put("tDBOutput_1", System.currentTimeMillis());

				/**
				 * [tDBOutput_1 end ] stop
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
				 * [tHashOutput_2 begin ] start
				 */

				ok_Hash.put("tHashOutput_2", false);
				start_Hash.put("tHashOutput_2", System.currentTimeMillis());

				currentComponent = "tHashOutput_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row4");

				int tos_count_tHashOutput_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tHashOutput_2", "COUNTFRN", "tHashOutput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.hashfile.common.MapHashFile mf_tHashOutput_2 = org.talend.designer.components.hashfile.common.MapHashFile
						.getMapHashFile();
				org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row4Struct> tHashFile_tHashOutput_2 = null;
				String hashKey_tHashOutput_2 = "tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_2";
				synchronized (org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap
						.get(hashKey_tHashOutput_2)) {
					if (mf_tHashOutput_2.getResourceMap().get(hashKey_tHashOutput_2) == null) {
						mf_tHashOutput_2.getResourceMap().put(hashKey_tHashOutput_2,
								new org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row4Struct>(
										org.talend.designer.components.hashfile.common.MATCHING_MODE.KEEP_ALL));
						tHashFile_tHashOutput_2 = mf_tHashOutput_2.getResourceMap().get(hashKey_tHashOutput_2);
					} else {
						tHashFile_tHashOutput_2 = mf_tHashOutput_2.getResourceMap().get(hashKey_tHashOutput_2);
					}
				}
				int nb_line_tHashOutput_2 = 0;

				/**
				 * [tHashOutput_2 begin ] stop
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
					 * [tHashOutput_2 main ] start
					 */

					currentComponent = "tHashOutput_2";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row4", "tAggregateRow_1_AGGIN", "tAggregateRow_1_AGGIN", "tAggregateIn", "tHashOutput_2",
							"COUNTFRN", "tHashOutput"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row4 - " + (row4 == null ? "" : row4.toLogString()));
					}

					row4Struct oneRow_tHashOutput_2 = new row4Struct();

					oneRow_tHashOutput_2.FOUCFIN = row4.FOUCFIN;
					oneRow_tHashOutput_2.FOULIB = row4.FOULIB;
					oneRow_tHashOutput_2.FOUCNUF = row4.FOUCNUF;
					oneRow_tHashOutput_2.COUNTFRN = row4.COUNTFRN;

					tHashFile_tHashOutput_2.put(oneRow_tHashOutput_2);
					nb_line_tHashOutput_2++;

					tos_count_tHashOutput_2++;

					/**
					 * [tHashOutput_2 main ] stop
					 */

					/**
					 * [tHashOutput_2 process_data_begin ] start
					 */

					currentComponent = "tHashOutput_2";

					/**
					 * [tHashOutput_2 process_data_begin ] stop
					 */

					/**
					 * [tHashOutput_2 process_data_end ] start
					 */

					currentComponent = "tHashOutput_2";

					/**
					 * [tHashOutput_2 process_data_end ] stop
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
				 * [tHashOutput_2 end ] start
				 */

				currentComponent = "tHashOutput_2";

				globalMap.put("tHashOutput_2_NB_LINE", nb_line_tHashOutput_2);
				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row4", 2, 0,
						"tAggregateRow_1_AGGIN", "tAggregateRow_1_AGGIN", "tAggregateIn", "tHashOutput_2", "COUNTFRN",
						"tHashOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tHashOutput_2", true);
				end_Hash.put("tHashOutput_2", System.currentTimeMillis());

				/**
				 * [tHashOutput_2 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
			}

			tDBConnection_1Process(globalMap);

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
				 * [tDBOutput_1 finally ] start
				 */

				currentComponent = "tDBOutput_1";

				if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
					java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
					if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap
							.remove("pstmt_tDBOutput_1")) != null) {
						pstmtToClose_tDBOutput_1.close();
					}
				}

				/**
				 * [tDBOutput_1 finally ] stop
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
				 * [tHashOutput_2 finally ] start
				 */

				currentComponent = "tHashOutput_2";

				/**
				 * [tHashOutput_2 finally ] stop
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
							log4jParamters_tDBConnection_1.append("DRIVER" + " = " + "JTDS");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1
									.append("HOST" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Server");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1
									.append("PORT" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Port");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("SCHEMA_DB" + " = " + "\"\"");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1
									.append("DBNAME" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Database");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1
									.append("USER" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Login");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("PASS" + " = "
									+ String.valueOf(routines.system.PasswordEncryptUtil
											.encryptPassword(context.PORTAIL_FOURNISSEUR_AZURE_Password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append(
									"PROPERTIES" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("SHARE_IDENTITY_SETTING" + " = " + "true");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlConnection");
							log4jParamters_tDBConnection_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_1 - " + (log4jParamters_tDBConnection_1));
						}
					}
					new BytesLimit65535_tDBConnection_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_1", "MSS AZURE", "tMSSqlConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_1 = "jdbc:jtds:sqlserver://" + context.PORTAIL_FOURNISSEUR_AZURE_Server;
				String port_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Port;
				String dbname_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Database;
				if (!"".equals(port_tDBConnection_1)) {
					url_tDBConnection_1 += ":" + context.PORTAIL_FOURNISSEUR_AZURE_Port;
				}
				if (!"".equals(dbname_tDBConnection_1)) {

					url_tDBConnection_1 += "//" + context.PORTAIL_FOURNISSEUR_AZURE_Database;
				}

				url_tDBConnection_1 += ";appName=" + projectName + ";"
						+ context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;
				String dbUser_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Login;

				final String decryptedPassword_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Password;
				String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;

				java.sql.Connection conn_tDBConnection_1 = null;

				String driverClass_tDBConnection_1 = "net.sourceforge.jtds.jdbc.Driver";
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

				globalMap.put("dbschema_tDBConnection_1", "");

				globalMap.put("db_tDBConnection_1", context.PORTAIL_FOURNISSEUR_AZURE_Database);

				globalMap.put("shareIdentitySetting_tDBConnection_1", true);

				globalMap.put("driver_tDBConnection_1", "JTDS");

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBInput_2Process(globalMap);

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

	public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",EAN=" + String.valueOf(EAN));
			sb.append(",DATE_DEBUT=" + DATE_DEBUT);
			sb.append(",DATE_FIN=" + DATE_FIN);
			sb.append(",CODEENSEIGNE=" + String.valueOf(CODEENSEIGNE));
			sb.append(",CODE_ARTICLE=" + String.valueOf(CODE_ARTICLE));
			sb.append(",QTE=" + String.valueOf(QTE));
			sb.append(",CA_TTC=" + String.valueOf(CA_TTC));
			sb.append(",CA_HT=" + String.valueOf(CA_HT));
			sb.append(",DateLastUpdateWebJob=" + String.valueOf(DateLastUpdateWebJob));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

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

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
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

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row10Struct other) {

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

	public static class nbr_lignes_portail_frnsStruct
			implements routines.system.IPersistableRow<nbr_lignes_portail_frnsStruct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",EAN=" + String.valueOf(EAN));
			sb.append(",DATE_DEBUT=" + DATE_DEBUT);
			sb.append(",DATE_FIN=" + DATE_FIN);
			sb.append(",CODEENSEIGNE=" + String.valueOf(CODEENSEIGNE));
			sb.append(",CODE_ARTICLE=" + String.valueOf(CODE_ARTICLE));
			sb.append(",QTE=" + String.valueOf(QTE));
			sb.append(",CA_TTC=" + String.valueOf(CA_TTC));
			sb.append(",CA_HT=" + String.valueOf(CA_HT));
			sb.append(",DateLastUpdateWebJob=" + String.valueOf(DateLastUpdateWebJob));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

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

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
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

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(nbr_lignes_portail_frnsStruct other) {

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

	public static class OUT_AZUREStruct implements routines.system.IPersistableRow<OUT_AZUREStruct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",EAN=" + String.valueOf(EAN));
			sb.append(",DATE_DEBUT=" + DATE_DEBUT);
			sb.append(",DATE_FIN=" + DATE_FIN);
			sb.append(",CODEENSEIGNE=" + String.valueOf(CODEENSEIGNE));
			sb.append(",CODE_ARTICLE=" + String.valueOf(CODE_ARTICLE));
			sb.append(",QTE=" + String.valueOf(QTE));
			sb.append(",CA_TTC=" + String.valueOf(CA_TTC));
			sb.append(",CA_HT=" + String.valueOf(CA_HT));
			sb.append(",DateLastUpdateWebJob=" + String.valueOf(DateLastUpdateWebJob));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

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

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
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

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OUT_AZUREStruct other) {

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

	public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Long CODE_INTERNE_ARTICLE;

		public Long getCODE_INTERNE_ARTICLE() {
			return this.CODE_INTERNE_ARTICLE;
		}

		public Long CODESITE;

		public Long getCODESITE() {
			return this.CODESITE;
		}

		public Long EAN;

		public Long getEAN() {
			return this.EAN;
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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

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

					length = dis.readByte();
					if (length == -1) {
						this.EAN = null;
					} else {
						this.EAN = dis.readLong();
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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

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

				// Long

				if (this.EAN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.EAN);
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

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CODE_INTERNE_ARTICLE=" + String.valueOf(CODE_INTERNE_ARTICLE));
			sb.append(",CODESITE=" + String.valueOf(CODESITE));
			sb.append(",EAN=" + String.valueOf(EAN));
			sb.append(",DATE_DEBUT=" + DATE_DEBUT);
			sb.append(",DATE_FIN=" + DATE_FIN);
			sb.append(",CODEENSEIGNE=" + String.valueOf(CODEENSEIGNE));
			sb.append(",CODE_ARTICLE=" + String.valueOf(CODE_ARTICLE));
			sb.append(",QTE=" + String.valueOf(QTE));
			sb.append(",CA_TTC=" + String.valueOf(CA_TTC));
			sb.append(",CA_HT=" + String.valueOf(CA_HT));
			sb.append(",DateLastUpdateWebJob=" + String.valueOf(DateLastUpdateWebJob));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

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

			if (EAN == null) {
				sb.append("<null>");
			} else {
				sb.append(EAN);
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

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row2Struct other) {

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

	public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

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

				row2Struct row2 = new row2Struct();
				OUT_AZUREStruct OUT_AZURE = new OUT_AZUREStruct();
				nbr_lignes_portail_frnsStruct nbr_lignes_portail_frns = new nbr_lignes_portail_frnsStruct();
				nbr_lignes_portail_frnsStruct row10 = nbr_lignes_portail_frns;

				/**
				 * [tDBOutput_2 begin ] start
				 */

				ok_Hash.put("tDBOutput_2", false);
				start_Hash.put("tDBOutput_2", System.currentTimeMillis());

				currentComponent = "tDBOutput_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row10");

				int tos_count_tDBOutput_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBOutput_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBOutput_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBOutput_2 = new StringBuilder();
							log4jParamters_tDBOutput_2.append("Parameters:");
							log4jParamters_tDBOutput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("CONNECTION" + " = " + "tDBConnection_1");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("TABLE" + " = " + "\"VenteHebdoTTest\"");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("TABLE_ACTION" + " = " + "TRUNCATE");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("IDENTITY_INSERT" + " = " + "false");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("DATA_ACTION" + " = " + "INSERT");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("DIE_ON_ERROR" + " = " + "false");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("ADD_COLS" + " = " + "[]");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("USE_FIELD_OPTIONS" + " = " + "true");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("FIELD_OPTIONS" + " = " + "[{UPDATE_KEY=" + ("true")
									+ ", DELETE_KEY=" + ("false") + ", UPDATABLE=" + ("true") + ", INSERTABLE="
									+ ("true") + ", SCHEMA_COLUMN=" + ("CODE_INTERNE_ARTICLE") + "}, {UPDATE_KEY="
									+ ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE=" + ("true")
									+ ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("CODESITE") + "}, {UPDATE_KEY="
									+ ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE=" + ("true")
									+ ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("EAN") + "}, {UPDATE_KEY="
									+ ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE=" + ("true")
									+ ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("DATE_DEBUT")
									+ "}, {UPDATE_KEY=" + ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE="
									+ ("true") + ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("DATE_FIN")
									+ "}, {UPDATE_KEY=" + ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE="
									+ ("true") + ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("CODEENSEIGNE")
									+ "}, {UPDATE_KEY=" + ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE="
									+ ("true") + ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("CODE_ARTICLE")
									+ "}, {UPDATE_KEY=" + ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE="
									+ ("true") + ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("QTE")
									+ "}, {UPDATE_KEY=" + ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE="
									+ ("true") + ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("CA_TTC")
									+ "}, {UPDATE_KEY=" + ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE="
									+ ("true") + ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN=" + ("CA_HT")
									+ "}, {UPDATE_KEY=" + ("false") + ", DELETE_KEY=" + ("false") + ", UPDATABLE="
									+ ("true") + ", INSERTABLE=" + ("true") + ", SCHEMA_COLUMN="
									+ ("DateLastUpdateWebJob") + "}]");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("IGNORE_DATE_OUTOF_RANGE" + " = " + "false");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("ENABLE_DEBUG_MODE" + " = " + "false");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("SUPPORT_NULL_WHERE" + " = " + "false");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("USE_BATCH_SIZE" + " = " + "true");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("BATCH_SIZE" + " = " + "50000");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBOutput_2.append(" | ");
							log4jParamters_tDBOutput_2.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlOutput");
							log4jParamters_tDBOutput_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBOutput_2 - " + (log4jParamters_tDBOutput_2));
						}
					}
					new BytesLimit65535_tDBOutput_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_2", "PORTAIL_FOURNISSEUR_AZURE", "tMSSqlOutput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBOutput_2 = 0;
				int nb_line_update_tDBOutput_2 = 0;
				int nb_line_inserted_tDBOutput_2 = 0;
				int nb_line_deleted_tDBOutput_2 = 0;
				int nb_line_rejected_tDBOutput_2 = 0;

				int deletedCount_tDBOutput_2 = 0;
				int updatedCount_tDBOutput_2 = 0;
				int insertedCount_tDBOutput_2 = 0;
				int rowsToCommitCount_tDBOutput_2 = 0;
				int rejectedCount_tDBOutput_2 = 0;
				String dbschema_tDBOutput_2 = null;
				String tableName_tDBOutput_2 = null;
				boolean whetherReject_tDBOutput_2 = false;

				java.util.Calendar calendar_tDBOutput_2 = java.util.Calendar.getInstance();
				long year1_tDBOutput_2 = TalendDate.parseDate("yyyy-MM-dd", "0001-01-01").getTime();
				long year2_tDBOutput_2 = TalendDate.parseDate("yyyy-MM-dd", "1753-01-01").getTime();
				long year10000_tDBOutput_2 = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss", "9999-12-31 24:00:00")
						.getTime();
				long date_tDBOutput_2;

				java.util.Calendar calendar_datetimeoffset_tDBOutput_2 = java.util.Calendar
						.getInstance(java.util.TimeZone.getTimeZone("UTC"));

				java.sql.Connection conn_tDBOutput_2 = null;
				String dbUser_tDBOutput_2 = null;
				dbschema_tDBOutput_2 = (String) globalMap.get("dbschema_tDBConnection_1");

				conn_tDBOutput_2 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");

				if (log.isDebugEnabled())
					log.debug("tDBOutput_2 - " + ("Uses an existing connection with username '")
							+ (conn_tDBOutput_2.getMetaData().getUserName()) + ("'. Connection URL: ")
							+ (conn_tDBOutput_2.getMetaData().getURL()) + ("."));
				if (log.isDebugEnabled())
					log.debug("tDBOutput_2 - " + ("Connection is set auto commit to '")
							+ (conn_tDBOutput_2.getAutoCommit()) + ("'."));
				int batchSize_tDBOutput_2 = 50000;
				int batchSizeCounter_tDBOutput_2 = 0;

				if (dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
					tableName_tDBOutput_2 = "VenteHebdoTTest";
				} else {
					tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "].[" + "VenteHebdoTTest";
				}
				int count_tDBOutput_2 = 0;

				int rsTruncCountNumber_tDBOutput_2 = 0;
				try (java.sql.Statement stmtTruncCount_tDBOutput_2 = conn_tDBOutput_2.createStatement()) {
					try (java.sql.ResultSet rsTruncCount_tDBOutput_2 = stmtTruncCount_tDBOutput_2
							.executeQuery("SELECT COUNT(1) FROM [" + tableName_tDBOutput_2 + "]")) {
						if (rsTruncCount_tDBOutput_2.next()) {
							rsTruncCountNumber_tDBOutput_2 = rsTruncCount_tDBOutput_2.getInt(1);
						}
					}
				}
				try (java.sql.Statement stmtTrunc_tDBOutput_2 = conn_tDBOutput_2.createStatement()) {
					if (log.isDebugEnabled())
						log.debug("tDBOutput_2 - " + ("Truncating") + (" table '") + ("[" + tableName_tDBOutput_2 + "]")
								+ ("'."));
					stmtTrunc_tDBOutput_2.executeUpdate("TRUNCATE TABLE [" + tableName_tDBOutput_2 + "]");
					if (log.isDebugEnabled())
						log.debug("tDBOutput_2 - " + ("Truncate") + (" table '") + ("[" + tableName_tDBOutput_2 + "]")
								+ ("' has succeeded."));
					deletedCount_tDBOutput_2 += rsTruncCountNumber_tDBOutput_2;
				}
				java.sql.PreparedStatement pstmt_tDBOutput_2 = null;
				java.sql.PreparedStatement pstmtInsert_tDBOutput_2 = null;
				java.sql.PreparedStatement pstmtUpdate_tDBOutput_2 = null;
				String insert_tDBOutput_2 = "INSERT INTO [" + tableName_tDBOutput_2
						+ "] ([CODE_INTERNE_ARTICLE],[CODESITE],[EAN],[DATE_DEBUT],[DATE_FIN],[CODEENSEIGNE],[CODE_ARTICLE],[QTE],[CA_TTC],[CA_HT],[DateLastUpdateWebJob]) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
				pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
				resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);

				boolean isShareIdentity_tDBOutput_2 = globalMap.get("shareIdentitySetting_tDBConnection_1") != null
						&& (Boolean) globalMap.get("shareIdentitySetting_tDBConnection_1") == true;

				/**
				 * [tDBOutput_2 begin ] stop
				 */

				/**
				 * [tFlowMeter_15 begin ] start
				 */

				ok_Hash.put("tFlowMeter_15", false);
				start_Hash.put("tFlowMeter_15", System.currentTimeMillis());

				currentComponent = "tFlowMeter_15";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0,
						"nbr_lignes_portail_frns");

				int tos_count_tFlowMeter_15 = 0;

				if (log.isDebugEnabled())
					log.debug("tFlowMeter_15 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFlowMeter_15 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFlowMeter_15 = new StringBuilder();
							log4jParamters_tFlowMeter_15.append("Parameters:");
							log4jParamters_tFlowMeter_15.append("USEROWLABEL" + " = " + "false");
							log4jParamters_tFlowMeter_15.append(" | ");
							log4jParamters_tFlowMeter_15.append("METTERLABEL" + " = " + "\"Nbr_Fournisseur\"");
							log4jParamters_tFlowMeter_15.append(" | ");
							log4jParamters_tFlowMeter_15.append("ABSOLUTE" + " = " + "Relative");
							log4jParamters_tFlowMeter_15.append(" | ");
							log4jParamters_tFlowMeter_15.append("CONNECTIONS" + " = " + "Nbr_lignes_gold");
							log4jParamters_tFlowMeter_15.append(" | ");
							log4jParamters_tFlowMeter_15.append("THRESHLODS" + " = " + "[]");
							log4jParamters_tFlowMeter_15.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFlowMeter_15 - " + (log4jParamters_tFlowMeter_15));
						}
					}
					new BytesLimit65535_tFlowMeter_15().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFlowMeter_15", "tFlowMeter_15", "tFlowMeter");
					talendJobLogProcess(globalMap);
				}

				int count_tFlowMeter_15 = 0;

				/**
				 * [tFlowMeter_15 begin ] stop
				 */

				/**
				 * [tUniqRow_1 begin ] start
				 */

				ok_Hash.put("tUniqRow_1", false);
				start_Hash.put("tUniqRow_1", System.currentTimeMillis());

				currentComponent = "tUniqRow_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "OUT_AZURE");

				int tos_count_tUniqRow_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tUniqRow_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tUniqRow_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tUniqRow_1 = new StringBuilder();
							log4jParamters_tUniqRow_1.append("Parameters:");
							log4jParamters_tUniqRow_1.append("UNIQUE_KEY" + " = " + "[{CASE_SENSITIVE=" + ("false")
									+ ", KEY_ATTRIBUTE=" + ("true") + ", SCHEMA_COLUMN=" + ("CODE_INTERNE_ARTICLE")
									+ "}, {CASE_SENSITIVE=" + ("false") + ", KEY_ATTRIBUTE=" + ("true")
									+ ", SCHEMA_COLUMN=" + ("CODESITE") + "}, {CASE_SENSITIVE=" + ("false")
									+ ", KEY_ATTRIBUTE=" + ("true") + ", SCHEMA_COLUMN=" + ("EAN")
									+ "}, {CASE_SENSITIVE=" + ("false") + ", KEY_ATTRIBUTE=" + ("true")
									+ ", SCHEMA_COLUMN=" + ("DATE_DEBUT") + "}, {CASE_SENSITIVE=" + ("false")
									+ ", KEY_ATTRIBUTE=" + ("true") + ", SCHEMA_COLUMN=" + ("DATE_FIN")
									+ "}, {CASE_SENSITIVE=" + ("false") + ", KEY_ATTRIBUTE=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CODEENSEIGNE") + "}, {CASE_SENSITIVE=" + ("false")
									+ ", KEY_ATTRIBUTE=" + ("false") + ", SCHEMA_COLUMN=" + ("CODE_ARTICLE")
									+ "}, {CASE_SENSITIVE=" + ("false") + ", KEY_ATTRIBUTE=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("QTE") + "}, {CASE_SENSITIVE=" + ("false")
									+ ", KEY_ATTRIBUTE=" + ("false") + ", SCHEMA_COLUMN=" + ("CA_TTC")
									+ "}, {CASE_SENSITIVE=" + ("false") + ", KEY_ATTRIBUTE=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CA_HT") + "}, {CASE_SENSITIVE=" + ("false")
									+ ", KEY_ATTRIBUTE=" + ("false") + ", SCHEMA_COLUMN=" + ("DateLastUpdateWebJob")
									+ "}]");
							log4jParamters_tUniqRow_1.append(" | ");
							log4jParamters_tUniqRow_1.append("ONLY_ONCE_EACH_DUPLICATED_KEY" + " = " + "false");
							log4jParamters_tUniqRow_1.append(" | ");
							log4jParamters_tUniqRow_1.append("IS_VIRTUAL_COMPONENT" + " = " + "false");
							log4jParamters_tUniqRow_1.append(" | ");
							log4jParamters_tUniqRow_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "false");
							log4jParamters_tUniqRow_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tUniqRow_1 - " + (log4jParamters_tUniqRow_1));
						}
					}
					new BytesLimit65535_tUniqRow_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tUniqRow_1", "tUniqRow_1", "tUniqRow");
					talendJobLogProcess(globalMap);
				}

				class KeyStruct_tUniqRow_1 {

					private static final int DEFAULT_HASHCODE = 1;
					private static final int PRIME = 31;
					private int hashCode = DEFAULT_HASHCODE;
					public boolean hashCodeDirty = true;

					Long CODE_INTERNE_ARTICLE;
					Long CODESITE;
					Long EAN;
					String DATE_DEBUT;
					String DATE_FIN;

					@Override
					public int hashCode() {
						if (this.hashCodeDirty) {
							final int prime = PRIME;
							int result = DEFAULT_HASHCODE;

							result = prime * result
									+ ((this.CODE_INTERNE_ARTICLE == null) ? 0 : this.CODE_INTERNE_ARTICLE.hashCode());

							result = prime * result + ((this.CODESITE == null) ? 0 : this.CODESITE.hashCode());

							result = prime * result + ((this.EAN == null) ? 0 : this.EAN.hashCode());

							result = prime * result + ((this.DATE_DEBUT == null) ? 0 : this.DATE_DEBUT.hashCode());

							result = prime * result + ((this.DATE_FIN == null) ? 0 : this.DATE_FIN.hashCode());

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
						final KeyStruct_tUniqRow_1 other = (KeyStruct_tUniqRow_1) obj;

						if (this.CODE_INTERNE_ARTICLE == null) {
							if (other.CODE_INTERNE_ARTICLE != null)
								return false;

						} else if (!this.CODE_INTERNE_ARTICLE.equals(other.CODE_INTERNE_ARTICLE))

							return false;

						if (this.CODESITE == null) {
							if (other.CODESITE != null)
								return false;

						} else if (!this.CODESITE.equals(other.CODESITE))

							return false;

						if (this.EAN == null) {
							if (other.EAN != null)
								return false;

						} else if (!this.EAN.equals(other.EAN))

							return false;

						if (this.DATE_DEBUT == null) {
							if (other.DATE_DEBUT != null)
								return false;

						} else if (!this.DATE_DEBUT.equals(other.DATE_DEBUT))

							return false;

						if (this.DATE_FIN == null) {
							if (other.DATE_FIN != null)
								return false;

						} else if (!this.DATE_FIN.equals(other.DATE_FIN))

							return false;

						return true;
					}

				}

				int nb_uniques_tUniqRow_1 = 0;
				int nb_duplicates_tUniqRow_1 = 0;
				log.debug("tUniqRow_1 - Start to process the data from datasource.");
				KeyStruct_tUniqRow_1 finder_tUniqRow_1 = new KeyStruct_tUniqRow_1();
				java.util.Set<KeyStruct_tUniqRow_1> keystUniqRow_1 = new java.util.HashSet<KeyStruct_tUniqRow_1>();

				/**
				 * [tUniqRow_1 begin ] stop
				 */

				/**
				 * [tMap_2 begin ] start
				 */

				ok_Hash.put("tMap_2", false);
				start_Hash.put("tMap_2", System.currentTimeMillis());

				currentComponent = "tMap_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row2");

				int tos_count_tMap_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_2 = new StringBuilder();
							log4jParamters_tMap_2.append("Parameters:");
							log4jParamters_tMap_2.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_2.append(" | ");
							log4jParamters_tMap_2.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_2.append(" | ");
							log4jParamters_tMap_2.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_2.append(" | ");
							log4jParamters_tMap_2.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_2 - " + (log4jParamters_tMap_2));
						}
					}
					new BytesLimit65535_tMap_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_2", "tMap_2", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row2_tMap_2 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_2__Struct {
				}
				Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_OUT_AZURE_tMap_2 = 0;

				OUT_AZUREStruct OUT_AZURE_tmp = new OUT_AZUREStruct();
// ###############################

				/**
				 * [tMap_2 begin ] stop
				 */

				/**
				 * [tDBInput_2 begin ] start
				 */

				ok_Hash.put("tDBInput_2", false);
				start_Hash.put("tDBInput_2", System.currentTimeMillis());

				currentComponent = "tDBInput_2";

				int tos_count_tDBInput_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_2 = new StringBuilder();
							log4jParamters_tDBInput_2.append("Parameters:");
							log4jParamters_tDBInput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("CONNECTION" + " = " + "tDBConnection_3");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("QUERY" + " = "
									+ "\"SELECT      CODE_INTERNE_ARTICLE,      CODESITE,  	EAN,       DATE_DEBUT,   	DATE_FIN,       CODEENSEIGNE,   	CODE_ARTICLE,   	QTE,   	CA_TTC,      CA_HT,  	DATELASTUPDATEWEBJOB    FROM ODS_VENTE_HEBDO  \"");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("IS_CONVERT_XMLTYPE" + " = " + "false");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("USE_CURSOR" + " = " + "false");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CODE_INTERNE_ARTICLE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CODESITE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("EAN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DATE_DEBUT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DATE_FIN") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CODEENSEIGNE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CODE_ARTICLE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("QTE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CA_TTC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CA_HT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DateLastUpdateWebJob") + "}]");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("NO_NULL_VALUES" + " = " + "false");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
							log4jParamters_tDBInput_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_2 - " + (log4jParamters_tDBInput_2));
						}
					}
					new BytesLimit65535_tDBInput_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_2", "ORACLE_ODS", "tOracleInput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_2 = 0;
				java.sql.Connection conn_tDBInput_2 = null;
				conn_tDBInput_2 = (java.sql.Connection) globalMap.get("conn_tDBConnection_3");

				if (conn_tDBInput_2 != null) {
					if (conn_tDBInput_2.getMetaData() != null) {

						log.debug("tDBInput_2 - Uses an existing connection with username '"
								+ conn_tDBInput_2.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBInput_2.getMetaData().getURL() + ".");

					}
				}

				boolean isTimeZoneNull_tDBInput_2 = false;
				boolean isConnectionWrapped_tDBInput_2 = !(conn_tDBInput_2 instanceof oracle.jdbc.OracleConnection)
						&& conn_tDBInput_2.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_2 = null;
				if (isConnectionWrapped_tDBInput_2) {
					unwrappedOraConn_tDBInput_2 = conn_tDBInput_2.unwrap(oracle.jdbc.OracleConnection.class);
					if (unwrappedOraConn_tDBInput_2 != null) {
						isTimeZoneNull_tDBInput_2 = (unwrappedOraConn_tDBInput_2.getSessionTimeZone() == null);
					}
				} else {
					isTimeZoneNull_tDBInput_2 = (((oracle.jdbc.OracleConnection) conn_tDBInput_2)
							.getSessionTimeZone() == null);
				}

				if (isTimeZoneNull_tDBInput_2) {
					java.sql.Statement stmtGetTZ_tDBInput_2 = conn_tDBInput_2.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_2 = stmtGetTZ_tDBInput_2
							.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_2 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_2.next()) {
						sessionTimezone_tDBInput_2 = rsGetTZ_tDBInput_2.getString(1);
					}
					if (isConnectionWrapped_tDBInput_2 && unwrappedOraConn_tDBInput_2 != null) {
						unwrappedOraConn_tDBInput_2.setSessionTimeZone(sessionTimezone_tDBInput_2);
					} else {
						((oracle.jdbc.OracleConnection) conn_tDBInput_2).setSessionTimeZone(sessionTimezone_tDBInput_2);
					}
				}

				java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

				String dbquery_tDBInput_2 = "SELECT \n   CODE_INTERNE_ARTICLE,\n    CODESITE,\n	EAN, \n    DATE_DEBUT, \n	DATE_FIN, \n    CODEENSEIGNE, \n	CODE_ARTI"
						+ "CLE, \n	QTE, \n	CA_TTC,\n    CA_HT,\n	DATELASTUPDATEWEBJOB  \nFROM ODS_VENTE_HEBDO\n";

				log.debug("tDBInput_2 - Executing the query: '" + dbquery_tDBInput_2 + "'.");

				globalMap.put("tDBInput_2_QUERY", dbquery_tDBInput_2);
				java.sql.ResultSet rs_tDBInput_2 = null;

				try {
					rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
					java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
					int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

					String tmpContent_tDBInput_2 = null;

					log.debug("tDBInput_2 - Retrieving records from the database.");

					while (rs_tDBInput_2.next()) {
						nb_line_tDBInput_2++;

						if (colQtyInRs_tDBInput_2 < 1) {
							row2.CODE_INTERNE_ARTICLE = null;
						} else {

							if (rs_tDBInput_2.getObject(1) != null) {
								row2.CODE_INTERNE_ARTICLE = rs_tDBInput_2.getLong(1);
							} else {

								row2.CODE_INTERNE_ARTICLE = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 2) {
							row2.CODESITE = null;
						} else {

							if (rs_tDBInput_2.getObject(2) != null) {
								row2.CODESITE = rs_tDBInput_2.getLong(2);
							} else {

								row2.CODESITE = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 3) {
							row2.EAN = null;
						} else {

							if (rs_tDBInput_2.getObject(3) != null) {
								row2.EAN = rs_tDBInput_2.getLong(3);
							} else {

								row2.EAN = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 4) {
							row2.DATE_DEBUT = null;
						} else {

							row2.DATE_DEBUT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
						}
						if (colQtyInRs_tDBInput_2 < 5) {
							row2.DATE_FIN = null;
						} else {

							row2.DATE_FIN = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
						}
						if (colQtyInRs_tDBInput_2 < 6) {
							row2.CODEENSEIGNE = null;
						} else {

							if (rs_tDBInput_2.getObject(6) != null) {
								row2.CODEENSEIGNE = rs_tDBInput_2.getLong(6);
							} else {

								row2.CODEENSEIGNE = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 7) {
							row2.CODE_ARTICLE = null;
						} else {

							if (rs_tDBInput_2.getObject(7) != null) {
								row2.CODE_ARTICLE = rs_tDBInput_2.getLong(7);
							} else {

								row2.CODE_ARTICLE = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 8) {
							row2.QTE = null;
						} else {

							if (rs_tDBInput_2.getObject(8) != null) {
								row2.QTE = rs_tDBInput_2.getBigDecimal(8);
							} else {

								row2.QTE = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 9) {
							row2.CA_TTC = null;
						} else {

							if (rs_tDBInput_2.getObject(9) != null) {
								row2.CA_TTC = rs_tDBInput_2.getBigDecimal(9);
							} else {

								row2.CA_TTC = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 10) {
							row2.CA_HT = null;
						} else {

							if (rs_tDBInput_2.getObject(10) != null) {
								row2.CA_HT = rs_tDBInput_2.getBigDecimal(10);
							} else {

								row2.CA_HT = null;
							}
						}
						if (colQtyInRs_tDBInput_2 < 11) {
							row2.DateLastUpdateWebJob = null;
						} else {

							row2.DateLastUpdateWebJob = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 11);
						}

						log.debug("tDBInput_2 - Retrieving the record " + nb_line_tDBInput_2 + ".");

						/**
						 * [tDBInput_2 begin ] stop
						 */

						/**
						 * [tDBInput_2 main ] start
						 */

						currentComponent = "tDBInput_2";

						tos_count_tDBInput_2++;

						/**
						 * [tDBInput_2 main ] stop
						 */

						/**
						 * [tDBInput_2 process_data_begin ] start
						 */

						currentComponent = "tDBInput_2";

						/**
						 * [tDBInput_2 process_data_begin ] stop
						 */

						/**
						 * [tMap_2 main ] start
						 */

						currentComponent = "tMap_2";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row2", "tDBInput_2", "ORACLE_ODS", "tOracleInput", "tMap_2", "tMap_2", "tMap"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row2 - " + (row2 == null ? "" : row2.toLogString()));
						}

						boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;

						// ###############################
						// # Input tables (lookups)
						boolean rejectedInnerJoin_tMap_2 = false;
						boolean mainRowRejected_tMap_2 = false;

						// ###############################
						{ // start of Var scope

							// ###############################
							// # Vars tables

							Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
							// ###############################
							// # Output tables

							OUT_AZURE = null;

// # Output table : 'OUT_AZURE'
							count_OUT_AZURE_tMap_2++;

							OUT_AZURE_tmp.CODE_INTERNE_ARTICLE = row2.CODE_INTERNE_ARTICLE;
							OUT_AZURE_tmp.CODESITE = row2.CODESITE;
							OUT_AZURE_tmp.EAN = row2.EAN;
							OUT_AZURE_tmp.DATE_DEBUT = row2.DATE_DEBUT;
							OUT_AZURE_tmp.DATE_FIN = row2.DATE_FIN;
							OUT_AZURE_tmp.CODEENSEIGNE = row2.CODEENSEIGNE;
							OUT_AZURE_tmp.CODE_ARTICLE = row2.CODE_ARTICLE;
							OUT_AZURE_tmp.QTE = row2.QTE;
							OUT_AZURE_tmp.CA_TTC = row2.CA_TTC;
							OUT_AZURE_tmp.CA_HT = row2.CA_HT;
							OUT_AZURE_tmp.DateLastUpdateWebJob = row2.DateLastUpdateWebJob;
							OUT_AZURE = OUT_AZURE_tmp;
							log.debug("tMap_2 - Outputting the record " + count_OUT_AZURE_tMap_2
									+ " of the output table 'OUT_AZURE'.");

// ###############################

						} // end of Var scope

						rejectedInnerJoin_tMap_2 = false;

						tos_count_tMap_2++;

						/**
						 * [tMap_2 main ] stop
						 */

						/**
						 * [tMap_2 process_data_begin ] start
						 */

						currentComponent = "tMap_2";

						/**
						 * [tMap_2 process_data_begin ] stop
						 */
// Start of branch "OUT_AZURE"
						if (OUT_AZURE != null) {

							/**
							 * [tUniqRow_1 main ] start
							 */

							currentComponent = "tUniqRow_1";

							if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

									, "OUT_AZURE", "tMap_2", "tMap_2", "tMap", "tUniqRow_1", "tUniqRow_1", "tUniqRow"

							)) {
								talendJobLogProcess(globalMap);
							}

							if (log.isTraceEnabled()) {
								log.trace("OUT_AZURE - " + (OUT_AZURE == null ? "" : OUT_AZURE.toLogString()));
							}

							nbr_lignes_portail_frns = null;
							finder_tUniqRow_1.CODE_INTERNE_ARTICLE = OUT_AZURE.CODE_INTERNE_ARTICLE;
							finder_tUniqRow_1.CODESITE = OUT_AZURE.CODESITE;
							finder_tUniqRow_1.EAN = OUT_AZURE.EAN;
							if (OUT_AZURE.DATE_DEBUT == null) {
								finder_tUniqRow_1.DATE_DEBUT = null;
							} else {
								finder_tUniqRow_1.DATE_DEBUT = OUT_AZURE.DATE_DEBUT.toLowerCase();
							}
							if (OUT_AZURE.DATE_FIN == null) {
								finder_tUniqRow_1.DATE_FIN = null;
							} else {
								finder_tUniqRow_1.DATE_FIN = OUT_AZURE.DATE_FIN.toLowerCase();
							}
							finder_tUniqRow_1.hashCodeDirty = true;
							if (!keystUniqRow_1.contains(finder_tUniqRow_1)) {
								KeyStruct_tUniqRow_1 new_tUniqRow_1 = new KeyStruct_tUniqRow_1();

								new_tUniqRow_1.CODE_INTERNE_ARTICLE = OUT_AZURE.CODE_INTERNE_ARTICLE;
								new_tUniqRow_1.CODESITE = OUT_AZURE.CODESITE;
								new_tUniqRow_1.EAN = OUT_AZURE.EAN;
								if (OUT_AZURE.DATE_DEBUT == null) {
									new_tUniqRow_1.DATE_DEBUT = null;
								} else {
									new_tUniqRow_1.DATE_DEBUT = OUT_AZURE.DATE_DEBUT.toLowerCase();
								}
								if (OUT_AZURE.DATE_FIN == null) {
									new_tUniqRow_1.DATE_FIN = null;
								} else {
									new_tUniqRow_1.DATE_FIN = OUT_AZURE.DATE_FIN.toLowerCase();
								}

								keystUniqRow_1.add(new_tUniqRow_1);
								if (nbr_lignes_portail_frns == null) {

									log.trace("tUniqRow_1 - Writing the unique record " + (nb_uniques_tUniqRow_1 + 1)
											+ " into nbr_lignes_portail_frns.");

									nbr_lignes_portail_frns = new nbr_lignes_portail_frnsStruct();
								}
								nbr_lignes_portail_frns.CODE_INTERNE_ARTICLE = OUT_AZURE.CODE_INTERNE_ARTICLE;
								nbr_lignes_portail_frns.CODESITE = OUT_AZURE.CODESITE;
								nbr_lignes_portail_frns.EAN = OUT_AZURE.EAN;
								nbr_lignes_portail_frns.DATE_DEBUT = OUT_AZURE.DATE_DEBUT;
								nbr_lignes_portail_frns.DATE_FIN = OUT_AZURE.DATE_FIN;
								nbr_lignes_portail_frns.CODEENSEIGNE = OUT_AZURE.CODEENSEIGNE;
								nbr_lignes_portail_frns.CODE_ARTICLE = OUT_AZURE.CODE_ARTICLE;
								nbr_lignes_portail_frns.QTE = OUT_AZURE.QTE;
								nbr_lignes_portail_frns.CA_TTC = OUT_AZURE.CA_TTC;
								nbr_lignes_portail_frns.CA_HT = OUT_AZURE.CA_HT;
								nbr_lignes_portail_frns.DateLastUpdateWebJob = OUT_AZURE.DateLastUpdateWebJob;
								nb_uniques_tUniqRow_1++;
							} else {
								nb_duplicates_tUniqRow_1++;
							}

							tos_count_tUniqRow_1++;

							/**
							 * [tUniqRow_1 main ] stop
							 */

							/**
							 * [tUniqRow_1 process_data_begin ] start
							 */

							currentComponent = "tUniqRow_1";

							/**
							 * [tUniqRow_1 process_data_begin ] stop
							 */
// Start of branch "nbr_lignes_portail_frns"
							if (nbr_lignes_portail_frns != null) {

								/**
								 * [tFlowMeter_15 main ] start
								 */

								currentComponent = "tFlowMeter_15";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "nbr_lignes_portail_frns", "tUniqRow_1", "tUniqRow_1", "tUniqRow",
										"tFlowMeter_15", "tFlowMeter_15", "tFlowMeter"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("nbr_lignes_portail_frns - " + (nbr_lignes_portail_frns == null ? ""
											: nbr_lignes_portail_frns.toLogString()));
								}

								count_tFlowMeter_15++;

								row10 = nbr_lignes_portail_frns;

								tos_count_tFlowMeter_15++;

								/**
								 * [tFlowMeter_15 main ] stop
								 */

								/**
								 * [tFlowMeter_15 process_data_begin ] start
								 */

								currentComponent = "tFlowMeter_15";

								/**
								 * [tFlowMeter_15 process_data_begin ] stop
								 */

								/**
								 * [tDBOutput_2 main ] start
								 */

								currentComponent = "tDBOutput_2";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row10", "tFlowMeter_15", "tFlowMeter_15", "tFlowMeter", "tDBOutput_2",
										"PORTAIL_FOURNISSEUR_AZURE", "tMSSqlOutput"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row10 - " + (row10 == null ? "" : row10.toLogString()));
								}

								whetherReject_tDBOutput_2 = false;
								if (row10.CODE_INTERNE_ARTICLE == null) {
									pstmt_tDBOutput_2.setNull(1, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_2.setLong(1, row10.CODE_INTERNE_ARTICLE);
								}

								if (row10.CODESITE == null) {
									pstmt_tDBOutput_2.setNull(2, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_2.setLong(2, row10.CODESITE);
								}

								if (row10.EAN == null) {
									pstmt_tDBOutput_2.setNull(3, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_2.setLong(3, row10.EAN);
								}

								if (row10.DATE_DEBUT == null) {
									pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
								} else {
									pstmt_tDBOutput_2.setString(4, row10.DATE_DEBUT);
								}

								if (row10.DATE_FIN == null) {
									pstmt_tDBOutput_2.setNull(5, java.sql.Types.VARCHAR);
								} else {
									pstmt_tDBOutput_2.setString(5, row10.DATE_FIN);
								}

								if (row10.CODEENSEIGNE == null) {
									pstmt_tDBOutput_2.setNull(6, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_2.setLong(6, row10.CODEENSEIGNE);
								}

								if (row10.CODE_ARTICLE == null) {
									pstmt_tDBOutput_2.setNull(7, java.sql.Types.INTEGER);
								} else {
									pstmt_tDBOutput_2.setLong(7, row10.CODE_ARTICLE);
								}

								pstmt_tDBOutput_2.setBigDecimal(8, row10.QTE);

								pstmt_tDBOutput_2.setBigDecimal(9, row10.CA_TTC);

								pstmt_tDBOutput_2.setBigDecimal(10, row10.CA_HT);

								if (row10.DateLastUpdateWebJob != null) {
									pstmt_tDBOutput_2.setTimestamp(11,
											new java.sql.Timestamp(row10.DateLastUpdateWebJob.getTime()));
								} else {
									pstmt_tDBOutput_2.setNull(11, java.sql.Types.TIMESTAMP);
								}

								pstmt_tDBOutput_2.addBatch();
								nb_line_tDBOutput_2++;

								if (log.isDebugEnabled())
									log.debug("tDBOutput_2 - " + ("Adding the record ") + (nb_line_tDBOutput_2)
											+ (" to the ") + ("INSERT") + (" batch."));
								batchSizeCounter_tDBOutput_2++;

								if (!whetherReject_tDBOutput_2) {
								}
								////////// batch execute by batch size///////
								class LimitBytesHelper_tDBOutput_2 {
									public int limitBytePart1(int counter, java.sql.PreparedStatement pstmt_tDBOutput_2)
											throws Exception {
										try {

											if (log.isDebugEnabled())
												log.debug("tDBOutput_2 - " + ("Executing the ") + ("INSERT")
														+ (" batch."));
											for (int countEach_tDBOutput_2 : pstmt_tDBOutput_2.executeBatch()) {
												if (countEach_tDBOutput_2 == -2 || countEach_tDBOutput_2 == -3) {
													break;
												}
												counter += countEach_tDBOutput_2;
											}

											if (log.isDebugEnabled())
												log.debug("tDBOutput_2 - " + ("The ") + ("INSERT")
														+ (" batch execution has succeeded."));
										} catch (java.sql.BatchUpdateException e) {
											globalMap.put("tDBOutput_2_ERROR_MESSAGE", e.getMessage());

											int countSum_tDBOutput_2 = 0;
											for (int countEach_tDBOutput_2 : e.getUpdateCounts()) {
												counter += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
											}

											log.error("tDBOutput_2 - " + (e.getMessage()));
											System.err.println(e.getMessage());

										}
										return counter;
									}

									public int limitBytePart2(int counter, java.sql.PreparedStatement pstmt_tDBOutput_2)
											throws Exception {
										try {

											if (log.isDebugEnabled())
												log.debug("tDBOutput_2 - " + ("Executing the ") + ("INSERT")
														+ (" batch."));
											for (int countEach_tDBOutput_2 : pstmt_tDBOutput_2.executeBatch()) {
												if (countEach_tDBOutput_2 == -2 || countEach_tDBOutput_2 == -3) {
													break;
												}
												counter += countEach_tDBOutput_2;
											}

											if (log.isDebugEnabled())
												log.debug("tDBOutput_2 - " + ("The ") + ("INSERT")
														+ (" batch execution has succeeded."));
										} catch (java.sql.BatchUpdateException e) {
											globalMap.put("tDBOutput_2_ERROR_MESSAGE", e.getMessage());

											for (int countEach_tDBOutput_2 : e.getUpdateCounts()) {
												counter += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
											}

											log.error("tDBOutput_2 - " + (e.getMessage()));
											System.err.println(e.getMessage());

										}
										return counter;
									}
								}
								if ((batchSize_tDBOutput_2 > 0)
										&& (batchSize_tDBOutput_2 <= batchSizeCounter_tDBOutput_2)) {

									insertedCount_tDBOutput_2 = new LimitBytesHelper_tDBOutput_2()
											.limitBytePart1(insertedCount_tDBOutput_2, pstmt_tDBOutput_2);
									rowsToCommitCount_tDBOutput_2 = insertedCount_tDBOutput_2;

									batchSizeCounter_tDBOutput_2 = 0;
								}

								//////////// commit every////////////

								tos_count_tDBOutput_2++;

								/**
								 * [tDBOutput_2 main ] stop
								 */

								/**
								 * [tDBOutput_2 process_data_begin ] start
								 */

								currentComponent = "tDBOutput_2";

								/**
								 * [tDBOutput_2 process_data_begin ] stop
								 */

								/**
								 * [tDBOutput_2 process_data_end ] start
								 */

								currentComponent = "tDBOutput_2";

								/**
								 * [tDBOutput_2 process_data_end ] stop
								 */

								/**
								 * [tFlowMeter_15 process_data_end ] start
								 */

								currentComponent = "tFlowMeter_15";

								/**
								 * [tFlowMeter_15 process_data_end ] stop
								 */

							} // End of branch "nbr_lignes_portail_frns"

							/**
							 * [tUniqRow_1 process_data_end ] start
							 */

							currentComponent = "tUniqRow_1";

							/**
							 * [tUniqRow_1 process_data_end ] stop
							 */

						} // End of branch "OUT_AZURE"

						/**
						 * [tMap_2 process_data_end ] start
						 */

						currentComponent = "tMap_2";

						/**
						 * [tMap_2 process_data_end ] stop
						 */

						/**
						 * [tDBInput_2 process_data_end ] start
						 */

						currentComponent = "tDBInput_2";

						/**
						 * [tDBInput_2 process_data_end ] stop
						 */

						/**
						 * [tDBInput_2 end ] start
						 */

						currentComponent = "tDBInput_2";

					}
				} finally {
					if (rs_tDBInput_2 != null) {
						rs_tDBInput_2.close();
					}
					if (stmt_tDBInput_2 != null) {
						stmt_tDBInput_2.close();
					}
				}

				globalMap.put("tDBInput_2_NB_LINE", nb_line_tDBInput_2);
				log.debug("tDBInput_2 - Retrieved records count: " + nb_line_tDBInput_2 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_2 - " + ("Done."));

				ok_Hash.put("tDBInput_2", true);
				end_Hash.put("tDBInput_2", System.currentTimeMillis());

				/**
				 * [tDBInput_2 end ] stop
				 */

				/**
				 * [tMap_2 end ] start
				 */

				currentComponent = "tMap_2";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'OUT_AZURE': " + count_OUT_AZURE_tMap_2 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row2", 2, 0,
						"tDBInput_2", "ORACLE_ODS", "tOracleInput", "tMap_2", "tMap_2", "tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_2 - " + ("Done."));

				ok_Hash.put("tMap_2", true);
				end_Hash.put("tMap_2", System.currentTimeMillis());

				/**
				 * [tMap_2 end ] stop
				 */

				/**
				 * [tUniqRow_1 end ] start
				 */

				currentComponent = "tUniqRow_1";

				globalMap.put("tUniqRow_1_NB_UNIQUES", nb_uniques_tUniqRow_1);
				globalMap.put("tUniqRow_1_NB_DUPLICATES", nb_duplicates_tUniqRow_1);
				log.info("tUniqRow_1 - Unique records count: " + (nb_uniques_tUniqRow_1) + " .");
				log.info("tUniqRow_1 - Duplicate records count: " + (nb_duplicates_tUniqRow_1) + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "OUT_AZURE", 2, 0,
						"tMap_2", "tMap_2", "tMap", "tUniqRow_1", "tUniqRow_1", "tUniqRow", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tUniqRow_1 - " + ("Done."));

				ok_Hash.put("tUniqRow_1", true);
				end_Hash.put("tUniqRow_1", System.currentTimeMillis());

				/**
				 * [tUniqRow_1 end ] stop
				 */

				/**
				 * [tFlowMeter_15 end ] start
				 */

				currentComponent = "tFlowMeter_15";

				if (log.isDebugEnabled())
					log.debug("tFlowMeter_15 - " + ("Sending message to tFlowMeterCatcher_1."));
				tFlowMeterCatcher_1.addMessage("Nbr_Fournisseur", new Integer(count_tFlowMeter_15), "Nbr_lignes_gold",
						"", "tFlowMeter_15");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId,
						"nbr_lignes_portail_frns", 2, 0, "tUniqRow_1", "tUniqRow_1", "tUniqRow", "tFlowMeter_15",
						"tFlowMeter_15", "tFlowMeter", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFlowMeter_15 - " + ("Done."));

				ok_Hash.put("tFlowMeter_15", true);
				end_Hash.put("tFlowMeter_15", System.currentTimeMillis());

				/**
				 * [tFlowMeter_15 end ] stop
				 */

				/**
				 * [tDBOutput_2 end ] start
				 */

				currentComponent = "tDBOutput_2";

				try {
					int countSum_tDBOutput_2 = 0;
					if (pstmt_tDBOutput_2 != null && batchSizeCounter_tDBOutput_2 > 0) {

						if (log.isDebugEnabled())
							log.debug("tDBOutput_2 - " + ("Executing the ") + ("INSERT") + (" batch."));
						for (int countEach_tDBOutput_2 : pstmt_tDBOutput_2.executeBatch()) {
							if (countEach_tDBOutput_2 == -2 || countEach_tDBOutput_2 == -3) {
								break;
							}
							countSum_tDBOutput_2 += countEach_tDBOutput_2;
						}
						rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;

						if (log.isDebugEnabled())
							log.debug("tDBOutput_2 - " + ("The ") + ("INSERT") + (" batch execution has succeeded."));
					}

					insertedCount_tDBOutput_2 += countSum_tDBOutput_2;

				} catch (java.sql.BatchUpdateException e) {
					globalMap.put("tDBOutput_2_ERROR_MESSAGE", e.getMessage());

					int countSum_tDBOutput_2 = 0;
					for (int countEach_tDBOutput_2 : e.getUpdateCounts()) {
						countSum_tDBOutput_2 += (countEach_tDBOutput_2 < 0 ? 0 : countEach_tDBOutput_2);
					}
					rowsToCommitCount_tDBOutput_2 += countSum_tDBOutput_2;

					insertedCount_tDBOutput_2 += countSum_tDBOutput_2;

					log.error("tDBOutput_2 - " + (e.getMessage()));
					System.err.println(e.getMessage());

				}
				if (pstmt_tDBOutput_2 != null) {

					pstmt_tDBOutput_2.close();
					resourceMap.remove("pstmt_tDBOutput_2");

				}
				resourceMap.put("statementClosed_tDBOutput_2", true);

				nb_line_deleted_tDBOutput_2 = nb_line_deleted_tDBOutput_2 + deletedCount_tDBOutput_2;
				nb_line_update_tDBOutput_2 = nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
				nb_line_inserted_tDBOutput_2 = nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
				nb_line_rejected_tDBOutput_2 = nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;

				globalMap.put("tDBOutput_2_NB_LINE", nb_line_tDBOutput_2);
				globalMap.put("tDBOutput_2_NB_LINE_UPDATED", nb_line_update_tDBOutput_2);
				globalMap.put("tDBOutput_2_NB_LINE_INSERTED", nb_line_inserted_tDBOutput_2);
				globalMap.put("tDBOutput_2_NB_LINE_DELETED", nb_line_deleted_tDBOutput_2);
				globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row10", 2, 0,
						"tFlowMeter_15", "tFlowMeter_15", "tFlowMeter", "tDBOutput_2", "PORTAIL_FOURNISSEUR_AZURE",
						"tMSSqlOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tDBOutput_2 - " + ("Done."));

				ok_Hash.put("tDBOutput_2", true);
				end_Hash.put("tDBOutput_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk18", 0, "ok");
				}
				tDBCommit_2Process(globalMap);

				/**
				 * [tDBOutput_2 end ] stop
				 */

			} // end the resume

			tFlowMeterCatcher_1Process(globalMap);

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_2:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
			}

			tDBRow_1Process(globalMap);

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
				 * [tDBInput_2 finally ] start
				 */

				currentComponent = "tDBInput_2";

				/**
				 * [tDBInput_2 finally ] stop
				 */

				/**
				 * [tMap_2 finally ] start
				 */

				currentComponent = "tMap_2";

				/**
				 * [tMap_2 finally ] stop
				 */

				/**
				 * [tUniqRow_1 finally ] start
				 */

				currentComponent = "tUniqRow_1";

				/**
				 * [tUniqRow_1 finally ] stop
				 */

				/**
				 * [tFlowMeter_15 finally ] start
				 */

				currentComponent = "tFlowMeter_15";

				/**
				 * [tFlowMeter_15 finally ] stop
				 */

				/**
				 * [tDBOutput_2 finally ] start
				 */

				currentComponent = "tDBOutput_2";

				if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
					java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
					if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap
							.remove("pstmt_tDBOutput_2")) != null) {
						pstmtToClose_tDBOutput_2.close();
					}
				}

				/**
				 * [tDBOutput_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}

	public void tDBCommit_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 0);

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
				 * [tDBCommit_2 begin ] start
				 */

				ok_Hash.put("tDBCommit_2", false);
				start_Hash.put("tDBCommit_2", System.currentTimeMillis());

				currentComponent = "tDBCommit_2";

				int tos_count_tDBCommit_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBCommit_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBCommit_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBCommit_2 = new StringBuilder();
							log4jParamters_tDBCommit_2.append("Parameters:");
							log4jParamters_tDBCommit_2.append("CONNECTION" + " = " + "tDBConnection_1");
							log4jParamters_tDBCommit_2.append(" | ");
							log4jParamters_tDBCommit_2.append("CLOSE" + " = " + "false");
							log4jParamters_tDBCommit_2.append(" | ");
							log4jParamters_tDBCommit_2.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlCommit");
							log4jParamters_tDBCommit_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBCommit_2 - " + (log4jParamters_tDBCommit_2));
						}
					}
					new BytesLimit65535_tDBCommit_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBCommit_2", "tDBCommit_2", "tMSSqlCommit");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBCommit_2 begin ] stop
				 */

				/**
				 * [tDBCommit_2 main ] start
				 */

				currentComponent = "tDBCommit_2";

				java.sql.Connection conn_tDBCommit_2 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");
				if (conn_tDBCommit_2 != null && !conn_tDBCommit_2.isClosed()) {

					log.debug("tDBCommit_2 - Connection 'tDBConnection_1' starting to commit.");

					conn_tDBCommit_2.commit();

					log.debug("tDBCommit_2 - Connection 'tDBConnection_1' commit has succeeded.");

				}

				tos_count_tDBCommit_2++;

				/**
				 * [tDBCommit_2 main ] stop
				 */

				/**
				 * [tDBCommit_2 process_data_begin ] start
				 */

				currentComponent = "tDBCommit_2";

				/**
				 * [tDBCommit_2 process_data_begin ] stop
				 */

				/**
				 * [tDBCommit_2 process_data_end ] start
				 */

				currentComponent = "tDBCommit_2";

				/**
				 * [tDBCommit_2 process_data_end ] stop
				 */

				/**
				 * [tDBCommit_2 end ] start
				 */

				currentComponent = "tDBCommit_2";

				if (log.isDebugEnabled())
					log.debug("tDBCommit_2 - " + ("Done."));

				ok_Hash.put("tDBCommit_2", true);
				end_Hash.put("tDBCommit_2", System.currentTimeMillis());

				/**
				 * [tDBCommit_2 end ] stop
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
				 * [tDBCommit_2 finally ] start
				 */

				currentComponent = "tDBCommit_2";

				/**
				 * [tDBCommit_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_1_SUBPROCESS_STATE", 0);

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
				 * [tDBRow_1 begin ] start
				 */

				ok_Hash.put("tDBRow_1", false);
				start_Hash.put("tDBRow_1", System.currentTimeMillis());

				currentComponent = "tDBRow_1";

				int tos_count_tDBRow_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBRow_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBRow_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBRow_1 = new StringBuilder();
							log4jParamters_tDBRow_1.append("Parameters:");
							log4jParamters_tDBRow_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("CONNECTION" + " = " + "tDBConnection_1");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("IDENTITY_INSERT" + " = " + "false");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("QUERY" + " = "
									+ "\"MERGE VenteHebdoTest AS T  USING VenteHebdoTTest As S  ON S.CODESITE = T.CODESITE and S.CODE_INTERNE_ARTICLE = T.CODE_INTERNE_ARTICLE and S.DATE_DEBUT = T.DATE_DEBUT and S.DATE_FIN = T.DATE_FIN AND S.EAN = T.EAN  WHEN NOT MATCHED THEN      INSERT (CODE_INTERNE_ARTICLE,CODESITE,EAN,DATE_DEBUT,DATE_FIN,CODEENSEIGNE,CODE_ARTICLE, QTE,CA_TTC,CA_HT,DateLastUpdateWebJob)       VALUES (S.CODE_INTERNE_ARTICLE,S.CODESITE,S.EAN,S.DATE_DEBUT,S.DATE_FIN,S.CODEENSEIGNE,S.CODE_ARTICLE, S.QTE,S.CA_TTC,S.CA_HT,SYSDATETIME())  WHEN MATCHED THEN UPDATE SET      T.QTE = S.QTE, T.CODEENSEIGNE = S.CODEENSEIGNE, T.CA_TTC= S.CA_TTC,      T.CA_HT	= S.CA_HT, T.CODE_ARTICLE= S.CODE_ARTICLE,   	DateLastUpdateWebJob= SYSDATETIME();\"");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("DIE_ON_ERROR" + " = " + "false");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("PROPAGATE_RECORD_SET" + " = " + "false");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("USE_PREPAREDSTATEMENT" + " = " + "false");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBRow_1.append(" | ");
							log4jParamters_tDBRow_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlRow");
							log4jParamters_tDBRow_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBRow_1 - " + (log4jParamters_tDBRow_1));
						}
					}
					new BytesLimit65535_tDBRow_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_1", "tDBRow_1", "tMSSqlRow");
					talendJobLogProcess(globalMap);
				}

				java.sql.Connection conn_tDBRow_1 = null;
				String query_tDBRow_1 = "";
				boolean whetherReject_tDBRow_1 = false;
				conn_tDBRow_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");

				if (conn_tDBRow_1 != null) {
					if (conn_tDBRow_1.getMetaData() != null) {

						log.debug("tDBRow_1 - Uses an existing connection with username '"
								+ conn_tDBRow_1.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBRow_1.getMetaData().getURL() + ".");

					}
				}

				resourceMap.put("conn_tDBRow_1", conn_tDBRow_1);
				java.sql.Statement stmt_tDBRow_1 = conn_tDBRow_1.createStatement();
				resourceMap.put("stmt_tDBRow_1", stmt_tDBRow_1);

				/**
				 * [tDBRow_1 begin ] stop
				 */

				/**
				 * [tDBRow_1 main ] start
				 */

				currentComponent = "tDBRow_1";

				query_tDBRow_1 = "MERGE VenteHebdoTest AS T\nUSING VenteHebdoTTest As S\nON S.CODESITE = T.CODESITE and S.CODE_INTERNE_ARTICLE = T.CODE_I"
						+ "NTERNE_ARTICLE and S.DATE_DEBUT = T.DATE_DEBUT and S.DATE_FIN = T.DATE_FIN AND S.EAN = T.EAN\nWHEN NOT MATCHED THEN\n   "
						+ " INSERT (CODE_INTERNE_ARTICLE,CODESITE,EAN,DATE_DEBUT,DATE_FIN,CODEENSEIGNE,CODE_ARTICLE, QTE,CA_TTC,CA_HT,DateLastUpdat"
						+ "eWebJob) \n    VALUES (S.CODE_INTERNE_ARTICLE,S.CODESITE,S.EAN,S.DATE_DEBUT,S.DATE_FIN,S.CODEENSEIGNE,S.CODE_ARTICLE, S."
						+ "QTE,S.CA_TTC,S.CA_HT,SYSDATETIME())\nWHEN MATCHED THEN UPDATE SET\n    T.QTE = S.QTE, T.CODEENSEIGNE = S.CODEENSEIGNE, T"
						+ ".CA_TTC= S.CA_TTC,\n    T.CA_HT	= S.CA_HT, T.CODE_ARTICLE= S.CODE_ARTICLE, \n	DateLastUpdateWebJob= SYSDATETIME();";
				whetherReject_tDBRow_1 = false;
				log.debug("tDBRow_1 - Executing the query: '" + query_tDBRow_1 + "'.");

				globalMap.put("tDBRow_1_QUERY", query_tDBRow_1);
				try {
					stmt_tDBRow_1.execute(query_tDBRow_1);

					log.debug("tDBRow_1 - Execute the query: '" + query_tDBRow_1 + "' has finished.");

				} catch (java.lang.Exception e) {
					whetherReject_tDBRow_1 = true;

					log.error("tDBRow_1 - " + e.getMessage());

					System.err.print(e.getMessage());
					globalMap.put("tDBRow_1_ERROR_MESSAGE", e.getMessage());

				}

				if (!whetherReject_tDBRow_1) {

				}

				tos_count_tDBRow_1++;

				/**
				 * [tDBRow_1 main ] stop
				 */

				/**
				 * [tDBRow_1 process_data_begin ] start
				 */

				currentComponent = "tDBRow_1";

				/**
				 * [tDBRow_1 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_1 process_data_end ] start
				 */

				currentComponent = "tDBRow_1";

				/**
				 * [tDBRow_1 process_data_end ] stop
				 */

				/**
				 * [tDBRow_1 end ] start
				 */

				currentComponent = "tDBRow_1";

				stmt_tDBRow_1.close();
				resourceMap.remove("stmt_tDBRow_1");
				resourceMap.put("statementClosed_tDBRow_1", true);
				resourceMap.put("finish_tDBRow_1", true);

				if (log.isDebugEnabled())
					log.debug("tDBRow_1 - " + ("Done."));

				ok_Hash.put("tDBRow_1", true);
				end_Hash.put("tDBRow_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tDBCommit_1Process(globalMap);

				/**
				 * [tDBRow_1 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
			}

			tWarn_1Process(globalMap);

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
				 * [tDBRow_1 finally ] start
				 */

				currentComponent = "tDBRow_1";

				if (resourceMap.get("statementClosed_tDBRow_1") == null) {
					java.sql.Statement stmtToClose_tDBRow_1 = null;
					if ((stmtToClose_tDBRow_1 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_1")) != null) {
						stmtToClose_tDBRow_1.close();
					}
				}

				/**
				 * [tDBRow_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_1_SUBPROCESS_STATE", 1);
	}

	public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

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
				 * [tDie_1 begin ] start
				 */

				ok_Hash.put("tDie_1", false);
				start_Hash.put("tDie_1", System.currentTimeMillis());

				currentComponent = "tDie_1";

				int tos_count_tDie_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDie_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDie_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDie_1 = new StringBuilder();
							log4jParamters_tDie_1.append("Parameters:");
							log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Job KO\"");
							log4jParamters_tDie_1.append(" | ");
							log4jParamters_tDie_1.append("CODE" + " = " + "1");
							log4jParamters_tDie_1.append(" | ");
							log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
							log4jParamters_tDie_1.append(" | ");
							log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "false");
							log4jParamters_tDie_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDie_1 - " + (log4jParamters_tDie_1));
						}
					}
					new BytesLimit65535_tDie_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDie_1", "KO", "tDie");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDie_1 begin ] stop
				 */

				/**
				 * [tDie_1 main ] start
				 */

				currentComponent = "tDie_1";

				try {
					globalMap.put("tDie_1_DIE_PRIORITY", 5);
					System.err.println("Job KO");

					log.error("tDie_1 - The die message: " + "Job KO");

					globalMap.put("tDie_1_DIE_MESSAGE", "Job KO");
					globalMap.put("tDie_1_DIE_MESSAGES", "Job KO");

				} catch (Exception | Error e_tDie_1) {
					globalMap.put("tDie_1_ERROR_MESSAGE", e_tDie_1.getMessage());
					logIgnoredError(
							String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1),
							e_tDie_1);
				}

				currentComponent = "tDie_1";
				status = "failure";
				errorCode = new Integer(1);
				globalMap.put("tDie_1_DIE_CODE", errorCode);

				if (true) {
					throw new TDieException();
				}

				tos_count_tDie_1++;

				/**
				 * [tDie_1 main ] stop
				 */

				/**
				 * [tDie_1 process_data_begin ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 process_data_begin ] stop
				 */

				/**
				 * [tDie_1 process_data_end ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 process_data_end ] stop
				 */

				/**
				 * [tDie_1 end ] start
				 */

				currentComponent = "tDie_1";

				if (log.isDebugEnabled())
					log.debug("tDie_1 - " + ("Done."));

				ok_Hash.put("tDie_1", true);
				end_Hash.put("tDie_1", System.currentTimeMillis());

				/**
				 * [tDie_1 end ] stop
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
				 * [tDie_1 finally ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}

	public void tWarn_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tWarn_1_SUBPROCESS_STATE", 0);

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
				 * [tWarn_1 begin ] start
				 */

				ok_Hash.put("tWarn_1", false);
				start_Hash.put("tWarn_1", System.currentTimeMillis());

				currentComponent = "tWarn_1";

				int tos_count_tWarn_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tWarn_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tWarn_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tWarn_1 = new StringBuilder();
							log4jParamters_tWarn_1.append("Parameters:");
							log4jParamters_tWarn_1.append("MESSAGE" + " = " + "\"Job OK\"");
							log4jParamters_tWarn_1.append(" | ");
							log4jParamters_tWarn_1.append("CODE" + " = " + "1");
							log4jParamters_tWarn_1.append(" | ");
							log4jParamters_tWarn_1.append("PRIORITY" + " = " + "3");
							log4jParamters_tWarn_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tWarn_1 - " + (log4jParamters_tWarn_1));
						}
					}
					new BytesLimit65535_tWarn_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tWarn_1", "OK", "tWarn");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tWarn_1 begin ] stop
				 */

				/**
				 * [tWarn_1 main ] start
				 */

				currentComponent = "tWarn_1";

				try {

					resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_1", "", Thread.currentThread().getId() + "", "INFO",
							"", "Job OK", "", "");
					if (log.isInfoEnabled())
						log.info("tWarn_1 - " + ("Message: ") + ("Job OK") + (". Code: ") + (1));
					globalMap.put("tWarn_1_WARN_MESSAGES", "Job OK");
					globalMap.put("tWarn_1_WARN_PRIORITY", 3);
					globalMap.put("tWarn_1_WARN_CODE", 1);

				} catch (Exception e_tWarn_1) {
					globalMap.put("tWarn_1_ERROR_MESSAGE", e_tWarn_1.getMessage());
					logIgnoredError(
							String.format("tWarn_1 - tWarn failed to log message due to internal error: %s", e_tWarn_1),
							e_tWarn_1);
				}

				tos_count_tWarn_1++;

				/**
				 * [tWarn_1 main ] stop
				 */

				/**
				 * [tWarn_1 process_data_begin ] start
				 */

				currentComponent = "tWarn_1";

				/**
				 * [tWarn_1 process_data_begin ] stop
				 */

				/**
				 * [tWarn_1 process_data_end ] start
				 */

				currentComponent = "tWarn_1";

				/**
				 * [tWarn_1 process_data_end ] stop
				 */

				/**
				 * [tWarn_1 end ] start
				 */

				currentComponent = "tWarn_1";

				if (log.isDebugEnabled())
					log.debug("tWarn_1 - " + ("Done."));

				ok_Hash.put("tWarn_1", true);
				end_Hash.put("tWarn_1", System.currentTimeMillis());

				/**
				 * [tWarn_1 end ] stop
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
				 * [tWarn_1 finally ] start
				 */

				currentComponent = "tWarn_1";

				/**
				 * [tWarn_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tWarn_1_SUBPROCESS_STATE", 1);
	}

	public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

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
				 * [tDBCommit_1 begin ] start
				 */

				ok_Hash.put("tDBCommit_1", false);
				start_Hash.put("tDBCommit_1", System.currentTimeMillis());

				currentComponent = "tDBCommit_1";

				int tos_count_tDBCommit_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBCommit_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBCommit_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBCommit_1 = new StringBuilder();
							log4jParamters_tDBCommit_1.append("Parameters:");
							log4jParamters_tDBCommit_1.append("CONNECTION" + " = " + "tDBConnection_1");
							log4jParamters_tDBCommit_1.append(" | ");
							log4jParamters_tDBCommit_1.append("CLOSE" + " = " + "false");
							log4jParamters_tDBCommit_1.append(" | ");
							log4jParamters_tDBCommit_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlCommit");
							log4jParamters_tDBCommit_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBCommit_1 - " + (log4jParamters_tDBCommit_1));
						}
					}
					new BytesLimit65535_tDBCommit_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBCommit_1", "tDBCommit_1", "tMSSqlCommit");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBCommit_1 begin ] stop
				 */

				/**
				 * [tDBCommit_1 main ] start
				 */

				currentComponent = "tDBCommit_1";

				java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");
				if (conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed()) {

					log.debug("tDBCommit_1 - Connection 'tDBConnection_1' starting to commit.");

					conn_tDBCommit_1.commit();

					log.debug("tDBCommit_1 - Connection 'tDBConnection_1' commit has succeeded.");

				}

				tos_count_tDBCommit_1++;

				/**
				 * [tDBCommit_1 main ] stop
				 */

				/**
				 * [tDBCommit_1 process_data_begin ] start
				 */

				currentComponent = "tDBCommit_1";

				/**
				 * [tDBCommit_1 process_data_begin ] stop
				 */

				/**
				 * [tDBCommit_1 process_data_end ] start
				 */

				currentComponent = "tDBCommit_1";

				/**
				 * [tDBCommit_1 process_data_end ] stop
				 */

				/**
				 * [tDBCommit_1 end ] start
				 */

				currentComponent = "tDBCommit_1";

				if (log.isDebugEnabled())
					log.debug("tDBCommit_1 - " + ("Done."));

				ok_Hash.put("tDBCommit_1", true);
				end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk11", 0, "ok");
				}
				tSetGlobalVar_3Process(globalMap);

				/**
				 * [tDBCommit_1 end ] stop
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
				 * [tDBCommit_1 finally ] start
				 */

				currentComponent = "tDBCommit_1";

				/**
				 * [tDBCommit_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}

	public void tSetGlobalVar_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tSetGlobalVar_3_SUBPROCESS_STATE", 0);

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
				 * [tSetGlobalVar_3 begin ] start
				 */

				ok_Hash.put("tSetGlobalVar_3", false);
				start_Hash.put("tSetGlobalVar_3", System.currentTimeMillis());

				currentComponent = "tSetGlobalVar_3";

				int tos_count_tSetGlobalVar_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tSetGlobalVar_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tSetGlobalVar_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tSetGlobalVar_3 = new StringBuilder();
							log4jParamters_tSetGlobalVar_3.append("Parameters:");
							log4jParamters_tSetGlobalVar_3.append("VARIABLES" + " = " + "[{VALUE="
									+ ("TalendDate.formatDate(\"yyyy-MM-dd_HH-mm-ss\",TalendDate.getCurrentDate())")
									+ ", KEY=" + ("\"CurrentDate2\"") + "}]");
							log4jParamters_tSetGlobalVar_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tSetGlobalVar_3 - " + (log4jParamters_tSetGlobalVar_3));
						}
					}
					new BytesLimit65535_tSetGlobalVar_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tSetGlobalVar_3", "tSetGlobalVar_3", "tSetGlobalVar");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tSetGlobalVar_3 begin ] stop
				 */

				/**
				 * [tSetGlobalVar_3 main ] start
				 */

				currentComponent = "tSetGlobalVar_3";

				globalMap.put("CurrentDate2",
						TalendDate.formatDate("yyyy-MM-dd_HH-mm-ss", TalendDate.getCurrentDate()));

				tos_count_tSetGlobalVar_3++;

				/**
				 * [tSetGlobalVar_3 main ] stop
				 */

				/**
				 * [tSetGlobalVar_3 process_data_begin ] start
				 */

				currentComponent = "tSetGlobalVar_3";

				/**
				 * [tSetGlobalVar_3 process_data_begin ] stop
				 */

				/**
				 * [tSetGlobalVar_3 process_data_end ] start
				 */

				currentComponent = "tSetGlobalVar_3";

				/**
				 * [tSetGlobalVar_3 process_data_end ] stop
				 */

				/**
				 * [tSetGlobalVar_3 end ] start
				 */

				currentComponent = "tSetGlobalVar_3";

				if (log.isDebugEnabled())
					log.debug("tSetGlobalVar_3 - " + ("Done."));

				ok_Hash.put("tSetGlobalVar_3", true);
				end_Hash.put("tSetGlobalVar_3", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tHashInput_1Process(globalMap);

				/**
				 * [tSetGlobalVar_3 end ] stop
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
				 * [tSetGlobalVar_3 finally ] start
				 */

				currentComponent = "tSetGlobalVar_3";

				/**
				 * [tSetGlobalVar_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSetGlobalVar_3_SUBPROCESS_STATE", 1);
	}

	public static class OUTFRNStruct implements routines.system.IPersistableRow<OUTFRNStruct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public Integer FOUCFIN_FOURNISSEUR;

		public Integer getFOUCFIN_FOURNISSEUR() {
			return this.FOUCFIN_FOURNISSEUR;
		}

		public String LIBFRS_FOURNISSEUR;

		public String getLIBFRS_FOURNISSEUR() {
			return this.LIBFRS_FOURNISSEUR;
		}

		public String FOUCNUF_FOURNISSEUR;

		public String getFOUCNUF_FOURNISSEUR() {
			return this.FOUCNUF_FOURNISSEUR;
		}

		public Integer COUNTFRN;

		public Integer getCOUNTFRN() {
			return this.COUNTFRN;
		}

		public String Date_Debut;

		public String getDate_Debut() {
			return this.Date_Debut;
		}

		public String Date_Fin;

		public String getDate_Fin() {
			return this.Date_Fin;
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN_FOURNISSEUR = readInteger(dis);

					this.LIBFRS_FOURNISSEUR = readString(dis);

					this.FOUCNUF_FOURNISSEUR = readString(dis);

					this.COUNTFRN = readInteger(dis);

					this.Date_Debut = readString(dis);

					this.Date_Fin = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN_FOURNISSEUR = readInteger(dis);

					this.LIBFRS_FOURNISSEUR = readString(dis);

					this.FOUCNUF_FOURNISSEUR = readString(dis);

					this.COUNTFRN = readInteger(dis);

					this.Date_Debut = readString(dis);

					this.Date_Fin = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN_FOURNISSEUR, dos);

				// String

				writeString(this.LIBFRS_FOURNISSEUR, dos);

				// String

				writeString(this.FOUCNUF_FOURNISSEUR, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

				// String

				writeString(this.Date_Debut, dos);

				// String

				writeString(this.Date_Fin, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Integer

				writeInteger(this.FOUCFIN_FOURNISSEUR, dos);

				// String

				writeString(this.LIBFRS_FOURNISSEUR, dos);

				// String

				writeString(this.FOUCNUF_FOURNISSEUR, dos);

				// Integer

				writeInteger(this.COUNTFRN, dos);

				// String

				writeString(this.Date_Debut, dos);

				// String

				writeString(this.Date_Fin, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("FOUCFIN_FOURNISSEUR=" + String.valueOf(FOUCFIN_FOURNISSEUR));
			sb.append(",LIBFRS_FOURNISSEUR=" + LIBFRS_FOURNISSEUR);
			sb.append(",FOUCNUF_FOURNISSEUR=" + FOUCNUF_FOURNISSEUR);
			sb.append(",COUNTFRN=" + String.valueOf(COUNTFRN));
			sb.append(",Date_Debut=" + Date_Debut);
			sb.append(",Date_Fin=" + Date_Fin);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (FOUCFIN_FOURNISSEUR == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCFIN_FOURNISSEUR);
			}

			sb.append("|");

			if (LIBFRS_FOURNISSEUR == null) {
				sb.append("<null>");
			} else {
				sb.append(LIBFRS_FOURNISSEUR);
			}

			sb.append("|");

			if (FOUCNUF_FOURNISSEUR == null) {
				sb.append("<null>");
			} else {
				sb.append(FOUCNUF_FOURNISSEUR);
			}

			sb.append("|");

			if (COUNTFRN == null) {
				sb.append("<null>");
			} else {
				sb.append(COUNTFRN);
			}

			sb.append("|");

			if (Date_Debut == null) {
				sb.append("<null>");
			} else {
				sb.append(Date_Debut);
			}

			sb.append("|");

			if (Date_Fin == null) {
				sb.append("<null>");
			} else {
				sb.append(Date_Fin);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OUTFRNStruct other) {

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

	public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.LIBFRS = readString(dis);

					this.FOUCNUF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.LIBFRS = readString(dis);

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

				writeString(this.LIBFRS, dos);

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

				writeString(this.LIBFRS, dos);

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
		public int compareTo(row6Struct other) {

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

	public static class after_tHashInput_1Struct implements routines.system.IPersistableRow<after_tHashInput_1Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.LIBFRS = readString(dis);

					this.FOUCNUF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

					this.LIBFRS = readString(dis);

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

				writeString(this.LIBFRS, dos);

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

				writeString(this.LIBFRS, dos);

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
		public int compareTo(after_tHashInput_1Struct other) {

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

				tHashInput_3Process(globalMap);

				row6Struct row6 = new row6Struct();
				OUTFRNStruct OUTFRN = new OUTFRNStruct();

				/**
				 * [tFileOutputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_1", false);
				start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "OUTFRN");

				int tos_count_tFileOutputDelimited_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_1.append("Parameters:");
							log4jParamters_tFileOutputDelimited_1.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = "
									+ "context.PATH_VENTE_HEBDO+\"/FRNS_VENTE_HEBDO_\"+((String)globalMap.get(\"CurrentDate\"))+\".csv\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\";\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("COMPRESS" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ENCODING" + " = " + "\"UTF-8\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_1 - " + (log4jParamters_tFileOutputDelimited_1));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_1", "tFileOutputDelimited_1", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_1 = "";
				fileName_tFileOutputDelimited_1 = (new java.io.File(context.PATH_VENTE_HEBDO + "/FRNS_VENTE_HEBDO_"
						+ ((String) globalMap.get("CurrentDate")) + ".csv")).getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_1 = null;
				String extension_tFileOutputDelimited_1 = null;
				String directory_tFileOutputDelimited_1 = null;
				if ((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
						extension_tFileOutputDelimited_1 = "";
					} else {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0,
								fileName_tFileOutputDelimited_1.lastIndexOf("."));
						extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
								.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0,
							fileName_tFileOutputDelimited_1.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0,
								fileName_tFileOutputDelimited_1.lastIndexOf("."));
						extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
								.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
						extension_tFileOutputDelimited_1 = "";
					}
					directory_tFileOutputDelimited_1 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_1 = true;
				java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME", fileName_tFileOutputDelimited_1);
				int nb_line_tFileOutputDelimited_1 = 0;
				int splitedFileNo_tFileOutputDelimited_1 = 0;
				int currentRow_tFileOutputDelimited_1 = 0;

				final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */
						";"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /**
																		 * Start field
																		 * tFileOutputDelimited_1:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
					if (!dir_tFileOutputDelimited_1.exists()) {
						log.info("tFileOutputDelimited_1 - Creating directory '"
								+ dir_tFileOutputDelimited_1.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_1.mkdirs();
						log.info("tFileOutputDelimited_1 - The directory '"
								+ dir_tFileOutputDelimited_1.getCanonicalPath() + "' has been created successfully.");
					}
				}

				// routines.system.Row
				java.io.Writer outtFileOutputDelimited_1 = null;

				java.io.File fileToDelete_tFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
				if (fileToDelete_tFileOutputDelimited_1.exists()) {
					fileToDelete_tFileOutputDelimited_1.delete();
				}
				outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
						new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, false), "UTF-8"));
				if (filetFileOutputDelimited_1.length() == 0) {
					outtFileOutputDelimited_1.write("FOUCFIN_FOURNISSEUR");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LIBFRS_FOURNISSEUR");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("FOUCNUF_FOURNISSEUR");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("COUNTFRN");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("Date_Debut");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("Date_Fin");
					outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.flush();
				}

				resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
				resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

				/**
				 * [tFileOutputDelimited_1 begin ] stop
				 */

				/**
				 * [tMap_3 begin ] start
				 */

				ok_Hash.put("tMap_3", false);
				start_Hash.put("tMap_3", System.currentTimeMillis());

				currentComponent = "tMap_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row6");

				int tos_count_tMap_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_3 = new StringBuilder();
							log4jParamters_tMap_3.append("Parameters:");
							log4jParamters_tMap_3.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_3.append(" | ");
							log4jParamters_tMap_3.append("TEMPORARY_DATA_DIRECTORY" + " = "
									+ "((Long)globalMap.get(\"tChronometerStart_1_STARTTIME\"))");
							log4jParamters_tMap_3.append(" | ");
							log4jParamters_tMap_3.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_3.append(" | ");
							log4jParamters_tMap_3.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_3 - " + (log4jParamters_tMap_3));
						}
					}
					new BytesLimit65535_tMap_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_3", "tMap_3", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row6_tMap_3 = 0;

				int count_row7_tMap_3 = 0;

				org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) ((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) globalMap
						.get("tHash_Lookup_row7"));

				row7Struct row7HashKey = new row7Struct();
				row7Struct row7Default = new row7Struct();
// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_3__Struct {
				}
				Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_OUTFRN_tMap_3 = 0;

				OUTFRNStruct OUTFRN_tmp = new OUTFRNStruct();
// ###############################

				/**
				 * [tMap_3 begin ] stop
				 */

				/**
				 * [tHashInput_1 begin ] start
				 */

				ok_Hash.put("tHashInput_1", false);
				start_Hash.put("tHashInput_1", System.currentTimeMillis());

				currentComponent = "tHashInput_1";

				int tos_count_tHashInput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tHashInput_1", "FOURNISSEEUR", "tHashInput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tHashInput_1 = 0;

				org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_1 = org.talend.designer.components.hashfile.common.MapHashFile
						.getMapHashFile();
				org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct> tHashFile_tHashInput_1 = mf_tHashInput_1
						.getAdvancedMemoryHashFile("tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_1");
				if (tHashFile_tHashInput_1 == null) {
					throw new RuntimeException(
							"The hash is not initialized : The hash must exist before you read from it");
				}
				java.util.Iterator<row3Struct> iterator_tHashInput_1 = tHashFile_tHashInput_1.iterator();
				while (iterator_tHashInput_1.hasNext()) {
					row3Struct next_tHashInput_1 = iterator_tHashInput_1.next();

					row6.FOUCFIN = next_tHashInput_1.FOUCFIN;
					row6.LIBFRS = next_tHashInput_1.LIBFRS;
					row6.FOUCNUF = next_tHashInput_1.FOUCNUF;

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
					 * [tMap_3 main ] start
					 */

					currentComponent = "tMap_3";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row6", "tHashInput_1", "FOURNISSEEUR", "tHashInput", "tMap_3", "tMap_3", "tMap"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row6 - " + (row6 == null ? "" : row6.toLogString()));
					}

					boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;

					// ###############################
					// # Input tables (lookups)
					boolean rejectedInnerJoin_tMap_3 = false;
					boolean mainRowRejected_tMap_3 = false;

					///////////////////////////////////////////////
					// Starting Lookup Table "row7"
					///////////////////////////////////////////////

					boolean forceLooprow7 = false;

					row7Struct row7ObjectFromLookup = null;

					if (!rejectedInnerJoin_tMap_3) { // G_TM_M_020

						hasCasePrimitiveKeyWithNull_tMap_3 = false;

						row7HashKey.FOUCFIN = row6.FOUCFIN;

						row7HashKey.hashCodeDirty = true;

						tHash_Lookup_row7.lookup(row7HashKey);

					} // G_TM_M_020

					if (tHash_Lookup_row7 != null && tHash_Lookup_row7.getCount(row7HashKey) > 1) { // G 071

						// System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row7'
						// and it contains more one result from keys : row7.FOUCFIN = '" +
						// row7HashKey.FOUCFIN + "'");
					} // G 071

					row7Struct row7 = null;

					row7Struct fromLookup_row7 = null;
					row7 = row7Default;

					if (tHash_Lookup_row7 != null && tHash_Lookup_row7.hasNext()) { // G 099

						fromLookup_row7 = tHash_Lookup_row7.next();

					} // G 099

					if (fromLookup_row7 != null) {
						row7 = fromLookup_row7;
					}

					// ###############################
					{ // start of Var scope

						// ###############################
						// # Vars tables

						Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
						// ###############################
						// # Output tables

						OUTFRN = null;

// # Output table : 'OUTFRN'
						count_OUTFRN_tMap_3++;

						OUTFRN_tmp.FOUCFIN_FOURNISSEUR = row6.FOUCFIN;
						OUTFRN_tmp.LIBFRS_FOURNISSEUR = row6.LIBFRS;
						OUTFRN_tmp.FOUCNUF_FOURNISSEUR = row6.FOUCNUF;
						OUTFRN_tmp.COUNTFRN = row7.FOUCFIN == null ? 0 : row7.COUNTFRN;
						OUTFRN_tmp.Date_Debut = ((String) globalMap.get("CurrentDate"));
						OUTFRN_tmp.Date_Fin = ((String) globalMap.get("CurrentDate2"));
						OUTFRN = OUTFRN_tmp;
						log.debug("tMap_3 - Outputting the record " + count_OUTFRN_tMap_3
								+ " of the output table 'OUTFRN'.");

// ###############################

					} // end of Var scope

					rejectedInnerJoin_tMap_3 = false;

					tos_count_tMap_3++;

					/**
					 * [tMap_3 main ] stop
					 */

					/**
					 * [tMap_3 process_data_begin ] start
					 */

					currentComponent = "tMap_3";

					/**
					 * [tMap_3 process_data_begin ] stop
					 */
// Start of branch "OUTFRN"
					if (OUTFRN != null) {

						/**
						 * [tFileOutputDelimited_1 main ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "OUTFRN", "tMap_3", "tMap_3", "tMap", "tFileOutputDelimited_1",
								"tFileOutputDelimited_1", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("OUTFRN - " + (OUTFRN == null ? "" : OUTFRN.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
						if (OUTFRN.FOUCFIN_FOURNISSEUR != null) {
							sb_tFileOutputDelimited_1.append(OUTFRN.FOUCFIN_FOURNISSEUR);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (OUTFRN.LIBFRS_FOURNISSEUR != null) {
							sb_tFileOutputDelimited_1.append(OUTFRN.LIBFRS_FOURNISSEUR);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (OUTFRN.FOUCNUF_FOURNISSEUR != null) {
							sb_tFileOutputDelimited_1.append(OUTFRN.FOUCNUF_FOURNISSEUR);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (OUTFRN.COUNTFRN != null) {
							sb_tFileOutputDelimited_1.append(OUTFRN.COUNTFRN);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (OUTFRN.Date_Debut != null) {
							sb_tFileOutputDelimited_1.append(OUTFRN.Date_Debut);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (OUTFRN.Date_Fin != null) {
							sb_tFileOutputDelimited_1.append(OUTFRN.Date_Fin);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);

						nb_line_tFileOutputDelimited_1++;
						resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

						outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
						log.debug(
								"tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");

						tos_count_tFileOutputDelimited_1++;

						/**
						 * [tFileOutputDelimited_1 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_1 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						/**
						 * [tFileOutputDelimited_1 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_1 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						/**
						 * [tFileOutputDelimited_1 process_data_end ] stop
						 */

					} // End of branch "OUTFRN"

					/**
					 * [tMap_3 process_data_end ] start
					 */

					currentComponent = "tMap_3";

					/**
					 * [tMap_3 process_data_end ] stop
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
						.remove("tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_1");

				globalMap.put("tHashInput_1_NB_LINE", nb_line_tHashInput_1);

				ok_Hash.put("tHashInput_1", true);
				end_Hash.put("tHashInput_1", System.currentTimeMillis());

				/**
				 * [tHashInput_1 end ] stop
				 */

				/**
				 * [tMap_3 end ] start
				 */

				currentComponent = "tMap_3";

// ###############################
// # Lookup hashes releasing
				if (tHash_Lookup_row7 != null) {
					tHash_Lookup_row7.endGet();
				}
				globalMap.remove("tHash_Lookup_row7");

// ###############################      
				log.debug("tMap_3 - Written records count in the table 'OUTFRN': " + count_OUTFRN_tMap_3 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row6", 2, 0,
						"tHashInput_1", "FOURNISSEEUR", "tHashInput", "tMap_3", "tMap_3", "tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_3 - " + ("Done."));

				ok_Hash.put("tMap_3", true);
				end_Hash.put("tMap_3", System.currentTimeMillis());

				/**
				 * [tMap_3 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_1 end ] start
				 */

				currentComponent = "tFileOutputDelimited_1";

				if (outtFileOutputDelimited_1 != null) {
					outtFileOutputDelimited_1.flush();
					outtFileOutputDelimited_1.close();
				}

				globalMap.put("tFileOutputDelimited_1_NB_LINE", nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME", fileName_tFileOutputDelimited_1);

				resourceMap.put("finish_tFileOutputDelimited_1", true);

				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "OUTFRN", 2, 0, "tMap_3",
						"tMap_3", "tMap", "tFileOutputDelimited_1", "tFileOutputDelimited_1", "tFileOutputDelimited",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_1 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_1", true);
				end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk12", 0, "ok");
				}
				tFileExist_1Process(globalMap);

				/**
				 * [tFileOutputDelimited_1 end ] stop
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

			// free memory for "tMap_3"
			globalMap.remove("tHash_Lookup_row7");

			try {

				/**
				 * [tHashInput_1 finally ] start
				 */

				currentComponent = "tHashInput_1";

				/**
				 * [tHashInput_1 finally ] stop
				 */

				/**
				 * [tMap_3 finally ] start
				 */

				currentComponent = "tMap_3";

				/**
				 * [tMap_3 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_1 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_1";

				if (resourceMap.get("finish_tFileOutputDelimited_1") == null) {

					java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer) resourceMap
							.get("out_tFileOutputDelimited_1");
					if (outtFileOutputDelimited_1 != null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}

				}

				/**
				 * [tFileOutputDelimited_1 finally ] stop
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

	public void tFileExist_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileExist_1_SUBPROCESS_STATE", 0);

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
				 * [tFileExist_1 begin ] start
				 */

				ok_Hash.put("tFileExist_1", false);
				start_Hash.put("tFileExist_1", System.currentTimeMillis());

				currentComponent = "tFileExist_1";

				int tos_count_tFileExist_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileExist_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileExist_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileExist_1 = new StringBuilder();
							log4jParamters_tFileExist_1.append("Parameters:");
							log4jParamters_tFileExist_1.append("FILE_NAME" + " = "
									+ "((String)globalMap.get(\"tFileOutputDelimited_1_FILE_NAME\"))");
							log4jParamters_tFileExist_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileExist_1 - " + (log4jParamters_tFileExist_1));
						}
					}
					new BytesLimit65535_tFileExist_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileExist_1", "tFileExist_1", "tFileExist");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tFileExist_1 begin ] stop
				 */

				/**
				 * [tFileExist_1 main ] start
				 */

				currentComponent = "tFileExist_1";

				final StringBuffer log4jSb_tFileExist_1 = new StringBuffer();

				java.io.File file_tFileExist_1 = new java.io.File(
						((String) globalMap.get("tFileOutputDelimited_1_FILE_NAME")));
				if (!file_tFileExist_1.exists()) {
					globalMap.put("tFileExist_1_EXISTS", false);
					log.info("tFileExist_1 - Directory or file : " + file_tFileExist_1.getAbsolutePath()
							+ " doesn't exist.");
				} else {
					globalMap.put("tFileExist_1_EXISTS", true);
					log.info("tFileExist_1 - Directory or file : " + file_tFileExist_1.getAbsolutePath() + " exists.");
				}

				globalMap.put("tFileExist_1_FILENAME", ((String) globalMap.get("tFileOutputDelimited_1_FILE_NAME")));

				tos_count_tFileExist_1++;

				/**
				 * [tFileExist_1 main ] stop
				 */

				/**
				 * [tFileExist_1 process_data_begin ] start
				 */

				currentComponent = "tFileExist_1";

				/**
				 * [tFileExist_1 process_data_begin ] stop
				 */

				/**
				 * [tFileExist_1 process_data_end ] start
				 */

				currentComponent = "tFileExist_1";

				/**
				 * [tFileExist_1 process_data_end ] stop
				 */

				/**
				 * [tFileExist_1 end ] start
				 */

				currentComponent = "tFileExist_1";

				if (log.isDebugEnabled())
					log.debug("tFileExist_1 - " + ("Done."));

				ok_Hash.put("tFileExist_1", true);
				end_Hash.put("tFileExist_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk17", 0, "ok");
				}
				tSendMail_1Process(globalMap);

				/**
				 * [tFileExist_1 end ] stop
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
				 * [tFileExist_1 finally ] start
				 */

				currentComponent = "tFileExist_1";

				/**
				 * [tFileExist_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileExist_1_SUBPROCESS_STATE", 1);
	}

	public void tSendMail_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tSendMail_1_SUBPROCESS_STATE", 0);

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
				 * [tSendMail_1 begin ] start
				 */

				ok_Hash.put("tSendMail_1", false);
				start_Hash.put("tSendMail_1", System.currentTimeMillis());

				currentComponent = "tSendMail_1";

				int tos_count_tSendMail_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tSendMail_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tSendMail_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tSendMail_1 = new StringBuilder();
							log4jParamters_tSendMail_1.append("Parameters:");
							log4jParamters_tSendMail_1.append("TO" + " = " + "\"aoukerrou@marjane.co.ma\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("FROM" + " = " + "\"Talend@marjane.co.ma\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("NEED_PERSONAL_NAME" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("CC" + " = " + "");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("BCC" + " = " + "");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SUBJECT" + " = " + "\"FRNS VENTE HEBDO TEST\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("MESSAGE" + " = "
									+ "\"Hello,  Merci de trouver ci-joint les fournisseurs de l'alimentation des ventes Hebdo.  Cordialement\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("CHECK_ATTACHMENT" + " = " + "true");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append(
									"ATTACHMENTS" + " = " + "[{CONTENT_TRANSFER_ENCODING=" + ("DEFAULT") + ", FILE="
											+ ("((String)globalMap.get(\"tFileOutputDelimited_1_FILE_NAME\"))") + "}]");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("HEADERS" + " = " + "[]");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SMTP_HOST" + " = " + "\"192.168.99.103\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SMTP_PORT" + " = " + "25");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SSL" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("STARTTLS" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("IMPORTANCE" + " = " + "Normal");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("NEED_AUTH" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("TEXT_SUBTYPE" + " = " + "plain");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SET_LOCALHOST" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tSendMail_1 - " + (log4jParamters_tSendMail_1));
						}
					}
					new BytesLimit65535_tSendMail_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tSendMail_1", "tSendMail_1", "tSendMail");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tSendMail_1 begin ] stop
				 */

				/**
				 * [tSendMail_1 main ] start
				 */

				currentComponent = "tSendMail_1";

				String smtpHost_tSendMail_1 = "192.168.99.103";
				String smtpPort_tSendMail_1 = "25";
				String from_tSendMail_1 = ("Talend@marjane.co.ma");
				String to_tSendMail_1 = ("aoukerrou@marjane.co.ma").replace(";", ",");
				String cc_tSendMail_1 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
				String bcc_tSendMail_1 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
				String subject_tSendMail_1 = ("FRNS VENTE HEBDO TEST");

				java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();
				attachments_tSendMail_1.add(((String) globalMap.get("tFileOutputDelimited_1_FILE_NAME")));
				contentTransferEncoding_tSendMail_1.add("DEFAULT");

				String message_tSendMail_1 = (("Hello,\nMerci de trouver ci-joint les fournisseurs de l'alimentation des ventes Hebdo.\nCordialement") == null
						|| "".equals(
								"Hello,\nMerci de trouver ci-joint les fournisseurs de l'alimentation des ventes Hebdo.\nCordialement"))
										? "\"\""
										: ("Hello,\nMerci de trouver ci-joint les fournisseurs de l'alimentation des ventes Hebdo.\nCordialement");
				java.util.Properties props_tSendMail_1 = System.getProperties();
				props_tSendMail_1.put("mail.smtp.host", smtpHost_tSendMail_1);
				props_tSendMail_1.put("mail.smtp.port", smtpPort_tSendMail_1);
				props_tSendMail_1.put("mail.mime.encodefilename", "true");
				try {

					log.info("tSendMail_1 - Connection attempt to '" + smtpHost_tSendMail_1 + "'.");

					props_tSendMail_1.put("mail.smtp.auth", "false");
					javax.mail.Session session_tSendMail_1 = javax.mail.Session.getInstance(props_tSendMail_1, null);

					log.info("tSendMail_1 - Connection to '" + smtpHost_tSendMail_1 + "' has succeeded.");

					javax.mail.Message msg_tSendMail_1 = new javax.mail.internet.MimeMessage(session_tSendMail_1);
					msg_tSendMail_1.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_1, null));
					msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.TO,
							javax.mail.internet.InternetAddress.parse(to_tSendMail_1, false));
					if (cc_tSendMail_1 != null)
						msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.CC,
								javax.mail.internet.InternetAddress.parse(cc_tSendMail_1, false));
					if (bcc_tSendMail_1 != null)
						msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(bcc_tSendMail_1, false));
					msg_tSendMail_1.setSubject(subject_tSendMail_1);

					for (int i_tSendMail_1 = 0; i_tSendMail_1 < headers_tSendMail_1.size(); i_tSendMail_1++) {
						java.util.Map<String, String> header_tSendMail_1 = headers_tSendMail_1.get(i_tSendMail_1);
						msg_tSendMail_1.setHeader(header_tSendMail_1.get("KEY"), header_tSendMail_1.get("VALUE"));
					}
					msg_tSendMail_1.setSentDate(new Date());
					msg_tSendMail_1.setHeader("X-Priority", "3"); // High->1 Normal->3 Low->5
					javax.mail.Multipart mp_tSendMail_1 = new javax.mail.internet.MimeMultipart();
					javax.mail.internet.MimeBodyPart mbpText_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
					mbpText_tSendMail_1.setText(message_tSendMail_1, "ISO-8859-15", "plain");
					mp_tSendMail_1.addBodyPart(mbpText_tSendMail_1);

					javax.mail.internet.MimeBodyPart mbpFile_tSendMail_1 = null;

					for (int i_tSendMail_1 = 0; i_tSendMail_1 < attachments_tSendMail_1.size(); i_tSendMail_1++) {
						String filename_tSendMail_1 = attachments_tSendMail_1.get(i_tSendMail_1);
						javax.activation.FileDataSource fds_tSendMail_1 = null;
						java.io.File file_tSendMail_1 = new java.io.File(filename_tSendMail_1);

						if (file_tSendMail_1.isDirectory()) {
							java.io.File[] subFiles_tSendMail_1 = file_tSendMail_1.listFiles();
							for (java.io.File subFile_tSendMail_1 : subFiles_tSendMail_1) {
								if (subFile_tSendMail_1.isFile()) {
									fds_tSendMail_1 = new javax.activation.FileDataSource(
											subFile_tSendMail_1.getAbsolutePath());
									mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
									mbpFile_tSendMail_1
											.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1));
									mbpFile_tSendMail_1.setFileName(
											javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
									if (contentTransferEncoding_tSendMail_1.get(i_tSendMail_1)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
									}
									mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
								}
							}
						} else {
							mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
							fds_tSendMail_1 = new javax.activation.FileDataSource(filename_tSendMail_1);
							mbpFile_tSendMail_1.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1));
							mbpFile_tSendMail_1
									.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
							if (contentTransferEncoding_tSendMail_1.get(i_tSendMail_1).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
						}
					}
					// -- set the content --
					msg_tSendMail_1.setContent(mp_tSendMail_1);
					// add handlers for main MIME types
					javax.activation.MailcapCommandMap mc_tSendMail_1 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
							.getDefaultCommandMap();
					mc_tSendMail_1.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
					mc_tSendMail_1.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
					mc_tSendMail_1.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
					mc_tSendMail_1
							.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
					mc_tSendMail_1
							.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
					javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_1);
					// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
					com.sun.mail.handlers.text_plain text_plain_h_tSendMail_1 = null;
					// -- Send the message --
					javax.mail.Transport.send(msg_tSendMail_1);
				} catch (java.lang.Exception e) {
					globalMap.put("tSendMail_1_ERROR_MESSAGE", e.getMessage());

					throw (e);

				} finally {
					props_tSendMail_1.remove("mail.smtp.host");
					props_tSendMail_1.remove("mail.smtp.port");

					props_tSendMail_1.remove("mail.mime.encodefilename");

					props_tSendMail_1.remove("mail.smtp.auth");
				}

				tos_count_tSendMail_1++;

				/**
				 * [tSendMail_1 main ] stop
				 */

				/**
				 * [tSendMail_1 process_data_begin ] start
				 */

				currentComponent = "tSendMail_1";

				/**
				 * [tSendMail_1 process_data_begin ] stop
				 */

				/**
				 * [tSendMail_1 process_data_end ] start
				 */

				currentComponent = "tSendMail_1";

				/**
				 * [tSendMail_1 process_data_end ] stop
				 */

				/**
				 * [tSendMail_1 end ] start
				 */

				currentComponent = "tSendMail_1";

				if (log.isDebugEnabled())
					log.debug("tSendMail_1 - " + ("Done."));

				ok_Hash.put("tSendMail_1", true);
				end_Hash.put("tSendMail_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);

				/**
				 * [tSendMail_1 end ] stop
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
				 * [tSendMail_1 finally ] start
				 */

				currentComponent = "tSendMail_1";

				/**
				 * [tSendMail_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSendMail_1_SUBPROCESS_STATE", 1);
	}

	public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

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
				 * [tChronometerStop_1 begin ] start
				 */

				ok_Hash.put("tChronometerStop_1", false);
				start_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				currentComponent = "tChronometerStop_1";

				int tos_count_tChronometerStop_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tChronometerStop_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tChronometerStop_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tChronometerStop_1 = new StringBuilder();
							log4jParamters_tChronometerStop_1.append("Parameters:");
							log4jParamters_tChronometerStop_1.append("SINCE_BEGINNING" + " = " + "true");
							log4jParamters_tChronometerStop_1.append(" | ");
							log4jParamters_tChronometerStop_1.append("SINCE_STARTER" + " = " + "false");
							log4jParamters_tChronometerStop_1.append(" | ");
							log4jParamters_tChronometerStop_1.append("DISPLAY" + " = " + "true");
							log4jParamters_tChronometerStop_1.append(" | ");
							log4jParamters_tChronometerStop_1.append("DISPLAY_COMPONENT_NAME" + " = " + "true");
							log4jParamters_tChronometerStop_1.append(" | ");
							log4jParamters_tChronometerStop_1.append("CAPTION" + " = " + "\"\"");
							log4jParamters_tChronometerStop_1.append(" | ");
							log4jParamters_tChronometerStop_1.append("DISPLAY_READABLE_DURATION" + " = " + "false");
							log4jParamters_tChronometerStop_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tChronometerStop_1 - " + (log4jParamters_tChronometerStop_1));
						}
					}
					new BytesLimit65535_tChronometerStop_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tChronometerStop_1", "STOP", "tChronometerStop");
					talendJobLogProcess(globalMap);
				}

				long timetChronometerStop_1;

				log.info("tChronometerStop_1 - Stop time: " + System.currentTimeMillis() + " milliseconds");

				timetChronometerStop_1 = System.currentTimeMillis() - startTime;

				log.info("tChronometerStop_1 - Duration since job start: " + timetChronometerStop_1 + " milliseconds");

				System.out.print("[ tChronometerStop_1 ]  ");

				System.out.println("" + "  " + timetChronometerStop_1 + " milliseconds");

				log.info("tChronometerStop_1 - " + "" + "  " + timetChronometerStop_1 + " milliseconds");

				Long currentTimetChronometerStop_1 = System.currentTimeMillis();
				globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);

				log.info("tChronometerStop_1 - Current time " + currentTimetChronometerStop_1 + " milliseconds");

				globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
				globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);

				/**
				 * [tChronometerStop_1 begin ] stop
				 */

				/**
				 * [tChronometerStop_1 main ] start
				 */

				currentComponent = "tChronometerStop_1";

				tos_count_tChronometerStop_1++;

				/**
				 * [tChronometerStop_1 main ] stop
				 */

				/**
				 * [tChronometerStop_1 process_data_begin ] start
				 */

				currentComponent = "tChronometerStop_1";

				/**
				 * [tChronometerStop_1 process_data_begin ] stop
				 */

				/**
				 * [tChronometerStop_1 process_data_end ] start
				 */

				currentComponent = "tChronometerStop_1";

				/**
				 * [tChronometerStop_1 process_data_end ] stop
				 */

				/**
				 * [tChronometerStop_1 end ] start
				 */

				currentComponent = "tChronometerStop_1";

				if (log.isDebugEnabled())
					log.debug("tChronometerStop_1 - " + ("Done."));

				ok_Hash.put("tChronometerStop_1", true);
				end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk24", 0, "ok");
				}
				tFixedFlowInput_1Process(globalMap);

				/**
				 * [tChronometerStop_1 end ] stop
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
				 * [tChronometerStop_1 finally ] start
				 */

				currentComponent = "tChronometerStop_1";

				/**
				 * [tChronometerStop_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}

	public static class Log_OutStruct implements routines.system.IPersistableRow<Log_OutStruct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public String TaskName;

		public String getTaskName() {
			return this.TaskName;
		}

		public String TaskDetail;

		public String getTaskDetail() {
			return this.TaskDetail;
		}

		public String TaskType;

		public String getTaskType() {
			return this.TaskType;
		}

		public String StartDate;

		public String getStartDate() {
			return this.StartDate;
		}

		public String Duration;

		public String getDuration() {
			return this.Duration;
		}

		public String EndDate;

		public String getEndDate() {
			return this.EndDate;
		}

		public Integer NbFournisseur;

		public Integer getNbFournisseur() {
			return this.NbFournisseur;
		}

		public Integer ERROR_STATUT;

		public Integer getERROR_STATUT() {
			return this.ERROR_STATUT;
		}

		public Integer SUCCESS_STATUT;

		public Integer getSUCCESS_STATUT() {
			return this.SUCCESS_STATUT;
		}

		public String ERROR_MESSAGE;

		public String getERROR_MESSAGE() {
			return this.ERROR_MESSAGE;
		}

		public String FileNamePOutPut;

		public String getFileNamePOutPut() {
			return this.FileNamePOutPut;
		}

		public String SUCCESS_MESSAGE;

		public String getSUCCESS_MESSAGE() {
			return this.SUCCESS_MESSAGE;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.TaskName = readString(dis);

					this.TaskDetail = readString(dis);

					this.TaskType = readString(dis);

					this.StartDate = readString(dis);

					this.Duration = readString(dis);

					this.EndDate = readString(dis);

					this.NbFournisseur = readInteger(dis);

					this.ERROR_STATUT = readInteger(dis);

					this.SUCCESS_STATUT = readInteger(dis);

					this.ERROR_MESSAGE = readString(dis);

					this.FileNamePOutPut = readString(dis);

					this.SUCCESS_MESSAGE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.TaskName = readString(dis);

					this.TaskDetail = readString(dis);

					this.TaskType = readString(dis);

					this.StartDate = readString(dis);

					this.Duration = readString(dis);

					this.EndDate = readString(dis);

					this.NbFournisseur = readInteger(dis);

					this.ERROR_STATUT = readInteger(dis);

					this.SUCCESS_STATUT = readInteger(dis);

					this.ERROR_MESSAGE = readString(dis);

					this.FileNamePOutPut = readString(dis);

					this.SUCCESS_MESSAGE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TaskName, dos);

				// String

				writeString(this.TaskDetail, dos);

				// String

				writeString(this.TaskType, dos);

				// String

				writeString(this.StartDate, dos);

				// String

				writeString(this.Duration, dos);

				// String

				writeString(this.EndDate, dos);

				// Integer

				writeInteger(this.NbFournisseur, dos);

				// Integer

				writeInteger(this.ERROR_STATUT, dos);

				// Integer

				writeInteger(this.SUCCESS_STATUT, dos);

				// String

				writeString(this.ERROR_MESSAGE, dos);

				// String

				writeString(this.FileNamePOutPut, dos);

				// String

				writeString(this.SUCCESS_MESSAGE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.TaskName, dos);

				// String

				writeString(this.TaskDetail, dos);

				// String

				writeString(this.TaskType, dos);

				// String

				writeString(this.StartDate, dos);

				// String

				writeString(this.Duration, dos);

				// String

				writeString(this.EndDate, dos);

				// Integer

				writeInteger(this.NbFournisseur, dos);

				// Integer

				writeInteger(this.ERROR_STATUT, dos);

				// Integer

				writeInteger(this.SUCCESS_STATUT, dos);

				// String

				writeString(this.ERROR_MESSAGE, dos);

				// String

				writeString(this.FileNamePOutPut, dos);

				// String

				writeString(this.SUCCESS_MESSAGE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TaskName=" + TaskName);
			sb.append(",TaskDetail=" + TaskDetail);
			sb.append(",TaskType=" + TaskType);
			sb.append(",StartDate=" + StartDate);
			sb.append(",Duration=" + Duration);
			sb.append(",EndDate=" + EndDate);
			sb.append(",NbFournisseur=" + String.valueOf(NbFournisseur));
			sb.append(",ERROR_STATUT=" + String.valueOf(ERROR_STATUT));
			sb.append(",SUCCESS_STATUT=" + String.valueOf(SUCCESS_STATUT));
			sb.append(",ERROR_MESSAGE=" + ERROR_MESSAGE);
			sb.append(",FileNamePOutPut=" + FileNamePOutPut);
			sb.append(",SUCCESS_MESSAGE=" + SUCCESS_MESSAGE);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TaskName == null) {
				sb.append("<null>");
			} else {
				sb.append(TaskName);
			}

			sb.append("|");

			if (TaskDetail == null) {
				sb.append("<null>");
			} else {
				sb.append(TaskDetail);
			}

			sb.append("|");

			if (TaskType == null) {
				sb.append("<null>");
			} else {
				sb.append(TaskType);
			}

			sb.append("|");

			if (StartDate == null) {
				sb.append("<null>");
			} else {
				sb.append(StartDate);
			}

			sb.append("|");

			if (Duration == null) {
				sb.append("<null>");
			} else {
				sb.append(Duration);
			}

			sb.append("|");

			if (EndDate == null) {
				sb.append("<null>");
			} else {
				sb.append(EndDate);
			}

			sb.append("|");

			if (NbFournisseur == null) {
				sb.append("<null>");
			} else {
				sb.append(NbFournisseur);
			}

			sb.append("|");

			if (ERROR_STATUT == null) {
				sb.append("<null>");
			} else {
				sb.append(ERROR_STATUT);
			}

			sb.append("|");

			if (SUCCESS_STATUT == null) {
				sb.append("<null>");
			} else {
				sb.append(SUCCESS_STATUT);
			}

			sb.append("|");

			if (ERROR_MESSAGE == null) {
				sb.append("<null>");
			} else {
				sb.append(ERROR_MESSAGE);
			}

			sb.append("|");

			if (FileNamePOutPut == null) {
				sb.append("<null>");
			} else {
				sb.append(FileNamePOutPut);
			}

			sb.append("|");

			if (SUCCESS_MESSAGE == null) {
				sb.append("<null>");
			} else {
				sb.append(SUCCESS_MESSAGE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(Log_OutStruct other) {

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

	public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public String StartDate;

		public String getStartDate() {
			return this.StartDate;
		}

		public Long Duration;

		public Long getDuration() {
			return this.Duration;
		}

		public String EndDate;

		public String getEndDate() {
			return this.EndDate;
		}

		public String TaskName;

		public String getTaskName() {
			return this.TaskName;
		}

		public String TaskDetail;

		public String getTaskDetail() {
			return this.TaskDetail;
		}

		public String TaskType;

		public String getTaskType() {
			return this.TaskType;
		}

		public Integer NbFournisseur;

		public Integer getNbFournisseur() {
			return this.NbFournisseur;
		}

		public Integer ERROR_STATUT;

		public Integer getERROR_STATUT() {
			return this.ERROR_STATUT;
		}

		public Integer SUCCESS_STATUT;

		public Integer getSUCCESS_STATUT() {
			return this.SUCCESS_STATUT;
		}

		public String ERROR_MESSAGE;

		public String getERROR_MESSAGE() {
			return this.ERROR_MESSAGE;
		}

		public String FileNamePOutPut;

		public String getFileNamePOutPut() {
			return this.FileNamePOutPut;
		}

		public String SUCCESS_MESSAGE;

		public String getSUCCESS_MESSAGE() {
			return this.SUCCESS_MESSAGE;
		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.StartDate = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.Duration = null;
					} else {
						this.Duration = dis.readLong();
					}

					this.EndDate = readString(dis);

					this.TaskName = readString(dis);

					this.TaskDetail = readString(dis);

					this.TaskType = readString(dis);

					this.NbFournisseur = readInteger(dis);

					this.ERROR_STATUT = readInteger(dis);

					this.SUCCESS_STATUT = readInteger(dis);

					this.ERROR_MESSAGE = readString(dis);

					this.FileNamePOutPut = readString(dis);

					this.SUCCESS_MESSAGE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.StartDate = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.Duration = null;
					} else {
						this.Duration = dis.readLong();
					}

					this.EndDate = readString(dis);

					this.TaskName = readString(dis);

					this.TaskDetail = readString(dis);

					this.TaskType = readString(dis);

					this.NbFournisseur = readInteger(dis);

					this.ERROR_STATUT = readInteger(dis);

					this.SUCCESS_STATUT = readInteger(dis);

					this.ERROR_MESSAGE = readString(dis);

					this.FileNamePOutPut = readString(dis);

					this.SUCCESS_MESSAGE = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.StartDate, dos);

				// Long

				if (this.Duration == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.Duration);
				}

				// String

				writeString(this.EndDate, dos);

				// String

				writeString(this.TaskName, dos);

				// String

				writeString(this.TaskDetail, dos);

				// String

				writeString(this.TaskType, dos);

				// Integer

				writeInteger(this.NbFournisseur, dos);

				// Integer

				writeInteger(this.ERROR_STATUT, dos);

				// Integer

				writeInteger(this.SUCCESS_STATUT, dos);

				// String

				writeString(this.ERROR_MESSAGE, dos);

				// String

				writeString(this.FileNamePOutPut, dos);

				// String

				writeString(this.SUCCESS_MESSAGE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.StartDate, dos);

				// Long

				if (this.Duration == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.Duration);
				}

				// String

				writeString(this.EndDate, dos);

				// String

				writeString(this.TaskName, dos);

				// String

				writeString(this.TaskDetail, dos);

				// String

				writeString(this.TaskType, dos);

				// Integer

				writeInteger(this.NbFournisseur, dos);

				// Integer

				writeInteger(this.ERROR_STATUT, dos);

				// Integer

				writeInteger(this.SUCCESS_STATUT, dos);

				// String

				writeString(this.ERROR_MESSAGE, dos);

				// String

				writeString(this.FileNamePOutPut, dos);

				// String

				writeString(this.SUCCESS_MESSAGE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("StartDate=" + StartDate);
			sb.append(",Duration=" + String.valueOf(Duration));
			sb.append(",EndDate=" + EndDate);
			sb.append(",TaskName=" + TaskName);
			sb.append(",TaskDetail=" + TaskDetail);
			sb.append(",TaskType=" + TaskType);
			sb.append(",NbFournisseur=" + String.valueOf(NbFournisseur));
			sb.append(",ERROR_STATUT=" + String.valueOf(ERROR_STATUT));
			sb.append(",SUCCESS_STATUT=" + String.valueOf(SUCCESS_STATUT));
			sb.append(",ERROR_MESSAGE=" + ERROR_MESSAGE);
			sb.append(",FileNamePOutPut=" + FileNamePOutPut);
			sb.append(",SUCCESS_MESSAGE=" + SUCCESS_MESSAGE);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (StartDate == null) {
				sb.append("<null>");
			} else {
				sb.append(StartDate);
			}

			sb.append("|");

			if (Duration == null) {
				sb.append("<null>");
			} else {
				sb.append(Duration);
			}

			sb.append("|");

			if (EndDate == null) {
				sb.append("<null>");
			} else {
				sb.append(EndDate);
			}

			sb.append("|");

			if (TaskName == null) {
				sb.append("<null>");
			} else {
				sb.append(TaskName);
			}

			sb.append("|");

			if (TaskDetail == null) {
				sb.append("<null>");
			} else {
				sb.append(TaskDetail);
			}

			sb.append("|");

			if (TaskType == null) {
				sb.append("<null>");
			} else {
				sb.append(TaskType);
			}

			sb.append("|");

			if (NbFournisseur == null) {
				sb.append("<null>");
			} else {
				sb.append(NbFournisseur);
			}

			sb.append("|");

			if (ERROR_STATUT == null) {
				sb.append("<null>");
			} else {
				sb.append(ERROR_STATUT);
			}

			sb.append("|");

			if (SUCCESS_STATUT == null) {
				sb.append("<null>");
			} else {
				sb.append(SUCCESS_STATUT);
			}

			sb.append("|");

			if (ERROR_MESSAGE == null) {
				sb.append("<null>");
			} else {
				sb.append(ERROR_MESSAGE);
			}

			sb.append("|");

			if (FileNamePOutPut == null) {
				sb.append("<null>");
			} else {
				sb.append(FileNamePOutPut);
			}

			sb.append("|");

			if (SUCCESS_MESSAGE == null) {
				sb.append("<null>");
			} else {
				sb.append(SUCCESS_MESSAGE);
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

	public void tFixedFlowInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFixedFlowInput_1_SUBPROCESS_STATE", 0);

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

				row9Struct row9 = new row9Struct();
				Log_OutStruct Log_Out = new Log_OutStruct();

				/**
				 * [tLogRow_1 begin ] start
				 */

				ok_Hash.put("tLogRow_1", false);
				start_Hash.put("tLogRow_1", System.currentTimeMillis());

				currentComponent = "tLogRow_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "Log_Out");

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
							log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_UNIQUE" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_LABEL" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_UNIQUE_LABEL" + " = " + "false");
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
					talendJobLog.addCM("tLogRow_1", "Job_Log", "tLogRow");
					talendJobLogProcess(globalMap);
				}

				///////////////////////

				class Util_tLogRow_1 {

					String[] des_top = { ".", "-" };

					String[] des_data = { "-", "+" };

					String[] des_frame = { "|" };

					public void printLine(StringBuilder sb, int titleWidth, int dataWidth) {

						sb.append("+");
						for (int i = 0; i < titleWidth + 2; i++)
							sb.append("-");
						sb.append("+");
						for (int i = 0; i < dataWidth + 2; i++)
							sb.append("-");
						sb.append("+" + "\n");
					}

					public String print(String[] row, int nbLine) {

						StringBuilder sb = new StringBuilder();

						String title = "#" + nbLine + ". " + "Job_Log";

						// step 1: get the max length of all the row[] member;
						int dataWidth = 5; // the length of the string "value"
						for (int i = 0; i < row.length; i++) {
							if (row[i] == null && 4 > dataWidth) {
								dataWidth = 4;
							} else if (row[i] != null && row[i].length() > dataWidth)
								dataWidth = row[i].length();
						}

						int titleWidth = 15;

						int totalWidth = dataWidth + titleWidth + 5;

						// step 2: print the header with line number
						sb.append(".");
						for (int i = 0; i < totalWidth; i++)
							sb.append("-");
						sb.append("." + "\n" + "|");

						int emptyCenterWidth = (totalWidth - title.length()) / 2;
						for (int i = 0; i < emptyCenterWidth; i++)
							sb.append(" ");
						sb.append(title);
						for (int i = 0; i < totalWidth - emptyCenterWidth - title.length(); i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// step 3: print "key" and "value"
						printLine(sb, titleWidth, dataWidth);

						sb.append("|" + " key");
						for (int i = 0; i < titleWidth - 2; i++)
							sb.append(" ");
						sb.append("|" + " value");
						for (int i = 0; i < dataWidth - 4; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						printLine(sb, titleWidth, dataWidth);

						// step 4: print dataset

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "TaskName");
						for (int i = 0; i < titleWidth - "TaskName".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[0]);
						for (int i = 0; row[0] == null && i < dataWidth - 3
								|| row[0] != null && i < dataWidth - row[0].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "TaskDetail");
						for (int i = 0; i < titleWidth - "TaskDetail".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[1]);
						for (int i = 0; row[1] == null && i < dataWidth - 3
								|| row[1] != null && i < dataWidth - row[1].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "TaskType");
						for (int i = 0; i < titleWidth - "TaskType".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[2]);
						for (int i = 0; row[2] == null && i < dataWidth - 3
								|| row[2] != null && i < dataWidth - row[2].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "StartDate");
						for (int i = 0; i < titleWidth - "StartDate".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[3]);
						for (int i = 0; row[3] == null && i < dataWidth - 3
								|| row[3] != null && i < dataWidth - row[3].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "Duration");
						for (int i = 0; i < titleWidth - "Duration".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[4]);
						for (int i = 0; row[4] == null && i < dataWidth - 3
								|| row[4] != null && i < dataWidth - row[4].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "EndDate");
						for (int i = 0; i < titleWidth - "EndDate".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[5]);
						for (int i = 0; row[5] == null && i < dataWidth - 3
								|| row[5] != null && i < dataWidth - row[5].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "NbFournisseur");
						for (int i = 0; i < titleWidth - "NbFournisseur".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[6]);
						for (int i = 0; row[6] == null && i < dataWidth - 3
								|| row[6] != null && i < dataWidth - row[6].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "ERROR_STATUT");
						for (int i = 0; i < titleWidth - "ERROR_STATUT".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[7]);
						for (int i = 0; row[7] == null && i < dataWidth - 3
								|| row[7] != null && i < dataWidth - row[7].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "SUCCESS_STATUT");
						for (int i = 0; i < titleWidth - "SUCCESS_STATUT".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[8]);
						for (int i = 0; row[8] == null && i < dataWidth - 3
								|| row[8] != null && i < dataWidth - row[8].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "ERROR_MESSAGE");
						for (int i = 0; i < titleWidth - "ERROR_MESSAGE".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[9]);
						for (int i = 0; row[9] == null && i < dataWidth - 3
								|| row[9] != null && i < dataWidth - row[9].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "FileNamePOutPut");
						for (int i = 0; i < titleWidth - "FileNamePOutPut".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[10]);
						for (int i = 0; row[10] == null && i < dataWidth - 3
								|| row[10] != null && i < dataWidth - row[10].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "SUCCESS_MESSAGE");
						for (int i = 0; i < titleWidth - "SUCCESS_MESSAGE".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[11]);
						for (int i = 0; row[11] == null && i < dataWidth - 3
								|| row[11] != null && i < dataWidth - row[11].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// step 5: print a line gap
						printLine(sb, titleWidth, dataWidth);
						return sb.toString();

					}

				}

				Util_tLogRow_1 util_tLogRow_1 = new Util_tLogRow_1();

				java.io.PrintStream consoleOut_tLogRow_1 = null;
				if (globalMap.get("tLogRow_CONSOLE") != null) {
					consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
				} else {
					consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
					globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_1);
				}

				StringBuilder strBuffer_tLogRow_1 = null;
				int nb_line_tLogRow_1 = 0;
///////////////////////    			

				/**
				 * [tLogRow_1 begin ] stop
				 */

				/**
				 * [tMap_4 begin ] start
				 */

				ok_Hash.put("tMap_4", false);
				start_Hash.put("tMap_4", System.currentTimeMillis());

				currentComponent = "tMap_4";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row9");

				int tos_count_tMap_4 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_4 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_4 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_4 = new StringBuilder();
							log4jParamters_tMap_4.append("Parameters:");
							log4jParamters_tMap_4.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_4.append(" | ");
							log4jParamters_tMap_4.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_4.append(" | ");
							log4jParamters_tMap_4.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_4.append(" | ");
							log4jParamters_tMap_4.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_4.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_4 - " + (log4jParamters_tMap_4));
						}
					}
					new BytesLimit65535_tMap_4().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_4", "tMap_4", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row9_tMap_4 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_4__Struct {
				}
				Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_Log_Out_tMap_4 = 0;

				Log_OutStruct Log_Out_tmp = new Log_OutStruct();
// ###############################

				/**
				 * [tMap_4 begin ] stop
				 */

				/**
				 * [tFixedFlowInput_1 begin ] start
				 */

				ok_Hash.put("tFixedFlowInput_1", false);
				start_Hash.put("tFixedFlowInput_1", System.currentTimeMillis());

				currentComponent = "tFixedFlowInput_1";

				int tos_count_tFixedFlowInput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tFixedFlowInput_1", "", "tFixedFlowInput");
					talendJobLogProcess(globalMap);
				}

				for (int i_tFixedFlowInput_1 = 0; i_tFixedFlowInput_1 < 1; i_tFixedFlowInput_1++) {

					row9.StartDate = ((String) globalMap.get("CurrentDate"));

					row9.Duration = ((Long) globalMap.get("tChronometerStop_1_DURATION"));

					row9.EndDate = ((String) globalMap.get("CurrentDate2"));

					row9.TaskName = ((String) globalMap.get("TaskName"));

					row9.TaskDetail = ((String) globalMap.get("TaskDetail"));

					row9.TaskType = ((String) globalMap.get("TaskType"));

					row9.NbFournisseur = ((Integer) globalMap.get("tDBInput_3_NB_LINE"));

					row9.ERROR_STATUT = ((Integer) globalMap.get("tDie_1_DIE_CODE"));

					row9.SUCCESS_STATUT = ((Integer) globalMap.get("tWarn_1_WARN_CODE"));

					row9.ERROR_MESSAGE = ((String) globalMap.get("tDie_1_ERROR_MESSAGE"));

					row9.FileNamePOutPut = ((String) globalMap.get("tFileOutputDelimited_1_FILE_NAME"));

					row9.SUCCESS_MESSAGE = ((String) globalMap.get("tWarn_1_WARN_MESSAGES"));

					/**
					 * [tFixedFlowInput_1 begin ] stop
					 */

					/**
					 * [tFixedFlowInput_1 main ] start
					 */

					currentComponent = "tFixedFlowInput_1";

					tos_count_tFixedFlowInput_1++;

					/**
					 * [tFixedFlowInput_1 main ] stop
					 */

					/**
					 * [tFixedFlowInput_1 process_data_begin ] start
					 */

					currentComponent = "tFixedFlowInput_1";

					/**
					 * [tFixedFlowInput_1 process_data_begin ] stop
					 */

					/**
					 * [tMap_4 main ] start
					 */

					currentComponent = "tMap_4";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row9", "tFixedFlowInput_1", "", "tFixedFlowInput", "tMap_4", "tMap_4", "tMap"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row9 - " + (row9 == null ? "" : row9.toLogString()));
					}

					boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;

					// ###############################
					// # Input tables (lookups)
					boolean rejectedInnerJoin_tMap_4 = false;
					boolean mainRowRejected_tMap_4 = false;

					// ###############################
					{ // start of Var scope

						// ###############################
						// # Vars tables

						Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
						// ###############################
						// # Output tables

						Log_Out = null;

// # Output table : 'Log_Out'
						count_Log_Out_tMap_4++;

						Log_Out_tmp.TaskName = row9.TaskName;
						Log_Out_tmp.TaskDetail = row9.TaskDetail;
						Log_Out_tmp.TaskType = row9.TaskType;
						Log_Out_tmp.StartDate = row9.StartDate;
						Log_Out_tmp.Duration = String.valueOf(row9.Duration / 1000 + "s");
						Log_Out_tmp.EndDate = row9.EndDate;
						Log_Out_tmp.NbFournisseur = row9.NbFournisseur;
						Log_Out_tmp.ERROR_STATUT = row9.ERROR_STATUT;
						Log_Out_tmp.SUCCESS_STATUT = row9.SUCCESS_STATUT;
						Log_Out_tmp.ERROR_MESSAGE = row9.ERROR_MESSAGE;
						Log_Out_tmp.FileNamePOutPut = row9.FileNamePOutPut;
						Log_Out_tmp.SUCCESS_MESSAGE = row9.SUCCESS_MESSAGE;
						Log_Out = Log_Out_tmp;
						log.debug("tMap_4 - Outputting the record " + count_Log_Out_tMap_4
								+ " of the output table 'Log_Out'.");

// ###############################

					} // end of Var scope

					rejectedInnerJoin_tMap_4 = false;

					tos_count_tMap_4++;

					/**
					 * [tMap_4 main ] stop
					 */

					/**
					 * [tMap_4 process_data_begin ] start
					 */

					currentComponent = "tMap_4";

					/**
					 * [tMap_4 process_data_begin ] stop
					 */
// Start of branch "Log_Out"
					if (Log_Out != null) {

						/**
						 * [tLogRow_1 main ] start
						 */

						currentComponent = "tLogRow_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "Log_Out", "tMap_4", "tMap_4", "tMap", "tLogRow_1", "Job_Log", "tLogRow"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("Log_Out - " + (Log_Out == null ? "" : Log_Out.toLogString()));
						}

///////////////////////		

						strBuffer_tLogRow_1 = new StringBuilder();

						if (Log_Out.TaskName != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.TaskName));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.TaskDetail != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.TaskDetail));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.TaskType != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.TaskType));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.StartDate != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.StartDate));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.Duration != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.Duration));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.EndDate != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.EndDate));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.NbFournisseur != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.NbFournisseur));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.ERROR_STATUT != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.ERROR_STATUT));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.SUCCESS_STATUT != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.SUCCESS_STATUT));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.ERROR_MESSAGE != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.ERROR_MESSAGE));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.FileNamePOutPut != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.FileNamePOutPut));

						} //

						strBuffer_tLogRow_1.append("|");

						if (Log_Out.SUCCESS_MESSAGE != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(Log_Out.SUCCESS_MESSAGE));

						} //

						String[] row_tLogRow_1 = new String[12];

						if (Log_Out.TaskName != null) { //
							row_tLogRow_1[0] = String.valueOf(Log_Out.TaskName);

						} //

						if (Log_Out.TaskDetail != null) { //
							row_tLogRow_1[1] = String.valueOf(Log_Out.TaskDetail);

						} //

						if (Log_Out.TaskType != null) { //
							row_tLogRow_1[2] = String.valueOf(Log_Out.TaskType);

						} //

						if (Log_Out.StartDate != null) { //
							row_tLogRow_1[3] = String.valueOf(Log_Out.StartDate);

						} //

						if (Log_Out.Duration != null) { //
							row_tLogRow_1[4] = String.valueOf(Log_Out.Duration);

						} //

						if (Log_Out.EndDate != null) { //
							row_tLogRow_1[5] = String.valueOf(Log_Out.EndDate);

						} //

						if (Log_Out.NbFournisseur != null) { //
							row_tLogRow_1[6] = String.valueOf(Log_Out.NbFournisseur);

						} //

						if (Log_Out.ERROR_STATUT != null) { //
							row_tLogRow_1[7] = String.valueOf(Log_Out.ERROR_STATUT);

						} //

						if (Log_Out.SUCCESS_STATUT != null) { //
							row_tLogRow_1[8] = String.valueOf(Log_Out.SUCCESS_STATUT);

						} //

						if (Log_Out.ERROR_MESSAGE != null) { //
							row_tLogRow_1[9] = String.valueOf(Log_Out.ERROR_MESSAGE);

						} //

						if (Log_Out.FileNamePOutPut != null) { //
							row_tLogRow_1[10] = String.valueOf(Log_Out.FileNamePOutPut);

						} //

						if (Log_Out.SUCCESS_MESSAGE != null) { //
							row_tLogRow_1[11] = String.valueOf(Log_Out.SUCCESS_MESSAGE);

						} //

						nb_line_tLogRow_1++;
						consoleOut_tLogRow_1.println(util_tLogRow_1.print(row_tLogRow_1, nb_line_tLogRow_1));
						consoleOut_tLogRow_1.flush();
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

					} // End of branch "Log_Out"

					/**
					 * [tMap_4 process_data_end ] start
					 */

					currentComponent = "tMap_4";

					/**
					 * [tMap_4 process_data_end ] stop
					 */

					/**
					 * [tFixedFlowInput_1 process_data_end ] start
					 */

					currentComponent = "tFixedFlowInput_1";

					/**
					 * [tFixedFlowInput_1 process_data_end ] stop
					 */

					/**
					 * [tFixedFlowInput_1 end ] start
					 */

					currentComponent = "tFixedFlowInput_1";

				}
				globalMap.put("tFixedFlowInput_1_NB_LINE", 1);

				ok_Hash.put("tFixedFlowInput_1", true);
				end_Hash.put("tFixedFlowInput_1", System.currentTimeMillis());

				/**
				 * [tFixedFlowInput_1 end ] stop
				 */

				/**
				 * [tMap_4 end ] start
				 */

				currentComponent = "tMap_4";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'Log_Out': " + count_Log_Out_tMap_4 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row9", 2, 0,
						"tFixedFlowInput_1", "", "tFixedFlowInput", "tMap_4", "tMap_4", "tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_4 - " + ("Done."));

				ok_Hash.put("tMap_4", true);
				end_Hash.put("tMap_4", System.currentTimeMillis());

				/**
				 * [tMap_4 end ] stop
				 */

				/**
				 * [tLogRow_1 end ] start
				 */

				currentComponent = "tLogRow_1";

//////
//////
				globalMap.put("tLogRow_1_NB_LINE", nb_line_tLogRow_1);
				if (log.isInfoEnabled())
					log.info("tLogRow_1 - " + ("Printed row count: ") + (nb_line_tLogRow_1) + ("."));

///////////////////////    			

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "Log_Out", 2, 0,
						"tMap_4", "tMap_4", "tMap", "tLogRow_1", "Job_Log", "tLogRow", "output")) {
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

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tFixedFlowInput_1 finally ] start
				 */

				currentComponent = "tFixedFlowInput_1";

				/**
				 * [tFixedFlowInput_1 finally ] stop
				 */

				/**
				 * [tMap_4 finally ] start
				 */

				currentComponent = "tMap_4";

				/**
				 * [tMap_4 finally ] stop
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

		globalMap.put("tFixedFlowInput_1_SUBPROCESS_STATE", 1);
	}

	public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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

	public void tHashInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tHashInput_2_SUBPROCESS_STATE", 0);

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
				// source node:tHashInput_2 - inputs:(after_tDBInput_1) outputs:(row5,row5) |
				// target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
				// linked node: tMap_1 - inputs:(Nbr_lignes_gold,row5) outputs:(out1,fouci)

				org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.ALL_MATCHES;

				org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = org.talend.designer.components.lookup.memory.AdvancedMemoryLookup
						.<row5Struct>getLookup(matchingModeEnum_row5);

				globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);

				/**
				 * [tAdvancedHash_row5 begin ] stop
				 */

				/**
				 * [tHashInput_2 begin ] start
				 */

				ok_Hash.put("tHashInput_2", false);
				start_Hash.put("tHashInput_2", System.currentTimeMillis());

				currentComponent = "tHashInput_2";

				int tos_count_tHashInput_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tHashInput_2", "FOURNISSEUR", "tHashInput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tHashInput_2 = 0;

				org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_2 = org.talend.designer.components.hashfile.common.MapHashFile
						.getMapHashFile();
				org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct> tHashFile_tHashInput_2 = mf_tHashInput_2
						.getAdvancedMemoryHashFile("tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_1");
				if (tHashFile_tHashInput_2 == null) {
					throw new RuntimeException(
							"The hash is not initialized : The hash must exist before you read from it");
				}
				java.util.Iterator<row3Struct> iterator_tHashInput_2 = tHashFile_tHashInput_2.iterator();
				while (iterator_tHashInput_2.hasNext()) {
					row3Struct next_tHashInput_2 = iterator_tHashInput_2.next();

					row5.FOUCFIN = next_tHashInput_2.FOUCFIN;
					row5.LIBFRS = next_tHashInput_2.LIBFRS;
					row5.FOUCNUF = next_tHashInput_2.FOUCNUF;

					/**
					 * [tHashInput_2 begin ] stop
					 */

					/**
					 * [tHashInput_2 main ] start
					 */

					currentComponent = "tHashInput_2";

					tos_count_tHashInput_2++;

					/**
					 * [tHashInput_2 main ] stop
					 */

					/**
					 * [tHashInput_2 process_data_begin ] start
					 */

					currentComponent = "tHashInput_2";

					/**
					 * [tHashInput_2 process_data_begin ] stop
					 */

					/**
					 * [tAdvancedHash_row5 main ] start
					 */

					currentComponent = "tAdvancedHash_row5";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row5", "tHashInput_2", "FOURNISSEUR", "tHashInput", "tAdvancedHash_row5",
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
					 * [tHashInput_2 process_data_end ] start
					 */

					currentComponent = "tHashInput_2";

					/**
					 * [tHashInput_2 process_data_end ] stop
					 */

					/**
					 * [tHashInput_2 end ] start
					 */

					currentComponent = "tHashInput_2";

					nb_line_tHashInput_2++;
				}

				org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap
						.remove("tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_1");

				globalMap.put("tHashInput_2_NB_LINE", nb_line_tHashInput_2);

				ok_Hash.put("tHashInput_2", true);
				end_Hash.put("tHashInput_2", System.currentTimeMillis());

				/**
				 * [tHashInput_2 end ] stop
				 */

				/**
				 * [tAdvancedHash_row5 end ] start
				 */

				currentComponent = "tAdvancedHash_row5";

				tHash_Lookup_row5.endPut();

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row5", 2, 0,
						"tHashInput_2", "FOURNISSEUR", "tHashInput", "tAdvancedHash_row5", "tAdvancedHash_row5",
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
				 * [tHashInput_2 finally ] start
				 */

				currentComponent = "tHashInput_2";

				/**
				 * [tHashInput_2 finally ] stop
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

		globalMap.put("tHashInput_2_SUBPROCESS_STATE", 1);
	}

	public static class row7Struct implements routines.system.IPersistableComparableLookupRow<row7Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
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

		public Integer COUNTFRN;

		public Integer getCOUNTFRN() {
			return this.COUNTFRN;
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
			final row7Struct other = (row7Struct) obj;

			if (this.FOUCFIN == null) {
				if (other.FOUCFIN != null)
					return false;

			} else if (!this.FOUCFIN.equals(other.FOUCFIN))

				return false;

			return true;
		}

		public void copyDataTo(row7Struct other) {

			other.FOUCFIN = this.FOUCFIN;
			other.LIBFRS = this.LIBFRS;
			other.FOUCNUF = this.FOUCNUF;
			other.COUNTFRN = this.COUNTFRN;

		}

		public void copyKeysDataTo(row7Struct other) {

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

		private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException {
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

		private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller)
				throws IOException {
			Integer intReturn;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = unmarshaller.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller)
				throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		public void readKeysData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.FOUCFIN = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

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

				this.COUNTFRN = readInteger(dis, ois);

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
			try {
				int length = 0;

				this.LIBFRS = readString(dis, objectIn);

				this.FOUCNUF = readString(dis, objectIn);

				this.COUNTFRN = readInteger(dis, objectIn);

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

				writeInteger(this.COUNTFRN, dos, oos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut) {
			try {

				writeString(this.LIBFRS, dos, objectOut);

				writeString(this.FOUCNUF, dos, objectOut);

				writeInteger(this.COUNTFRN, dos, objectOut);

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
		public int compareTo(row7Struct other) {

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

	public void tHashInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tHashInput_3_SUBPROCESS_STATE", 0);

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

				row7Struct row7 = new row7Struct();

				/**
				 * [tAdvancedHash_row7 begin ] start
				 */

				ok_Hash.put("tAdvancedHash_row7", false);
				start_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());

				currentComponent = "tAdvancedHash_row7";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row7");

				int tos_count_tAdvancedHash_row7 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tAdvancedHash_row7", "tAdvancedHash_row7", "tAdvancedHash");
					talendJobLogProcess(globalMap);
				}

				// connection name:row7
				// source node:tHashInput_3 - inputs:(after_tHashInput_1) outputs:(row7,row7) |
				// target node:tAdvancedHash_row7 - inputs:(row7) outputs:()
				// linked node: tMap_3 - inputs:(row6,row7) outputs:(OUTFRN)

				org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row7 = org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;

				org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 = org.talend.designer.components.lookup.memory.AdvancedMemoryLookup
						.<row7Struct>getLookup(matchingModeEnum_row7);

				globalMap.put("tHash_Lookup_row7", tHash_Lookup_row7);

				/**
				 * [tAdvancedHash_row7 begin ] stop
				 */

				/**
				 * [tHashInput_3 begin ] start
				 */

				ok_Hash.put("tHashInput_3", false);
				start_Hash.put("tHashInput_3", System.currentTimeMillis());

				currentComponent = "tHashInput_3";

				int tos_count_tHashInput_3 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tHashInput_3", "COUNTFRN", "tHashInput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tHashInput_3 = 0;

				org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_3 = org.talend.designer.components.hashfile.common.MapHashFile
						.getMapHashFile();
				org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row4Struct> tHashFile_tHashInput_3 = mf_tHashInput_3
						.getAdvancedMemoryHashFile("tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_2");
				if (tHashFile_tHashInput_3 == null) {
					throw new RuntimeException(
							"The hash is not initialized : The hash must exist before you read from it");
				}
				java.util.Iterator<row4Struct> iterator_tHashInput_3 = tHashFile_tHashInput_3.iterator();
				while (iterator_tHashInput_3.hasNext()) {
					row4Struct next_tHashInput_3 = iterator_tHashInput_3.next();

					row7.FOUCFIN = next_tHashInput_3.FOUCFIN;
					row7.LIBFRS = next_tHashInput_3.FOULIB;
					row7.FOUCNUF = next_tHashInput_3.FOUCNUF;
					row7.COUNTFRN = next_tHashInput_3.COUNTFRN;

					/**
					 * [tHashInput_3 begin ] stop
					 */

					/**
					 * [tHashInput_3 main ] start
					 */

					currentComponent = "tHashInput_3";

					tos_count_tHashInput_3++;

					/**
					 * [tHashInput_3 main ] stop
					 */

					/**
					 * [tHashInput_3 process_data_begin ] start
					 */

					currentComponent = "tHashInput_3";

					/**
					 * [tHashInput_3 process_data_begin ] stop
					 */

					/**
					 * [tAdvancedHash_row7 main ] start
					 */

					currentComponent = "tAdvancedHash_row7";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row7", "tHashInput_3", "COUNTFRN", "tHashInput", "tAdvancedHash_row7",
							"tAdvancedHash_row7", "tAdvancedHash"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row7 - " + (row7 == null ? "" : row7.toLogString()));
					}

					row7Struct row7_HashRow = new row7Struct();

					row7_HashRow.FOUCFIN = row7.FOUCFIN;

					row7_HashRow.LIBFRS = row7.LIBFRS;

					row7_HashRow.FOUCNUF = row7.FOUCNUF;

					row7_HashRow.COUNTFRN = row7.COUNTFRN;

					tHash_Lookup_row7.put(row7_HashRow);

					tos_count_tAdvancedHash_row7++;

					/**
					 * [tAdvancedHash_row7 main ] stop
					 */

					/**
					 * [tAdvancedHash_row7 process_data_begin ] start
					 */

					currentComponent = "tAdvancedHash_row7";

					/**
					 * [tAdvancedHash_row7 process_data_begin ] stop
					 */

					/**
					 * [tAdvancedHash_row7 process_data_end ] start
					 */

					currentComponent = "tAdvancedHash_row7";

					/**
					 * [tAdvancedHash_row7 process_data_end ] stop
					 */

					/**
					 * [tHashInput_3 process_data_end ] start
					 */

					currentComponent = "tHashInput_3";

					/**
					 * [tHashInput_3 process_data_end ] stop
					 */

					/**
					 * [tHashInput_3 end ] start
					 */

					currentComponent = "tHashInput_3";

					nb_line_tHashInput_3++;
				}

				org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap
						.remove("tHashFile_TEMPLATE_TALEND_" + pid + "_tHashOutput_2");

				globalMap.put("tHashInput_3_NB_LINE", nb_line_tHashInput_3);

				ok_Hash.put("tHashInput_3", true);
				end_Hash.put("tHashInput_3", System.currentTimeMillis());

				/**
				 * [tHashInput_3 end ] stop
				 */

				/**
				 * [tAdvancedHash_row7 end ] start
				 */

				currentComponent = "tAdvancedHash_row7";

				tHash_Lookup_row7.endPut();

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row7", 2, 0,
						"tHashInput_3", "COUNTFRN", "tHashInput", "tAdvancedHash_row7", "tAdvancedHash_row7",
						"tAdvancedHash", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tAdvancedHash_row7", true);
				end_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());

				/**
				 * [tAdvancedHash_row7 end ] stop
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
				 * [tHashInput_3 finally ] start
				 */

				currentComponent = "tHashInput_3";

				/**
				 * [tHashInput_3 finally ] stop
				 */

				/**
				 * [tAdvancedHash_row7 finally ] start
				 */

				currentComponent = "tAdvancedHash_row7";

				/**
				 * [tAdvancedHash_row7 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tHashInput_3_SUBPROCESS_STATE", 1);
	}

	public static class row11Struct implements routines.system.IPersistableRow<row11Struct> {
		final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];
		static byte[] commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[0];

		public java.util.Date moment;

		public java.util.Date getMoment() {
			return this.moment;
		}

		public String pid;

		public String getPid() {
			return this.pid;
		}

		public String father_pid;

		public String getFather_pid() {
			return this.father_pid;
		}

		public String root_pid;

		public String getRoot_pid() {
			return this.root_pid;
		}

		public Long system_pid;

		public Long getSystem_pid() {
			return this.system_pid;
		}

		public String project;

		public String getProject() {
			return this.project;
		}

		public String job;

		public String getJob() {
			return this.job;
		}

		public String job_repository_id;

		public String getJob_repository_id() {
			return this.job_repository_id;
		}

		public String job_version;

		public String getJob_version() {
			return this.job_version;
		}

		public String context;

		public String getContext() {
			return this.context;
		}

		public String origin;

		public String getOrigin() {
			return this.origin;
		}

		public String label;

		public String getLabel() {
			return this.label;
		}

		public Integer count;

		public Integer getCount() {
			return this.count;
		}

		public Integer reference;

		public Integer getReference() {
			return this.reference;
		}

		public String thresholds;

		public String getThresholds() {
			return this.thresholds;
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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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
				if (length > commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length) {
					if (length < 1024 && commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND.length == 0) {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[1024];
					} else {
						commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length);
				strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_TEMPLATE_TALEND, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.moment = readDate(dis);

					this.pid = readString(dis);

					this.father_pid = readString(dis);

					this.root_pid = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.system_pid = null;
					} else {
						this.system_pid = dis.readLong();
					}

					this.project = readString(dis);

					this.job = readString(dis);

					this.job_repository_id = readString(dis);

					this.job_version = readString(dis);

					this.context = readString(dis);

					this.origin = readString(dis);

					this.label = readString(dis);

					this.count = readInteger(dis);

					this.reference = readInteger(dis);

					this.thresholds = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_BI_TEAM_PROJECTS_TEMPLATE_TALEND) {

				try {

					int length = 0;

					this.moment = readDate(dis);

					this.pid = readString(dis);

					this.father_pid = readString(dis);

					this.root_pid = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.system_pid = null;
					} else {
						this.system_pid = dis.readLong();
					}

					this.project = readString(dis);

					this.job = readString(dis);

					this.job_repository_id = readString(dis);

					this.job_version = readString(dis);

					this.context = readString(dis);

					this.origin = readString(dis);

					this.label = readString(dis);

					this.count = readInteger(dis);

					this.reference = readInteger(dis);

					this.thresholds = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				writeDate(this.moment, dos);

				// String

				writeString(this.pid, dos);

				// String

				writeString(this.father_pid, dos);

				// String

				writeString(this.root_pid, dos);

				// Long

				if (this.system_pid == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.system_pid);
				}

				// String

				writeString(this.project, dos);

				// String

				writeString(this.job, dos);

				// String

				writeString(this.job_repository_id, dos);

				// String

				writeString(this.job_version, dos);

				// String

				writeString(this.context, dos);

				// String

				writeString(this.origin, dos);

				// String

				writeString(this.label, dos);

				// Integer

				writeInteger(this.count, dos);

				// Integer

				writeInteger(this.reference, dos);

				// String

				writeString(this.thresholds, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// java.util.Date

				writeDate(this.moment, dos);

				// String

				writeString(this.pid, dos);

				// String

				writeString(this.father_pid, dos);

				// String

				writeString(this.root_pid, dos);

				// Long

				if (this.system_pid == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.system_pid);
				}

				// String

				writeString(this.project, dos);

				// String

				writeString(this.job, dos);

				// String

				writeString(this.job_repository_id, dos);

				// String

				writeString(this.job_version, dos);

				// String

				writeString(this.context, dos);

				// String

				writeString(this.origin, dos);

				// String

				writeString(this.label, dos);

				// Integer

				writeInteger(this.count, dos);

				// Integer

				writeInteger(this.reference, dos);

				// String

				writeString(this.thresholds, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("moment=" + String.valueOf(moment));
			sb.append(",pid=" + pid);
			sb.append(",father_pid=" + father_pid);
			sb.append(",root_pid=" + root_pid);
			sb.append(",system_pid=" + String.valueOf(system_pid));
			sb.append(",project=" + project);
			sb.append(",job=" + job);
			sb.append(",job_repository_id=" + job_repository_id);
			sb.append(",job_version=" + job_version);
			sb.append(",context=" + context);
			sb.append(",origin=" + origin);
			sb.append(",label=" + label);
			sb.append(",count=" + String.valueOf(count));
			sb.append(",reference=" + String.valueOf(reference));
			sb.append(",thresholds=" + thresholds);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (moment == null) {
				sb.append("<null>");
			} else {
				sb.append(moment);
			}

			sb.append("|");

			if (pid == null) {
				sb.append("<null>");
			} else {
				sb.append(pid);
			}

			sb.append("|");

			if (father_pid == null) {
				sb.append("<null>");
			} else {
				sb.append(father_pid);
			}

			sb.append("|");

			if (root_pid == null) {
				sb.append("<null>");
			} else {
				sb.append(root_pid);
			}

			sb.append("|");

			if (system_pid == null) {
				sb.append("<null>");
			} else {
				sb.append(system_pid);
			}

			sb.append("|");

			if (project == null) {
				sb.append("<null>");
			} else {
				sb.append(project);
			}

			sb.append("|");

			if (job == null) {
				sb.append("<null>");
			} else {
				sb.append(job);
			}

			sb.append("|");

			if (job_repository_id == null) {
				sb.append("<null>");
			} else {
				sb.append(job_repository_id);
			}

			sb.append("|");

			if (job_version == null) {
				sb.append("<null>");
			} else {
				sb.append(job_version);
			}

			sb.append("|");

			if (context == null) {
				sb.append("<null>");
			} else {
				sb.append(context);
			}

			sb.append("|");

			if (origin == null) {
				sb.append("<null>");
			} else {
				sb.append(origin);
			}

			sb.append("|");

			if (label == null) {
				sb.append("<null>");
			} else {
				sb.append(label);
			}

			sb.append("|");

			if (count == null) {
				sb.append("<null>");
			} else {
				sb.append(count);
			}

			sb.append("|");

			if (reference == null) {
				sb.append("<null>");
			} else {
				sb.append(reference);
			}

			sb.append("|");

			if (thresholds == null) {
				sb.append("<null>");
			} else {
				sb.append(thresholds);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row11Struct other) {

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

	public void tFlowMeterCatcher_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFlowMeterCatcher_1_SUBPROCESS_STATE", 0);

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

				row11Struct row11 = new row11Struct();

				/**
				 * [tLogRow_2 begin ] start
				 */

				ok_Hash.put("tLogRow_2", false);
				start_Hash.put("tLogRow_2", System.currentTimeMillis());

				currentComponent = "tLogRow_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row11");

				int tos_count_tLogRow_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tLogRow_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tLogRow_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tLogRow_2 = new StringBuilder();
							log4jParamters_tLogRow_2.append("Parameters:");
							log4jParamters_tLogRow_2.append("BASIC_MODE" + " = " + "false");
							log4jParamters_tLogRow_2.append(" | ");
							log4jParamters_tLogRow_2.append("TABLE_PRINT" + " = " + "false");
							log4jParamters_tLogRow_2.append(" | ");
							log4jParamters_tLogRow_2.append("VERTICAL" + " = " + "true");
							log4jParamters_tLogRow_2.append(" | ");
							log4jParamters_tLogRow_2.append("PRINT_UNIQUE" + " = " + "false");
							log4jParamters_tLogRow_2.append(" | ");
							log4jParamters_tLogRow_2.append("PRINT_LABEL" + " = " + "true");
							log4jParamters_tLogRow_2.append(" | ");
							log4jParamters_tLogRow_2.append("PRINT_UNIQUE_LABEL" + " = " + "false");
							log4jParamters_tLogRow_2.append(" | ");
							log4jParamters_tLogRow_2.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
							log4jParamters_tLogRow_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tLogRow_2 - " + (log4jParamters_tLogRow_2));
						}
					}
					new BytesLimit65535_tLogRow_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tLogRow_2", "Meter_Log", "tLogRow");
					talendJobLogProcess(globalMap);
				}

				///////////////////////

				class Util_tLogRow_2 {

					String[] des_top = { ".", "-" };

					String[] des_data = { "-", "+" };

					String[] des_frame = { "|" };

					public void printLine(StringBuilder sb, int titleWidth, int dataWidth) {

						sb.append("+");
						for (int i = 0; i < titleWidth + 2; i++)
							sb.append("-");
						sb.append("+");
						for (int i = 0; i < dataWidth + 2; i++)
							sb.append("-");
						sb.append("+" + "\n");
					}

					public String print(String[] row, int nbLine) {

						StringBuilder sb = new StringBuilder();

						String title = "#" + nbLine + ". " + "Meter_Log";

						// step 1: get the max length of all the row[] member;
						int dataWidth = 5; // the length of the string "value"
						for (int i = 0; i < row.length; i++) {
							if (row[i] == null && 4 > dataWidth) {
								dataWidth = 4;
							} else if (row[i] != null && row[i].length() > dataWidth)
								dataWidth = row[i].length();
						}

						int titleWidth = 9;

						int totalWidth = dataWidth + titleWidth + 5;

						// step 2: print the header with line number
						sb.append(".");
						for (int i = 0; i < totalWidth; i++)
							sb.append("-");
						sb.append("." + "\n" + "|");

						int emptyCenterWidth = (totalWidth - title.length()) / 2;
						for (int i = 0; i < emptyCenterWidth; i++)
							sb.append(" ");
						sb.append(title);
						for (int i = 0; i < totalWidth - emptyCenterWidth - title.length(); i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// step 3: print "key" and "value"
						printLine(sb, titleWidth, dataWidth);

						sb.append("|" + " key");
						for (int i = 0; i < titleWidth - 2; i++)
							sb.append(" ");
						sb.append("|" + " value");
						for (int i = 0; i < dataWidth - 4; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						printLine(sb, titleWidth, dataWidth);

						// step 4: print dataset

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "reference");
						for (int i = 0; i < titleWidth - "reference".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[0]);
						for (int i = 0; row[0] == null && i < dataWidth - 3
								|| row[0] != null && i < dataWidth - row[0].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// for(int i=0; i<row.length; i++){
						sb.append("| " + "count");
						for (int i = 0; i < titleWidth - "count".length() + 1; i++)
							sb.append(" ");
						sb.append("| " + row[1]);
						for (int i = 0; row[1] == null && i < dataWidth - 3
								|| row[1] != null && i < dataWidth - row[1].length() + 1; i++)
							sb.append(" ");
						sb.append("|" + "\n");

						// }

						// step 5: print a line gap
						printLine(sb, titleWidth, dataWidth);
						return sb.toString();

					}

				}

				Util_tLogRow_2 util_tLogRow_2 = new Util_tLogRow_2();

				java.io.PrintStream consoleOut_tLogRow_2 = null;
				if (globalMap.get("tLogRow_CONSOLE") != null) {
					consoleOut_tLogRow_2 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
				} else {
					consoleOut_tLogRow_2 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
					globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_2);
				}

				StringBuilder strBuffer_tLogRow_2 = null;
				int nb_line_tLogRow_2 = 0;
///////////////////////    			

				/**
				 * [tLogRow_2 begin ] stop
				 */

				/**
				 * [tFlowMeterCatcher_1 begin ] start
				 */

				ok_Hash.put("tFlowMeterCatcher_1", false);
				start_Hash.put("tFlowMeterCatcher_1", System.currentTimeMillis());

				currentComponent = "tFlowMeterCatcher_1";

				int tos_count_tFlowMeterCatcher_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFlowMeterCatcher_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFlowMeterCatcher_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFlowMeterCatcher_1 = new StringBuilder();
							log4jParamters_tFlowMeterCatcher_1.append("Parameters:");
							if (log.isDebugEnabled())
								log.debug("tFlowMeterCatcher_1 - " + (log4jParamters_tFlowMeterCatcher_1));
						}
					}
					new BytesLimit65535_tFlowMeterCatcher_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFlowMeterCatcher_1", "tFlowMeterCatcher_1", "tFlowMeterCatcher");
					talendJobLogProcess(globalMap);
				}

				for (MetterCatcherUtils.MetterCatcherMessage mcm : tFlowMeterCatcher_1.getMessages()) {
					row11.pid = pid;
					row11.root_pid = rootPid;
					row11.father_pid = fatherPid;
					row11.project = projectName;
					row11.job = jobName;
					row11.context = contextStr;
					row11.origin = (mcm.getOrigin() == null || mcm.getOrigin().length() < 1 ? null : mcm.getOrigin());
					row11.moment = mcm.getMoment();
					row11.job_version = mcm.getJobVersion();
					row11.job_repository_id = mcm.getJobId();
					row11.system_pid = mcm.getSystemPid();
					row11.label = mcm.getLabel();
					row11.count = mcm.getCount();
					row11.reference = tFlowMeterCatcher_1.getConnLinesCount(mcm.getReferense() + "_count");
					row11.thresholds = mcm.getThresholds();

					/**
					 * [tFlowMeterCatcher_1 begin ] stop
					 */

					/**
					 * [tFlowMeterCatcher_1 main ] start
					 */

					currentComponent = "tFlowMeterCatcher_1";

					tos_count_tFlowMeterCatcher_1++;

					/**
					 * [tFlowMeterCatcher_1 main ] stop
					 */

					/**
					 * [tFlowMeterCatcher_1 process_data_begin ] start
					 */

					currentComponent = "tFlowMeterCatcher_1";

					/**
					 * [tFlowMeterCatcher_1 process_data_begin ] stop
					 */

					/**
					 * [tLogRow_2 main ] start
					 */

					currentComponent = "tLogRow_2";

					if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

							, "row11", "tFlowMeterCatcher_1", "tFlowMeterCatcher_1", "tFlowMeterCatcher", "tLogRow_2",
							"Meter_Log", "tLogRow"

					)) {
						talendJobLogProcess(globalMap);
					}

					if (log.isTraceEnabled()) {
						log.trace("row11 - " + (row11 == null ? "" : row11.toLogString()));
					}

///////////////////////		

					strBuffer_tLogRow_2 = new StringBuilder();

					if (row11.reference != null) { //

						strBuffer_tLogRow_2.append(String.valueOf(row11.reference));

					} //

					strBuffer_tLogRow_2.append("|");

					if (row11.count != null) { //

						strBuffer_tLogRow_2.append(String.valueOf(row11.count));

					} //

					String[] row_tLogRow_2 = new String[2];

					if (row11.reference != null) { //
						row_tLogRow_2[0] = String.valueOf(row11.reference);

					} //

					if (row11.count != null) { //
						row_tLogRow_2[1] = String.valueOf(row11.count);

					} //

					nb_line_tLogRow_2++;
					consoleOut_tLogRow_2.println(util_tLogRow_2.print(row_tLogRow_2, nb_line_tLogRow_2));
					consoleOut_tLogRow_2.flush();
					log.info("tLogRow_2 - Content of row " + nb_line_tLogRow_2 + ": "
							+ TalendString.unionString("|", row_tLogRow_2));
//////

//////                    

///////////////////////    			

					tos_count_tLogRow_2++;

					/**
					 * [tLogRow_2 main ] stop
					 */

					/**
					 * [tLogRow_2 process_data_begin ] start
					 */

					currentComponent = "tLogRow_2";

					/**
					 * [tLogRow_2 process_data_begin ] stop
					 */

					/**
					 * [tLogRow_2 process_data_end ] start
					 */

					currentComponent = "tLogRow_2";

					/**
					 * [tLogRow_2 process_data_end ] stop
					 */

					/**
					 * [tFlowMeterCatcher_1 process_data_end ] start
					 */

					currentComponent = "tFlowMeterCatcher_1";

					/**
					 * [tFlowMeterCatcher_1 process_data_end ] stop
					 */

					/**
					 * [tFlowMeterCatcher_1 end ] start
					 */

					currentComponent = "tFlowMeterCatcher_1";

				}

				if (log.isDebugEnabled())
					log.debug("tFlowMeterCatcher_1 - " + ("Done."));

				ok_Hash.put("tFlowMeterCatcher_1", true);
				end_Hash.put("tFlowMeterCatcher_1", System.currentTimeMillis());

				/**
				 * [tFlowMeterCatcher_1 end ] stop
				 */

				/**
				 * [tLogRow_2 end ] start
				 */

				currentComponent = "tLogRow_2";

//////
//////
				globalMap.put("tLogRow_2_NB_LINE", nb_line_tLogRow_2);
				if (log.isInfoEnabled())
					log.info("tLogRow_2 - " + ("Printed row count: ") + (nb_line_tLogRow_2) + ("."));

///////////////////////    			

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row11", 2, 0,
						"tFlowMeterCatcher_1", "tFlowMeterCatcher_1", "tFlowMeterCatcher", "tLogRow_2", "Meter_Log",
						"tLogRow", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tLogRow_2 - " + ("Done."));

				ok_Hash.put("tLogRow_2", true);
				end_Hash.put("tLogRow_2", System.currentTimeMillis());

				/**
				 * [tLogRow_2 end ] stop
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
				 * [tFlowMeterCatcher_1 finally ] start
				 */

				currentComponent = "tFlowMeterCatcher_1";

				/**
				 * [tFlowMeterCatcher_1 finally ] stop
				 */

				/**
				 * [tLogRow_2 finally ] start
				 */

				currentComponent = "tLogRow_2";

				/**
				 * [tLogRow_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFlowMeterCatcher_1_SUBPROCESS_STATE", 1);
	}

	public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

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
				 * [tPostjob_1 begin ] start
				 */

				ok_Hash.put("tPostjob_1", false);
				start_Hash.put("tPostjob_1", System.currentTimeMillis());

				currentComponent = "tPostjob_1";

				int tos_count_tPostjob_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tPostjob_1", "tPostjob_1", "tPostjob");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tPostjob_1 begin ] stop
				 */

				/**
				 * [tPostjob_1 main ] start
				 */

				currentComponent = "tPostjob_1";

				tos_count_tPostjob_1++;

				/**
				 * [tPostjob_1 main ] stop
				 */

				/**
				 * [tPostjob_1 process_data_begin ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 process_data_begin ] stop
				 */

				/**
				 * [tPostjob_1 process_data_end ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 process_data_end ] stop
				 */

				/**
				 * [tPostjob_1 end ] start
				 */

				currentComponent = "tPostjob_1";

				ok_Hash.put("tPostjob_1", true);
				end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk13", 0, "ok");
				}
				tDBClose_2Process(globalMap);

				/**
				 * [tPostjob_1 end ] stop
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
				 * [tPostjob_1 finally ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}

	public void tDBClose_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBClose_2_SUBPROCESS_STATE", 0);

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
				 * [tDBClose_2 begin ] start
				 */

				ok_Hash.put("tDBClose_2", false);
				start_Hash.put("tDBClose_2", System.currentTimeMillis());

				currentComponent = "tDBClose_2";

				int tos_count_tDBClose_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBClose_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBClose_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBClose_2 = new StringBuilder();
							log4jParamters_tDBClose_2.append("Parameters:");
							log4jParamters_tDBClose_2.append("CONNECTION" + " = " + "tDBConnection_2");
							log4jParamters_tDBClose_2.append(" | ");
							log4jParamters_tDBClose_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleClose");
							log4jParamters_tDBClose_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_2 - " + (log4jParamters_tDBClose_2));
						}
					}
					new BytesLimit65535_tDBClose_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_2", "GOLD", "tOracleClose");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_2 begin ] stop
				 */

				/**
				 * [tDBClose_2 main ] start
				 */

				currentComponent = "tDBClose_2";

				java.sql.Connection conn_tDBClose_2 = (java.sql.Connection) globalMap.get("conn_tDBConnection_2");

				if (conn_tDBClose_2 != null && !conn_tDBClose_2.isClosed()) {

					log.debug("tDBClose_2 - Closing the connection 'tDBConnection_2' to the database.");

					conn_tDBClose_2.close();

					if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_tDBConnection_2"))
							&& routines.system.BundleUtils.inOSGi()) {
						Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").getMethod("checkedShutdown")
								.invoke(null, (Object[]) null);
					}

					log.debug("tDBClose_2 - Connection 'tDBConnection_2' to the database closed.");

				}

				tos_count_tDBClose_2++;

				/**
				 * [tDBClose_2 main ] stop
				 */

				/**
				 * [tDBClose_2 process_data_begin ] start
				 */

				currentComponent = "tDBClose_2";

				/**
				 * [tDBClose_2 process_data_begin ] stop
				 */

				/**
				 * [tDBClose_2 process_data_end ] start
				 */

				currentComponent = "tDBClose_2";

				/**
				 * [tDBClose_2 process_data_end ] stop
				 */

				/**
				 * [tDBClose_2 end ] start
				 */

				currentComponent = "tDBClose_2";

				if (log.isDebugEnabled())
					log.debug("tDBClose_2 - " + ("Done."));

				ok_Hash.put("tDBClose_2", true);
				end_Hash.put("tDBClose_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk14", 0, "ok");
				}
				tDBClose_3Process(globalMap);

				/**
				 * [tDBClose_2 end ] stop
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
				 * [tDBClose_2 finally ] start
				 */

				currentComponent = "tDBClose_2";

				/**
				 * [tDBClose_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBClose_2_SUBPROCESS_STATE", 1);
	}

	public void tDBClose_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBClose_3_SUBPROCESS_STATE", 0);

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
				 * [tDBClose_3 begin ] start
				 */

				ok_Hash.put("tDBClose_3", false);
				start_Hash.put("tDBClose_3", System.currentTimeMillis());

				currentComponent = "tDBClose_3";

				int tos_count_tDBClose_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBClose_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBClose_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBClose_3 = new StringBuilder();
							log4jParamters_tDBClose_3.append("Parameters:");
							log4jParamters_tDBClose_3.append("CONNECTION" + " = " + "tDBConnection_4");
							log4jParamters_tDBClose_3.append(" | ");
							log4jParamters_tDBClose_3.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlClose");
							log4jParamters_tDBClose_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_3 - " + (log4jParamters_tDBClose_3));
						}
					}
					new BytesLimit65535_tDBClose_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_3", "MSSERVER", "tMSSqlClose");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_3 begin ] stop
				 */

				/**
				 * [tDBClose_3 main ] start
				 */

				currentComponent = "tDBClose_3";

				java.sql.Connection conn_tDBClose_3 = (java.sql.Connection) globalMap.get("conn_tDBConnection_4");
				if (conn_tDBClose_3 != null && !conn_tDBClose_3.isClosed()) {
					if (log.isDebugEnabled())
						log.debug("tDBClose_3 - " + ("Closing the connection ") + ("conn_tDBConnection_4")
								+ (" to the database."));
					conn_tDBClose_3.close();
					if (log.isDebugEnabled())
						log.debug("tDBClose_3 - " + ("Connection ") + ("conn_tDBConnection_4")
								+ (" to the database has closed."));
				}

				tos_count_tDBClose_3++;

				/**
				 * [tDBClose_3 main ] stop
				 */

				/**
				 * [tDBClose_3 process_data_begin ] start
				 */

				currentComponent = "tDBClose_3";

				/**
				 * [tDBClose_3 process_data_begin ] stop
				 */

				/**
				 * [tDBClose_3 process_data_end ] start
				 */

				currentComponent = "tDBClose_3";

				/**
				 * [tDBClose_3 process_data_end ] stop
				 */

				/**
				 * [tDBClose_3 end ] start
				 */

				currentComponent = "tDBClose_3";

				if (log.isDebugEnabled())
					log.debug("tDBClose_3 - " + ("Done."));

				ok_Hash.put("tDBClose_3", true);
				end_Hash.put("tDBClose_3", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk15", 0, "ok");
				}
				tDBClose_4Process(globalMap);

				/**
				 * [tDBClose_3 end ] stop
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
				 * [tDBClose_3 finally ] start
				 */

				currentComponent = "tDBClose_3";

				/**
				 * [tDBClose_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBClose_3_SUBPROCESS_STATE", 1);
	}

	public void tDBClose_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBClose_4_SUBPROCESS_STATE", 0);

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
				 * [tDBClose_4 begin ] start
				 */

				ok_Hash.put("tDBClose_4", false);
				start_Hash.put("tDBClose_4", System.currentTimeMillis());

				currentComponent = "tDBClose_4";

				int tos_count_tDBClose_4 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBClose_4 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBClose_4 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBClose_4 = new StringBuilder();
							log4jParamters_tDBClose_4.append("Parameters:");
							log4jParamters_tDBClose_4.append("CONNECTION" + " = " + "tDBConnection_3");
							log4jParamters_tDBClose_4.append(" | ");
							log4jParamters_tDBClose_4.append("UNIFIED_COMPONENTS" + " = " + "tOracleClose");
							log4jParamters_tDBClose_4.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_4 - " + (log4jParamters_tDBClose_4));
						}
					}
					new BytesLimit65535_tDBClose_4().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_4", "ODS", "tOracleClose");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_4 begin ] stop
				 */

				/**
				 * [tDBClose_4 main ] start
				 */

				currentComponent = "tDBClose_4";

				java.sql.Connection conn_tDBClose_4 = (java.sql.Connection) globalMap.get("conn_tDBConnection_3");

				if (conn_tDBClose_4 != null && !conn_tDBClose_4.isClosed()) {

					log.debug("tDBClose_4 - Closing the connection 'tDBConnection_3' to the database.");

					conn_tDBClose_4.close();

					if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_tDBConnection_3"))
							&& routines.system.BundleUtils.inOSGi()) {
						Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").getMethod("checkedShutdown")
								.invoke(null, (Object[]) null);
					}

					log.debug("tDBClose_4 - Connection 'tDBConnection_3' to the database closed.");

				}

				tos_count_tDBClose_4++;

				/**
				 * [tDBClose_4 main ] stop
				 */

				/**
				 * [tDBClose_4 process_data_begin ] start
				 */

				currentComponent = "tDBClose_4";

				/**
				 * [tDBClose_4 process_data_begin ] stop
				 */

				/**
				 * [tDBClose_4 process_data_end ] start
				 */

				currentComponent = "tDBClose_4";

				/**
				 * [tDBClose_4 process_data_end ] stop
				 */

				/**
				 * [tDBClose_4 end ] start
				 */

				currentComponent = "tDBClose_4";

				if (log.isDebugEnabled())
					log.debug("tDBClose_4 - " + ("Done."));

				ok_Hash.put("tDBClose_4", true);
				end_Hash.put("tDBClose_4", System.currentTimeMillis());

				/**
				 * [tDBClose_4 end ] stop
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
				 * [tDBClose_4 finally ] start
				 */

				currentComponent = "tDBClose_4";

				/**
				 * [tDBClose_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBClose_4_SUBPROCESS_STATE", 1);
	}

	public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

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
				 * [tPrejob_1 begin ] start
				 */

				ok_Hash.put("tPrejob_1", false);
				start_Hash.put("tPrejob_1", System.currentTimeMillis());

				currentComponent = "tPrejob_1";

				int tos_count_tPrejob_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tPrejob_1 begin ] stop
				 */

				/**
				 * [tPrejob_1 main ] start
				 */

				currentComponent = "tPrejob_1";

				tos_count_tPrejob_1++;

				/**
				 * [tPrejob_1 main ] stop
				 */

				/**
				 * [tPrejob_1 process_data_begin ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_begin ] stop
				 */

				/**
				 * [tPrejob_1 process_data_end ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_end ] stop
				 */

				/**
				 * [tPrejob_1 end ] start
				 */

				currentComponent = "tPrejob_1";

				ok_Hash.put("tPrejob_1", true);
				end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBConnection_2Process(globalMap);

				/**
				 * [tPrejob_1 end ] stop
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
				 * [tPrejob_1 finally ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}

	public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

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
				 * [tDBConnection_2 begin ] start
				 */

				ok_Hash.put("tDBConnection_2", false);
				start_Hash.put("tDBConnection_2", System.currentTimeMillis());

				currentComponent = "tDBConnection_2";

				int tos_count_tDBConnection_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBConnection_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_2 = new StringBuilder();
							log4jParamters_tDBConnection_2.append("Parameters:");
							log4jParamters_tDBConnection_2.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("DB_VERSION" + " = " + "ORACLE_18");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("USE_TNS_FILE" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("HOST" + " = " + "context.host_gold");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PORT" + " = " + "context.port_gold");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("DBNAME" + " = " + "context.sid_gold");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("SCHEMA_DB" + " = " + "\"\"");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("USER" + " = " + "context.user_gold");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.mdp_gold))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleConnection");
							log4jParamters_tDBConnection_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_2 - " + (log4jParamters_tDBConnection_2));
						}
					}
					new BytesLimit65535_tDBConnection_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_2", "GOLD", "tOracleConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_2 = "jdbc:oracle:thin:@" + context.host_gold + ":" + context.port_gold + ":"
						+ context.sid_gold;
				globalMap.put("connectionType_" + "tDBConnection_2", "ORACLE_SID");
				String dbUser_tDBConnection_2 = context.user_gold;

				final String decryptedPassword_tDBConnection_2 = context.mdp_gold;
				String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;

				java.sql.Connection conn_tDBConnection_2 = null;

				String driverClass_tDBConnection_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class jdbcclazz_tDBConnection_2 = java.lang.Class.forName(driverClass_tDBConnection_2);
				globalMap.put("driverClass_tDBConnection_2", driverClass_tDBConnection_2);

				log.debug("tDBConnection_2 - Driver ClassName: " + driverClass_tDBConnection_2 + ".");

				log.debug("tDBConnection_2 - Connection attempt to '" + url_tDBConnection_2 + "' with the username '"
						+ dbUser_tDBConnection_2 + "'.");

				conn_tDBConnection_2 = java.sql.DriverManager.getConnection(url_tDBConnection_2, dbUser_tDBConnection_2,
						dbPwd_tDBConnection_2);
				log.debug("tDBConnection_2 - Connection to '" + url_tDBConnection_2 + "' has succeeded.");

				globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
				if (null != conn_tDBConnection_2) {

					log.debug("tDBConnection_2 - Connection is set auto commit to 'false'.");
					conn_tDBConnection_2.setAutoCommit(false);
				}
				globalMap.put("host_" + "tDBConnection_2", context.host_gold);
				globalMap.put("port_" + "tDBConnection_2", context.port_gold);
				globalMap.put("dbname_" + "tDBConnection_2", context.sid_gold);

				globalMap.put("dbschema_" + "tDBConnection_2", "");
				globalMap.put("username_" + "tDBConnection_2", context.user_gold);
				globalMap.put("password_" + "tDBConnection_2", dbPwd_tDBConnection_2);

				/**
				 * [tDBConnection_2 begin ] stop
				 */

				/**
				 * [tDBConnection_2 main ] start
				 */

				currentComponent = "tDBConnection_2";

				tos_count_tDBConnection_2++;

				/**
				 * [tDBConnection_2 main ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_2";

				/**
				 * [tDBConnection_2 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_end ] start
				 */

				currentComponent = "tDBConnection_2";

				/**
				 * [tDBConnection_2 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_2 end ] start
				 */

				currentComponent = "tDBConnection_2";

				if (log.isDebugEnabled())
					log.debug("tDBConnection_2 - " + ("Done."));

				ok_Hash.put("tDBConnection_2", true);
				end_Hash.put("tDBConnection_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBConnection_3Process(globalMap);

				/**
				 * [tDBConnection_2 end ] stop
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
				 * [tDBConnection_2 finally ] start
				 */

				currentComponent = "tDBConnection_2";

				/**
				 * [tDBConnection_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
	}

	public void tDBConnection_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_3_SUBPROCESS_STATE", 0);

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
				 * [tDBConnection_3 begin ] start
				 */

				ok_Hash.put("tDBConnection_3", false);
				start_Hash.put("tDBConnection_3", System.currentTimeMillis());

				currentComponent = "tDBConnection_3";

				int tos_count_tDBConnection_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBConnection_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_3 = new StringBuilder();
							log4jParamters_tDBConnection_3.append("Parameters:");
							log4jParamters_tDBConnection_3.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("DB_VERSION" + " = " + "ORACLE_18");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USE_TNS_FILE" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("HOST" + " = " + "context.host_ods");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PORT" + " = " + "context.port_ods");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("DBNAME" + " = " + "context.sid_ods");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("SCHEMA_DB" + " = " + "\"\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USER" + " = " + "context.user_ods");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.mdp_ods))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("UNIFIED_COMPONENTS" + " = " + "tOracleConnection");
							log4jParamters_tDBConnection_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_3 - " + (log4jParamters_tDBConnection_3));
						}
					}
					new BytesLimit65535_tDBConnection_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_3", "ODS", "tOracleConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_3 = "jdbc:oracle:thin:@" + context.host_ods + ":" + context.port_ods + ":"
						+ context.sid_ods;
				globalMap.put("connectionType_" + "tDBConnection_3", "ORACLE_SID");
				String dbUser_tDBConnection_3 = context.user_ods;

				final String decryptedPassword_tDBConnection_3 = context.mdp_ods;
				String dbPwd_tDBConnection_3 = decryptedPassword_tDBConnection_3;

				java.sql.Connection conn_tDBConnection_3 = null;

				String driverClass_tDBConnection_3 = "oracle.jdbc.OracleDriver";
				java.lang.Class jdbcclazz_tDBConnection_3 = java.lang.Class.forName(driverClass_tDBConnection_3);
				globalMap.put("driverClass_tDBConnection_3", driverClass_tDBConnection_3);

				log.debug("tDBConnection_3 - Driver ClassName: " + driverClass_tDBConnection_3 + ".");

				log.debug("tDBConnection_3 - Connection attempt to '" + url_tDBConnection_3 + "' with the username '"
						+ dbUser_tDBConnection_3 + "'.");

				conn_tDBConnection_3 = java.sql.DriverManager.getConnection(url_tDBConnection_3, dbUser_tDBConnection_3,
						dbPwd_tDBConnection_3);
				log.debug("tDBConnection_3 - Connection to '" + url_tDBConnection_3 + "' has succeeded.");

				globalMap.put("conn_tDBConnection_3", conn_tDBConnection_3);
				if (null != conn_tDBConnection_3) {

					log.debug("tDBConnection_3 - Connection is set auto commit to 'false'.");
					conn_tDBConnection_3.setAutoCommit(false);
				}
				globalMap.put("host_" + "tDBConnection_3", context.host_ods);
				globalMap.put("port_" + "tDBConnection_3", context.port_ods);
				globalMap.put("dbname_" + "tDBConnection_3", context.sid_ods);

				globalMap.put("dbschema_" + "tDBConnection_3", "");
				globalMap.put("username_" + "tDBConnection_3", context.user_ods);
				globalMap.put("password_" + "tDBConnection_3", dbPwd_tDBConnection_3);

				/**
				 * [tDBConnection_3 begin ] stop
				 */

				/**
				 * [tDBConnection_3 main ] start
				 */

				currentComponent = "tDBConnection_3";

				tos_count_tDBConnection_3++;

				/**
				 * [tDBConnection_3 main ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_3";

				/**
				 * [tDBConnection_3 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_end ] start
				 */

				currentComponent = "tDBConnection_3";

				/**
				 * [tDBConnection_3 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_3 end ] start
				 */

				currentComponent = "tDBConnection_3";

				if (log.isDebugEnabled())
					log.debug("tDBConnection_3 - " + ("Done."));

				ok_Hash.put("tDBConnection_3", true);
				end_Hash.put("tDBConnection_3", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBConnection_4Process(globalMap);

				/**
				 * [tDBConnection_3 end ] stop
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
				 * [tDBConnection_3 finally ] start
				 */

				currentComponent = "tDBConnection_3";

				/**
				 * [tDBConnection_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_3_SUBPROCESS_STATE", 1);
	}

	public void tDBConnection_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_4_SUBPROCESS_STATE", 0);

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
				 * [tDBConnection_4 begin ] start
				 */

				ok_Hash.put("tDBConnection_4", false);
				start_Hash.put("tDBConnection_4", System.currentTimeMillis());

				currentComponent = "tDBConnection_4";

				int tos_count_tDBConnection_4 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBConnection_4 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_4 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_4 = new StringBuilder();
							log4jParamters_tDBConnection_4.append("Parameters:");
							log4jParamters_tDBConnection_4.append("DRIVER" + " = " + "JTDS");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4
									.append("HOST" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Server");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4
									.append("PORT" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Port");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append("SCHEMA_DB" + " = " + "\"\"");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4
									.append("DBNAME" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Database");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4
									.append("USER" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Login");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append("PASS" + " = "
									+ String.valueOf(routines.system.PasswordEncryptUtil
											.encryptPassword(context.PORTAIL_FOURNISSEUR_AZURE_Password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append(
									"PROPERTIES" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append("SHARE_IDENTITY_SETTING" + " = " + "false");
							log4jParamters_tDBConnection_4.append(" | ");
							log4jParamters_tDBConnection_4.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlConnection");
							log4jParamters_tDBConnection_4.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_4 - " + (log4jParamters_tDBConnection_4));
						}
					}
					new BytesLimit65535_tDBConnection_4().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_4", "MSSERVER", "tMSSqlConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_4 = "jdbc:jtds:sqlserver://" + context.PORTAIL_FOURNISSEUR_AZURE_Server;
				String port_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Port;
				String dbname_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Database;
				if (!"".equals(port_tDBConnection_4)) {
					url_tDBConnection_4 += ":" + context.PORTAIL_FOURNISSEUR_AZURE_Port;
				}
				if (!"".equals(dbname_tDBConnection_4)) {

					url_tDBConnection_4 += "//" + context.PORTAIL_FOURNISSEUR_AZURE_Database;
				}

				url_tDBConnection_4 += ";appName=" + projectName + ";"
						+ context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;
				String dbUser_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Login;

				final String decryptedPassword_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Password;
				String dbPwd_tDBConnection_4 = decryptedPassword_tDBConnection_4;

				java.sql.Connection conn_tDBConnection_4 = null;

				String driverClass_tDBConnection_4 = "net.sourceforge.jtds.jdbc.Driver";
				java.lang.Class jdbcclazz_tDBConnection_4 = java.lang.Class.forName(driverClass_tDBConnection_4);
				globalMap.put("driverClass_tDBConnection_4", driverClass_tDBConnection_4);

				log.debug("tDBConnection_4 - Driver ClassName: " + driverClass_tDBConnection_4 + ".");

				log.debug("tDBConnection_4 - Connection attempt to '" + url_tDBConnection_4 + "' with the username '"
						+ dbUser_tDBConnection_4 + "'.");

				conn_tDBConnection_4 = java.sql.DriverManager.getConnection(url_tDBConnection_4, dbUser_tDBConnection_4,
						dbPwd_tDBConnection_4);
				log.debug("tDBConnection_4 - Connection to '" + url_tDBConnection_4 + "' has succeeded.");

				globalMap.put("conn_tDBConnection_4", conn_tDBConnection_4);
				if (null != conn_tDBConnection_4) {

					log.debug("tDBConnection_4 - Connection is set auto commit to 'false'.");
					conn_tDBConnection_4.setAutoCommit(false);
				}

				globalMap.put("dbschema_tDBConnection_4", "");

				globalMap.put("db_tDBConnection_4", context.PORTAIL_FOURNISSEUR_AZURE_Database);

				globalMap.put("shareIdentitySetting_tDBConnection_4", false);

				globalMap.put("driver_tDBConnection_4", "JTDS");

				/**
				 * [tDBConnection_4 begin ] stop
				 */

				/**
				 * [tDBConnection_4 main ] start
				 */

				currentComponent = "tDBConnection_4";

				tos_count_tDBConnection_4++;

				/**
				 * [tDBConnection_4 main ] stop
				 */

				/**
				 * [tDBConnection_4 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_4";

				/**
				 * [tDBConnection_4 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_4 process_data_end ] start
				 */

				currentComponent = "tDBConnection_4";

				/**
				 * [tDBConnection_4 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_4 end ] start
				 */

				currentComponent = "tDBConnection_4";

				if (log.isDebugEnabled())
					log.debug("tDBConnection_4 - " + ("Done."));

				ok_Hash.put("tDBConnection_4", true);
				end_Hash.put("tDBConnection_4", System.currentTimeMillis());

				/**
				 * [tDBConnection_4 end ] stop
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
				 * [tDBConnection_4 finally ] start
				 */

				currentComponent = "tDBConnection_4";

				/**
				 * [tDBConnection_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_4_SUBPROCESS_STATE", 1);
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
	public String contextStr = "KLIF";
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
		final TEMPLATE_TALEND TEMPLATE_TALENDClass = new TEMPLATE_TALEND();

		int exitCode = TEMPLATE_TALENDClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'TEMPLATE_TALEND' - Done.");
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
		log.info("TalendJob: 'TEMPLATE_TALEND' - Start.");

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
			java.io.InputStream inContext = TEMPLATE_TALEND.class.getClassLoader()
					.getResourceAsStream("bi_team_projects/template_talend_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = TEMPLATE_TALEND.class.getClassLoader()
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
					context.setContextType("host", "id_String");
					if (context.getStringValue("host") == null) {
						context.host = null;
					} else {
						context.host = (String) context.getProperty("host");
					}
					context.setContextType("sid", "id_String");
					if (context.getStringValue("sid") == null) {
						context.sid = null;
					} else {
						context.sid = (String) context.getProperty("sid");
					}
					context.setContextType("port", "id_String");
					if (context.getStringValue("port") == null) {
						context.port = null;
					} else {
						context.port = (String) context.getProperty("port");
					}
					context.setContextType("user", "id_String");
					if (context.getStringValue("user") == null) {
						context.user = null;
					} else {
						context.user = (String) context.getProperty("user");
					}
					context.setContextType("mdp", "id_Password");
					if (context.getStringValue("mdp") == null) {
						context.mdp = null;
					} else {
						String pwd_mdp_value = context.getProperty("mdp");
						context.mdp = null;
						if (pwd_mdp_value != null) {
							if (context_param.containsKey("mdp")) {// no need to decrypt if it come from program
																	// argument or parent job runtime
								context.mdp = pwd_mdp_value;
							} else if (!pwd_mdp_value.isEmpty()) {
								try {
									context.mdp = routines.system.PasswordEncryptUtil.decryptPassword(pwd_mdp_value);
									context.put("mdp", context.mdp);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("ENVIRONNEMENT", "id_String");
					if (context.getStringValue("ENVIRONNEMENT") == null) {
						context.ENVIRONNEMENT = null;
					} else {
						context.ENVIRONNEMENT = (String) context.getProperty("ENVIRONNEMENT");
					}
					context.setContextType("host_ods", "id_String");
					if (context.getStringValue("host_ods") == null) {
						context.host_ods = null;
					} else {
						context.host_ods = (String) context.getProperty("host_ods");
					}
					context.setContextType("sid_ods", "id_String");
					if (context.getStringValue("sid_ods") == null) {
						context.sid_ods = null;
					} else {
						context.sid_ods = (String) context.getProperty("sid_ods");
					}
					context.setContextType("port_ods", "id_String");
					if (context.getStringValue("port_ods") == null) {
						context.port_ods = null;
					} else {
						context.port_ods = (String) context.getProperty("port_ods");
					}
					context.setContextType("user_ods", "id_String");
					if (context.getStringValue("user_ods") == null) {
						context.user_ods = null;
					} else {
						context.user_ods = (String) context.getProperty("user_ods");
					}
					context.setContextType("mdp_ods", "id_Password");
					if (context.getStringValue("mdp_ods") == null) {
						context.mdp_ods = null;
					} else {
						String pwd_mdp_ods_value = context.getProperty("mdp_ods");
						context.mdp_ods = null;
						if (pwd_mdp_ods_value != null) {
							if (context_param.containsKey("mdp_ods")) {// no need to decrypt if it come from program
																		// argument or parent job runtime
								context.mdp_ods = pwd_mdp_ods_value;
							} else if (!pwd_mdp_ods_value.isEmpty()) {
								try {
									context.mdp_ods = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_mdp_ods_value);
									context.put("mdp_ods", context.mdp_ods);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("user_gold", "id_String");
					if (context.getStringValue("user_gold") == null) {
						context.user_gold = null;
					} else {
						context.user_gold = (String) context.getProperty("user_gold");
					}
					context.setContextType("sid_gold", "id_String");
					if (context.getStringValue("sid_gold") == null) {
						context.sid_gold = null;
					} else {
						context.sid_gold = (String) context.getProperty("sid_gold");
					}
					context.setContextType("port_gold", "id_String");
					if (context.getStringValue("port_gold") == null) {
						context.port_gold = null;
					} else {
						context.port_gold = (String) context.getProperty("port_gold");
					}
					context.setContextType("host_gold", "id_String");
					if (context.getStringValue("host_gold") == null) {
						context.host_gold = null;
					} else {
						context.host_gold = (String) context.getProperty("host_gold");
					}
					context.setContextType("mdp_gold", "id_Password");
					if (context.getStringValue("mdp_gold") == null) {
						context.mdp_gold = null;
					} else {
						String pwd_mdp_gold_value = context.getProperty("mdp_gold");
						context.mdp_gold = null;
						if (pwd_mdp_gold_value != null) {
							if (context_param.containsKey("mdp_gold")) {// no need to decrypt if it come from program
																		// argument or parent job runtime
								context.mdp_gold = pwd_mdp_gold_value;
							} else if (!pwd_mdp_gold_value.isEmpty()) {
								try {
									context.mdp_gold = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_mdp_gold_value);
									context.put("mdp_gold", context.mdp_gold);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Login", "id_String");
					if (context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Login") == null) {
						context.PORTAIL_FOURNISSEUR_AZURE_Login = null;
					} else {
						context.PORTAIL_FOURNISSEUR_AZURE_Login = (String) context
								.getProperty("PORTAIL_FOURNISSEUR_AZURE_Login");
					}
					context.setContextType("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams", "id_String");
					if (context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams") == null) {
						context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams = null;
					} else {
						context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams = (String) context
								.getProperty("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
					}
					context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Schema", "id_String");
					if (context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Schema") == null) {
						context.PORTAIL_FOURNISSEUR_AZURE_Schema = null;
					} else {
						context.PORTAIL_FOURNISSEUR_AZURE_Schema = (String) context
								.getProperty("PORTAIL_FOURNISSEUR_AZURE_Schema");
					}
					context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Server", "id_String");
					if (context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Server") == null) {
						context.PORTAIL_FOURNISSEUR_AZURE_Server = null;
					} else {
						context.PORTAIL_FOURNISSEUR_AZURE_Server = (String) context
								.getProperty("PORTAIL_FOURNISSEUR_AZURE_Server");
					}
					context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Port", "id_String");
					if (context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Port") == null) {
						context.PORTAIL_FOURNISSEUR_AZURE_Port = null;
					} else {
						context.PORTAIL_FOURNISSEUR_AZURE_Port = (String) context
								.getProperty("PORTAIL_FOURNISSEUR_AZURE_Port");
					}
					context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Password", "id_Password");
					if (context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Password") == null) {
						context.PORTAIL_FOURNISSEUR_AZURE_Password = null;
					} else {
						String pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value = context
								.getProperty("PORTAIL_FOURNISSEUR_AZURE_Password");
						context.PORTAIL_FOURNISSEUR_AZURE_Password = null;
						if (pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value != null) {
							if (context_param.containsKey("PORTAIL_FOURNISSEUR_AZURE_Password")) {// no need to decrypt
																									// if it come from
																									// program argument
																									// or parent job
																									// runtime
								context.PORTAIL_FOURNISSEUR_AZURE_Password = pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value;
							} else if (!pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value.isEmpty()) {
								try {
									context.PORTAIL_FOURNISSEUR_AZURE_Password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value);
									context.put("PORTAIL_FOURNISSEUR_AZURE_Password",
											context.PORTAIL_FOURNISSEUR_AZURE_Password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("ENV", "id_String");
					if (context.getStringValue("ENV") == null) {
						context.ENV = null;
					} else {
						context.ENV = (String) context.getProperty("ENV");
					}
					context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Database", "id_String");
					if (context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Database") == null) {
						context.PORTAIL_FOURNISSEUR_AZURE_Database = null;
					} else {
						context.PORTAIL_FOURNISSEUR_AZURE_Database = (String) context
								.getProperty("PORTAIL_FOURNISSEUR_AZURE_Database");
					}
					context.setContextType("PATH_VENTE_HEBDO", "id_String");
					if (context.getStringValue("PATH_VENTE_HEBDO") == null) {
						context.PATH_VENTE_HEBDO = null;
					} else {
						context.PATH_VENTE_HEBDO = (String) context.getProperty("PATH_VENTE_HEBDO");
					}
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
			if (parentContextMap.containsKey("host")) {
				context.host = (String) parentContextMap.get("host");
			}
			if (parentContextMap.containsKey("sid")) {
				context.sid = (String) parentContextMap.get("sid");
			}
			if (parentContextMap.containsKey("port")) {
				context.port = (String) parentContextMap.get("port");
			}
			if (parentContextMap.containsKey("user")) {
				context.user = (String) parentContextMap.get("user");
			}
			if (parentContextMap.containsKey("mdp")) {
				context.mdp = (java.lang.String) parentContextMap.get("mdp");
			}
			if (parentContextMap.containsKey("ENVIRONNEMENT")) {
				context.ENVIRONNEMENT = (String) parentContextMap.get("ENVIRONNEMENT");
			}
			if (parentContextMap.containsKey("host_ods")) {
				context.host_ods = (String) parentContextMap.get("host_ods");
			}
			if (parentContextMap.containsKey("sid_ods")) {
				context.sid_ods = (String) parentContextMap.get("sid_ods");
			}
			if (parentContextMap.containsKey("port_ods")) {
				context.port_ods = (String) parentContextMap.get("port_ods");
			}
			if (parentContextMap.containsKey("user_ods")) {
				context.user_ods = (String) parentContextMap.get("user_ods");
			}
			if (parentContextMap.containsKey("mdp_ods")) {
				context.mdp_ods = (java.lang.String) parentContextMap.get("mdp_ods");
			}
			if (parentContextMap.containsKey("user_gold")) {
				context.user_gold = (String) parentContextMap.get("user_gold");
			}
			if (parentContextMap.containsKey("sid_gold")) {
				context.sid_gold = (String) parentContextMap.get("sid_gold");
			}
			if (parentContextMap.containsKey("port_gold")) {
				context.port_gold = (String) parentContextMap.get("port_gold");
			}
			if (parentContextMap.containsKey("host_gold")) {
				context.host_gold = (String) parentContextMap.get("host_gold");
			}
			if (parentContextMap.containsKey("mdp_gold")) {
				context.mdp_gold = (java.lang.String) parentContextMap.get("mdp_gold");
			}
			if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Login")) {
				context.PORTAIL_FOURNISSEUR_AZURE_Login = (String) parentContextMap
						.get("PORTAIL_FOURNISSEUR_AZURE_Login");
			}
			if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams")) {
				context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams = (String) parentContextMap
						.get("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
			}
			if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Schema")) {
				context.PORTAIL_FOURNISSEUR_AZURE_Schema = (String) parentContextMap
						.get("PORTAIL_FOURNISSEUR_AZURE_Schema");
			}
			if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Server")) {
				context.PORTAIL_FOURNISSEUR_AZURE_Server = (String) parentContextMap
						.get("PORTAIL_FOURNISSEUR_AZURE_Server");
			}
			if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Port")) {
				context.PORTAIL_FOURNISSEUR_AZURE_Port = (String) parentContextMap
						.get("PORTAIL_FOURNISSEUR_AZURE_Port");
			}
			if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Password")) {
				context.PORTAIL_FOURNISSEUR_AZURE_Password = (java.lang.String) parentContextMap
						.get("PORTAIL_FOURNISSEUR_AZURE_Password");
			}
			if (parentContextMap.containsKey("ENV")) {
				context.ENV = (String) parentContextMap.get("ENV");
			}
			if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Database")) {
				context.PORTAIL_FOURNISSEUR_AZURE_Database = (String) parentContextMap
						.get("PORTAIL_FOURNISSEUR_AZURE_Database");
			}
			if (parentContextMap.containsKey("PATH_VENTE_HEBDO")) {
				context.PATH_VENTE_HEBDO = (String) parentContextMap.get("PATH_VENTE_HEBDO");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		parametersToEncrypt.add("mdp");
		parametersToEncrypt.add("mdp_ods");
		parametersToEncrypt.add("mdp_gold");
		parametersToEncrypt.add("PORTAIL_FOURNISSEUR_AZURE_Password");
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

		try {
			errorCode = null;
			tPrejob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPrejob_1) {
			globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

			e_tPrejob_1.printStackTrace();

		}

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
			tChronometerStart_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tChronometerStart_1) {
			globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", -1);

			e_tChronometerStart_1.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		try {
			errorCode = null;
			tPostjob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPostjob_1) {
			globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

			e_tPostjob_1.printStackTrace();

		}

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println(
					(endUsedMemory - startUsedMemory) + " bytes memory increase when running : TEMPLATE_TALEND");
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
			obj_conn = globalMap.remove("conn_tDBConnection_2");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
			obj_conn = globalMap.remove("conn_tDBConnection_3");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
			obj_conn = globalMap.remove("conn_tDBConnection_1");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
			obj_conn = globalMap.remove("conn_tDBConnection_4");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
			obj_conn = globalMap.remove("conn_tDBConnection_2");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
			obj_conn = globalMap.remove("conn_tDBConnection_3");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
		connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));
		connections.put("conn_tDBConnection_3", globalMap.get("conn_tDBConnection_3"));
		connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
		connections.put("conn_tDBConnection_4", globalMap.get("conn_tDBConnection_4"));
		connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));
		connections.put("conn_tDBConnection_3", globalMap.get("conn_tDBConnection_3"));

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
 * 660695 characters generated by Talend Cloud Data Management Platform on the
 * 27 juillet 2022 à 15:48:46 WEST
 ************************************************************************************************/