
package bi_team_projects.inventory_sales_samsung_0_1;

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
 * Job: Inventory_Sales_Samsung Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status 
 */
public class Inventory_Sales_Samsung implements TalendJob {
	static {System.setProperty("TalendJob.log", "Inventory_Sales_Samsung.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(Inventory_Sales_Samsung.class);
	

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
			
			if(ENVIRONNEMENT != null){
				
					this.setProperty("ENVIRONNEMENT", ENVIRONNEMENT.toString());
				
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
public String mdp;
public String getMdp(){
	return this.mdp;
}
public String ENVIRONNEMENT;
public String getENVIRONNEMENT(){
	return this.ENVIRONNEMENT;
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
public String mdp_ods;
public String getMdp_ods(){
	return this.mdp_ods;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "Inventory_Sales_Samsung";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_OZGMcF2wEeybcOBfcEeoug", "0.1");
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
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
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
				Inventory_Sales_Samsung.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(Inventory_Sales_Samsung.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tSetGlobalVar_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileList_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFTPConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFTPConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFTPPut_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFTPPut_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFTPPut_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFTPPut_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileList_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFTPConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFTPPut_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFTPPut_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

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
                            log4jParamters_tSetGlobalVar_2.append("VARIABLES" + " = " + "[{VALUE="+("TalendDate.formatDate(\"yyyyMMdd_HHmmss\",TalendDate.getCurrentDate())")+", KEY="+("\"CurentDate\"")+"}]");
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

	

globalMap.put("CurentDate", TalendDate.formatDate("yyyyMMdd_HHmmss",TalendDate.getCurrentDate()));

 


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
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tFileList_1Process(globalMap);



/**
 * [tSetGlobalVar_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
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
	

public void tFileList_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileList_1 begin ] start
	 */

				
			int NB_ITERATE_tFileDelete_1 = 0; //for statistics
			

	
		
		ok_Hash.put("tFileList_1", false);
		start_Hash.put("tFileList_1", System.currentTimeMillis());
		
	
	currentComponent="tFileList_1";

	
		int tos_count_tFileList_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileList_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileList_1 = new StringBuilder();
                    log4jParamters_tFileList_1.append("Parameters:");
                            log4jParamters_tFileList_1.append("DIRECTORY" + " = " + "\"E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS\"");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("LIST_MODE" + " = " + "FILES");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("INCLUDSUBDIR" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("CASE_SENSITIVE" + " = " + "YES");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ERROR" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("GLOBEXPRESSIONS" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("FILES" + " = " + "[]");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_NOTHING" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_FILENAME" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_FILESIZE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_MODIFIEDDATE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_ACTION_ASC" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_ACTION_DESC" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("IFEXCLUDE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("FORMAT_FILEPATH_TO_SLASH" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + (log4jParamters_tFileList_1) );
                    } 
                } 
            new BytesLimit65535_tFileList_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileList_1", "tFileList_1", "tFileList");
				talendJobLogProcess(globalMap);
			}
			
	
 
  
				final StringBuffer log4jSb_tFileList_1 = new StringBuffer();
			   
    
  String directory_tFileList_1 = "E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS";
  final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
  final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>();
      maskList_tFileList_1.add("*");  
  for (final String filemask_tFileList_1 : maskList_tFileList_1) {
	String filemask_compile_tFileList_1 = filemask_tFileList_1;
	
		filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler.globToPerl5(filemask_tFileList_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
	
		java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern.compile(filemask_compile_tFileList_1);
	patternList_tFileList_1.add(fileNamePattern_tFileList_1);
  }
  int NB_FILEtFileList_1 = 0;

  final boolean case_sensitive_tFileList_1 = true;
	
	
		log.info("tFileList_1 - Starting to search for matching entries.");
	
	
    final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
    final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
	java.io.File file_tFileList_1 = new java.io.File(directory_tFileList_1);
     
		file_tFileList_1.listFiles(new java.io.FilenameFilter() {
			public boolean accept(java.io.File dir, String name) {
				java.io.File file = new java.io.File(dir, name);
                if (!file.isDirectory()) {
                	
    	String fileName_tFileList_1 = file.getName();
		for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
          	if (fileNamePattern_tFileList_1.matcher(fileName_tFileList_1).matches()){
					if(!filePath_tFileList_1.contains(file.getAbsolutePath())) {
			          list_tFileList_1.add(file);
			          filePath_tFileList_1.add(file.getAbsolutePath());
			        }
			}
		}
                }
              return true;
            }
          }
      ); 
      java.util.Collections.sort(list_tFileList_1);
    
		log.info("tFileList_1 - Start to list files.");
	
    for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++){
      java.io.File files_tFileList_1 = list_tFileList_1.get(i_tFileList_1);
      String fileName_tFileList_1 = files_tFileList_1.getName();
      
      String currentFileName_tFileList_1 = files_tFileList_1.getName(); 
      String currentFilePath_tFileList_1 = files_tFileList_1.getAbsolutePath();
      String currentFileDirectory_tFileList_1 = files_tFileList_1.getParent();
      String currentFileExtension_tFileList_1 = null;
      
      if (files_tFileList_1.getName().contains(".") && files_tFileList_1.isFile()){
        currentFileExtension_tFileList_1 = files_tFileList_1.getName().substring(files_tFileList_1.getName().lastIndexOf(".") + 1);
      } else{
        currentFileExtension_tFileList_1 = "";
      }
      
      NB_FILEtFileList_1 ++;
      globalMap.put("tFileList_1_CURRENT_FILE", currentFileName_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEPATH", currentFilePath_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_1);
      globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
      
		log.info("tFileList_1 - Current file or directory path : " + currentFilePath_tFileList_1);
	  
 



/**
 * [tFileList_1 begin ] stop
 */
	
	/**
	 * [tFileList_1 main ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 


	tos_count_tFileList_1++;

/**
 * [tFileList_1 main ] stop
 */
	
	/**
	 * [tFileList_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_begin ] stop
 */
	NB_ITERATE_tFileDelete_1++;
	
	
				if(execStat){
					runStat.updateStatOnConnection("iterate1", 1, "exec" + NB_ITERATE_tFileDelete_1);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tFileDelete_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileDelete_1", false);
		start_Hash.put("tFileDelete_1", System.currentTimeMillis());
		
	
	currentComponent="tFileDelete_1";

	
		int tos_count_tFileDelete_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileDelete_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileDelete_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileDelete_1 = new StringBuilder();
                    log4jParamters_tFileDelete_1.append("Parameters:");
                            log4jParamters_tFileDelete_1.append("FILENAME" + " = " + "((String)globalMap.get(\"tFileList_1_CURRENT_FILEPATH\"))");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FAILON" + " = " + "true");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FOLDER" + " = " + "false");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FOLDER_FILE" + " = " + "false");
                        log4jParamters_tFileDelete_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileDelete_1 - "  + (log4jParamters_tFileDelete_1) );
                    } 
                } 
            new BytesLimit65535_tFileDelete_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileDelete_1", "tFileDelete_1", "tFileDelete");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tFileDelete_1 begin ] stop
 */
	
	/**
	 * [tFileDelete_1 main ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";

	

 

				final StringBuffer log4jSb_tFileDelete_1 = new StringBuffer();
			
class DeleteFoldertFileDelete_1{
	 /**
     * delete all the sub-files in 'file'
     * 
     * @param file
     */
	public boolean delete(java.io.File file) {
        java.io.File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                files[i].delete();
            } else if (files[i].isDirectory()) {
                if (!files[i].delete()) {
                    delete(files[i]);
                }
            }
        }
        deleteDirectory(file);
        return file.delete();
    }

    /**
     * delete all the sub-folders in 'file'
     * 
     * @param file
     */
    private void deleteDirectory(java.io.File file) {
        java.io.File[] filed = file.listFiles();
        for (int i = 0; i < filed.length; i++) {
        	if(filed[i].isDirectory()) {
            	deleteDirectory(filed[i]);
            }
            filed[i].delete();
        }
    }

}
    java.io.File file_tFileDelete_1=new java.io.File(((String)globalMap.get("tFileList_1_CURRENT_FILEPATH")));
    if(file_tFileDelete_1.exists()&& file_tFileDelete_1.isFile()){
    	if(file_tFileDelete_1.delete()){
    		globalMap.put("tFileDelete_1_CURRENT_STATUS", "File deleted.");
    		log.info("tFileDelete_1 - File : "+ file_tFileDelete_1.getAbsolutePath() + " is deleted.");
		}else{
			globalMap.put("tFileDelete_1_CURRENT_STATUS", "No file deleted.");
				throw new RuntimeException("File " + file_tFileDelete_1.getAbsolutePath() + " can not be deleted.");
		}
	}else{
		globalMap.put("tFileDelete_1_CURRENT_STATUS", "File does not exist or is invalid.");
			throw new RuntimeException("File " + file_tFileDelete_1.getAbsolutePath() + " does not exist or is invalid or is not a file.");
	}
	globalMap.put("tFileDelete_1_DELETE_PATH",((String)globalMap.get("tFileList_1_CURRENT_FILEPATH")));
 


	tos_count_tFileDelete_1++;

/**
 * [tFileDelete_1 main ] stop
 */
	
	/**
	 * [tFileDelete_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";

	

 



/**
 * [tFileDelete_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileDelete_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";

	

 



/**
 * [tFileDelete_1 process_data_end ] stop
 */
	
	/**
	 * [tFileDelete_1 end ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tFileDelete_1 - "  + ("Done.") );

ok_Hash.put("tFileDelete_1", true);
end_Hash.put("tFileDelete_1", System.currentTimeMillis());




/**
 * [tFileDelete_1 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate1", 2, "exec" + NB_ITERATE_tFileDelete_1);
						}				
					




	
	/**
	 * [tFileList_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 process_data_end ] stop
 */
	
	/**
	 * [tFileList_1 end ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

  
    }
  globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
  
    log.info("tFileList_1 - File or directory count : " + NB_FILEtFileList_1);

  
 

 
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + ("Done.") );

ok_Hash.put("tFileList_1", true);
end_Hash.put("tFileList_1", System.currentTimeMillis());




/**
 * [tFileList_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileList_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tDBInput_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileList_1 finally ] start
	 */

	

	
	
