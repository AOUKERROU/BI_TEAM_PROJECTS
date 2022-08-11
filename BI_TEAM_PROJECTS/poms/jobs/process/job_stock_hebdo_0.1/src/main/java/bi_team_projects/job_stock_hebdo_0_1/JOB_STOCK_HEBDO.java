
package bi_team_projects.job_stock_hebdo_0_1;

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
 * Job: JOB_STOCK_HEBDO Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220729_0744-patch
 * @status 
 */
public class JOB_STOCK_HEBDO implements TalendJob {
	static {System.setProperty("TalendJob.log", "JOB_STOCK_HEBDO.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(JOB_STOCK_HEBDO.class);
	

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
	private Object[] multiThreadLockWrite = new Object[0];
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
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

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(host != null){
				
					this.setProperty("host", host.toString());
				
			}
			
			if(sid != null){
				
					this.setProperty("sid", sid.toString());
				
			}
			
			if(port != null){
				
					this.setProperty("port", port.toString());
				
			}
			
			if(user != null){
				
					this.setProperty("user", user.toString());
				
			}
			
			if(mdp != null){
				
					this.setProperty("mdp", mdp.toString());
				
			}
			
			if(host_ods != null){
				
					this.setProperty("host_ods", host_ods.toString());
				
			}
			
			if(sid_ods != null){
				
					this.setProperty("sid_ods", sid_ods.toString());
				
			}
			
			if(port_ods != null){
				
					this.setProperty("port_ods", port_ods.toString());
				
			}
			
			if(user_ods != null){
				
					this.setProperty("user_ods", user_ods.toString());
				
			}
			
			if(mdp_ods != null){
				
					this.setProperty("mdp_ods", mdp_ods.toString());
				
			}
			
			if(user_gold != null){
				
					this.setProperty("user_gold", user_gold.toString());
				
			}
			
			if(sid_gold != null){
				
					this.setProperty("sid_gold", sid_gold.toString());
				
			}
			
			if(port_gold != null){
				
					this.setProperty("port_gold", port_gold.toString());
				
			}
			
			if(host_gold != null){
				
					this.setProperty("host_gold", host_gold.toString());
				
			}
			
			if(mdp_gold != null){
				
					this.setProperty("mdp_gold", mdp_gold.toString());
				
			}
			
			if(PORTAIL_FOURNISSEUR_AZURE_Login != null){
				
					this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Login", PORTAIL_FOURNISSEUR_AZURE_Login.toString());
				
			}
			
			if(PORTAIL_FOURNISSEUR_AZURE_AdditionalParams != null){
				
					this.setProperty("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams", PORTAIL_FOURNISSEUR_AZURE_AdditionalParams.toString());
				
			}
			
			if(PORTAIL_FOURNISSEUR_AZURE_Schema != null){
				
					this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Schema", PORTAIL_FOURNISSEUR_AZURE_Schema.toString());
				
			}
			
			if(PORTAIL_FOURNISSEUR_AZURE_Server != null){
				
					this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Server", PORTAIL_FOURNISSEUR_AZURE_Server.toString());
				
			}
			
			if(PORTAIL_FOURNISSEUR_AZURE_Port != null){
				
					this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Port", PORTAIL_FOURNISSEUR_AZURE_Port.toString());
				
			}
			
			if(PORTAIL_FOURNISSEUR_AZURE_Password != null){
				
					this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Password", PORTAIL_FOURNISSEUR_AZURE_Password.toString());
				
			}
			
			if(PORTAIL_FOURNISSEUR_AZURE_Database != null){
				
					this.setProperty("PORTAIL_FOURNISSEUR_AZURE_Database", PORTAIL_FOURNISSEUR_AZURE_Database.toString());
				
			}
			
			if(PATH_STOCK_HEBDO != null){
				
					this.setProperty("PATH_STOCK_HEBDO", PATH_STOCK_HEBDO.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String host;
public String getHost(){
	return this.host;
}
public String sid;
public String getSid(){
	return this.sid;
}
public String port;
public String getPort(){
	return this.port;
}
public String user;
public String getUser(){
	return this.user;
}
public java.lang.String mdp;
public java.lang.String getMdp(){
	return this.mdp;
}
public String host_ods;
public String getHost_ods(){
	return this.host_ods;
}
public String sid_ods;
public String getSid_ods(){
	return this.sid_ods;
}
public String port_ods;
public String getPort_ods(){
	return this.port_ods;
}
public String user_ods;
public String getUser_ods(){
	return this.user_ods;
}
public java.lang.String mdp_ods;
public java.lang.String getMdp_ods(){
	return this.mdp_ods;
}
public String user_gold;
public String getUser_gold(){
	return this.user_gold;
}
public String sid_gold;
public String getSid_gold(){
	return this.sid_gold;
}
public String port_gold;
public String getPort_gold(){
	return this.port_gold;
}
public String host_gold;
public String getHost_gold(){
	return this.host_gold;
}
public java.lang.String mdp_gold;
public java.lang.String getMdp_gold(){
	return this.mdp_gold;
}
public String PORTAIL_FOURNISSEUR_AZURE_Login;
public String getPORTAIL_FOURNISSEUR_AZURE_Login(){
	return this.PORTAIL_FOURNISSEUR_AZURE_Login;
}
public String PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;
public String getPORTAIL_FOURNISSEUR_AZURE_AdditionalParams(){
	return this.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;
}
public String PORTAIL_FOURNISSEUR_AZURE_Schema;
public String getPORTAIL_FOURNISSEUR_AZURE_Schema(){
	return this.PORTAIL_FOURNISSEUR_AZURE_Schema;
}
public String PORTAIL_FOURNISSEUR_AZURE_Server;
public String getPORTAIL_FOURNISSEUR_AZURE_Server(){
	return this.PORTAIL_FOURNISSEUR_AZURE_Server;
}
public String PORTAIL_FOURNISSEUR_AZURE_Port;
public String getPORTAIL_FOURNISSEUR_AZURE_Port(){
	return this.PORTAIL_FOURNISSEUR_AZURE_Port;
}
public java.lang.String PORTAIL_FOURNISSEUR_AZURE_Password;
public java.lang.String getPORTAIL_FOURNISSEUR_AZURE_Password(){
	return this.PORTAIL_FOURNISSEUR_AZURE_Password;
}
public String PORTAIL_FOURNISSEUR_AZURE_Database;
public String getPORTAIL_FOURNISSEUR_AZURE_Database(){
	return this.PORTAIL_FOURNISSEUR_AZURE_Database;
}
public String PATH_STOCK_HEBDO;
public String getPATH_STOCK_HEBDO(){
	return this.PATH_STOCK_HEBDO;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "JOB_STOCK_HEBDO";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Object>());
		
	
		private final java.util.Map<String, Long> start_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Long> end_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Boolean>());
		public  final java.util.List<String[]> globalBuffer = java.util.Collections.synchronizedList(new java.util.ArrayList<String[]>());
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_onfRIKRrEeyC17RJB_lgug", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
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
	private String cLabel =  null;
	
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}
	
	private TalendException(Exception e, String errorComponent, String errorComponentLabel, final java.util.Map<String, Object> globalMap) {
		this(e, errorComponent, globalMap);
		this.cLabel = errorComponentLabel;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
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
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				JOB_STOCK_HEBDO.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(JOB_STOCK_HEBDO.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
		if(enableLogStash) {
			talendJobLog.addJobExceptionMessage(currentComponent, cLabel, null, e);
			talendJobLogProcess(globalMap);
		}
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBConnection_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBConnection_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tSetGlobalVar_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tParallelize_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tParallelize_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tUniqRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBCommit_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								((java.util.Map)threadLocal.get()).put("errorCode", null);
								tDie_1Process(globalMap);
								if ( !"failure".equals(((java.util.Map)threadLocal.get()).get("status")) ) {
									((java.util.Map)threadLocal.get()).put("status", "end");
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tWarn_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tSetGlobalVar_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileExist_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileExist_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tSendMail_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_7_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_7_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tHashInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBClose_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBClose_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row11_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row10_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tHashInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAggregateRow_1_AGGOUT_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							tAggregateRow_1_AGGIN_error(exception, errorComponent, globalMap);
						
						}
					
			public void tAggregateRow_1_AGGIN_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tParallelize_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tHashInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileExist_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_7_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	


public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";
	
	
		int tos_count_tPrejob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBConnection_2Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_2", false);
		start_Hash.put("tDBConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="GOLD";
		
		int tos_count_tDBConnection_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_2{
                    public void limitLog4jByte() throws Exception{
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
                            log4jParamters_tDBConnection_2.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.mdp_gold)).substring(0, 4) + "...");     
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
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + (log4jParamters_tDBConnection_2) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_2", "GOLD", "tOracleConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
        String url_tDBConnection_2 = "jdbc:oracle:thin:@" + context.host_gold + ":" + context.port_gold + ":" + context.sid_gold;
    	globalMap.put("connectionType_" + "tDBConnection_2", "ORACLE_SID");
	String dbUser_tDBConnection_2 = context.user_gold;
	
	
		
	final String decryptedPassword_tDBConnection_2 = context.mdp_gold; 
		String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;
	
	
	java.sql.Connection conn_tDBConnection_2 = null;
	
		
			String driverClass_tDBConnection_2 = "oracle.jdbc.OracleDriver";
			java.lang.Class jdbcclazz_tDBConnection_2 = java.lang.Class.forName(driverClass_tDBConnection_2);
			globalMap.put("driverClass_tDBConnection_2", driverClass_tDBConnection_2);
		
	    		log.debug("tDBConnection_2 - Driver ClassName: "+driverClass_tDBConnection_2+".");
			
	    		log.debug("tDBConnection_2 - Connection attempt to '" + url_tDBConnection_2 + "' with the username '" + dbUser_tDBConnection_2 + "'.");
			
			conn_tDBConnection_2 = java.sql.DriverManager.getConnection(url_tDBConnection_2,dbUser_tDBConnection_2,dbPwd_tDBConnection_2);
	    		log.debug("tDBConnection_2 - Connection to '" + url_tDBConnection_2 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
	if (null != conn_tDBConnection_2) {
		
			log.debug("tDBConnection_2 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_2.setAutoCommit(false);
	}
        globalMap.put("host_" + "tDBConnection_2",context.host_gold);
        globalMap.put("port_" + "tDBConnection_2",context.port_gold);
        globalMap.put("dbname_" + "tDBConnection_2",context.sid_gold);

	globalMap.put("dbschema_" + "tDBConnection_2", "");
	globalMap.put("username_" + "tDBConnection_2",context.user_gold);
	globalMap.put("password_" + "tDBConnection_2",dbPwd_tDBConnection_2);

 



/**
 * [tDBConnection_2 begin ] stop
 */
	
	/**
	 * [tDBConnection_2 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="GOLD";
		

 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="GOLD";
		

 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="GOLD";
		

 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="GOLD";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + ("Done.") );

ok_Hash.put("tDBConnection_2", true);
end_Hash.put("tDBConnection_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBConnection_3Process(globalMap);



/**
 * [tDBConnection_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
			cLabel="GOLD";
		

 



/**
 * [tDBConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_3", false);
		start_Hash.put("tDBConnection_3", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_3";
	
	
			cLabel="ODS";
		
		int tos_count_tDBConnection_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_3{
                    public void limitLog4jByte() throws Exception{
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
                            log4jParamters_tDBConnection_3.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.mdp_ods)).substring(0, 4) + "...");     
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
                if(log.isDebugEnabled())
            log.debug("tDBConnection_3 - "  + (log4jParamters_tDBConnection_3) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_3", "ODS", "tOracleConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
        String url_tDBConnection_3 = "jdbc:oracle:thin:@" + context.host_ods + ":" + context.port_ods + ":" + context.sid_ods;
    	globalMap.put("connectionType_" + "tDBConnection_3", "ORACLE_SID");
	String dbUser_tDBConnection_3 = context.user_ods;
	
	
		
	final String decryptedPassword_tDBConnection_3 = context.mdp_ods; 
		String dbPwd_tDBConnection_3 = decryptedPassword_tDBConnection_3;
	
	
	java.sql.Connection conn_tDBConnection_3 = null;
	
		
			String driverClass_tDBConnection_3 = "oracle.jdbc.OracleDriver";
			java.lang.Class jdbcclazz_tDBConnection_3 = java.lang.Class.forName(driverClass_tDBConnection_3);
			globalMap.put("driverClass_tDBConnection_3", driverClass_tDBConnection_3);
		
	    		log.debug("tDBConnection_3 - Driver ClassName: "+driverClass_tDBConnection_3+".");
			
	    		log.debug("tDBConnection_3 - Connection attempt to '" + url_tDBConnection_3 + "' with the username '" + dbUser_tDBConnection_3 + "'.");
			
			conn_tDBConnection_3 = java.sql.DriverManager.getConnection(url_tDBConnection_3,dbUser_tDBConnection_3,dbPwd_tDBConnection_3);
	    		log.debug("tDBConnection_3 - Connection to '" + url_tDBConnection_3 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_3", conn_tDBConnection_3);
	if (null != conn_tDBConnection_3) {
		
			log.debug("tDBConnection_3 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_3.setAutoCommit(false);
	}
        globalMap.put("host_" + "tDBConnection_3",context.host_ods);
        globalMap.put("port_" + "tDBConnection_3",context.port_ods);
        globalMap.put("dbname_" + "tDBConnection_3",context.sid_ods);

	globalMap.put("dbschema_" + "tDBConnection_3", "");
	globalMap.put("username_" + "tDBConnection_3",context.user_ods);
	globalMap.put("password_" + "tDBConnection_3",dbPwd_tDBConnection_3);

 



/**
 * [tDBConnection_3 begin ] stop
 */
	
	/**
	 * [tDBConnection_3 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	
			cLabel="ODS";
		

 


	tos_count_tDBConnection_3++;

/**
 * [tDBConnection_3 main ] stop
 */
	
	/**
	 * [tDBConnection_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	
			cLabel="ODS";
		

 



/**
 * [tDBConnection_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	
			cLabel="ODS";
		

 



/**
 * [tDBConnection_3 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_3 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	
			cLabel="ODS";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_3 - "  + ("Done.") );

ok_Hash.put("tDBConnection_3", true);
end_Hash.put("tDBConnection_3", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBConnection_4Process(globalMap);



/**
 * [tDBConnection_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_3 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	
			cLabel="ODS";
		

 



/**
 * [tDBConnection_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBConnection_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_4", false);
		start_Hash.put("tDBConnection_4", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_4";
	
	
		int tos_count_tDBConnection_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBConnection_4 = new StringBuilder();
                    log4jParamters_tDBConnection_4.append("Parameters:");
                            log4jParamters_tDBConnection_4.append("DRIVER" + " = " + "JTDS");
                        log4jParamters_tDBConnection_4.append(" | ");
                            log4jParamters_tDBConnection_4.append("HOST" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Server");
                        log4jParamters_tDBConnection_4.append(" | ");
                            log4jParamters_tDBConnection_4.append("PORT" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Port");
                        log4jParamters_tDBConnection_4.append(" | ");
                            log4jParamters_tDBConnection_4.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBConnection_4.append(" | ");
                            log4jParamters_tDBConnection_4.append("DBNAME" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Database");
                        log4jParamters_tDBConnection_4.append(" | ");
                            log4jParamters_tDBConnection_4.append("USER" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Login");
                        log4jParamters_tDBConnection_4.append(" | ");
                            log4jParamters_tDBConnection_4.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.PORTAIL_FOURNISSEUR_AZURE_Password)).substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_4.append(" | ");
                            log4jParamters_tDBConnection_4.append("PROPERTIES" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
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
                if(log.isDebugEnabled())
            log.debug("tDBConnection_4 - "  + (log4jParamters_tDBConnection_4) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_4", "tDBConnection_4", "tMSSqlConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
			String url_tDBConnection_4 = "jdbc:jtds:sqlserver://" + context.PORTAIL_FOURNISSEUR_AZURE_Server ;
		String port_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Port;
		String dbname_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Database ;
    	if (!"".equals(port_tDBConnection_4)) {
    		url_tDBConnection_4 += ":" + context.PORTAIL_FOURNISSEUR_AZURE_Port;
    	}
    	if (!"".equals(dbname_tDBConnection_4)) {
    		
				url_tDBConnection_4 += "//" + context.PORTAIL_FOURNISSEUR_AZURE_Database; 
    	}

		url_tDBConnection_4 += ";appName=" + projectName + ";" + context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;  
	String dbUser_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Login;
	
	
		
	final String decryptedPassword_tDBConnection_4 = context.PORTAIL_FOURNISSEUR_AZURE_Password; 
		String dbPwd_tDBConnection_4 = decryptedPassword_tDBConnection_4;
	
	
	java.sql.Connection conn_tDBConnection_4 = null;
	
		
			String driverClass_tDBConnection_4 = "net.sourceforge.jtds.jdbc.Driver";
			java.lang.Class jdbcclazz_tDBConnection_4 = java.lang.Class.forName(driverClass_tDBConnection_4);
			globalMap.put("driverClass_tDBConnection_4", driverClass_tDBConnection_4);
		
	    		log.debug("tDBConnection_4 - Driver ClassName: "+driverClass_tDBConnection_4+".");
			
	    		log.debug("tDBConnection_4 - Connection attempt to '" + url_tDBConnection_4 + "' with the username '" + dbUser_tDBConnection_4 + "'.");
			
			conn_tDBConnection_4 = java.sql.DriverManager.getConnection(url_tDBConnection_4,dbUser_tDBConnection_4,dbPwd_tDBConnection_4);
	    		log.debug("tDBConnection_4 - Connection to '" + url_tDBConnection_4 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_4", conn_tDBConnection_4);
	if (null != conn_tDBConnection_4) {
		
			log.debug("tDBConnection_4 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_4.setAutoCommit(false);
	}

	globalMap.put("dbschema_tDBConnection_4", "");

	globalMap.put("db_tDBConnection_4",  context.PORTAIL_FOURNISSEUR_AZURE_Database);
	
	globalMap.put("shareIdentitySetting_tDBConnection_4",  false);

	globalMap.put("driver_tDBConnection_4", "JTDS");

 



/**
 * [tDBConnection_4 begin ] stop
 */
	
	/**
	 * [tDBConnection_4 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_4";
	
	

 


	tos_count_tDBConnection_4++;

/**
 * [tDBConnection_4 main ] stop
 */
	
	/**
	 * [tDBConnection_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_4";
	
	

 



/**
 * [tDBConnection_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_4";
	
	

 



/**
 * [tDBConnection_4 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_4 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_4";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_4 - "  + ("Done.") );

ok_Hash.put("tDBConnection_4", true);
end_Hash.put("tDBConnection_4", System.currentTimeMillis());




/**
 * [tDBConnection_4 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_4 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_4";
	
	

 



/**
 * [tDBConnection_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_4_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Integer FOUCFIN;

				public Integer getFOUCFIN () {
					return this.FOUCFIN;
				}

				public Boolean FOUCFINIsNullable(){
				    return true;
				}
				public Boolean FOUCFINIsKey(){
				    return false;
				}
				public Integer FOUCFINLength(){
				    return null;
				}
				public Integer FOUCFINPrecision(){
				    return null;
				}
				public String FOUCFINDefault(){
				
					return null;
				
				}
				public String FOUCFINComment(){
				
				    return "";
				
				}
				public String FOUCFINPattern(){
				
					return "";
				
				}
				public String FOUCFINOriginalDbColumnName(){
				
					return "FOUCFIN";
				
				}

				
			    public String LIBFRS;

				public String getLIBFRS () {
					return this.LIBFRS;
				}

				public Boolean LIBFRSIsNullable(){
				    return true;
				}
				public Boolean LIBFRSIsKey(){
				    return false;
				}
				public Integer LIBFRSLength(){
				    return null;
				}
				public Integer LIBFRSPrecision(){
				    return null;
				}
				public String LIBFRSDefault(){
				
					return null;
				
				}
				public String LIBFRSComment(){
				
				    return "";
				
				}
				public String LIBFRSPattern(){
				
					return "";
				
				}
				public String LIBFRSOriginalDbColumnName(){
				
					return "LIBFRS";
				
				}

				
			    public String FOUCNUF;

				public String getFOUCNUF () {
					return this.FOUCNUF;
				}

				public Boolean FOUCNUFIsNullable(){
				    return true;
				}
				public Boolean FOUCNUFIsKey(){
				    return false;
				}
				public Integer FOUCNUFLength(){
				    return null;
				}
				public Integer FOUCNUFPrecision(){
				    return null;
				}
				public String FOUCNUFDefault(){
				
					return null;
				
				}
				public String FOUCNUFComment(){
				
				    return "";
				
				}
				public String FOUCNUFPattern(){
				
					return "";
				
				}
				public String FOUCNUFOriginalDbColumnName(){
				
					return "FOUCNUF";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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
				
						writeInteger(this.FOUCFIN,dos);
					
					// String
				
						writeString(this.LIBFRS,dos);
					
					// String
				
						writeString(this.FOUCNUF,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCFIN,dos);
					
					// String
				
						writeString(this.LIBFRS,dos);
					
					// String
				
						writeString(this.FOUCNUF,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCFIN="+String.valueOf(FOUCFIN));
		sb.append(",LIBFRS="+LIBFRS);
		sb.append(",FOUCNUF="+FOUCNUF);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCFIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCFIN);
            			}
            		
        			sb.append("|");
        		
        				if(LIBFRS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBFRS);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCNUF == null){
        					sb.append("<null>");
        				}else{
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
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tHashOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashOutput_1", false);
		start_Hash.put("tHashOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tHashOutput_1";
	
	
			cLabel="Fournisseur";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row3");
			
		int tos_count_tHashOutput_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tHashOutput_1", "Fournisseur", "tHashOutput");
				talendJobLogProcess(globalMap);
			}
			



org.talend.designer.components.hashfile.common.MapHashFile mf_tHashOutput_1=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();    
		org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct> tHashFile_tHashOutput_1 = null;
		String hashKey_tHashOutput_1 = "tHashFile_JOB_STOCK_HEBDO_" + pid + "_tHashOutput_1";
			synchronized(org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.get(hashKey_tHashOutput_1)){
			    if(mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1) == null){
	      		    mf_tHashOutput_1.getResourceMap().put(hashKey_tHashOutput_1, new org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct>(org.talend.designer.components.hashfile.common.MATCHING_MODE.KEEP_ALL));
	      		    tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
			    }else{
			    	tHashFile_tHashOutput_1 = mf_tHashOutput_1.getResourceMap().get(hashKey_tHashOutput_1);
			    }
			}
        int nb_line_tHashOutput_1 = 0;

 



/**
 * [tHashOutput_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		
		int tos_count_tDBInput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_1 = new StringBuilder();
                    log4jParamters_tDBInput_1.append("Parameters:");
                            log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_4");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"Select FOUCFIN,LIBFRS, FOUCNUF  from Fournisseur  where ISABONNE = 1  order by FOUCFIN\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("FOUCFIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIBFRS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FOUCNUF")+"}]");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlInput");
                        log4jParamters_tDBInput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + (log4jParamters_tDBInput_1) );
                    } 
                } 
            new BytesLimit65535_tDBInput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_1", "PORTAIL_FOURNISSEUR_AZURE", "tMSSqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
			org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_1 = org.talend.designer.components.util.mssql.MSSqlUtilFactory.getMSSqlGenerateTimestampUtil();
			
			java.util.List<String> talendToDBList_tDBInput_1 = new java.util.ArrayList();
			String[] talendToDBArray_tDBInput_1  = new String[]{"FLOAT","NUMERIC","NUMERIC IDENTITY","DECIMAL","DECIMAL IDENTITY","REAL"}; 
			java.util.Collections.addAll(talendToDBList_tDBInput_1, talendToDBArray_tDBInput_1); 
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_4");
				
				if(conn_tDBInput_1 != null) {
					if(conn_tDBInput_1.getMetaData() != null) {
						
							log.debug("tDBInput_1 - Uses an existing connection with username '" + conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_1.getMetaData().getURL() + ".");
						
					}
				}
			
			String dbschema_tDBInput_1 = (String)globalMap.get("dbschema_tDBConnection_4");
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "Select FOUCFIN,LIBFRS, FOUCNUF\nfrom Fournisseur\nwhere ISABONNE = 1\norder by FOUCFIN";
		    
	    		log.debug("tDBInput_1 - Executing the query: '" + dbquery_tDBInput_1 + "'.");
			

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    	log.debug("tDBInput_1 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row3.FOUCFIN = null;
							} else {
		                          
            row3.FOUCFIN = rs_tDBInput_1.getInt(1);
            if(rs_tDBInput_1.wasNull()){
                    row3.FOUCFIN = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row3.LIBFRS = null;
							} else {
	                         		
           		tmpContent_tDBInput_1 = rs_tDBInput_1.getString(2);
            if(tmpContent_tDBInput_1 != null) {
            	if (talendToDBList_tDBInput_1 .contains(rsmd_tDBInput_1.getColumnTypeName(2).toUpperCase(java.util.Locale.ENGLISH))) {
            		row3.LIBFRS = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
            	} else {
                	row3.LIBFRS = tmpContent_tDBInput_1;
                }
            } else {
                row3.LIBFRS = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row3.FOUCNUF = null;
							} else {
	                         		
           		tmpContent_tDBInput_1 = rs_tDBInput_1.getString(3);
            if(tmpContent_tDBInput_1 != null) {
            	if (talendToDBList_tDBInput_1 .contains(rsmd_tDBInput_1.getColumnTypeName(3).toUpperCase(java.util.Locale.ENGLISH))) {
            		row3.FOUCNUF = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
            	} else {
                	row3.FOUCNUF = tmpContent_tDBInput_1;
                }
            } else {
                row3.FOUCNUF = null;
            }
		                    }
					
						log.debug("tDBInput_1 - Retrieving the record " + nb_line_tDBInput_1 + ".");
					





 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tHashOutput_1 main ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";
	
	
			cLabel="Fournisseur";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row3","tDBInput_1","PORTAIL_FOURNISSEUR_AZURE","tMSSqlInput","tHashOutput_1","Fournisseur","tHashOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		



    
		row3Struct oneRow_tHashOutput_1 = new row3Struct();
				
					oneRow_tHashOutput_1.FOUCFIN = row3.FOUCFIN;
					oneRow_tHashOutput_1.LIBFRS = row3.LIBFRS;
					oneRow_tHashOutput_1.FOUCNUF = row3.FOUCNUF;
		
        tHashFile_tHashOutput_1.put(oneRow_tHashOutput_1);
        nb_line_tHashOutput_1 ++;

 


	tos_count_tHashOutput_1++;

/**
 * [tHashOutput_1 main ] stop
 */
	
	/**
	 * [tHashOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";
	
	
			cLabel="Fournisseur";
		

 



/**
 * [tHashOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tHashOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";
	
	
			cLabel="Fournisseur";
		

 



/**
 * [tHashOutput_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
	    		log.debug("tDBInput_1 - Retrieved records count: "+nb_line_tDBInput_1 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Done.") );

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tHashOutput_1 end ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";
	
	
			cLabel="Fournisseur";
		
globalMap.put("tHashOutput_1_NB_LINE", nb_line_tHashOutput_1);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tDBInput_1","PORTAIL_FOURNISSEUR_AZURE","tMSSqlInput","tHashOutput_1","Fournisseur","tHashOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tHashOutput_1", true);
end_Hash.put("tHashOutput_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBClose_1Process(globalMap);



/**
 * [tHashOutput_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tSetGlobalVar_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tHashOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tHashOutput_1";
	
	
			cLabel="Fournisseur";
		

 



/**
 * [tHashOutput_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_1", false);
		start_Hash.put("tDBClose_1", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_1";
	
	
		int tos_count_tDBClose_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBClose_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBClose_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBClose_1 = new StringBuilder();
                    log4jParamters_tDBClose_1.append("Parameters:");
                            log4jParamters_tDBClose_1.append("CONNECTION" + " = " + "tDBConnection_4");
                        log4jParamters_tDBClose_1.append(" | ");
                            log4jParamters_tDBClose_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlClose");
                        log4jParamters_tDBClose_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBClose_1 - "  + (log4jParamters_tDBClose_1) );
                    } 
                } 
            new BytesLimit65535_tDBClose_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_1", "tDBClose_1", "tMSSqlClose");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBClose_1 begin ] stop
 */
	
	/**
	 * [tDBClose_1 main ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	



	java.sql.Connection conn_tDBClose_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_4");
	if(conn_tDBClose_1 != null && !conn_tDBClose_1.isClosed())
	{
                if(log.isDebugEnabled())
            log.debug("tDBClose_1 - "  + ("Closing the connection ")  + ("conn_tDBConnection_4")  + (" to the database.") );
        conn_tDBClose_1.close();
                if(log.isDebugEnabled())
            log.debug("tDBClose_1 - "  + ("Connection ")  + ("conn_tDBConnection_4")  + (" to the database has closed.") );
	}

 


	tos_count_tDBClose_1++;

/**
 * [tDBClose_1 main ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 



/**
 * [tDBClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 



/**
 * [tDBClose_1 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_1 end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBClose_1 - "  + ("Done.") );

ok_Hash.put("tDBClose_1", true);
end_Hash.put("tDBClose_1", System.currentTimeMillis());




/**
 * [tDBClose_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_1 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	

 



/**
 * [tDBClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tSetGlobalVar_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_1", false);
		start_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_1";
	
	
		int tos_count_tSetGlobalVar_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSetGlobalVar_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSetGlobalVar_1 = new StringBuilder();
                    log4jParamters_tSetGlobalVar_1.append("Parameters:");
                            log4jParamters_tSetGlobalVar_1.append("VARIABLES" + " = " + "[{VALUE="+("TalendDate.formatDate(\"yyyy-MM-dd_HH-mm-ss\",TalendDate.getCurrentDate())")+", KEY="+("\"CurrentDate\"")+"}]");
                        log4jParamters_tSetGlobalVar_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_1 - "  + (log4jParamters_tSetGlobalVar_1) );
                    } 
                } 
            new BytesLimit65535_tSetGlobalVar_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSetGlobalVar_1", "tSetGlobalVar_1", "tSetGlobalVar");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSetGlobalVar_1 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	

globalMap.put("CurrentDate", TalendDate.formatDate("yyyy-MM-dd_HH-mm-ss",TalendDate.getCurrentDate()));

 


	tos_count_tSetGlobalVar_1++;

/**
 * [tSetGlobalVar_1 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	

 



/**
 * [tSetGlobalVar_1 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	

 



/**
 * [tSetGlobalVar_1 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_1 - "  + ("Done.") );

ok_Hash.put("tSetGlobalVar_1", true);
end_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBRow_1Process(globalMap);



/**
 * [tSetGlobalVar_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSetGlobalVar_1 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";
	
	

 



/**
 * [tSetGlobalVar_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_1", false);
		start_Hash.put("tDBRow_1", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_1";
	
	
		int tos_count_tDBRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBRow_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBRow_1 = new StringBuilder();
                    log4jParamters_tDBRow_1.append("Parameters:");
                            log4jParamters_tDBRow_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("QUERY" + " = " + "\"TRUNCATE TABLE ODS_STOCK_HEBDO_TT\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("USE_NB_LINE" + " = " + "NONE");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleRow");
                        log4jParamters_tDBRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBRow_1 - "  + (log4jParamters_tDBRow_1) );
                    } 
                } 
            new BytesLimit65535_tDBRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_1", "tDBRow_1", "tOracleRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_1 = null;
	String query_tDBRow_1 = "";
	boolean whetherReject_tDBRow_1 = false;
				conn_tDBRow_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
			
				if(conn_tDBRow_1 != null) {
					if(conn_tDBRow_1.getMetaData() != null) {
						
							log.debug("tDBRow_1 - Uses an existing connection with username '" + conn_tDBRow_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBRow_1.getMetaData().getURL() + ".");
						
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

	

	
	
	currentComponent="tDBRow_1";
	
	

query_tDBRow_1 = "TRUNCATE TABLE ODS_STOCK_HEBDO_TT";
whetherReject_tDBRow_1 = false;
	    		log.debug("tDBRow_1 - Executing the query: '" + query_tDBRow_1 + "'.");
			
globalMap.put("tDBRow_1_QUERY",query_tDBRow_1);
try {
		stmt_tDBRow_1.execute(query_tDBRow_1);
		
	    		log.info("tDBRow_1 - Execute the query: '" + query_tDBRow_1 + "' has finished.");
			
	} catch (java.lang.Exception e) {
globalMap.put("tDBRow_1_ERROR_MESSAGE",e.getMessage());
		whetherReject_tDBRow_1 = true;
		
				log.error("tDBRow_1 - " + e.getMessage());
			
				System.err.print(e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_1) {
		
	}
	

 


	tos_count_tDBRow_1++;

/**
 * [tDBRow_1 main ] stop
 */
	
	/**
	 * [tDBRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	

 



/**
 * [tDBRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	

 



/**
 * [tDBRow_1 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_1 end ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	

	
        stmt_tDBRow_1.close();
        resourceMap.remove("stmt_tDBRow_1");
    resourceMap.put("statementClosed_tDBRow_1", true);
    resourceMap.put("finish_tDBRow_1", true);

 
                if(log.isDebugEnabled())
            log.debug("tDBRow_1 - "  + ("Done.") );

ok_Hash.put("tDBRow_1", true);
end_Hash.put("tDBRow_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tParallelize_1Process(globalMap);



/**
 * [tDBRow_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_1 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	

    if (resourceMap.get("statementClosed_tDBRow_1") == null) {
            java.sql.Statement stmtToClose_tDBRow_1 = null;
            if ((stmtToClose_tDBRow_1 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_1")) != null) {
                stmtToClose_tDBRow_1.close();
            }
    }
 



/**
 * [tDBRow_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_1_SUBPROCESS_STATE", 1);
	}
	

public void tParallelize_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tParallelize_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tParallelize_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tParallelize_1", false);
		start_Hash.put("tParallelize_1", System.currentTimeMillis());
		
	
	currentComponent="tParallelize_1";
	
	
		int tos_count_tParallelize_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tParallelize_1", "tParallelize_1", "tParallelize");
				talendJobLogProcess(globalMap);
			}
			

// call parallelized subjobs
	java.util.Map<String, Thread> mt_tParallelize_1 = new java.util.HashMap<String, Thread>();

// clear the temporary values in the globalMap
	globalMap.remove("tDBInput_4_SUBPROCESS_STATE");
	globalMap.remove("tDBInput_5_SUBPROCESS_STATE");
	globalMap.remove("tDBInput_6_SUBPROCESS_STATE");
	globalMap.remove("tDBInput_7_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if(globalMap instanceof java.util.HashMap){
					concurrentMap_temp_tParallelize_1 = java.util.Collections.synchronizedMap(globalMap);
				}else{
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;
			
		runningThreadCount.add(1);
		String name_tDBInput_4 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBInput_4 = new Thread(new ThreadGroup(name_tDBInput_4), name_tDBInput_4){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_4' starts.");
					
					tDBInput_4Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_4' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_4_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_4_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBInput_4.start();
		mt_tParallelize_1.put("tDBInput_4",thread_tDBInput_4);
		runningThreadCount.add(1);
		String name_tDBInput_5 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBInput_5 = new Thread(new ThreadGroup(name_tDBInput_5), name_tDBInput_5){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_5' starts.");
					
					tDBInput_5Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_5' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_5_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_5_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBInput_5.start();
		mt_tParallelize_1.put("tDBInput_5",thread_tDBInput_5);
		runningThreadCount.add(1);
		String name_tDBInput_6 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBInput_6 = new Thread(new ThreadGroup(name_tDBInput_6), name_tDBInput_6){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_6' starts.");
					
					tDBInput_6Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_6' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_6_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_6_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBInput_6.start();
		mt_tParallelize_1.put("tDBInput_6",thread_tDBInput_6);
		runningThreadCount.add(1);
		String name_tDBInput_7 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBInput_7 = new Thread(new ThreadGroup(name_tDBInput_7), name_tDBInput_7){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_7' starts.");
					
					tDBInput_7Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_7' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_7_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBInput_7_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBInput_7.start();
		mt_tParallelize_1.put("tDBInput_7",thread_tDBInput_7);
	while(
(
		((globalMap.get("tDBInput_4_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBInput_4_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBInput_5_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBInput_5_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBInput_6_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBInput_6_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBInput_7_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBInput_7_SUBPROCESS_STATE")==0))|| false) ) {
	Thread.sleep(100);
}


// call next subprocesses
	log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_2' starts.");
	tDBInput_2Process(globalMap);
	log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_2' is done.");


 



/**
 * [tParallelize_1 begin ] stop
 */
	
	/**
	 * [tParallelize_1 main ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 


	tos_count_tParallelize_1++;

/**
 * [tParallelize_1 main ] stop
 */
	
	/**
	 * [tParallelize_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 



/**
 * [tParallelize_1 process_data_begin ] stop
 */
	
	/**
	 * [tParallelize_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 



/**
 * [tParallelize_1 process_data_end ] stop
 */
	
	/**
	 * [tParallelize_1 end ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 

ok_Hash.put("tParallelize_1", true);
end_Hash.put("tParallelize_1", System.currentTimeMillis());




/**
 * [tParallelize_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tParallelize_1 finally ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 



/**
 * [tParallelize_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tParallelize_1_SUBPROCESS_STATE", 1);
	}
	


public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return 16;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return 16;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return 255;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return 16;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return 16;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
		sb.append(",FOUCIN="+String.valueOf(FOUCIN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
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
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row1Struct row1 = new row1Struct();




	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
		int tos_count_tDBOutput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_1 = new StringBuilder();
                    log4jParamters_tDBOutput_1.append("Parameters:");
                            log4jParamters_tDBOutput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"ODS_STOCK_HEBDO_TT\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE_ACTION" + " = " + "NONE");
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
                            log4jParamters_tDBOutput_1.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + (log4jParamters_tDBOutput_1) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_1", "tDBOutput_1", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_1 = 0;
    int nb_line_update_tDBOutput_1 = 0;
    int nb_line_inserted_tDBOutput_1 = 0;
    int nb_line_deleted_tDBOutput_1 = 0;
    int nb_line_rejected_tDBOutput_1 = 0;

    int tmp_batchUpdateCount_tDBOutput_1 = 0;

    int deletedCount_tDBOutput_1=0;
    int updatedCount_tDBOutput_1=0;
    int insertedCount_tDBOutput_1=0;
    int rowsToCommitCount_tDBOutput_1=0;
    int rejectedCount_tDBOutput_1=0;

    boolean whetherReject_tDBOutput_1 = false;

    java.sql.Connection conn_tDBOutput_1 = null;

    //optional table
    String dbschema_tDBOutput_1 = null;
    String tableName_tDBOutput_1 = null;
        dbschema_tDBOutput_1 = (String)globalMap.get("dbschema_tDBConnection_3");
		
        conn_tDBOutput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_1.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_1.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_1.getAutoCommit())  + ("'.") );
        int count_tDBOutput_1=0;

        if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
            tableName_tDBOutput_1 = ("ODS_STOCK_HEBDO_TT");
        } else {
            tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "." + ("ODS_STOCK_HEBDO_TT");
        }
                String insert_tDBOutput_1 = "INSERT INTO " + tableName_tDBOutput_1 + " (CODE_ENSEIGNE,CODE_INTERNE_ARTICLE,CODE_ARTICLE,CODE_SITE,LIB_ARTICLE,EAN,VALO_STOCK,QTE_STOCK,DATE_STOCK,LAST_MAJ_DATE,FOUCIN) VALUES (?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
                        resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);





 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";
	
	
			cLabel="ORACLE_GOLD";
		
		int tos_count_tDBInput_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_4 = new StringBuilder();
                    log4jParamters_tDBInput_4.append("Parameters:");
                            log4jParamters_tDBInput_4.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERY" + " = " + "\"with vue_couche as   (SELECT STOSITE,           STOCINL,           SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,           SUM((NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *               NVL(STOPURP, 0)) VALO_STOCK      FROM STOCOUCH     WHERE STOTPOS BETWEEN 0 AND 2     GROUP BY STOSITE, STOCINL),  vue_mvts as   (SELECT STMSITE,           STMCINL,           NVL(SUM(STMVAL), 0) QTE_MVTS,           NVL(SUM(STMMCRE), 0) VALO_MVTS      FROM STOMVT     WHERE STMTPOS BETWEEN 0 AND 2       AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)     GROUP BY STMSITE, STMCINL)  SELECT S.SOCCHAIN CODEENSEIGNE,         U.ARVCINR CODE_INTERNE_ARTICLE,         U.ARVCEXR CODE_ARTICLE,         S.SOCSITE CODESITE,         REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\\\\\"\\\\\\\"', '') LIBARTICLE,         PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,         vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,         vue_couche.QTE_STOCK - NVL(QTE_MVTS, 0) QTE_STOCK,         TRUNC(SYSDATE, 'IW') DATE_STOCK,         TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') DATELASTUPDATEWEBJOB,          F.FCLCFIN FOUCIN    FROM SITDGENE   S,         CLIDGENE   C,         SITCLIREL  L,         ARTUV      U,         vue_couche,         vue_mvts,         FOUCATALOG F,         ARTRAC     A   WHERE vue_couche.STOSITE = S.SOCSITE     AND vue_couche.STOCINL = U.ARVCINV     AND U.ARVCINR = A.ARTCINR     AND A.ARTETAT IN (1, 5)     AND S.SOCCHAIN = 2     AND S.SOCSITE = L.SCLSITE     AND C.CLINCLI = L.SCLNCLI     AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND L.SCLDFIN     AND C.CLISTAT = 1     AND F.FCLCINV = U.ARVCINV     AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN     AND vue_couche.QTE_STOCK > 0     AND vue_couche.STOSITE = vue_mvts.STMSITE(+)     AND vue_couche.STOCINL = vue_mvts.STMCINL(+) and rownum<1000\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("USE_CURSOR" + " = " + "true");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("CURSOR_SIZE" + " = " + "1000");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TRIM_ALL_COLUMN" + " = " + "true");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_4 - "  + (log4jParamters_tDBInput_4) );
                    } 
                } 
            new BytesLimit65535_tDBInput_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_4", "ORACLE_GOLD", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				conn_tDBInput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
				if(conn_tDBInput_4 != null) {
					if(conn_tDBInput_4.getMetaData() != null) {
						
							log.debug("tDBInput_4 - Uses an existing connection with username '" + conn_tDBInput_4.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_4.getMetaData().getURL() + ".");
						
					}
				}
			
                boolean isTimeZoneNull_tDBInput_4 = false;
				boolean isConnectionWrapped_tDBInput_4 = !(conn_tDBInput_4 instanceof oracle.jdbc.OracleConnection) && conn_tDBInput_4.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_4 = null;
                if (isConnectionWrapped_tDBInput_4) {
					unwrappedOraConn_tDBInput_4 = conn_tDBInput_4.unwrap(oracle.jdbc.OracleConnection.class);
                    if (unwrappedOraConn_tDBInput_4 != null) {
                        isTimeZoneNull_tDBInput_4 = (unwrappedOraConn_tDBInput_4.getSessionTimeZone() == null);
                    }
                } else {
                    isTimeZoneNull_tDBInput_4 = (((oracle.jdbc.OracleConnection)conn_tDBInput_4).getSessionTimeZone() == null);
                }

				if(isTimeZoneNull_tDBInput_4) {
					java.sql.Statement stmtGetTZ_tDBInput_4 = conn_tDBInput_4.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_4 = stmtGetTZ_tDBInput_4.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_4 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_4.next()) {
						sessionTimezone_tDBInput_4 = rsGetTZ_tDBInput_4.getString(1);
					}
					if (isConnectionWrapped_tDBInput_4 && unwrappedOraConn_tDBInput_4 != null) {
                        unwrappedOraConn_tDBInput_4.setSessionTimeZone(sessionTimezone_tDBInput_4);
                    } else {
                        ((oracle.jdbc.OracleConnection)conn_tDBInput_4).setSessionTimeZone(sessionTimezone_tDBInput_4);
                    }
				}
			
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
																					java.sql.ResultSet.CONCUR_READ_ONLY);
			
                stmt_tDBInput_4.setFetchSize(1000);


		    String dbquery_tDBInput_4 = "with vue_couche as\n (SELECT STOSITE,\n         STOCINL,\n         SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV,"
+" 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,\n         SUM((NVL(STOVALI, 0) + NVL"
+"(STOVALL, 0) - NVL(STOVALV, 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *\n             NVL("
+"STOPURP, 0)) VALO_STOCK\n    FROM STOCOUCH\n   WHERE STOTPOS BETWEEN 0 AND 2\n   GROUP BY STOSITE, STOCINL),\nvue_mvts a"
+"s\n (SELECT STMSITE,\n         STMCINL,\n         NVL(SUM(STMVAL), 0) QTE_MVTS,\n         NVL(SUM(STMMCRE), 0) VALO_MVTS"
+"\n    FROM STOMVT\n   WHERE STMTPOS BETWEEN 0 AND 2\n     AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)\n   GROUP BY STMSITE, STM"
+"CINL)\nSELECT S.SOCCHAIN CODEENSEIGNE,\n       U.ARVCINR CODE_INTERNE_ARTICLE,\n       U.ARVCEXR CODE_ARTICLE,\n       S"
+".SOCSITE CODESITE,\n       REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\"\\\"', '') LIBARTICLE,\n       PKARTCOCA.GET"
+"_CLOSESTEAN(U.ARVCINV) EAN,\n       vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,\n       vue_couche.QTE_STOCK -"
+" NVL(QTE_MVTS, 0) QTE_STOCK,\n       TRUNC(SYSDATE, 'IW') DATE_STOCK,\n       TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') "
+"DATELASTUPDATEWEBJOB,\n        F.FCLCFIN FOUCIN\n  FROM SITDGENE   S,\n       CLIDGENE   C,\n       SITCLIREL  L,\n     "
+"  ARTUV      U,\n       vue_couche,\n       vue_mvts,\n       FOUCATALOG F,\n       ARTRAC     A\n WHERE vue_couche.STOS"
+"ITE = S.SOCSITE\n   AND vue_couche.STOCINL = U.ARVCINV\n   AND U.ARVCINR = A.ARTCINR\n   AND A.ARTETAT IN (1, 5)\n   AND"
+" S.SOCCHAIN = 2\n   AND S.SOCSITE = L.SCLSITE\n   AND C.CLINCLI = L.SCLNCLI\n   AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND"
+" L.SCLDFIN\n   AND C.CLISTAT = 1\n   AND F.FCLCINV = U.ARVCINV\n   AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN\n "
+"  AND vue_couche.QTE_STOCK > 0\n   AND vue_couche.STOSITE = vue_mvts.STMSITE(+)\n   AND vue_couche.STOCINL = vue_mvts.ST"
+"MCINL(+) and rownum<1000";
		    
	    		log.debug("tDBInput_4 - Executing the query: '" + dbquery_tDBInput_4 + "'.");
			

            	globalMap.put("tDBInput_4_QUERY",dbquery_tDBInput_4);
		    java.sql.ResultSet rs_tDBInput_4 = null;

		    try {
		    	rs_tDBInput_4 = stmt_tDBInput_4.executeQuery(dbquery_tDBInput_4);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_4 = rs_tDBInput_4.getMetaData();
		    	int colQtyInRs_tDBInput_4 = rsmd_tDBInput_4.getColumnCount();

		    String tmpContent_tDBInput_4 = null;
		    
		    
		    	log.debug("tDBInput_4 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_4.next()) {
		        nb_line_tDBInput_4++;
		        
							if(colQtyInRs_tDBInput_4 < 1) {
								row1.CODE_ENSEIGNE = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(1) != null) {
						row1.CODE_ENSEIGNE = rs_tDBInput_4.getLong(1);
					} else {
				
						row1.CODE_ENSEIGNE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row1.CODE_INTERNE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(2) != null) {
						row1.CODE_INTERNE_ARTICLE = rs_tDBInput_4.getLong(2);
					} else {
				
						row1.CODE_INTERNE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row1.CODE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(3) != null) {
						row1.CODE_ARTICLE = rs_tDBInput_4.getLong(3);
					} else {
				
						row1.CODE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row1.CODE_SITE = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(4) != null) {
						row1.CODE_SITE = rs_tDBInput_4.getLong(4);
					} else {
				
						row1.CODE_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row1.LIB_ARTICLE = null;
							} else {
	                         		
        	row1.LIB_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_4, 5, true);
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								row1.EAN = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(6) != null) {
						row1.EAN = rs_tDBInput_4.getLong(6);
					} else {
				
						row1.EAN = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 7) {
								row1.VALO_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(7) != null) {
						row1.VALO_STOCK = rs_tDBInput_4.getBigDecimal(7);
					} else {
				
						row1.VALO_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 8) {
								row1.QTE_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(8) != null) {
						row1.QTE_STOCK = rs_tDBInput_4.getBigDecimal(8);
					} else {
				
						row1.QTE_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 9) {
								row1.DATE_STOCK = null;
							} else {
										
			row1.DATE_STOCK = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 9);
		                    }
							if(colQtyInRs_tDBInput_4 < 10) {
								row1.LAST_MAJ_DATE = null;
							} else {
										
			row1.LAST_MAJ_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 10);
		                    }
							if(colQtyInRs_tDBInput_4 < 11) {
								row1.FOUCIN = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(11) != null) {
						row1.FOUCIN = rs_tDBInput_4.getInt(11);
					} else {
				
						row1.FOUCIN = null;
					}
		                    }
					
						log.debug("tDBInput_4 - Retrieving the record " + nb_line_tDBInput_4 + ".");
					




 



/**
 * [tDBInput_4 begin ] stop
 */
	
	/**
	 * [tDBInput_4 main ] start
	 */

	

	
	
	currentComponent="tDBInput_4";
	
	
			cLabel="ORACLE_GOLD";
		

 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tDBInput_4","ORACLE_GOLD","tOracleInput","tDBOutput_1","tDBOutput_1","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		



        whetherReject_tDBOutput_1 = false;
                        if(row1.CODE_ENSEIGNE == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(1, row1.CODE_ENSEIGNE);
}

                        if(row1.CODE_INTERNE_ARTICLE == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(2, row1.CODE_INTERNE_ARTICLE);
}

                        if(row1.CODE_ARTICLE == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(3, row1.CODE_ARTICLE);
}

                        if(row1.CODE_SITE == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(4, row1.CODE_SITE);
}

                        if(row1.LIB_ARTICLE == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(5, row1.LIB_ARTICLE);
}

                        if(row1.EAN == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setLong(6, row1.EAN);
}

                        pstmt_tDBOutput_1.setBigDecimal(7, row1.VALO_STOCK);

                        pstmt_tDBOutput_1.setBigDecimal(8, row1.QTE_STOCK);

                        if(row1.DATE_STOCK != null) {
pstmt_tDBOutput_1.setObject(9, new java.sql.Timestamp(row1.DATE_STOCK.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.DATE);
}

                        if(row1.LAST_MAJ_DATE != null) {
pstmt_tDBOutput_1.setObject(10, new java.sql.Timestamp(row1.LAST_MAJ_DATE.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_1.setNull(10, java.sql.Types.DATE);
}

                        if(row1.FOUCIN == null) {
pstmt_tDBOutput_1.setNull(11, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_1.setInt(11, row1.FOUCIN);
}

                try {
                    nb_line_tDBOutput_1++;
                    int processedCount_tDBOutput_1 = pstmt_tDBOutput_1.executeUpdate();
                    insertedCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_1)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_1) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e_tDBOutput_1.getMessage());
                    whetherReject_tDBOutput_1 = true;
            log.error("tDBOutput_1 - "  + (e_tDBOutput_1.getMessage()) );
                            System.err.print(e_tDBOutput_1.getMessage());
                }

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";
	
	
			cLabel="ORACLE_GOLD";
		

}
}finally{
	if (rs_tDBInput_4 != null) {
		rs_tDBInput_4.close();
	}
	if (stmt_tDBInput_4 != null) {
		stmt_tDBInput_4.close();
	}
}

globalMap.put("tDBInput_4_NB_LINE",nb_line_tDBInput_4);
	    		log.debug("tDBInput_4 - Retrieved records count: "+nb_line_tDBInput_4 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_4 - "  + ("Done.") );

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
	



	
        if(pstmt_tDBOutput_1 != null) {
			
				pstmt_tDBOutput_1.close();
				resourceMap.remove("pstmt_tDBOutput_1");
			
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);

	
	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_4","ORACLE_GOLD","tOracleInput","tDBOutput_1","tDBOutput_1","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Done.") );

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class row12Struct implements routines.system.IPersistableRow<row12Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return null;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				
			    public String NOM_FRNS;

				public String getNOM_FRNS () {
					return this.NOM_FRNS;
				}

				public Boolean NOM_FRNSIsNullable(){
				    return true;
				}
				public Boolean NOM_FRNSIsKey(){
				    return false;
				}
				public Integer NOM_FRNSLength(){
				    return null;
				}
				public Integer NOM_FRNSPrecision(){
				    return null;
				}
				public String NOM_FRNSDefault(){
				
					return null;
				
				}
				public String NOM_FRNSComment(){
				
				    return "";
				
				}
				public String NOM_FRNSPattern(){
				
					return "";
				
				}
				public String NOM_FRNSOriginalDbColumnName(){
				
					return "NOM_FRNS";
				
				}

				
			    public String CNUF;

				public String getCNUF () {
					return this.CNUF;
				}

				public Boolean CNUFIsNullable(){
				    return true;
				}
				public Boolean CNUFIsKey(){
				    return false;
				}
				public Integer CNUFLength(){
				    return null;
				}
				public Integer CNUFPrecision(){
				    return null;
				}
				public String CNUFDefault(){
				
					return null;
				
				}
				public String CNUFComment(){
				
				    return "";
				
				}
				public String CNUFPattern(){
				
					return "";
				
				}
				public String CNUFOriginalDbColumnName(){
				
					return "CNUF";
				
				}

				
			    public Integer CountFRN;

				public Integer getCountFRN () {
					return this.CountFRN;
				}

				public Boolean CountFRNIsNullable(){
				    return true;
				}
				public Boolean CountFRNIsKey(){
				    return false;
				}
				public Integer CountFRNLength(){
				    return null;
				}
				public Integer CountFRNPrecision(){
				    return null;
				}
				public String CountFRNDefault(){
				
					return null;
				
				}
				public String CountFRNComment(){
				
				    return "";
				
				}
				public String CountFRNPattern(){
				
					return "";
				
				}
				public String CountFRNOriginalDbColumnName(){
				
					return "CountFRN";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
					this.NOM_FRNS = readString(dis);
					
					this.CNUF = readString(dis);
					
						this.CountFRN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
					this.NOM_FRNS = readString(dis);
					
					this.CNUF = readString(dis);
					
						this.CountFRN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
					// String
				
						writeString(this.NOM_FRNS,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// Integer
				
						writeInteger(this.CountFRN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
					// String
				
						writeString(this.NOM_FRNS,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// Integer
				
						writeInteger(this.CountFRN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCIN="+String.valueOf(FOUCIN));
		sb.append(",NOM_FRNS="+NOM_FRNS);
		sb.append(",CNUF="+CNUF);
		sb.append(",CountFRN="+String.valueOf(CountFRN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
            			}
            		
        			sb.append("|");
        		
        				if(NOM_FRNS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NOM_FRNS);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF);
            			}
            		
        			sb.append("|");
        		
        				if(CountFRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CountFRN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row12Struct other) {

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

public static class OnRowsEndStructtAggregateRow_1 implements routines.system.IPersistableRow<OnRowsEndStructtAggregateRow_1> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return null;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				
			    public String NOM_FRNS;

				public String getNOM_FRNS () {
					return this.NOM_FRNS;
				}

				public Boolean NOM_FRNSIsNullable(){
				    return true;
				}
				public Boolean NOM_FRNSIsKey(){
				    return false;
				}
				public Integer NOM_FRNSLength(){
				    return null;
				}
				public Integer NOM_FRNSPrecision(){
				    return null;
				}
				public String NOM_FRNSDefault(){
				
					return null;
				
				}
				public String NOM_FRNSComment(){
				
				    return "";
				
				}
				public String NOM_FRNSPattern(){
				
					return "";
				
				}
				public String NOM_FRNSOriginalDbColumnName(){
				
					return "NOM_FRNS";
				
				}

				
			    public String CNUF;

				public String getCNUF () {
					return this.CNUF;
				}

				public Boolean CNUFIsNullable(){
				    return true;
				}
				public Boolean CNUFIsKey(){
				    return false;
				}
				public Integer CNUFLength(){
				    return null;
				}
				public Integer CNUFPrecision(){
				    return null;
				}
				public String CNUFDefault(){
				
					return null;
				
				}
				public String CNUFComment(){
				
				    return "";
				
				}
				public String CNUFPattern(){
				
					return "";
				
				}
				public String CNUFOriginalDbColumnName(){
				
					return "CNUF";
				
				}

				
			    public Integer CountFRN;

				public Integer getCountFRN () {
					return this.CountFRN;
				}

				public Boolean CountFRNIsNullable(){
				    return true;
				}
				public Boolean CountFRNIsKey(){
				    return false;
				}
				public Integer CountFRNLength(){
				    return null;
				}
				public Integer CountFRNPrecision(){
				    return null;
				}
				public String CountFRNDefault(){
				
					return null;
				
				}
				public String CountFRNComment(){
				
				    return "";
				
				}
				public String CountFRNPattern(){
				
					return "";
				
				}
				public String CountFRNOriginalDbColumnName(){
				
					return "CountFRN";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
					this.NOM_FRNS = readString(dis);
					
					this.CNUF = readString(dis);
					
						this.CountFRN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
					this.NOM_FRNS = readString(dis);
					
					this.CNUF = readString(dis);
					
						this.CountFRN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
					// String
				
						writeString(this.NOM_FRNS,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// Integer
				
						writeInteger(this.CountFRN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
					// String
				
						writeString(this.NOM_FRNS,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// Integer
				
						writeInteger(this.CountFRN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCIN="+String.valueOf(FOUCIN));
		sb.append(",NOM_FRNS="+NOM_FRNS);
		sb.append(",CNUF="+CNUF);
		sb.append(",CountFRN="+String.valueOf(CountFRN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
            			}
            		
        			sb.append("|");
        		
        				if(NOM_FRNS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NOM_FRNS);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF);
            			}
            		
        			sb.append("|");
        		
        				if(CountFRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CountFRN);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return 16;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return 16;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return 255;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return 16;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return null;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				
			    public String NOM_FRNS;

				public String getNOM_FRNS () {
					return this.NOM_FRNS;
				}

				public Boolean NOM_FRNSIsNullable(){
				    return true;
				}
				public Boolean NOM_FRNSIsKey(){
				    return false;
				}
				public Integer NOM_FRNSLength(){
				    return null;
				}
				public Integer NOM_FRNSPrecision(){
				    return null;
				}
				public String NOM_FRNSDefault(){
				
					return null;
				
				}
				public String NOM_FRNSComment(){
				
				    return "";
				
				}
				public String NOM_FRNSPattern(){
				
					return "";
				
				}
				public String NOM_FRNSOriginalDbColumnName(){
				
					return "NOM_FRNS";
				
				}

				
			    public String CNUF;

				public String getCNUF () {
					return this.CNUF;
				}

				public Boolean CNUFIsNullable(){
				    return true;
				}
				public Boolean CNUFIsKey(){
				    return false;
				}
				public Integer CNUFLength(){
				    return null;
				}
				public Integer CNUFPrecision(){
				    return null;
				}
				public String CNUFDefault(){
				
					return null;
				
				}
				public String CNUFComment(){
				
				    return "";
				
				}
				public String CNUFPattern(){
				
					return "";
				
				}
				public String CNUFOriginalDbColumnName(){
				
					return "CNUF";
				
				}

				
			    public Integer CountFRN;

				public Integer getCountFRN () {
					return this.CountFRN;
				}

				public Boolean CountFRNIsNullable(){
				    return true;
				}
				public Boolean CountFRNIsKey(){
				    return false;
				}
				public Integer CountFRNLength(){
				    return null;
				}
				public Integer CountFRNPrecision(){
				    return null;
				}
				public String CountFRNDefault(){
				
					return null;
				
				}
				public String CountFRNComment(){
				
				    return "";
				
				}
				public String CountFRNPattern(){
				
					return "";
				
				}
				public String CountFRNOriginalDbColumnName(){
				
					return "CountFRN";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
					this.NOM_FRNS = readString(dis);
					
					this.CNUF = readString(dis);
					
						this.CountFRN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
					this.NOM_FRNS = readString(dis);
					
					this.CNUF = readString(dis);
					
						this.CountFRN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
					// String
				
						writeString(this.NOM_FRNS,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// Integer
				
						writeInteger(this.CountFRN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
					// String
				
						writeString(this.NOM_FRNS,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// Integer
				
						writeInteger(this.CountFRN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCIN="+String.valueOf(FOUCIN));
		sb.append(",NOM_FRNS="+NOM_FRNS);
		sb.append(",CNUF="+CNUF);
		sb.append(",CountFRN="+String.valueOf(CountFRN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
            			}
            		
        			sb.append("|");
        		
        				if(NOM_FRNS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NOM_FRNS);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF);
            			}
            		
        			sb.append("|");
        		
        				if(CountFRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CountFRN);
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

public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return 16;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return 16;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return 255;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return 16;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return 116;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
		sb.append(",FOUCIN="+String.valueOf(FOUCIN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

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

public static class after_tDBInput_2Struct implements routines.system.IPersistableRow<after_tDBInput_2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return 16;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return 16;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return 255;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return 16;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return 116;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
		sb.append(",FOUCIN="+String.valueOf(FOUCIN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tDBInput_2Struct other) {

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
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tHashInput_1Process(globalMap);

		row7Struct row7 = new row7Struct();
out1Struct out1 = new out1Struct();
fouciStruct fouci = new fouciStruct();
row12Struct row12 = new row12Struct();





	
	/**
	 * [tDBOutput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_6", false);
		start_Hash.put("tDBOutput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_6";
	
	
			cLabel="Oracle_ODS";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out1");
			
		int tos_count_tDBOutput_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_6 = new StringBuilder();
                    log4jParamters_tDBOutput_6.append("Parameters:");
                            log4jParamters_tDBOutput_6.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("TABLE" + " = " + "\"ODS_STOCK_HEBDO\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + (log4jParamters_tDBOutput_6) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_6", "Oracle_ODS", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_6 = 0;
    int nb_line_update_tDBOutput_6 = 0;
    int nb_line_inserted_tDBOutput_6 = 0;
    int nb_line_deleted_tDBOutput_6 = 0;
    int nb_line_rejected_tDBOutput_6 = 0;

    int tmp_batchUpdateCount_tDBOutput_6 = 0;

    int deletedCount_tDBOutput_6=0;
    int updatedCount_tDBOutput_6=0;
    int insertedCount_tDBOutput_6=0;
    int rowsToCommitCount_tDBOutput_6=0;
    int rejectedCount_tDBOutput_6=0;

    boolean whetherReject_tDBOutput_6 = false;

    java.sql.Connection conn_tDBOutput_6 = null;

    //optional table
    String dbschema_tDBOutput_6 = null;
    String tableName_tDBOutput_6 = null;
        dbschema_tDBOutput_6 = (String)globalMap.get("dbschema_tDBConnection_3");
		
        conn_tDBOutput_6 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_6.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_6.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_6.getAutoCommit())  + ("'.") );
        int count_tDBOutput_6=0;

        if(dbschema_tDBOutput_6 == null || dbschema_tDBOutput_6.trim().length() == 0) {
            tableName_tDBOutput_6 = ("ODS_STOCK_HEBDO");
        } else {
            tableName_tDBOutput_6 = dbschema_tDBOutput_6 + "." + ("ODS_STOCK_HEBDO");
        }
                String insert_tDBOutput_6 = "INSERT INTO " + tableName_tDBOutput_6 + " (CODE_ENSEIGNE,CODE_INTERNE_ARTICLE,CODE_ARTICLE,CODE_SITE,LIB_ARTICLE,EAN,VALO_STOCK,QTE_STOCK,DATE_STOCK,LAST_MAJ_DATE) VALUES (?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_6 = conn_tDBOutput_6.prepareStatement(insert_tDBOutput_6);
                        resourceMap.put("pstmt_tDBOutput_6", pstmt_tDBOutput_6);





 



/**
 * [tDBOutput_6 begin ] stop
 */




	
	/**
	 * [tAggregateRow_1_AGGOUT begin ] start
	 */

	

	
		
		ok_Hash.put("tAggregateRow_1_AGGOUT", false);
		start_Hash.put("tAggregateRow_1_AGGOUT", System.currentTimeMillis());
		
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"fouci");
			
		int tos_count_tAggregateRow_1_AGGOUT = 0;
		
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGOUT - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tAggregateRow_1_AGGOUT{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tAggregateRow_1_AGGOUT = new StringBuilder();
                    log4jParamters_tAggregateRow_1_AGGOUT.append("Parameters:");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("DESTINATION" + " = " + "tAggregateRow_1");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("GROUPBYS" + " = " + "[{OUTPUT_COLUMN="+("FOUCIN")+", INPUT_COLUMN="+("FOUCIN")+"}, {OUTPUT_COLUMN="+("NOM_FRNS")+", INPUT_COLUMN="+("NOM_FRNS")+"}, {OUTPUT_COLUMN="+("CNUF")+", INPUT_COLUMN="+("CNUF")+"}]");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("OPERATIONS" + " = " + "[{OUTPUT_COLUMN="+("CountFRN")+", INPUT_COLUMN="+("FOUCIN")+", IGNORE_NULL="+("false")+", FUNCTION="+("count")+"}]");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("LIST_DELIMITER" + " = " + "\",\"");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("USE_FINANCIAL_PRECISION" + " = " + "true");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("CHECK_TYPE_OVERFLOW" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGOUT.append("CHECK_ULP" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGOUT.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGOUT - "  + (log4jParamters_tAggregateRow_1_AGGOUT) );
                    } 
                } 
            new BytesLimit65535_tAggregateRow_1_AGGOUT().limitLog4jByte();
            }
			if(enableLogStash) {
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
        	double d2 =0d;
	        
	        for (int i = 0; i < data.length; i++) {
            	d1 += (data[i]*data[i]);
            	d2 += data[i];
        	}
        
	        return Math.sqrt((n*d1 - d2*d2)/n/(n-1));
	    }
	    
		public void checkedIADD(byte a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		    byte r = (byte) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'short/Short'", "'byte/Byte'"));
		    }
		}
		
		public void checkedIADD(short a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		    short r = (short) (a + b);
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'int/Integer'", "'short/Short'"));
		    }
		}
		
		public void checkedIADD(int a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		    int r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'long/Long'", "'int/Integer'"));
		    }
		}
		
		public void checkedIADD(long a, long b, boolean checkTypeOverFlow, boolean checkUlp) {
		    long r = a + b;
		    if (checkTypeOverFlow && ((a ^ r) & (b ^ r)) < 0) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'long/Long'"));
		    }
		}
		
		public void checkedIADD(float a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    float minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
			    }
			}
			
		    if (checkTypeOverFlow && ((double) a + (double) b > (double) Float.MAX_VALUE) || ((double) a + (double) b < (double) -Float.MAX_VALUE)) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'double' or 'BigDecimal'", "'float/Float'"));
		    }
		}
		
		public void checkedIADD(double a, double b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, byte b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, short b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, int b, boolean checkTypeOverFlow, boolean checkUlp) {
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		public void checkedIADD(double a, float b, boolean checkTypeOverFlow, boolean checkUlp) {
		
			if(checkUlp) {
			    double minAddedValue = Math.ulp(a);
			    if (minAddedValue > Math.abs(b)) {
			        throw new RuntimeException(buildPrecisionMessage(String.valueOf(a), String.valueOf(a), "'BigDecimal'", "'double/Double'"));
			    }
			}
		
		    if (checkTypeOverFlow && (a + b > (double) Double.MAX_VALUE) || (a + b < -Double.MAX_VALUE )) {
		        throw new RuntimeException(buildOverflowMessage(String.valueOf(a), String.valueOf(b), "'BigDecimal'", "'double/Double'"));
		    }
		}
		
		private String buildOverflowMessage(String a, String b, String advicedTypes, String originalType) {
		    return "Type overflow when adding " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}
		
		private String buildPrecisionMessage(String a, String b, String advicedTypes, String originalType) {
		    return "The double precision is unsufficient to add the value " + b + " to " + a
		    + ", to resolve this problem, increase the precision by using "+ advicedTypes +" type in place of "+ originalType +".";
		}

	} // G_OutBegin_AggR_144

	UtilClass_tAggregateRow_1 utilClass_tAggregateRow_1 = new UtilClass_tAggregateRow_1();

	

	class AggOperationStruct_tAggregateRow_1 { // G_OutBegin_AggR_100

		private static final int DEFAULT_HASHCODE = 1;
	    private static final int PRIME = 31;
	    private int hashCode = DEFAULT_HASHCODE;
	    public boolean hashCodeDirty = true;

    				Integer FOUCIN;
    				String NOM_FRNS;
    				String CNUF;int count = 0;
       			int CountFRN_clmCount = 0;
           			
        
	    @Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;
		
							result = prime * result + ((this.FOUCIN == null) ? 0 : this.FOUCIN.hashCode());
							
							result = prime * result + ((this.NOM_FRNS == null) ? 0 : this.NOM_FRNS.hashCode());
							
							result = prime * result + ((this.CNUF == null) ? 0 : this.CNUF.hashCode());
							
	    		this.hashCode = result;
	    		this.hashCodeDirty = false;		
			}
			return this.hashCode;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			final AggOperationStruct_tAggregateRow_1 other = (AggOperationStruct_tAggregateRow_1) obj;
			
							if (this.FOUCIN == null) {
								if (other.FOUCIN != null) 
									return false;
							} else if (!this.FOUCIN.equals(other.FOUCIN)) 
								return false;
						
							if (this.NOM_FRNS == null) {
								if (other.NOM_FRNS != null) 
									return false;
							} else if (!this.NOM_FRNS.equals(other.NOM_FRNS)) 
								return false;
						
							if (this.CNUF == null) {
								if (other.CNUF != null) 
									return false;
							} else if (!this.CNUF.equals(other.CNUF)) 
								return false;
						
			
			return true;
		}
  
        
	} // G_OutBegin_AggR_100

	AggOperationStruct_tAggregateRow_1 operation_result_tAggregateRow_1 = null;
	AggOperationStruct_tAggregateRow_1 operation_finder_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();
	java.util.Map<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1> hash_tAggregateRow_1 = new java.util.HashMap<AggOperationStruct_tAggregateRow_1,AggOperationStruct_tAggregateRow_1>();
	

 



/**
 * [tAggregateRow_1_AGGOUT begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row7");
			
		int tos_count_tMap_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_2{
                    public void limitLog4jByte() throws Exception{
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
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + (log4jParamters_tMap_2) );
                    } 
                } 
            new BytesLimit65535_tMap_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_2", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row7_tMap_2 = 0;
		
		int count_row11_tMap_2 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct> tHash_Lookup_row11 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct>) 
					globalMap.get( "tHash_Lookup_row11" ))
					;					
					
	

row11Struct row11HashKey = new row11Struct();
row11Struct row11Default = new row11Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out1_tMap_2 = 0;
				
out1Struct out1_tmp = new out1Struct();
				int count_fouci_tMap_2 = 0;
				
fouciStruct fouci_tmp = new fouciStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";
	
	
		int tos_count_tDBInput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_2 = new StringBuilder();
                    log4jParamters_tDBInput_2.append("Parameters:");
                            log4jParamters_tDBInput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"ODS_STOCK_HEBDO_TT\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"select * FROM ODS_STOCK_HEBDO_TT\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_ENSEIGNE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_INTERNE_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_SITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIB_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EAN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("VALO_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("QTE_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LAST_MAJ_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FOUCIN")+"}]");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + (log4jParamters_tDBInput_2) );
                    } 
                } 
            new BytesLimit65535_tDBInput_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_2", "tDBInput_2", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				conn_tDBInput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
				
				if(conn_tDBInput_2 != null) {
					if(conn_tDBInput_2.getMetaData() != null) {
						
							log.debug("tDBInput_2 - Uses an existing connection with username '" + conn_tDBInput_2.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_2.getMetaData().getURL() + ".");
						
					}
				}
			
                boolean isTimeZoneNull_tDBInput_2 = false;
				boolean isConnectionWrapped_tDBInput_2 = !(conn_tDBInput_2 instanceof oracle.jdbc.OracleConnection) && conn_tDBInput_2.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_2 = null;
                if (isConnectionWrapped_tDBInput_2) {
					unwrappedOraConn_tDBInput_2 = conn_tDBInput_2.unwrap(oracle.jdbc.OracleConnection.class);
                    if (unwrappedOraConn_tDBInput_2 != null) {
                        isTimeZoneNull_tDBInput_2 = (unwrappedOraConn_tDBInput_2.getSessionTimeZone() == null);
                    }
                } else {
                    isTimeZoneNull_tDBInput_2 = (((oracle.jdbc.OracleConnection)conn_tDBInput_2).getSessionTimeZone() == null);
                }

				if(isTimeZoneNull_tDBInput_2) {
					java.sql.Statement stmtGetTZ_tDBInput_2 = conn_tDBInput_2.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_2 = stmtGetTZ_tDBInput_2.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_2 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_2.next()) {
						sessionTimezone_tDBInput_2 = rsGetTZ_tDBInput_2.getString(1);
					}
					if (isConnectionWrapped_tDBInput_2 && unwrappedOraConn_tDBInput_2 != null) {
                        unwrappedOraConn_tDBInput_2.setSessionTimeZone(sessionTimezone_tDBInput_2);
                    } else {
                        ((oracle.jdbc.OracleConnection)conn_tDBInput_2).setSessionTimeZone(sessionTimezone_tDBInput_2);
                    }
				}
			
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "select * FROM ODS_STOCK_HEBDO_TT";
		    
	    		log.debug("tDBInput_2 - Executing the query: '" + dbquery_tDBInput_2 + "'.");
			

            	globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);
		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    	log.debug("tDBInput_2 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row7.CODE_ENSEIGNE = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(1) != null) {
						row7.CODE_ENSEIGNE = rs_tDBInput_2.getLong(1);
					} else {
				
						row7.CODE_ENSEIGNE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row7.CODE_INTERNE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(2) != null) {
						row7.CODE_INTERNE_ARTICLE = rs_tDBInput_2.getLong(2);
					} else {
				
						row7.CODE_INTERNE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row7.CODE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(3) != null) {
						row7.CODE_ARTICLE = rs_tDBInput_2.getLong(3);
					} else {
				
						row7.CODE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row7.CODE_SITE = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(4) != null) {
						row7.CODE_SITE = rs_tDBInput_2.getLong(4);
					} else {
				
						row7.CODE_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row7.LIB_ARTICLE = null;
							} else {
	                         		
        	row7.LIB_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row7.EAN = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(6) != null) {
						row7.EAN = rs_tDBInput_2.getLong(6);
					} else {
				
						row7.EAN = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row7.VALO_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(7) != null) {
						row7.VALO_STOCK = rs_tDBInput_2.getBigDecimal(7);
					} else {
				
						row7.VALO_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								row7.QTE_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(8) != null) {
						row7.QTE_STOCK = rs_tDBInput_2.getBigDecimal(8);
					} else {
				
						row7.QTE_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								row7.DATE_STOCK = null;
							} else {
										
			row7.DATE_STOCK = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 9);
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								row7.LAST_MAJ_DATE = null;
							} else {
										
			row7.LAST_MAJ_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 10);
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								row7.FOUCIN = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(11) != null) {
						row7.FOUCIN = rs_tDBInput_2.getInt(11);
					} else {
				
						row7.FOUCIN = null;
					}
		                    }
					
						log.debug("tDBInput_2 - Retrieving the record " + nb_line_tDBInput_2 + ".");
					




 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row7","tDBInput_2","tDBInput_2","tOracleInput","tMap_2","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row7 - " + (row7==null? "": row7.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		
						row11Struct row11 = null;
					
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_2 = false;
		boolean mainRowRejected_tMap_2 = false;
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row11" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow11 = false;
       		  	    	
       		  	    	
 							row11Struct row11ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
                        		    		    row11HashKey.FOUCIN = row7.FOUCIN ;
                        		    		

								
		                        	row11HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row11.lookup( row11HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row11.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
	
		  								forceLooprow11 = true;
	  					
  									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
								
								else { // G 20 - G 21
   									forceLooprow11 = true;
			           		  	} // G 21
                    		  	
                    		

							
                    		  	 
							

								while ((tHash_Lookup_row11 != null && tHash_Lookup_row11.hasNext()) || forceLooprow11) { // G_TM_M_043

								
									 // CALL close loop of lookup 'row11'
									
                    		  	 
							   
                    		  	 
	       		  	    	row11Struct fromLookup_row11 = null;
							row11 = row11Default;
										 
							
								
								if(!forceLooprow11) { // G 46
								
							
								 
							
								
								fromLookup_row11 = tHash_Lookup_row11.next();

							

							if(fromLookup_row11 != null) {
								row11 = fromLookup_row11;
							}
							
							
							
			  							
								
	                    		  	
		                    
	                    	
	                    		} // G 46
	                    		  	
								forceLooprow11 = false;
									 	
							
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

out1 = null;
fouci = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'out1'
count_out1_tMap_2++;

out1_tmp.CODE_ENSEIGNE = row7.CODE_ENSEIGNE ;
out1_tmp.CODE_INTERNE_ARTICLE = row7.CODE_INTERNE_ARTICLE ;
out1_tmp.CODE_ARTICLE = row7.CODE_ARTICLE ;
out1_tmp.CODE_SITE = row7.CODE_SITE ;
out1_tmp.LIB_ARTICLE = row7.LIB_ARTICLE ;
out1_tmp.EAN = row7.EAN ;
out1_tmp.VALO_STOCK = row7.VALO_STOCK ;
out1_tmp.QTE_STOCK = row7.QTE_STOCK ;
out1_tmp.DATE_STOCK = row7.DATE_STOCK ;
out1_tmp.LAST_MAJ_DATE = row7.LAST_MAJ_DATE ;
out1 = out1_tmp;
log.debug("tMap_2 - Outputting the record " + count_out1_tMap_2 + " of the output table 'out1'.");


// # Output table : 'fouci'
count_fouci_tMap_2++;

fouci_tmp.FOUCIN = row11.FOUCIN ;
fouci_tmp.NOM_FRNS = row11.LIBFRS ;
fouci_tmp.CNUF = row11.FOUCNUF ;
fouci_tmp.CountFRN = null;
fouci = fouci_tmp;
log.debug("tMap_2 - Outputting the record " + count_fouci_tMap_2 + " of the output table 'fouci'.");

}  // closing inner join bracket (2)
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

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "out1"
if(out1 != null) { 



	
	/**
	 * [tDBOutput_6 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
			cLabel="Oracle_ODS";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out1","tMap_2","tMap_1","tMap","tDBOutput_6","Oracle_ODS","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out1 - " + (out1==null? "": out1.toLogString()));
    			}
    		



        whetherReject_tDBOutput_6 = false;
                        if(out1.CODE_ENSEIGNE == null) {
pstmt_tDBOutput_6.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_6.setLong(1, out1.CODE_ENSEIGNE);
}

                        if(out1.CODE_INTERNE_ARTICLE == null) {
pstmt_tDBOutput_6.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_6.setLong(2, out1.CODE_INTERNE_ARTICLE);
}

                        if(out1.CODE_ARTICLE == null) {
pstmt_tDBOutput_6.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_6.setLong(3, out1.CODE_ARTICLE);
}

                        if(out1.CODE_SITE == null) {
pstmt_tDBOutput_6.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_6.setLong(4, out1.CODE_SITE);
}

                        if(out1.LIB_ARTICLE == null) {
pstmt_tDBOutput_6.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(5, out1.LIB_ARTICLE);
}

                        if(out1.EAN == null) {
pstmt_tDBOutput_6.setNull(6, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_6.setLong(6, out1.EAN);
}

                        pstmt_tDBOutput_6.setBigDecimal(7, out1.VALO_STOCK);

                        pstmt_tDBOutput_6.setBigDecimal(8, out1.QTE_STOCK);

                        if(out1.DATE_STOCK != null) {
pstmt_tDBOutput_6.setObject(9, new java.sql.Timestamp(out1.DATE_STOCK.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_6.setNull(9, java.sql.Types.DATE);
}

                        if(out1.LAST_MAJ_DATE != null) {
pstmt_tDBOutput_6.setObject(10, new java.sql.Timestamp(out1.LAST_MAJ_DATE.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_6.setNull(10, java.sql.Types.DATE);
}

                try {
                    nb_line_tDBOutput_6++;
                    int processedCount_tDBOutput_6 = pstmt_tDBOutput_6.executeUpdate();
                    insertedCount_tDBOutput_6 += processedCount_tDBOutput_6;
                    rowsToCommitCount_tDBOutput_6 += processedCount_tDBOutput_6;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_6)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_6) {
globalMap.put("tDBOutput_6_ERROR_MESSAGE",e_tDBOutput_6.getMessage());
                    whetherReject_tDBOutput_6 = true;
            log.error("tDBOutput_6 - "  + (e_tDBOutput_6.getMessage()) );
                            System.err.print(e_tDBOutput_6.getMessage());
                }

 


	tos_count_tDBOutput_6++;

/**
 * [tDBOutput_6 main ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
			cLabel="Oracle_ODS";
		

 



/**
 * [tDBOutput_6 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
			cLabel="Oracle_ODS";
		

 



/**
 * [tDBOutput_6 process_data_end ] stop
 */

} // End of branch "out1"




// Start of branch "fouci"
if(fouci != null) { 



	
	/**
	 * [tAggregateRow_1_AGGOUT main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"fouci","tMap_2","tMap_1","tMap","tAggregateRow_1_AGGOUT","tAggregateRow_1_AGGOUT","tAggregateOut"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("fouci - " + (fouci==null? "": fouci.toLogString()));
    			}
    		
	
operation_finder_tAggregateRow_1.FOUCIN = fouci.FOUCIN;
			operation_finder_tAggregateRow_1.NOM_FRNS = fouci.NOM_FRNS;
			operation_finder_tAggregateRow_1.CNUF = fouci.CNUF;
			

	operation_finder_tAggregateRow_1.hashCodeDirty = true;
	
	operation_result_tAggregateRow_1 = hash_tAggregateRow_1.get(operation_finder_tAggregateRow_1);

	

	if(operation_result_tAggregateRow_1 == null) { // G_OutMain_AggR_001

		operation_result_tAggregateRow_1 = new AggOperationStruct_tAggregateRow_1();

		operation_result_tAggregateRow_1.FOUCIN = operation_finder_tAggregateRow_1.FOUCIN;
				operation_result_tAggregateRow_1.NOM_FRNS = operation_finder_tAggregateRow_1.NOM_FRNS;
				operation_result_tAggregateRow_1.CNUF = operation_finder_tAggregateRow_1.CNUF;
				
		
		

		hash_tAggregateRow_1.put(operation_result_tAggregateRow_1, operation_result_tAggregateRow_1);
	
	} // G_OutMain_AggR_001


	
				operation_result_tAggregateRow_1.CountFRN_clmCount++;
				operation_result_tAggregateRow_1.count++;
				


 


	tos_count_tAggregateRow_1_AGGOUT++;

/**
 * [tAggregateRow_1_AGGOUT main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGOUT process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

 



/**
 * [tAggregateRow_1_AGGOUT process_data_end ] stop
 */

} // End of branch "fouci"



	
		} // close loop of lookup 'row11' // G_TM_M_043
	
	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
}

globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
	    		log.debug("tDBInput_2 - Retrieved records count: "+nb_line_tDBInput_2 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + ("Done.") );

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row11 != null) {
						tHash_Lookup_row11.endGet();
					}
					globalMap.remove( "tHash_Lookup_row11" );

					
					
				
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'out1': " + count_out1_tMap_2 + ".");
				log.debug("tMap_2 - Written records count in the table 'fouci': " + count_fouci_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row7",2,0,
			 			"tDBInput_2","tDBInput_2","tOracleInput","tMap_2","tMap_1","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Done.") );

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tDBOutput_6 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
			cLabel="Oracle_ODS";
		
	



	
        if(pstmt_tDBOutput_6 != null) {
			
				pstmt_tDBOutput_6.close();
				resourceMap.remove("pstmt_tDBOutput_6");
			
        }
    resourceMap.put("statementClosed_tDBOutput_6", true);

	
	nb_line_deleted_tDBOutput_6=nb_line_deleted_tDBOutput_6+ deletedCount_tDBOutput_6;
	nb_line_update_tDBOutput_6=nb_line_update_tDBOutput_6 + updatedCount_tDBOutput_6;
	nb_line_inserted_tDBOutput_6=nb_line_inserted_tDBOutput_6 + insertedCount_tDBOutput_6;
	nb_line_rejected_tDBOutput_6=nb_line_rejected_tDBOutput_6 + rejectedCount_tDBOutput_6;
	
        globalMap.put("tDBOutput_6_NB_LINE",nb_line_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_UPDATED",nb_line_update_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_DELETED",nb_line_deleted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_6);
    

	



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out1",2,0,
			 			"tMap_2","tMap_1","tMap","tDBOutput_6","Oracle_ODS","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Done.") );

ok_Hash.put("tDBOutput_6", true);
end_Hash.put("tDBOutput_6", System.currentTimeMillis());




/**
 * [tDBOutput_6 end ] stop
 */




	
	/**
	 * [tAggregateRow_1_AGGOUT end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"fouci",2,0,
			 			"tMap_2","tMap_1","tMap","tAggregateRow_1_AGGOUT","tAggregateRow_1_AGGOUT","tAggregateOut","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGOUT - "  + ("Done.") );

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
		
	
	currentComponent="tHashOutput_2";
	
	
			cLabel="COUNTFRN";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row12");
			
		int tos_count_tHashOutput_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tHashOutput_2", "COUNTFRN", "tHashOutput");
				talendJobLogProcess(globalMap);
			}
			



org.talend.designer.components.hashfile.common.MapHashFile mf_tHashOutput_2=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();    
		org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row12Struct> tHashFile_tHashOutput_2 = null;
		String hashKey_tHashOutput_2 = "tHashFile_JOB_STOCK_HEBDO_" + pid + "_tHashOutput_2";
			synchronized(org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.get(hashKey_tHashOutput_2)){
			    if(mf_tHashOutput_2.getResourceMap().get(hashKey_tHashOutput_2) == null){
	      		    mf_tHashOutput_2.getResourceMap().put(hashKey_tHashOutput_2, new org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row12Struct>(org.talend.designer.components.hashfile.common.MATCHING_MODE.KEEP_ALL));
	      		    tHashFile_tHashOutput_2 = mf_tHashOutput_2.getResourceMap().get(hashKey_tHashOutput_2);
			    }else{
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
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	
		int tos_count_tAggregateRow_1_AGGIN = 0;
		
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tAggregateRow_1_AGGIN{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tAggregateRow_1_AGGIN = new StringBuilder();
                    log4jParamters_tAggregateRow_1_AGGIN.append("Parameters:");
                            log4jParamters_tAggregateRow_1_AGGIN.append("ORIGIN" + " = " + "tAggregateRow_1");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("GROUPBYS" + " = " + "[{OUTPUT_COLUMN="+("FOUCIN")+", INPUT_COLUMN="+("FOUCIN")+"}, {OUTPUT_COLUMN="+("NOM_FRNS")+", INPUT_COLUMN="+("NOM_FRNS")+"}, {OUTPUT_COLUMN="+("CNUF")+", INPUT_COLUMN="+("CNUF")+"}]");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("OPERATIONS" + " = " + "[{OUTPUT_COLUMN="+("CountFRN")+", INPUT_COLUMN="+("FOUCIN")+", IGNORE_NULL="+("false")+", FUNCTION="+("count")+"}]");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("LIST_DELIMITER" + " = " + "\",\"");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("USE_FINANCIAL_PRECISION" + " = " + "true");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("CHECK_TYPE_OVERFLOW" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                            log4jParamters_tAggregateRow_1_AGGIN.append("CHECK_ULP" + " = " + "false");
                        log4jParamters_tAggregateRow_1_AGGIN.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + (log4jParamters_tAggregateRow_1_AGGIN) );
                    } 
                } 
            new BytesLimit65535_tAggregateRow_1_AGGIN().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tAggregateRow_1_AGGIN", "tAggregateRow_1_AGGIN", "tAggregateIn");
				talendJobLogProcess(globalMap);
			}
			

java.util.Collection<AggOperationStruct_tAggregateRow_1> values_tAggregateRow_1 = hash_tAggregateRow_1.values();

globalMap.put("tAggregateRow_1_NB_LINE", values_tAggregateRow_1.size());

                if(log.isInfoEnabled())
            log.info("tAggregateRow_1_AGGIN - "  + ("Retrieving the aggregation results.") );
for(AggOperationStruct_tAggregateRow_1 aggregated_row_tAggregateRow_1 : values_tAggregateRow_1) { // G_AggR_600



 



/**
 * [tAggregateRow_1_AGGIN begin ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN main ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

            				    row12.FOUCIN = aggregated_row_tAggregateRow_1.FOUCIN;
            				    
            				    row12.NOM_FRNS = aggregated_row_tAggregateRow_1.NOM_FRNS;
            				    
            				    row12.CNUF = aggregated_row_tAggregateRow_1.CNUF;
            				    row12.CountFRN = (int) aggregated_row_tAggregateRow_1.count;
	                                	row12.CountFRN = (int) aggregated_row_tAggregateRow_1.CountFRN_clmCount;
	                                	
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Operation function: 'count' on the column 'FOUCIN'.") );

 


	tos_count_tAggregateRow_1_AGGIN++;

/**
 * [tAggregateRow_1_AGGIN main ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

 



/**
 * [tAggregateRow_1_AGGIN process_data_begin ] stop
 */

	
	/**
	 * [tHashOutput_2 main ] start
	 */

	

	
	
	currentComponent="tHashOutput_2";
	
	
			cLabel="COUNTFRN";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row12","tAggregateRow_1_AGGIN","tAggregateRow_1_AGGIN","tAggregateIn","tHashOutput_2","COUNTFRN","tHashOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row12 - " + (row12==null? "": row12.toLogString()));
    			}
    		



    
		row12Struct oneRow_tHashOutput_2 = new row12Struct();
				
					oneRow_tHashOutput_2.FOUCIN = row12.FOUCIN;
					oneRow_tHashOutput_2.NOM_FRNS = row12.NOM_FRNS;
					oneRow_tHashOutput_2.CNUF = row12.CNUF;
					oneRow_tHashOutput_2.CountFRN = row12.CountFRN;
		
        tHashFile_tHashOutput_2.put(oneRow_tHashOutput_2);
        nb_line_tHashOutput_2 ++;

 


	tos_count_tHashOutput_2++;

/**
 * [tHashOutput_2 main ] stop
 */
	
	/**
	 * [tHashOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashOutput_2";
	
	
			cLabel="COUNTFRN";
		

 



/**
 * [tHashOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tHashOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashOutput_2";
	
	
			cLabel="COUNTFRN";
		

 



/**
 * [tHashOutput_2 process_data_end ] stop
 */



	
	/**
	 * [tAggregateRow_1_AGGIN process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

 



/**
 * [tAggregateRow_1_AGGIN process_data_end ] stop
 */
	
	/**
	 * [tAggregateRow_1_AGGIN end ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

} // G_AggR_600

 
                if(log.isDebugEnabled())
            log.debug("tAggregateRow_1_AGGIN - "  + ("Done.") );

ok_Hash.put("tAggregateRow_1_AGGIN", true);
end_Hash.put("tAggregateRow_1_AGGIN", System.currentTimeMillis());




/**
 * [tAggregateRow_1_AGGIN end ] stop
 */

	
	/**
	 * [tHashOutput_2 end ] start
	 */

	

	
	
	currentComponent="tHashOutput_2";
	
	
			cLabel="COUNTFRN";
		
globalMap.put("tHashOutput_2_NB_LINE", nb_line_tHashOutput_2);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row12",2,0,
			 			"tAggregateRow_1_AGGIN","tAggregateRow_1_AGGIN","tAggregateIn","tHashOutput_2","COUNTFRN","tHashOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tHashOutput_2", true);
end_Hash.put("tHashOutput_2", System.currentTimeMillis());




/**
 * [tHashOutput_2 end ] stop
 */












				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tDBConnection_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
							//free memory for "tAggregateRow_1_AGGIN"
							globalMap.remove("tAggregateRow_1");
						
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row11"); 
				     			
				try{
					
	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
			cLabel="Oracle_ODS";
		



    if (resourceMap.get("statementClosed_tDBOutput_6") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_6 = null;
                if ((pstmtToClose_tDBOutput_6 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_6")) != null) {
                    pstmtToClose_tDBOutput_6.close();
                }
    }
 



/**
 * [tDBOutput_6 finally ] stop
 */




	
	/**
	 * [tAggregateRow_1_AGGOUT finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGOUT";
	
	

 



/**
 * [tAggregateRow_1_AGGOUT finally ] stop
 */

	
	/**
	 * [tAggregateRow_1_AGGIN finally ] start
	 */

	

	
	
		currentVirtualComponent = "tAggregateRow_1";
	
	currentComponent="tAggregateRow_1_AGGIN";
	
	

 



/**
 * [tAggregateRow_1_AGGIN finally ] stop
 */

	
	/**
	 * [tHashOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tHashOutput_2";
	
	
			cLabel="COUNTFRN";
		

 



/**
 * [tHashOutput_2 finally ] stop
 */












				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="MSS AZURE";
		
		int tos_count_tDBConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBConnection_1 = new StringBuilder();
                    log4jParamters_tDBConnection_1.append("Parameters:");
                            log4jParamters_tDBConnection_1.append("DRIVER" + " = " + "JTDS");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("HOST" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Server");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PORT" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Port");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("DBNAME" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Database");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USER" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_Login");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.PORTAIL_FOURNISSEUR_AZURE_Password)).substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PROPERTIES" + " = " + "context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
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
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + (log4jParamters_tDBConnection_1) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "MSS AZURE", "tMSSqlConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
			String url_tDBConnection_1 = "jdbc:jtds:sqlserver://" + context.PORTAIL_FOURNISSEUR_AZURE_Server ;
		String port_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Port;
		String dbname_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Database ;
    	if (!"".equals(port_tDBConnection_1)) {
    		url_tDBConnection_1 += ":" + context.PORTAIL_FOURNISSEUR_AZURE_Port;
    	}
    	if (!"".equals(dbname_tDBConnection_1)) {
    		
				url_tDBConnection_1 += "//" + context.PORTAIL_FOURNISSEUR_AZURE_Database; 
    	}

		url_tDBConnection_1 += ";appName=" + projectName + ";" + context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams;  
	String dbUser_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Login;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.PORTAIL_FOURNISSEUR_AZURE_Password; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
		
			String driverClass_tDBConnection_1 = "net.sourceforge.jtds.jdbc.Driver";
			java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
			globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);
		
	    		log.debug("tDBConnection_1 - Driver ClassName: "+driverClass_tDBConnection_1+".");
			
	    		log.debug("tDBConnection_1 - Connection attempt to '" + url_tDBConnection_1 + "' with the username '" + dbUser_tDBConnection_1 + "'.");
			
			conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1,dbUser_tDBConnection_1,dbPwd_tDBConnection_1);
	    		log.debug("tDBConnection_1 - Connection to '" + url_tDBConnection_1 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			log.debug("tDBConnection_1 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("dbschema_tDBConnection_1", "");

	globalMap.put("db_tDBConnection_1",  context.PORTAIL_FOURNISSEUR_AZURE_Database);
	
	globalMap.put("shareIdentitySetting_tDBConnection_1",  true);

	globalMap.put("driver_tDBConnection_1", "JTDS");

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="MSS AZURE";
		

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="MSS AZURE";
		

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="MSS AZURE";
		

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="MSS AZURE";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Done.") );

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBInput_3Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="MSS AZURE";
		

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	


public static class row8Struct implements routines.system.IPersistableRow<row8Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODEENSEIGNE;

				public Long getCODEENSEIGNE () {
					return this.CODEENSEIGNE;
				}

				public Boolean CODEENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODEENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODEENSEIGNELength(){
				    return 16;
				}
				public Integer CODEENSEIGNEPrecision(){
				    return null;
				}
				public String CODEENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODEENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODEENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODEENSEIGNEOriginalDbColumnName(){
				
					return "CODEENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODESITE;

				public Long getCODESITE () {
					return this.CODESITE;
				}

				public Boolean CODESITEIsNullable(){
				    return true;
				}
				public Boolean CODESITEIsKey(){
				    return false;
				}
				public Integer CODESITELength(){
				    return 16;
				}
				public Integer CODESITEPrecision(){
				    return null;
				}
				public String CODESITEDefault(){
				
					return null;
				
				}
				public String CODESITEComment(){
				
				    return "";
				
				}
				public String CODESITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODESITEOriginalDbColumnName(){
				
					return "CODESITE";
				
				}

				
			    public String LIBARTICLE;

				public String getLIBARTICLE () {
					return this.LIBARTICLE;
				}

				public Boolean LIBARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIBARTICLEIsKey(){
				    return false;
				}
				public Integer LIBARTICLELength(){
				    return null;
				}
				public Integer LIBARTICLEPrecision(){
				    return null;
				}
				public String LIBARTICLEDefault(){
				
					return null;
				
				}
				public String LIBARTICLEComment(){
				
				    return "";
				
				}
				public String LIBARTICLEPattern(){
				
					return "";
				
				}
				public String LIBARTICLEOriginalDbColumnName(){
				
					return "LIBARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return 16;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date DateLastUpdateWebJob;

				public java.util.Date getDateLastUpdateWebJob () {
					return this.DateLastUpdateWebJob;
				}

				public Boolean DateLastUpdateWebJobIsNullable(){
				    return true;
				}
				public Boolean DateLastUpdateWebJobIsKey(){
				    return false;
				}
				public Integer DateLastUpdateWebJobLength(){
				    return null;
				}
				public Integer DateLastUpdateWebJobPrecision(){
				    return null;
				}
				public String DateLastUpdateWebJobDefault(){
				
					return null;
				
				}
				public String DateLastUpdateWebJobComment(){
				
				    return "";
				
				}
				public String DateLastUpdateWebJobPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String DateLastUpdateWebJobOriginalDbColumnName(){
				
					return "DateLastUpdateWebJob";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODEENSEIGNE = null;
           				} else {
           			    	this.CODEENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODESITE = null;
           				} else {
           			    	this.CODESITE = dis.readLong();
           				}
					
					this.LIBARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.DateLastUpdateWebJob = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODEENSEIGNE = null;
           				} else {
           			    	this.CODEENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODESITE = null;
           				} else {
           			    	this.CODESITE = dis.readLong();
           				}
					
					this.LIBARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.DateLastUpdateWebJob = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODEENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODEENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODESITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODESITE);
		            	}
					
					// String
				
						writeString(this.LIBARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.DateLastUpdateWebJob,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODEENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODEENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODESITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODESITE);
		            	}
					
					// String
				
						writeString(this.LIBARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.DateLastUpdateWebJob,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODEENSEIGNE="+String.valueOf(CODEENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODESITE="+String.valueOf(CODESITE));
		sb.append(",LIBARTICLE="+LIBARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",DateLastUpdateWebJob="+String.valueOf(DateLastUpdateWebJob));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODEENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODEENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODESITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODESITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIBARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DateLastUpdateWebJob == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DateLastUpdateWebJob);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODEENSEIGNE;

