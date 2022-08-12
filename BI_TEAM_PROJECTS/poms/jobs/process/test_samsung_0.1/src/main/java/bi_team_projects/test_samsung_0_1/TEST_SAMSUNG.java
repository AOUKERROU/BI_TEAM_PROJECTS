
package bi_team_projects.test_samsung_0_1;

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

//the import part of tJava_1
//import java.util.List;

@SuppressWarnings("unused")

/**
 * Job: TEST_SAMSUNG Purpose: <br>
 * Description: <br>
 * 
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status
 */
public class TEST_SAMSUNG implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "TEST_SAMSUNG.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(TEST_SAMSUNG.class);

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
	private final String jobName = "TEST_SAMSUNG";
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
			"_YS0hgAzyEe2IX-E-61NGPg", "0.1");
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
					TEST_SAMSUNG.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(TEST_SAMSUNG.this, new Object[] { e, currentComponent, globalMap });
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

	public void tFTPConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		try {

			if (this.execStat) {
				runStat.updateStatOnConnection("OnComponentError1", 0, "error");
			}

			errorCode = null;
			tJava_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		tFTPConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPPut_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFTPPut_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPPut_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFTPPut_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tJava_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPPut_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPPut_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 0);

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
				 * [tFTPConnection_1 begin ] start
				 */

				ok_Hash.put("tFTPConnection_1", false);
				start_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				currentComponent = "tFTPConnection_1";

				int tos_count_tFTPConnection_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFTPConnection_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFTPConnection_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFTPConnection_1 = new StringBuilder();
							log4jParamters_tFTPConnection_1.append("Parameters:");
							log4jParamters_tFTPConnection_1.append("HOST" + " = " + "\"192.168.9.205\"");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("PORT" + " = " + "22");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USER" + " = " + "\"edi\"");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:ZNBVpN2AKkVYGkwoIolRkvbbSX4P+zduljoLGiZBB3Mdam5lVbygZw==")
									.substring(0, 4) + "...");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("SFTP" + " = " + "true");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("AUTH_METHOD" + " = " + "PASSWORD");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_ENCODING" + " = " + "false");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_PROXY" + " = " + "false");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("CONNECTION_TIMEOUT" + " = " + "0");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_STRICT_REPLY_PARSING" + " = " + "true");
							log4jParamters_tFTPConnection_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFTPConnection_1 - " + (log4jParamters_tFTPConnection_1));
						}
					}
					new BytesLimit65535_tFTPConnection_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFTPConnection_1", "tFTPConnection_1", "tFTPConnection");
					talendJobLogProcess(globalMap);
				}

				int connectionTimeout_tFTPConnection_1 = Integer.valueOf(0);
				class MyUserInfo implements com.jcraft.jsch.UserInfo, com.jcraft.jsch.UIKeyboardInteractive {

					String decryptedPassphrase_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword(
							"enc:routine.encryption.key.v1:BbXNH1pgxxGg4l7J+IPLHaraMCwPVThNuZbXp2O7GiDnvw==");

					String passphrase_tFTPConnection_1 = decryptedPassphrase_tFTPConnection_1;

					public String getPassphrase() {
						return passphrase_tFTPConnection_1;
					}

					public boolean promptPassword(String arg0) {
						return true;
					}

					public boolean promptPassphrase(String arg0) {
						return true;
					}

					public boolean promptYesNo(String arg0) {
						return true;
					}

					public void showMessage(String arg0) {
					}

					public String[] promptKeyboardInteractive(String destination, String name, String instruction,
							String[] prompt, boolean[] echo) {
						return new String[] { getPassword() };
					}

					public String getPassword() {

						final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil
								.decryptPassword(
										"enc:routine.encryption.key.v1:TIaYD2lLm411YAQ3qp3Wc4bpNRKjN+Uyp3VEVBH6erpsNHoPw389ng==");

						return decryptedPassword_tFTPConnection_1;

					}
				}
				;
				final com.jcraft.jsch.UserInfo defaultUserInfo_tFTPConnection_1 = new MyUserInfo();

				boolean retry_tFTPConnection_1 = false;
				int retry_count_tFTPConnection_1 = 0;
				int retry_max_tFTPConnection_1 = 5;

				com.jcraft.jsch.Session session_tFTPConnection_1 = null;
				com.jcraft.jsch.Channel channel_tFTPConnection_1 = null;
				do {
					retry_tFTPConnection_1 = false;

					com.jcraft.jsch.JSch jsch_tFTPConnection_1 = new com.jcraft.jsch.JSch();

					session_tFTPConnection_1 = jsch_tFTPConnection_1.getSession("edi", "192.168.9.205", 22);
					session_tFTPConnection_1.setConfig("PreferredAuthentications",
							"publickey,password,keyboard-interactive,gssapi-with-mic");

					log.info("tFTPConnection_1 - SFTP authentication using a password.");

					final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil
							.decryptPassword(
									"enc:routine.encryption.key.v1:7X+mzOcAfTuahFPkqMpbiS76xvH1QXRU9jWzQjA9NP1VFPGdLsyyOA==");

					session_tFTPConnection_1.setPassword(decryptedPassword_tFTPConnection_1);

					session_tFTPConnection_1.setUserInfo(defaultUserInfo_tFTPConnection_1);
					if (("true").equals(System.getProperty("http.proxySet"))) {

//check if the host is in the excludes for proxy
						boolean isHostIgnored_tFTPConnection_1 = false;
						String nonProxyHostsString_tFTPConnection_1 = System.getProperty("http.nonProxyHosts");
						String[] nonProxyHosts_tFTPConnection_1 = (nonProxyHostsString_tFTPConnection_1 == null)
								? new String[0]
								: nonProxyHostsString_tFTPConnection_1.split("\\|");
						for (String nonProxyHost : nonProxyHosts_tFTPConnection_1) {
							if (("192.168.9.205").matches(nonProxyHost.trim())) {
								isHostIgnored_tFTPConnection_1 = true;
								break;
							}
						}
						if (!isHostIgnored_tFTPConnection_1) {
							com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(
									System.getProperty("http.proxyHost"),
									Integer.parseInt(System.getProperty("http.proxyPort")));
							if (!"".equals(System.getProperty("http.proxyUser"))) {
								proxy_tFTPConnection_1.setUserPasswd(System.getProperty("http.proxyUser"),
										System.getProperty("http.proxyPassword"));
							}
							session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
						}
					} else if ("local".equals(System.getProperty("http.proxySet"))) {
						String uriString = "192.168.9.205" + ":" + 22;
						java.net.Proxy proxyToUse = org.talend.proxy.TalendProxySelector.getInstance()
								.getProxyForUriString(uriString);

						if (!proxyToUse.equals(java.net.Proxy.NO_PROXY)) {
							java.net.InetSocketAddress proxyAddress = (java.net.InetSocketAddress) proxyToUse.address();
							String proxyHost = proxyAddress.getAddress().getHostAddress();
							int proxyPort = proxyAddress.getPort();

							com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(proxyHost,
									proxyPort);

							org.talend.proxy.ProxyCreds proxyCreds = org.talend.proxy.TalendProxyAuthenticator
									.getInstance().getCredsForProxyURI(proxyHost + ":" + proxyPort);
							if (proxyCreds != null) {
								proxy_tFTPConnection_1.setUserPasswd(proxyCreds.getUser(), proxyCreds.getPass());
							}

							session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
						}
					}

					log.info("tFTPConnection_1 - Attempt to connect to  '" + "192.168.9.205" + "' with username '"
							+ "edi" + "'.");

					channel_tFTPConnection_1 = null;
					try {
						if (connectionTimeout_tFTPConnection_1 > 0) {
							session_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
						} else {
							session_tFTPConnection_1.connect();
						}
						channel_tFTPConnection_1 = session_tFTPConnection_1.openChannel("sftp");
						if (connectionTimeout_tFTPConnection_1 > 0) {
							channel_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
						} else {
							channel_tFTPConnection_1.connect();
						}
						log.info("tFTPConnection_1 - Connect to '" + "192.168.9.205" + "' has succeeded.");
					} catch (com.jcraft.jsch.JSchException e_tFTPConnection_1) {
						try {
							if (channel_tFTPConnection_1 != null) {
								channel_tFTPConnection_1.disconnect();
							}

							if (session_tFTPConnection_1 != null) {
								session_tFTPConnection_1.disconnect();
							}
						} catch (java.lang.Exception ce_tFTPConnection_1) {
							log.warn("tFTPConnection_1 - close sftp connection failed : "
									+ ce_tFTPConnection_1.getClass() + " : " + ce_tFTPConnection_1.getMessage());
						}

						String message_tFTPConnection_1 = new TalendException(null, null, null)
								.getExceptionCauseMessage(e_tFTPConnection_1);
						if (message_tFTPConnection_1.contains("Signature length not correct")
								|| message_tFTPConnection_1.contains("connection is closed by foreign host")) {
							retry_tFTPConnection_1 = true;
							retry_count_tFTPConnection_1++;
							log.info(
									"tFTPConnection_1 - connect: Signature length not correct or connection is closed by foreign host, so retry, retry time : "
											+ retry_count_tFTPConnection_1);
						} else {
							throw e_tFTPConnection_1;
						}
					}
				} while (retry_tFTPConnection_1 && (retry_count_tFTPConnection_1 < retry_max_tFTPConnection_1));

				com.jcraft.jsch.ChannelSftp c_tFTPConnection_1 = (com.jcraft.jsch.ChannelSftp) channel_tFTPConnection_1;

				globalMap.put("conn_tFTPConnection_1", c_tFTPConnection_1);

				/**
				 * [tFTPConnection_1 begin ] stop
				 */

				/**
				 * [tFTPConnection_1 main ] start
				 */

				currentComponent = "tFTPConnection_1";

				tos_count_tFTPConnection_1++;

				/**
				 * [tFTPConnection_1 main ] stop
				 */

				/**
				 * [tFTPConnection_1 process_data_begin ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tFTPConnection_1 process_data_end ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 process_data_end ] stop
				 */

				/**
				 * [tFTPConnection_1 end ] start
				 */

				currentComponent = "tFTPConnection_1";

				if (log.isDebugEnabled())
					log.debug("tFTPConnection_1 - " + ("Done."));

				ok_Hash.put("tFTPConnection_1", true);
				end_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tFTPPut_1Process(globalMap);
				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tFTPPut_2Process(globalMap);

				/**
				 * [tFTPConnection_1 end ] stop
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
				 * [tFTPConnection_1 finally ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 1);
	}

	public void tFTPPut_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFTPPut_1_SUBPROCESS_STATE", 0);

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
				 * [tFTPPut_1 begin ] start
				 */

				ok_Hash.put("tFTPPut_1", false);
				start_Hash.put("tFTPPut_1", System.currentTimeMillis());

				currentComponent = "tFTPPut_1";

				int tos_count_tFTPPut_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFTPPut_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFTPPut_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFTPPut_1 = new StringBuilder();
							log4jParamters_tFTPPut_1.append("Parameters:");
							log4jParamters_tFTPPut_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1.append("CONNECTION" + " = " + "tFTPConnection_1");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1
									.append("LOCALDIR" + " = " + "\"E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS\"");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1.append("REMOTEDIR" + " = " + "\"/uploads_edi/Marjane/OUT\"");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1.append("CREATE_DIR_IF_NOT_EXIST" + " = " + "false");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1.append("SFTPOVERWRITE" + " = " + "overwrite");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1.append("PERL5_REGEX" + " = " + "false");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1.append("FILES" + " = " + "[{FILEMASK="
									+ ("\"MCSEDI_C780_MARJANE_*\"") + ", NEWNAME=" + ("\"\"") + "}]");
							log4jParamters_tFTPPut_1.append(" | ");
							log4jParamters_tFTPPut_1.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFTPPut_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFTPPut_1 - " + (log4jParamters_tFTPPut_1));
						}
					}
					new BytesLimit65535_tFTPPut_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFTPPut_1", "tFTPPut_1", "tFTPPut");
					talendJobLogProcess(globalMap);
				}

				int nb_file_tFTPPut_1 = 0;