	currentComponent="tFileList_1";

	

 



/**
 * [tFileList_1 finally ] stop
 */

	
	/**
	 * [tFileDelete_1 finally ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";

	

 



/**
 * [tFileDelete_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}
	


public static class out_sStruct implements routines.system.IPersistableRow<out_sStruct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];

	
			    public String SUBS;

				public String getSUBS () {
					return this.SUBS;
				}
				
			    public String DATATYPE;

				public String getDATATYPE () {
					return this.DATATYPE;
				}
				
			    public String SALESDATE;

				public String getSALESDATE () {
					return this.SALESDATE;
				}
				
			    public BigDecimal FROMSITE;

				public BigDecimal getFROMSITE () {
					return this.FROMSITE;
				}
				
			    public String TOSITE;

				public String getTOSITE () {
					return this.TOSITE;
				}
				
			    public String SERIALNO;

				public String getSERIALNO () {
					return this.SERIALNO;
				}
				
			    public String MODEL;

				public String getMODEL () {
					return this.MODEL;
				}
				
			    public BigDecimal QTY;

				public BigDecimal getQTY () {
					return this.QTY;
				}
				
			    public String BRAND;

				public String getBRAND () {
					return this.BRAND;
				}
				
			    public String PRODUCT;

				public String getPRODUCT () {
					return this.PRODUCT;
				}
				
			    public String PRICE;

				public String getPRICE () {
					return this.PRICE;
				}
				
			    public String DATACOLLECTOR;

				public String getDATACOLLECTOR () {
					return this.DATACOLLECTOR;
				}
				
			    public String ATTRIBUTE01;

				public String getATTRIBUTE01 () {
					return this.ATTRIBUTE01;
				}
				
			    public String ATTRIBUTE02;

				public String getATTRIBUTE02 () {
					return this.ATTRIBUTE02;
				}
				
			    public String ATTRIBUTE03;

				public String getATTRIBUTE03 () {
					return this.ATTRIBUTE03;
				}
				
			    public String ATTRIBUTE04;

				public String getATTRIBUTE04 () {
					return this.ATTRIBUTE04;
				}
				
			    public String ATTRIBUTE05;

				public String getATTRIBUTE05 () {
					return this.ATTRIBUTE05;
				}
				
			    public String ATTRIBUTE06;

				public String getATTRIBUTE06 () {
					return this.ATTRIBUTE06;
				}
				
			    public String ATTRIBUTE07;

				public String getATTRIBUTE07 () {
					return this.ATTRIBUTE07;
				}
				
			    public String ATTRIBUTE08;

				public String getATTRIBUTE08 () {
					return this.ATTRIBUTE08;
				}
				
			    public String ATTRIBUTE09;

				public String getATTRIBUTE09 () {
					return this.ATTRIBUTE09;
				}
				
			    public String ATTRIBUTE10;

				public String getATTRIBUTE10 () {
					return this.ATTRIBUTE10;
				}
				
			    public String CREATE_ID;

				public String getCREATE_ID () {
					return this.CREATE_ID;
				}
				
			    public String CREATE_DT;

				public String getCREATE_DT () {
					return this.CREATE_DT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SUBS="+SUBS);
		sb.append(",DATATYPE="+DATATYPE);
		sb.append(",SALESDATE="+SALESDATE);
		sb.append(",FROMSITE="+String.valueOf(FROMSITE));
		sb.append(",TOSITE="+TOSITE);
		sb.append(",SERIALNO="+SERIALNO);
		sb.append(",MODEL="+MODEL);
		sb.append(",QTY="+String.valueOf(QTY));
		sb.append(",BRAND="+BRAND);
		sb.append(",PRODUCT="+PRODUCT);
		sb.append(",PRICE="+PRICE);
		sb.append(",DATACOLLECTOR="+DATACOLLECTOR);
		sb.append(",ATTRIBUTE01="+ATTRIBUTE01);
		sb.append(",ATTRIBUTE02="+ATTRIBUTE02);
		sb.append(",ATTRIBUTE03="+ATTRIBUTE03);
		sb.append(",ATTRIBUTE04="+ATTRIBUTE04);
		sb.append(",ATTRIBUTE05="+ATTRIBUTE05);
		sb.append(",ATTRIBUTE06="+ATTRIBUTE06);
		sb.append(",ATTRIBUTE07="+ATTRIBUTE07);
		sb.append(",ATTRIBUTE08="+ATTRIBUTE08);
		sb.append(",ATTRIBUTE09="+ATTRIBUTE09);
		sb.append(",ATTRIBUTE10="+ATTRIBUTE10);
		sb.append(",CREATE_ID="+CREATE_ID);
		sb.append(",CREATE_DT="+CREATE_DT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SUBS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUBS);
            			}
            		
        			sb.append("|");
        		
        				if(DATATYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATATYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SALESDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALESDATE);
            			}
            		
        			sb.append("|");
        		
        				if(FROMSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FROMSITE);
            			}
            		
        			sb.append("|");
        		
        				if(TOSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOSITE);
            			}
            		
        			sb.append("|");
        		
        				if(SERIALNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SERIALNO);
            			}
            		
        			sb.append("|");
        		
        				if(MODEL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODEL);
            			}
            		
        			sb.append("|");
        		
        				if(QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTY);
            			}
            		
        			sb.append("|");
        		
        				if(BRAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BRAND);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(DATACOLLECTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATACOLLECTOR);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE01);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE02);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE03);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE04);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE05);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE06);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE07);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE08);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE09);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE10);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_DT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out_sStruct other) {

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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];

	
			    public String SUBS;

				public String getSUBS () {
					return this.SUBS;
				}
				
			    public String DATATYPE;

				public String getDATATYPE () {
					return this.DATATYPE;
				}
				
			    public String SALESDATE;

				public String getSALESDATE () {
					return this.SALESDATE;
				}
				
			    public BigDecimal FROMSITE;

				public BigDecimal getFROMSITE () {
					return this.FROMSITE;
				}
				
			    public String TOSITE;

				public String getTOSITE () {
					return this.TOSITE;
				}
				
			    public String SERIALNO;

				public String getSERIALNO () {
					return this.SERIALNO;
				}
				
			    public String MODEL;

				public String getMODEL () {
					return this.MODEL;
				}
				
			    public BigDecimal QTY;

				public BigDecimal getQTY () {
					return this.QTY;
				}
				
			    public String BRAND;

				public String getBRAND () {
					return this.BRAND;
				}
				
			    public String PRODUCT;

				public String getPRODUCT () {
					return this.PRODUCT;
				}
				
			    public String PRICE;

				public String getPRICE () {
					return this.PRICE;
				}
				
			    public String DATACOLLECTOR;

				public String getDATACOLLECTOR () {
					return this.DATACOLLECTOR;
				}
				
			    public String ATTRIBUTE01;

				public String getATTRIBUTE01 () {
					return this.ATTRIBUTE01;
				}
				
			    public String ATTRIBUTE02;

				public String getATTRIBUTE02 () {
					return this.ATTRIBUTE02;
				}
				
			    public String ATTRIBUTE03;

				public String getATTRIBUTE03 () {
					return this.ATTRIBUTE03;
				}
				
			    public String ATTRIBUTE04;

				public String getATTRIBUTE04 () {
					return this.ATTRIBUTE04;
				}
				
			    public String ATTRIBUTE05;

				public String getATTRIBUTE05 () {
					return this.ATTRIBUTE05;
				}
				
			    public String ATTRIBUTE06;

				public String getATTRIBUTE06 () {
					return this.ATTRIBUTE06;
				}
				
			    public String ATTRIBUTE07;

				public String getATTRIBUTE07 () {
					return this.ATTRIBUTE07;
				}
				
			    public String ATTRIBUTE08;

				public String getATTRIBUTE08 () {
					return this.ATTRIBUTE08;
				}
				
			    public String ATTRIBUTE09;

				public String getATTRIBUTE09 () {
					return this.ATTRIBUTE09;
				}
				
			    public String ATTRIBUTE10;

				public String getATTRIBUTE10 () {
					return this.ATTRIBUTE10;
				}
				
			    public String CREATE_ID;

				public String getCREATE_ID () {
					return this.CREATE_ID;
				}
				
			    public String CREATE_DT;

				public String getCREATE_DT () {
					return this.CREATE_DT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SUBS="+SUBS);
		sb.append(",DATATYPE="+DATATYPE);
		sb.append(",SALESDATE="+SALESDATE);
		sb.append(",FROMSITE="+String.valueOf(FROMSITE));
		sb.append(",TOSITE="+TOSITE);
		sb.append(",SERIALNO="+SERIALNO);
		sb.append(",MODEL="+MODEL);
		sb.append(",QTY="+String.valueOf(QTY));
		sb.append(",BRAND="+BRAND);
		sb.append(",PRODUCT="+PRODUCT);
		sb.append(",PRICE="+PRICE);
		sb.append(",DATACOLLECTOR="+DATACOLLECTOR);
		sb.append(",ATTRIBUTE01="+ATTRIBUTE01);
		sb.append(",ATTRIBUTE02="+ATTRIBUTE02);
		sb.append(",ATTRIBUTE03="+ATTRIBUTE03);
		sb.append(",ATTRIBUTE04="+ATTRIBUTE04);
		sb.append(",ATTRIBUTE05="+ATTRIBUTE05);
		sb.append(",ATTRIBUTE06="+ATTRIBUTE06);
		sb.append(",ATTRIBUTE07="+ATTRIBUTE07);
		sb.append(",ATTRIBUTE08="+ATTRIBUTE08);
		sb.append(",ATTRIBUTE09="+ATTRIBUTE09);
		sb.append(",ATTRIBUTE10="+ATTRIBUTE10);
		sb.append(",CREATE_ID="+CREATE_ID);
		sb.append(",CREATE_DT="+CREATE_DT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SUBS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUBS);
            			}
            		
        			sb.append("|");
        		
        				if(DATATYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATATYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SALESDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALESDATE);
            			}
            		
        			sb.append("|");
        		
        				if(FROMSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FROMSITE);
            			}
            		
        			sb.append("|");
        		
        				if(TOSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOSITE);
            			}
            		
        			sb.append("|");
        		
        				if(SERIALNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SERIALNO);
            			}
            		
        			sb.append("|");
        		
        				if(MODEL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODEL);
            			}
            		
        			sb.append("|");
        		
        				if(QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTY);
            			}
            		
        			sb.append("|");
        		
        				if(BRAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BRAND);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(DATACOLLECTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATACOLLECTOR);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE01);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE02);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE03);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE04);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE05);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE06);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE07);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE08);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE09);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE10);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_DT);
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
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row1Struct row1 = new row1Struct();
out_sStruct out_s = new out_sStruct();





	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out_s");
			
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
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "\"E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS/MCSEDI_C780_MARJANE_SO_SKU_\"+((String)globalMap.get(\"CurentDate\"))+\".txt\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\"	\"");
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
                            log4jParamters_tFileOutputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILE_EXIST_EXCEPTION" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + (log4jParamters_tFileOutputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_1", "output_marjane", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_1 = "";
    fileName_tFileOutputDelimited_1 = (new java.io.File("E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS/MCSEDI_C780_MARJANE_SO_SKU_"+((String)globalMap.get("CurentDate"))+".txt")).getAbsolutePath().replace("\\","/");
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
    if(filetFileOutputDelimited_1.exists()){
            throw new RuntimeException("The particular file \""+filetFileOutputDelimited_1.getAbsoluteFile() +
            "\" already exist. If you want to overwrite the file, please uncheck the" + 
            " \"Throw an error if the file already exist\" option in Advanced settings.");
        }
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */"	"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

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
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, false),"ISO-8859-15"));
                                    if(filetFileOutputDelimited_1.length()==0){
                                        outtFileOutputDelimited_1.write("SUBS");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("DATATYPE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("SALESDATE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("FROMSITE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TOSITE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("SERIALNO");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("MODEL");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("QTY");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("BRAND");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PRODUCT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PRICE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("DATACOLLECTOR");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE01");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE02");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE03");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE04");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE05");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE06");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE07");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE08");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE09");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ATTRIBUTE10");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("CREATE_ID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("CREATE_DT");
                                        outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.flush();
                                    }


        resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

 