				public Long getCODEENSEIGNE () {
					return this.CODEENSEIGNE;
				}

				public Boolean CODEENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODEENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODEENSEIGNELength(){
				    return 16;
				}
				public Integer CODEENSEIGNEPrecision(){
				    return null;
				}
				public String CODEENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODEENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODEENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODEENSEIGNEOriginalDbColumnName(){
				
					return "CODEENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODESITE;

				public Long getCODESITE () {
					return this.CODESITE;
				}

				public Boolean CODESITEIsNullable(){
				    return true;
				}
				public Boolean CODESITEIsKey(){
				    return false;
				}
				public Integer CODESITELength(){
				    return 16;
				}
				public Integer CODESITEPrecision(){
				    return null;
				}
				public String CODESITEDefault(){
				
					return null;
				
				}
				public String CODESITEComment(){
				
				    return "";
				
				}
				public String CODESITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODESITEOriginalDbColumnName(){
				
					return "CODESITE";
				
				}

				
			    public String LIBARTICLE;

				public String getLIBARTICLE () {
					return this.LIBARTICLE;
				}

				public Boolean LIBARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIBARTICLEIsKey(){
				    return false;
				}
				public Integer LIBARTICLELength(){
				    return null;
				}
				public Integer LIBARTICLEPrecision(){
				    return null;
				}
				public String LIBARTICLEDefault(){
				
					return null;
				
				}
				public String LIBARTICLEComment(){
				
				    return "";
				
				}
				public String LIBARTICLEPattern(){
				
					return "";
				
				}
				public String LIBARTICLEOriginalDbColumnName(){
				
					return "LIBARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return 16;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date DateLastUpdateWebJob;

				public java.util.Date getDateLastUpdateWebJob () {
					return this.DateLastUpdateWebJob;
				}

				public Boolean DateLastUpdateWebJobIsNullable(){
				    return true;
				}
				public Boolean DateLastUpdateWebJobIsKey(){
				    return false;
				}
				public Integer DateLastUpdateWebJobLength(){
				    return null;
				}
				public Integer DateLastUpdateWebJobPrecision(){
				    return null;
				}
				public String DateLastUpdateWebJobDefault(){
				
					return null;
				
				}
				public String DateLastUpdateWebJobComment(){
				
				    return "";
				
				}
				public String DateLastUpdateWebJobPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String DateLastUpdateWebJobOriginalDbColumnName(){
				
					return "DateLastUpdateWebJob";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODEENSEIGNE = null;
           				} else {
           			    	this.CODEENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODESITE = null;
           				} else {
           			    	this.CODESITE = dis.readLong();
           				}
					
					this.LIBARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.DateLastUpdateWebJob = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODEENSEIGNE = null;
           				} else {
           			    	this.CODEENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODESITE = null;
           				} else {
           			    	this.CODESITE = dis.readLong();
           				}
					
					this.LIBARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.DateLastUpdateWebJob = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODEENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODEENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODESITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODESITE);
		            	}
					
					// String
				
						writeString(this.LIBARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.DateLastUpdateWebJob,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODEENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODEENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODESITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODESITE);
		            	}
					
					// String
				
						writeString(this.LIBARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.DateLastUpdateWebJob,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODEENSEIGNE="+String.valueOf(CODEENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODESITE="+String.valueOf(CODESITE));
		sb.append(",LIBARTICLE="+LIBARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",DateLastUpdateWebJob="+String.valueOf(DateLastUpdateWebJob));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODEENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODEENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODESITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODESITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIBARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DateLastUpdateWebJob == null){
        					sb.append("<null>");
        				}else{
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return 16;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return 16;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return 16;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return null;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return 16;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
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
public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();
OUT_AZUREStruct OUT_AZURE = new OUT_AZUREStruct();
row8Struct row8 = new row8Struct();






	
	/**
	 * [tDBOutput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_5", false);
		start_Hash.put("tDBOutput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_5";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row8");
			
		int tos_count_tDBOutput_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_5 = new StringBuilder();
                    log4jParamters_tDBOutput_5.append("Parameters:");
                            log4jParamters_tDBOutput_5.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TABLE" + " = " + "\"StockParArticleTT\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("IDENTITY_INSERT" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_FIELD_OPTIONS" + " = " + "true");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("FIELD_OPTIONS" + " = " + "[{UPDATE_KEY="+("false")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("CODEENSEIGNE")+"}, {UPDATE_KEY="+("true")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("CODE_INTERNE_ARTICLE")+"}, {UPDATE_KEY="+("false")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("CODE_ARTICLE")+"}, {UPDATE_KEY="+("true")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("CODESITE")+"}, {UPDATE_KEY="+("false")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("LIBARTICLE")+"}, {UPDATE_KEY="+("false")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("EAN")+"}, {UPDATE_KEY="+("false")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("VALO_STOCK")+"}, {UPDATE_KEY="+("false")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("QTE_STOCK")+"}, {UPDATE_KEY="+("true")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("DATE_STOCK")+"}, {UPDATE_KEY="+("false")+", DELETE_KEY="+("false")+", UPDATABLE="+("true")+", INSERTABLE="+("true")+", SCHEMA_COLUMN="+("DateLastUpdateWebJob")+"}]");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("IGNORE_DATE_OUTOF_RANGE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_BATCH_SIZE" + " = " + "true");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("BATCH_SIZE" + " = " + "50000");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlOutput");
                        log4jParamters_tDBOutput_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + (log4jParamters_tDBOutput_5) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_5", "PORTAIL_FOURNISSEUR_AZURE", "tMSSqlOutput");
				talendJobLogProcess(globalMap);
			}
			



int nb_line_tDBOutput_5 = 0;
int nb_line_update_tDBOutput_5 = 0;
int nb_line_inserted_tDBOutput_5 = 0;
int nb_line_deleted_tDBOutput_5 = 0;
int nb_line_rejected_tDBOutput_5 = 0;

int deletedCount_tDBOutput_5=0;
int updatedCount_tDBOutput_5=0;
int insertedCount_tDBOutput_5=0;
int rowsToCommitCount_tDBOutput_5=0;
int rejectedCount_tDBOutput_5=0;
String dbschema_tDBOutput_5 = null;
String tableName_tDBOutput_5 = null;
boolean whetherReject_tDBOutput_5 = false;

java.util.Calendar calendar_tDBOutput_5 = java.util.Calendar.getInstance();
long year1_tDBOutput_5 = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_tDBOutput_5 = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_tDBOutput_5 = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_tDBOutput_5;

java.util.Calendar calendar_datetimeoffset_tDBOutput_5 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));



	
java.sql.Connection conn_tDBOutput_5 = null;
String dbUser_tDBOutput_5 = null;
	dbschema_tDBOutput_5 = (String)globalMap.get("dbschema_tDBConnection_1");
	
	conn_tDBOutput_5 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_5.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_5.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_5.getAutoCommit())  + ("'.") );
   int batchSize_tDBOutput_5 = 50000;
   int batchSizeCounter_tDBOutput_5=0;

if(dbschema_tDBOutput_5 == null || dbschema_tDBOutput_5.trim().length() == 0) {
    tableName_tDBOutput_5 = "StockParArticleTT";
} else {
    tableName_tDBOutput_5 = dbschema_tDBOutput_5 + "].[" + "StockParArticleTT";
}
	int count_tDBOutput_5=0;

            int rsTruncCountNumber_tDBOutput_5 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_5 = conn_tDBOutput_5.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_5 = stmtTruncCount_tDBOutput_5.executeQuery("SELECT COUNT(1) FROM [" + tableName_tDBOutput_5 + "]")) {
                    if(rsTruncCount_tDBOutput_5.next()) {
                        rsTruncCountNumber_tDBOutput_5 = rsTruncCount_tDBOutput_5.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_5 = conn_tDBOutput_5.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Truncating")  + (" table '")  + ("[" +tableName_tDBOutput_5 + "]")  + ("'.") );
                stmtTrunc_tDBOutput_5.executeUpdate("TRUNCATE TABLE [" + tableName_tDBOutput_5 + "]");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Truncate")  + (" table '")  + ("[" +tableName_tDBOutput_5 + "]")  + ("' has succeeded.") );
                deletedCount_tDBOutput_5 += rsTruncCountNumber_tDBOutput_5;
            }
    java.sql.PreparedStatement pstmt_tDBOutput_5 = null;
    java.sql.PreparedStatement pstmtInsert_tDBOutput_5 = null;
    java.sql.PreparedStatement pstmtUpdate_tDBOutput_5 = null;
        String insert_tDBOutput_5 = "INSERT INTO [" + tableName_tDBOutput_5 + "] ([CODEENSEIGNE],[CODE_INTERNE_ARTICLE],[CODE_ARTICLE],[CODESITE],[LIBARTICLE],[EAN],[VALO_STOCK],[QTE_STOCK],[DATE_STOCK],[DateLastUpdateWebJob]) VALUES (?,?,?,?,?,?,?,?,?,?)";
        pstmt_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(insert_tDBOutput_5);
        resourceMap.put("pstmt_tDBOutput_5", pstmt_tDBOutput_5);

 	boolean isShareIdentity_tDBOutput_5 = globalMap.get("shareIdentitySetting_tDBConnection_1") != null && (Boolean)globalMap.get("shareIdentitySetting_tDBConnection_1") == true;

 



/**
 * [tDBOutput_5 begin ] stop
 */



	
	/**
	 * [tUniqRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tUniqRow_1", false);
		start_Hash.put("tUniqRow_1", System.currentTimeMillis());
		
	
	currentComponent="tUniqRow_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"OUT_AZURE");
			
		int tos_count_tUniqRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tUniqRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tUniqRow_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tUniqRow_1 = new StringBuilder();
                    log4jParamters_tUniqRow_1.append("Parameters:");
                            log4jParamters_tUniqRow_1.append("UNIQUE_KEY" + " = " + "[{CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("CODEENSEIGNE")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("true")+", SCHEMA_COLUMN="+("CODE_INTERNE_ARTICLE")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("CODE_ARTICLE")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("true")+", SCHEMA_COLUMN="+("CODESITE")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("LIBARTICLE")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("EAN")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("VALO_STOCK")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("QTE_STOCK")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("true")+", SCHEMA_COLUMN="+("DATE_STOCK")+"}, {CASE_SENSITIVE="+("false")+", KEY_ATTRIBUTE="+("false")+", SCHEMA_COLUMN="+("DateLastUpdateWebJob")+"}]");
                        log4jParamters_tUniqRow_1.append(" | ");
                            log4jParamters_tUniqRow_1.append("ONLY_ONCE_EACH_DUPLICATED_KEY" + " = " + "false");
                        log4jParamters_tUniqRow_1.append(" | ");
                            log4jParamters_tUniqRow_1.append("IS_VIRTUAL_COMPONENT" + " = " + "false");
                        log4jParamters_tUniqRow_1.append(" | ");
                            log4jParamters_tUniqRow_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "false");
                        log4jParamters_tUniqRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tUniqRow_1 - "  + (log4jParamters_tUniqRow_1) );
                    } 
                } 
            new BytesLimit65535_tUniqRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
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
					java.util.Date DATE_STOCK;        
	        
		    @Override
			public int hashCode() {
				if (this.hashCodeDirty) {
					final int prime = PRIME;
					int result = DEFAULT_HASHCODE;
			
								result = prime * result + ((this.CODE_INTERNE_ARTICLE == null) ? 0 : this.CODE_INTERNE_ARTICLE.hashCode());
								
								result = prime * result + ((this.CODESITE == null) ? 0 : this.CODESITE.hashCode());
								
								result = prime * result + ((this.DATE_STOCK == null) ? 0 : this.DATE_STOCK.hashCode());
								
		    		this.hashCode = result;
		    		this.hashCodeDirty = false;		
				}
				return this.hashCode;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj) return true;
				if (obj == null) return false;
				if (getClass() != obj.getClass()) return false;
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
								
									if (this.DATE_STOCK == null) {
										if (other.DATE_STOCK != null) 
											return false;
								
									} else if (!this.DATE_STOCK.equals(other.DATE_STOCK))
								 
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
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
		int tos_count_tMap_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_1{
                    public void limitLog4jByte() throws Exception{
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
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + (log4jParamters_tMap_1) );
                    } 
                } 
            new BytesLimit65535_tMap_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_1", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row2_tMap_1 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_OUT_AZURE_tMap_1 = 0;
				
OUT_AZUREStruct OUT_AZURE_tmp = new OUT_AZUREStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";
	
	
			cLabel="ORACLE_ODS";
		
		int tos_count_tDBInput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_3 = new StringBuilder();
                    log4jParamters_tDBInput_3.append("Parameters:");
                            log4jParamters_tDBInput_3.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"SELECT DISTINCT   CODE_ENSEIGNE,    CODE_INTERNE_ARTICLE,    CODE_ARTICLE,    CODE_SITE,    LIB_ARTICLE,    EAN,    VALO_STOCK,    QTE_STOCK,    DATE_STOCK,    LAST_MAJ_DATE FROM  ODS_STOCK_HEBDO\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_ENSEIGNE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_INTERNE_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_SITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIB_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EAN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("VALO_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("QTE_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LAST_MAJ_DATE")+"}]");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_3 - "  + (log4jParamters_tDBInput_3) );
                    } 
                } 
            new BytesLimit65535_tDBInput_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_3", "ORACLE_ODS", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				conn_tDBInput_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
				
				if(conn_tDBInput_3 != null) {
					if(conn_tDBInput_3.getMetaData() != null) {
						
							log.debug("tDBInput_3 - Uses an existing connection with username '" + conn_tDBInput_3.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_3.getMetaData().getURL() + ".");
						
					}
				}
			
                boolean isTimeZoneNull_tDBInput_3 = false;
				boolean isConnectionWrapped_tDBInput_3 = !(conn_tDBInput_3 instanceof oracle.jdbc.OracleConnection) && conn_tDBInput_3.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_3 = null;
                if (isConnectionWrapped_tDBInput_3) {
					unwrappedOraConn_tDBInput_3 = conn_tDBInput_3.unwrap(oracle.jdbc.OracleConnection.class);
                    if (unwrappedOraConn_tDBInput_3 != null) {
                        isTimeZoneNull_tDBInput_3 = (unwrappedOraConn_tDBInput_3.getSessionTimeZone() == null);
                    }
                } else {
                    isTimeZoneNull_tDBInput_3 = (((oracle.jdbc.OracleConnection)conn_tDBInput_3).getSessionTimeZone() == null);
                }

				if(isTimeZoneNull_tDBInput_3) {
					java.sql.Statement stmtGetTZ_tDBInput_3 = conn_tDBInput_3.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_3 = stmtGetTZ_tDBInput_3.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_3 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_3.next()) {
						sessionTimezone_tDBInput_3 = rsGetTZ_tDBInput_3.getString(1);
					}
					if (isConnectionWrapped_tDBInput_3 && unwrappedOraConn_tDBInput_3 != null) {
                        unwrappedOraConn_tDBInput_3.setSessionTimeZone(sessionTimezone_tDBInput_3);
                    } else {
                        ((oracle.jdbc.OracleConnection)conn_tDBInput_3).setSessionTimeZone(sessionTimezone_tDBInput_3);
                    }
				}
			
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT DISTINCT\n  CODE_ENSEIGNE, \n  CODE_INTERNE_ARTICLE, \n  CODE_ARTICLE, \n  CODE_SITE, \n  LIB_ARTICLE, \n  EAN, \n  VAL"
+"O_STOCK, \n  QTE_STOCK, \n  DATE_STOCK, \n  LAST_MAJ_DATE\nFROM  ODS_STOCK_HEBDO";
		    
	    		log.debug("tDBInput_3 - Executing the query: '" + dbquery_tDBInput_3 + "'.");
			

            	globalMap.put("tDBInput_3_QUERY",dbquery_tDBInput_3);
		    java.sql.ResultSet rs_tDBInput_3 = null;

		    try {
		    	rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
		    	int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

		    String tmpContent_tDBInput_3 = null;
		    
		    
		    	log.debug("tDBInput_3 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_3.next()) {
		        nb_line_tDBInput_3++;
		        
							if(colQtyInRs_tDBInput_3 < 1) {
								row2.CODE_ENSEIGNE = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(1) != null) {
						row2.CODE_ENSEIGNE = rs_tDBInput_3.getLong(1);
					} else {
				
						row2.CODE_ENSEIGNE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row2.CODE_INTERNE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(2) != null) {
						row2.CODE_INTERNE_ARTICLE = rs_tDBInput_3.getLong(2);
					} else {
				
						row2.CODE_INTERNE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row2.CODE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(3) != null) {
						row2.CODE_ARTICLE = rs_tDBInput_3.getLong(3);
					} else {
				
						row2.CODE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row2.CODE_SITE = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(4) != null) {
						row2.CODE_SITE = rs_tDBInput_3.getLong(4);
					} else {
				
						row2.CODE_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row2.LIB_ARTICLE = null;
							} else {
	                         		
        	row2.LIB_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 5, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row2.EAN = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(6) != null) {
						row2.EAN = rs_tDBInput_3.getLong(6);
					} else {
				
						row2.EAN = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 7) {
								row2.VALO_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(7) != null) {
						row2.VALO_STOCK = rs_tDBInput_3.getBigDecimal(7);
					} else {
				
						row2.VALO_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 8) {
								row2.QTE_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(8) != null) {
						row2.QTE_STOCK = rs_tDBInput_3.getBigDecimal(8);
					} else {
				
						row2.QTE_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 9) {
								row2.DATE_STOCK = null;
							} else {
										
			row2.DATE_STOCK = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 9);
		                    }
							if(colQtyInRs_tDBInput_3 < 10) {
								row2.LAST_MAJ_DATE = null;
							} else {
										
			row2.LAST_MAJ_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 10);
		                    }
					
						log.debug("tDBInput_3 - Retrieving the record " + nb_line_tDBInput_3 + ".");
					




 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	
			cLabel="ORACLE_ODS";
		

 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	
			cLabel="ORACLE_ODS";
		

 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tDBInput_3","ORACLE_ODS","tOracleInput","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_1 = false;
		boolean mainRowRejected_tMap_1 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

OUT_AZURE = null;


// # Output table : 'OUT_AZURE'
count_OUT_AZURE_tMap_1++;

OUT_AZURE_tmp.CODEENSEIGNE = row2.CODE_ENSEIGNE ;
OUT_AZURE_tmp.CODE_INTERNE_ARTICLE = row2.CODE_INTERNE_ARTICLE ;
OUT_AZURE_tmp.CODE_ARTICLE = row2.CODE_ARTICLE ;
OUT_AZURE_tmp.CODESITE = row2.CODE_SITE ;
OUT_AZURE_tmp.LIBARTICLE = row2.LIB_ARTICLE ;
OUT_AZURE_tmp.EAN = row2.EAN ;
OUT_AZURE_tmp.VALO_STOCK = row2.VALO_STOCK ;
OUT_AZURE_tmp.QTE_STOCK = row2.QTE_STOCK ;
OUT_AZURE_tmp.DATE_STOCK = row2.DATE_STOCK ;
OUT_AZURE_tmp.DateLastUpdateWebJob = row2.LAST_MAJ_DATE ;
OUT_AZURE = OUT_AZURE_tmp;
log.debug("tMap_1 - Outputting the record " + count_OUT_AZURE_tMap_1 + " of the output table 'OUT_AZURE'.");

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

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "OUT_AZURE"
if(OUT_AZURE != null) { 



	
	/**
	 * [tUniqRow_1 main ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"OUT_AZURE","tMap_1","tMap_1","tMap","tUniqRow_1","tUniqRow_1","tUniqRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("OUT_AZURE - " + (OUT_AZURE==null? "": OUT_AZURE.toLogString()));
    			}
    		
row8 = null;			
finder_tUniqRow_1.CODE_INTERNE_ARTICLE = OUT_AZURE.CODE_INTERNE_ARTICLE;
finder_tUniqRow_1.CODESITE = OUT_AZURE.CODESITE;
finder_tUniqRow_1.DATE_STOCK = OUT_AZURE.DATE_STOCK;	
finder_tUniqRow_1.hashCodeDirty = true;
if (!keystUniqRow_1.contains(finder_tUniqRow_1)) {
		KeyStruct_tUniqRow_1 new_tUniqRow_1 = new KeyStruct_tUniqRow_1();

		
new_tUniqRow_1.CODE_INTERNE_ARTICLE = OUT_AZURE.CODE_INTERNE_ARTICLE;
new_tUniqRow_1.CODESITE = OUT_AZURE.CODESITE;
new_tUniqRow_1.DATE_STOCK = OUT_AZURE.DATE_STOCK;
		
		keystUniqRow_1.add(new_tUniqRow_1);if(row8 == null){ 
	
		log.trace("tUniqRow_1 - Writing the unique record " + (nb_uniques_tUniqRow_1+1) + " into row8.");
	
	row8 = new row8Struct();
}row8.CODEENSEIGNE = OUT_AZURE.CODEENSEIGNE;			row8.CODE_INTERNE_ARTICLE = OUT_AZURE.CODE_INTERNE_ARTICLE;			row8.CODE_ARTICLE = OUT_AZURE.CODE_ARTICLE;			row8.CODESITE = OUT_AZURE.CODESITE;			row8.LIBARTICLE = OUT_AZURE.LIBARTICLE;			row8.EAN = OUT_AZURE.EAN;			row8.VALO_STOCK = OUT_AZURE.VALO_STOCK;			row8.QTE_STOCK = OUT_AZURE.QTE_STOCK;			row8.DATE_STOCK = OUT_AZURE.DATE_STOCK;			row8.DateLastUpdateWebJob = OUT_AZURE.DateLastUpdateWebJob;					
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

	

	
	
	currentComponent="tUniqRow_1";
	
	

 



/**
 * [tUniqRow_1 process_data_begin ] stop
 */
// Start of branch "row8"
if(row8 != null) { 



	
	/**
	 * [tDBOutput_5 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row8","tUniqRow_1","tUniqRow_1","tUniqRow","tDBOutput_5","PORTAIL_FOURNISSEUR_AZURE","tMSSqlOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row8 - " + (row8==null? "": row8.toLogString()));
    			}
    		



        whetherReject_tDBOutput_5 = false;
                    if(row8.CODEENSEIGNE == null) {
pstmt_tDBOutput_5.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_5.setLong(1, row8.CODEENSEIGNE);
}

                    if(row8.CODE_INTERNE_ARTICLE == null) {
pstmt_tDBOutput_5.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_5.setLong(2, row8.CODE_INTERNE_ARTICLE);
}

                    if(row8.CODE_ARTICLE == null) {
pstmt_tDBOutput_5.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_5.setLong(3, row8.CODE_ARTICLE);
}

                    if(row8.CODESITE == null) {
pstmt_tDBOutput_5.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_5.setLong(4, row8.CODESITE);
}

                    if(row8.LIBARTICLE == null) {
pstmt_tDBOutput_5.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(5, row8.LIBARTICLE);
}

                    if(row8.EAN == null) {
pstmt_tDBOutput_5.setNull(6, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_5.setLong(6, row8.EAN);
}

                    pstmt_tDBOutput_5.setBigDecimal(7, row8.VALO_STOCK);

                    pstmt_tDBOutput_5.setBigDecimal(8, row8.QTE_STOCK);

                    if(row8.DATE_STOCK != null) {
pstmt_tDBOutput_5.setTimestamp(9, new java.sql.Timestamp(row8.DATE_STOCK.getTime()));
} else {
pstmt_tDBOutput_5.setNull(9, java.sql.Types.TIMESTAMP);
}

                    if(row8.DateLastUpdateWebJob != null) {
pstmt_tDBOutput_5.setTimestamp(10, new java.sql.Timestamp(row8.DateLastUpdateWebJob.getTime()));
} else {
pstmt_tDBOutput_5.setNull(10, java.sql.Types.TIMESTAMP);
}


        		pstmt_tDBOutput_5.addBatch();
        		nb_line_tDBOutput_5++;
        		
    		 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Adding the record ")  + (nb_line_tDBOutput_5)  + (" to the ")  + ("INSERT")  + (" batch.") );
    		  batchSizeCounter_tDBOutput_5++;
    		
            if(!whetherReject_tDBOutput_5) {
            }
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_tDBOutput_5{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_tDBOutput_5) throws Exception {
                try {
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
						for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
							if(countEach_tDBOutput_5 == -2 || countEach_tDBOutput_5 == -3) {
								break;
							}
							counter += countEach_tDBOutput_5;
						}
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_5 = 0;
					for(int countEach_tDBOutput_5: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
					}
				
            	    	
            log.error("tDBOutput_5 - "  + (e.getMessage()) );
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_tDBOutput_5) throws Exception {
                try {
                		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
						for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
							if(countEach_tDBOutput_5 == -2 || countEach_tDBOutput_5 == -3) {
								break;
							}
							counter += countEach_tDBOutput_5;
						}
						
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e.getMessage());
                	
                	
					for(int countEach_tDBOutput_5: e.getUpdateCounts()) {
						counter += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
					}
					
            	    	
            log.error("tDBOutput_5 - "  + (e.getMessage()) );
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_tDBOutput_5 > 0) && (batchSize_tDBOutput_5 <= batchSizeCounter_tDBOutput_5)) {
    		
    		            
            	    		insertedCount_tDBOutput_5 = new LimitBytesHelper_tDBOutput_5().limitBytePart1(insertedCount_tDBOutput_5,pstmt_tDBOutput_5);
            	    		rowsToCommitCount_tDBOutput_5 = insertedCount_tDBOutput_5;
            	    	
    			
			    batchSizeCounter_tDBOutput_5 = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_tDBOutput_5++;

/**
 * [tDBOutput_5 main ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		

 



/**
 * [tDBOutput_5 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		

 



/**
 * [tDBOutput_5 process_data_end ] stop
 */

} // End of branch "row8"




	
	/**
	 * [tUniqRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	

 



/**
 * [tUniqRow_1 process_data_end ] stop
 */

} // End of branch "OUT_AZURE"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	
			cLabel="ORACLE_ODS";
		

 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	
			cLabel="ORACLE_ODS";
		

}
}finally{
	if (rs_tDBInput_3 != null) {
		rs_tDBInput_3.close();
	}
	if (stmt_tDBInput_3 != null) {
		stmt_tDBInput_3.close();
	}
}