// *** sftp *** //

				class MyProgressMonitor_tFTPPut_1 implements com.jcraft.jsch.SftpProgressMonitor {
					public void init(int op, String src, String dest, long max) {
					}

					public boolean count(long count) {
						return true;
					}

					public void end() {
					}
				}

				com.jcraft.jsch.ChannelSftp c_tFTPPut_1 = (com.jcraft.jsch.ChannelSftp) globalMap
						.get("conn_tFTPConnection_1");

				if (c_tFTPPut_1 != null && c_tFTPPut_1.getSession() != null) {
					log.info("tFTPPut_1 - Uses an existing connection. Connection username "
							+ c_tFTPPut_1.getSession().getUserName() + ", Connection hostname: "
							+ c_tFTPPut_1.getSession().getHost() + ", Connection port: "
							+ c_tFTPPut_1.getSession().getPort() + ".");
				}

				if (c_tFTPPut_1.getHome() != null && !c_tFTPPut_1.getHome().equals(c_tFTPPut_1.pwd())) {
					c_tFTPPut_1.cd(c_tFTPPut_1.getHome());
				}

				// because there is not the same method in JSch class as FTPClient class, define
				// a list here
				java.util.List<String> msg_tFTPPut_1 = new java.util.ArrayList<String>();
				com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_1 = new MyProgressMonitor_tFTPPut_1();
				java.util.List<java.util.Map<String, String>> listtFTPPut_1 = new java.util.ArrayList<java.util.Map<String, String>>();

				java.util.Map<String, String> maptFTPPut_10 = new java.util.HashMap<String, String>();
				maptFTPPut_10.put("MCSEDI_C780_MARJANE_*", "");
				listtFTPPut_1.add(maptFTPPut_10);
				String localdirtFTPPut_1 = "E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS";

				log.info("tFTPPut_1 - Putting file to the server.");

				class StatCheck_tFTPPut_1 {

					boolean statOK(com.jcraft.jsch.ChannelSftp client, String path) {
						try {
							return client.stat(path).getAtimeString() != null;
						} catch (Exception e) {
							globalMap.put("tFTPPut_1_ERROR_MESSAGE", e.getMessage());

							log.warn(
									"tFTPPut_1 - Directory or file permission denied for checking the status of the path : "
											+ path);

						}

						return false;
					}

				}

				StatCheck_tFTPPut_1 sc_tFTPPut_1 = new StatCheck_tFTPPut_1();

				for (java.util.Map<String, String> maptFTPPut_1 : listtFTPPut_1) {

					/**
					 * [tFTPPut_1 begin ] stop
					 */

					/**
					 * [tFTPPut_1 main ] start
					 */

					currentComponent = "tFTPPut_1";

					try {
						globalMap.put("tFTPPut_1_CURRENT_STATUS", "No file transfered.");
						java.util.Set<String> keySettFTPPut_1 = maptFTPPut_1.keySet();
						for (String keytFTPPut_1 : keySettFTPPut_1) {
							if (keytFTPPut_1 == null || "".equals(keytFTPPut_1)) {
								log.error("tFTPPut_1 - file name invalid!");
								System.err.println("file name invalid!");
								continue;
							}
							String tempdirtFTPPut_1 = localdirtFTPPut_1;
							String filemasktFTPPut_1 = keytFTPPut_1;
							String dirtFTPPut_1 = null;
							String masktFTPPut_1 = filemasktFTPPut_1.replaceAll("\\\\", "/");
							int itFTPPut_1 = masktFTPPut_1.lastIndexOf('/');
							if (itFTPPut_1 != -1) {
								dirtFTPPut_1 = masktFTPPut_1.substring(0, itFTPPut_1);
								masktFTPPut_1 = masktFTPPut_1.substring(itFTPPut_1 + 1);
							}
							if (dirtFTPPut_1 != null && !"".equals(dirtFTPPut_1))
								tempdirtFTPPut_1 = tempdirtFTPPut_1 + "/" + dirtFTPPut_1;
							masktFTPPut_1 = masktFTPPut_1.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");
							final String finalMasktFTPPut_1 = masktFTPPut_1;
							java.io.File[] listingstFTPPut_1 = null;
							java.io.File filetFTPPut_1 = new java.io.File(tempdirtFTPPut_1);
							if (filetFTPPut_1.isDirectory()) {
								listingstFTPPut_1 = filetFTPPut_1.listFiles(new java.io.FileFilter() {
									public boolean accept(java.io.File pathname) {
										boolean result = false;
										if (pathname != null && pathname.isFile()) {
											result = java.util.regex.Pattern.compile(finalMasktFTPPut_1)
													.matcher(pathname.getName()).find();
										}
										return result;
									}
								});
							}
							if (listingstFTPPut_1 != null && listingstFTPPut_1.length > 0) {
								for (int mtFTPPut_1 = 0; mtFTPPut_1 < listingstFTPPut_1.length; mtFTPPut_1++) {
									if (listingstFTPPut_1[mtFTPPut_1].getName().matches(masktFTPPut_1)) {

										int modetFTPPut_1 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
										boolean putSuccess_tFTPPut_1 = false;

										String remoteDir_tFTPPut_1 = "/uploads_edi/Marjane/OUT";
										if (remoteDir_tFTPPut_1 == null) {
											remoteDir_tFTPPut_1 = "";
										}
										remoteDir_tFTPPut_1 = remoteDir_tFTPPut_1.trim();
										if (remoteDir_tFTPPut_1.endsWith("/")) {
											remoteDir_tFTPPut_1 = remoteDir_tFTPPut_1.substring(0,
													remoteDir_tFTPPut_1.length() - 1);
										}
										String destRename_tFTPPut_1 = maptFTPPut_1.get(keytFTPPut_1);
										final String dest_tFTPPut_1;
										if (destRename_tFTPPut_1 == null || destRename_tFTPPut_1.isEmpty()) {
											dest_tFTPPut_1 = remoteDir_tFTPPut_1 + "/"
													+ listingstFTPPut_1[mtFTPPut_1].getName();
										} else {
											dest_tFTPPut_1 = remoteDir_tFTPPut_1 + "/" + destRename_tFTPPut_1;
										}

										try {
											c_tFTPPut_1.put(listingstFTPPut_1[mtFTPPut_1].getAbsolutePath(),
													dest_tFTPPut_1, monitortFTPPut_1, modetFTPPut_1);
											// add info to list will return
											msg_tFTPPut_1.add("file: " + listingstFTPPut_1[mtFTPPut_1].getAbsolutePath()
													+ ", size: " + listingstFTPPut_1[mtFTPPut_1].length()
													+ " bytes upload successfully");
											log.debug("tFTPPut_1 - Uploaded file '"
													+ listingstFTPPut_1[mtFTPPut_1].getName() + "' successfully.");
											globalMap.put("tFTPPut_1_CURRENT_STATUS", "File transfer OK.");

											putSuccess_tFTPPut_1 = true;

											if (sc_tFTPPut_1.statOK(c_tFTPPut_1, dest_tFTPPut_1)) {
												globalMap.put("tFTPPut_1_CURRENT_FILE_EXISTS", true);
											}
										} catch (com.jcraft.jsch.SftpException e_tFTPPut_1) {
											globalMap.put("tFTPPut_1_ERROR_MESSAGE", e_tFTPPut_1.getMessage());
											if (e_tFTPPut_1.id != 4 && // if exception is not resume (normal) pb.
													(e_tFTPPut_1.getMessage() == null || !e_tFTPPut_1.getMessage()
															.startsWith("failed to resume"))) {
												log.error("tFTPPut_1 - File transfer fail." + e_tFTPPut_1.getMessage());
												globalMap.put("tFTPPut_1_CURRENT_STATUS", "File transfer fail.");

												if (!putSuccess_tFTPPut_1) {
													if (sc_tFTPPut_1.statOK(c_tFTPPut_1, dest_tFTPPut_1)) {
														globalMap.put("tFTPPut_1_CURRENT_FILE_EXISTS", true);
													}
												}
												throw (e_tFTPPut_1);
											} // end if exception not resume pb
										} catch (java.lang.Exception e_tFTPPut_1) {
											globalMap.put("tFTPPut_1_ERROR_MESSAGE", e_tFTPPut_1.getMessage());
											if (!(e_tFTPPut_1 instanceof com.jcraft.jsch.SftpException)) {
												msg_tFTPPut_1
														.add("file " + listingstFTPPut_1[mtFTPPut_1].getAbsolutePath()
																+ " not found?");

												globalMap.put("tFTPPut_1_CURRENT_FILE_EXISTS", false);
											}
											throw e_tFTPPut_1;
										}
										nb_file_tFTPPut_1++;
									}
								}
							} else {
								log.warn("tFTPPut_1 - No matches found for mask '" + keytFTPPut_1 + "'!");
								System.err.println("No matches found for mask '" + keytFTPPut_1 + "'!");
							}
						}

					} catch (java.lang.Exception e_tFTPPut_1) {
						globalMap.put("tFTPPut_1_ERROR_MESSAGE", e_tFTPPut_1.getMessage());
						msg_tFTPPut_1.add("file not found?: " + e_tFTPPut_1.getMessage());
						throw (e_tFTPPut_1);
					}

					tos_count_tFTPPut_1++;

					/**
					 * [tFTPPut_1 main ] stop
					 */

					/**
					 * [tFTPPut_1 process_data_begin ] start
					 */

					currentComponent = "tFTPPut_1";

					/**
					 * [tFTPPut_1 process_data_begin ] stop
					 */

					/**
					 * [tFTPPut_1 process_data_end ] start
					 */

					currentComponent = "tFTPPut_1";

					/**
					 * [tFTPPut_1 process_data_end ] stop
					 */

					/**
					 * [tFTPPut_1 end ] start
					 */

					currentComponent = "tFTPPut_1";

				}
				msg_tFTPPut_1.add(nb_file_tFTPPut_1 + " files have been uploaded.");

				StringBuffer sb_tFTPPut_1 = new StringBuffer();
				for (String item_tFTPPut_1 : msg_tFTPPut_1) {
					sb_tFTPPut_1.append(item_tFTPPut_1).append("\n");
				}
				globalMap.put("tFTPPut_1_TRANSFER_MESSAGES", sb_tFTPPut_1.toString());
				if (nb_file_tFTPPut_1 == 0 && !listtFTPPut_1.isEmpty()) {
					throw new RuntimeException("Error during component operation!");
				}

				globalMap.put("tFTPPut_1_NB_FILE", nb_file_tFTPPut_1);
				log.info("tFTPPut_1 - Uploaded files count: " + nb_file_tFTPPut_1 + ".");
				if (nb_file_tFTPPut_1 == 0 && !listtFTPPut_1.isEmpty()) {
					throw new RuntimeException("Error during component operation!");
				}

				if (log.isDebugEnabled())
					log.debug("tFTPPut_1 - " + ("Done."));

				ok_Hash.put("tFTPPut_1", true);
				end_Hash.put("tFTPPut_1", System.currentTimeMillis());

				/**
				 * [tFTPPut_1 end ] stop
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
				 * [tFTPPut_1 finally ] start
				 */

				currentComponent = "tFTPPut_1";

				/**
				 * [tFTPPut_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPPut_1_SUBPROCESS_STATE", 1);
	}

	public void tFTPPut_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFTPPut_2_SUBPROCESS_STATE", 0);

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
				 * [tFTPPut_2 begin ] start
				 */

				ok_Hash.put("tFTPPut_2", false);
				start_Hash.put("tFTPPut_2", System.currentTimeMillis());

				currentComponent = "tFTPPut_2";

				int tos_count_tFTPPut_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tFTPPut_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFTPPut_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFTPPut_2 = new StringBuilder();
							log4jParamters_tFTPPut_2.append("Parameters:");
							log4jParamters_tFTPPut_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2.append("CONNECTION" + " = " + "tFTPConnection_1");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2
									.append("LOCALDIR" + " = " + "\"E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS\"");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2.append("REMOTEDIR" + " = " + "\"/uploads_edi/EP/OUT\"");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2.append("CREATE_DIR_IF_NOT_EXIST" + " = " + "false");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2.append("SFTPOVERWRITE" + " = " + "overwrite");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2.append("PERL5_REGEX" + " = " + "false");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2.append("FILES" + " = " + "[{FILEMASK="
									+ ("\"MCSEDI_C780_ELECTROPLANET_*\"") + ", NEWNAME=" + ("\"\"") + "}]");
							log4jParamters_tFTPPut_2.append(" | ");
							log4jParamters_tFTPPut_2.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFTPPut_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFTPPut_2 - " + (log4jParamters_tFTPPut_2));
						}
					}
					new BytesLimit65535_tFTPPut_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFTPPut_2", "tFTPPut_2", "tFTPPut");
					talendJobLogProcess(globalMap);
				}

				int nb_file_tFTPPut_2 = 0;