/**
 * [tFileOutputDelimited_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
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
		int count_row1_tMap_1 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out_s_tMap_1 = 0;
				
out_sStruct out_s_tmp = new out_sStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_1 = new StringBuilder();
                    log4jParamters_tDBInput_1.append("Parameters:");
                            log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("DB_VERSION" + " = " + "ORACLE_18");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("HOST" + " = " + "\"192.168.99.98\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PORT" + " = " + "\"1521\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("DBNAME" + " = " + "\"GOLDV5\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USER" + " = " + "\"CENPRD\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:LAguRu02+SaxkD8qBbm8F3rF+MLydNDQWClzk827TMfMpQ==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select 'C780' subs,  'I' DATATYPE,  TO_CHAR(sysdate-1,'yyyymmdd') SALESDATE,  S.SOCSITE FROMSITE,  null TOSITE,  null SERIALNO,  PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) MODEL,  pkstock.getStockEnQteValADate(stosite,  stocinl ,  trunc(sysdate)-1)QTY,  null BRAND,  null PRODUCT,  null PRICE,  'MARJANE_EDI_IF' DATACOLLECTOR,  REPLACE(pkstrucobj.get_desc(ARVCINR, 'FR'), '\\\"\\\"\\\"\\\"', '') ATTRIBUTE01,  null ATTRIBUTE02,  null ATTRIBUTE03,  null ATTRIBUTE04,  null ATTRIBUTE05,  null ATTRIBUTE06,  null ATTRIBUTE07,  null ATTRIBUTE08,  null ATTRIBUTE09,  null ATTRIBUTE10,  'MARJANE_EDI_IF' CREATE_ID,  TO_CHAR(sysdate,'yyyymmdd') CREATE_DT  from sitdgene s, artuv u, stocouch  where 1 = 1  and U.ARVCEXV = '0'  and (s.socsite > 900 or 800 > s.socsite)  and stosite = s.socsite  and stocinr = u.arvcinr  and exists (select 1  from foucatalog f  where F.FCLCINV = U.ARVCINV  and trunc(sysdate-1) between F.FCLDDEB and F.FCLDFIN  and F.FCLCFIN = 7405)  and s.socchain in(2,4)  and pkstock.getStockEnQteValADate(stosite,stocinl ,trunc(sysdate)-1)>0  group by u.arvcexr, u.arvcinr, S.SOCSITE, U.ARVCINV,stocinl,stosite  union   select 'C780' subs,  'S' DATATYPE,  TO_CHAR(min(stmdmvt),'yyyymmdd') SALESDATE,  S.SOCSITE FROMSITE,  'EU' TOSITE,  null SERIALNO,  PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) \\\"MODEL\\\",  NVL(-SUM(STMVAL), 0) QTY,  null BRAND,  null PRODUCT,  null PRICE,  'MARJANE_EDI_IF' DATACOLLECTOR,  REPLACE(pkstrucobj.get_desc(ARVCINR, 'FR'), '\\\"\\\"\\\"\\\"', '') ATTRIBUTE01,  null ATTRIBUTE02,  null ATTRIBUTE03,  null ATTRIBUTE04,  null ATTRIBUTE05,  null ATTRIBUTE06,  null ATTRIBUTE07,  null ATTRIBUTE08,  null ATTRIBUTE09,  null ATTRIBUTE10,  'MARJANE_EDI_IF' CREATE_ID,  TO_CHAR(sysdate,'yyyymmdd') CREATE_DT  from sitdgene s, artuv u, stomvt st, artul a  where 1 = 1  AND st.stmcinl = a.arucinl  and st.stmtmvt BETWEEN 150 AND 174  AND arutypul = 1  and st.stmsite = s.socsite  and a.arucinr = u.arvcinr  and S.SOCCMAG = 10  and U.ARVCEXV = '0'  and (s.socsite > 900 or 800 > s.socsite)  and exists (select 1  from foucatalog f  where F.FCLCINV = U.ARVCINV  and trunc(sysdate) between F.FCLDDEB and F.FCLDFIN  and F.FCLCFIN = 7405)  and s.socchain in(2,4)  and trunc(stmdmvt) =trunc(sysdate)-1  group by u.arvcinr, u.arvcexr, S.SOCSITE, U.ARVCINV\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "true");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("CURSOR_SIZE" + " = " + "1000");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "true");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + (log4jParamters_tDBInput_1) );
                    } 
                } 
            new BytesLimit65535_tDBInput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_1", "input_Marjane", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_1);
				
			String url_tDBInput_1 = null;
				url_tDBInput_1 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_1 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:QV9I2VCfzxeh4DgolQLUmL03rU60E4opywL7YVRRiyb1Wg==");

				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;

				
	    		log.debug("tDBInput_1 - Driver ClassName: "+driverClass_tDBInput_1+".");
			
	    		log.debug("tDBInput_1 - Connection attempt to '" + url_tDBInput_1 + "' with the username '" + dbUser_tDBInput_1 + "'.");
			
					conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
	    		log.debug("tDBInput_1 - Connection to '" + url_tDBInput_1 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_1 = conn_tDBInput_1.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_1 = stmtGetTZ_tDBInput_1.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_1 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_1.next()) {
					sessionTimezone_tDBInput_1 = rsGetTZ_tDBInput_1.getString(1);
				}
                                if (!(conn_tDBInput_1 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_1.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_1.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_1.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_1);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_1).setSessionTimeZone(sessionTimezone_tDBInput_1);
                                }
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
																					java.sql.ResultSet.CONCUR_READ_ONLY);
			
                stmt_tDBInput_1.setFetchSize(1000);


		    String dbquery_tDBInput_1 = "select 'C780' subs,\n'I' DATATYPE,\nTO_CHAR(sysdate-1,'yyyymmdd') SALESDATE,\nS.SOCSITE FROMSITE,\nnull TOSITE,\nnull S"
+"ERIALNO,\nPKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) MODEL,\npkstock.getStockEnQteValADate(stosite,\nstocinl ,\ntrunc(sysdate)-"
+"1)QTY,\nnull BRAND,\nnull PRODUCT,\nnull PRICE,\n'MARJANE_EDI_IF' DATACOLLECTOR,\nREPLACE(pkstrucobj.get_desc(ARVCINR, '"
+"FR'), '\"\"\"\"', '') ATTRIBUTE01,\nnull ATTRIBUTE02,\nnull ATTRIBUTE03,\nnull ATTRIBUTE04,\nnull ATTRIBUTE05,\nnull ATT"
+"RIBUTE06,\nnull ATTRIBUTE07,\nnull ATTRIBUTE08,\nnull ATTRIBUTE09,\nnull ATTRIBUTE10,\n'MARJANE_EDI_IF' CREATE_ID,\nTO_C"
+"HAR(sysdate,'yyyymmdd') CREATE_DT\nfrom sitdgene s, artuv u, stocouch\nwhere 1 = 1\nand U.ARVCEXV = '0'\nand (s.socsite "
+"> 900 or 800 > s.socsite)\nand stosite = s.socsite\nand stocinr = u.arvcinr\nand exists (select 1\nfrom foucatalog f\nwh"
+"ere F.FCLCINV = U.ARVCINV\nand trunc(sysdate-1) between F.FCLDDEB and F.FCLDFIN\nand F.FCLCFIN = 7405)\nand s.socchain i"
+"n(2,4)\nand pkstock.getStockEnQteValADate(stosite,stocinl ,trunc(sysdate)-1)>0\ngroup by u.arvcexr, u.arvcinr, S.SOCSITE"
+", U.ARVCINV,stocinl,stosite\nunion \nselect 'C780' subs,\n'S' DATATYPE,\nTO_CHAR(min(stmdmvt),'yyyymmdd') SALESDATE,\nS."
+"SOCSITE FROMSITE,\n'EU' TOSITE,\nnull SERIALNO,\nPKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) \"MODEL\",\nNVL(-SUM(STMVAL), 0) QT"
+"Y,\nnull BRAND,\nnull PRODUCT,\nnull PRICE,\n'MARJANE_EDI_IF' DATACOLLECTOR,\nREPLACE(pkstrucobj.get_desc(ARVCINR, 'FR')"
+", '\"\"\"\"', '') ATTRIBUTE01,\nnull ATTRIBUTE02,\nnull ATTRIBUTE03,\nnull ATTRIBUTE04,\nnull ATTRIBUTE05,\nnull ATTRIBU"
+"TE06,\nnull ATTRIBUTE07,\nnull ATTRIBUTE08,\nnull ATTRIBUTE09,\nnull ATTRIBUTE10,\n'MARJANE_EDI_IF' CREATE_ID,\nTO_CHAR("
+"sysdate,'yyyymmdd') CREATE_DT\nfrom sitdgene s, artuv u, stomvt st, artul a\nwhere 1 = 1\nAND st.stmcinl = a.arucinl\nan"
+"d st.stmtmvt BETWEEN 150 AND 174\nAND arutypul = 1\nand st.stmsite = s.socsite\nand a.arucinr = u.arvcinr\nand S.SOCCMAG"
+" = 10\nand U.ARVCEXV = '0'\nand (s.socsite > 900 or 800 > s.socsite)\nand exists (select 1\nfrom foucatalog f\nwhere F.F"
+"CLCINV = U.ARVCINV\nand trunc(sysdate) between F.FCLDDEB and F.FCLDFIN\nand F.FCLCFIN = 7405)\nand s.socchain in(2,4)\na"
+"nd trunc(stmdmvt) =trunc(sysdate)-1\ngroup by u.arvcinr, u.arvcexr, S.SOCSITE, U.ARVCINV";
		    
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
								row1.SUBS = null;
							} else {
	                         		
        	row1.SUBS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.DATATYPE = null;
							} else {
	                         		
        	row1.DATATYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.SALESDATE = null;
							} else {
	                         		
        	row1.SALESDATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.FROMSITE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(4) != null) {
						row1.FROMSITE = rs_tDBInput_1.getBigDecimal(4);
					} else {
				
						row1.FROMSITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.TOSITE = null;
							} else {
	                         		
        	row1.TOSITE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.SERIALNO = null;
							} else {
	                         		
        	row1.SERIALNO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.MODEL = null;
							} else {
	                         		
        	row1.MODEL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 7, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(8) != null) {
						row1.QTY = rs_tDBInput_1.getBigDecimal(8);
					} else {
				
						row1.QTY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.BRAND = null;
							} else {
	                         		
        	row1.BRAND = routines.system.JDBCUtil.getString(rs_tDBInput_1, 9, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.PRODUCT = null;
							} else {
	                         		
        	row1.PRODUCT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.PRICE = null;
							} else {
	                         		
        	row1.PRICE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 11, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.DATACOLLECTOR = null;
							} else {
	                         		
        	row1.DATACOLLECTOR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 12, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.ATTRIBUTE01 = null;
							} else {
	                         		
        	row1.ATTRIBUTE01 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 13, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.ATTRIBUTE02 = null;
							} else {
	                         		
        	row1.ATTRIBUTE02 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 14, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.ATTRIBUTE03 = null;
							} else {
	                         		
        	row1.ATTRIBUTE03 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.ATTRIBUTE04 = null;
							} else {
	                         		
        	row1.ATTRIBUTE04 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.ATTRIBUTE05 = null;
							} else {
	                         		
        	row1.ATTRIBUTE05 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.ATTRIBUTE06 = null;
							} else {
	                         		
        	row1.ATTRIBUTE06 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row1.ATTRIBUTE07 = null;
							} else {
	                         		
        	row1.ATTRIBUTE07 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 19, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row1.ATTRIBUTE08 = null;
							} else {
	                         		
        	row1.ATTRIBUTE08 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 20, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row1.ATTRIBUTE09 = null;
							} else {
	                         		
        	row1.ATTRIBUTE09 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 21, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row1.ATTRIBUTE10 = null;
							} else {
	                         		
        	row1.ATTRIBUTE10 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row1.CREATE_ID = null;
							} else {
	                         		
        	row1.CREATE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 23, true);
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row1.CREATE_DT = null;
							} else {
	                         		
        	row1.CREATE_DT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 24, true);
		                    }
					
						log.debug("tDBInput_1 - Retrieving the record " + nb_line_tDBInput_1 + ".");
					




 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tDBInput_1","input_Marjane","tOracleInput","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
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

out_s = null;


// # Output table : 'out_s'
count_out_s_tMap_1++;

out_s_tmp.SUBS = row1.SUBS ;
out_s_tmp.DATATYPE = row1.DATATYPE ;
out_s_tmp.SALESDATE = row1.SALESDATE ;
out_s_tmp.FROMSITE = row1.FROMSITE ;
out_s_tmp.TOSITE = row1.TOSITE ;
out_s_tmp.SERIALNO = row1.SERIALNO ;
out_s_tmp.MODEL = row1.MODEL ;
out_s_tmp.QTY = row1.QTY ;
out_s_tmp.BRAND = row1.BRAND ;
out_s_tmp.PRODUCT = row1.PRODUCT ;
out_s_tmp.PRICE = row1.PRICE ;
out_s_tmp.DATACOLLECTOR = row1.DATACOLLECTOR ;
out_s_tmp.ATTRIBUTE01 = row1.ATTRIBUTE01 ;
out_s_tmp.ATTRIBUTE02 = row1.ATTRIBUTE02 ;
out_s_tmp.ATTRIBUTE03 = row1.ATTRIBUTE03 ;
out_s_tmp.ATTRIBUTE04 = row1.ATTRIBUTE04 ;
out_s_tmp.ATTRIBUTE05 = row1.ATTRIBUTE05 ;
out_s_tmp.ATTRIBUTE06 = row1.ATTRIBUTE06 ;
out_s_tmp.ATTRIBUTE07 = row1.ATTRIBUTE07 ;
out_s_tmp.ATTRIBUTE08 = row1.ATTRIBUTE08 ;
out_s_tmp.ATTRIBUTE09 = row1.ATTRIBUTE09 ;
out_s_tmp.ATTRIBUTE10 = row1.ATTRIBUTE10 ;
out_s_tmp.CREATE_ID = row1.CREATE_ID ;
out_s_tmp.CREATE_DT = row1.CREATE_DT ;
out_s = out_s_tmp;
log.debug("tMap_1 - Outputting the record " + count_out_s_tMap_1 + " of the output table 'out_s'.");

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
// Start of branch "out_s"
if(out_s != null) { 



	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out_s","tMap_1","tMap_1","tMap","tFileOutputDelimited_1","output_marjane","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out_s - " + (out_s==null? "": out_s.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(out_s.SUBS != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.SUBS
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.DATATYPE != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.DATATYPE
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.SALESDATE != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.SALESDATE
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.FROMSITE != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.FROMSITE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.TOSITE != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.TOSITE
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.SERIALNO != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.SERIALNO
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.MODEL != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.MODEL
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.QTY != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.QTY.toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.BRAND != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.BRAND
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.PRODUCT != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.PRODUCT
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.PRICE != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.PRICE
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.DATACOLLECTOR != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.DATACOLLECTOR
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE01 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE01
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE02 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE02
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE03 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE03
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE04 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE04
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE05 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE05
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE06 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE06
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE07 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE07
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE08 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE08
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE09 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE09
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.ATTRIBUTE10 != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.ATTRIBUTE10
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.CREATE_ID != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.CREATE_ID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(out_s.CREATE_DT != null) {
                        sb_tFileOutputDelimited_1.append(
                            out_s.CREATE_DT
                        );
                            }
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
                        log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");




 


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

} // End of branch "out_s"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
	if(conn_tDBInput_1 != null && !conn_tDBInput_1.isClosed()) {
	
	    		log.debug("tDBInput_1 - Closing the connection to the database.");
			
			conn_tDBInput_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_1 - Connection to the database closed.");
			
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
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'out_s': " + count_out_s_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_1","input_Marjane","tOracleInput","tMap_1","tMap_1","tMap","output")) {
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
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	



		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	
				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out_s",2,0,
			 			"tMap_1","tMap_1","tMap","tFileOutputDelimited_1","output_marjane","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tDBInput_2Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
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

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
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
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class copyOfout_sStruct implements routines.system.IPersistableRow<copyOfout_sStruct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];

	
			    public String SUBS;

				public String getSUBS () {
					return this.SUBS;
				}
				
			    public String DATATYPE;

				public String getDATATYPE () {
					return this.DATATYPE;
				}
				
			    public String SALESDATE;

				public String getSALESDATE () {
					return this.SALESDATE;
				}
				
			    public BigDecimal FROMSITE;

				public BigDecimal getFROMSITE () {
					return this.FROMSITE;
				}
				
			    public String TOSITE;

				public String getTOSITE () {
					return this.TOSITE;
				}
				
			    public String SERIALNO;

				public String getSERIALNO () {
					return this.SERIALNO;
				}
				
			    public String MODEL;

				public String getMODEL () {
					return this.MODEL;
				}
				
			    public BigDecimal QTY;

				public BigDecimal getQTY () {
					return this.QTY;
				}
				
			    public String BRAND;

				public String getBRAND () {
					return this.BRAND;
				}
				
			    public String PRODUCT;

				public String getPRODUCT () {
					return this.PRODUCT;
				}
				
			    public String PRICE;

				public String getPRICE () {
					return this.PRICE;
				}
				
			    public String DATACOLLECTOR;

				public String getDATACOLLECTOR () {
					return this.DATACOLLECTOR;
				}
				
			    public String ATTRIBUTE01;

				public String getATTRIBUTE01 () {
					return this.ATTRIBUTE01;
				}
				
			    public String ATTRIBUTE02;

				public String getATTRIBUTE02 () {
					return this.ATTRIBUTE02;
				}
				
			    public String ATTRIBUTE03;

				public String getATTRIBUTE03 () {
					return this.ATTRIBUTE03;
				}
				
			    public String ATTRIBUTE04;

				public String getATTRIBUTE04 () {
					return this.ATTRIBUTE04;
				}
				
			    public String ATTRIBUTE05;

				public String getATTRIBUTE05 () {
					return this.ATTRIBUTE05;
				}
				
			    public String ATTRIBUTE06;

				public String getATTRIBUTE06 () {
					return this.ATTRIBUTE06;
				}
				
			    public String ATTRIBUTE07;

				public String getATTRIBUTE07 () {
					return this.ATTRIBUTE07;
				}
				
			    public String ATTRIBUTE08;

				public String getATTRIBUTE08 () {
					return this.ATTRIBUTE08;
				}
				
			    public String ATTRIBUTE09;

				public String getATTRIBUTE09 () {
					return this.ATTRIBUTE09;
				}
				
			    public String ATTRIBUTE10;

				public String getATTRIBUTE10 () {
					return this.ATTRIBUTE10;
				}
				
			    public String CREATE_ID;

				public String getCREATE_ID () {
					return this.CREATE_ID;
				}
				
			    public String CREATE_DT;

				public String getCREATE_DT () {
					return this.CREATE_DT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SUBS="+SUBS);
		sb.append(",DATATYPE="+DATATYPE);
		sb.append(",SALESDATE="+SALESDATE);
		sb.append(",FROMSITE="+String.valueOf(FROMSITE));
		sb.append(",TOSITE="+TOSITE);
		sb.append(",SERIALNO="+SERIALNO);
		sb.append(",MODEL="+MODEL);
		sb.append(",QTY="+String.valueOf(QTY));
		sb.append(",BRAND="+BRAND);
		sb.append(",PRODUCT="+PRODUCT);
		sb.append(",PRICE="+PRICE);
		sb.append(",DATACOLLECTOR="+DATACOLLECTOR);
		sb.append(",ATTRIBUTE01="+ATTRIBUTE01);
		sb.append(",ATTRIBUTE02="+ATTRIBUTE02);
		sb.append(",ATTRIBUTE03="+ATTRIBUTE03);
		sb.append(",ATTRIBUTE04="+ATTRIBUTE04);
		sb.append(",ATTRIBUTE05="+ATTRIBUTE05);
		sb.append(",ATTRIBUTE06="+ATTRIBUTE06);
		sb.append(",ATTRIBUTE07="+ATTRIBUTE07);
		sb.append(",ATTRIBUTE08="+ATTRIBUTE08);
		sb.append(",ATTRIBUTE09="+ATTRIBUTE09);
		sb.append(",ATTRIBUTE10="+ATTRIBUTE10);
		sb.append(",CREATE_ID="+CREATE_ID);
		sb.append(",CREATE_DT="+CREATE_DT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SUBS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUBS);
            			}
            		
        			sb.append("|");
        		
        				if(DATATYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATATYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SALESDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALESDATE);
            			}
            		
        			sb.append("|");
        		
        				if(FROMSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FROMSITE);
            			}
            		
        			sb.append("|");
        		
        				if(TOSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOSITE);
            			}
            		
        			sb.append("|");
        		
        				if(SERIALNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SERIALNO);
            			}
            		
        			sb.append("|");
        		
        				if(MODEL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODEL);
            			}
            		
        			sb.append("|");
        		
        				if(QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTY);
            			}
            		
        			sb.append("|");
        		
        				if(BRAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BRAND);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(DATACOLLECTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATACOLLECTOR);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE01);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE02);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE03);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE04);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE05);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE06);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE07);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE08);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE09);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE10);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_DT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(copyOfout_sStruct other) {

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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[0];

	
			    public String SUBS;

				public String getSUBS () {
					return this.SUBS;
				}
				
			    public String DATATYPE;

				public String getDATATYPE () {
					return this.DATATYPE;
				}
				
			    public String SALESDATE;

				public String getSALESDATE () {
					return this.SALESDATE;
				}
				
			    public BigDecimal FROMSITE;

				public BigDecimal getFROMSITE () {
					return this.FROMSITE;
				}
				
			    public String TOSITE;

				public String getTOSITE () {
					return this.TOSITE;
				}
				
			    public String SERIALNO;

				public String getSERIALNO () {
					return this.SERIALNO;
				}
				
			    public String MODEL;

				public String getMODEL () {
					return this.MODEL;
				}
				
			    public BigDecimal QTY;

				public BigDecimal getQTY () {
					return this.QTY;
				}
				
			    public String BRAND;

				public String getBRAND () {
					return this.BRAND;
				}
				
			    public String PRODUCT;

				public String getPRODUCT () {
					return this.PRODUCT;
				}
				
			    public String PRICE;

				public String getPRICE () {
					return this.PRICE;
				}
				
			    public String DATACOLLECTOR;

				public String getDATACOLLECTOR () {
					return this.DATACOLLECTOR;
				}
				
			    public String ATTRIBUTE01;

				public String getATTRIBUTE01 () {
					return this.ATTRIBUTE01;
				}
				
			    public String ATTRIBUTE02;

				public String getATTRIBUTE02 () {
					return this.ATTRIBUTE02;
				}
				
			    public String ATTRIBUTE03;

				public String getATTRIBUTE03 () {
					return this.ATTRIBUTE03;
				}
				
			    public String ATTRIBUTE04;

				public String getATTRIBUTE04 () {
					return this.ATTRIBUTE04;
				}
				
			    public String ATTRIBUTE05;

				public String getATTRIBUTE05 () {
					return this.ATTRIBUTE05;
				}
				
			    public String ATTRIBUTE06;

				public String getATTRIBUTE06 () {
					return this.ATTRIBUTE06;
				}
				
			    public String ATTRIBUTE07;

				public String getATTRIBUTE07 () {
					return this.ATTRIBUTE07;
				}
				
			    public String ATTRIBUTE08;

				public String getATTRIBUTE08 () {
					return this.ATTRIBUTE08;
				}
				
			    public String ATTRIBUTE09;

				public String getATTRIBUTE09 () {
					return this.ATTRIBUTE09;
				}
				
			    public String ATTRIBUTE10;

				public String getATTRIBUTE10 () {
					return this.ATTRIBUTE10;
				}
				
			    public String CREATE_ID;

				public String getCREATE_ID () {
					return this.CREATE_ID;
				}
				
			    public String CREATE_DT;

				public String getCREATE_DT () {
					return this.CREATE_DT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_Inventory_Sales_Samsung, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_Inventory_Sales_Samsung) {

        	try {

        		int length = 0;
		
					this.SUBS = readString(dis);
					
					this.DATATYPE = readString(dis);
					
					this.SALESDATE = readString(dis);
					
						this.FROMSITE = (BigDecimal) dis.readObject();
					
					this.TOSITE = readString(dis);
					
					this.SERIALNO = readString(dis);
					
					this.MODEL = readString(dis);
					
						this.QTY = (BigDecimal) dis.readObject();
					
					this.BRAND = readString(dis);
					
					this.PRODUCT = readString(dis);
					
					this.PRICE = readString(dis);
					
					this.DATACOLLECTOR = readString(dis);
					
					this.ATTRIBUTE01 = readString(dis);
					
					this.ATTRIBUTE02 = readString(dis);
					
					this.ATTRIBUTE03 = readString(dis);
					
					this.ATTRIBUTE04 = readString(dis);
					
					this.ATTRIBUTE05 = readString(dis);
					
					this.ATTRIBUTE06 = readString(dis);
					
					this.ATTRIBUTE07 = readString(dis);
					
					this.ATTRIBUTE08 = readString(dis);
					
					this.ATTRIBUTE09 = readString(dis);
					
					this.ATTRIBUTE10 = readString(dis);
					
					this.CREATE_ID = readString(dis);
					
					this.CREATE_DT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.SUBS,dos);
					
					// String
				
						writeString(this.DATATYPE,dos);
					
					// String
				
						writeString(this.SALESDATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FROMSITE);
					
					// String
				
						writeString(this.TOSITE,dos);
					
					// String
				
						writeString(this.SERIALNO,dos);
					
					// String
				
						writeString(this.MODEL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTY);
					
					// String
				
						writeString(this.BRAND,dos);
					
					// String
				
						writeString(this.PRODUCT,dos);
					
					// String
				
						writeString(this.PRICE,dos);
					
					// String
				
						writeString(this.DATACOLLECTOR,dos);
					
					// String
				
						writeString(this.ATTRIBUTE01,dos);
					
					// String
				
						writeString(this.ATTRIBUTE02,dos);
					
					// String
				
						writeString(this.ATTRIBUTE03,dos);
					
					// String
				
						writeString(this.ATTRIBUTE04,dos);
					
					// String
				
						writeString(this.ATTRIBUTE05,dos);
					
					// String
				
						writeString(this.ATTRIBUTE06,dos);
					
					// String
				
						writeString(this.ATTRIBUTE07,dos);
					
					// String
				
						writeString(this.ATTRIBUTE08,dos);
					
					// String
				
						writeString(this.ATTRIBUTE09,dos);
					
					// String
				
						writeString(this.ATTRIBUTE10,dos);
					
					// String
				
						writeString(this.CREATE_ID,dos);
					
					// String
				
						writeString(this.CREATE_DT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SUBS="+SUBS);
		sb.append(",DATATYPE="+DATATYPE);
		sb.append(",SALESDATE="+SALESDATE);
		sb.append(",FROMSITE="+String.valueOf(FROMSITE));
		sb.append(",TOSITE="+TOSITE);
		sb.append(",SERIALNO="+SERIALNO);
		sb.append(",MODEL="+MODEL);
		sb.append(",QTY="+String.valueOf(QTY));
		sb.append(",BRAND="+BRAND);
		sb.append(",PRODUCT="+PRODUCT);
		sb.append(",PRICE="+PRICE);
		sb.append(",DATACOLLECTOR="+DATACOLLECTOR);
		sb.append(",ATTRIBUTE01="+ATTRIBUTE01);
		sb.append(",ATTRIBUTE02="+ATTRIBUTE02);
		sb.append(",ATTRIBUTE03="+ATTRIBUTE03);
		sb.append(",ATTRIBUTE04="+ATTRIBUTE04);
		sb.append(",ATTRIBUTE05="+ATTRIBUTE05);
		sb.append(",ATTRIBUTE06="+ATTRIBUTE06);
		sb.append(",ATTRIBUTE07="+ATTRIBUTE07);
		sb.append(",ATTRIBUTE08="+ATTRIBUTE08);
		sb.append(",ATTRIBUTE09="+ATTRIBUTE09);
		sb.append(",ATTRIBUTE10="+ATTRIBUTE10);
		sb.append(",CREATE_ID="+CREATE_ID);
		sb.append(",CREATE_DT="+CREATE_DT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SUBS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUBS);
            			}
            		
        			sb.append("|");
        		
        				if(DATATYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATATYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SALESDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALESDATE);
            			}
            		
        			sb.append("|");
        		
        				if(FROMSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FROMSITE);
            			}
            		
        			sb.append("|");
        		
        				if(TOSITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOSITE);
            			}
            		
        			sb.append("|");
        		
        				if(SERIALNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SERIALNO);
            			}
            		
        			sb.append("|");
        		
        				if(MODEL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODEL);
            			}
            		
        			sb.append("|");
        		
        				if(QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTY);
            			}
            		
        			sb.append("|");
        		
        				if(BRAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BRAND);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(DATACOLLECTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATACOLLECTOR);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE01);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE02);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE03);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE04);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE05);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE06);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE07);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE08);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE09);
            			}
            		
        			sb.append("|");
        		
        				if(ATTRIBUTE10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ATTRIBUTE10);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATE_DT);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();
copyOfout_sStruct copyOfout_s = new copyOfout_sStruct();





	
	/**
	 * [tFileOutputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_2", false);
		start_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"copyOfout_s");
			
		int tos_count_tFileOutputDelimited_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_2 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_2.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_2.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FILENAME" + " = " + "\"E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS/MCSEDI_C780_ELECTROPLANET_SO_SKU_\"+((String)globalMap.get(\"CurentDate\"))+\".txt\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FIELDSEPARATOR" + " = " + "\"	\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FILE_EXIST_EXCEPTION" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + (log4jParamters_tFileOutputDelimited_2) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_2", "output_ep", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_2 = "";
    fileName_tFileOutputDelimited_2 = (new java.io.File("E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS/MCSEDI_C780_ELECTROPLANET_SO_SKU_"+((String)globalMap.get("CurentDate"))+".txt")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_2 = null;
    String extension_tFileOutputDelimited_2 = null;
    String directory_tFileOutputDelimited_2 = null;
    if((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") < fileName_tFileOutputDelimited_2.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        }
        directory_tFileOutputDelimited_2 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_2 = true;
    java.io.File filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
    globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
    if(filetFileOutputDelimited_2.exists()){
            throw new RuntimeException("The particular file \""+filetFileOutputDelimited_2.getAbsoluteFile() +
            "\" already exist. If you want to overwrite the file, please uncheck the" + 
            " \"Throw an error if the file already exist\" option in Advanced settings.");
        }
            int nb_line_tFileOutputDelimited_2 = 0;
            int splitedFileNo_tFileOutputDelimited_2 = 0;
            int currentRow_tFileOutputDelimited_2 = 0;

            final String OUT_DELIM_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:FIELDSEPARATOR */"	"/** End field tFileOutputDelimited_2:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_2 != null && directory_tFileOutputDelimited_2.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_2 = new java.io.File(directory_tFileOutputDelimited_2);
                        if(!dir_tFileOutputDelimited_2.exists()) {
                                log.info("tFileOutputDelimited_2 - Creating directory '" + dir_tFileOutputDelimited_2.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_2.mkdirs();
                                log.info("tFileOutputDelimited_2 - The directory '"+ dir_tFileOutputDelimited_2.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_2 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
                        if(fileToDelete_tFileOutputDelimited_2.exists()) {
                            fileToDelete_tFileOutputDelimited_2.delete();
                        }
                        outtFileOutputDelimited_2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_2, false),"ISO-8859-15"));
                                    if(filetFileOutputDelimited_2.length()==0){
                                        outtFileOutputDelimited_2.write("SUBS");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("DATATYPE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("SALESDATE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("FROMSITE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("TOSITE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("SERIALNO");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("MODEL");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("QTY");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("BRAND");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PRODUCT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PRICE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("DATACOLLECTOR");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE01");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE02");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE03");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE04");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE05");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE06");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE07");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE08");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE09");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("ATTRIBUTE10");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("CREATE_ID");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("CREATE_DT");
                                        outtFileOutputDelimited_2.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.flush();
                                    }


        resourceMap.put("out_tFileOutputDelimited_2", outtFileOutputDelimited_2);
resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

 



/**
 * [tFileOutputDelimited_2 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
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
				talendJobLog.addCM("tMap_2", "tMap_2", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row2_tMap_2 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_copyOfout_s_tMap_2 = 0;
				
copyOfout_sStruct copyOfout_s_tmp = new copyOfout_sStruct();
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
                            log4jParamters_tDBInput_2.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("DB_VERSION" + " = " + "ORACLE_18");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("HOST" + " = " + "\"192.168.99.98\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PORT" + " = " + "\"1521\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("DBNAME" + " = " + "\"GOLDV5\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USER" + " = " + "\"CENPRD\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:KHnzchtwEDstpBYsTwXTmT2MEtdB3t8P0pM/d6YOhwnZVA==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"select 'C780' subs,  'I' DATATYPE,  TO_CHAR(sysdate-1,'yyyymmdd') SALESDATE,  S.SOCSITE FROMSITE,  null TOSITE,  null SERIALNO,  PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) MODEL,  pkstock.getStockEnQteValADate(stosite,  stocinl ,  trunc(sysdate)-1)QTY,  null BRAND,  null PRODUCT,  null PRICE,  'MARJANE_EDI_IF' DATACOLLECTOR,  REPLACE(pkstrucobj.get_desc(ARVCINR, 'FR'), '\\\"\\\"\\\"\\\"', '') ATTRIBUTE01,  null ATTRIBUTE02,  null ATTRIBUTE03,  null ATTRIBUTE04,  null ATTRIBUTE05,  null ATTRIBUTE06,  null ATTRIBUTE07,  null ATTRIBUTE08,  null ATTRIBUTE09,  null ATTRIBUTE10,  'MARJANE_EDI_IF' CREATE_ID,  TO_CHAR(sysdate,'yyyymmdd') CREATE_DT  from sitdgene s, artuv u, stocouch  where 1 = 1  and U.ARVCEXV = '0'  and (s.socsite > 900 or 800 > s.socsite)  and stosite = s.socsite  and stocinr = u.arvcinr  and exists (select 1  from foucatalog f  where F.FCLCINV = U.ARVCINV  and trunc(sysdate-1) between F.FCLDDEB and F.FCLDFIN  and F.FCLCFIN = 7405)  and s.socchain in(6)  and pkstock.getStockEnQteValADate(stosite,stocinl ,trunc(sysdate)-1)>0  group by u.arvcexr, u.arvcinr, S.SOCSITE, U.ARVCINV,stocinl,stosite  union   select 'C780' subs,  'S' DATATYPE,  TO_CHAR(min(stmdmvt),'yyyymmdd') SALESDATE,  S.SOCSITE FROMSITE,  'EU' TOSITE,  null SERIALNO,  PKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) \\\"MODEL\\\",  NVL(-SUM(STMVAL), 0) QTY,  null BRAND,  null PRODUCT,  null PRICE,  'MARJANE_EDI_IF' DATACOLLECTOR,  REPLACE(pkstrucobj.get_desc(ARVCINR, 'FR'), '\\\"\\\"\\\"\\\"', '') ATTRIBUTE01,  null ATTRIBUTE02,  null ATTRIBUTE03,  null ATTRIBUTE04,  null ATTRIBUTE05,  null ATTRIBUTE06,  null ATTRIBUTE07,  null ATTRIBUTE08,  null ATTRIBUTE09,  null ATTRIBUTE10,  'MARJANE_EDI_IF' CREATE_ID,  TO_CHAR(sysdate,'yyyymmdd') CREATE_DT  from sitdgene s, artuv u, stomvt st, artul a  where 1 = 1  AND st.stmcinl = a.arucinl  and st.stmtmvt BETWEEN 150 AND 174  AND arutypul = 1  and st.stmsite = s.socsite  and a.arucinr = u.arvcinr  and S.SOCCMAG = 10  and U.ARVCEXV = '0'  and (s.socsite > 900 or 800 > s.socsite)  and exists (select 1  from foucatalog f  where F.FCLCINV = U.ARVCINV  and trunc(sysdate) between F.FCLDDEB and F.FCLDFIN  and F.FCLCFIN = 7405)  and s.socchain in(6)  and trunc(stmdmvt) =trunc(sysdate)-1  group by u.arvcinr, u.arvcexr, S.SOCSITE, U.ARVCINV\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USE_CURSOR" + " = " + "true");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("CURSOR_SIZE" + " = " + "1000");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "true");
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
				talendJobLog.addCM("tDBInput_2", "input_electroplanet", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_2);
				
			String url_tDBInput_2 = null;
				url_tDBInput_2 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_2 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:L82ZRIKOLzGAAqZ+VzlQ/oXDCTynF6QqE6BN6WPU0Vf8eA==");

				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;

				
	    		log.debug("tDBInput_2 - Driver ClassName: "+driverClass_tDBInput_2+".");
			
	    		log.debug("tDBInput_2 - Connection attempt to '" + url_tDBInput_2 + "' with the username '" + dbUser_tDBInput_2 + "'.");
			
					conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2,dbUser_tDBInput_2,dbPwd_tDBInput_2);
	    		log.debug("tDBInput_2 - Connection to '" + url_tDBInput_2 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_2 = conn_tDBInput_2.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_2 = stmtGetTZ_tDBInput_2.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_2 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_2.next()) {
					sessionTimezone_tDBInput_2 = rsGetTZ_tDBInput_2.getString(1);
				}
                                if (!(conn_tDBInput_2 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_2.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_2.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_2.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_2);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_2).setSessionTimeZone(sessionTimezone_tDBInput_2);
                                }
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
																					java.sql.ResultSet.CONCUR_READ_ONLY);
			
                stmt_tDBInput_2.setFetchSize(1000);


		    String dbquery_tDBInput_2 = "select 'C780' subs,\n'I' DATATYPE,\nTO_CHAR(sysdate-1,'yyyymmdd') SALESDATE,\nS.SOCSITE FROMSITE,\nnull TOSITE,\nnull S"
+"ERIALNO,\nPKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) MODEL,\npkstock.getStockEnQteValADate(stosite,\nstocinl ,\ntrunc(sysdate)-"
+"1)QTY,\nnull BRAND,\nnull PRODUCT,\nnull PRICE,\n'MARJANE_EDI_IF' DATACOLLECTOR,\nREPLACE(pkstrucobj.get_desc(ARVCINR, '"
+"FR'), '\"\"\"\"', '') ATTRIBUTE01,\nnull ATTRIBUTE02,\nnull ATTRIBUTE03,\nnull ATTRIBUTE04,\nnull ATTRIBUTE05,\nnull ATT"
+"RIBUTE06,\nnull ATTRIBUTE07,\nnull ATTRIBUTE08,\nnull ATTRIBUTE09,\nnull ATTRIBUTE10,\n'MARJANE_EDI_IF' CREATE_ID,\nTO_C"
+"HAR(sysdate,'yyyymmdd') CREATE_DT\nfrom sitdgene s, artuv u, stocouch\nwhere 1 = 1\nand U.ARVCEXV = '0'\nand (s.socsite "
+"> 900 or 800 > s.socsite)\nand stosite = s.socsite\nand stocinr = u.arvcinr\nand exists (select 1\nfrom foucatalog f\nwh"
+"ere F.FCLCINV = U.ARVCINV\nand trunc(sysdate-1) between F.FCLDDEB and F.FCLDFIN\nand F.FCLCFIN = 7405)\nand s.socchain i"
+"n(6)\nand pkstock.getStockEnQteValADate(stosite,stocinl ,trunc(sysdate)-1)>0\ngroup by u.arvcexr, u.arvcinr, S.SOCSITE, "
+"U.ARVCINV,stocinl,stosite\nunion \nselect 'C780' subs,\n'S' DATATYPE,\nTO_CHAR(min(stmdmvt),'yyyymmdd') SALESDATE,\nS.SO"
+"CSITE FROMSITE,\n'EU' TOSITE,\nnull SERIALNO,\nPKARTCOCA.GET_CLOSESTEAN(U.ARVCINV) \"MODEL\",\nNVL(-SUM(STMVAL), 0) QTY,"
+"\nnull BRAND,\nnull PRODUCT,\nnull PRICE,\n'MARJANE_EDI_IF' DATACOLLECTOR,\nREPLACE(pkstrucobj.get_desc(ARVCINR, 'FR'), "
+"'\"\"\"\"', '') ATTRIBUTE01,\nnull ATTRIBUTE02,\nnull ATTRIBUTE03,\nnull ATTRIBUTE04,\nnull ATTRIBUTE05,\nnull ATTRIBUTE"
+"06,\nnull ATTRIBUTE07,\nnull ATTRIBUTE08,\nnull ATTRIBUTE09,\nnull ATTRIBUTE10,\n'MARJANE_EDI_IF' CREATE_ID,\nTO_CHAR(sy"
+"sdate,'yyyymmdd') CREATE_DT\nfrom sitdgene s, artuv u, stomvt st, artul a\nwhere 1 = 1\nAND st.stmcinl = a.arucinl\nand "
+"st.stmtmvt BETWEEN 150 AND 174\nAND arutypul = 1\nand st.stmsite = s.socsite\nand a.arucinr = u.arvcinr\nand S.SOCCMAG ="
+" 10\nand U.ARVCEXV = '0'\nand (s.socsite > 900 or 800 > s.socsite)\nand exists (select 1\nfrom foucatalog f\nwhere F.FCL"
+"CINV = U.ARVCINV\nand trunc(sysdate) between F.FCLDDEB and F.FCLDFIN\nand F.FCLCFIN = 7405)\nand s.socchain in(6)\nand t"
+"runc(stmdmvt) =trunc(sysdate)-1\ngroup by u.arvcinr, u.arvcexr, S.SOCSITE, U.ARVCINV";
		    
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
								row2.SUBS = null;
							} else {
	                         		
        	row2.SUBS = routines.system.JDBCUtil.getString(rs_tDBInput_2, 1, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row2.DATATYPE = null;
							} else {
	                         		
        	row2.DATATYPE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row2.SALESDATE = null;
							} else {
	                         		
        	row2.SALESDATE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row2.FROMSITE = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(4) != null) {
						row2.FROMSITE = rs_tDBInput_2.getBigDecimal(4);
					} else {
				
						row2.FROMSITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row2.TOSITE = null;
							} else {
	                         		
        	row2.TOSITE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row2.SERIALNO = null;
							} else {
	                         		
        	row2.SERIALNO = routines.system.JDBCUtil.getString(rs_tDBInput_2, 6, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row2.MODEL = null;
							} else {
	                         		
        	row2.MODEL = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								row2.QTY = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(8) != null) {
						row2.QTY = rs_tDBInput_2.getBigDecimal(8);
					} else {
				
						row2.QTY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								row2.BRAND = null;
							} else {
	                         		
        	row2.BRAND = routines.system.JDBCUtil.getString(rs_tDBInput_2, 9, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								row2.PRODUCT = null;
							} else {
	                         		
        	row2.PRODUCT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 10, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								row2.PRICE = null;
							} else {
	                         		
        	row2.PRICE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 11, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 12) {
								row2.DATACOLLECTOR = null;
							} else {
	                         		
        	row2.DATACOLLECTOR = routines.system.JDBCUtil.getString(rs_tDBInput_2, 12, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 13) {
								row2.ATTRIBUTE01 = null;
							} else {
	                         		
        	row2.ATTRIBUTE01 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 13, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 14) {
								row2.ATTRIBUTE02 = null;
							} else {
	                         		
        	row2.ATTRIBUTE02 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 14, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 15) {
								row2.ATTRIBUTE03 = null;
							} else {
	                         		
        	row2.ATTRIBUTE03 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 15, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 16) {
								row2.ATTRIBUTE04 = null;
							} else {
	                         		
        	row2.ATTRIBUTE04 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 16, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 17) {
								row2.ATTRIBUTE05 = null;
							} else {
	                         		
        	row2.ATTRIBUTE05 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 17, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 18) {
								row2.ATTRIBUTE06 = null;
							} else {
	                         		
        	row2.ATTRIBUTE06 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 18, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 19) {
								row2.ATTRIBUTE07 = null;
							} else {
	                         		
        	row2.ATTRIBUTE07 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 19, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 20) {
								row2.ATTRIBUTE08 = null;
							} else {
	                         		
        	row2.ATTRIBUTE08 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 20, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 21) {
								row2.ATTRIBUTE09 = null;
							} else {
	                         		
        	row2.ATTRIBUTE09 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 21, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 22) {
								row2.ATTRIBUTE10 = null;
							} else {
	                         		
        	row2.ATTRIBUTE10 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 22, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 23) {
								row2.CREATE_ID = null;
							} else {
	                         		
        	row2.CREATE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_2, 23, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 24) {
								row2.CREATE_DT = null;
							} else {
	                         		
        	row2.CREATE_DT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 24, true);
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
				
					,"row2","tDBInput_2","input_electroplanet","tOracleInput","tMap_2","tMap_2","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
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

copyOfout_s = null;


// # Output table : 'copyOfout_s'
count_copyOfout_s_tMap_2++;

copyOfout_s_tmp.SUBS = row2.SUBS ;
copyOfout_s_tmp.DATATYPE = row2.DATATYPE ;
copyOfout_s_tmp.SALESDATE = row2.SALESDATE ;
copyOfout_s_tmp.FROMSITE = row2.FROMSITE ;
copyOfout_s_tmp.TOSITE = row2.TOSITE ;
copyOfout_s_tmp.SERIALNO = row2.SERIALNO ;
copyOfout_s_tmp.MODEL = row2.MODEL ;
copyOfout_s_tmp.QTY = row2.QTY ;
copyOfout_s_tmp.BRAND = row2.BRAND ;
copyOfout_s_tmp.PRODUCT = row2.PRODUCT ;
copyOfout_s_tmp.PRICE = row2.PRICE ;
copyOfout_s_tmp.DATACOLLECTOR = row2.DATACOLLECTOR ;
copyOfout_s_tmp.ATTRIBUTE01 = row2.ATTRIBUTE01 ;
copyOfout_s_tmp.ATTRIBUTE02 = row2.ATTRIBUTE02 ;
copyOfout_s_tmp.ATTRIBUTE03 = row2.ATTRIBUTE03 ;
copyOfout_s_tmp.ATTRIBUTE04 = row2.ATTRIBUTE04 ;
copyOfout_s_tmp.ATTRIBUTE05 = row2.ATTRIBUTE05 ;
copyOfout_s_tmp.ATTRIBUTE06 = row2.ATTRIBUTE06 ;
copyOfout_s_tmp.ATTRIBUTE07 = row2.ATTRIBUTE07 ;
copyOfout_s_tmp.ATTRIBUTE08 = row2.ATTRIBUTE08 ;
copyOfout_s_tmp.ATTRIBUTE09 = row2.ATTRIBUTE09 ;
copyOfout_s_tmp.ATTRIBUTE10 = row2.ATTRIBUTE10 ;
copyOfout_s_tmp.CREATE_ID = row2.CREATE_ID ;
copyOfout_s_tmp.CREATE_DT = row2.CREATE_DT ;
copyOfout_s = copyOfout_s_tmp;
log.debug("tMap_2 - Outputting the record " + count_copyOfout_s_tMap_2 + " of the output table 'copyOfout_s'.");

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
// Start of branch "copyOfout_s"
if(copyOfout_s != null) { 



	
	/**
	 * [tFileOutputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"copyOfout_s","tMap_2","tMap_2","tMap","tFileOutputDelimited_2","output_ep","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("copyOfout_s - " + (copyOfout_s==null? "": copyOfout_s.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
                            if(copyOfout_s.SUBS != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.SUBS
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.DATATYPE != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.DATATYPE
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.SALESDATE != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.SALESDATE
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.FROMSITE != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.FROMSITE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.TOSITE != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.TOSITE
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.SERIALNO != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.SERIALNO
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.MODEL != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.MODEL
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.QTY != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.QTY.toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.BRAND != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.BRAND
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.PRODUCT != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.PRODUCT
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.PRICE != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.PRICE
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.DATACOLLECTOR != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.DATACOLLECTOR
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE01 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE01
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE02 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE02
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE03 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE03
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE04 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE04
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE05 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE05
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE06 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE06
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE07 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE07
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE08 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE08
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE09 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE09
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.ATTRIBUTE10 != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.ATTRIBUTE10
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.CREATE_ID != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.CREATE_ID
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(copyOfout_s.CREATE_DT != null) {
                        sb_tFileOutputDelimited_2.append(
                            copyOfout_s.CREATE_DT
                        );
                            }
                    sb_tFileOutputDelimited_2.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);


                    nb_line_tFileOutputDelimited_2++;
                    resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

                        outtFileOutputDelimited_2.write(sb_tFileOutputDelimited_2.toString());
                        log.debug("tFileOutputDelimited_2 - Writing the record " + nb_line_tFileOutputDelimited_2 + ".");




 


	tos_count_tFileOutputDelimited_2++;

/**
 * [tFileOutputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	

 



/**
 * [tFileOutputDelimited_2 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	

 



/**
 * [tFileOutputDelimited_2 process_data_end ] stop
 */

} // End of branch "copyOfout_s"




	
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
	if(conn_tDBInput_2 != null && !conn_tDBInput_2.isClosed()) {
	
	    		log.debug("tDBInput_2 - Closing the connection to the database.");
			
			conn_tDBInput_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_2 - Connection to the database closed.");
			
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
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'copyOfout_s': " + count_copyOfout_s_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tDBInput_2","input_electroplanet","tOracleInput","tMap_2","tMap_2","tMap","output")) {
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
	 * [tFileOutputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	



		
			
					if(outtFileOutputDelimited_2!=null) {
						outtFileOutputDelimited_2.flush();
						outtFileOutputDelimited_2.close();
					}
				
				globalMap.put("tFileOutputDelimited_2_NB_LINE",nb_line_tFileOutputDelimited_2);
				globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_2", true);
	
				log.debug("tFileOutputDelimited_2 - Written records count: " + nb_line_tFileOutputDelimited_2 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"copyOfout_s",2,0,
			 			"tMap_2","tMap_2","tMap","tFileOutputDelimited_2","output_ep","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_2", true);
end_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_2 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tFTPConnection_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
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
	 * [tFileOutputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	


		if(resourceMap.get("finish_tFileOutputDelimited_2") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_2 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_2");
						if(outtFileOutputDelimited_2!=null) {
							outtFileOutputDelimited_2.flush();
							outtFileOutputDelimited_2.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_2 finally ] stop
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFTPConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFTPConnection_1", false);
		start_Hash.put("tFTPConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tFTPConnection_1";

	
		int tos_count_tFTPConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFTPConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFTPConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFTPConnection_1 = new StringBuilder();
                    log4jParamters_tFTPConnection_1.append("Parameters:");
                            log4jParamters_tFTPConnection_1.append("HOST" + " = " + "\"192.168.9.205\"");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("PORT" + " = " + "22");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("USER" + " = " + "\"edi\"");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:AXe9p29W0gKrL/kPNLhL7LJ1argaWA2YXURdcTYAxpA9UAmKQmBl0w==").substring(0, 4) + "...");     
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
                if(log.isDebugEnabled())
            log.debug("tFTPConnection_1 - "  + (log4jParamters_tFTPConnection_1) );
                    } 
                } 
            new BytesLimit65535_tFTPConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFTPConnection_1", "tFTPConnection_1", "tFTPConnection");
				talendJobLogProcess(globalMap);
			}
			

 
int connectionTimeout_tFTPConnection_1 = Integer.valueOf(0);
	class MyUserInfo implements com.jcraft.jsch.UserInfo, com.jcraft.jsch.UIKeyboardInteractive {
 
      		String decryptedPassphrase_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:KkFaBoZgJ63VxENFhmgJC5JP7qF1rEhc53q7+e0BNFKnmA==");

		String passphrase_tFTPConnection_1 = decryptedPassphrase_tFTPConnection_1;

		public String getPassphrase() { return passphrase_tFTPConnection_1; }

		public boolean promptPassword(String arg0) { return true; } 

		public boolean promptPassphrase(String arg0) { return true; } 

		public boolean promptYesNo(String arg0) { return true; } 

		public void showMessage(String arg0) { } 

		public String[] promptKeyboardInteractive(String destination, String name, String instruction, String[] prompt,
		boolean[] echo) {
			return new String[] {getPassword()};
		}

		public String getPassword() {
			
				

				 
	final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Xp6Fx+3d+rUp58Fw1cDNyV+XZ0jQ0tsVehrAc518TmTjBIRgZBDVbQ==");

				return decryptedPassword_tFTPConnection_1;
			
		}
	};
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
    session_tFTPConnection_1.setConfig("PreferredAuthentications", "publickey,password,keyboard-interactive,gssapi-with-mic");

            log.info("tFTPConnection_1 - SFTP authentication using a password.");
 
	final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:VZEPLc3GjXFJLus8fEd774Xtx+7IEp4R9ZVGWcLkxhuN/EloIvGr+w==");

        session_tFTPConnection_1.setPassword(decryptedPassword_tFTPConnection_1); 

    session_tFTPConnection_1.setUserInfo(defaultUserInfo_tFTPConnection_1); 
        if(("true").equals(System.getProperty("http.proxySet"))) {

//check if the host is in the excludes for proxy
    boolean isHostIgnored_tFTPConnection_1 = false;
    String nonProxyHostsString_tFTPConnection_1 = System.getProperty("http.nonProxyHosts");
    String[] nonProxyHosts_tFTPConnection_1 = (nonProxyHostsString_tFTPConnection_1 == null) ? new String[0] : nonProxyHostsString_tFTPConnection_1.split("\\|");
    for (String nonProxyHost : nonProxyHosts_tFTPConnection_1) {
        if (("192.168.9.205").matches(nonProxyHost.trim())) {
            isHostIgnored_tFTPConnection_1 = true;
            break;
        }
    }
            if (!isHostIgnored_tFTPConnection_1) {
                com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(System.getProperty("http.proxyHost"),Integer.parseInt(System.getProperty("http.proxyPort")));
                if(!"".equals(System.getProperty("http.proxyUser"))){
                    proxy_tFTPConnection_1.setUserPasswd(System.getProperty("http.proxyUser"),System.getProperty("http.proxyPassword"));
                }
                session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
            }
        } else if ("local".equals(System.getProperty("http.proxySet"))) {
            String uriString = "192.168.9.205" + ":" + 22;
            java.net.Proxy proxyToUse = org.talend.proxy.TalendProxySelector.getInstance().getProxyForUriString(uriString);

            if (!proxyToUse.equals(java.net.Proxy.NO_PROXY)) {
                java.net.InetSocketAddress proxyAddress = (java.net.InetSocketAddress) proxyToUse.address();
                String proxyHost = proxyAddress.getAddress().getHostAddress();
                int proxyPort = proxyAddress.getPort();

                com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(proxyHost, proxyPort);

                org.talend.proxy.ProxyCreds proxyCreds = org.talend.proxy.TalendProxyAuthenticator.getInstance().getCredsForProxyURI(proxyHost + ":" + proxyPort);
                if (proxyCreds != null) {
                    proxy_tFTPConnection_1.setUserPasswd(proxyCreds.getUser(), proxyCreds.getPass());
                }

                session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
            }
        }

        log.info("tFTPConnection_1 - Attempt to connect to  '" + "192.168.9.205" + "' with username '" + "edi" + "'.");

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
            if(channel_tFTPConnection_1!=null) {
                channel_tFTPConnection_1.disconnect();
            }

            if(session_tFTPConnection_1!=null) {
                session_tFTPConnection_1.disconnect();
            }
        } catch(java.lang.Exception ce_tFTPConnection_1) {
                log.warn("tFTPConnection_1 - close sftp connection failed : " + ce_tFTPConnection_1.getClass() + " : " + ce_tFTPConnection_1.getMessage());
        }

        String message_tFTPConnection_1 = new TalendException(null, null, null).getExceptionCauseMessage(e_tFTPConnection_1);
        if(message_tFTPConnection_1.contains("Signature length not correct") || message_tFTPConnection_1.contains("connection is closed by foreign host")) {
            retry_tFTPConnection_1 = true;
            retry_count_tFTPConnection_1++;
            log.info("tFTPConnection_1 - connect: Signature length not correct or connection is closed by foreign host, so retry, retry time : " + retry_count_tFTPConnection_1);
        } else {
            throw e_tFTPConnection_1;
        }
    }
} while(retry_tFTPConnection_1 && (retry_count_tFTPConnection_1 < retry_max_tFTPConnection_1));