globalMap.put("tDBInput_3_NB_LINE",nb_line_tDBInput_3);
	    		log.debug("tDBInput_3 - Retrieved records count: "+nb_line_tDBInput_3 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_3 - "  + ("Done.") );

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'OUT_AZURE': " + count_OUT_AZURE_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tDBInput_3","ORACLE_ODS","tOracleInput","tMap_1","tMap_1","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Done.") );

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tUniqRow_1 end ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	

globalMap.put("tUniqRow_1_NB_UNIQUES",nb_uniques_tUniqRow_1);
globalMap.put("tUniqRow_1_NB_DUPLICATES",nb_duplicates_tUniqRow_1);
	log.info("tUniqRow_1 - Unique records count: " + (nb_uniques_tUniqRow_1)+" .");
	log.info("tUniqRow_1 - Duplicate records count: " + (nb_duplicates_tUniqRow_1)+" .");

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"OUT_AZURE",2,0,
			 			"tMap_1","tMap_1","tMap","tUniqRow_1","tUniqRow_1","tUniqRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tUniqRow_1 - "  + ("Done.") );

ok_Hash.put("tUniqRow_1", true);
end_Hash.put("tUniqRow_1", System.currentTimeMillis());




/**
 * [tUniqRow_1 end ] stop
 */

	
	/**
	 * [tDBOutput_5 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		



                try {
						int countSum_tDBOutput_5 = 0;
						if (pstmt_tDBOutput_5 != null && batchSizeCounter_tDBOutput_5 > 0) {
							
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
							for(int countEach_tDBOutput_5: pstmt_tDBOutput_5.executeBatch()) {
								if(countEach_tDBOutput_5 == -2 || countEach_tDBOutput_5 == -3) {
									break;
								}
								countSum_tDBOutput_5 += countEach_tDBOutput_5;
							}
							rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
							
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
						}
            	    	
            	    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
            	    	
                }catch (java.sql.BatchUpdateException e){
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e.getMessage());
                	
                	int countSum_tDBOutput_5 = 0;
					for(int countEach_tDBOutput_5: e.getUpdateCounts()) {
						countSum_tDBOutput_5 += (countEach_tDBOutput_5 < 0 ? 0 : countEach_tDBOutput_5);
					}
					rowsToCommitCount_tDBOutput_5 += countSum_tDBOutput_5;
					
            	    		insertedCount_tDBOutput_5 += countSum_tDBOutput_5;
            	    	
            log.error("tDBOutput_5 - "  + (e.getMessage()) );
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_tDBOutput_5 != null) {
			
				pstmt_tDBOutput_5.close();
				resourceMap.remove("pstmt_tDBOutput_5");
			
        }
    resourceMap.put("statementClosed_tDBOutput_5", true);

	nb_line_deleted_tDBOutput_5=nb_line_deleted_tDBOutput_5+ deletedCount_tDBOutput_5;
	nb_line_update_tDBOutput_5=nb_line_update_tDBOutput_5 + updatedCount_tDBOutput_5;
	nb_line_inserted_tDBOutput_5=nb_line_inserted_tDBOutput_5 + insertedCount_tDBOutput_5;
	nb_line_rejected_tDBOutput_5=nb_line_rejected_tDBOutput_5 + rejectedCount_tDBOutput_5;
	
        globalMap.put("tDBOutput_5_NB_LINE",nb_line_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_UPDATED",nb_line_update_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_DELETED",nb_line_deleted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_5);
    

	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row8",2,0,
			 			"tUniqRow_1","tUniqRow_1","tUniqRow","tDBOutput_5","PORTAIL_FOURNISSEUR_AZURE","tMSSqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Done.") );

ok_Hash.put("tDBOutput_5", true);
end_Hash.put("tDBOutput_5", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tDBCommit_2Process(globalMap);



/**
 * [tDBOutput_5 end ] stop
 */









				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_3:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tDBRow_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	
			cLabel="ORACLE_ODS";
		

 