// *** sftp *** //

				class MyProgressMonitor_tFTPPut_2 implements com.jcraft.jsch.SftpProgressMonitor {
					public void init(int op, String src, String dest, long max) {
					}

					public boolean count(long count) {
						return true;
					}

					public void end() {
					}
				}

				com.jcraft.jsch.ChannelSftp c_tFTPPut_2 = (com.jcraft.jsch.ChannelSftp) globalMap
						.get("conn_tFTPConnection_1");

				if (c_tFTPPut_2 != null && c_tFTPPut_2.getSession() != null) {
					log.info("tFTPPut_2 - Uses an existing connection. Connection username "
							+ c_tFTPPut_2.getSession().getUserName() + ", Connection hostname: "
							+ c_tFTPPut_2.getSession().getHost() + ", Connection port: "
							+ c_tFTPPut_2.getSession().getPort() + ".");
				}

				if (c_tFTPPut_2.getHome() != null && !c_tFTPPut_2.getHome().equals(c_tFTPPut_2.pwd())) {
					c_tFTPPut_2.cd(c_tFTPPut_2.getHome());
				}

				// because there is not the same method in JSch class as FTPClient class, define
				// a list here
				java.util.List<String> msg_tFTPPut_2 = new java.util.ArrayList<String>();
				com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_2 = new MyProgressMonitor_tFTPPut_2();
				java.util.List<java.util.Map<String, String>> listtFTPPut_2 = new java.util.ArrayList<java.util.Map<String, String>>();

				java.util.Map<String, String> maptFTPPut_20 = new java.util.HashMap<String, String>();
				maptFTPPut_20.put("MCSEDI_C780_ELECTROPLANET_*", "");
				listtFTPPut_2.add(maptFTPPut_20);
				String localdirtFTPPut_2 = "E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS";

				log.info("tFTPPut_2 - Putting file to the server.");

				class StatCheck_tFTPPut_2 {

					boolean statOK(com.jcraft.jsch.ChannelSftp client, String path) {
						try {
							return client.stat(path).getAtimeString() != null;
						} catch (Exception e) {
							globalMap.put("tFTPPut_2_ERROR_MESSAGE", e.getMessage());

							log.warn(
									"tFTPPut_2 - Directory or file permission denied for checking the status of the path : "
											+ path);

						}

						return false;
					}

				}

				StatCheck_tFTPPut_2 sc_tFTPPut_2 = new StatCheck_tFTPPut_2();

				for (java.util.Map<String, String> maptFTPPut_2 : listtFTPPut_2) {

					/**
					 * [tFTPPut_2 begin ] stop
					 */

					/**
					 * [tFTPPut_2 main ] start
					 */

					currentComponent = "tFTPPut_2";

					try {
						globalMap.put("tFTPPut_2_CURRENT_STATUS", "No file transfered.");
						java.util.Set<String> keySettFTPPut_2 = maptFTPPut_2.keySet();
						for (String keytFTPPut_2 : keySettFTPPut_2) {
							if (keytFTPPut_2 == null || "".equals(keytFTPPut_2)) {
								log.error("tFTPPut_2 - file name invalid!");
								System.err.println("file name invalid!");
								continue;
							}
							String tempdirtFTPPut_2 = localdirtFTPPut_2;
							String filemasktFTPPut_2 = keytFTPPut_2;
							String dirtFTPPut_2 = null;
							String masktFTPPut_2 = filemasktFTPPut_2.replaceAll("\\\\", "/");
							int itFTPPut_2 = masktFTPPut_2.lastIndexOf('/');
							if (itFTPPut_2 != -1) {
								dirtFTPPut_2 = masktFTPPut_2.substring(0, itFTPPut_2);
								masktFTPPut_2 = masktFTPPut_2.substring(itFTPPut_2 + 1);
							}
							if (dirtFTPPut_2 != null && !"".equals(dirtFTPPut_2))
								tempdirtFTPPut_2 = tempdirtFTPPut_2 + "/" + dirtFTPPut_2;
							masktFTPPut_2 = masktFTPPut_2.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");
							final String finalMasktFTPPut_2 = masktFTPPut_2;
							java.io.File[] listingstFTPPut_2 = null;
							java.io.File filetFTPPut_2 = new java.io.File(tempdirtFTPPut_2);
							if (filetFTPPut_2.isDirectory()) {
								listingstFTPPut_2 = filetFTPPut_2.listFiles(new java.io.FileFilter() {
									public boolean accept(java.io.File pathname) {
										boolean result = false;
										if (pathname != null && pathname.isFile()) {
											result = java.util.regex.Pattern.compile(finalMasktFTPPut_2)
													.matcher(pathname.getName()).find();
										}
										return result;
									}
								});
							}
							if (listingstFTPPut_2 != null && listingstFTPPut_2.length > 0) {
								for (int mtFTPPut_2 = 0; mtFTPPut_2 < listingstFTPPut_2.length; mtFTPPut_2++) {
									if (listingstFTPPut_2[mtFTPPut_2].getName().matches(masktFTPPut_2)) {

										int modetFTPPut_2 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
										boolean putSuccess_tFTPPut_2 = false;

										String remoteDir_tFTPPut_2 = "/uploads_edi/EP/OUT";
										if (remoteDir_tFTPPut_2 == null) {
											remoteDir_tFTPPut_2 = "";
										}
										remoteDir_tFTPPut_2 = remoteDir_tFTPPut_2.trim();
										if (remoteDir_tFTPPut_2.endsWith("/")) {
											remoteDir_tFTPPut_2 = remoteDir_tFTPPut_2.substring(0,
													remoteDir_tFTPPut_2.length() - 1);
										}
										String destRename_tFTPPut_2 = maptFTPPut_2.get(keytFTPPut_2);
										final String dest_tFTPPut_2;
										if (destRename_tFTPPut_2 == null || destRename_tFTPPut_2.isEmpty()) {
											dest_tFTPPut_2 = remoteDir_tFTPPut_2 + "/"
													+ listingstFTPPut_2[mtFTPPut_2].getName();
										} else {
											dest_tFTPPut_2 = remoteDir_tFTPPut_2 + "/" + destRename_tFTPPut_2;
										}

										try {
											c_tFTPPut_2.put(listingstFTPPut_2[mtFTPPut_2].getAbsolutePath(),
													dest_tFTPPut_2, monitortFTPPut_2, modetFTPPut_2);
											// add info to list will return
											msg_tFTPPut_2.add("file: " + listingstFTPPut_2[mtFTPPut_2].getAbsolutePath()
													+ ", size: " + listingstFTPPut_2[mtFTPPut_2].length()
													+ " bytes upload successfully");
											log.debug("tFTPPut_2 - Uploaded file '"
													+ listingstFTPPut_2[mtFTPPut_2].getName() + "' successfully.");
											globalMap.put("tFTPPut_2_CURRENT_STATUS", "File transfer OK.");

											putSuccess_tFTPPut_2 = true;

											if (sc_tFTPPut_2.statOK(c_tFTPPut_2, dest_tFTPPut_2)) {
												globalMap.put("tFTPPut_2_CURRENT_FILE_EXISTS", true);
											}
										} catch (com.jcraft.jsch.SftpException e_tFTPPut_2) {
											globalMap.put("tFTPPut_2_ERROR_MESSAGE", e_tFTPPut_2.getMessage());
											if (e_tFTPPut_2.id != 4 && // if exception is not resume (normal) pb.
													(e_tFTPPut_2.getMessage() == null || !e_tFTPPut_2.getMessage()
															.startsWith("failed to resume"))) {
												log.error("tFTPPut_2 - File transfer fail." + e_tFTPPut_2.getMessage());
												globalMap.put("tFTPPut_2_CURRENT_STATUS", "File transfer fail.");

												if (!putSuccess_tFTPPut_2) {
													if (sc_tFTPPut_2.statOK(c_tFTPPut_2, dest_tFTPPut_2)) {
														globalMap.put("tFTPPut_2_CURRENT_FILE_EXISTS", true);
													}
												}
												throw (e_tFTPPut_2);
											} // end if exception not resume pb
										} catch (java.lang.Exception e_tFTPPut_2) {
											globalMap.put("tFTPPut_2_ERROR_MESSAGE", e_tFTPPut_2.getMessage());
											if (!(e_tFTPPut_2 instanceof com.jcraft.jsch.SftpException)) {
												msg_tFTPPut_2
														.add("file " + listingstFTPPut_2[mtFTPPut_2].getAbsolutePath()
																+ " not found?");

												globalMap.put("tFTPPut_2_CURRENT_FILE_EXISTS", false);
											}
											throw e_tFTPPut_2;
										}
										nb_file_tFTPPut_2++;
									}
								}
							} else {
								log.warn("tFTPPut_2 - No matches found for mask '" + keytFTPPut_2 + "'!");
								System.err.println("No matches found for mask '" + keytFTPPut_2 + "'!");
							}
						}

					} catch (java.lang.Exception e_tFTPPut_2) {
						globalMap.put("tFTPPut_2_ERROR_MESSAGE", e_tFTPPut_2.getMessage());
						msg_tFTPPut_2.add("file not found?: " + e_tFTPPut_2.getMessage());
						throw (e_tFTPPut_2);
					}

					tos_count_tFTPPut_2++;

					/**
					 * [tFTPPut_2 main ] stop
					 */

					/**
					 * [tFTPPut_2 process_data_begin ] start
					 */

					currentComponent = "tFTPPut_2";

					/**
					 * [tFTPPut_2 process_data_begin ] stop
					 */

					/**
					 * [tFTPPut_2 process_data_end ] start
					 */

					currentComponent = "tFTPPut_2";

					/**
					 * [tFTPPut_2 process_data_end ] stop
					 */

					/**
					 * [tFTPPut_2 end ] start
					 */

					currentComponent = "tFTPPut_2";

				}
				msg_tFTPPut_2.add(nb_file_tFTPPut_2 + " files have been uploaded.");

				StringBuffer sb_tFTPPut_2 = new StringBuffer();
				for (String item_tFTPPut_2 : msg_tFTPPut_2) {
					sb_tFTPPut_2.append(item_tFTPPut_2).append("\n");
				}
				globalMap.put("tFTPPut_2_TRANSFER_MESSAGES", sb_tFTPPut_2.toString());
				if (nb_file_tFTPPut_2 == 0 && !listtFTPPut_2.isEmpty()) {
					throw new RuntimeException("Error during component operation!");
				}

				globalMap.put("tFTPPut_2_NB_FILE", nb_file_tFTPPut_2);
				log.info("tFTPPut_2 - Uploaded files count: " + nb_file_tFTPPut_2 + ".");
				if (nb_file_tFTPPut_2 == 0 && !listtFTPPut_2.isEmpty()) {
					throw new RuntimeException("Error during component operation!");
				}

				if (log.isDebugEnabled())
					log.debug("tFTPPut_2 - " + ("Done."));

				ok_Hash.put("tFTPPut_2", true);
				end_Hash.put("tFTPPut_2", System.currentTimeMillis());

				/**
				 * [tFTPPut_2 end ] stop
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
				 * [tFTPPut_2 finally ] start
				 */

				currentComponent = "tFTPPut_2";

				/**
				 * [tFTPPut_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPPut_2_SUBPROCESS_STATE", 1);
	}

	public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

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
				 * [tJava_1 begin ] start
				 */

				ok_Hash.put("tJava_1", false);
				start_Hash.put("tJava_1", System.currentTimeMillis());

				currentComponent = "tJava_1";

				int tos_count_tJava_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tJava_1", "tJava_1", "tJava");
					talendJobLogProcess(globalMap);
				}

				String var = "Erreur: ";
				var = var + ((String) globalMap.get("tFTPConnection_1_ERROR_MESSAGE"));
				System.out.println(var);

				/**
				 * [tJava_1 begin ] stop
				 */

				/**
				 * [tJava_1 main ] start
				 */

				currentComponent = "tJava_1";

				tos_count_tJava_1++;

				/**
				 * [tJava_1 main ] stop
				 */

				/**
				 * [tJava_1 process_data_begin ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 process_data_begin ] stop
				 */

				/**
				 * [tJava_1 process_data_end ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 process_data_end ] stop
				 */

				/**
				 * [tJava_1 end ] start
				 */

				currentComponent = "tJava_1";

				ok_Hash.put("tJava_1", true);
				end_Hash.put("tJava_1", System.currentTimeMillis());

				/**
				 * [tJava_1 end ] stop
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
				 * [tJava_1 finally ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
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
		final TEST_SAMSUNG TEST_SAMSUNGClass = new TEST_SAMSUNG();

		int exitCode = TEST_SAMSUNGClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'TEST_SAMSUNG' - Done.");
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
		log.info("TalendJob: 'TEST_SAMSUNG' - Start.");

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
			java.io.InputStream inContext = TEST_SAMSUNG.class.getClassLoader()
					.getResourceAsStream("bi_team_projects/test_samsung_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = TEST_SAMSUNG.class.getClassLoader()
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
			tFTPConnection_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tFTPConnection_1) {
			globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", -1);

			e_tFTPConnection_1.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out
					.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : TEST_SAMSUNG");
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
		closeFtpConnections();

	}

	private void closeFtpConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tFTPConnection_1");
			if (obj_conn != null) {
				((com.jcraft.jsch.ChannelSftp) obj_conn).quit();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		connections.put("conn_tFTPConnection_1", globalMap.get("conn_tFTPConnection_1"));

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
 * 81340 characters generated by Talend Cloud Data Management Platform on the 26
 * juillet 2022 à 16:03:46 WEST
 ************************************************************************************************/