com.jcraft.jsch.ChannelSftp c_tFTPConnection_1 = (com.jcraft.jsch.ChannelSftp)channel_tFTPConnection_1;
	
	
	
	globalMap.put("conn_tFTPConnection_1", c_tFTPConnection_1);

 



/**
 * [tFTPConnection_1 begin ] stop
 */
	
	/**
	 * [tFTPConnection_1 main ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";

	

 


	tos_count_tFTPConnection_1++;

/**
 * [tFTPConnection_1 main ] stop
 */
	
	/**
	 * [tFTPConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";

	

 



/**
 * [tFTPConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tFTPConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";

	

 



/**
 * [tFTPConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tFTPConnection_1 end ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tFTPConnection_1 - "  + ("Done.") );

ok_Hash.put("tFTPConnection_1", true);
end_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tFTPPut_1Process(globalMap);
				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tFTPPut_2Process(globalMap);



/**
 * [tFTPConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFTPConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";

	

 



/**
 * [tFTPConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tFTPPut_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFTPPut_1", false);
		start_Hash.put("tFTPPut_1", System.currentTimeMillis());
		
	
	currentComponent="tFTPPut_1";

	
		int tos_count_tFTPPut_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFTPPut_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFTPPut_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFTPPut_1 = new StringBuilder();
                    log4jParamters_tFTPPut_1.append("Parameters:");
                            log4jParamters_tFTPPut_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("CONNECTION" + " = " + "tFTPConnection_1");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("LOCALDIR" + " = " + "\"E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS\"");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("REMOTEDIR" + " = " + "\"/uploads_edi/Marjane/OUT\"");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("CREATE_DIR_IF_NOT_EXIST" + " = " + "false");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("SFTPOVERWRITE" + " = " + "overwrite");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("PERL5_REGEX" + " = " + "false");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("FILES" + " = " + "[{FILEMASK="+("\"MCSEDI_C780_MARJANE_*\"")+", NEWNAME="+("\"\"")+"}]");
                        log4jParamters_tFTPPut_1.append(" | ");
                            log4jParamters_tFTPPut_1.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tFTPPut_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFTPPut_1 - "  + (log4jParamters_tFTPPut_1) );
                    } 
                } 
            new BytesLimit65535_tFTPPut_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFTPPut_1", "tFTPPut_1", "tFTPPut");
				talendJobLogProcess(globalMap);
			}
			


int nb_file_tFTPPut_1 = 0;
// *** sftp *** //

	class MyProgressMonitor_tFTPPut_1 implements com.jcraft.jsch.SftpProgressMonitor {
		public void init(int op, String src, String dest, long max) {}
    	public boolean count(long count) { return true;}
    	public void end() {}
  	}

	
    	com.jcraft.jsch.ChannelSftp c_tFTPPut_1 = (com.jcraft.jsch.ChannelSftp)globalMap.get("conn_tFTPConnection_1");
		
			if(c_tFTPPut_1!=null && c_tFTPPut_1.getSession()!=null) {
				log.info("tFTPPut_1 - Uses an existing connection. Connection username " + c_tFTPPut_1.getSession().getUserName() + ", Connection hostname: " + c_tFTPPut_1.getSession().getHost() + ", Connection port: " + c_tFTPPut_1.getSession().getPort() + "."); 
			}
		
    	if(c_tFTPPut_1.getHome()!=null && !c_tFTPPut_1.getHome().equals(c_tFTPPut_1.pwd())){
  			c_tFTPPut_1.cd(c_tFTPPut_1.getHome());
  		}
	

	// because there is not the same method in JSch class as FTPClient class, define a list here
	java.util.List<String> msg_tFTPPut_1 = new java.util.ArrayList<String>();
	com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_1 = new MyProgressMonitor_tFTPPut_1();
	java.util.List<java.util.Map<String,String>> listtFTPPut_1 = new java.util.ArrayList<java.util.Map<String,String>>();
  
			java.util.Map<String,String> maptFTPPut_10 = new java.util.HashMap<String,String>();
		    maptFTPPut_10.put("MCSEDI_C780_MARJANE_*", "");    
		    listtFTPPut_1.add(maptFTPPut_10);         
	String localdirtFTPPut_1 = "E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS";
	
		log.info("tFTPPut_1 - Putting file to the server.");
	
	
	class StatCheck_tFTPPut_1 {
			
			boolean statOK(com.jcraft.jsch.ChannelSftp client, String path) {
					try {
							return client.stat(path).getAtimeString() != null;
					} catch (Exception e) {
globalMap.put("tFTPPut_1_ERROR_MESSAGE",e.getMessage());
							
							log.warn("tFTPPut_1 - Directory or file permission denied for checking the status of the path : " + path);
							
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

	

	
	
	currentComponent="tFTPPut_1";

	

try{
        globalMap.put("tFTPPut_1_CURRENT_STATUS", "No file transfered.");
        java.util.Set<String> keySettFTPPut_1 = maptFTPPut_1.keySet();
        for (String keytFTPPut_1 : keySettFTPPut_1){
            if(keytFTPPut_1 == null || "".equals(keytFTPPut_1)){
                    log.error("tFTPPut_1 - file name invalid!");
                System.err.println("file name invalid!");
                continue;
            }
            String tempdirtFTPPut_1 =  localdirtFTPPut_1;
            String filemasktFTPPut_1 = keytFTPPut_1;
            String dirtFTPPut_1 = null;
                String masktFTPPut_1 = filemasktFTPPut_1.replaceAll("\\\\", "/") ;
            int itFTPPut_1 = masktFTPPut_1.lastIndexOf('/');
            if (itFTPPut_1!=-1){
                dirtFTPPut_1 = masktFTPPut_1.substring(0, itFTPPut_1);
                masktFTPPut_1 = masktFTPPut_1.substring(itFTPPut_1+1);
            }
            if (dirtFTPPut_1!=null && !"".equals(dirtFTPPut_1)) tempdirtFTPPut_1 = tempdirtFTPPut_1 + "/" + dirtFTPPut_1;
                masktFTPPut_1 = masktFTPPut_1.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");
            final String finalMasktFTPPut_1 = masktFTPPut_1;
            java.io.File[] listingstFTPPut_1 = null;
            java.io.File filetFTPPut_1 = new java.io.File(tempdirtFTPPut_1);
            if (filetFTPPut_1.isDirectory()) {
                listingstFTPPut_1 = filetFTPPut_1.listFiles(new java.io.FileFilter() {
                    public boolean accept(java.io.File pathname) {
                        boolean result = false;
                        if (pathname != null && pathname.isFile()) {
                                result = java.util.regex.Pattern.compile(finalMasktFTPPut_1).matcher(pathname.getName()).find();
                            }
                        return result;
                    }
                });
            }
            if(listingstFTPPut_1 != null && listingstFTPPut_1.length > 0){
                for (int mtFTPPut_1 = 0; mtFTPPut_1 < listingstFTPPut_1.length; mtFTPPut_1++){
                    if (listingstFTPPut_1[mtFTPPut_1].getName().matches(masktFTPPut_1)){

                        int modetFTPPut_1 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
                        boolean putSuccess_tFTPPut_1 = false;
                        
                        String remoteDir_tFTPPut_1 = "/uploads_edi/Marjane/OUT";
                        if(remoteDir_tFTPPut_1==null) {
                        		remoteDir_tFTPPut_1 = "";
                        }
                        remoteDir_tFTPPut_1 = remoteDir_tFTPPut_1.trim();
                        if(remoteDir_tFTPPut_1.endsWith("/")) {
                        		remoteDir_tFTPPut_1 = remoteDir_tFTPPut_1.substring(0, remoteDir_tFTPPut_1.length()-1);
                        }
                        String destRename_tFTPPut_1 =  maptFTPPut_1.get(keytFTPPut_1);
                        final String dest_tFTPPut_1;
                        if (destRename_tFTPPut_1 == null || destRename_tFTPPut_1.isEmpty()) {
                            dest_tFTPPut_1 = remoteDir_tFTPPut_1 + "/" + listingstFTPPut_1[mtFTPPut_1].getName();
                        }
                        else {
                            dest_tFTPPut_1 = remoteDir_tFTPPut_1 + "/" + destRename_tFTPPut_1;
                        }
                        
                        try{
                            c_tFTPPut_1.put(listingstFTPPut_1[mtFTPPut_1].getAbsolutePath(), dest_tFTPPut_1, monitortFTPPut_1, modetFTPPut_1);
                            // add info to list will return
                            msg_tFTPPut_1.add("file: " + listingstFTPPut_1[mtFTPPut_1].getAbsolutePath() + ", size: "
                                + listingstFTPPut_1[mtFTPPut_1].length() + " bytes upload successfully");
                                log.debug("tFTPPut_1 - Uploaded file '" + listingstFTPPut_1[mtFTPPut_1].getName() + "' successfully.");
                            globalMap.put("tFTPPut_1_CURRENT_STATUS", "File transfer OK.");
                            
                            putSuccess_tFTPPut_1 = true;
                            
                            if(sc_tFTPPut_1.statOK(c_tFTPPut_1, dest_tFTPPut_1)){
                                globalMap.put("tFTPPut_1_CURRENT_FILE_EXISTS",true);
                            }
                        }catch(com.jcraft.jsch.SftpException e_tFTPPut_1) {
globalMap.put("tFTPPut_1_ERROR_MESSAGE",e_tFTPPut_1.getMessage());
                            if (e_tFTPPut_1.id != 4 &&   // if exception is not resume (normal) pb.
                                (e_tFTPPut_1.getMessage() == null || !e_tFTPPut_1.getMessage().startsWith("failed to resume"))) { 
                                log.error("tFTPPut_1 - File transfer fail."+e_tFTPPut_1.getMessage());
                            globalMap.put("tFTPPut_1_CURRENT_STATUS", "File transfer fail.");
                            
                            if(!putSuccess_tFTPPut_1) {
                                if(sc_tFTPPut_1.statOK(c_tFTPPut_1, dest_tFTPPut_1)){
                                    globalMap.put("tFTPPut_1_CURRENT_FILE_EXISTS",true);
                                }
                            }
                            throw(e_tFTPPut_1);
                        } // end if exception not resume pb
                        }catch(java.lang.Exception e_tFTPPut_1){
globalMap.put("tFTPPut_1_ERROR_MESSAGE",e_tFTPPut_1.getMessage());
                           if(!(e_tFTPPut_1 instanceof com.jcraft.jsch.SftpException)) {
                                msg_tFTPPut_1.add("file " + listingstFTPPut_1[mtFTPPut_1].getAbsolutePath() + " not found?");

                                globalMap.put("tFTPPut_1_CURRENT_FILE_EXISTS",false);
                            }
                            throw e_tFTPPut_1;
                        }
                        nb_file_tFTPPut_1++;
                    }
                }
            }else{
                    log.warn("tFTPPut_1 - No matches found for mask '" + keytFTPPut_1 + "'!");
                System.err.println("No matches found for mask '" + keytFTPPut_1 + "'!");
            }
                    }

    }catch(java.lang.Exception e_tFTPPut_1){
globalMap.put("tFTPPut_1_ERROR_MESSAGE",e_tFTPPut_1.getMessage());
            msg_tFTPPut_1.add("file not found?: " + e_tFTPPut_1.getMessage());
            throw(e_tFTPPut_1);
    }

 


	tos_count_tFTPPut_1++;

/**
 * [tFTPPut_1 main ] stop
 */
	
	/**
	 * [tFTPPut_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFTPPut_1";

	

 



/**
 * [tFTPPut_1 process_data_begin ] stop
 */
	
	/**
	 * [tFTPPut_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFTPPut_1";

	

 



/**
 * [tFTPPut_1 process_data_end ] stop
 */
	
	/**
	 * [tFTPPut_1 end ] start
	 */

	

	
	
	currentComponent="tFTPPut_1";

	

 	}
    msg_tFTPPut_1.add(nb_file_tFTPPut_1 + " files have been uploaded.");  
    	
	StringBuffer sb_tFTPPut_1 = new StringBuffer();
    for (String item_tFTPPut_1 : msg_tFTPPut_1) {
        sb_tFTPPut_1.append(item_tFTPPut_1).append("\n");
    }
	globalMap.put("tFTPPut_1_TRANSFER_MESSAGES", sb_tFTPPut_1.toString());
        if(nb_file_tFTPPut_1 == 0 && !listtFTPPut_1.isEmpty()){
            throw new RuntimeException("Error during component operation!");
        }
	
	