/**
 * [tDBInput_3 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tUniqRow_1 finally ] start
	 */

	

	
	
	currentComponent="tUniqRow_1";
	
	

 



/**
 * [tUniqRow_1 finally ] stop
 */

	
	/**
	 * [tDBOutput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";
	
	
			cLabel="PORTAIL_FOURNISSEUR_AZURE";
		



    if (resourceMap.get("statementClosed_tDBOutput_5") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_5 = null;
                if ((pstmtToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_5")) != null) {
                    pstmtToClose_tDBOutput_5.close();
                }
    }
 



/**
 * [tDBOutput_5 finally ] stop
 */









				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBCommit_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_2", false);
		start_Hash.put("tDBCommit_2", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_2";
	
	
		int tos_count_tDBCommit_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBCommit_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBCommit_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBCommit_2 = new StringBuilder();
                    log4jParamters_tDBCommit_2.append("Parameters:");
                            log4jParamters_tDBCommit_2.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBCommit_2.append(" | ");
                            log4jParamters_tDBCommit_2.append("CLOSE" + " = " + "false");
                        log4jParamters_tDBCommit_2.append(" | ");
                            log4jParamters_tDBCommit_2.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlCommit");
                        log4jParamters_tDBCommit_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBCommit_2 - "  + (log4jParamters_tDBCommit_2) );
                    } 
                } 
            new BytesLimit65535_tDBCommit_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBCommit_2", "tDBCommit_2", "tMSSqlCommit");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBCommit_2 begin ] stop
 */
	
	/**
	 * [tDBCommit_2 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";
	
	

	java.sql.Connection conn_tDBCommit_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_2 != null && !conn_tDBCommit_2.isClosed())
	{
	
			
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

	

	
	
	currentComponent="tDBCommit_2";
	
	

 



/**
 * [tDBCommit_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";
	
	

 



/**
 * [tDBCommit_2 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_2 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBCommit_2 - "  + ("Done.") );

ok_Hash.put("tDBCommit_2", true);
end_Hash.put("tDBCommit_2", System.currentTimeMillis());




/**
 * [tDBCommit_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_2 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";
	
	

 



/**
 * [tDBCommit_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_2", false);
		start_Hash.put("tDBRow_2", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_2";
	
	
		int tos_count_tDBRow_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBRow_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBRow_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBRow_2 = new StringBuilder();
                    log4jParamters_tDBRow_2.append("Parameters:");
                            log4jParamters_tDBRow_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("IDENTITY_INSERT" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("QUERY" + " = " + "\"MERGE StockParArticle AS T  USING StockParArticleTT As S  ON S.CODESITE = T.CODESITE and S.CODE_INTERNE_ARTICLE = T.CODE_INTERNE_ARTICLE and S.DATE_STOCK = T.DATE_STOCK  WHEN NOT MATCHED THEN      INSERT (CODESITE,CODE_INTERNE_ARTICLE, DATE_STOCK,CODEENSEIGNE,CODE_ARTICLE,LIBARTICLE,EAN,VALO_STOCK,QTE_STOCK,DateLastUpdateWebJob)       VALUES (S.CODESITE,S.CODE_INTERNE_ARTICLE, S.DATE_STOCK,S.CODEENSEIGNE,S.CODE_ARTICLE,S.LIBARTICLE,S.EAN,S.VALO_STOCK,S.QTE_STOCK,SYSDATETIME())  WHEN MATCHED THEN UPDATE SET      T.VALO_STOCK = S.VALO_STOCK, T.CODEENSEIGNE = S.CODEENSEIGNE, T.LIBARTICLE= S.LIBARTICLE,      T.QTE_STOCK	= S.QTE_STOCK, T.CODE_ARTICLE= S.CODE_ARTICLE, T.EAN = S.EAN,   	DateLastUpdateWebJob= SYSDATETIME();  \"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlRow");
                        log4jParamters_tDBRow_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBRow_2 - "  + (log4jParamters_tDBRow_2) );
                    } 
                } 
            new BytesLimit65535_tDBRow_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_2", "tDBRow_2", "tMSSqlRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_2 = null;
	String query_tDBRow_2 = "";
	boolean whetherReject_tDBRow_2 = false;
				conn_tDBRow_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
			
				if(conn_tDBRow_2 != null) {
					if(conn_tDBRow_2.getMetaData() != null) {
						
							log.debug("tDBRow_2 - Uses an existing connection with username '" + conn_tDBRow_2.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBRow_2.getMetaData().getURL() + ".");
						
					}
				}
			
        resourceMap.put("conn_tDBRow_2", conn_tDBRow_2);
        java.sql.Statement stmt_tDBRow_2 = conn_tDBRow_2.createStatement();
        resourceMap.put("stmt_tDBRow_2", stmt_tDBRow_2);

 



/**
 * [tDBRow_2 begin ] stop
 */
	
	/**
	 * [tDBRow_2 main ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	

query_tDBRow_2 = "MERGE StockParArticle AS T\nUSING StockParArticleTT As S\nON S.CODESITE = T.CODESITE and S.CODE_INTERNE_ARTICLE = T.COD"
+"E_INTERNE_ARTICLE and S.DATE_STOCK = T.DATE_STOCK\nWHEN NOT MATCHED THEN\n    INSERT (CODESITE,CODE_INTERNE_ARTICLE, DAT"
+"E_STOCK,CODEENSEIGNE,CODE_ARTICLE,LIBARTICLE,EAN,VALO_STOCK,QTE_STOCK,DateLastUpdateWebJob) \n    VALUES (S.CODESITE,S.C"
+"ODE_INTERNE_ARTICLE, S.DATE_STOCK,S.CODEENSEIGNE,S.CODE_ARTICLE,S.LIBARTICLE,S.EAN,S.VALO_STOCK,S.QTE_STOCK,SYSDATETIME("
+"))\nWHEN MATCHED THEN UPDATE SET\n    T.VALO_STOCK = S.VALO_STOCK, T.CODEENSEIGNE = S.CODEENSEIGNE, T.LIBARTICLE= S.LIBA"
+"RTICLE,\n    T.QTE_STOCK	= S.QTE_STOCK, T.CODE_ARTICLE= S.CODE_ARTICLE, T.EAN = S.EAN, \n	DateLastUpdateWebJob= SYSDATET"
+"IME();\n";
whetherReject_tDBRow_2 = false;
	    		log.debug("tDBRow_2 - Executing the query: '" + query_tDBRow_2 + "'.");
			
globalMap.put("tDBRow_2_QUERY",query_tDBRow_2);
try {
		stmt_tDBRow_2.execute(query_tDBRow_2);
		
	    		log.debug("tDBRow_2 - Execute the query: '" + query_tDBRow_2 + "' has finished.");
			
	} catch (java.lang.Exception e) {
		whetherReject_tDBRow_2 = true;
		
				log.error("tDBRow_2 - " + e.getMessage());
			
				System.err.print(e.getMessage());
				globalMap.put("tDBRow_2_ERROR_MESSAGE", e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_2) {
		
	}
	

 


	tos_count_tDBRow_2++;

/**
 * [tDBRow_2 main ] stop
 */
	
	/**
	 * [tDBRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	

 



/**
 * [tDBRow_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	

 



/**
 * [tDBRow_2 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_2 end ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	

	
        stmt_tDBRow_2.close();
        resourceMap.remove("stmt_tDBRow_2");
    resourceMap.put("statementClosed_tDBRow_2", true);
    resourceMap.put("finish_tDBRow_2", true);
 
                if(log.isDebugEnabled())
            log.debug("tDBRow_2 - "  + ("Done.") );

ok_Hash.put("tDBRow_2", true);
end_Hash.put("tDBRow_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tDBRow_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_2 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	

    if (resourceMap.get("statementClosed_tDBRow_2") == null) {
            java.sql.Statement stmtToClose_tDBRow_2 = null;
            if ((stmtToClose_tDBRow_2 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_2")) != null) {
                stmtToClose_tDBRow_2.close();
            }
    }
 



/**
 * [tDBRow_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_2_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";
	
	
		int tos_count_tDBCommit_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBCommit_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBCommit_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBCommit_1 = new StringBuilder();
                    log4jParamters_tDBCommit_1.append("Parameters:");
                            log4jParamters_tDBCommit_1.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBCommit_1.append(" | ");
                            log4jParamters_tDBCommit_1.append("CLOSE" + " = " + "true");
                        log4jParamters_tDBCommit_1.append(" | ");
                            log4jParamters_tDBCommit_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlCommit");
                        log4jParamters_tDBCommit_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBCommit_1 - "  + (log4jParamters_tDBCommit_1) );
                    } 
                } 
            new BytesLimit65535_tDBCommit_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBCommit_1", "tDBCommit_1", "tMSSqlCommit");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
		try{
	
			
	    		log.debug("tDBCommit_1 - Connection 'tDBConnection_1' starting to commit.");
			
			conn_tDBCommit_1.commit();
			
	    		log.debug("tDBCommit_1 - Connection 'tDBConnection_1' commit has succeeded.");
			
	
		}finally{
			
	    		log.debug("tDBCommit_1 - Closing the connection 'tDBConnection_1' to the database.");
			
			conn_tDBCommit_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBCommit_1 - Connection 'tDBConnection_1' to the database closed.");
			
	    }
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBCommit_1 - "  + ("Done.") );

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tWarn_1Process(globalMap);
				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk12", 0, "ok");
				}
				tSetGlobalVar_2Process(globalMap);



/**
 * [tDBCommit_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";
	
	

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tWarn_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_1", false);
		start_Hash.put("tWarn_1", System.currentTimeMillis());
		
	
	currentComponent="tWarn_1";
	
	
		int tos_count_tWarn_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tWarn_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tWarn_1 = new StringBuilder();
                    log4jParamters_tWarn_1.append("Parameters:");
                            log4jParamters_tWarn_1.append("MESSAGE" + " = " + "\"Job OK\"");
                        log4jParamters_tWarn_1.append(" | ");
                            log4jParamters_tWarn_1.append("CODE" + " = " + "42");
                        log4jParamters_tWarn_1.append(" | ");
                            log4jParamters_tWarn_1.append("PRIORITY" + " = " + "3");
                        log4jParamters_tWarn_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + (log4jParamters_tWarn_1) );
                    } 
                } 
            new BytesLimit65535_tWarn_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tWarn_1", "tWarn_1", "tWarn");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tWarn_1 begin ] stop
 */
	
	/**
	 * [tWarn_1 main ] start
	 */

	

	
	
	currentComponent="tWarn_1";
	
	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_1", "", Thread.currentThread().getId() + "", "INFO","","Job OK","", "");
                if(log.isInfoEnabled())
            log.info("tWarn_1 - "  + ("Message: ")  + ("Job OK")  + (". Code: ")  + (42) );
	globalMap.put("tWarn_1_WARN_MESSAGES", "Job OK"); 
	globalMap.put("tWarn_1_WARN_PRIORITY", 3);
	globalMap.put("tWarn_1_WARN_CODE", 42);
	
} catch (Exception e_tWarn_1) {
globalMap.put("tWarn_1_ERROR_MESSAGE",e_tWarn_1.getMessage());
	logIgnoredError(String.format("tWarn_1 - tWarn failed to log message due to internal error: %s", e_tWarn_1), e_tWarn_1);
}


 


	tos_count_tWarn_1++;

/**
 * [tWarn_1 main ] stop
 */
	
	/**
	 * [tWarn_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_1";
	
	

 



/**
 * [tWarn_1 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_1";
	
	

 



/**
 * [tWarn_1 process_data_end ] stop
 */
	
	/**
	 * [tWarn_1 end ] start
	 */

	

	
	
	currentComponent="tWarn_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + ("Done.") );

ok_Hash.put("tWarn_1", true);
end_Hash.put("tWarn_1", System.currentTimeMillis());




/**
 * [tWarn_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_1 finally ] start
	 */

	

	
	
	currentComponent="tWarn_1";
	
	

 



/**
 * [tWarn_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";
	
	
		int tos_count_tDie_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_1 = new StringBuilder();
                    log4jParamters_tDie_1.append("Parameters:");
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Job ERROR\"");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("CODE" + " = " + "4");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_tDie_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + (log4jParamters_tDie_1) );
                    } 
                } 
            new BytesLimit65535_tDie_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_1", "tDie_1", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

	try {
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Job ERROR");
	
		log.error("tDie_1 - The die message: "+"Job ERROR");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Job ERROR");
	globalMap.put("tDie_1_DIE_MESSAGES", "Job ERROR");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
    	errorCode = new Integer(4);
        ((java.util.Map)threadLocal.get()).put("errorCode", new Integer(4));
        ((java.util.Map)threadLocal.get()).put("status", "failure");
        globalMap.put("tDie_1_DIE_CODE", errorCode);

    
	if(true){	
		TDieException e_tDie_1 = new TDieException();

		
			if(enableLogStash) {
				talendJobLog.addJobExceptionMessage(currentComponent, cLabel, "Job ERROR", e_tDie_1);
				talendJobLogProcess(globalMap);
			}
		

		throw e_tDie_1;
	}

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Done.") );

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tSetGlobalVar_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_2", false);
		start_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_2";
	
	
		int tos_count_tSetGlobalVar_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSetGlobalVar_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSetGlobalVar_2 = new StringBuilder();
                    log4jParamters_tSetGlobalVar_2.append("Parameters:");
                            log4jParamters_tSetGlobalVar_2.append("VARIABLES" + " = " + "[{VALUE="+("TalendDate.formatDate(\"yyyy-MM-dd_HH-mm-ss\",TalendDate.getCurrentDate())")+", KEY="+("\"CurrentDate2\"")+"}]");
                        log4jParamters_tSetGlobalVar_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_2 - "  + (log4jParamters_tSetGlobalVar_2) );
                    } 
                } 
            new BytesLimit65535_tSetGlobalVar_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSetGlobalVar_2", "tSetGlobalVar_2", "tSetGlobalVar");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSetGlobalVar_2 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";
	
	

globalMap.put("CurrentDate2", TalendDate.formatDate("yyyy-MM-dd_HH-mm-ss",TalendDate.getCurrentDate()));

 


	tos_count_tSetGlobalVar_2++;

/**
 * [tSetGlobalVar_2 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";
	
	

 



/**
 * [tSetGlobalVar_2 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";
	
	

 



/**
 * [tSetGlobalVar_2 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_2 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tSetGlobalVar_2 - "  + ("Done.") );

ok_Hash.put("tSetGlobalVar_2", true);
end_Hash.put("tSetGlobalVar_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk13", 0, "ok");
				}
				tHashInput_2Process(globalMap);



/**
 * [tSetGlobalVar_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSetGlobalVar_2 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_2";
	
	

 



/**
 * [tSetGlobalVar_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_2_SUBPROCESS_STATE", 1);
	}
	


public static class copyOfOUTFRNStruct implements routines.system.IPersistableRow<copyOfOUTFRNStruct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Integer FOUCFIN_FOURNISSEUR;

				public Integer getFOUCFIN_FOURNISSEUR () {
					return this.FOUCFIN_FOURNISSEUR;
				}

				public Boolean FOUCFIN_FOURNISSEURIsNullable(){
				    return true;
				}
				public Boolean FOUCFIN_FOURNISSEURIsKey(){
				    return false;
				}
				public Integer FOUCFIN_FOURNISSEURLength(){
				    return null;
				}
				public Integer FOUCFIN_FOURNISSEURPrecision(){
				    return null;
				}
				public String FOUCFIN_FOURNISSEURDefault(){
				
					return null;
				
				}
				public String FOUCFIN_FOURNISSEURComment(){
				
				    return "";
				
				}
				public String FOUCFIN_FOURNISSEURPattern(){
				
					return "";
				
				}
				public String FOUCFIN_FOURNISSEUROriginalDbColumnName(){
				
					return "FOUCFIN_FOURNISSEUR";
				
				}

				
			    public String LIBFRS_FOURNISSEUR;

				public String getLIBFRS_FOURNISSEUR () {
					return this.LIBFRS_FOURNISSEUR;
				}

				public Boolean LIBFRS_FOURNISSEURIsNullable(){
				    return true;
				}
				public Boolean LIBFRS_FOURNISSEURIsKey(){
				    return false;
				}
				public Integer LIBFRS_FOURNISSEURLength(){
				    return null;
				}
				public Integer LIBFRS_FOURNISSEURPrecision(){
				    return null;
				}
				public String LIBFRS_FOURNISSEURDefault(){
				
					return null;
				
				}
				public String LIBFRS_FOURNISSEURComment(){
				
				    return "";
				
				}
				public String LIBFRS_FOURNISSEURPattern(){
				
					return "";
				
				}
				public String LIBFRS_FOURNISSEUROriginalDbColumnName(){
				
					return "LIBFRS_FOURNISSEUR";
				
				}

				
			    public String FOUCNUF_FOURNISSEUR;

				public String getFOUCNUF_FOURNISSEUR () {
					return this.FOUCNUF_FOURNISSEUR;
				}

				public Boolean FOUCNUF_FOURNISSEURIsNullable(){
				    return true;
				}
				public Boolean FOUCNUF_FOURNISSEURIsKey(){
				    return false;
				}
				public Integer FOUCNUF_FOURNISSEURLength(){
				    return null;
				}
				public Integer FOUCNUF_FOURNISSEURPrecision(){
				    return null;
				}
				public String FOUCNUF_FOURNISSEURDefault(){
				
					return null;
				
				}
				public String FOUCNUF_FOURNISSEURComment(){
				
				    return "";
				
				}
				public String FOUCNUF_FOURNISSEURPattern(){
				
					return "";
				
				}
				public String FOUCNUF_FOURNISSEUROriginalDbColumnName(){
				
					return "FOUCNUF_FOURNISSEUR";
				
				}

				
			    public Integer COUNTFRN;

				public Integer getCOUNTFRN () {
					return this.COUNTFRN;
				}

				public Boolean COUNTFRNIsNullable(){
				    return true;
				}
				public Boolean COUNTFRNIsKey(){
				    return false;
				}
				public Integer COUNTFRNLength(){
				    return null;
				}
				public Integer COUNTFRNPrecision(){
				    return null;
				}
				public String COUNTFRNDefault(){
				
					return null;
				
				}
				public String COUNTFRNComment(){
				
				    return "";
				
				}
				public String COUNTFRNPattern(){
				
					return "";
				
				}
				public String COUNTFRNOriginalDbColumnName(){
				
					return "COUNTFRN";
				
				}

				
			    public String Date_Debut;

				public String getDate_Debut () {
					return this.Date_Debut;
				}

				public Boolean Date_DebutIsNullable(){
				    return true;
				}
				public Boolean Date_DebutIsKey(){
				    return false;
				}
				public Integer Date_DebutLength(){
				    return null;
				}
				public Integer Date_DebutPrecision(){
				    return null;
				}
				public String Date_DebutDefault(){
				
					return null;
				
				}
				public String Date_DebutComment(){
				
				    return "";
				
				}
				public String Date_DebutPattern(){
				
					return "YYYY-mm-dd HH:mm:ss";
				
				}
				public String Date_DebutOriginalDbColumnName(){
				
					return "Date_Debut";
				
				}

				
			    public String Date_Fin;

				public String getDate_Fin () {
					return this.Date_Fin;
				}

				public Boolean Date_FinIsNullable(){
				    return true;
				}
				public Boolean Date_FinIsKey(){
				    return false;
				}
				public Integer Date_FinLength(){
				    return null;
				}
				public Integer Date_FinPrecision(){
				    return null;
				}
				public String Date_FinDefault(){
				
					return null;
				
				}
				public String Date_FinComment(){
				
				    return "";
				
				}
				public String Date_FinPattern(){
				
					return "YYYY-mm-dd HH:mm:ss";
				
				}
				public String Date_FinOriginalDbColumnName(){
				
					return "Date_Fin";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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
				
						writeInteger(this.FOUCFIN_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.LIBFRS_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.FOUCNUF_FOURNISSEUR,dos);
					
					// Integer
				
						writeInteger(this.COUNTFRN,dos);
					
					// String
				
						writeString(this.Date_Debut,dos);
					
					// String
				
						writeString(this.Date_Fin,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCFIN_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.LIBFRS_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.FOUCNUF_FOURNISSEUR,dos);
					
					// Integer
				
						writeInteger(this.COUNTFRN,dos);
					
					// String
				
						writeString(this.Date_Debut,dos);
					
					// String
				
						writeString(this.Date_Fin,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCFIN_FOURNISSEUR="+String.valueOf(FOUCFIN_FOURNISSEUR));
		sb.append(",LIBFRS_FOURNISSEUR="+LIBFRS_FOURNISSEUR);
		sb.append(",FOUCNUF_FOURNISSEUR="+FOUCNUF_FOURNISSEUR);
		sb.append(",COUNTFRN="+String.valueOf(COUNTFRN));
		sb.append(",Date_Debut="+Date_Debut);
		sb.append(",Date_Fin="+Date_Fin);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCFIN_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCFIN_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(LIBFRS_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBFRS_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCNUF_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCNUF_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(COUNTFRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COUNTFRN);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Debut == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Debut);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Fin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Fin);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(copyOfOUTFRNStruct other) {

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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Integer FOUCFIN;

				public Integer getFOUCFIN () {
					return this.FOUCFIN;
				}

				public Boolean FOUCFINIsNullable(){
				    return true;
				}
				public Boolean FOUCFINIsKey(){
				    return false;
				}
				public Integer FOUCFINLength(){
				    return null;
				}
				public Integer FOUCFINPrecision(){
				    return null;
				}
				public String FOUCFINDefault(){
				
					return null;
				
				}
				public String FOUCFINComment(){
				
				    return "";
				
				}
				public String FOUCFINPattern(){
				
					return "";
				
				}
				public String FOUCFINOriginalDbColumnName(){
				
					return "FOUCFIN";
				
				}

				
			    public String LIBFRS;

				public String getLIBFRS () {
					return this.LIBFRS;
				}

				public Boolean LIBFRSIsNullable(){
				    return true;
				}
				public Boolean LIBFRSIsKey(){
				    return false;
				}
				public Integer LIBFRSLength(){
				    return null;
				}
				public Integer LIBFRSPrecision(){
				    return null;
				}
				public String LIBFRSDefault(){
				
					return null;
				
				}
				public String LIBFRSComment(){
				
				    return "";
				
				}
				public String LIBFRSPattern(){
				
					return "";
				
				}
				public String LIBFRSOriginalDbColumnName(){
				
					return "LIBFRS";
				
				}

				
			    public String FOUCNUF;

				public String getFOUCNUF () {
					return this.FOUCNUF;
				}

				public Boolean FOUCNUFIsNullable(){
				    return true;
				}
				public Boolean FOUCNUFIsKey(){
				    return false;
				}
				public Integer FOUCNUFLength(){
				    return null;
				}
				public Integer FOUCNUFPrecision(){
				    return null;
				}
				public String FOUCNUFDefault(){
				
					return null;
				
				}
				public String FOUCNUFComment(){
				
				    return "";
				
				}
				public String FOUCNUFPattern(){
				
					return "";
				
				}
				public String FOUCNUFOriginalDbColumnName(){
				
					return "FOUCNUF";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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
				
						writeInteger(this.FOUCFIN,dos);
					
					// String
				
						writeString(this.LIBFRS,dos);
					
					// String
				
						writeString(this.FOUCNUF,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCFIN,dos);
					
					// String
				
						writeString(this.LIBFRS,dos);
					
					// String
				
						writeString(this.FOUCNUF,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCFIN="+String.valueOf(FOUCFIN));
		sb.append(",LIBFRS="+LIBFRS);
		sb.append(",FOUCNUF="+FOUCNUF);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCFIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCFIN);
            			}
            		
        			sb.append("|");
        		
        				if(LIBFRS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBFRS);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCNUF);
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

public static class after_tHashInput_2Struct implements routines.system.IPersistableRow<after_tHashInput_2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Integer FOUCFIN;

				public Integer getFOUCFIN () {
					return this.FOUCFIN;
				}

				public Boolean FOUCFINIsNullable(){
				    return true;
				}
				public Boolean FOUCFINIsKey(){
				    return false;
				}
				public Integer FOUCFINLength(){
				    return null;
				}
				public Integer FOUCFINPrecision(){
				    return null;
				}
				public String FOUCFINDefault(){
				
					return null;
				
				}
				public String FOUCFINComment(){
				
				    return "";
				
				}
				public String FOUCFINPattern(){
				
					return "";
				
				}
				public String FOUCFINOriginalDbColumnName(){
				
					return "FOUCFIN";
				
				}

				
			    public String LIBFRS;

				public String getLIBFRS () {
					return this.LIBFRS;
				}

				public Boolean LIBFRSIsNullable(){
				    return true;
				}
				public Boolean LIBFRSIsKey(){
				    return false;
				}
				public Integer LIBFRSLength(){
				    return null;
				}
				public Integer LIBFRSPrecision(){
				    return null;
				}
				public String LIBFRSDefault(){
				
					return null;
				
				}
				public String LIBFRSComment(){
				
				    return "";
				
				}
				public String LIBFRSPattern(){
				
					return "";
				
				}
				public String LIBFRSOriginalDbColumnName(){
				
					return "LIBFRS";
				
				}

				
			    public String FOUCNUF;

				public String getFOUCNUF () {
					return this.FOUCNUF;
				}

				public Boolean FOUCNUFIsNullable(){
				    return true;
				}
				public Boolean FOUCNUFIsKey(){
				    return false;
				}
				public Integer FOUCNUFLength(){
				    return null;
				}
				public Integer FOUCNUFPrecision(){
				    return null;
				}
				public String FOUCNUFDefault(){
				
					return null;
				
				}
				public String FOUCNUFComment(){
				
				    return "";
				
				}
				public String FOUCNUFPattern(){
				
					return "";
				
				}
				public String FOUCNUFOriginalDbColumnName(){
				
					return "FOUCNUF";
				
				}

				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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
				
						writeInteger(this.FOUCFIN,dos);
					
					// String
				
						writeString(this.LIBFRS,dos);
					
					// String
				
						writeString(this.FOUCNUF,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCFIN,dos);
					
					// String
				
						writeString(this.LIBFRS,dos);
					
					// String
				
						writeString(this.FOUCNUF,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCFIN="+String.valueOf(FOUCFIN));
		sb.append(",LIBFRS="+LIBFRS);
		sb.append(",FOUCNUF="+FOUCNUF);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCFIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCFIN);
            			}
            		
        			sb.append("|");
        		
        				if(LIBFRS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBFRS);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCNUF);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tHashInput_2Struct other) {

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
public void tHashInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tHashInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tHashInput_3Process(globalMap);

		row9Struct row9 = new row9Struct();
copyOfOUTFRNStruct copyOfOUTFRN = new copyOfOUTFRNStruct();





	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"copyOfOUTFRN");
			
		int tos_count_tFileOutputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_1.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_1.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "context.PATH_STOCK_HEBDO+\"/FRNS_STOCK_HEBDO_\"+((String)globalMap.get(\"CurrentDate\"))+\".csv\"");
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
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + (log4jParamters_tFileOutputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_1", "tFileOutputDelimited_1", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_1 = "";
    fileName_tFileOutputDelimited_1 = (new java.io.File(context.PATH_STOCK_HEBDO+"/FRNS_STOCK_HEBDO_"+((String)globalMap.get("CurrentDate"))+".csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_1 = null;
    String extension_tFileOutputDelimited_1 = null;
    String directory_tFileOutputDelimited_1 = null;
    if((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        }
        directory_tFileOutputDelimited_1 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_1 = true;
    java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
    globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */";"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
                        if(!dir_tFileOutputDelimited_1.exists()) {
                                log.info("tFileOutputDelimited_1 - Creating directory '" + dir_tFileOutputDelimited_1.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_1.mkdirs();
                                log.info("tFileOutputDelimited_1 - The directory '"+ dir_tFileOutputDelimited_1.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_1 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
                        if(fileToDelete_tFileOutputDelimited_1.exists()) {
                            fileToDelete_tFileOutputDelimited_1.delete();
                        }
                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, false),"UTF-8"));
                        synchronized (multiThreadLockWrite) {
                                    if(filetFileOutputDelimited_1.length()==0){
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
		
	
	currentComponent="tMap_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
		int tos_count_tMap_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_3 = new StringBuilder();
                    log4jParamters_tMap_3.append("Parameters:");
                            log4jParamters_tMap_3.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + (log4jParamters_tMap_3) );
                    } 
                } 
            new BytesLimit65535_tMap_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_3", "tMap_3", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row9_tMap_3 = 0;
		
		int count_row10_tMap_3 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct> tHash_Lookup_row10 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct>) 
					globalMap.get( "tHash_Lookup_row10" ))
					;					
					
	

row10Struct row10HashKey = new row10Struct();
row10Struct row10Default = new row10Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_copyOfOUTFRN_tMap_3 = 0;
				
copyOfOUTFRNStruct copyOfOUTFRN_tmp = new copyOfOUTFRNStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tHashInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashInput_2", false);
		start_Hash.put("tHashInput_2", System.currentTimeMillis());
		
	
	currentComponent="tHashInput_2";
	
	
			cLabel="FOURNISSEEUR";
		
		int tos_count_tHashInput_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tHashInput_2", "FOURNISSEEUR", "tHashInput");
				talendJobLogProcess(globalMap);
			}
			


int nb_line_tHashInput_2 = 0;
	
org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_2=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();
org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct> tHashFile_tHashInput_2 = mf_tHashInput_2.getAdvancedMemoryHashFile("tHashFile_JOB_STOCK_HEBDO_" + pid +"_tHashOutput_1");
if(tHashFile_tHashInput_2==null) {
	throw new RuntimeException("The hash is not initialized : The hash must exist before you read from it");
}
java.util.Iterator<row3Struct> iterator_tHashInput_2 = tHashFile_tHashInput_2.iterator();
while (iterator_tHashInput_2.hasNext()) {
    row3Struct next_tHashInput_2 = iterator_tHashInput_2.next();

	row9.FOUCFIN = next_tHashInput_2.FOUCFIN;
	row9.LIBFRS = next_tHashInput_2.LIBFRS;
	row9.FOUCNUF = next_tHashInput_2.FOUCNUF;

 



/**
 * [tHashInput_2 begin ] stop
 */
	
	/**
	 * [tHashInput_2 main ] start
	 */

	

	
	
	currentComponent="tHashInput_2";
	
	
			cLabel="FOURNISSEEUR";
		

 


	tos_count_tHashInput_2++;

/**
 * [tHashInput_2 main ] stop
 */
	
	/**
	 * [tHashInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashInput_2";
	
	
			cLabel="FOURNISSEEUR";
		

 



/**
 * [tHashInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row9","tHashInput_2","FOURNISSEEUR","tHashInput","tMap_3","tMap_3","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		
						row10Struct row10 = null;
					
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_3 = false;
		boolean mainRowRejected_tMap_3 = false;
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row10" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow10 = false;
       		  	    	
       		  	    	
 							row10Struct row10ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row10HashKey.FOUCFIN = row9.FOUCFIN ;
                        		    		

								
		                        	row10HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row10.lookup( row10HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row10 != null && tHash_Lookup_row10.getCount(row10HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row10' and it contains more one result from keys :  row10.FOUCFIN = '" + row10HashKey.FOUCFIN + "'");
								} // G 071
							

							
                    		  	 
							   
                    		  	 
	       		  	    	row10Struct fromLookup_row10 = null;
							row10 = row10Default;
										 
							
								 
							
							
								if (tHash_Lookup_row10 !=null && tHash_Lookup_row10.hasNext()) { // G 099
								
							
								
								fromLookup_row10 = tHash_Lookup_row10.next();

							
							
								} // G 099
							
							

							if(fromLookup_row10 != null) {
								row10 = fromLookup_row10;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

copyOfOUTFRN = null;


// # Output table : 'copyOfOUTFRN'
count_copyOfOUTFRN_tMap_3++;

copyOfOUTFRN_tmp.FOUCFIN_FOURNISSEUR = row9.FOUCFIN ;
copyOfOUTFRN_tmp.LIBFRS_FOURNISSEUR = row9.LIBFRS ;
copyOfOUTFRN_tmp.FOUCNUF_FOURNISSEUR = row9.FOUCNUF ;
copyOfOUTFRN_tmp.COUNTFRN = row10.FOUCFIN == null ? 0 : row10.COUNTFRN ;
copyOfOUTFRN_tmp.Date_Debut = ((String)globalMap.get("CurrentDate"));
copyOfOUTFRN_tmp.Date_Fin = ((String)globalMap.get("CurrentDate2"));
copyOfOUTFRN = copyOfOUTFRN_tmp;
log.debug("tMap_3 - Outputting the record " + count_copyOfOUTFRN_tMap_3 + " of the output table 'copyOfOUTFRN'.");

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

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "copyOfOUTFRN"
if(copyOfOUTFRN != null) { 



	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"copyOfOUTFRN","tMap_3","tMap_3","tMap","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("copyOfOUTFRN - " + (copyOfOUTFRN==null? "": copyOfOUTFRN.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(copyOfOUTFRN.FOUCFIN_FOURNISSEUR != null) {
                        sb_tFileOutputDelimited_1.append(
                            copyOfOUTFRN.FOUCFIN_FOURNISSEUR
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(copyOfOUTFRN.LIBFRS_FOURNISSEUR != null) {
                        sb_tFileOutputDelimited_1.append(
                            copyOfOUTFRN.LIBFRS_FOURNISSEUR
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(copyOfOUTFRN.FOUCNUF_FOURNISSEUR != null) {
                        sb_tFileOutputDelimited_1.append(
                            copyOfOUTFRN.FOUCNUF_FOURNISSEUR
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(copyOfOUTFRN.COUNTFRN != null) {
                        sb_tFileOutputDelimited_1.append(
                            copyOfOUTFRN.COUNTFRN
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(copyOfOUTFRN.Date_Debut != null) {
                        sb_tFileOutputDelimited_1.append(
                            copyOfOUTFRN.Date_Debut
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(copyOfOUTFRN.Date_Fin != null) {
                        sb_tFileOutputDelimited_1.append(
                            copyOfOUTFRN.Date_Fin
                        );
                            }
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    synchronized (multiThreadLockWrite) {
                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
                        log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");

                    }



 


	tos_count_tFileOutputDelimited_1++;

/**
 * [tFileOutputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	

 



/**
 * [tFileOutputDelimited_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	

 



/**
 * [tFileOutputDelimited_1 process_data_end ] stop
 */

} // End of branch "copyOfOUTFRN"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_end ] stop
 */



	
	/**
	 * [tHashInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashInput_2";
	
	
			cLabel="FOURNISSEEUR";
		

 



/**
 * [tHashInput_2 process_data_end ] stop
 */
	
	/**
	 * [tHashInput_2 end ] start
	 */

	

	
	
	currentComponent="tHashInput_2";
	
	
			cLabel="FOURNISSEEUR";
		
    

		
			nb_line_tHashInput_2++;
		}	
    	
		org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.remove("tHashFile_JOB_STOCK_HEBDO_" + pid +"_tHashOutput_1");
	


	globalMap.put("tHashInput_2_NB_LINE", nb_line_tHashInput_2);       

 

ok_Hash.put("tHashInput_2", true);
end_Hash.put("tHashInput_2", System.currentTimeMillis());




/**
 * [tHashInput_2 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row10 != null) {
						tHash_Lookup_row10.endGet();
					}
					globalMap.remove( "tHash_Lookup_row10" );

					
					
				
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'copyOfOUTFRN': " + count_copyOfOUTFRN_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
			 			"tHashInput_2","FOURNISSEEUR","tHashInput","tMap_3","tMap_3","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Done.") );

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	



		
	   		synchronized (multiThreadLockWrite) {
		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
			}
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	
				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"copyOfOUTFRN",2,0,
			 			"tMap_3","tMap_3","tMap","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk16", 0, "ok");
				}
				tFileExist_1Process(globalMap);



/**
 * [tFileOutputDelimited_1 end ] stop
 */






				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row10"); 
				     			
				try{
					
	
	/**
	 * [tHashInput_2 finally ] start
	 */

	

	
	
	currentComponent="tHashInput_2";
	
	
			cLabel="FOURNISSEEUR";
		

 



/**
 * [tHashInput_2 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
		   		synchronized (multiThreadLockWrite) {
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
				}
			
			
		}
	

 



/**
 * [tFileOutputDelimited_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tHashInput_2_SUBPROCESS_STATE", 1);
	}
	

public void tFileExist_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileExist_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileExist_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileExist_1", false);
		start_Hash.put("tFileExist_1", System.currentTimeMillis());
		
	
	currentComponent="tFileExist_1";
	
	
		int tos_count_tFileExist_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileExist_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileExist_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileExist_1 = new StringBuilder();
                    log4jParamters_tFileExist_1.append("Parameters:");
                            log4jParamters_tFileExist_1.append("FILE_NAME" + " = " + "((String)globalMap.get(\"tFileOutputDelimited_1_FILE_NAME\"))");
                        log4jParamters_tFileExist_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileExist_1 - "  + (log4jParamters_tFileExist_1) );
                    } 
                } 
            new BytesLimit65535_tFileExist_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileExist_1", "tFileExist_1", "tFileExist");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tFileExist_1 begin ] stop
 */
	
	/**
	 * [tFileExist_1 main ] start
	 */

	

	
	
	currentComponent="tFileExist_1";
	
	


				final StringBuffer log4jSb_tFileExist_1 = new StringBuffer();
			

java.io.File file_tFileExist_1 = new java.io.File(((String)globalMap.get("tFileOutputDelimited_1_FILE_NAME")));
if (!file_tFileExist_1.exists()) {
    globalMap.put("tFileExist_1_EXISTS",false);
    log.info("tFileExist_1 - Directory or file : " + file_tFileExist_1.getAbsolutePath() + " doesn't exist.");
}else{
	globalMap.put("tFileExist_1_EXISTS",true);
    log.info("tFileExist_1 - Directory or file : " + file_tFileExist_1.getAbsolutePath() + " exists.");
}

globalMap.put("tFileExist_1_FILENAME",((String)globalMap.get("tFileOutputDelimited_1_FILE_NAME")));


 


	tos_count_tFileExist_1++;

/**
 * [tFileExist_1 main ] stop
 */
	
	/**
	 * [tFileExist_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileExist_1";
	
	

 



/**
 * [tFileExist_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileExist_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileExist_1";
	
	

 



/**
 * [tFileExist_1 process_data_end ] stop
 */
	
	/**
	 * [tFileExist_1 end ] start
	 */

	

	
	
	currentComponent="tFileExist_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tFileExist_1 - "  + ("Done.") );

ok_Hash.put("tFileExist_1", true);
end_Hash.put("tFileExist_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk21", 0, "ok");
				}
				tSendMail_1Process(globalMap);



/**
 * [tFileExist_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileExist_1 finally ] start
	 */

	

	
	
	currentComponent="tFileExist_1";
	
	

 