globalMap.put("tFTPPut_1_NB_FILE",nb_file_tFTPPut_1);
	log.info("tFTPPut_1 - Uploaded files count: " + nb_file_tFTPPut_1 +  ".");
    if(nb_file_tFTPPut_1 == 0 && !listtFTPPut_1.isEmpty()){
        throw new RuntimeException("Error during component operation!");
    }

 
                if(log.isDebugEnabled())
            log.debug("tFTPPut_1 - "  + ("Done.") );

ok_Hash.put("tFTPPut_1", true);
end_Hash.put("tFTPPut_1", System.currentTimeMillis());




/**
 * [tFTPPut_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFTPPut_1 finally ] start
	 */

	

	
	
	currentComponent="tFTPPut_1";

	

 



/**
 * [tFTPPut_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tFTPPut_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFTPPut_2", false);
		start_Hash.put("tFTPPut_2", System.currentTimeMillis());
		
	
	currentComponent="tFTPPut_2";

	
		int tos_count_tFTPPut_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFTPPut_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFTPPut_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFTPPut_2 = new StringBuilder();
                    log4jParamters_tFTPPut_2.append("Parameters:");
                            log4jParamters_tFTPPut_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("CONNECTION" + " = " + "tFTPConnection_1");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("LOCALDIR" + " = " + "\"E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS\"");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("REMOTEDIR" + " = " + "\"/uploads_edi/EP/OUT\"");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("CREATE_DIR_IF_NOT_EXIST" + " = " + "false");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("SFTPOVERWRITE" + " = " + "overwrite");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("PERL5_REGEX" + " = " + "false");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("FILES" + " = " + "[{FILEMASK="+("\"MCSEDI_C780_ELECTROPLANET_*\"")+", NEWNAME="+("\"\"")+"}]");
                        log4jParamters_tFTPPut_2.append(" | ");
                            log4jParamters_tFTPPut_2.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tFTPPut_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFTPPut_2 - "  + (log4jParamters_tFTPPut_2) );
                    } 
                } 
            new BytesLimit65535_tFTPPut_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFTPPut_2", "tFTPPut_2", "tFTPPut");
				talendJobLogProcess(globalMap);
			}
			


int nb_file_tFTPPut_2 = 0;
// *** sftp *** //

	class MyProgressMonitor_tFTPPut_2 implements com.jcraft.jsch.SftpProgressMonitor {
		public void init(int op, String src, String dest, long max) {}
    	public boolean count(long count) { return true;}
    	public void end() {}
  	}

	
    	com.jcraft.jsch.ChannelSftp c_tFTPPut_2 = (com.jcraft.jsch.ChannelSftp)globalMap.get("conn_tFTPConnection_1");
		
			if(c_tFTPPut_2!=null && c_tFTPPut_2.getSession()!=null) {
				log.info("tFTPPut_2 - Uses an existing connection. Connection username " + c_tFTPPut_2.getSession().getUserName() + ", Connection hostname: " + c_tFTPPut_2.getSession().getHost() + ", Connection port: " + c_tFTPPut_2.getSession().getPort() + "."); 
			}
		
    	if(c_tFTPPut_2.getHome()!=null && !c_tFTPPut_2.getHome().equals(c_tFTPPut_2.pwd())){
  			c_tFTPPut_2.cd(c_tFTPPut_2.getHome());
  		}
	

	// because there is not the same method in JSch class as FTPClient class, define a list here
	java.util.List<String> msg_tFTPPut_2 = new java.util.ArrayList<String>();
	com.jcraft.jsch.SftpProgressMonitor monitortFTPPut_2 = new MyProgressMonitor_tFTPPut_2();
	java.util.List<java.util.Map<String,String>> listtFTPPut_2 = new java.util.ArrayList<java.util.Map<String,String>>();
  
			java.util.Map<String,String> maptFTPPut_20 = new java.util.HashMap<String,String>();
		    maptFTPPut_20.put("MCSEDI_C780_ELECTROPLANET_*", "");    
		    listtFTPPut_2.add(maptFTPPut_20);         
	String localdirtFTPPut_2 = "E:/Talend/OUTPUT FILES/SUMSUNG PRT FRNS";
	
		log.info("tFTPPut_2 - Putting file to the server.");
	
	
	class StatCheck_tFTPPut_2 {
			
			boolean statOK(com.jcraft.jsch.ChannelSftp client, String path) {
					try {
							return client.stat(path).getAtimeString() != null;
					} catch (Exception e) {
globalMap.put("tFTPPut_2_ERROR_MESSAGE",e.getMessage());
							
							log.warn("tFTPPut_2 - Directory or file permission denied for checking the status of the path : " + path);
							
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

	

	
	
	currentComponent="tFTPPut_2";

	

try{
        globalMap.put("tFTPPut_2_CURRENT_STATUS", "No file transfered.");
        java.util.Set<String> keySettFTPPut_2 = maptFTPPut_2.keySet();
        for (String keytFTPPut_2 : keySettFTPPut_2){
            if(keytFTPPut_2 == null || "".equals(keytFTPPut_2)){
                    log.error("tFTPPut_2 - file name invalid!");
                System.err.println("file name invalid!");
                continue;
            }
            String tempdirtFTPPut_2 =  localdirtFTPPut_2;
            String filemasktFTPPut_2 = keytFTPPut_2;
            String dirtFTPPut_2 = null;
                String masktFTPPut_2 = filemasktFTPPut_2.replaceAll("\\\\", "/") ;
            int itFTPPut_2 = masktFTPPut_2.lastIndexOf('/');
            if (itFTPPut_2!=-1){
                dirtFTPPut_2 = masktFTPPut_2.substring(0, itFTPPut_2);
                masktFTPPut_2 = masktFTPPut_2.substring(itFTPPut_2+1);
            }
            if (dirtFTPPut_2!=null && !"".equals(dirtFTPPut_2)) tempdirtFTPPut_2 = tempdirtFTPPut_2 + "/" + dirtFTPPut_2;
                masktFTPPut_2 = masktFTPPut_2.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");
            final String finalMasktFTPPut_2 = masktFTPPut_2;
            java.io.File[] listingstFTPPut_2 = null;
            java.io.File filetFTPPut_2 = new java.io.File(tempdirtFTPPut_2);
            if (filetFTPPut_2.isDirectory()) {
                listingstFTPPut_2 = filetFTPPut_2.listFiles(new java.io.FileFilter() {
                    public boolean accept(java.io.File pathname) {
                        boolean result = false;
                        if (pathname != null && pathname.isFile()) {
                                result = java.util.regex.Pattern.compile(finalMasktFTPPut_2).matcher(pathname.getName()).find();
                            }
                        return result;
                    }
                });
            }
            if(listingstFTPPut_2 != null && listingstFTPPut_2.length > 0){
                for (int mtFTPPut_2 = 0; mtFTPPut_2 < listingstFTPPut_2.length; mtFTPPut_2++){
                    if (listingstFTPPut_2[mtFTPPut_2].getName().matches(masktFTPPut_2)){

                        int modetFTPPut_2 = com.jcraft.jsch.ChannelSftp.OVERWRITE;
                        boolean putSuccess_tFTPPut_2 = false;
                        
                        String remoteDir_tFTPPut_2 = "/uploads_edi/EP/OUT";
                        if(remoteDir_tFTPPut_2==null) {
                        		remoteDir_tFTPPut_2 = "";
                        }
                        remoteDir_tFTPPut_2 = remoteDir_tFTPPut_2.trim();
                        if(remoteDir_tFTPPut_2.endsWith("/")) {
                        		remoteDir_tFTPPut_2 = remoteDir_tFTPPut_2.substring(0, remoteDir_tFTPPut_2.length()-1);
                        }
                        String destRename_tFTPPut_2 =  maptFTPPut_2.get(keytFTPPut_2);
                        final String dest_tFTPPut_2;
                        if (destRename_tFTPPut_2 == null || destRename_tFTPPut_2.isEmpty()) {
                            dest_tFTPPut_2 = remoteDir_tFTPPut_2 + "/" + listingstFTPPut_2[mtFTPPut_2].getName();
                        }
                        else {
                            dest_tFTPPut_2 = remoteDir_tFTPPut_2 + "/" + destRename_tFTPPut_2;
                        }
                        
                        try{
                            c_tFTPPut_2.put(listingstFTPPut_2[mtFTPPut_2].getAbsolutePath(), dest_tFTPPut_2, monitortFTPPut_2, modetFTPPut_2);
                            // add info to list will return
                            msg_tFTPPut_2.add("file: " + listingstFTPPut_2[mtFTPPut_2].getAbsolutePath() + ", size: "
                                + listingstFTPPut_2[mtFTPPut_2].length() + " bytes upload successfully");
                                log.debug("tFTPPut_2 - Uploaded file '" + listingstFTPPut_2[mtFTPPut_2].getName() + "' successfully.");
                            globalMap.put("tFTPPut_2_CURRENT_STATUS", "File transfer OK.");
                            
                            putSuccess_tFTPPut_2 = true;
                            
                            if(sc_tFTPPut_2.statOK(c_tFTPPut_2, dest_tFTPPut_2)){
                                globalMap.put("tFTPPut_2_CURRENT_FILE_EXISTS",true);
                            }
                        }catch(com.jcraft.jsch.SftpException e_tFTPPut_2) {
globalMap.put("tFTPPut_2_ERROR_MESSAGE",e_tFTPPut_2.getMessage());
                            if (e_tFTPPut_2.id != 4 &&   // if exception is not resume (normal) pb.
                                (e_tFTPPut_2.getMessage() == null || !e_tFTPPut_2.getMessage().startsWith("failed to resume"))) { 
                                log.error("tFTPPut_2 - File transfer fail."+e_tFTPPut_2.getMessage());
                            globalMap.put("tFTPPut_2_CURRENT_STATUS", "File transfer fail.");
                            
                            if(!putSuccess_tFTPPut_2) {
                                if(sc_tFTPPut_2.statOK(c_tFTPPut_2, dest_tFTPPut_2)){
                                    globalMap.put("tFTPPut_2_CURRENT_FILE_EXISTS",true);
                                }
                            }
                            throw(e_tFTPPut_2);
                        } // end if exception not resume pb
                        }catch(java.lang.Exception e_tFTPPut_2){
globalMap.put("tFTPPut_2_ERROR_MESSAGE",e_tFTPPut_2.getMessage());
                           if(!(e_tFTPPut_2 instanceof com.jcraft.jsch.SftpException)) {
                                msg_tFTPPut_2.add("file " + listingstFTPPut_2[mtFTPPut_2].getAbsolutePath() + " not found?");

                                globalMap.put("tFTPPut_2_CURRENT_FILE_EXISTS",false);
                            }
                            throw e_tFTPPut_2;
                        }
                        nb_file_tFTPPut_2++;
                    }
                }
            }else{
                    log.warn("tFTPPut_2 - No matches found for mask '" + keytFTPPut_2 + "'!");
                System.err.println("No matches found for mask '" + keytFTPPut_2 + "'!");
            }
                    }

    }catch(java.lang.Exception e_tFTPPut_2){
globalMap.put("tFTPPut_2_ERROR_MESSAGE",e_tFTPPut_2.getMessage());
            msg_tFTPPut_2.add("file not found?: " + e_tFTPPut_2.getMessage());
            throw(e_tFTPPut_2);
    }

 


	tos_count_tFTPPut_2++;

/**
 * [tFTPPut_2 main ] stop
 */
	
	/**
	 * [tFTPPut_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFTPPut_2";

	

 



/**
 * [tFTPPut_2 process_data_begin ] stop
 */
	
	/**
	 * [tFTPPut_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFTPPut_2";

	

 



/**
 * [tFTPPut_2 process_data_end ] stop
 */
	
	/**
	 * [tFTPPut_2 end ] start
	 */

	

	
	
	currentComponent="tFTPPut_2";

	

 	}
    msg_tFTPPut_2.add(nb_file_tFTPPut_2 + " files have been uploaded.");  
    	
	StringBuffer sb_tFTPPut_2 = new StringBuffer();
    for (String item_tFTPPut_2 : msg_tFTPPut_2) {
        sb_tFTPPut_2.append(item_tFTPPut_2).append("\n");
    }
	globalMap.put("tFTPPut_2_TRANSFER_MESSAGES", sb_tFTPPut_2.toString());
        if(nb_file_tFTPPut_2 == 0 && !listtFTPPut_2.isEmpty()){
            throw new RuntimeException("Error during component operation!");
        }
	
	