/**
 * [tFileExist_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tSendMail_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_1", false);
		start_Hash.put("tSendMail_1", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_1";
	
	
		int tos_count_tSendMail_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSendMail_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSendMail_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSendMail_1 = new StringBuilder();
                    log4jParamters_tSendMail_1.append("Parameters:");
                            log4jParamters_tSendMail_1.append("TO" + " = " + "\"souzzi@marjane.co.ma\"");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("FROM" + " = " + "\"Talend@marjane.co.ma\"");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("NEED_PERSONAL_NAME" + " = " + "false");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("CC" + " = " + "\"aoukerrou@marjane.co.ma ; zjaddy@marjane.co.ma\"");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("BCC" + " = " + "");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("SUBJECT" + " = " + "\"FRNS STOCK HEBDO\"");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("MESSAGE" + " = " + "\"Hello,  Merci de trouver ci-joint les fournisseurs de l'alimentation du Stock Hebdo.  Cordialement\"");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("CHECK_ATTACHMENT" + " = " + "true");
                        log4jParamters_tSendMail_1.append(" | ");
                            log4jParamters_tSendMail_1.append("ATTACHMENTS" + " = " + "[{CONTENT_TRANSFER_ENCODING="+("DEFAULT")+", FILE="+("((String)globalMap.get(\"tFileOutputDelimited_1_FILE_NAME\"))")+"}]");
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
                if(log.isDebugEnabled())
            log.debug("tSendMail_1 - "  + (log4jParamters_tSendMail_1) );
                    } 
                } 
            new BytesLimit65535_tSendMail_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSendMail_1", "tSendMail_1", "tSendMail");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSendMail_1 begin ] stop
 */
	
	/**
	 * [tSendMail_1 main ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 

	String smtpHost_tSendMail_1 = "192.168.99.103";
        String smtpPort_tSendMail_1 = "25";
	String from_tSendMail_1 = ("Talend@marjane.co.ma");
    String to_tSendMail_1 = ("souzzi@marjane.co.ma").replace(";",",");
    String cc_tSendMail_1 = (("aoukerrou@marjane.co.ma ; zjaddy@marjane.co.ma")==null || "".equals("aoukerrou@marjane.co.ma ; zjaddy@marjane.co.ma"))?null:("aoukerrou@marjane.co.ma ; zjaddy@marjane.co.ma").replace(";",",");
    String bcc_tSendMail_1 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_1 = ("FRNS STOCK HEBDO");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();
		attachments_tSendMail_1.add(((String)globalMap.get("tFileOutputDelimited_1_FILE_NAME")));
		contentTransferEncoding_tSendMail_1.add("DEFAULT");	

	String message_tSendMail_1 = (("Hello,\nMerci de trouver ci-joint les fournisseurs de l'alimentation du Stock Hebdo.\nCordialement") == null || "".equals("Hello,\nMerci de trouver ci-joint les fournisseurs de l'alimentation du Stock Hebdo.\nCordialement")) ? "\"\"" : ("Hello,\nMerci de trouver ci-joint les fournisseurs de l'alimentation du Stock Hebdo.\nCordialement") ;
	java.util.Properties props_tSendMail_1 = System.getProperties();     
	props_tSendMail_1.put("mail.smtp.host", smtpHost_tSendMail_1);
	props_tSendMail_1.put("mail.smtp.port", smtpPort_tSendMail_1);
		props_tSendMail_1.put("mail.mime.encodefilename", "true");     
	try {
		
			log.info("tSendMail_1 - Connection attempt to '" + smtpHost_tSendMail_1 +"'.");
		
		  
			props_tSendMail_1.put("mail.smtp.auth", "false");
			javax.mail.Session session_tSendMail_1 = javax.mail.Session.getInstance(props_tSendMail_1, null);    
		
		
			log.info("tSendMail_1 - Connection to '" + smtpHost_tSendMail_1 + "' has succeeded.");
		
		javax.mail.Message msg_tSendMail_1 = new javax.mail.internet.MimeMessage(session_tSendMail_1);
		msg_tSendMail_1.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_1, null));
		msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_1, false));
		if (cc_tSendMail_1 != null) msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_1, false));
		if (bcc_tSendMail_1 != null) msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_1, false));
		msg_tSendMail_1.setSubject(subject_tSendMail_1);

		for (int i_tSendMail_1 = 0; i_tSendMail_1 < headers_tSendMail_1.size(); i_tSendMail_1++) {
			java.util.Map<String, String> header_tSendMail_1 = headers_tSendMail_1.get(i_tSendMail_1);
			msg_tSendMail_1.setHeader(header_tSendMail_1.get("KEY"), header_tSendMail_1.get("VALUE"));    
		}  
		msg_tSendMail_1.setSentDate(new Date());
		msg_tSendMail_1.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_1 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_1.setText(message_tSendMail_1,"ISO-8859-15", "plain");
		mp_tSendMail_1.addBodyPart(mbpText_tSendMail_1);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_1 = null;

		for (int i_tSendMail_1 = 0; i_tSendMail_1 < attachments_tSendMail_1.size(); i_tSendMail_1++){
			String filename_tSendMail_1 = attachments_tSendMail_1.get(i_tSendMail_1);
			javax.activation.FileDataSource fds_tSendMail_1 = null;
			java.io.File file_tSendMail_1 = new java.io.File(filename_tSendMail_1);
			
    		if (file_tSendMail_1.isDirectory()){
				java.io.File[] subFiles_tSendMail_1 = file_tSendMail_1.listFiles();
				for(java.io.File subFile_tSendMail_1 : subFiles_tSendMail_1){
					if (subFile_tSendMail_1.isFile()){
						fds_tSendMail_1 = new javax.activation.FileDataSource(subFile_tSendMail_1.getAbsolutePath());
						mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_1.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1));
						mbpFile_tSendMail_1.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
						if(contentTransferEncoding_tSendMail_1.get(i_tSendMail_1).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
					}
				}
    		}else{
				mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_1 = new javax.activation.FileDataSource(filename_tSendMail_1);
				mbpFile_tSendMail_1.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1)); 
				mbpFile_tSendMail_1.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
				if(contentTransferEncoding_tSendMail_1.get(i_tSendMail_1).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
			}
		}
		// -- set the content --
		msg_tSendMail_1.setContent(mp_tSendMail_1);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_1 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_1.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_1.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_1.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_1.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_1.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_1);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_1 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_1);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_1_ERROR_MESSAGE",e.getMessage());
  		
			throw(e);
		
	}finally{
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

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_1 end ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tSendMail_1 - "  + ("Done.") );

ok_Hash.put("tSendMail_1", true);
end_Hash.put("tSendMail_1", System.currentTimeMillis());




/**
 * [tSendMail_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSendMail_1 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_1_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return null;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return null;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return null;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return null;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return null;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return null;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return null;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
		sb.append(",FOUCIN="+String.valueOf(FOUCIN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
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
public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row4");
			
		int tos_count_tDBOutput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_2 = new StringBuilder();
                    log4jParamters_tDBOutput_2.append("Parameters:");
                            log4jParamters_tDBOutput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE" + " = " + "\"ODS_STOCK_HEBDO_TT\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + (log4jParamters_tDBOutput_2) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_2", "tDBOutput_2", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_2 = 0;
    int nb_line_update_tDBOutput_2 = 0;
    int nb_line_inserted_tDBOutput_2 = 0;
    int nb_line_deleted_tDBOutput_2 = 0;
    int nb_line_rejected_tDBOutput_2 = 0;

    int tmp_batchUpdateCount_tDBOutput_2 = 0;

    int deletedCount_tDBOutput_2=0;
    int updatedCount_tDBOutput_2=0;
    int insertedCount_tDBOutput_2=0;
    int rowsToCommitCount_tDBOutput_2=0;
    int rejectedCount_tDBOutput_2=0;

    boolean whetherReject_tDBOutput_2 = false;

    java.sql.Connection conn_tDBOutput_2 = null;

    //optional table
    String dbschema_tDBOutput_2 = null;
    String tableName_tDBOutput_2 = null;
        dbschema_tDBOutput_2 = (String)globalMap.get("dbschema_tDBConnection_3");
		
        conn_tDBOutput_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_2.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_2.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_2.getAutoCommit())  + ("'.") );
        int count_tDBOutput_2=0;

        if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
            tableName_tDBOutput_2 = ("ODS_STOCK_HEBDO_TT");
        } else {
            tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "." + ("ODS_STOCK_HEBDO_TT");
        }
                String insert_tDBOutput_2 = "INSERT INTO " + tableName_tDBOutput_2 + " (CODE_ENSEIGNE,CODE_INTERNE_ARTICLE,CODE_ARTICLE,CODE_SITE,LIB_ARTICLE,EAN,VALO_STOCK,QTE_STOCK,DATE_STOCK,LAST_MAJ_DATE,FOUCIN) VALUES (?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
                        resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);





 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tDBInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_5", false);
		start_Hash.put("tDBInput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_5";
	
	
			cLabel="ORACLE_GOLD";
		
		int tos_count_tDBInput_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_5 = new StringBuilder();
                    log4jParamters_tDBInput_5.append("Parameters:");
                            log4jParamters_tDBInput_5.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERY" + " = " + "\"with vue_couche as   (SELECT STOSITE,           STOCINL,           SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,           SUM((NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *               NVL(STOPURP, 0)) VALO_STOCK      FROM STOCOUCH     WHERE STOTPOS BETWEEN 0 AND 2     GROUP BY STOSITE, STOCINL),  vue_mvts as   (SELECT STMSITE,           STMCINL,           NVL(SUM(STMVAL), 0) QTE_MVTS,           NVL(SUM(STMMCRE), 0) VALO_MVTS      FROM STOMVT     WHERE STMTPOS BETWEEN 0 AND 2       AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)     GROUP BY STMSITE, STMCINL)  SELECT S.SOCCHAIN CODEENSEIGNE,         U.ARVCINR CODE_INTERNE_ARTICLE,         U.ARVCEXR CODE_ARTICLE,         S.SOCSITE CODESITE,         REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\\\\\"\\\\\\\"', '') LIBARTICLE,         PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,         vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,         vue_couche.QTE_STOCK - NVL(QTE_MVTS, 0) QTE_STOCK,         TRUNC(SYSDATE, 'IW') DATE_STOCK,         TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') DATELASTUPDATEWEBJOB,          F.FCLCFIN FOUCIN    FROM SITDGENE   S,         CLIDGENE   C,         SITCLIREL  L,         ARTUV      U,         vue_couche,         vue_mvts,         FOUCATALOG F,         ARTRAC     A   WHERE vue_couche.STOSITE = S.SOCSITE     AND vue_couche.STOCINL = U.ARVCINV     AND U.ARVCINR = A.ARTCINR     AND A.ARTETAT IN (1, 5)     AND S.SOCCHAIN = 4     AND S.SOCSITE = L.SCLSITE     AND C.CLINCLI = L.SCLNCLI     AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND L.SCLDFIN     AND C.CLISTAT = 1     AND F.FCLCINV = U.ARVCINV     AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN     AND vue_couche.QTE_STOCK > 0     AND vue_couche.STOSITE = vue_mvts.STMSITE(+)     AND vue_couche.STOCINL = vue_mvts.STMCINL(+) and rownum<1000\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("USE_CURSOR" + " = " + "true");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("CURSOR_SIZE" + " = " + "1000");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TRIM_ALL_COLUMN" + " = " + "true");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_5 - "  + (log4jParamters_tDBInput_5) );
                    } 
                } 
            new BytesLimit65535_tDBInput_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_5", "ORACLE_GOLD", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				conn_tDBInput_5 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
				if(conn_tDBInput_5 != null) {
					if(conn_tDBInput_5.getMetaData() != null) {
						
							log.debug("tDBInput_5 - Uses an existing connection with username '" + conn_tDBInput_5.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_5.getMetaData().getURL() + ".");
						
					}
				}
			
                boolean isTimeZoneNull_tDBInput_5 = false;
				boolean isConnectionWrapped_tDBInput_5 = !(conn_tDBInput_5 instanceof oracle.jdbc.OracleConnection) && conn_tDBInput_5.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_5 = null;
                if (isConnectionWrapped_tDBInput_5) {
					unwrappedOraConn_tDBInput_5 = conn_tDBInput_5.unwrap(oracle.jdbc.OracleConnection.class);
                    if (unwrappedOraConn_tDBInput_5 != null) {
                        isTimeZoneNull_tDBInput_5 = (unwrappedOraConn_tDBInput_5.getSessionTimeZone() == null);
                    }
                } else {
                    isTimeZoneNull_tDBInput_5 = (((oracle.jdbc.OracleConnection)conn_tDBInput_5).getSessionTimeZone() == null);
                }

				if(isTimeZoneNull_tDBInput_5) {
					java.sql.Statement stmtGetTZ_tDBInput_5 = conn_tDBInput_5.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_5 = stmtGetTZ_tDBInput_5.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_5 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_5.next()) {
						sessionTimezone_tDBInput_5 = rsGetTZ_tDBInput_5.getString(1);
					}
					if (isConnectionWrapped_tDBInput_5 && unwrappedOraConn_tDBInput_5 != null) {
                        unwrappedOraConn_tDBInput_5.setSessionTimeZone(sessionTimezone_tDBInput_5);
                    } else {
                        ((oracle.jdbc.OracleConnection)conn_tDBInput_5).setSessionTimeZone(sessionTimezone_tDBInput_5);
                    }
				}
			
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
																					java.sql.ResultSet.CONCUR_READ_ONLY);
			
                stmt_tDBInput_5.setFetchSize(1000);


		    String dbquery_tDBInput_5 = "with vue_couche as\n (SELECT STOSITE,\n         STOCINL,\n         SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV,"
+" 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,\n         SUM((NVL(STOVALI, 0) + NVL"
+"(STOVALL, 0) - NVL(STOVALV, 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *\n             NVL("
+"STOPURP, 0)) VALO_STOCK\n    FROM STOCOUCH\n   WHERE STOTPOS BETWEEN 0 AND 2\n   GROUP BY STOSITE, STOCINL),\nvue_mvts a"
+"s\n (SELECT STMSITE,\n         STMCINL,\n         NVL(SUM(STMVAL), 0) QTE_MVTS,\n         NVL(SUM(STMMCRE), 0) VALO_MVTS"
+"\n    FROM STOMVT\n   WHERE STMTPOS BETWEEN 0 AND 2\n     AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)\n   GROUP BY STMSITE, STM"
+"CINL)\nSELECT S.SOCCHAIN CODEENSEIGNE,\n       U.ARVCINR CODE_INTERNE_ARTICLE,\n       U.ARVCEXR CODE_ARTICLE,\n       S"
+".SOCSITE CODESITE,\n       REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\"\\\"', '') LIBARTICLE,\n       PKARTCOCA.GET"
+"_CLOSESTEAN(U.ARVCINV) EAN,\n       vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,\n       vue_couche.QTE_STOCK -"
+" NVL(QTE_MVTS, 0) QTE_STOCK,\n       TRUNC(SYSDATE, 'IW') DATE_STOCK,\n       TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') "
+"DATELASTUPDATEWEBJOB,\n        F.FCLCFIN FOUCIN\n  FROM SITDGENE   S,\n       CLIDGENE   C,\n       SITCLIREL  L,\n     "
+"  ARTUV      U,\n       vue_couche,\n       vue_mvts,\n       FOUCATALOG F,\n       ARTRAC     A\n WHERE vue_couche.STOS"
+"ITE = S.SOCSITE\n   AND vue_couche.STOCINL = U.ARVCINV\n   AND U.ARVCINR = A.ARTCINR\n   AND A.ARTETAT IN (1, 5)\n   AND"
+" S.SOCCHAIN = 4\n   AND S.SOCSITE = L.SCLSITE\n   AND C.CLINCLI = L.SCLNCLI\n   AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND"
+" L.SCLDFIN\n   AND C.CLISTAT = 1\n   AND F.FCLCINV = U.ARVCINV\n   AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN\n "
+"  AND vue_couche.QTE_STOCK > 0\n   AND vue_couche.STOSITE = vue_mvts.STMSITE(+)\n   AND vue_couche.STOCINL = vue_mvts.ST"
+"MCINL(+) and rownum<1000";
		    
	    		log.debug("tDBInput_5 - Executing the query: '" + dbquery_tDBInput_5 + "'.");
			

            	globalMap.put("tDBInput_5_QUERY",dbquery_tDBInput_5);
		    java.sql.ResultSet rs_tDBInput_5 = null;

		    try {
		    	rs_tDBInput_5 = stmt_tDBInput_5.executeQuery(dbquery_tDBInput_5);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_5 = rs_tDBInput_5.getMetaData();
		    	int colQtyInRs_tDBInput_5 = rsmd_tDBInput_5.getColumnCount();

		    String tmpContent_tDBInput_5 = null;
		    
		    
		    	log.debug("tDBInput_5 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_5.next()) {
		        nb_line_tDBInput_5++;
		        
							if(colQtyInRs_tDBInput_5 < 1) {
								row4.CODE_ENSEIGNE = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(1) != null) {
						row4.CODE_ENSEIGNE = rs_tDBInput_5.getLong(1);
					} else {
				
						row4.CODE_ENSEIGNE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row4.CODE_INTERNE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(2) != null) {
						row4.CODE_INTERNE_ARTICLE = rs_tDBInput_5.getLong(2);
					} else {
				
						row4.CODE_INTERNE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row4.CODE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(3) != null) {
						row4.CODE_ARTICLE = rs_tDBInput_5.getLong(3);
					} else {
				
						row4.CODE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row4.CODE_SITE = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(4) != null) {
						row4.CODE_SITE = rs_tDBInput_5.getLong(4);
					} else {
				
						row4.CODE_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row4.LIB_ARTICLE = null;
							} else {
	                         		
        	row4.LIB_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_5, 5, true);
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								row4.EAN = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(6) != null) {
						row4.EAN = rs_tDBInput_5.getLong(6);
					} else {
				
						row4.EAN = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 7) {
								row4.VALO_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(7) != null) {
						row4.VALO_STOCK = rs_tDBInput_5.getBigDecimal(7);
					} else {
				
						row4.VALO_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 8) {
								row4.QTE_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(8) != null) {
						row4.QTE_STOCK = rs_tDBInput_5.getBigDecimal(8);
					} else {
				
						row4.QTE_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 9) {
								row4.DATE_STOCK = null;
							} else {
										
			row4.DATE_STOCK = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 9);
		                    }
							if(colQtyInRs_tDBInput_5 < 10) {
								row4.LAST_MAJ_DATE = null;
							} else {
										
			row4.LAST_MAJ_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 10);
		                    }
							if(colQtyInRs_tDBInput_5 < 11) {
								row4.FOUCIN = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(11) != null) {
						row4.FOUCIN = rs_tDBInput_5.getInt(11);
					} else {
				
						row4.FOUCIN = null;
					}
		                    }
					
						log.debug("tDBInput_5 - Retrieving the record " + nb_line_tDBInput_5 + ".");
					




 



/**
 * [tDBInput_5 begin ] stop
 */
	
	/**
	 * [tDBInput_5 main ] start
	 */

	

	
	
	currentComponent="tDBInput_5";
	
	
			cLabel="ORACLE_GOLD";
		

 


	tos_count_tDBInput_5++;

/**
 * [tDBInput_5 main ] stop
 */
	
	/**
	 * [tDBInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_5";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_5 process_data_begin ] stop
 */

	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row4","tDBInput_5","ORACLE_GOLD","tOracleInput","tDBOutput_2","tDBOutput_2","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		



        whetherReject_tDBOutput_2 = false;
                        if(row4.CODE_ENSEIGNE == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(1, row4.CODE_ENSEIGNE);
}

                        if(row4.CODE_INTERNE_ARTICLE == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(2, row4.CODE_INTERNE_ARTICLE);
}

                        if(row4.CODE_ARTICLE == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(3, row4.CODE_ARTICLE);
}

                        if(row4.CODE_SITE == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(4, row4.CODE_SITE);
}

                        if(row4.LIB_ARTICLE == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(5, row4.LIB_ARTICLE);
}

                        if(row4.EAN == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setLong(6, row4.EAN);
}

                        pstmt_tDBOutput_2.setBigDecimal(7, row4.VALO_STOCK);

                        pstmt_tDBOutput_2.setBigDecimal(8, row4.QTE_STOCK);

                        if(row4.DATE_STOCK != null) {
pstmt_tDBOutput_2.setObject(9, new java.sql.Timestamp(row4.DATE_STOCK.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_2.setNull(9, java.sql.Types.DATE);
}

                        if(row4.LAST_MAJ_DATE != null) {
pstmt_tDBOutput_2.setObject(10, new java.sql.Timestamp(row4.LAST_MAJ_DATE.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_2.setNull(10, java.sql.Types.DATE);
}

                        if(row4.FOUCIN == null) {
pstmt_tDBOutput_2.setNull(11, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_2.setInt(11, row4.FOUCIN);
}

                try {
                    nb_line_tDBOutput_2++;
                    int processedCount_tDBOutput_2 = pstmt_tDBOutput_2.executeUpdate();
                    insertedCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    rowsToCommitCount_tDBOutput_2 += processedCount_tDBOutput_2;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_2)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_2) {
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e_tDBOutput_2.getMessage());
                    whetherReject_tDBOutput_2 = true;
            log.error("tDBOutput_2 - "  + (e_tDBOutput_2.getMessage()) );
                            System.err.print(e_tDBOutput_2.getMessage());
                }

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_5 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_5 end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";
	
	
			cLabel="ORACLE_GOLD";
		

}
}finally{
	if (rs_tDBInput_5 != null) {
		rs_tDBInput_5.close();
	}
	if (stmt_tDBInput_5 != null) {
		stmt_tDBInput_5.close();
	}
}

globalMap.put("tDBInput_5_NB_LINE",nb_line_tDBInput_5);
	    		log.debug("tDBInput_5 - Retrieved records count: "+nb_line_tDBInput_5 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_5 - "  + ("Done.") );

ok_Hash.put("tDBInput_5", true);
end_Hash.put("tDBInput_5", System.currentTimeMillis());




/**
 * [tDBInput_5 end ] stop
 */

	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
	



	
        if(pstmt_tDBOutput_2 != null) {
			
				pstmt_tDBOutput_2.close();
				resourceMap.remove("pstmt_tDBOutput_2");
			
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);

	
	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row4",2,0,
			 			"tDBInput_5","ORACLE_GOLD","tOracleInput","tDBOutput_2","tDBOutput_2","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Done.") );

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_5 finally ] stop
 */

	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	



    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return null;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return null;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return null;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return null;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return null;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return null;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return null;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
		sb.append(",FOUCIN="+String.valueOf(FOUCIN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
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
public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row6Struct row6 = new row6Struct();




	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row6");
			
		int tos_count_tDBOutput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_3 = new StringBuilder();
                    log4jParamters_tDBOutput_3.append("Parameters:");
                            log4jParamters_tDBOutput_3.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TABLE" + " = " + "\"ODS_STOCK_HEBDO_TT\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + (log4jParamters_tDBOutput_3) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_3", "tDBOutput_3", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_3 = 0;
    int nb_line_update_tDBOutput_3 = 0;
    int nb_line_inserted_tDBOutput_3 = 0;
    int nb_line_deleted_tDBOutput_3 = 0;
    int nb_line_rejected_tDBOutput_3 = 0;

    int tmp_batchUpdateCount_tDBOutput_3 = 0;

    int deletedCount_tDBOutput_3=0;
    int updatedCount_tDBOutput_3=0;
    int insertedCount_tDBOutput_3=0;
    int rowsToCommitCount_tDBOutput_3=0;
    int rejectedCount_tDBOutput_3=0;

    boolean whetherReject_tDBOutput_3 = false;

    java.sql.Connection conn_tDBOutput_3 = null;

    //optional table
    String dbschema_tDBOutput_3 = null;
    String tableName_tDBOutput_3 = null;
        dbschema_tDBOutput_3 = (String)globalMap.get("dbschema_tDBConnection_3");
		
        conn_tDBOutput_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_3.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_3.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_3.getAutoCommit())  + ("'.") );
        int count_tDBOutput_3=0;

        if(dbschema_tDBOutput_3 == null || dbschema_tDBOutput_3.trim().length() == 0) {
            tableName_tDBOutput_3 = ("ODS_STOCK_HEBDO_TT");
        } else {
            tableName_tDBOutput_3 = dbschema_tDBOutput_3 + "." + ("ODS_STOCK_HEBDO_TT");
        }
                String insert_tDBOutput_3 = "INSERT INTO " + tableName_tDBOutput_3 + " (CODE_ENSEIGNE,CODE_INTERNE_ARTICLE,CODE_ARTICLE,CODE_SITE,LIB_ARTICLE,EAN,VALO_STOCK,QTE_STOCK,DATE_STOCK,LAST_MAJ_DATE,FOUCIN) VALUES (?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(insert_tDBOutput_3);
                        resourceMap.put("pstmt_tDBOutput_3", pstmt_tDBOutput_3);





 



/**
 * [tDBOutput_3 begin ] stop
 */



	
	/**
	 * [tDBInput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_6", false);
		start_Hash.put("tDBInput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_6";
	
	
			cLabel="ORACLE_GOLD";
		
		int tos_count_tDBInput_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_6 = new StringBuilder();
                    log4jParamters_tDBInput_6.append("Parameters:");
                            log4jParamters_tDBInput_6.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERY" + " = " + "\"with vue_couche as   (SELECT STOSITE,           STOCINL,           SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,           SUM((NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *               NVL(STOPURP, 0)) VALO_STOCK      FROM STOCOUCH     WHERE STOTPOS BETWEEN 0 AND 2     GROUP BY STOSITE, STOCINL),  vue_mvts as   (SELECT STMSITE,           STMCINL,           NVL(SUM(STMVAL), 0) QTE_MVTS,           NVL(SUM(STMMCRE), 0) VALO_MVTS      FROM STOMVT     WHERE STMTPOS BETWEEN 0 AND 2       AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)     GROUP BY STMSITE, STMCINL)  SELECT S.SOCCHAIN CODEENSEIGNE,         U.ARVCINR CODE_INTERNE_ARTICLE,         U.ARVCEXR CODE_ARTICLE,         S.SOCSITE CODESITE,         REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\\\\\"\\\\\\\"', '') LIBARTICLE,         PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,         vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,         vue_couche.QTE_STOCK - NVL(QTE_MVTS, 0) QTE_STOCK,         TRUNC(SYSDATE, 'IW') DATE_STOCK,         TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') DATELASTUPDATEWEBJOB,          F.FCLCFIN FOUCIN    FROM SITDGENE   S,         CLIDGENE   C,         SITCLIREL  L,         ARTUV      U,         vue_couche,         vue_mvts,         FOUCATALOG F,         ARTRAC     A   WHERE vue_couche.STOSITE = S.SOCSITE     AND vue_couche.STOCINL = U.ARVCINV     AND U.ARVCINR = A.ARTCINR     AND A.ARTETAT IN (1, 5)     AND S.SOCCHAIN = 6     AND S.SOCSITE = L.SCLSITE     AND C.CLINCLI = L.SCLNCLI     AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND L.SCLDFIN     AND C.CLISTAT = 1     AND F.FCLCINV = U.ARVCINV     AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN     AND vue_couche.QTE_STOCK > 0     AND vue_couche.STOSITE = vue_mvts.STMSITE(+)     AND vue_couche.STOCINL = vue_mvts.STMCINL(+) and rownum<1000\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("USE_CURSOR" + " = " + "true");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("CURSOR_SIZE" + " = " + "1000");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TRIM_ALL_COLUMN" + " = " + "true");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_6 - "  + (log4jParamters_tDBInput_6) );
                    } 
                } 
            new BytesLimit65535_tDBInput_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_6", "ORACLE_GOLD", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_6 = 0;
		    java.sql.Connection conn_tDBInput_6 = null;
				conn_tDBInput_6 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
				if(conn_tDBInput_6 != null) {
					if(conn_tDBInput_6.getMetaData() != null) {
						
							log.debug("tDBInput_6 - Uses an existing connection with username '" + conn_tDBInput_6.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_6.getMetaData().getURL() + ".");
						
					}
				}
			
                boolean isTimeZoneNull_tDBInput_6 = false;
				boolean isConnectionWrapped_tDBInput_6 = !(conn_tDBInput_6 instanceof oracle.jdbc.OracleConnection) && conn_tDBInput_6.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_6 = null;
                if (isConnectionWrapped_tDBInput_6) {
					unwrappedOraConn_tDBInput_6 = conn_tDBInput_6.unwrap(oracle.jdbc.OracleConnection.class);
                    if (unwrappedOraConn_tDBInput_6 != null) {
                        isTimeZoneNull_tDBInput_6 = (unwrappedOraConn_tDBInput_6.getSessionTimeZone() == null);
                    }
                } else {
                    isTimeZoneNull_tDBInput_6 = (((oracle.jdbc.OracleConnection)conn_tDBInput_6).getSessionTimeZone() == null);
                }

				if(isTimeZoneNull_tDBInput_6) {
					java.sql.Statement stmtGetTZ_tDBInput_6 = conn_tDBInput_6.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_6 = stmtGetTZ_tDBInput_6.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_6 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_6.next()) {
						sessionTimezone_tDBInput_6 = rsGetTZ_tDBInput_6.getString(1);
					}
					if (isConnectionWrapped_tDBInput_6 && unwrappedOraConn_tDBInput_6 != null) {
                        unwrappedOraConn_tDBInput_6.setSessionTimeZone(sessionTimezone_tDBInput_6);
                    } else {
                        ((oracle.jdbc.OracleConnection)conn_tDBInput_6).setSessionTimeZone(sessionTimezone_tDBInput_6);
                    }
				}
			
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
																					java.sql.ResultSet.CONCUR_READ_ONLY);
			
                stmt_tDBInput_6.setFetchSize(1000);


		    String dbquery_tDBInput_6 = "with vue_couche as\n (SELECT STOSITE,\n         STOCINL,\n         SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV,"
+" 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,\n         SUM((NVL(STOVALI, 0) + NVL"
+"(STOVALL, 0) - NVL(STOVALV, 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *\n             NVL("
+"STOPURP, 0)) VALO_STOCK\n    FROM STOCOUCH\n   WHERE STOTPOS BETWEEN 0 AND 2\n   GROUP BY STOSITE, STOCINL),\nvue_mvts a"
+"s\n (SELECT STMSITE,\n         STMCINL,\n         NVL(SUM(STMVAL), 0) QTE_MVTS,\n         NVL(SUM(STMMCRE), 0) VALO_MVTS"
+"\n    FROM STOMVT\n   WHERE STMTPOS BETWEEN 0 AND 2\n     AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)\n   GROUP BY STMSITE, STM"
+"CINL)\nSELECT S.SOCCHAIN CODEENSEIGNE,\n       U.ARVCINR CODE_INTERNE_ARTICLE,\n       U.ARVCEXR CODE_ARTICLE,\n       S"
+".SOCSITE CODESITE,\n       REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\"\\\"', '') LIBARTICLE,\n       PKARTCOCA.GET"
+"_CLOSESTEAN(U.ARVCINV) EAN,\n       vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,\n       vue_couche.QTE_STOCK -"
+" NVL(QTE_MVTS, 0) QTE_STOCK,\n       TRUNC(SYSDATE, 'IW') DATE_STOCK,\n       TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') "
+"DATELASTUPDATEWEBJOB,\n        F.FCLCFIN FOUCIN\n  FROM SITDGENE   S,\n       CLIDGENE   C,\n       SITCLIREL  L,\n     "
+"  ARTUV      U,\n       vue_couche,\n       vue_mvts,\n       FOUCATALOG F,\n       ARTRAC     A\n WHERE vue_couche.STOS"
+"ITE = S.SOCSITE\n   AND vue_couche.STOCINL = U.ARVCINV\n   AND U.ARVCINR = A.ARTCINR\n   AND A.ARTETAT IN (1, 5)\n   AND"
+" S.SOCCHAIN = 6\n   AND S.SOCSITE = L.SCLSITE\n   AND C.CLINCLI = L.SCLNCLI\n   AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND"
+" L.SCLDFIN\n   AND C.CLISTAT = 1\n   AND F.FCLCINV = U.ARVCINV\n   AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN\n "
+"  AND vue_couche.QTE_STOCK > 0\n   AND vue_couche.STOSITE = vue_mvts.STMSITE(+)\n   AND vue_couche.STOCINL = vue_mvts.ST"
+"MCINL(+) and rownum<1000";
		    
	    		log.debug("tDBInput_6 - Executing the query: '" + dbquery_tDBInput_6 + "'.");
			

            	globalMap.put("tDBInput_6_QUERY",dbquery_tDBInput_6);
		    java.sql.ResultSet rs_tDBInput_6 = null;

		    try {
		    	rs_tDBInput_6 = stmt_tDBInput_6.executeQuery(dbquery_tDBInput_6);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_6 = rs_tDBInput_6.getMetaData();
		    	int colQtyInRs_tDBInput_6 = rsmd_tDBInput_6.getColumnCount();

		    String tmpContent_tDBInput_6 = null;
		    
		    
		    	log.debug("tDBInput_6 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_6.next()) {
		        nb_line_tDBInput_6++;
		        
							if(colQtyInRs_tDBInput_6 < 1) {
								row6.CODE_ENSEIGNE = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(1) != null) {
						row6.CODE_ENSEIGNE = rs_tDBInput_6.getLong(1);
					} else {
				
						row6.CODE_ENSEIGNE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row6.CODE_INTERNE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(2) != null) {
						row6.CODE_INTERNE_ARTICLE = rs_tDBInput_6.getLong(2);
					} else {
				
						row6.CODE_INTERNE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row6.CODE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(3) != null) {
						row6.CODE_ARTICLE = rs_tDBInput_6.getLong(3);
					} else {
				
						row6.CODE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row6.CODE_SITE = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(4) != null) {
						row6.CODE_SITE = rs_tDBInput_6.getLong(4);
					} else {
				
						row6.CODE_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row6.LIB_ARTICLE = null;
							} else {
	                         		
        	row6.LIB_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_6, 5, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row6.EAN = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(6) != null) {
						row6.EAN = rs_tDBInput_6.getLong(6);
					} else {
				
						row6.EAN = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row6.VALO_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(7) != null) {
						row6.VALO_STOCK = rs_tDBInput_6.getBigDecimal(7);
					} else {
				
						row6.VALO_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row6.QTE_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(8) != null) {
						row6.QTE_STOCK = rs_tDBInput_6.getBigDecimal(8);
					} else {
				
						row6.QTE_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 9) {
								row6.DATE_STOCK = null;
							} else {
										
			row6.DATE_STOCK = routines.system.JDBCUtil.getDate(rs_tDBInput_6, 9);
		                    }
							if(colQtyInRs_tDBInput_6 < 10) {
								row6.LAST_MAJ_DATE = null;
							} else {
										
			row6.LAST_MAJ_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_6, 10);
		                    }
							if(colQtyInRs_tDBInput_6 < 11) {
								row6.FOUCIN = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(11) != null) {
						row6.FOUCIN = rs_tDBInput_6.getInt(11);
					} else {
				
						row6.FOUCIN = null;
					}
		                    }
					
						log.debug("tDBInput_6 - Retrieving the record " + nb_line_tDBInput_6 + ".");
					




 



/**
 * [tDBInput_6 begin ] stop
 */
	
	/**
	 * [tDBInput_6 main ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	
			cLabel="ORACLE_GOLD";
		

 


	tos_count_tDBInput_6++;

/**
 * [tDBInput_6 main ] stop
 */
	
	/**
	 * [tDBInput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_6 process_data_begin ] stop
 */

	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row6","tDBInput_6","ORACLE_GOLD","tOracleInput","tDBOutput_3","tDBOutput_3","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row6 - " + (row6==null? "": row6.toLogString()));
    			}
    		



        whetherReject_tDBOutput_3 = false;
                        if(row6.CODE_ENSEIGNE == null) {
pstmt_tDBOutput_3.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setLong(1, row6.CODE_ENSEIGNE);
}

                        if(row6.CODE_INTERNE_ARTICLE == null) {
pstmt_tDBOutput_3.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setLong(2, row6.CODE_INTERNE_ARTICLE);
}

                        if(row6.CODE_ARTICLE == null) {
pstmt_tDBOutput_3.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setLong(3, row6.CODE_ARTICLE);
}

                        if(row6.CODE_SITE == null) {
pstmt_tDBOutput_3.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setLong(4, row6.CODE_SITE);
}

                        if(row6.LIB_ARTICLE == null) {
pstmt_tDBOutput_3.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(5, row6.LIB_ARTICLE);
}

                        if(row6.EAN == null) {
pstmt_tDBOutput_3.setNull(6, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setLong(6, row6.EAN);
}

                        pstmt_tDBOutput_3.setBigDecimal(7, row6.VALO_STOCK);

                        pstmt_tDBOutput_3.setBigDecimal(8, row6.QTE_STOCK);

                        if(row6.DATE_STOCK != null) {
pstmt_tDBOutput_3.setObject(9, new java.sql.Timestamp(row6.DATE_STOCK.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_3.setNull(9, java.sql.Types.DATE);
}

                        if(row6.LAST_MAJ_DATE != null) {
pstmt_tDBOutput_3.setObject(10, new java.sql.Timestamp(row6.LAST_MAJ_DATE.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_3.setNull(10, java.sql.Types.DATE);
}

                        if(row6.FOUCIN == null) {
pstmt_tDBOutput_3.setNull(11, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_3.setInt(11, row6.FOUCIN);
}

                try {
                    nb_line_tDBOutput_3++;
                    int processedCount_tDBOutput_3 = pstmt_tDBOutput_3.executeUpdate();
                    insertedCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    rowsToCommitCount_tDBOutput_3 += processedCount_tDBOutput_3;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_3)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_3) {
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e_tDBOutput_3.getMessage());
                    whetherReject_tDBOutput_3 = true;
            log.error("tDBOutput_3 - "  + (e_tDBOutput_3.getMessage()) );
                            System.err.print(e_tDBOutput_3.getMessage());
                }

 


	tos_count_tDBOutput_3++;

/**
 * [tDBOutput_3 main ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	

 



/**
 * [tDBOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	

 



/**
 * [tDBOutput_3 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_6 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_6 end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	
			cLabel="ORACLE_GOLD";
		

}
}finally{
	if (rs_tDBInput_6 != null) {
		rs_tDBInput_6.close();
	}
	if (stmt_tDBInput_6 != null) {
		stmt_tDBInput_6.close();
	}
}

globalMap.put("tDBInput_6_NB_LINE",nb_line_tDBInput_6);
	    		log.debug("tDBInput_6 - Retrieved records count: "+nb_line_tDBInput_6 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_6 - "  + ("Done.") );

ok_Hash.put("tDBInput_6", true);
end_Hash.put("tDBInput_6", System.currentTimeMillis());




/**
 * [tDBInput_6 end ] stop
 */

	
	/**
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
	



	
        if(pstmt_tDBOutput_3 != null) {
			
				pstmt_tDBOutput_3.close();
				resourceMap.remove("pstmt_tDBOutput_3");
			
        }
    resourceMap.put("statementClosed_tDBOutput_3", true);

	
	nb_line_deleted_tDBOutput_3=nb_line_deleted_tDBOutput_3+ deletedCount_tDBOutput_3;
	nb_line_update_tDBOutput_3=nb_line_update_tDBOutput_3 + updatedCount_tDBOutput_3;
	nb_line_inserted_tDBOutput_3=nb_line_inserted_tDBOutput_3 + insertedCount_tDBOutput_3;
	nb_line_rejected_tDBOutput_3=nb_line_rejected_tDBOutput_3 + rejectedCount_tDBOutput_3;
	
        globalMap.put("tDBOutput_3_NB_LINE",nb_line_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_UPDATED",nb_line_update_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_DELETED",nb_line_deleted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_3);
    

	



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row6",2,0,
			 			"tDBInput_6","ORACLE_GOLD","tOracleInput","tDBOutput_3","tDBOutput_3","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Done.") );

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());




/**
 * [tDBOutput_3 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_6 finally ] stop
 */

	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	



    if (resourceMap.get("statementClosed_tDBOutput_3") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_3 = null;
                if ((pstmtToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_3")) != null) {
                    pstmtToClose_tDBOutput_3.close();
                }
    }
 



/**
 * [tDBOutput_3 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];

	
			    public Long CODE_ENSEIGNE;

				public Long getCODE_ENSEIGNE () {
					return this.CODE_ENSEIGNE;
				}

				public Boolean CODE_ENSEIGNEIsNullable(){
				    return true;
				}
				public Boolean CODE_ENSEIGNEIsKey(){
				    return false;
				}
				public Integer CODE_ENSEIGNELength(){
				    return null;
				}
				public Integer CODE_ENSEIGNEPrecision(){
				    return null;
				}
				public String CODE_ENSEIGNEDefault(){
				
					return null;
				
				}
				public String CODE_ENSEIGNEComment(){
				
				    return "";
				
				}
				public String CODE_ENSEIGNEPattern(){
				
					return "";
				
				}
				public String CODE_ENSEIGNEOriginalDbColumnName(){
				
					return "CODE_ENSEIGNE";
				
				}

				
			    public Long CODE_INTERNE_ARTICLE;

				public Long getCODE_INTERNE_ARTICLE () {
					return this.CODE_INTERNE_ARTICLE;
				}

				public Boolean CODE_INTERNE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_INTERNE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_INTERNE_ARTICLELength(){
				    return null;
				}
				public Integer CODE_INTERNE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_INTERNE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_INTERNE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_INTERNE_ARTICLEPattern(){
				
					return "";
				
				}
				public String CODE_INTERNE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_INTERNE_ARTICLE";
				
				}

				
			    public Long CODE_ARTICLE;

				public Long getCODE_ARTICLE () {
					return this.CODE_ARTICLE;
				}

				public Boolean CODE_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean CODE_ARTICLEIsKey(){
				    return false;
				}
				public Integer CODE_ARTICLELength(){
				    return null;
				}
				public Integer CODE_ARTICLEPrecision(){
				    return null;
				}
				public String CODE_ARTICLEDefault(){
				
					return null;
				
				}
				public String CODE_ARTICLEComment(){
				
				    return "";
				
				}
				public String CODE_ARTICLEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_ARTICLEOriginalDbColumnName(){
				
					return "CODE_ARTICLE";
				
				}

				
			    public Long CODE_SITE;

				public Long getCODE_SITE () {
					return this.CODE_SITE;
				}

				public Boolean CODE_SITEIsNullable(){
				    return true;
				}
				public Boolean CODE_SITEIsKey(){
				    return false;
				}
				public Integer CODE_SITELength(){
				    return null;
				}
				public Integer CODE_SITEPrecision(){
				    return null;
				}
				public String CODE_SITEDefault(){
				
					return null;
				
				}
				public String CODE_SITEComment(){
				
				    return "";
				
				}
				public String CODE_SITEPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String CODE_SITEOriginalDbColumnName(){
				
					return "CODE_SITE";
				
				}

				
			    public String LIB_ARTICLE;

				public String getLIB_ARTICLE () {
					return this.LIB_ARTICLE;
				}

				public Boolean LIB_ARTICLEIsNullable(){
				    return true;
				}
				public Boolean LIB_ARTICLEIsKey(){
				    return false;
				}
				public Integer LIB_ARTICLELength(){
				    return null;
				}
				public Integer LIB_ARTICLEPrecision(){
				    return null;
				}
				public String LIB_ARTICLEDefault(){
				
					return null;
				
				}
				public String LIB_ARTICLEComment(){
				
				    return "";
				
				}
				public String LIB_ARTICLEPattern(){
				
					return "";
				
				}
				public String LIB_ARTICLEOriginalDbColumnName(){
				
					return "LIB_ARTICLE";
				
				}

				
			    public Long EAN;

				public Long getEAN () {
					return this.EAN;
				}

				public Boolean EANIsNullable(){
				    return true;
				}
				public Boolean EANIsKey(){
				    return false;
				}
				public Integer EANLength(){
				    return null;
				}
				public Integer EANPrecision(){
				    return null;
				}
				public String EANDefault(){
				
					return null;
				
				}
				public String EANComment(){
				
				    return "";
				
				}
				public String EANPattern(){
				
					return "";
				
				}
				public String EANOriginalDbColumnName(){
				
					return "EAN";
				
				}

				
			    public BigDecimal VALO_STOCK;

				public BigDecimal getVALO_STOCK () {
					return this.VALO_STOCK;
				}

				public Boolean VALO_STOCKIsNullable(){
				    return true;
				}
				public Boolean VALO_STOCKIsKey(){
				    return false;
				}
				public Integer VALO_STOCKLength(){
				    return 16;
				}
				public Integer VALO_STOCKPrecision(){
				    return 4;
				}
				public String VALO_STOCKDefault(){
				
					return null;
				
				}
				public String VALO_STOCKComment(){
				
				    return "";
				
				}
				public String VALO_STOCKPattern(){
				
					return "";
				
				}
				public String VALO_STOCKOriginalDbColumnName(){
				
					return "VALO_STOCK";
				
				}

				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}

				public Boolean QTE_STOCKIsNullable(){
				    return true;
				}
				public Boolean QTE_STOCKIsKey(){
				    return false;
				}
				public Integer QTE_STOCKLength(){
				    return 16;
				}
				public Integer QTE_STOCKPrecision(){
				    return 4;
				}
				public String QTE_STOCKDefault(){
				
					return null;
				
				}
				public String QTE_STOCKComment(){
				
				    return "";
				
				}
				public String QTE_STOCKPattern(){
				
					return "";
				
				}
				public String QTE_STOCKOriginalDbColumnName(){
				
					return "QTE_STOCK";
				
				}

				
			    public java.util.Date DATE_STOCK;

				public java.util.Date getDATE_STOCK () {
					return this.DATE_STOCK;
				}

				public Boolean DATE_STOCKIsNullable(){
				    return true;
				}
				public Boolean DATE_STOCKIsKey(){
				    return false;
				}
				public Integer DATE_STOCKLength(){
				    return null;
				}
				public Integer DATE_STOCKPrecision(){
				    return null;
				}
				public String DATE_STOCKDefault(){
				
					return null;
				
				}
				public String DATE_STOCKComment(){
				
				    return "";
				
				}
				public String DATE_STOCKPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String DATE_STOCKOriginalDbColumnName(){
				
					return "DATE_STOCK";
				
				}

				
			    public java.util.Date LAST_MAJ_DATE;

				public java.util.Date getLAST_MAJ_DATE () {
					return this.LAST_MAJ_DATE;
				}

				public Boolean LAST_MAJ_DATEIsNullable(){
				    return true;
				}
				public Boolean LAST_MAJ_DATEIsKey(){
				    return false;
				}
				public Integer LAST_MAJ_DATELength(){
				    return null;
				}
				public Integer LAST_MAJ_DATEPrecision(){
				    return null;
				}
				public String LAST_MAJ_DATEDefault(){
				
					return null;
				
				}
				public String LAST_MAJ_DATEComment(){
				
				    return "";
				
				}
				public String LAST_MAJ_DATEPattern(){
				
					return "yyyy-MM-dd Hh24:mm:ss";
				
				}
				public String LAST_MAJ_DATEOriginalDbColumnName(){
				
					return "LAST_MAJ_DATE";
				
				}

				
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return null;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ENSEIGNE = null;
           				} else {
           			    	this.CODE_ENSEIGNE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_INTERNE_ARTICLE = null;
           				} else {
           			    	this.CODE_INTERNE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_ARTICLE = null;
           				} else {
           			    	this.CODE_ARTICLE = dis.readLong();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CODE_SITE = null;
           				} else {
           			    	this.CODE_SITE = dis.readLong();
           				}
					
					this.LIB_ARTICLE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.EAN = null;
           				} else {
           			    	this.EAN = dis.readLong();
           				}
					
						this.VALO_STOCK = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
					this.DATE_STOCK = readDate(dis);
					
					this.LAST_MAJ_DATE = readDate(dis);
					
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Long
				
						if(this.CODE_ENSEIGNE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ENSEIGNE);
		            	}
					
					// Long
				
						if(this.CODE_INTERNE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_INTERNE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_ARTICLE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_ARTICLE);
		            	}
					
					// Long
				
						if(this.CODE_SITE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.CODE_SITE);
		            	}
					
					// String
				
						writeString(this.LIB_ARTICLE,dos);
					
					// Long
				
						if(this.EAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.EAN);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALO_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// java.util.Date
				
						writeDate(this.DATE_STOCK,dos);
					
					// java.util.Date
				
						writeDate(this.LAST_MAJ_DATE,dos);
					
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CODE_ENSEIGNE="+String.valueOf(CODE_ENSEIGNE));
		sb.append(",CODE_INTERNE_ARTICLE="+String.valueOf(CODE_INTERNE_ARTICLE));
		sb.append(",CODE_ARTICLE="+String.valueOf(CODE_ARTICLE));
		sb.append(",CODE_SITE="+String.valueOf(CODE_SITE));
		sb.append(",LIB_ARTICLE="+LIB_ARTICLE);
		sb.append(",EAN="+String.valueOf(EAN));
		sb.append(",VALO_STOCK="+String.valueOf(VALO_STOCK));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",DATE_STOCK="+String.valueOf(DATE_STOCK));
		sb.append(",LAST_MAJ_DATE="+String.valueOf(LAST_MAJ_DATE));
		sb.append(",FOUCIN="+String.valueOf(FOUCIN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CODE_ENSEIGNE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ENSEIGNE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_INTERNE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_INTERNE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(EAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN);
            			}
            		
        			sb.append("|");
        		
        				if(VALO_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALO_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_MAJ_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_MAJ_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

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
public void tDBInput_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_7_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row5Struct row5 = new row5Struct();




	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
		int tos_count_tDBOutput_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_4 = new StringBuilder();
                    log4jParamters_tDBOutput_4.append("Parameters:");
                            log4jParamters_tDBOutput_4.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TABLE" + " = " + "\"ODS_STOCK_HEBDO_TT\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + (log4jParamters_tDBOutput_4) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_4", "tDBOutput_4", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_4 = 0;
    int nb_line_update_tDBOutput_4 = 0;
    int nb_line_inserted_tDBOutput_4 = 0;
    int nb_line_deleted_tDBOutput_4 = 0;
    int nb_line_rejected_tDBOutput_4 = 0;

    int tmp_batchUpdateCount_tDBOutput_4 = 0;

    int deletedCount_tDBOutput_4=0;
    int updatedCount_tDBOutput_4=0;
    int insertedCount_tDBOutput_4=0;
    int rowsToCommitCount_tDBOutput_4=0;
    int rejectedCount_tDBOutput_4=0;

    boolean whetherReject_tDBOutput_4 = false;

    java.sql.Connection conn_tDBOutput_4 = null;

    //optional table
    String dbschema_tDBOutput_4 = null;
    String tableName_tDBOutput_4 = null;
        dbschema_tDBOutput_4 = (String)globalMap.get("dbschema_tDBConnection_3");
		
        conn_tDBOutput_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_4.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_4.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_4.getAutoCommit())  + ("'.") );
        int count_tDBOutput_4=0;

        if(dbschema_tDBOutput_4 == null || dbschema_tDBOutput_4.trim().length() == 0) {
            tableName_tDBOutput_4 = ("ODS_STOCK_HEBDO_TT");
        } else {
            tableName_tDBOutput_4 = dbschema_tDBOutput_4 + "." + ("ODS_STOCK_HEBDO_TT");
        }
                String insert_tDBOutput_4 = "INSERT INTO " + tableName_tDBOutput_4 + " (CODE_ENSEIGNE,CODE_INTERNE_ARTICLE,CODE_ARTICLE,CODE_SITE,LIB_ARTICLE,EAN,VALO_STOCK,QTE_STOCK,DATE_STOCK,LAST_MAJ_DATE,FOUCIN) VALUES (?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(insert_tDBOutput_4);
                        resourceMap.put("pstmt_tDBOutput_4", pstmt_tDBOutput_4);





 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tDBInput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_7", false);
		start_Hash.put("tDBInput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_7";
	
	
			cLabel="ORACLE_GOLD";
		
		int tos_count_tDBInput_7 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_7 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_7{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_7 = new StringBuilder();
                    log4jParamters_tDBInput_7.append("Parameters:");
                            log4jParamters_tDBInput_7.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("QUERY" + " = " + "\"with vue_couche as   (SELECT STOSITE,           STOCINL,           SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,           SUM((NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV, 0) +               NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *               NVL(STOPURP, 0)) VALO_STOCK      FROM STOCOUCH     WHERE STOTPOS BETWEEN 0 AND 2     GROUP BY STOSITE, STOCINL),  vue_mvts as   (SELECT STMSITE,           STMCINL,           NVL(SUM(STMVAL), 0) QTE_MVTS,           NVL(SUM(STMMCRE), 0) VALO_MVTS      FROM STOMVT     WHERE STMTPOS BETWEEN 0 AND 2       AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)     GROUP BY STMSITE, STMCINL)  SELECT S.SOCCHAIN CODEENSEIGNE,         U.ARVCINR CODE_INTERNE_ARTICLE,         U.ARVCEXR CODE_ARTICLE,         S.SOCSITE CODESITE,         REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\\\\\"\\\\\\\"', '') LIBARTICLE,         PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) EAN,         vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,         vue_couche.QTE_STOCK - NVL(QTE_MVTS, 0) QTE_STOCK,         TRUNC(SYSDATE, 'IW') DATE_STOCK,         TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') DATELASTUPDATEWEBJOB,          F.FCLCFIN FOUCIN    FROM SITDGENE   S,         CLIDGENE   C,         SITCLIREL  L,         ARTUV      U,         vue_couche,         vue_mvts,         FOUCATALOG F,         ARTRAC     A   WHERE vue_couche.STOSITE = S.SOCSITE     AND vue_couche.STOCINL = U.ARVCINV     AND U.ARVCINR = A.ARTCINR     AND A.ARTETAT IN (1, 5)     AND S.SOCCHAIN = 8     AND S.SOCSITE = L.SCLSITE     AND C.CLINCLI = L.SCLNCLI     AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND L.SCLDFIN     AND C.CLISTAT = 1     AND F.FCLCINV = U.ARVCINV     AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN     AND vue_couche.QTE_STOCK > 0     AND vue_couche.STOSITE = vue_mvts.STMSITE(+)     AND vue_couche.STOCINL = vue_mvts.STMCINL(+) and rownum<1000\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("USE_CURSOR" + " = " + "true");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("CURSOR_SIZE" + " = " + "1000");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("TRIM_ALL_COLUMN" + " = " + "true");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_7.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_7 - "  + (log4jParamters_tDBInput_7) );
                    } 
                } 
            new BytesLimit65535_tDBInput_7().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_7", "ORACLE_GOLD", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_7 = 0;
		    java.sql.Connection conn_tDBInput_7 = null;
				conn_tDBInput_7 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
				if(conn_tDBInput_7 != null) {
					if(conn_tDBInput_7.getMetaData() != null) {
						
							log.debug("tDBInput_7 - Uses an existing connection with username '" + conn_tDBInput_7.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_7.getMetaData().getURL() + ".");
						
					}
				}
			
                boolean isTimeZoneNull_tDBInput_7 = false;
				boolean isConnectionWrapped_tDBInput_7 = !(conn_tDBInput_7 instanceof oracle.jdbc.OracleConnection) && conn_tDBInput_7.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_7 = null;
                if (isConnectionWrapped_tDBInput_7) {
					unwrappedOraConn_tDBInput_7 = conn_tDBInput_7.unwrap(oracle.jdbc.OracleConnection.class);
                    if (unwrappedOraConn_tDBInput_7 != null) {
                        isTimeZoneNull_tDBInput_7 = (unwrappedOraConn_tDBInput_7.getSessionTimeZone() == null);
                    }
                } else {
                    isTimeZoneNull_tDBInput_7 = (((oracle.jdbc.OracleConnection)conn_tDBInput_7).getSessionTimeZone() == null);
                }

				if(isTimeZoneNull_tDBInput_7) {
					java.sql.Statement stmtGetTZ_tDBInput_7 = conn_tDBInput_7.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_7 = stmtGetTZ_tDBInput_7.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_7 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_7.next()) {
						sessionTimezone_tDBInput_7 = rsGetTZ_tDBInput_7.getString(1);
					}
					if (isConnectionWrapped_tDBInput_7 && unwrappedOraConn_tDBInput_7 != null) {
                        unwrappedOraConn_tDBInput_7.setSessionTimeZone(sessionTimezone_tDBInput_7);
                    } else {
                        ((oracle.jdbc.OracleConnection)conn_tDBInput_7).setSessionTimeZone(sessionTimezone_tDBInput_7);
                    }
				}
			
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
																					java.sql.ResultSet.CONCUR_READ_ONLY);
			
                stmt_tDBInput_7.setFetchSize(1000);


		    String dbquery_tDBInput_7 = "with vue_couche as\n (SELECT STOSITE,\n         STOCINL,\n         SUM(NVL(STOVALI, 0) + NVL(STOVALL, 0) - NVL(STOVALV,"
+" 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) QTE_STOCK,\n         SUM((NVL(STOVALI, 0) + NVL"
+"(STOVALL, 0) - NVL(STOVALV, 0) +\n             NVL(STOVALE, 0) + NVL(STOVALC, 0) - NVL(STOVALR, 0)) *\n             NVL("
+"STOPURP, 0)) VALO_STOCK\n    FROM STOCOUCH\n   WHERE STOTPOS BETWEEN 0 AND 2\n   GROUP BY STOSITE, STOCINL),\nvue_mvts a"
+"s\n (SELECT STMSITE,\n         STMCINL,\n         NVL(SUM(STMVAL), 0) QTE_MVTS,\n         NVL(SUM(STMMCRE), 0) VALO_MVTS"
+"\n    FROM STOMVT\n   WHERE STMTPOS BETWEEN 0 AND 2\n     AND TRUNC(STMDMVT) >= TRUNC(SYSDATE)\n   GROUP BY STMSITE, STM"
+"CINL)\nSELECT S.SOCCHAIN CODEENSEIGNE,\n       U.ARVCINR CODE_INTERNE_ARTICLE,\n       U.ARVCEXR CODE_ARTICLE,\n       S"
+".SOCSITE CODESITE,\n       REPLACE(PKSTRUCOBJ.GET_DESC(ARVCINR, 'FR'), '\\\"\\\"', '') LIBARTICLE,\n       PKARTCOCA.GET"
+"_CLOSESTEAN(U.ARVCINV) EAN,\n       vue_couche.VALO_STOCK - NVL(VALO_MVTS, 0) VALO_STOCK,\n       vue_couche.QTE_STOCK -"
+" NVL(QTE_MVTS, 0) QTE_STOCK,\n       TRUNC(SYSDATE, 'IW') DATE_STOCK,\n       TO_CHAR(SYSDATE, 'yyyy-MM-dd Hh24:mm:ss') "
+"DATELASTUPDATEWEBJOB,\n        F.FCLCFIN FOUCIN\n  FROM SITDGENE   S,\n       CLIDGENE   C,\n       SITCLIREL  L,\n     "
+"  ARTUV      U,\n       vue_couche,\n       vue_mvts,\n       FOUCATALOG F,\n       ARTRAC     A\n WHERE vue_couche.STOS"
+"ITE = S.SOCSITE\n   AND vue_couche.STOCINL = U.ARVCINV\n   AND U.ARVCINR = A.ARTCINR\n   AND A.ARTETAT IN (1, 5)\n   AND"
+" S.SOCCHAIN = 8\n   AND S.SOCSITE = L.SCLSITE\n   AND C.CLINCLI = L.SCLNCLI\n   AND TRUNC(SYSDATE) BETWEEN L.SCLDDEB AND"
+" L.SCLDFIN\n   AND C.CLISTAT = 1\n   AND F.FCLCINV = U.ARVCINV\n   AND TRUNC(SYSDATE) BETWEEN F.FCLDDEB AND F.FCLDFIN\n "
+"  AND vue_couche.QTE_STOCK > 0\n   AND vue_couche.STOSITE = vue_mvts.STMSITE(+)\n   AND vue_couche.STOCINL = vue_mvts.ST"
+"MCINL(+) and rownum<1000";
		    
	    		log.debug("tDBInput_7 - Executing the query: '" + dbquery_tDBInput_7 + "'.");
			

            	globalMap.put("tDBInput_7_QUERY",dbquery_tDBInput_7);
		    java.sql.ResultSet rs_tDBInput_7 = null;

		    try {
		    	rs_tDBInput_7 = stmt_tDBInput_7.executeQuery(dbquery_tDBInput_7);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_7 = rs_tDBInput_7.getMetaData();
		    	int colQtyInRs_tDBInput_7 = rsmd_tDBInput_7.getColumnCount();

		    String tmpContent_tDBInput_7 = null;
		    
		    
		    	log.debug("tDBInput_7 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_7.next()) {
		        nb_line_tDBInput_7++;
		        
							if(colQtyInRs_tDBInput_7 < 1) {
								row5.CODE_ENSEIGNE = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(1) != null) {
						row5.CODE_ENSEIGNE = rs_tDBInput_7.getLong(1);
					} else {
				
						row5.CODE_ENSEIGNE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								row5.CODE_INTERNE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(2) != null) {
						row5.CODE_INTERNE_ARTICLE = rs_tDBInput_7.getLong(2);
					} else {
				
						row5.CODE_INTERNE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 3) {
								row5.CODE_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(3) != null) {
						row5.CODE_ARTICLE = rs_tDBInput_7.getLong(3);
					} else {
				
						row5.CODE_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 4) {
								row5.CODE_SITE = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(4) != null) {
						row5.CODE_SITE = rs_tDBInput_7.getLong(4);
					} else {
				
						row5.CODE_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 5) {
								row5.LIB_ARTICLE = null;
							} else {
	                         		
        	row5.LIB_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_7, 5, true);
		                    }
							if(colQtyInRs_tDBInput_7 < 6) {
								row5.EAN = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(6) != null) {
						row5.EAN = rs_tDBInput_7.getLong(6);
					} else {
				
						row5.EAN = null;
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 7) {
								row5.VALO_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(7) != null) {
						row5.VALO_STOCK = rs_tDBInput_7.getBigDecimal(7);
					} else {
				
						row5.VALO_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 8) {
								row5.QTE_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(8) != null) {
						row5.QTE_STOCK = rs_tDBInput_7.getBigDecimal(8);
					} else {
				
						row5.QTE_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 9) {
								row5.DATE_STOCK = null;
							} else {
										
			row5.DATE_STOCK = routines.system.JDBCUtil.getDate(rs_tDBInput_7, 9);
		                    }
							if(colQtyInRs_tDBInput_7 < 10) {
								row5.LAST_MAJ_DATE = null;
							} else {
										
			row5.LAST_MAJ_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_7, 10);
		                    }
							if(colQtyInRs_tDBInput_7 < 11) {
								row5.FOUCIN = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(11) != null) {
						row5.FOUCIN = rs_tDBInput_7.getInt(11);
					} else {
				
						row5.FOUCIN = null;
					}
		                    }
					
						log.debug("tDBInput_7 - Retrieving the record " + nb_line_tDBInput_7 + ".");
					




 



/**
 * [tDBInput_7 begin ] stop
 */
	
	/**
	 * [tDBInput_7 main ] start
	 */

	

	
	
	currentComponent="tDBInput_7";
	
	
			cLabel="ORACLE_GOLD";
		

 


	tos_count_tDBInput_7++;

/**
 * [tDBInput_7 main ] stop
 */
	
	/**
	 * [tDBInput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_7";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_7 process_data_begin ] stop
 */

	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tDBInput_7","ORACLE_GOLD","tOracleInput","tDBOutput_4","tDBOutput_4","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		



        whetherReject_tDBOutput_4 = false;
                        if(row5.CODE_ENSEIGNE == null) {
pstmt_tDBOutput_4.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_4.setLong(1, row5.CODE_ENSEIGNE);
}

                        if(row5.CODE_INTERNE_ARTICLE == null) {
pstmt_tDBOutput_4.setNull(2, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_4.setLong(2, row5.CODE_INTERNE_ARTICLE);
}

                        if(row5.CODE_ARTICLE == null) {
pstmt_tDBOutput_4.setNull(3, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_4.setLong(3, row5.CODE_ARTICLE);
}

                        if(row5.CODE_SITE == null) {
pstmt_tDBOutput_4.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_4.setLong(4, row5.CODE_SITE);
}

                        if(row5.LIB_ARTICLE == null) {
pstmt_tDBOutput_4.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(5, row5.LIB_ARTICLE);
}

                        if(row5.EAN == null) {
pstmt_tDBOutput_4.setNull(6, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_4.setLong(6, row5.EAN);
}

                        pstmt_tDBOutput_4.setBigDecimal(7, row5.VALO_STOCK);

                        pstmt_tDBOutput_4.setBigDecimal(8, row5.QTE_STOCK);

                        if(row5.DATE_STOCK != null) {
pstmt_tDBOutput_4.setObject(9, new java.sql.Timestamp(row5.DATE_STOCK.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_4.setNull(9, java.sql.Types.DATE);
}

                        if(row5.LAST_MAJ_DATE != null) {
pstmt_tDBOutput_4.setObject(10, new java.sql.Timestamp(row5.LAST_MAJ_DATE.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_4.setNull(10, java.sql.Types.DATE);
}

                        if(row5.FOUCIN == null) {
pstmt_tDBOutput_4.setNull(11, java.sql.Types.INTEGER);
} else {pstmt_tDBOutput_4.setInt(11, row5.FOUCIN);
}

                try {
                    nb_line_tDBOutput_4++;
                    int processedCount_tDBOutput_4 = pstmt_tDBOutput_4.executeUpdate();
                    insertedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_4)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_4) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e_tDBOutput_4.getMessage());
                    whetherReject_tDBOutput_4 = true;
            log.error("tDBOutput_4 - "  + (e_tDBOutput_4.getMessage()) );
                            System.err.print(e_tDBOutput_4.getMessage());
                }

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	

 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	

 



/**
 * [tDBOutput_4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_7 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_7 end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";
	
	
			cLabel="ORACLE_GOLD";
		

}
}finally{
	if (rs_tDBInput_7 != null) {
		rs_tDBInput_7.close();
	}
	if (stmt_tDBInput_7 != null) {
		stmt_tDBInput_7.close();
	}
}

globalMap.put("tDBInput_7_NB_LINE",nb_line_tDBInput_7);
	    		log.debug("tDBInput_7 - Retrieved records count: "+nb_line_tDBInput_7 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_7 - "  + ("Done.") );

ok_Hash.put("tDBInput_7", true);
end_Hash.put("tDBInput_7", System.currentTimeMillis());




/**
 * [tDBInput_7 end ] stop
 */

	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
	



	
        if(pstmt_tDBOutput_4 != null) {
			
				pstmt_tDBOutput_4.close();
				resourceMap.remove("pstmt_tDBOutput_4");
			
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);

	
	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tDBInput_7","ORACLE_GOLD","tOracleInput","tDBOutput_4","tDBOutput_4","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Done.") );

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());




/**
 * [tDBOutput_4 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_7";
	
	
			cLabel="ORACLE_GOLD";
		

 



/**
 * [tDBInput_7 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	



    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_4 = null;
                if ((pstmtToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_4")) != null) {
                    pstmtToClose_tDBOutput_4.close();
                }
    }
 



/**
 * [tDBOutput_4 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_7_SUBPROCESS_STATE", 1);
	}
	


public static class row11Struct implements routines.system.IPersistableComparableLookupRow<row11Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer FOUCIN;

				public Integer getFOUCIN () {
					return this.FOUCIN;
				}

				public Boolean FOUCINIsNullable(){
				    return true;
				}
				public Boolean FOUCINIsKey(){
				    return false;
				}
				public Integer FOUCINLength(){
				    return null;
				}
				public Integer FOUCINPrecision(){
				    return null;
				}
				public String FOUCINDefault(){
				
					return null;
				
				}
				public String FOUCINComment(){
				
				    return "";
				
				}
				public String FOUCINPattern(){
				
					return "";
				
				}
				public String FOUCINOriginalDbColumnName(){
				
					return "FOUCIN";
				
				}

				
			    public String LIBFRS;

				public String getLIBFRS () {
					return this.LIBFRS;
				}

				public Boolean LIBFRSIsNullable(){
				    return true;
				}
				public Boolean LIBFRSIsKey(){
				    return false;
				}
				public Integer LIBFRSLength(){
				    return null;
				}
				public Integer LIBFRSPrecision(){
				    return null;
				}
				public String LIBFRSDefault(){
				
					return null;
				
				}
				public String LIBFRSComment(){
				
				    return "";
				
				}
				public String LIBFRSPattern(){
				
					return "";
				
				}
				public String LIBFRSOriginalDbColumnName(){
				
					return "LIBFRS";
				
				}

				
			    public String FOUCNUF;

				public String getFOUCNUF () {
					return this.FOUCNUF;
				}

				public Boolean FOUCNUFIsNullable(){
				    return true;
				}
				public Boolean FOUCNUFIsKey(){
				    return false;
				}
				public Integer FOUCNUFLength(){
				    return null;
				}
				public Integer FOUCNUFPrecision(){
				    return null;
				}
				public String FOUCNUFDefault(){
				
					return null;
				
				}
				public String FOUCNUFComment(){
				
				    return "";
				
				}
				public String FOUCNUFPattern(){
				
					return "";
				
				}
				public String FOUCNUFOriginalDbColumnName(){
				
					return "FOUCNUF";
				
				}

				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.FOUCIN == null) ? 0 : this.FOUCIN.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row11Struct other = (row11Struct) obj;
		
						if (this.FOUCIN == null) {
							if (other.FOUCIN != null)
								return false;
						
						} else if (!this.FOUCIN.equals(other.FOUCIN))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row11Struct other) {

		other.FOUCIN = this.FOUCIN;
	            other.LIBFRS = this.LIBFRS;
	            other.FOUCNUF = this.FOUCNUF;
	            
	}

	public void copyKeysDataTo(row11Struct other) {

		other.FOUCIN = this.FOUCIN;
	            	
	}



	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCIN,dos);
					
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
		
						this.LIBFRS = readString(dis,ois);
					
						this.FOUCNUF = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.LIBFRS = readString(dis,objectIn);
					
						this.FOUCNUF = readString(dis,objectIn);
					
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
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.LIBFRS, dos, objectOut);
					
						writeString(this.FOUCNUF, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCIN="+String.valueOf(FOUCIN));
		sb.append(",LIBFRS="+LIBFRS);
		sb.append(",FOUCNUF="+FOUCNUF);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCIN);
            			}
            		
        			sb.append("|");
        		
        				if(LIBFRS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBFRS);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCNUF);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row11Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.FOUCIN, other.FOUCIN);
						if(returnValue != 0) {
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row11Struct row11 = new row11Struct();




	
	/**
	 * [tAdvancedHash_row11 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row11", false);
		start_Hash.put("tAdvancedHash_row11", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row11";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row11");
			
		int tos_count_tAdvancedHash_row11 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row11", "tAdvancedHash_row11", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row11
			   		// source node:tHashInput_1 - inputs:(after_tDBInput_2) outputs:(row11,row11) | target node:tAdvancedHash_row11 - inputs:(row11) outputs:()
			   		// linked node: tMap_2 - inputs:(row7,row11) outputs:(out1,fouci)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row11 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.ALL_MATCHES;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct> tHash_Lookup_row11 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row11Struct>getLookup(matchingModeEnum_row11);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row11", tHash_Lookup_row11);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row11 begin ] stop
 */



	
	/**
	 * [tHashInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashInput_1", false);
		start_Hash.put("tHashInput_1", System.currentTimeMillis());
		
	
	currentComponent="tHashInput_1";
	
	
			cLabel="FOURNISSEUR";
		
		int tos_count_tHashInput_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tHashInput_1", "FOURNISSEUR", "tHashInput");
				talendJobLogProcess(globalMap);
			}
			


int nb_line_tHashInput_1 = 0;
	
org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_1=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();
org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row3Struct> tHashFile_tHashInput_1 = mf_tHashInput_1.getAdvancedMemoryHashFile("tHashFile_JOB_STOCK_HEBDO_" + pid +"_tHashOutput_1");
if(tHashFile_tHashInput_1==null) {
	throw new RuntimeException("The hash is not initialized : The hash must exist before you read from it");
}
java.util.Iterator<row3Struct> iterator_tHashInput_1 = tHashFile_tHashInput_1.iterator();
while (iterator_tHashInput_1.hasNext()) {
    row3Struct next_tHashInput_1 = iterator_tHashInput_1.next();

	row11.FOUCIN = next_tHashInput_1.FOUCFIN;
	row11.LIBFRS = next_tHashInput_1.LIBFRS;
	row11.FOUCNUF = next_tHashInput_1.FOUCNUF;

 



/**
 * [tHashInput_1 begin ] stop
 */
	
	/**
	 * [tHashInput_1 main ] start
	 */

	

	
	
	currentComponent="tHashInput_1";
	
	
			cLabel="FOURNISSEUR";
		

 


	tos_count_tHashInput_1++;

/**
 * [tHashInput_1 main ] stop
 */
	
	/**
	 * [tHashInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashInput_1";
	
	
			cLabel="FOURNISSEUR";
		

 



/**
 * [tHashInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row11","tHashInput_1","FOURNISSEUR","tHashInput","tAdvancedHash_row11","tAdvancedHash_row11","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row11 - " + (row11==null? "": row11.toLogString()));
    			}
    		


			   
			   

					row11Struct row11_HashRow = new row11Struct();
		   	   	   
				
				row11_HashRow.FOUCIN = row11.FOUCIN;
				
				row11_HashRow.LIBFRS = row11.LIBFRS;
				
				row11_HashRow.FOUCNUF = row11.FOUCNUF;
				
			tHash_Lookup_row11.put(row11_HashRow);
			
            




 


	tos_count_tAdvancedHash_row11++;

/**
 * [tAdvancedHash_row11 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row11 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";
	
	

 



/**
 * [tAdvancedHash_row11 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row11 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";
	
	

 



/**
 * [tAdvancedHash_row11 process_data_end ] stop
 */



	
	/**
	 * [tHashInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashInput_1";
	
	
			cLabel="FOURNISSEUR";
		

 



/**
 * [tHashInput_1 process_data_end ] stop
 */
	
	/**
	 * [tHashInput_1 end ] start
	 */

	

	
	
	currentComponent="tHashInput_1";
	
	
			cLabel="FOURNISSEUR";
		
    

		
			nb_line_tHashInput_1++;
		}	
    	
		org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.remove("tHashFile_JOB_STOCK_HEBDO_" + pid +"_tHashOutput_1");
	


	globalMap.put("tHashInput_1_NB_LINE", nb_line_tHashInput_1);       

 

ok_Hash.put("tHashInput_1", true);
end_Hash.put("tHashInput_1", System.currentTimeMillis());




/**
 * [tHashInput_1 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";
	
	

tHash_Lookup_row11.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row11",2,0,
			 			"tHashInput_1","FOURNISSEUR","tHashInput","tAdvancedHash_row11","tAdvancedHash_row11","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row11", true);
end_Hash.put("tAdvancedHash_row11", System.currentTimeMillis());




/**
 * [tAdvancedHash_row11 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tHashInput_1 finally ] start
	 */

	

	
	
	currentComponent="tHashInput_1";
	
	
			cLabel="FOURNISSEUR";
		

 



/**
 * [tHashInput_1 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row11 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";
	
	

 



/**
 * [tAdvancedHash_row11 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tHashInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class row10Struct implements routines.system.IPersistableComparableLookupRow<row10Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer FOUCFIN;

				public Integer getFOUCFIN () {
					return this.FOUCFIN;
				}

				public Boolean FOUCFINIsNullable(){
				    return true;
				}
				public Boolean FOUCFINIsKey(){
				    return false;
				}
				public Integer FOUCFINLength(){
				    return null;
				}
				public Integer FOUCFINPrecision(){
				    return null;
				}
				public String FOUCFINDefault(){
				
					return null;
				
				}
				public String FOUCFINComment(){
				
				    return "";
				
				}
				public String FOUCFINPattern(){
				
					return "";
				
				}
				public String FOUCFINOriginalDbColumnName(){
				
					return "FOUCFIN";
				
				}

				
			    public String LIBFRS;

				public String getLIBFRS () {
					return this.LIBFRS;
				}

				public Boolean LIBFRSIsNullable(){
				    return true;
				}
				public Boolean LIBFRSIsKey(){
				    return false;
				}
				public Integer LIBFRSLength(){
				    return null;
				}
				public Integer LIBFRSPrecision(){
				    return null;
				}
				public String LIBFRSDefault(){
				
					return null;
				
				}
				public String LIBFRSComment(){
				
				    return "";
				
				}
				public String LIBFRSPattern(){
				
					return "";
				
				}
				public String LIBFRSOriginalDbColumnName(){
				
					return "LIBFRS";
				
				}

				
			    public String FOUCNUF;

				public String getFOUCNUF () {
					return this.FOUCNUF;
				}

				public Boolean FOUCNUFIsNullable(){
				    return true;
				}
				public Boolean FOUCNUFIsKey(){
				    return false;
				}
				public Integer FOUCNUFLength(){
				    return null;
				}
				public Integer FOUCNUFPrecision(){
				    return null;
				}
				public String FOUCNUFDefault(){
				
					return null;
				
				}
				public String FOUCNUFComment(){
				
				    return "";
				
				}
				public String FOUCNUFPattern(){
				
					return "";
				
				}
				public String FOUCNUFOriginalDbColumnName(){
				
					return "FOUCNUF";
				
				}

				
			    public Integer COUNTFRN;

				public Integer getCOUNTFRN () {
					return this.COUNTFRN;
				}

				public Boolean COUNTFRNIsNullable(){
				    return true;
				}
				public Boolean COUNTFRNIsKey(){
				    return false;
				}
				public Integer COUNTFRNLength(){
				    return null;
				}
				public Integer COUNTFRNPrecision(){
				    return null;
				}
				public String COUNTFRNDefault(){
				
					return null;
				
				}
				public String COUNTFRNComment(){
				
				    return "";
				
				}
				public String COUNTFRNPattern(){
				
					return "";
				
				}
				public String COUNTFRNOriginalDbColumnName(){
				
					return "COUNTFRN";
				
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
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row10Struct other = (row10Struct) obj;
		
						if (this.FOUCFIN == null) {
							if (other.FOUCFIN != null)
								return false;
						
						} else if (!this.FOUCFIN.equals(other.FOUCFIN))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row10Struct other) {

		other.FOUCFIN = this.FOUCFIN;
	            other.LIBFRS = this.LIBFRS;
	            other.FOUCNUF = this.FOUCNUF;
	            other.COUNTFRN = this.COUNTFRN;
	            
	}

	public void copyKeysDataTo(row10Struct other) {

		other.FOUCFIN = this.FOUCFIN;
	            	
	}



	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}
	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

        	try {

        		int length = 0;
		
						this.FOUCFIN = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_JOB_STOCK_HEBDO) {

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
				
						writeInteger(this.FOUCFIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Integer
				
						writeInteger(this.FOUCFIN,dos);
					
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
		
						this.LIBFRS = readString(dis,ois);
					
						this.FOUCNUF = readString(dis,ois);
					
						this.COUNTFRN = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.LIBFRS = readString(dis,objectIn);
					
						this.FOUCNUF = readString(dis,objectIn);
					
						this.COUNTFRN = readInteger(dis,objectIn);
					
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
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.LIBFRS, dos, objectOut);
					
						writeString(this.FOUCNUF, dos, objectOut);
					
					writeInteger(this.COUNTFRN, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("FOUCFIN="+String.valueOf(FOUCFIN));
		sb.append(",LIBFRS="+LIBFRS);
		sb.append(",FOUCNUF="+FOUCNUF);
		sb.append(",COUNTFRN="+String.valueOf(COUNTFRN));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(FOUCFIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCFIN);
            			}
            		
        			sb.append("|");
        		
        				if(LIBFRS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBFRS);
            			}
            		
        			sb.append("|");
        		
        				if(FOUCNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOUCNUF);
            			}
            		
        			sb.append("|");
        		
        				if(COUNTFRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COUNTFRN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row10Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.FOUCFIN, other.FOUCFIN);
						if(returnValue != 0) {
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row10Struct row10 = new row10Struct();




	
	/**
	 * [tAdvancedHash_row10 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row10", false);
		start_Hash.put("tAdvancedHash_row10", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row10";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row10");
			
		int tos_count_tAdvancedHash_row10 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row10", "tAdvancedHash_row10", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row10
			   		// source node:tHashInput_3 - inputs:(after_tHashInput_2) outputs:(row10,row10) | target node:tAdvancedHash_row10 - inputs:(row10) outputs:()
			   		// linked node: tMap_3 - inputs:(row9,row10) outputs:(copyOfOUTFRN)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row10 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct> tHash_Lookup_row10 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row10Struct>getLookup(matchingModeEnum_row10);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row10", tHash_Lookup_row10);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row10 begin ] stop
 */



	
	/**
	 * [tHashInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tHashInput_3", false);
		start_Hash.put("tHashInput_3", System.currentTimeMillis());
		
	
	currentComponent="tHashInput_3";
	
	
			cLabel="COUNTFRN";
		
		int tos_count_tHashInput_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tHashInput_3", "COUNTFRN", "tHashInput");
				talendJobLogProcess(globalMap);
			}
			


int nb_line_tHashInput_3 = 0;
	
org.talend.designer.components.hashfile.common.MapHashFile mf_tHashInput_3=org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile();
org.talend.designer.components.hashfile.memory.AdvancedMemoryHashFile<row12Struct> tHashFile_tHashInput_3 = mf_tHashInput_3.getAdvancedMemoryHashFile("tHashFile_JOB_STOCK_HEBDO_" + pid +"_tHashOutput_2");
if(tHashFile_tHashInput_3==null) {
	throw new RuntimeException("The hash is not initialized : The hash must exist before you read from it");
}
java.util.Iterator<row12Struct> iterator_tHashInput_3 = tHashFile_tHashInput_3.iterator();
while (iterator_tHashInput_3.hasNext()) {
    row12Struct next_tHashInput_3 = iterator_tHashInput_3.next();

	row10.FOUCFIN = next_tHashInput_3.FOUCIN;
	row10.LIBFRS = next_tHashInput_3.NOM_FRNS;
	row10.FOUCNUF = next_tHashInput_3.CNUF;
	row10.COUNTFRN = next_tHashInput_3.CountFRN;

 



/**
 * [tHashInput_3 begin ] stop
 */
	
	/**
	 * [tHashInput_3 main ] start
	 */

	

	
	
	currentComponent="tHashInput_3";
	
	
			cLabel="COUNTFRN";
		

 


	tos_count_tHashInput_3++;

/**
 * [tHashInput_3 main ] stop
 */
	
	/**
	 * [tHashInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tHashInput_3";
	
	
			cLabel="COUNTFRN";
		

 



/**
 * [tHashInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row10 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row10","tHashInput_3","COUNTFRN","tHashInput","tAdvancedHash_row10","tAdvancedHash_row10","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row10 - " + (row10==null? "": row10.toLogString()));
    			}
    		


			   
			   

					row10Struct row10_HashRow = new row10Struct();
		   	   	   
				
				row10_HashRow.FOUCFIN = row10.FOUCFIN;
				
				row10_HashRow.LIBFRS = row10.LIBFRS;
				
				row10_HashRow.FOUCNUF = row10.FOUCNUF;
				
				row10_HashRow.COUNTFRN = row10.COUNTFRN;
				
			tHash_Lookup_row10.put(row10_HashRow);
			
            




 


	tos_count_tAdvancedHash_row10++;

/**
 * [tAdvancedHash_row10 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row10 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";
	
	

 



/**
 * [tAdvancedHash_row10 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row10 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";
	
	

 



/**
 * [tAdvancedHash_row10 process_data_end ] stop
 */



	
	/**
	 * [tHashInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tHashInput_3";
	
	
			cLabel="COUNTFRN";
		

 



/**
 * [tHashInput_3 process_data_end ] stop
 */
	
	/**
	 * [tHashInput_3 end ] start
	 */

	

	
	
	currentComponent="tHashInput_3";
	
	
			cLabel="COUNTFRN";
		
    

		
			nb_line_tHashInput_3++;
		}	
    	
		org.talend.designer.components.hashfile.common.MapHashFile.resourceLockMap.remove("tHashFile_JOB_STOCK_HEBDO_" + pid +"_tHashOutput_2");
	


	globalMap.put("tHashInput_3_NB_LINE", nb_line_tHashInput_3);       

 

ok_Hash.put("tHashInput_3", true);
end_Hash.put("tHashInput_3", System.currentTimeMillis());




/**
 * [tHashInput_3 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row10 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";
	
	

tHash_Lookup_row10.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row10",2,0,
			 			"tHashInput_3","COUNTFRN","tHashInput","tAdvancedHash_row10","tAdvancedHash_row10","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row10", true);
end_Hash.put("tAdvancedHash_row10", System.currentTimeMillis());




/**
 * [tAdvancedHash_row10 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tHashInput_3 finally ] start
	 */

	

	
	
	currentComponent="tHashInput_3";
	
	
			cLabel="COUNTFRN";
		

 



/**
 * [tHashInput_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row10 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";
	
	

 



/**
 * [tAdvancedHash_row10 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tHashInput_3_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";
	
	
		int tos_count_tPostjob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_1", "tPostjob_1", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk15", 0, "ok");
				}
				tDBClose_2Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBClose_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_2", false);
		start_Hash.put("tDBClose_2", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_2";
	
	
			cLabel="GOLD";
		
		int tos_count_tDBClose_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBClose_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBClose_2 = new StringBuilder();
                    log4jParamters_tDBClose_2.append("Parameters:");
                            log4jParamters_tDBClose_2.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBClose_2.append(" | ");
                            log4jParamters_tDBClose_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleClose");
                        log4jParamters_tDBClose_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + (log4jParamters_tDBClose_2) );
                    } 
                } 
            new BytesLimit65535_tDBClose_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_2", "GOLD", "tOracleClose");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBClose_2 begin ] stop
 */
	
	/**
	 * [tDBClose_2 main ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	
			cLabel="GOLD";
		

	java.sql.Connection conn_tDBClose_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
	
	if(conn_tDBClose_2 != null && !conn_tDBClose_2.isClosed())
	{
		
	    		log.debug("tDBClose_2 - Closing the connection 'tDBConnection_2' to the database.");
			
			conn_tDBClose_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_2"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
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

	

	
	
	currentComponent="tDBClose_2";
	
	
			cLabel="GOLD";
		

 



/**
 * [tDBClose_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	
			cLabel="GOLD";
		

 



/**
 * [tDBClose_2 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_2 end ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	
			cLabel="GOLD";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + ("Done.") );

ok_Hash.put("tDBClose_2", true);
end_Hash.put("tDBClose_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk18", 0, "ok");
				}
				tDBClose_3Process(globalMap);



/**
 * [tDBClose_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_2 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	
			cLabel="GOLD";
		

 



/**
 * [tDBClose_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBClose_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_3", false);
		start_Hash.put("tDBClose_3", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_3";
	
	
			cLabel="MSSERVER";
		
		int tos_count_tDBClose_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBClose_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBClose_3 = new StringBuilder();
                    log4jParamters_tDBClose_3.append("Parameters:");
                            log4jParamters_tDBClose_3.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBClose_3.append(" | ");
                            log4jParamters_tDBClose_3.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlClose");
                        log4jParamters_tDBClose_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + (log4jParamters_tDBClose_3) );
                    } 
                } 
            new BytesLimit65535_tDBClose_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_3", "MSSERVER", "tMSSqlClose");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBClose_3 begin ] stop
 */
	
	/**
	 * [tDBClose_3 main ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	
			cLabel="MSSERVER";
		



	java.sql.Connection conn_tDBClose_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBClose_3 != null && !conn_tDBClose_3.isClosed())
	{
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Closing the connection ")  + ("conn_tDBConnection_1")  + (" to the database.") );
        conn_tDBClose_3.close();
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Connection ")  + ("conn_tDBConnection_1")  + (" to the database has closed.") );
	}

 


	tos_count_tDBClose_3++;

/**
 * [tDBClose_3 main ] stop
 */
	
	/**
	 * [tDBClose_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	
			cLabel="MSSERVER";
		

 



/**
 * [tDBClose_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	
			cLabel="MSSERVER";
		

 



/**
 * [tDBClose_3 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_3 end ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	
			cLabel="MSSERVER";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Done.") );

ok_Hash.put("tDBClose_3", true);
end_Hash.put("tDBClose_3", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk19", 0, "ok");
				}
				tDBClose_4Process(globalMap);



/**
 * [tDBClose_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_3 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	
			cLabel="MSSERVER";
		

 



/**
 * [tDBClose_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBClose_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_4", false);
		start_Hash.put("tDBClose_4", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_4";
	
	
			cLabel="ODS";
		
		int tos_count_tDBClose_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBClose_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBClose_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBClose_4 = new StringBuilder();
                    log4jParamters_tDBClose_4.append("Parameters:");
                            log4jParamters_tDBClose_4.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBClose_4.append(" | ");
                            log4jParamters_tDBClose_4.append("UNIFIED_COMPONENTS" + " = " + "tOracleClose");
                        log4jParamters_tDBClose_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBClose_4 - "  + (log4jParamters_tDBClose_4) );
                    } 
                } 
            new BytesLimit65535_tDBClose_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_4", "ODS", "tOracleClose");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBClose_4 begin ] stop
 */
	
	/**
	 * [tDBClose_4 main ] start
	 */

	

	
	
	currentComponent="tDBClose_4";
	
	
			cLabel="ODS";
		

	java.sql.Connection conn_tDBClose_4 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
	
	if(conn_tDBClose_4 != null && !conn_tDBClose_4.isClosed())
	{
		
	    		log.debug("tDBClose_4 - Closing the connection 'tDBConnection_3' to the database.");
			
			conn_tDBClose_4.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_3"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
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

	

	
	
	currentComponent="tDBClose_4";
	
	
			cLabel="ODS";
		

 



/**
 * [tDBClose_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_4";
	
	
			cLabel="ODS";
		

 



/**
 * [tDBClose_4 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_4 end ] start
	 */

	

	
	
	currentComponent="tDBClose_4";
	
	
			cLabel="ODS";
		

 
                if(log.isDebugEnabled())
            log.debug("tDBClose_4 - "  + ("Done.") );

ok_Hash.put("tDBClose_4", true);
end_Hash.put("tDBClose_4", System.currentTimeMillis());




/**
 * [tDBClose_4 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_4 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_4";
	
	
			cLabel="ODS";
		

 



/**
 * [tDBClose_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_4_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";
	
	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBERROR) {
			java.lang.Exception e_talendJobLog = jcm.exception;
			if(e_talendJobLog!=null) {
				try(java.io.StringWriter sw_talendJobLog = new java.io.StringWriter();java.io.PrintWriter pw_talendJobLog = new java.io.PrintWriter(sw_talendJobLog)) {
					e_talendJobLog.printStackTrace(pw_talendJobLog);
					builder_talendJobLog.custom("stacktrace", sw_talendJobLog.getBuffer().substring(0,java.lang.Math.min(sw_talendJobLog.getBuffer().length(), 512)));
				}
			}

			if(jcm.extra_info!=null) {
				builder_talendJobLog.connectorId(jcm.component_id).custom("extra_info", jcm.extra_info);
			}
				
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_id.substring(0, jcm.component_id.lastIndexOf('_')))
				.connectorId(jcm.component_id)
				.connectorLabel(jcm.component_label == null ? jcm.component_id : jcm.component_label).build();

			auditLogger_talendJobLog.exception(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
    public String contextStr = "DEV";
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
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };

    private SyncInt runningThreadCount =new SyncInt();

    private class SyncInt
    {
        private int count = 0;
        public synchronized void add(int i)
        {
            count +=i;
        }

        public synchronized int getCount()
        {
            return count;
        }
    }

    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final JOB_STOCK_HEBDO JOB_STOCK_HEBDOClass = new JOB_STOCK_HEBDO();

        int exitCode = JOB_STOCK_HEBDOClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'JOB_STOCK_HEBDO' - Done.");
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

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
			}
			log.info("TalendJob: 'JOB_STOCK_HEBDO' - Start.");
		
		
		
			if(enableLogStash) {
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

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
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

        try {
            java.util.Dictionary<String, Object> jobProperties = null;
            if (inOSGi) {
                jobProperties = routines.system.BundleUtils.getJobProperties(jobName);
    
                if (jobProperties != null && jobProperties.get("context") != null) {
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = JOB_STOCK_HEBDO.class.getClassLoader().getResourceAsStream("bi_team_projects/job_stock_hebdo_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = JOB_STOCK_HEBDO.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
    	                defaultProps.load(inContext);
    	                if (inOSGi && jobProperties != null) {
                             java.util.Enumeration<String> keys = jobProperties.keys();
                             while (keys.hasMoreElements()) {
                                 String propKey = keys.nextElement();
                                 if (defaultProps.containsKey(propKey)) {
                                     defaultProps.put(propKey, (String) jobProperties.get(propKey));
                                 }
                             }
    	                }
    	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("host", "id_String");
                        if(context.getStringValue("host") == null) {
                            context.host = null;
                        } else {
                            context.host=(String) context.getProperty("host");
                        }
                        context.setContextType("sid", "id_String");
                        if(context.getStringValue("sid") == null) {
                            context.sid = null;
                        } else {
                            context.sid=(String) context.getProperty("sid");
                        }
                        context.setContextType("port", "id_String");
                        if(context.getStringValue("port") == null) {
                            context.port = null;
                        } else {
                            context.port=(String) context.getProperty("port");
                        }
                        context.setContextType("user", "id_String");
                        if(context.getStringValue("user") == null) {
                            context.user = null;
                        } else {
                            context.user=(String) context.getProperty("user");
                        }
                        context.setContextType("mdp", "id_Password");
                        if(context.getStringValue("mdp") == null) {
                            context.mdp = null;
                        } else {
                            String pwd_mdp_value = context.getProperty("mdp");
                            context.mdp = null;
                            if(pwd_mdp_value!=null) {
                                if(context_param.containsKey("mdp")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.mdp = pwd_mdp_value;
                                } else if (!pwd_mdp_value.isEmpty()) {
                                    try {
                                        context.mdp = routines.system.PasswordEncryptUtil.decryptPassword(pwd_mdp_value);
                                        context.put("mdp",context.mdp);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("host_ods", "id_String");
                        if(context.getStringValue("host_ods") == null) {
                            context.host_ods = null;
                        } else {
                            context.host_ods=(String) context.getProperty("host_ods");
                        }
                        context.setContextType("sid_ods", "id_String");
                        if(context.getStringValue("sid_ods") == null) {
                            context.sid_ods = null;
                        } else {
                            context.sid_ods=(String) context.getProperty("sid_ods");
                        }
                        context.setContextType("port_ods", "id_String");
                        if(context.getStringValue("port_ods") == null) {
                            context.port_ods = null;
                        } else {
                            context.port_ods=(String) context.getProperty("port_ods");
                        }
                        context.setContextType("user_ods", "id_String");
                        if(context.getStringValue("user_ods") == null) {
                            context.user_ods = null;
                        } else {
                            context.user_ods=(String) context.getProperty("user_ods");
                        }
                        context.setContextType("mdp_ods", "id_Password");
                        if(context.getStringValue("mdp_ods") == null) {
                            context.mdp_ods = null;
                        } else {
                            String pwd_mdp_ods_value = context.getProperty("mdp_ods");
                            context.mdp_ods = null;
                            if(pwd_mdp_ods_value!=null) {
                                if(context_param.containsKey("mdp_ods")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.mdp_ods = pwd_mdp_ods_value;
                                } else if (!pwd_mdp_ods_value.isEmpty()) {
                                    try {
                                        context.mdp_ods = routines.system.PasswordEncryptUtil.decryptPassword(pwd_mdp_ods_value);
                                        context.put("mdp_ods",context.mdp_ods);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("user_gold", "id_String");
                        if(context.getStringValue("user_gold") == null) {
                            context.user_gold = null;
                        } else {
                            context.user_gold=(String) context.getProperty("user_gold");
                        }
                        context.setContextType("sid_gold", "id_String");
                        if(context.getStringValue("sid_gold") == null) {
                            context.sid_gold = null;
                        } else {
                            context.sid_gold=(String) context.getProperty("sid_gold");
                        }
                        context.setContextType("port_gold", "id_String");
                        if(context.getStringValue("port_gold") == null) {
                            context.port_gold = null;
                        } else {
                            context.port_gold=(String) context.getProperty("port_gold");
                        }
                        context.setContextType("host_gold", "id_String");
                        if(context.getStringValue("host_gold") == null) {
                            context.host_gold = null;
                        } else {
                            context.host_gold=(String) context.getProperty("host_gold");
                        }
                        context.setContextType("mdp_gold", "id_Password");
                        if(context.getStringValue("mdp_gold") == null) {
                            context.mdp_gold = null;
                        } else {
                            String pwd_mdp_gold_value = context.getProperty("mdp_gold");
                            context.mdp_gold = null;
                            if(pwd_mdp_gold_value!=null) {
                                if(context_param.containsKey("mdp_gold")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.mdp_gold = pwd_mdp_gold_value;
                                } else if (!pwd_mdp_gold_value.isEmpty()) {
                                    try {
                                        context.mdp_gold = routines.system.PasswordEncryptUtil.decryptPassword(pwd_mdp_gold_value);
                                        context.put("mdp_gold",context.mdp_gold);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Login", "id_String");
                        if(context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Login") == null) {
                            context.PORTAIL_FOURNISSEUR_AZURE_Login = null;
                        } else {
                            context.PORTAIL_FOURNISSEUR_AZURE_Login=(String) context.getProperty("PORTAIL_FOURNISSEUR_AZURE_Login");
                        }
                        context.setContextType("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams", "id_String");
                        if(context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams") == null) {
                            context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams = null;
                        } else {
                            context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams=(String) context.getProperty("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
                        }
                        context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Schema", "id_String");
                        if(context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Schema") == null) {
                            context.PORTAIL_FOURNISSEUR_AZURE_Schema = null;
                        } else {
                            context.PORTAIL_FOURNISSEUR_AZURE_Schema=(String) context.getProperty("PORTAIL_FOURNISSEUR_AZURE_Schema");
                        }
                        context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Server", "id_String");
                        if(context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Server") == null) {
                            context.PORTAIL_FOURNISSEUR_AZURE_Server = null;
                        } else {
                            context.PORTAIL_FOURNISSEUR_AZURE_Server=(String) context.getProperty("PORTAIL_FOURNISSEUR_AZURE_Server");
                        }
                        context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Port", "id_String");
                        if(context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Port") == null) {
                            context.PORTAIL_FOURNISSEUR_AZURE_Port = null;
                        } else {
                            context.PORTAIL_FOURNISSEUR_AZURE_Port=(String) context.getProperty("PORTAIL_FOURNISSEUR_AZURE_Port");
                        }
                        context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Password", "id_Password");
                        if(context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Password") == null) {
                            context.PORTAIL_FOURNISSEUR_AZURE_Password = null;
                        } else {
                            String pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value = context.getProperty("PORTAIL_FOURNISSEUR_AZURE_Password");
                            context.PORTAIL_FOURNISSEUR_AZURE_Password = null;
                            if(pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value!=null) {
                                if(context_param.containsKey("PORTAIL_FOURNISSEUR_AZURE_Password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.PORTAIL_FOURNISSEUR_AZURE_Password = pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value;
                                } else if (!pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value.isEmpty()) {
                                    try {
                                        context.PORTAIL_FOURNISSEUR_AZURE_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_PORTAIL_FOURNISSEUR_AZURE_Password_value);
                                        context.put("PORTAIL_FOURNISSEUR_AZURE_Password",context.PORTAIL_FOURNISSEUR_AZURE_Password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("PORTAIL_FOURNISSEUR_AZURE_Database", "id_String");
                        if(context.getStringValue("PORTAIL_FOURNISSEUR_AZURE_Database") == null) {
                            context.PORTAIL_FOURNISSEUR_AZURE_Database = null;
                        } else {
                            context.PORTAIL_FOURNISSEUR_AZURE_Database=(String) context.getProperty("PORTAIL_FOURNISSEUR_AZURE_Database");
                        }
                        context.setContextType("PATH_STOCK_HEBDO", "id_String");
                        if(context.getStringValue("PATH_STOCK_HEBDO") == null) {
                            context.PATH_STOCK_HEBDO = null;
                        } else {
                            context.PATH_STOCK_HEBDO=(String) context.getProperty("PATH_STOCK_HEBDO");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("host")) {
                context.host = (String) parentContextMap.get("host");
            }if (parentContextMap.containsKey("sid")) {
                context.sid = (String) parentContextMap.get("sid");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("user")) {
                context.user = (String) parentContextMap.get("user");
            }if (parentContextMap.containsKey("mdp")) {
                context.mdp = (java.lang.String) parentContextMap.get("mdp");
            }if (parentContextMap.containsKey("host_ods")) {
                context.host_ods = (String) parentContextMap.get("host_ods");
            }if (parentContextMap.containsKey("sid_ods")) {
                context.sid_ods = (String) parentContextMap.get("sid_ods");
            }if (parentContextMap.containsKey("port_ods")) {
                context.port_ods = (String) parentContextMap.get("port_ods");
            }if (parentContextMap.containsKey("user_ods")) {
                context.user_ods = (String) parentContextMap.get("user_ods");
            }if (parentContextMap.containsKey("mdp_ods")) {
                context.mdp_ods = (java.lang.String) parentContextMap.get("mdp_ods");
            }if (parentContextMap.containsKey("user_gold")) {
                context.user_gold = (String) parentContextMap.get("user_gold");
            }if (parentContextMap.containsKey("sid_gold")) {
                context.sid_gold = (String) parentContextMap.get("sid_gold");
            }if (parentContextMap.containsKey("port_gold")) {
                context.port_gold = (String) parentContextMap.get("port_gold");
            }if (parentContextMap.containsKey("host_gold")) {
                context.host_gold = (String) parentContextMap.get("host_gold");
            }if (parentContextMap.containsKey("mdp_gold")) {
                context.mdp_gold = (java.lang.String) parentContextMap.get("mdp_gold");
            }if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Login")) {
                context.PORTAIL_FOURNISSEUR_AZURE_Login = (String) parentContextMap.get("PORTAIL_FOURNISSEUR_AZURE_Login");
            }if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams")) {
                context.PORTAIL_FOURNISSEUR_AZURE_AdditionalParams = (String) parentContextMap.get("PORTAIL_FOURNISSEUR_AZURE_AdditionalParams");
            }if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Schema")) {
                context.PORTAIL_FOURNISSEUR_AZURE_Schema = (String) parentContextMap.get("PORTAIL_FOURNISSEUR_AZURE_Schema");
            }if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Server")) {
                context.PORTAIL_FOURNISSEUR_AZURE_Server = (String) parentContextMap.get("PORTAIL_FOURNISSEUR_AZURE_Server");
            }if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Port")) {
                context.PORTAIL_FOURNISSEUR_AZURE_Port = (String) parentContextMap.get("PORTAIL_FOURNISSEUR_AZURE_Port");
            }if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Password")) {
                context.PORTAIL_FOURNISSEUR_AZURE_Password = (java.lang.String) parentContextMap.get("PORTAIL_FOURNISSEUR_AZURE_Password");
            }if (parentContextMap.containsKey("PORTAIL_FOURNISSEUR_AZURE_Database")) {
                context.PORTAIL_FOURNISSEUR_AZURE_Database = (String) parentContextMap.get("PORTAIL_FOURNISSEUR_AZURE_Database");
            }if (parentContextMap.containsKey("PATH_STOCK_HEBDO")) {
                context.PATH_STOCK_HEBDO = (String) parentContextMap.get("PATH_STOCK_HEBDO");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("mdp");
			parametersToEncrypt.add("mdp_ods");
			parametersToEncrypt.add("mdp_gold");
			parametersToEncrypt.add("PORTAIL_FOURNISSEUR_AZURE_Password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
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


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs
final Thread launchingThread = Thread.currentThread();
        runningThreadCount.add(1);
        new Thread(){
            public void run() {
                java.util.Map threadRunResultMap = new java.util.HashMap();
                threadRunResultMap.put("errorCode", null);
                threadRunResultMap.put("status", "");
                threadLocal.set(threadRunResultMap);

                try {
((java.util.Map) threadLocal.get()).put("errorCode", null);tDBInput_1Process(globalMap);
if ( !"failure".equals(((java.util.Map)threadLocal.get()).get("status")) ) {
((java.util.Map) threadLocal.get()).put("status", "end");
}
}catch (TalendException e_tDBInput_1) {
globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

e_tDBInput_1.printStackTrace();

}catch (java.lang.Error e_tDBInput_1) {
globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);
((java.util.Map) threadLocal.get()).put("status", "failure");throw e_tDBInput_1;

}
                finally {
                    Integer localErrorCode = (Integer)(((java.util.Map)threadLocal.get()).get("errorCode"));
                    String localStatus = (String)(((java.util.Map)threadLocal.get()).get("status"));
                    if (localErrorCode != null) {
                        if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
                           errorCode = localErrorCode;
                        }
                    }
                    if (!status.equals("failure")){
                        status = localStatus;
                    }

                    if ("true".equals(((java.util.Map) threadLocal.get()).get("JobInterrupted"))) {
                        launchingThread.interrupt();
                    }

                    runningThreadCount.add(-1);
                }
            }
        }.start();

    boolean interrupted = false;
    while (runningThreadCount.getCount() > 0) {
        try {
            Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            interrupted = true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    if (interrupted) {
        Thread.currentThread().interrupt();
    }



this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : JOB_STOCK_HEBDO");
        }
		if(enableLogStash) {
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

        Integer localErrorCode = (Integer)(((java.util.Map)threadLocal.get()).get("errorCode"));
        String localStatus = (String)(((java.util.Map)threadLocal.get()).get("status"));
        if (localErrorCode != null) {
            if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
                   errorCode = localErrorCode;
            }
        }
        if (localStatus != null && !status.equals("failure")){
            status = localStatus;
        }

    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

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
            obj_conn = globalMap.remove("conn_tDBConnection_4");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tDBConnection_1");
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
            connections.put("conn_tDBConnection_4", globalMap.get("conn_tDBConnection_4"));
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));
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
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
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
 *     831291 characters generated by Talend Cloud Data Management Platform 
 *     on the 11 août 2022 à 19:25:22 WEST
 ************************************************************************************************/