globalMap.put("tFTPPut_2_NB_FILE",nb_file_tFTPPut_2);
	log.info("tFTPPut_2 - Uploaded files count: " + nb_file_tFTPPut_2 +  ".");
    if(nb_file_tFTPPut_2 == 0 && !listtFTPPut_2.isEmpty()){
        throw new RuntimeException("Error during component operation!");
    }

 
                if(log.isDebugEnabled())
            log.debug("tFTPPut_2 - "  + ("Done.") );

ok_Hash.put("tFTPPut_2", true);
end_Hash.put("tFTPPut_2", System.currentTimeMillis());




/**
 * [tFTPPut_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFTPPut_2 finally ] start
	 */

	

	
	
	currentComponent="tFTPPut_2";

	

 



/**
 * [tFTPPut_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFTPPut_2_SUBPROCESS_STATE", 1);
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
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
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


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final Inventory_Sales_Samsung Inventory_Sales_SamsungClass = new Inventory_Sales_Samsung();

        int exitCode = Inventory_Sales_SamsungClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'Inventory_Sales_Samsung' - Done.");
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
        	log.info("TalendJob: 'Inventory_Sales_Samsung' - Start.");
    	
    	
    	
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

        if (inOSGi) {
            java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

            if (jobProperties != null && jobProperties.get("context") != null) {
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = Inventory_Sales_Samsung.class.getClassLoader().getResourceAsStream("bi_team_projects/inventory_sales_samsung_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = Inventory_Sales_Samsung.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
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
                        context.setContextType("mdp", "id_String");
                        if(context.getStringValue("mdp") == null) {
                            context.mdp = null;
                        } else {
                            context.mdp=(String) context.getProperty("mdp");
                        }
                        context.setContextType("ENVIRONNEMENT", "id_String");
                        if(context.getStringValue("ENVIRONNEMENT") == null) {
                            context.ENVIRONNEMENT = null;
                        } else {
                            context.ENVIRONNEMENT=(String) context.getProperty("ENVIRONNEMENT");
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
                        context.setContextType("mdp_ods", "id_String");
                        if(context.getStringValue("mdp_ods") == null) {
                            context.mdp_ods = null;
                        } else {
                            context.mdp_ods=(String) context.getProperty("mdp_ods");
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
                context.mdp = (String) parentContextMap.get("mdp");
            }if (parentContextMap.containsKey("ENVIRONNEMENT")) {
                context.ENVIRONNEMENT = (String) parentContextMap.get("ENVIRONNEMENT");
            }if (parentContextMap.containsKey("host_ods")) {
                context.host_ods = (String) parentContextMap.get("host_ods");
            }if (parentContextMap.containsKey("sid_ods")) {
                context.sid_ods = (String) parentContextMap.get("sid_ods");
            }if (parentContextMap.containsKey("port_ods")) {
                context.port_ods = (String) parentContextMap.get("port_ods");
            }if (parentContextMap.containsKey("user_ods")) {
                context.user_ods = (String) parentContextMap.get("user_ods");
            }if (parentContextMap.containsKey("mdp_ods")) {
                context.mdp_ods = (String) parentContextMap.get("mdp_ods");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
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




		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tSetGlobalVar_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tSetGlobalVar_2) {
globalMap.put("tSetGlobalVar_2_SUBPROCESS_STATE", -1);

e_tSetGlobalVar_2.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Inventory_Sales_Samsung");
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
 *     292486 characters generated by Talend Cloud Data Management Platform 
 *     on the 26 juillet 2022 à 15:49:14 WEST
 ************************************************************************************************/