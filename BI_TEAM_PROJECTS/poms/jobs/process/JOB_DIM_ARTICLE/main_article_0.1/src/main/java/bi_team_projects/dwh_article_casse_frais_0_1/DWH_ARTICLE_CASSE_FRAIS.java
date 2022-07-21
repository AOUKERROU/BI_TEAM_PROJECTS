
package bi_team_projects.dwh_article_casse_frais_0_1;

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
 * Job: DWH_ARTICLE_CASSE_FRAIS Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status 
 */
public class DWH_ARTICLE_CASSE_FRAIS implements TalendJob {
	static {System.setProperty("TalendJob.log", "DWH_ARTICLE_CASSE_FRAIS.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(DWH_ARTICLE_CASSE_FRAIS.class);
	

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
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
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
	private final String jobName = "DWH_ARTICLE_CASSE_FRAIS";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_ZgTl4EoyEeyu587m9MMbOQ", "0.1");
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

	LogCatcherUtils talendLogs_LOGS = new LogCatcherUtils();
	StatCatcherUtils talendStats_STATS = new StatCatcherUtils("_ZgTl4EoyEeyu587m9MMbOQ", "0.1");
	MetterCatcherUtils talendMeter_METTER = new MetterCatcherUtils("_ZgTl4EoyEeyu587m9MMbOQ", "0.1");

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
				DWH_ARTICLE_CASSE_FRAIS.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(DWH_ARTICLE_CASSE_FRAIS.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
				talendLogs_LOGS.addMessage("Java Exception", currentComponent, 6, e.getClass().getName() + ":" + e.getMessage(), 1);
				talendLogs_LOGSProcess(globalMap);
			}
			} catch (TalendException e) {
				// do nothing
			
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void preStaLogCon_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					preStaLogCon_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void connectionStatsLogs_Commit_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					connectionStatsLogs_Commit_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void connectionStatsLogs_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					connectionStatsLogs_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendStats_STATS_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendStats_DB_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendStats_DB_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendStats_STATS_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendLogs_LOGS_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendLogs_DB_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendLogs_DB_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendLogs_LOGS_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendMeter_METTER_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendMeter_DB_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendMeter_DB_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendMeter_METTER_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void preStaLogCon_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void connectionStatsLogs_Commit_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void connectionStatsLogs_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendStats_STATS_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendLogs_LOGS_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendMeter_METTER_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	


public void preStaLogConProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("preStaLogCon_SUBPROCESS_STATE", 0);

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
	 * [preStaLogCon begin ] start
	 */

	

	
		
		ok_Hash.put("preStaLogCon", false);
		start_Hash.put("preStaLogCon", System.currentTimeMillis());
		
	
	currentComponent="preStaLogCon";

	
		int tos_count_preStaLogCon = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("preStaLogCon", "preStaLogCon", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [preStaLogCon begin ] stop
 */
	
	/**
	 * [preStaLogCon main ] start
	 */

	

	
	
	currentComponent="preStaLogCon";

	

 


	tos_count_preStaLogCon++;

/**
 * [preStaLogCon main ] stop
 */
	
	/**
	 * [preStaLogCon process_data_begin ] start
	 */

	

	
	
	currentComponent="preStaLogCon";

	

 



/**
 * [preStaLogCon process_data_begin ] stop
 */
	
	/**
	 * [preStaLogCon process_data_end ] start
	 */

	

	
	
	currentComponent="preStaLogCon";

	

 



/**
 * [preStaLogCon process_data_end ] stop
 */
	
	/**
	 * [preStaLogCon end ] start
	 */

	

	
	
	currentComponent="preStaLogCon";

	

 

ok_Hash.put("preStaLogCon", true);
end_Hash.put("preStaLogCon", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("after_preStaLogCon_connectionStatsLogs", 0, "ok");
				}
				connectionStatsLogsProcess(globalMap);



/**
 * [preStaLogCon end ] stop
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
	 * [preStaLogCon finally ] start
	 */

	

	
	
	currentComponent="preStaLogCon";

	

 



/**
 * [preStaLogCon finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("preStaLogCon_SUBPROCESS_STATE", 1);
	}
	


public static class out4Struct implements routines.system.IPersistableRow<out4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public BigDecimal IDM;

				public BigDecimal getIDM () {
					return this.IDM;
				}
				
			    public String CODE_CAISSE;

				public String getCODE_CAISSE () {
					return this.CODE_CAISSE;
				}
				
			    public BigDecimal CINR;

				public BigDecimal getCINR () {
					return this.CINR;
				}
				
			    public BigDecimal CINV;

				public BigDecimal getCINV () {
					return this.CINV;
				}
				
			    public java.util.Date DATE_DEBUT;

				public java.util.Date getDATE_DEBUT () {
					return this.DATE_DEBUT;
				}
				
			    public java.util.Date DATE_FIN;

				public java.util.Date getDATE_FIN () {
					return this.DATE_FIN;
				}
				
			    public String NUM_OPR;

				public String getNUM_OPR () {
					return this.NUM_OPR;
				}
				
			    public BigDecimal PK_SITE;

				public BigDecimal getPK_SITE () {
					return this.PK_SITE;
				}
				
			    public BigDecimal PK_ARTICLE;

				public BigDecimal getPK_ARTICLE () {
					return this.PK_ARTICLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.IDM = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.PK_ARTICLE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.IDM = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.PK_ARTICLE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.IDM);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_ARTICLE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.IDM);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_ARTICLE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("IDM="+String.valueOf(IDM));
		sb.append(",CODE_CAISSE="+CODE_CAISSE);
		sb.append(",CINR="+String.valueOf(CINR));
		sb.append(",CINV="+String.valueOf(CINV));
		sb.append(",DATE_DEBUT="+String.valueOf(DATE_DEBUT));
		sb.append(",DATE_FIN="+String.valueOf(DATE_FIN));
		sb.append(",NUM_OPR="+NUM_OPR);
		sb.append(",PK_SITE="+String.valueOf(PK_SITE));
		sb.append(",PK_ARTICLE="+String.valueOf(PK_ARTICLE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(IDM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDM);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(CINR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINR);
            			}
            		
        			sb.append("|");
        		
        				if(CINV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINV);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_DEBUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_DEBUT);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_FIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_FIN);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_OPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_OPR);
            			}
            		
        			sb.append("|");
        		
        				if(PK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(PK_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out4Struct other) {

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

public static class out3Struct implements routines.system.IPersistableRow<out3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public BigDecimal IDM;

				public BigDecimal getIDM () {
					return this.IDM;
				}
				
			    public String CODE_CAISSE;

				public String getCODE_CAISSE () {
					return this.CODE_CAISSE;
				}
				
			    public BigDecimal CINR;

				public BigDecimal getCINR () {
					return this.CINR;
				}
				
			    public BigDecimal CINV;

				public BigDecimal getCINV () {
					return this.CINV;
				}
				
			    public java.util.Date DATE_DEBUT;

				public java.util.Date getDATE_DEBUT () {
					return this.DATE_DEBUT;
				}
				
			    public java.util.Date DATE_FIN;

				public java.util.Date getDATE_FIN () {
					return this.DATE_FIN;
				}
				
			    public String NUM_OPR;

				public String getNUM_OPR () {
					return this.NUM_OPR;
				}
				
			    public BigDecimal PK_SITE;

				public BigDecimal getPK_SITE () {
					return this.PK_SITE;
				}
				
			    public BigDecimal PK_ARTICLE;

				public BigDecimal getPK_ARTICLE () {
					return this.PK_ARTICLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.IDM = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.PK_ARTICLE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.IDM = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.PK_ARTICLE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.IDM);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_ARTICLE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.IDM);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_ARTICLE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("IDM="+String.valueOf(IDM));
		sb.append(",CODE_CAISSE="+CODE_CAISSE);
		sb.append(",CINR="+String.valueOf(CINR));
		sb.append(",CINV="+String.valueOf(CINV));
		sb.append(",DATE_DEBUT="+String.valueOf(DATE_DEBUT));
		sb.append(",DATE_FIN="+String.valueOf(DATE_FIN));
		sb.append(",NUM_OPR="+NUM_OPR);
		sb.append(",PK_SITE="+String.valueOf(PK_SITE));
		sb.append(",PK_ARTICLE="+String.valueOf(PK_ARTICLE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(IDM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDM);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(CINR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINR);
            			}
            		
        			sb.append("|");
        		
        				if(CINV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINV);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_DEBUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_DEBUT);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_FIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_FIN);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_OPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_OPR);
            			}
            		
        			sb.append("|");
        		
        				if(PK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(PK_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out3Struct other) {

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

public static class out2Struct implements routines.system.IPersistableRow<out2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public BigDecimal SITE;

				public BigDecimal getSITE () {
					return this.SITE;
				}
				
			    public String CODE_CAISSE;

				public String getCODE_CAISSE () {
					return this.CODE_CAISSE;
				}
				
			    public BigDecimal CINR;

				public BigDecimal getCINR () {
					return this.CINR;
				}
				
			    public BigDecimal CINV;

				public BigDecimal getCINV () {
					return this.CINV;
				}
				
			    public java.util.Date DATE_DEBUT;

				public java.util.Date getDATE_DEBUT () {
					return this.DATE_DEBUT;
				}
				
			    public java.util.Date DATE_FIN;

				public java.util.Date getDATE_FIN () {
					return this.DATE_FIN;
				}
				
			    public String NUM_OPR;

				public String getNUM_OPR () {
					return this.NUM_OPR;
				}
				
			    public BigDecimal LEVEL3_ID;

				public BigDecimal getLEVEL3_ID () {
					return this.LEVEL3_ID;
				}
				
			    public BigDecimal PK_SITE;

				public BigDecimal getPK_SITE () {
					return this.PK_SITE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SITE="+String.valueOf(SITE));
		sb.append(",CODE_CAISSE="+CODE_CAISSE);
		sb.append(",CINR="+String.valueOf(CINR));
		sb.append(",CINV="+String.valueOf(CINV));
		sb.append(",DATE_DEBUT="+String.valueOf(DATE_DEBUT));
		sb.append(",DATE_FIN="+String.valueOf(DATE_FIN));
		sb.append(",NUM_OPR="+NUM_OPR);
		sb.append(",LEVEL3_ID="+String.valueOf(LEVEL3_ID));
		sb.append(",PK_SITE="+String.valueOf(PK_SITE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SITE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(CINR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINR);
            			}
            		
        			sb.append("|");
        		
        				if(CINV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINV);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_DEBUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_DEBUT);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_FIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_FIN);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_OPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_OPR);
            			}
            		
        			sb.append("|");
        		
        				if(LEVEL3_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEVEL3_ID);
            			}
            		
        			sb.append("|");
        		
        				if(PK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_SITE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out2Struct other) {

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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public BigDecimal SITE;

				public BigDecimal getSITE () {
					return this.SITE;
				}
				
			    public String CODE_CAISSE;

				public String getCODE_CAISSE () {
					return this.CODE_CAISSE;
				}
				
			    public BigDecimal CINR;

				public BigDecimal getCINR () {
					return this.CINR;
				}
				
			    public BigDecimal CINV;

				public BigDecimal getCINV () {
					return this.CINV;
				}
				
			    public java.util.Date DATE_DEBUT;

				public java.util.Date getDATE_DEBUT () {
					return this.DATE_DEBUT;
				}
				
			    public java.util.Date DATE_FIN;

				public java.util.Date getDATE_FIN () {
					return this.DATE_FIN;
				}
				
			    public String NUM_OPR;

				public String getNUM_OPR () {
					return this.NUM_OPR;
				}
				
			    public BigDecimal LEVEL3_ID;

				public BigDecimal getLEVEL3_ID () {
					return this.LEVEL3_ID;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SITE="+String.valueOf(SITE));
		sb.append(",CODE_CAISSE="+CODE_CAISSE);
		sb.append(",CINR="+String.valueOf(CINR));
		sb.append(",CINV="+String.valueOf(CINV));
		sb.append(",DATE_DEBUT="+String.valueOf(DATE_DEBUT));
		sb.append(",DATE_FIN="+String.valueOf(DATE_FIN));
		sb.append(",NUM_OPR="+NUM_OPR);
		sb.append(",LEVEL3_ID="+String.valueOf(LEVEL3_ID));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SITE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(CINR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINR);
            			}
            		
        			sb.append("|");
        		
        				if(CINV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINV);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_DEBUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_DEBUT);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_FIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_FIN);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_OPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_OPR);
            			}
            		
        			sb.append("|");
        		
        				if(LEVEL3_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEVEL3_ID);
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

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public BigDecimal SITE;

				public BigDecimal getSITE () {
					return this.SITE;
				}
				
			    public String CODE_CAISSE;

				public String getCODE_CAISSE () {
					return this.CODE_CAISSE;
				}
				
			    public BigDecimal CINR;

				public BigDecimal getCINR () {
					return this.CINR;
				}
				
			    public BigDecimal CINV;

				public BigDecimal getCINV () {
					return this.CINV;
				}
				
			    public java.util.Date DATE_DEBUT;

				public java.util.Date getDATE_DEBUT () {
					return this.DATE_DEBUT;
				}
				
			    public java.util.Date DATE_FIN;

				public java.util.Date getDATE_FIN () {
					return this.DATE_FIN;
				}
				
			    public String NUM_OPR;

				public String getNUM_OPR () {
					return this.NUM_OPR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SITE="+String.valueOf(SITE));
		sb.append(",CODE_CAISSE="+CODE_CAISSE);
		sb.append(",CINR="+String.valueOf(CINR));
		sb.append(",CINV="+String.valueOf(CINV));
		sb.append(",DATE_DEBUT="+String.valueOf(DATE_DEBUT));
		sb.append(",DATE_FIN="+String.valueOf(DATE_FIN));
		sb.append(",NUM_OPR="+NUM_OPR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SITE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(CINR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINR);
            			}
            		
        			sb.append("|");
        		
        				if(CINV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINV);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_DEBUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_DEBUT);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_FIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_FIN);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_OPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_OPR);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public BigDecimal SITE;

				public BigDecimal getSITE () {
					return this.SITE;
				}
				
			    public String CODE_CAISSE;

				public String getCODE_CAISSE () {
					return this.CODE_CAISSE;
				}
				
			    public BigDecimal CINR;

				public BigDecimal getCINR () {
					return this.CINR;
				}
				
			    public BigDecimal CINV;

				public BigDecimal getCINV () {
					return this.CINV;
				}
				
			    public java.util.Date DATE_DEBUT;

				public java.util.Date getDATE_DEBUT () {
					return this.DATE_DEBUT;
				}
				
			    public java.util.Date DATE_FIN;

				public java.util.Date getDATE_FIN () {
					return this.DATE_FIN;
				}
				
			    public String NUM_OPR;

				public String getNUM_OPR () {
					return this.NUM_OPR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.SITE = (BigDecimal) dis.readObject();
					
					this.CODE_CAISSE = readString(dis);
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.NUM_OPR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.SITE);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SITE="+String.valueOf(SITE));
		sb.append(",CODE_CAISSE="+CODE_CAISSE);
		sb.append(",CINR="+String.valueOf(CINR));
		sb.append(",CINV="+String.valueOf(CINV));
		sb.append(",DATE_DEBUT="+String.valueOf(DATE_DEBUT));
		sb.append(",DATE_FIN="+String.valueOf(DATE_FIN));
		sb.append(",NUM_OPR="+NUM_OPR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SITE);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(CINR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINR);
            			}
            		
        			sb.append("|");
        		
        				if(CINV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINV);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_DEBUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_DEBUT);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_FIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_FIN);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_OPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_OPR);
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


		tDBInput_2Process(globalMap);
		tDBInput_3Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_5Process(globalMap);

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
out2Struct out2 = new out2Struct();
out3Struct out3 = new out3Struct();
out4Struct out4 = new out4Struct();








	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out4");
			
		int tos_count_tDBOutput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_1 = new StringBuilder();
                    log4jParamters_tDBOutput_1.append("Parameters:");
                            log4jParamters_tDBOutput_1.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLESCHEMA" + " = " + "\"DW\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:8WOpho2B2sQqJebg+k/DC08emMacYzFXoiMuJp2UoRP1swk=").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"DWH_ARTICLE_CASSE_FRAIS\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("COMMIT_EVERY" + " = " + "10000");
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
                            log4jParamters_tDBOutput_1.append("USE_BATCH_SIZE" + " = " + "false");
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
				talendJobLog.addCM("tDBOutput_1", "CASSE FRAIS", "tOracleOutput");
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
                    String driverClass_tDBOutput_1 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_1)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_1);
                String url_tDBOutput_1 = null;
                    url_tDBOutput_1 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_1 = "dw";
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:31th6Cs8V3yXADs0uoeG0JQcP3tqfuiKFbcem8H98ZC7LpI=");

                String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;
                dbschema_tDBOutput_1 = "DW";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection attempts to '")  + (url_tDBOutput_1)  + ("' with the username '")  + (dbUser_tDBOutput_1)  + ("'.") );

                    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1, dbUser_tDBOutput_1, dbPwd_tDBOutput_1);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection to '")  + (url_tDBOutput_1)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
            conn_tDBOutput_1.setAutoCommit(false);
            int commitEvery_tDBOutput_1 = 10000;
            int commitCounter_tDBOutput_1 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_1.getAutoCommit())  + ("'.") );
        int count_tDBOutput_1=0;

        if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
            tableName_tDBOutput_1 = ("DWH_ARTICLE_CASSE_FRAIS");
        } else {
            tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "." + ("DWH_ARTICLE_CASSE_FRAIS");
        }
                String insert_tDBOutput_1 = "INSERT INTO " + tableName_tDBOutput_1 + " (IDM,CODE_CAISSE,CINR,CINV,DATE_DEBUT,DATE_FIN,NUM_OPR,PK_SITE,PK_ARTICLE) VALUES (?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
                        resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);





 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out3");
			
		int tos_count_tMap_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_4{
                    public void limitLog4jByte() throws Exception{
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
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + (log4jParamters_tMap_4) );
                    } 
                } 
            new BytesLimit65535_tMap_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_4", "tMap_4", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_out3_tMap_4 = 0;
		
		int count_row6_tMap_4 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
					globalMap.get( "tHash_Lookup_row6" ))
					;					
					
	

row6Struct row6HashKey = new row6Struct();
row6Struct row6Default = new row6Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out4_tMap_4 = 0;
				
out4Struct out4_tmp = new out4Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out2");
			
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
		int count_out2_tMap_3 = 0;
		
		int count_row4_tMap_3 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out3_tMap_3 = 0;
				
out3Struct out3_tmp = new out3Struct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out1");
			
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
		int count_out1_tMap_2 = 0;
		
		int count_row3_tMap_2 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out2_tMap_2 = 0;
				
out2Struct out2_tmp = new out2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
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
		
		int count_row2_tMap_1 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
					globalMap.get( "tHash_Lookup_row2" ))
					;					
					
	

row2Struct row2HashKey = new row2Struct();
row2Struct row2Default = new row2Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out1_tMap_1 = 0;
				
out1Struct out1_tmp = new out1Struct();
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
                            log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:yXT5TWLIEdhpgUJ5EEHd9OQMbDEDUS94PHCsbCJ3L7xuTQ==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select t.arssite site, t.arscodecf code_caisse, t.arscinr cinr, t.arscinv cinv, v.ocfddeb date_debut, v.ocfdfin date_fin, v.ocflibope num_opr from artcocasit t, opecfvf v where t.arssite= v.ocfsite and t.arsnumope= v.ocfnumope and  v.ocfddeb>=sysdate-30\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("SITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_CAISSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CINR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CINV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_DEBUT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_FIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NUM_OPR")+"}]");
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
				talendJobLog.addCM("tDBInput_1", "ORACLE_GOLD", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_1);
				
			String url_tDBInput_1 = null;
				url_tDBInput_1 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_1 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:U6pOVSssHVmBORFnWzVjDYjQ+H0v9m7I1RefmS25qaHceA==");

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
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "select t.arssite site, t.arscodecf code_caisse, t.arscinr cinr, t.arscinv cinv, v.ocfddeb date_debut, v.ocfdfin date_fi"
+"n, v.ocflibope num_opr from artcocasit t, opecfvf v where t.arssite= v.ocfsite and t.arsnumope= v.ocfnumope and  v.ocfdd"
+"eb>=sysdate-30";
		    
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
								row1.SITE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(1) != null) {
						row1.SITE = rs_tDBInput_1.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.CODE_CAISSE = null;
							} else {
	                         		
        	row1.CODE_CAISSE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.CINR = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(3) != null) {
						row1.CINR = rs_tDBInput_1.getBigDecimal(3);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.CINV = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(4) != null) {
						row1.CINV = rs_tDBInput_1.getBigDecimal(4);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.DATE_DEBUT = null;
							} else {
										
			row1.DATE_DEBUT = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 5);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.DATE_FIN = null;
							} else {
										
			row1.DATE_FIN = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 6);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.NUM_OPR = null;
							} else {
	                         		
        	row1.NUM_OPR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 7, false);
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
				
					,"row1","tDBInput_1","ORACLE_GOLD","tOracleInput","tMap_1","tMap_1","tMap"
				
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
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow2 = false;
       		  	    	
       		  	    	
 							row2Struct row2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    row2HashKey.ID_ENTITE_GOLD = row1.SITE ;
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.ID_ENTITE_GOLD = '" + row2HashKey.ID_ENTITE_GOLD + "'");
								} // G 071
							

							row2Struct row2 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row2Struct fromLookup_row2 = null;
							row2 = row2Default;
										 
							
								 
							
							
								if (tHash_Lookup_row2 !=null && tHash_Lookup_row2.hasNext()) { // G 099
								
							
								
								fromLookup_row2 = tHash_Lookup_row2.next();

							
							
								} // G 099
							
							

							if(fromLookup_row2 != null) {
								row2 = fromLookup_row2;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

out1 = null;


// # Output table : 'out1'
count_out1_tMap_1++;

out1_tmp.SITE = row1.SITE ;
out1_tmp.CODE_CAISSE = row1.CODE_CAISSE ;
out1_tmp.CINR = row1.CINR ;
out1_tmp.CINV = row1.CINV ;
out1_tmp.DATE_DEBUT = row1.DATE_DEBUT ;
out1_tmp.DATE_FIN = row1.DATE_FIN ;
out1_tmp.NUM_OPR = row1.NUM_OPR ;
out1_tmp.LEVEL3_ID = row2.LEVEL3_ID == null ?new BigDecimal(-1):row2.LEVEL3_ID ;
out1 = out1_tmp;
log.debug("tMap_1 - Outputting the record " + count_out1_tMap_1 + " of the output table 'out1'.");

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
// Start of branch "out1"
if(out1 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out1","tMap_1","tMap_1","tMap","tMap_2","tMap_2","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out1 - " + (out1==null? "": out1.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
                        		    		    row3HashKey.LEVEL3_ID = out1.LEVEL3_ID ;
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.LEVEL3_ID = '" + row3HashKey.LEVEL3_ID + "'");
								} // G 071
							

							row3Struct row3 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row3Struct fromLookup_row3 = null;
							row3 = row3Default;
										 
							
								 
							
							
								if (tHash_Lookup_row3 !=null && tHash_Lookup_row3.hasNext()) { // G 099
								
							
								
								fromLookup_row3 = tHash_Lookup_row3.next();

							
							
								} // G 099
							
							

							if(fromLookup_row3 != null) {
								row3 = fromLookup_row3;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

out2 = null;


// # Output table : 'out2'
count_out2_tMap_2++;

out2_tmp.SITE = out1.SITE ;
out2_tmp.CODE_CAISSE = out1.CODE_CAISSE ;
out2_tmp.CINR = out1.CINR ;
out2_tmp.CINV = out1.CINV ;
out2_tmp.DATE_DEBUT = out1.DATE_DEBUT ;
out2_tmp.DATE_FIN = out1.DATE_FIN ;
out2_tmp.NUM_OPR = out1.NUM_OPR ;
out2_tmp.LEVEL3_ID = out1.LEVEL3_ID ;
out2_tmp.PK_SITE = row3.PK_SITE ;
out2 = out2_tmp;
log.debug("tMap_2 - Outputting the record " + count_out2_tMap_2 + " of the output table 'out2'.");

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
// Start of branch "out2"
if(out2 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out2","tMap_2","tMap_2","tMap","tMap_3","tMap_3","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out2 - " + (out2==null? "": out2.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row4HashKey.ID_ARTICLE_INR = out2.CINR ;
                        		    		
                        		    		    row4HashKey.ID_ARTICLE_INV = out2.CINV ;
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.ID_ARTICLE_INR = '" + row4HashKey.ID_ARTICLE_INR + "', row4.ID_ARTICLE_INV = '" + row4HashKey.ID_ARTICLE_INV + "'");
								} // G 071
							

							row4Struct row4 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row4Struct fromLookup_row4 = null;
							row4 = row4Default;
										 
							
								 
							
							
								if (tHash_Lookup_row4 !=null && tHash_Lookup_row4.hasNext()) { // G 099
								
							
								
								fromLookup_row4 = tHash_Lookup_row4.next();

							
							
								} // G 099
							
							

							if(fromLookup_row4 != null) {
								row4 = fromLookup_row4;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

out3 = null;


// # Output table : 'out3'
count_out3_tMap_3++;

out3_tmp.IDM = out2.SITE ;
out3_tmp.CODE_CAISSE = out2.CODE_CAISSE ;
out3_tmp.CINR = out2.CINR ;
out3_tmp.CINV = out2.CINV ;
out3_tmp.DATE_DEBUT = out2.DATE_DEBUT ;
out3_tmp.DATE_FIN = out2.DATE_FIN ;
out3_tmp.NUM_OPR = out2.NUM_OPR ;
out3_tmp.PK_SITE = out2.PK_SITE ;
out3_tmp.PK_ARTICLE = row4.PK_ARTICLE ;
out3 = out3_tmp;
log.debug("tMap_3 - Outputting the record " + count_out3_tMap_3 + " of the output table 'out3'.");

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
// Start of branch "out3"
if(out3 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out3","tMap_3","tMap_3","tMap","tMap_4","tMap_4","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out3 - " + (out3==null? "": out3.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row6" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow6 = false;
       		  	    	
       		  	    	
 							row6Struct row6ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
                        		    		    row6HashKey.PK_ARTICLE = out3.PK_ARTICLE ;
                        		    		
                        		    		    row6HashKey.PK_SITE = out3.PK_SITE ;
                        		    		
                        		    		    row6HashKey.CINR = out3.CINR ;
                        		    		
                        		    		    row6HashKey.CINV = out3.CINV ;
                        		    		
                        		    		    row6HashKey.IDM = out3.IDM ;
                        		    		
                        		    		    row6HashKey.DATE_DEBUT = out3.DATE_DEBUT  == null ? null : new java.util.Date(out3.DATE_DEBUT .getTime());
                        		    		
                        		    		    row6HashKey.DATE_FIN = out3.DATE_FIN  == null ? null : new java.util.Date(out3.DATE_FIN .getTime());
                        		    		
                        		    		    row6HashKey.CODE_CAISSE = out3.CODE_CAISSE ;
                        		    		
                        		    		    row6HashKey.NUM_OPR = out3.NUM_OPR ;
                        		    		

								
		                        	row6HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row6.lookup( row6HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row6.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_4 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row6 != null && tHash_Lookup_row6.getCount(row6HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row6' and it contains more one result from keys :  row6.PK_ARTICLE = '" + row6HashKey.PK_ARTICLE + "', row6.PK_SITE = '" + row6HashKey.PK_SITE + "', row6.CINR = '" + row6HashKey.CINR + "', row6.CINV = '" + row6HashKey.CINV + "', row6.IDM = '" + row6HashKey.IDM + "', row6.DATE_DEBUT = '" + row6HashKey.DATE_DEBUT + "', row6.DATE_FIN = '" + row6HashKey.DATE_FIN + "', row6.CODE_CAISSE = '" + row6HashKey.CODE_CAISSE + "', row6.NUM_OPR = '" + row6HashKey.NUM_OPR + "'");
								} // G 071
							

							row6Struct row6 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row6Struct fromLookup_row6 = null;
							row6 = row6Default;
										 
							
								 
							
							
								if (tHash_Lookup_row6 !=null && tHash_Lookup_row6.hasNext()) { // G 099
								
							
								
								fromLookup_row6 = tHash_Lookup_row6.next();

							
							
								} // G 099
							
							

							if(fromLookup_row6 != null) {
								row6 = fromLookup_row6;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

out4 = null;

if(!rejectedInnerJoin_tMap_4 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'out4'
// # Filter conditions 
if( rejectedInnerJoin_tMap_4 ) {
count_out4_tMap_4++;

out4_tmp.IDM = out3.IDM ;
out4_tmp.CODE_CAISSE = out3.CODE_CAISSE ;
out4_tmp.CINR = out3.CINR ;
out4_tmp.CINV = out3.CINV ;
out4_tmp.DATE_DEBUT = out3.DATE_DEBUT ;
out4_tmp.DATE_FIN = out3.DATE_FIN ;
out4_tmp.NUM_OPR = out3.NUM_OPR ;
out4_tmp.PK_SITE = out3.PK_SITE ;
out4_tmp.PK_ARTICLE = out3.PK_ARTICLE ;
out4 = out4_tmp;
log.debug("tMap_4 - Outputting the record " + count_out4_tMap_4 + " of the output table 'out4'.");

} // closing filter/reject
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

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "out4"
if(out4 != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out4","tMap_4","tMap_4","tMap","tDBOutput_1","CASSE FRAIS","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out4 - " + (out4==null? "": out4.toLogString()));
    			}
    		



        whetherReject_tDBOutput_1 = false;
                        pstmt_tDBOutput_1.setBigDecimal(1, out4.IDM);

                        if(out4.CODE_CAISSE == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2, out4.CODE_CAISSE);
}

                        pstmt_tDBOutput_1.setBigDecimal(3, out4.CINR);

                        pstmt_tDBOutput_1.setBigDecimal(4, out4.CINV);

                        if(out4.DATE_DEBUT != null) {
pstmt_tDBOutput_1.setObject(5, new java.sql.Timestamp(out4.DATE_DEBUT.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.DATE);
}

                        if(out4.DATE_FIN != null) {
pstmt_tDBOutput_1.setObject(6, new java.sql.Timestamp(out4.DATE_FIN.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.DATE);
}

                        if(out4.NUM_OPR == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(7, out4.NUM_OPR);
}

                        pstmt_tDBOutput_1.setBigDecimal(8, out4.PK_SITE);

                        pstmt_tDBOutput_1.setBigDecimal(9, out4.PK_ARTICLE);

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
                commitCounter_tDBOutput_1++;
                if(commitEvery_tDBOutput_1 <= commitCounter_tDBOutput_1) {
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_1)  + (" record(s).") );
                    }
                    conn_tDBOutput_1.commit();
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_1 = 0;
                    }
                    commitCounter_tDBOutput_1=0;
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

} // End of branch "out4"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "out3"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "out2"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "out1"




	
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
					if(tHash_Lookup_row2 != null) {
						tHash_Lookup_row2.endGet();
					}
					globalMap.remove( "tHash_Lookup_row2" );

					
					
				
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'out1': " + count_out1_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_1","ORACLE_GOLD","tOracleInput","tMap_1","tMap_1","tMap","output")) {
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
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row3 != null) {
						tHash_Lookup_row3.endGet();
					}
					globalMap.remove( "tHash_Lookup_row3" );

					
					
				
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'out2': " + count_out2_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out1",2,0,
			 			"tMap_1","tMap_1","tMap","tMap_2","tMap_2","tMap","output")) {
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
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'out3': " + count_out3_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out2",2,0,
			 			"tMap_2","tMap_2","tMap","tMap_3","tMap_3","tMap","output")) {
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
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row6 != null) {
						tHash_Lookup_row6.endGet();
					}
					globalMap.remove( "tHash_Lookup_row6" );

					
					
				
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'out4': " + count_out4_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out3",2,0,
			 			"tMap_3","tMap_3","tMap","tMap_4","tMap_4","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Done.") );

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
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
		if(commitCounter_tDBOutput_1 > 0 && rowsToCommitCount_tDBOutput_1 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_1)  + (" record(s).") );
		}
		conn_tDBOutput_1.commit();
		if(commitCounter_tDBOutput_1 > 0 && rowsToCommitCount_tDBOutput_1 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_1 = 0;
		}
		commitCounter_tDBOutput_1 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_1 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_1", true);
   	

	
	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_1)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out4",2,0,
			 			"tMap_4","tMap_4","tMap","tDBOutput_1","CASSE FRAIS","tOracleOutput","output")) {
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
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_4"
					     			globalMap.remove("tHash_Lookup_row6"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row2"); 
				     			
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
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_1") == null){
            java.sql.Connection ctn_tDBOutput_1 = null;
            if((ctn_tDBOutput_1 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_1")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_1.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_1) {
                    String errorMessage_tDBOutput_1 = "failed to close the connection in tDBOutput_1 :" + sqlEx_tDBOutput_1.getMessage();
            log.error("tDBOutput_1 - "  + (errorMessage_tDBOutput_1) );
                    System.err.println(errorMessage_tDBOutput_1);
                }
            }
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
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableComparableLookupRow<row2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal ID_ENTITE_GOLD;

				public BigDecimal getID_ENTITE_GOLD () {
					return this.ID_ENTITE_GOLD;
				}
				
			    public BigDecimal LEVEL3_ID;

				public BigDecimal getLEVEL3_ID () {
					return this.LEVEL3_ID;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_ENTITE_GOLD == null) ? 0 : new Double(this.ID_ENTITE_GOLD.doubleValue()).hashCode());
						
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
		final row2Struct other = (row2Struct) obj;
		
						if (this.ID_ENTITE_GOLD == null) {
							if (other.ID_ENTITE_GOLD != null)
								return false;
						
						} else if ((other.ID_ENTITE_GOLD == null) || (this.ID_ENTITE_GOLD.compareTo(other.ID_ENTITE_GOLD)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.ID_ENTITE_GOLD = this.ID_ENTITE_GOLD;
	            other.LEVEL3_ID = this.LEVEL3_ID;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.ID_ENTITE_GOLD = this.ID_ENTITE_GOLD;
	            	
	}




    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.ID_ENTITE_GOLD = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.ID_ENTITE_GOLD = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE_GOLD);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE_GOLD);
					
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
		
       			    	this.LEVEL3_ID = (BigDecimal) ois.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
       			    	this.LEVEL3_ID = (BigDecimal) objectIn.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
       			    	oos.writeObject(this.LEVEL3_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
       			    	objectOut.writeObject(this.LEVEL3_ID);
					
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
		sb.append("ID_ENTITE_GOLD="+String.valueOf(ID_ENTITE_GOLD));
		sb.append(",LEVEL3_ID="+String.valueOf(LEVEL3_ID));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_ENTITE_GOLD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ENTITE_GOLD);
            			}
            		
        			sb.append("|");
        		
        				if(LEVEL3_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEVEL3_ID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_ENTITE_GOLD, other.ID_ENTITE_GOLD);
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




	
	/**
	 * [tAdvancedHash_row2 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row2", false);
		start_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
		int tos_count_tAdvancedHash_row2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row2", "tAdvancedHash_row2", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row2
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row2) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
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
                            log4jParamters_tDBInput_2.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:J8kulImF7F0WqHdT2t8LvgWUD7wCnh+4pMAmJQozEI6ZMiK+").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"select  distinct ID_ENTITE_GOLD,ID_ENTITE  as LEVEL3_ID from ODS_PRM_MAP_ENTITE_GOLD_DWH\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ENTITE_GOLD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LEVEL3_ID")+"}]");
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
				talendJobLog.addCM("tDBInput_2", "ODS_MAP_ENSEIGNE_GOLD", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_2);
				
			String url_tDBInput_2 = null;
				url_tDBInput_2 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_2 = "ods";

				

				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:/nein3Mo1qVbC//vNSzlCfO/+9pRyLwvkKy2AkL6qov2acE5");

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
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "select  distinct ID_ENTITE_GOLD,ID_ENTITE  as LEVEL3_ID from ODS_PRM_MAP_ENTITE_GOLD_DWH";
		    
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
								row2.ID_ENTITE_GOLD = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(1) != null) {
						row2.ID_ENTITE_GOLD = rs_tDBInput_2.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row2.LEVEL3_ID = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(2) != null) {
						row2.LEVEL3_ID = rs_tDBInput_2.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
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
	 * [tAdvancedHash_row2 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tDBInput_2","ODS_MAP_ENSEIGNE_GOLD","tOracleInput","tAdvancedHash_row2","tAdvancedHash_row2","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		


			   
			   

					row2Struct row2_HashRow = new row2Struct();
		   	   	   
				
				row2_HashRow.ID_ENTITE_GOLD = row2.ID_ENTITE_GOLD;
				
				row2_HashRow.LEVEL3_ID = row2.LEVEL3_ID;
				
			tHash_Lookup_row2.put(row2_HashRow);
			
            




 


	tos_count_tAdvancedHash_row2++;

/**
 * [tAdvancedHash_row2 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row2 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 process_data_end ] stop
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
	 * [tAdvancedHash_row2 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

tHash_Lookup_row2.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tDBInput_2","ODS_MAP_ENSEIGNE_GOLD","tOracleInput","tAdvancedHash_row2","tAdvancedHash_row2","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row2", true);
end_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());




/**
 * [tAdvancedHash_row2 end ] stop
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
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 finally ] stop
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
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal PK_SITE;

				public BigDecimal getPK_SITE () {
					return this.PK_SITE;
				}
				
			    public BigDecimal LEVEL3_ID;

				public BigDecimal getLEVEL3_ID () {
					return this.LEVEL3_ID;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LEVEL3_ID == null) ? 0 : new Double(this.LEVEL3_ID.doubleValue()).hashCode());
						
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
		final row3Struct other = (row3Struct) obj;
		
						if (this.LEVEL3_ID == null) {
							if (other.LEVEL3_ID != null)
								return false;
						
						} else if ((other.LEVEL3_ID == null) || (this.LEVEL3_ID.compareTo(other.LEVEL3_ID)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.PK_SITE = this.PK_SITE;
	            other.LEVEL3_ID = this.LEVEL3_ID;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.LEVEL3_ID = this.LEVEL3_ID;
	            	
	}




    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
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
		
       			    	this.PK_SITE = (BigDecimal) ois.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
       			    	this.PK_SITE = (BigDecimal) objectIn.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
       			    	oos.writeObject(this.PK_SITE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
       			    	objectOut.writeObject(this.PK_SITE);
					
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
		sb.append("PK_SITE="+String.valueOf(PK_SITE));
		sb.append(",LEVEL3_ID="+String.valueOf(LEVEL3_ID));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(PK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(LEVEL3_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEVEL3_ID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LEVEL3_ID, other.LEVEL3_ID);
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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tAdvancedHash_row3 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row3", false);
		start_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row3");
			
		int tos_count_tAdvancedHash_row3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row3", "tAdvancedHash_row3", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row3
			   		// source node:tDBInput_3 - inputs:(after_tDBInput_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
			   		// linked node: tMap_2 - inputs:(out1,row3) outputs:(out2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row3 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row3Struct>getLookup(matchingModeEnum_row3);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row3", tHash_Lookup_row3);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row3 begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";

	
		int tos_count_tDBInput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_3 = new StringBuilder();
                    log4jParamters_tDBInput_3.append("Parameters:");
                            log4jParamters_tDBInput_3.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("SCHEMA_DB" + " = " + "\"DW\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:jz03z9VquoyxMAFt6f9Soa5mt6jdgbky8XKjLTKxvmP2Z5I=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"select PK_Site, level3_id from dwh_entite\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PK_SITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LEVEL3_ID")+"}]");
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
				talendJobLog.addCM("tDBInput_3", "Oracle_DW_ENTITE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_3);
				
			String url_tDBInput_3 = null;
				url_tDBInput_3 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_3 = "dw";

				

				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:67cBRLjHOo/7ZYwLs2LUZC4hsOB225T4pKEh83pkxKMfLv4=");

				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;

				
	    		log.debug("tDBInput_3 - Driver ClassName: "+driverClass_tDBInput_3+".");
			
	    		log.debug("tDBInput_3 - Connection attempt to '" + url_tDBInput_3 + "' with the username '" + dbUser_tDBInput_3 + "'.");
			
					conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
	    		log.debug("tDBInput_3 - Connection to '" + url_tDBInput_3 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_3 = conn_tDBInput_3.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_3 = stmtGetTZ_tDBInput_3.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_3 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_3.next()) {
					sessionTimezone_tDBInput_3 = rsGetTZ_tDBInput_3.getString(1);
				}
                                if (!(conn_tDBInput_3 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_3.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_3.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_3.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_3);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_3).setSessionTimeZone(sessionTimezone_tDBInput_3);
                                }
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "select PK_Site, level3_id from dwh_entite";
		    
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
								row3.PK_SITE = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(1) != null) {
						row3.PK_SITE = rs_tDBInput_3.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row3.LEVEL3_ID = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(2) != null) {
						row3.LEVEL3_ID = rs_tDBInput_3.getBigDecimal(2);
					} else {
				
						row3.LEVEL3_ID = null;
					}
		                    }
					
						log.debug("tDBInput_3 - Retrieving the record " + nb_line_tDBInput_3 + ".");
					




 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row3","tDBInput_3","Oracle_DW_ENTITE","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		


			   
			   

					row3Struct row3_HashRow = new row3Struct();
		   	   	   
				
				row3_HashRow.PK_SITE = row3.PK_SITE;
				
				row3_HashRow.LEVEL3_ID = row3.LEVEL3_ID;
				
			tHash_Lookup_row3.put(row3_HashRow);
			
            




 


	tos_count_tAdvancedHash_row3++;

/**
 * [tAdvancedHash_row3 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row3 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

}
}finally{
	if (rs_tDBInput_3 != null) {
		rs_tDBInput_3.close();
	}
	if (stmt_tDBInput_3 != null) {
		stmt_tDBInput_3.close();
	}
	if(conn_tDBInput_3 != null && !conn_tDBInput_3.isClosed()) {
	
	    		log.debug("tDBInput_3 - Closing the connection to the database.");
			
			conn_tDBInput_3.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_3 - Connection to the database closed.");
			
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
	 * [tAdvancedHash_row3 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

tHash_Lookup_row3.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tDBInput_3","Oracle_DW_ENTITE","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row3", true);
end_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());




/**
 * [tAdvancedHash_row3 end ] stop
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
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 finally ] stop
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
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal PK_ARTICLE;

				public BigDecimal getPK_ARTICLE () {
					return this.PK_ARTICLE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_ARTICLE_INR == null) ? 0 : new Double(this.ID_ARTICLE_INR.doubleValue()).hashCode());
						
						result = prime * result + ((this.ID_ARTICLE_INV == null) ? 0 : new Double(this.ID_ARTICLE_INV.doubleValue()).hashCode());
						
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
		final row4Struct other = (row4Struct) obj;
		
						if (this.ID_ARTICLE_INR == null) {
							if (other.ID_ARTICLE_INR != null)
								return false;
						
						} else if ((other.ID_ARTICLE_INR == null) || (this.ID_ARTICLE_INR.compareTo(other.ID_ARTICLE_INR)!=0))
						
							return false;
					
						if (this.ID_ARTICLE_INV == null) {
							if (other.ID_ARTICLE_INV != null)
								return false;
						
						} else if ((other.ID_ARTICLE_INV == null) || (this.ID_ARTICLE_INV.compareTo(other.ID_ARTICLE_INV)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.ID_ARTICLE_INR = this.ID_ARTICLE_INR;
	            other.ID_ARTICLE_INV = this.ID_ARTICLE_INV;
	            other.PK_ARTICLE = this.PK_ARTICLE;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

		other.ID_ARTICLE_INR = this.ID_ARTICLE_INR;
	            	other.ID_ARTICLE_INV = this.ID_ARTICLE_INV;
	            	
	}




    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
		
       			    	this.PK_ARTICLE = (BigDecimal) ois.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
       			    	this.PK_ARTICLE = (BigDecimal) objectIn.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
       			    	oos.writeObject(this.PK_ARTICLE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
       			    	objectOut.writeObject(this.PK_ARTICLE);
					
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
		sb.append("ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",PK_ARTICLE="+String.valueOf(PK_ARTICLE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_ARTICLE_INR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_INR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_INV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_INV);
            			}
            		
        			sb.append("|");
        		
        				if(PK_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_ARTICLE_INR, other.ID_ARTICLE_INR);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_ARTICLE_INV, other.ID_ARTICLE_INV);
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
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

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



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tAdvancedHash_row4 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row4", false);
		start_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row4");
			
		int tos_count_tAdvancedHash_row4 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row4", "tAdvancedHash_row4", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row4
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_3 - inputs:(out2,row4) outputs:(out3)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";

	
		int tos_count_tDBInput_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_4 = new StringBuilder();
                    log4jParamters_tDBInput_4.append("Parameters:");
                            log4jParamters_tDBInput_4.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("SCHEMA_DB" + " = " + "\"DW\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:43FQ1o1LyEBXC9zIo8O6ZVyNOkQ1n/iBezGYFVg5FgdFHyQ=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERY" + " = " + "\"select distinct   id_article_inr,id_article_inv, pk_article from dwh_article\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PK_ARTICLE")+"}]");
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
				talendJobLog.addCM("tDBInput_4", "DWH_ARTICLE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				String driverClass_tDBInput_4 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_4);
				
			String url_tDBInput_4 = null;
				url_tDBInput_4 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_4 = "dw";

				

				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:+daI0ZkvAtghFqsjgvveXT+kMtmNMe2YbxQcjLbg8o8g6cc=");

				String dbPwd_tDBInput_4 = decryptedPassword_tDBInput_4;

				
	    		log.debug("tDBInput_4 - Driver ClassName: "+driverClass_tDBInput_4+".");
			
	    		log.debug("tDBInput_4 - Connection attempt to '" + url_tDBInput_4 + "' with the username '" + dbUser_tDBInput_4 + "'.");
			
					conn_tDBInput_4 = java.sql.DriverManager.getConnection(url_tDBInput_4,dbUser_tDBInput_4,dbPwd_tDBInput_4);
	    		log.debug("tDBInput_4 - Connection to '" + url_tDBInput_4 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_4 = conn_tDBInput_4.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_4 = stmtGetTZ_tDBInput_4.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_4 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_4.next()) {
					sessionTimezone_tDBInput_4 = rsGetTZ_tDBInput_4.getString(1);
				}
                                if (!(conn_tDBInput_4 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_4.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_4.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_4.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_4);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_4).setSessionTimeZone(sessionTimezone_tDBInput_4);
                                }
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "select distinct   id_article_inr,id_article_inv, pk_article from dwh_article";
		    
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
								row4.ID_ARTICLE_INR = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(1) != null) {
						row4.ID_ARTICLE_INR = rs_tDBInput_4.getBigDecimal(1);
					} else {
				
						row4.ID_ARTICLE_INR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row4.ID_ARTICLE_INV = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(2) != null) {
						row4.ID_ARTICLE_INV = rs_tDBInput_4.getBigDecimal(2);
					} else {
				
						row4.ID_ARTICLE_INV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row4.PK_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(3) != null) {
						row4.PK_ARTICLE = rs_tDBInput_4.getBigDecimal(3);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
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

	

 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row4","tDBInput_4","DWH_ARTICLE","tOracleInput","tAdvancedHash_row4","tAdvancedHash_row4","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		


			   
			   

					row4Struct row4_HashRow = new row4Struct();
		   	   	   
				
				row4_HashRow.ID_ARTICLE_INR = row4.ID_ARTICLE_INR;
				
				row4_HashRow.ID_ARTICLE_INV = row4.ID_ARTICLE_INV;
				
				row4_HashRow.PK_ARTICLE = row4.PK_ARTICLE;
				
			tHash_Lookup_row4.put(row4_HashRow);
			
            




 


	tos_count_tAdvancedHash_row4++;

/**
 * [tAdvancedHash_row4 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

}
}finally{
	if (rs_tDBInput_4 != null) {
		rs_tDBInput_4.close();
	}
	if (stmt_tDBInput_4 != null) {
		stmt_tDBInput_4.close();
	}
	if(conn_tDBInput_4 != null && !conn_tDBInput_4.isClosed()) {
	
	    		log.debug("tDBInput_4 - Closing the connection to the database.");
			
			conn_tDBInput_4.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_4 - Connection to the database closed.");
			
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
	 * [tAdvancedHash_row4 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

tHash_Lookup_row4.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row4",2,0,
			 			"tDBInput_4","DWH_ARTICLE","tOracleInput","tAdvancedHash_row4","tAdvancedHash_row4","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row4", true);
end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());




/**
 * [tAdvancedHash_row4 end ] stop
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
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 finally ] stop
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
	


public static class row6Struct implements routines.system.IPersistableComparableLookupRow<row6Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal PK_ARTICLE;

				public BigDecimal getPK_ARTICLE () {
					return this.PK_ARTICLE;
				}
				
			    public BigDecimal PK_SITE;

				public BigDecimal getPK_SITE () {
					return this.PK_SITE;
				}
				
			    public BigDecimal CINR;

				public BigDecimal getCINR () {
					return this.CINR;
				}
				
			    public BigDecimal CINV;

				public BigDecimal getCINV () {
					return this.CINV;
				}
				
			    public BigDecimal IDM;

				public BigDecimal getIDM () {
					return this.IDM;
				}
				
			    public java.util.Date DATE_DEBUT;

				public java.util.Date getDATE_DEBUT () {
					return this.DATE_DEBUT;
				}
				
			    public java.util.Date DATE_FIN;

				public java.util.Date getDATE_FIN () {
					return this.DATE_FIN;
				}
				
			    public String CODE_CAISSE;

				public String getCODE_CAISSE () {
					return this.CODE_CAISSE;
				}
				
			    public String NUM_OPR;

				public String getNUM_OPR () {
					return this.NUM_OPR;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.PK_ARTICLE == null) ? 0 : new Double(this.PK_ARTICLE.doubleValue()).hashCode());
						
						result = prime * result + ((this.PK_SITE == null) ? 0 : new Double(this.PK_SITE.doubleValue()).hashCode());
						
						result = prime * result + ((this.CINR == null) ? 0 : new Double(this.CINR.doubleValue()).hashCode());
						
						result = prime * result + ((this.CINV == null) ? 0 : new Double(this.CINV.doubleValue()).hashCode());
						
						result = prime * result + ((this.IDM == null) ? 0 : new Double(this.IDM.doubleValue()).hashCode());
						
						result = prime * result + ((this.DATE_DEBUT == null) ? 0 : this.DATE_DEBUT.hashCode());
					
						result = prime * result + ((this.DATE_FIN == null) ? 0 : this.DATE_FIN.hashCode());
					
						result = prime * result + ((this.CODE_CAISSE == null) ? 0 : this.CODE_CAISSE.hashCode());
					
						result = prime * result + ((this.NUM_OPR == null) ? 0 : this.NUM_OPR.hashCode());
					
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
		final row6Struct other = (row6Struct) obj;
		
						if (this.PK_ARTICLE == null) {
							if (other.PK_ARTICLE != null)
								return false;
						
						} else if ((other.PK_ARTICLE == null) || (this.PK_ARTICLE.compareTo(other.PK_ARTICLE)!=0))
						
							return false;
					
						if (this.PK_SITE == null) {
							if (other.PK_SITE != null)
								return false;
						
						} else if ((other.PK_SITE == null) || (this.PK_SITE.compareTo(other.PK_SITE)!=0))
						
							return false;
					
						if (this.CINR == null) {
							if (other.CINR != null)
								return false;
						
						} else if ((other.CINR == null) || (this.CINR.compareTo(other.CINR)!=0))
						
							return false;
					
						if (this.CINV == null) {
							if (other.CINV != null)
								return false;
						
						} else if ((other.CINV == null) || (this.CINV.compareTo(other.CINV)!=0))
						
							return false;
					
						if (this.IDM == null) {
							if (other.IDM != null)
								return false;
						
						} else if ((other.IDM == null) || (this.IDM.compareTo(other.IDM)!=0))
						
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
					
						if (this.CODE_CAISSE == null) {
							if (other.CODE_CAISSE != null)
								return false;
						
						} else if (!this.CODE_CAISSE.equals(other.CODE_CAISSE))
						
							return false;
					
						if (this.NUM_OPR == null) {
							if (other.NUM_OPR != null)
								return false;
						
						} else if (!this.NUM_OPR.equals(other.NUM_OPR))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row6Struct other) {

		other.PK_ARTICLE = this.PK_ARTICLE;
	            other.PK_SITE = this.PK_SITE;
	            other.CINR = this.CINR;
	            other.CINV = this.CINV;
	            other.IDM = this.IDM;
	            other.DATE_DEBUT = this.DATE_DEBUT;
	            other.DATE_FIN = this.DATE_FIN;
	            other.CODE_CAISSE = this.CODE_CAISSE;
	            other.NUM_OPR = this.NUM_OPR;
	            
	}

	public void copyKeysDataTo(row6Struct other) {

		other.PK_ARTICLE = this.PK_ARTICLE;
	            	other.PK_SITE = this.PK_SITE;
	            	other.CINR = this.CINR;
	            	other.CINV = this.CINV;
	            	other.IDM = this.IDM;
	            	other.DATE_DEBUT = this.DATE_DEBUT;
	            	other.DATE_FIN = this.DATE_FIN;
	            	other.CODE_CAISSE = this.CODE_CAISSE;
	            	other.NUM_OPR = this.NUM_OPR;
	            	
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.PK_ARTICLE = (BigDecimal) dis.readObject();
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
						this.IDM = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.CODE_CAISSE = readString(dis);
					
					this.NUM_OPR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
						this.PK_ARTICLE = (BigDecimal) dis.readObject();
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.CINR = (BigDecimal) dis.readObject();
					
						this.CINV = (BigDecimal) dis.readObject();
					
						this.IDM = (BigDecimal) dis.readObject();
					
					this.DATE_DEBUT = readDate(dis);
					
					this.DATE_FIN = readDate(dis);
					
					this.CODE_CAISSE = readString(dis);
					
					this.NUM_OPR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.PK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDM);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.PK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CINV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDM);
					
					// java.util.Date
				
						writeDate(this.DATE_DEBUT,dos);
					
					// java.util.Date
				
						writeDate(this.DATE_FIN,dos);
					
					// String
				
						writeString(this.CODE_CAISSE,dos);
					
					// String
				
						writeString(this.NUM_OPR,dos);
					
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
		

		

        }

		
        	finally {}

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		

		

        }

		
        	finally {}

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
        	}
        	finally {}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
        	}
        	finally {}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("PK_ARTICLE="+String.valueOf(PK_ARTICLE));
		sb.append(",PK_SITE="+String.valueOf(PK_SITE));
		sb.append(",CINR="+String.valueOf(CINR));
		sb.append(",CINV="+String.valueOf(CINV));
		sb.append(",IDM="+String.valueOf(IDM));
		sb.append(",DATE_DEBUT="+String.valueOf(DATE_DEBUT));
		sb.append(",DATE_FIN="+String.valueOf(DATE_FIN));
		sb.append(",CODE_CAISSE="+CODE_CAISSE);
		sb.append(",NUM_OPR="+NUM_OPR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(PK_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(PK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(CINR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINR);
            			}
            		
        			sb.append("|");
        		
        				if(CINV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CINV);
            			}
            		
        			sb.append("|");
        		
        				if(IDM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDM);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_DEBUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_DEBUT);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_FIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_FIN);
            			}
            		
        			sb.append("|");
        		
        				if(CODE_CAISSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CODE_CAISSE);
            			}
            		
        			sb.append("|");
        		
        				if(NUM_OPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NUM_OPR);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.PK_ARTICLE, other.PK_ARTICLE);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.PK_SITE, other.PK_SITE);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CINR, other.CINR);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CINV, other.CINV);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.IDM, other.IDM);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.DATE_DEBUT, other.DATE_DEBUT);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.DATE_FIN, other.DATE_FIN);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CODE_CAISSE, other.CODE_CAISSE);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_OPR, other.NUM_OPR);
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
public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

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



		row6Struct row6 = new row6Struct();




	
	/**
	 * [tAdvancedHash_row6 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row6", false);
		start_Hash.put("tAdvancedHash_row6", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row6";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row6");
			
		int tos_count_tAdvancedHash_row6 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row6", "tAdvancedHash_row6", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row6
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(row6,row6) | target node:tAdvancedHash_row6 - inputs:(row6) outputs:()
			   		// linked node: tMap_4 - inputs:(out3,row6) outputs:(out4)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row6 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row6Struct>getLookup(matchingModeEnum_row6);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row6", tHash_Lookup_row6);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row6 begin ] stop
 */



	
	/**
	 * [tDBInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_5", false);
		start_Hash.put("tDBInput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_5";

	
		int tos_count_tDBInput_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_5 = new StringBuilder();
                    log4jParamters_tDBInput_5.append("Parameters:");
                            log4jParamters_tDBInput_5.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("SCHEMA_DB" + " = " + "\"DW\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:SZQEi5JcGWRQEmjlVwKWr29sFUJDHefjwH0fkgPYyq9xvpU=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERY" + " = " + "\" select *from DWH_ARTICLE_CASSE_FRAIS\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PK_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PK_SITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CINR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CINV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_DEBUT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_FIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CODE_CAISSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NUM_OPR")+"}]");
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
				talendJobLog.addCM("tDBInput_5", "Oracle_DW", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				String driverClass_tDBInput_5 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_5);
				
			String url_tDBInput_5 = null;
				url_tDBInput_5 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_5 = "dw";

				

				 
	final String decryptedPassword_tDBInput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:PkqTSVUYUFAqSGOBsV5N8p18jhd5GWURvqhBamI9T/hQgjE=");

				String dbPwd_tDBInput_5 = decryptedPassword_tDBInput_5;

				
	    		log.debug("tDBInput_5 - Driver ClassName: "+driverClass_tDBInput_5+".");
			
	    		log.debug("tDBInput_5 - Connection attempt to '" + url_tDBInput_5 + "' with the username '" + dbUser_tDBInput_5 + "'.");
			
					conn_tDBInput_5 = java.sql.DriverManager.getConnection(url_tDBInput_5,dbUser_tDBInput_5,dbPwd_tDBInput_5);
	    		log.debug("tDBInput_5 - Connection to '" + url_tDBInput_5 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_5 = conn_tDBInput_5.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_5 = stmtGetTZ_tDBInput_5.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_5 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_5.next()) {
					sessionTimezone_tDBInput_5 = rsGetTZ_tDBInput_5.getString(1);
				}
                                if (!(conn_tDBInput_5 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_5.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_5.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_5.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_5);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_5).setSessionTimeZone(sessionTimezone_tDBInput_5);
                                }
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = " select *from DWH_ARTICLE_CASSE_FRAIS";
		    
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
								row6.PK_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(1) != null) {
						row6.PK_ARTICLE = rs_tDBInput_5.getBigDecimal(1);
					} else {
				
						row6.PK_ARTICLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row6.PK_SITE = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(2) != null) {
						row6.PK_SITE = rs_tDBInput_5.getBigDecimal(2);
					} else {
				
						row6.PK_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row6.CINR = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(3) != null) {
						row6.CINR = rs_tDBInput_5.getBigDecimal(3);
					} else {
				
						row6.CINR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row6.CINV = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(4) != null) {
						row6.CINV = rs_tDBInput_5.getBigDecimal(4);
					} else {
				
						row6.CINV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row6.IDM = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(5) != null) {
						row6.IDM = rs_tDBInput_5.getBigDecimal(5);
					} else {
				
						row6.IDM = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								row6.DATE_DEBUT = null;
							} else {
										
			row6.DATE_DEBUT = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 6);
		                    }
							if(colQtyInRs_tDBInput_5 < 7) {
								row6.DATE_FIN = null;
							} else {
										
			row6.DATE_FIN = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 7);
		                    }
							if(colQtyInRs_tDBInput_5 < 8) {
								row6.CODE_CAISSE = null;
							} else {
	                         		
        	row6.CODE_CAISSE = routines.system.JDBCUtil.getString(rs_tDBInput_5, 8, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 9) {
								row6.NUM_OPR = null;
							} else {
	                         		
        	row6.NUM_OPR = routines.system.JDBCUtil.getString(rs_tDBInput_5, 9, false);
		                    }
					
						log.debug("tDBInput_5 - Retrieving the record " + nb_line_tDBInput_5 + ".");
					




 



/**
 * [tDBInput_5 begin ] stop
 */
	
	/**
	 * [tDBInput_5 main ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 


	tos_count_tDBInput_5++;

/**
 * [tDBInput_5 main ] stop
 */
	
	/**
	 * [tDBInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row6 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row6","tDBInput_5","Oracle_DW","tOracleInput","tAdvancedHash_row6","tAdvancedHash_row6","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row6 - " + (row6==null? "": row6.toLogString()));
    			}
    		


			   
			   

					row6Struct row6_HashRow = new row6Struct();
		   	   	   
				
				row6_HashRow.PK_ARTICLE = row6.PK_ARTICLE;
				
				row6_HashRow.PK_SITE = row6.PK_SITE;
				
				row6_HashRow.CINR = row6.CINR;
				
				row6_HashRow.CINV = row6.CINV;
				
				row6_HashRow.IDM = row6.IDM;
				
				row6_HashRow.DATE_DEBUT = row6.DATE_DEBUT;
				
				row6_HashRow.DATE_FIN = row6.DATE_FIN;
				
				row6_HashRow.CODE_CAISSE = row6.CODE_CAISSE;
				
				row6_HashRow.NUM_OPR = row6.NUM_OPR;
				
			tHash_Lookup_row6.put(row6_HashRow);
			
            




 


	tos_count_tAdvancedHash_row6++;

/**
 * [tAdvancedHash_row6 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row6 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_5 end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

}
}finally{
	if (rs_tDBInput_5 != null) {
		rs_tDBInput_5.close();
	}
	if (stmt_tDBInput_5 != null) {
		stmt_tDBInput_5.close();
	}
	if(conn_tDBInput_5 != null && !conn_tDBInput_5.isClosed()) {
	
	    		log.debug("tDBInput_5 - Closing the connection to the database.");
			
			conn_tDBInput_5.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_5 - Connection to the database closed.");
			
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
	 * [tAdvancedHash_row6 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

tHash_Lookup_row6.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row6",2,0,
			 			"tDBInput_5","Oracle_DW","tOracleInput","tAdvancedHash_row6","tAdvancedHash_row6","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row6", true);
end_Hash.put("tAdvancedHash_row6", System.currentTimeMillis());




/**
 * [tAdvancedHash_row6 end ] stop
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
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row6 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 finally ] stop
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
	

public void connectionStatsLogs_CommitProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("connectionStatsLogs_Commit_SUBPROCESS_STATE", 0);

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
	 * [connectionStatsLogs_Commit begin ] start
	 */

	

	
		
		ok_Hash.put("connectionStatsLogs_Commit", false);
		start_Hash.put("connectionStatsLogs_Commit", System.currentTimeMillis());
		
	
	currentComponent="connectionStatsLogs_Commit";

	
		int tos_count_connectionStatsLogs_Commit = 0;
		
                if(log.isDebugEnabled())
            log.debug("connectionStatsLogs_Commit - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_connectionStatsLogs_Commit{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_connectionStatsLogs_Commit = new StringBuilder();
                    log4jParamters_connectionStatsLogs_Commit.append("Parameters:");
                            log4jParamters_connectionStatsLogs_Commit.append("CONNECTION" + " = " + "connectionStatsLogs");
                        log4jParamters_connectionStatsLogs_Commit.append(" | ");
                            log4jParamters_connectionStatsLogs_Commit.append("CLOSE" + " = " + "false");
                        log4jParamters_connectionStatsLogs_Commit.append(" | ");
                if(log.isDebugEnabled())
            log.debug("connectionStatsLogs_Commit - "  + (log4jParamters_connectionStatsLogs_Commit) );
                    } 
                } 
            new BytesLimit65535_connectionStatsLogs_Commit().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("connectionStatsLogs_Commit", "connectionStatsLogs_Commit", "tOracleCommit");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [connectionStatsLogs_Commit begin ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit main ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";

	

	java.sql.Connection conn_connectionStatsLogs_Commit = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");

if(conn_connectionStatsLogs_Commit != null && !conn_connectionStatsLogs_Commit.isClosed()) {
	
			
	    		log.debug("connectionStatsLogs_Commit - Connection 'connectionStatsLogs' starting to commit.");
			
			conn_connectionStatsLogs_Commit.commit();
			
	    		log.debug("connectionStatsLogs_Commit - Connection 'connectionStatsLogs' commit has succeeded.");
			
	
}

 


	tos_count_connectionStatsLogs_Commit++;

/**
 * [connectionStatsLogs_Commit main ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit process_data_begin ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";

	

 



/**
 * [connectionStatsLogs_Commit process_data_begin ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit process_data_end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";

	

 



/**
 * [connectionStatsLogs_Commit process_data_end ] stop
 */
	
	/**
	 * [connectionStatsLogs_Commit end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";

	

 
                if(log.isDebugEnabled())
            log.debug("connectionStatsLogs_Commit - "  + ("Done.") );

ok_Hash.put("connectionStatsLogs_Commit", true);
end_Hash.put("connectionStatsLogs_Commit", System.currentTimeMillis());




/**
 * [connectionStatsLogs_Commit end ] stop
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
	 * [connectionStatsLogs_Commit finally ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs_Commit";

	

 



/**
 * [connectionStatsLogs_Commit finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("connectionStatsLogs_Commit_SUBPROCESS_STATE", 1);
	}
	

public void connectionStatsLogsProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("connectionStatsLogs_SUBPROCESS_STATE", 0);

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
	 * [connectionStatsLogs begin ] start
	 */

	

	
		
		ok_Hash.put("connectionStatsLogs", false);
		start_Hash.put("connectionStatsLogs", System.currentTimeMillis());
		
	
	currentComponent="connectionStatsLogs";

	
		int tos_count_connectionStatsLogs = 0;
		
                if(log.isDebugEnabled())
            log.debug("connectionStatsLogs - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_connectionStatsLogs{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_connectionStatsLogs = new StringBuilder();
                    log4jParamters_connectionStatsLogs.append("Parameters:");
                            log4jParamters_connectionStatsLogs.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("USE_TNS_FILE" + " = " + "false");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("SCHEMA_DB" + " = " + "\"DW\"");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("USER" + " = " + "\"dw\"");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:jPOi+frxWTArw90BRjLGdsA8ISJTnrx+HlAt1AOhaD7g52o=").substring(0, 4) + "...");     
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("USE_SHARED_CONNECTION" + " = " + "true");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("SHARED_CONNECTION_NAME" + " = " + "\"jdbc:oracle:thin:@192.168.99.92:15211:DW\"+\"_StatsAndLog_Shared_Connection\"");
                        log4jParamters_connectionStatsLogs.append(" | ");
                            log4jParamters_connectionStatsLogs.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_connectionStatsLogs.append(" | ");
                if(log.isDebugEnabled())
            log.debug("connectionStatsLogs - "  + (log4jParamters_connectionStatsLogs) );
                    } 
                } 
            new BytesLimit65535_connectionStatsLogs().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("connectionStatsLogs", "connectionStatsLogs", "tOracleConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
        String url_connectionStatsLogs = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
    	globalMap.put("connectionType_" + "connectionStatsLogs", "ORACLE_SID");
	String dbUser_connectionStatsLogs = "dw";
	
	
		 
	final String decryptedPassword_connectionStatsLogs = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:QSNkgFewDebaMFQTSczMFTQ7xPNFym/pk2F1DAW8rtWZCxE=");
		String dbPwd_connectionStatsLogs = decryptedPassword_connectionStatsLogs;
	
	
	java.sql.Connection conn_connectionStatsLogs = null;
	
	
			SharedDBConnectionLog4j.initLogger(log.getName(),"connectionStatsLogs");
		String sharedConnectionName_connectionStatsLogs = "jdbc:oracle:thin:@192.168.99.92:15211:DW"+"_StatsAndLog_Shared_Connection";

				conn_connectionStatsLogs = SharedDBConnectionLog4j.getDBConnection("oracle.jdbc.OracleDriver",url_connectionStatsLogs,dbUser_connectionStatsLogs , dbPwd_connectionStatsLogs , sharedConnectionName_connectionStatsLogs);

		globalMap.put("conn_connectionStatsLogs", conn_connectionStatsLogs);
	if (null != conn_connectionStatsLogs) {
		
			log.debug("connectionStatsLogs - Connection is set auto commit to 'false'.");
			conn_connectionStatsLogs.setAutoCommit(false);
	}
        globalMap.put("host_" + "connectionStatsLogs","192.168.99.92");
        globalMap.put("port_" + "connectionStatsLogs","15211");
        globalMap.put("dbname_" + "connectionStatsLogs","BI");

	globalMap.put("dbschema_" + "connectionStatsLogs", "DW");
	globalMap.put("username_" + "connectionStatsLogs","dw");
	globalMap.put("password_" + "connectionStatsLogs",dbPwd_connectionStatsLogs);

 



/**
 * [connectionStatsLogs begin ] stop
 */
	
	/**
	 * [connectionStatsLogs main ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";

	

 


	tos_count_connectionStatsLogs++;

/**
 * [connectionStatsLogs main ] stop
 */
	
	/**
	 * [connectionStatsLogs process_data_begin ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";

	

 



/**
 * [connectionStatsLogs process_data_begin ] stop
 */
	
	/**
	 * [connectionStatsLogs process_data_end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";

	

 



/**
 * [connectionStatsLogs process_data_end ] stop
 */
	
	/**
	 * [connectionStatsLogs end ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";

	

 
                if(log.isDebugEnabled())
            log.debug("connectionStatsLogs - "  + ("Done.") );

ok_Hash.put("connectionStatsLogs", true);
end_Hash.put("connectionStatsLogs", System.currentTimeMillis());




/**
 * [connectionStatsLogs end ] stop
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
	 * [connectionStatsLogs finally ] start
	 */

	

	
	
	currentComponent="connectionStatsLogs";

	

 



/**
 * [connectionStatsLogs finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("connectionStatsLogs_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendStats_STATSStruct implements routines.system.IPersistableRow<row_talendStats_STATSStruct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}
				
			    public String pid;

				public String getPid () {
					return this.pid;
				}
				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}
				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}
				
			    public Long system_pid;

				public Long getSystem_pid () {
					return this.system_pid;
				}
				
			    public String project;

				public String getProject () {
					return this.project;
				}
				
			    public String job;

				public String getJob () {
					return this.job;
				}
				
			    public String job_repository_id;

				public String getJob_repository_id () {
					return this.job_repository_id;
				}
				
			    public String job_version;

				public String getJob_version () {
					return this.job_version;
				}
				
			    public String context;

				public String getContext () {
					return this.context;
				}
				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}
				
			    public String message_type;

				public String getMessage_type () {
					return this.message_type;
				}
				
			    public String message;

				public String getMessage () {
					return this.message;
				}
				
			    public Long duration;

				public Long getDuration () {
					return this.duration;
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

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
					
					this.message_type = readString(dis);
					
					this.message = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.duration = null;
           				} else {
           			    	this.duration = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

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
					
					this.message_type = readString(dis);
					
					this.message = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.duration = null;
           				} else {
           			    	this.duration = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message_type,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Long
				
						if(this.duration == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.duration);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message_type,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Long
				
						if(this.duration == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.duration);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",system_pid="+String.valueOf(system_pid));
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",job_repository_id="+job_repository_id);
		sb.append(",job_version="+job_version);
		sb.append(",context="+context);
		sb.append(",origin="+origin);
		sb.append(",message_type="+message_type);
		sb.append(",message="+message);
		sb.append(",duration="+String.valueOf(duration));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(system_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(system_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(job_repository_id == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job_repository_id);
            			}
            		
        			sb.append("|");
        		
        				if(job_version == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job_version);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(message_type == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message_type);
            			}
            		
        			sb.append("|");
        		
        				if(message == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message);
            			}
            		
        			sb.append("|");
        		
        				if(duration == null){
        					sb.append("<null>");
        				}else{
            				sb.append(duration);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row_talendStats_STATSStruct other) {

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
public void talendStats_STATSProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendStats_STATS_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendStats_STATSStruct row_talendStats_STATS = new row_talendStats_STATSStruct();




	
	/**
	 * [talendStats_DB begin ] start
	 */

	

	
		
		ok_Hash.put("talendStats_DB", false);
		start_Hash.put("talendStats_DB", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendStats_DB = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendStats_DB{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendStats_DB = new StringBuilder();
                    log4jParamters_talendStats_DB.append("Parameters:");
                            log4jParamters_talendStats_DB.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("CONNECTION" + " = " + "connectionStatsLogs");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("TABLE" + " = " + "\"stats\"");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("TABLE_ACTION" + " = " + "CREATE_IF_NOT_EXISTS");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_talendStats_DB.append(" | ");
                            log4jParamters_talendStats_DB.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_talendStats_DB.append(" | ");
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + (log4jParamters_talendStats_DB) );
                    } 
                } 
            new BytesLimit65535_talendStats_DB().limitLog4jByte();
            }






    
    int nb_line_talendStats_DB = 0;
    int nb_line_update_talendStats_DB = 0;
    int nb_line_inserted_talendStats_DB = 0;
    int nb_line_deleted_talendStats_DB = 0;
    int nb_line_rejected_talendStats_DB = 0;

    int tmp_batchUpdateCount_talendStats_DB = 0;

    int deletedCount_talendStats_DB=0;
    int updatedCount_talendStats_DB=0;
    int insertedCount_talendStats_DB=0;
    int rowsToCommitCount_talendStats_DB=0;
    int rejectedCount_talendStats_DB=0;

    boolean whetherReject_talendStats_DB = false;

    java.sql.Connection conn_talendStats_DB = null;

    //optional table
    String dbschema_talendStats_DB = null;
    String tableName_talendStats_DB = null;
        dbschema_talendStats_DB = (String)globalMap.get("dbschema_connectionStatsLogs");
		
        conn_talendStats_DB = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + ("Uses an existing connection with username '")  + (conn_talendStats_DB.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_talendStats_DB.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + ("Connection is set auto commit to '")  + (conn_talendStats_DB.getAutoCommit())  + ("'.") );
        int count_talendStats_DB=0;

        if(dbschema_talendStats_DB == null || dbschema_talendStats_DB.trim().length() == 0) {
            tableName_talendStats_DB = ("stats");
        } else {
            tableName_talendStats_DB = dbschema_talendStats_DB + "." + ("stats");
        }

                    // [%connection%][checktable][tableName]
                    String keyCheckTable_talendStats_DB = conn_talendStats_DB + "[checktable]" + "[" + "stats" + "]";

                if(GlobalResource.resourceMap.get(keyCheckTable_talendStats_DB)== null){//}

                    synchronized (GlobalResource.resourceLockMap.get(keyCheckTable_talendStats_DB)) {//}
                        if(GlobalResource.resourceMap.get(keyCheckTable_talendStats_DB)== null){//}
                                String tableNameForSearch_talendStats_DB= "" + ((String)"stats") + "";
String dbschemaForSearch_talendStats_DB= null;
if(dbschema_talendStats_DB== null || dbschema_talendStats_DB.trim().length() == 0) {
dbschemaForSearch_talendStats_DB= ((String)globalMap.get("username_connectionStatsLogs")).toUpperCase();
} else {
dbschemaForSearch_talendStats_DB= dbschema_talendStats_DB.toUpperCase();
}

                                java.sql.DatabaseMetaData dbMetaData_talendStats_DB = conn_talendStats_DB.getMetaData();
                                if(tableNameForSearch_talendStats_DB.indexOf("\"")==-1){
                                    tableNameForSearch_talendStats_DB = tableNameForSearch_talendStats_DB.toUpperCase();
                                }else{
                                    tableNameForSearch_talendStats_DB = tableNameForSearch_talendStats_DB.replaceAll("\"","");
                                }
                                boolean whetherExist_talendStats_DB = false;
                                try (java.sql.ResultSet rsTable_talendStats_DB = dbMetaData_talendStats_DB.getTables(null, dbschemaForSearch_talendStats_DB, tableNameForSearch_talendStats_DB, new String[]{"TABLE"})) {
                                    if(rsTable_talendStats_DB.next()) {
                                        whetherExist_talendStats_DB = true;
                                    }
                                }

                                if(!whetherExist_talendStats_DB) {
                                    try (java.sql.Statement stmtCreate_talendStats_DB = conn_talendStats_DB.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + ("Creating")  + (" table '")  + (tableName_talendStats_DB)  + ("'.") );
                                        stmtCreate_talendStats_DB.execute("CREATE TABLE " + tableName_talendStats_DB + "(moment DATE ,pid VARCHAR2(20)  ,father_pid VARCHAR2(20)  ,root_pid VARCHAR2(20)  ,system_pid NUMBER(8,0)  ,project VARCHAR2(50)  ,job VARCHAR2(255)  ,job_repository_id VARCHAR2(255)  ,job_version VARCHAR2(255)  ,context VARCHAR2(50)  ,origin VARCHAR2(255)  ,message_type VARCHAR2(255)  ,message VARCHAR2(255)  ,duration NUMBER(8,0)  )");
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + ("Create")  + (" table '")  + (tableName_talendStats_DB)  + ("' has succeeded.") );
                                    }
                                }
                            GlobalResource.resourceMap.put(keyCheckTable_talendStats_DB, true);
            //{{{
                        } // end of if
                    } // end synchronized
                }
                String insert_talendStats_DB = "INSERT INTO " + tableName_talendStats_DB + " (moment,pid,father_pid,root_pid,system_pid,project,job,job_repository_id,job_version,context,origin,message_type,message,duration) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_talendStats_DB = null;
                        // [%connection%][psmt][tableName]
                        String keyPsmt_talendStats_DB = conn_talendStats_DB + "[psmt]" + "[" + "stats" + "]";
                        pstmt_talendStats_DB = SharedDBPreparedStatement.getSharedPreparedStatement(conn_talendStats_DB,insert_talendStats_DB,keyPsmt_talendStats_DB);





 



/**
 * [talendStats_DB begin ] stop
 */



	
	/**
	 * [talendStats_STATS begin ] start
	 */

	

	
		
		ok_Hash.put("talendStats_STATS", false);
		start_Hash.put("talendStats_STATS", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";

	
		int tos_count_talendStats_STATS = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendStats_STATS - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendStats_STATS{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendStats_STATS = new StringBuilder();
                    log4jParamters_talendStats_STATS.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("talendStats_STATS - "  + (log4jParamters_talendStats_STATS) );
                    } 
                } 
            new BytesLimit65535_talendStats_STATS().limitLog4jByte();
            }

	for (StatCatcherUtils.StatCatcherMessage scm : talendStats_STATS.getMessages()) {
		row_talendStats_STATS.pid = pid;
		row_talendStats_STATS.root_pid = rootPid;
		row_talendStats_STATS.father_pid = fatherPid;	
    	row_talendStats_STATS.project = projectName;
    	row_talendStats_STATS.job = jobName;
    	row_talendStats_STATS.context = contextStr;
		row_talendStats_STATS.origin = (scm.getOrigin()==null || scm.getOrigin().length()<1 ? null : scm.getOrigin());
		row_talendStats_STATS.message = scm.getMessage();
		row_talendStats_STATS.duration = scm.getDuration();
		row_talendStats_STATS.moment = scm.getMoment();
		row_talendStats_STATS.message_type = scm.getMessageType();
		row_talendStats_STATS.job_version = scm.getJobVersion();
		row_talendStats_STATS.job_repository_id = scm.getJobId();
		row_talendStats_STATS.system_pid = scm.getSystemPid();

 



/**
 * [talendStats_STATS begin ] stop
 */
	
	/**
	 * [talendStats_STATS main ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";

	

 


	tos_count_talendStats_STATS++;

/**
 * [talendStats_STATS main ] stop
 */
	
	/**
	 * [talendStats_STATS process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";

	

 



/**
 * [talendStats_STATS process_data_begin ] stop
 */

	
	/**
	 * [talendStats_DB main ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					



        whetherReject_talendStats_DB = false;
                        if(row_talendStats_STATS.moment != null) {
pstmt_talendStats_DB.setTimestamp(1, new java.sql.Timestamp(row_talendStats_STATS.moment.getTime()));
} else {
pstmt_talendStats_DB.setNull(1, java.sql.Types.DATE);
}

                        if(row_talendStats_STATS.pid == null) {
pstmt_talendStats_DB.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(2, row_talendStats_STATS.pid);
}

                        if(row_talendStats_STATS.father_pid == null) {
pstmt_talendStats_DB.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(3, row_talendStats_STATS.father_pid);
}

                        if(row_talendStats_STATS.root_pid == null) {
pstmt_talendStats_DB.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(4, row_talendStats_STATS.root_pid);
}

                        if(row_talendStats_STATS.system_pid == null) {
pstmt_talendStats_DB.setNull(5, java.sql.Types.INTEGER);
} else {pstmt_talendStats_DB.setLong(5, row_talendStats_STATS.system_pid);
}

                        if(row_talendStats_STATS.project == null) {
pstmt_talendStats_DB.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(6, row_talendStats_STATS.project);
}

                        if(row_talendStats_STATS.job == null) {
pstmt_talendStats_DB.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(7, row_talendStats_STATS.job);
}

                        if(row_talendStats_STATS.job_repository_id == null) {
pstmt_talendStats_DB.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(8, row_talendStats_STATS.job_repository_id);
}

                        if(row_talendStats_STATS.job_version == null) {
pstmt_talendStats_DB.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(9, row_talendStats_STATS.job_version);
}

                        if(row_talendStats_STATS.context == null) {
pstmt_talendStats_DB.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(10, row_talendStats_STATS.context);
}

                        if(row_talendStats_STATS.origin == null) {
pstmt_talendStats_DB.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(11, row_talendStats_STATS.origin);
}

                        if(row_talendStats_STATS.message_type == null) {
pstmt_talendStats_DB.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(12, row_talendStats_STATS.message_type);
}

                        if(row_talendStats_STATS.message == null) {
pstmt_talendStats_DB.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_talendStats_DB.setString(13, row_talendStats_STATS.message);
}

                        if(row_talendStats_STATS.duration == null) {
pstmt_talendStats_DB.setNull(14, java.sql.Types.INTEGER);
} else {pstmt_talendStats_DB.setLong(14, row_talendStats_STATS.duration);
}

                try {
                    nb_line_talendStats_DB++;
                    int processedCount_talendStats_DB = pstmt_talendStats_DB.executeUpdate();
                    insertedCount_talendStats_DB += processedCount_talendStats_DB;
                    rowsToCommitCount_talendStats_DB += processedCount_talendStats_DB;
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + ("Inserting")  + (" the record ")  + (nb_line_talendStats_DB)  + (".") );
                } catch(java.lang.Exception e_talendStats_DB) {
globalMap.put("talendStats_DB_ERROR_MESSAGE",e_talendStats_DB.getMessage());
                    whetherReject_talendStats_DB = true;
            log.error("talendStats_DB - "  + (e_talendStats_DB.getMessage()) );
                            System.err.print(e_talendStats_DB.getMessage());
                }

 


	tos_count_talendStats_DB++;

/**
 * [talendStats_DB main ] stop
 */
	
	/**
	 * [talendStats_DB process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";

	

 



/**
 * [talendStats_DB process_data_begin ] stop
 */
	
	/**
	 * [talendStats_DB process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";

	

 



/**
 * [talendStats_DB process_data_end ] stop
 */



	
	/**
	 * [talendStats_STATS process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";

	

 



/**
 * [talendStats_STATS process_data_end ] stop
 */
	
	/**
	 * [talendStats_STATS end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";

	

	}


 
                if(log.isDebugEnabled())
            log.debug("talendStats_STATS - "  + ("Done.") );

ok_Hash.put("talendStats_STATS", true);
end_Hash.put("talendStats_STATS", System.currentTimeMillis());




/**
 * [talendStats_STATS end ] stop
 */

	
	/**
	 * [talendStats_DB end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";

	
	



	
        if(pstmt_talendStats_DB != null) {
			
				SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendStats_DB);
			
        }
    resourceMap.put("statementClosed_talendStats_DB", true);

	
	nb_line_deleted_talendStats_DB=nb_line_deleted_talendStats_DB+ deletedCount_talendStats_DB;
	nb_line_update_talendStats_DB=nb_line_update_talendStats_DB + updatedCount_talendStats_DB;
	nb_line_inserted_talendStats_DB=nb_line_inserted_talendStats_DB + insertedCount_talendStats_DB;
	nb_line_rejected_talendStats_DB=nb_line_rejected_talendStats_DB + rejectedCount_talendStats_DB;
	
        globalMap.put("talendStats_DB_NB_LINE",nb_line_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_UPDATED",nb_line_update_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_INSERTED",nb_line_inserted_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_DELETED",nb_line_deleted_talendStats_DB);
        globalMap.put("talendStats_DB_NB_LINE_REJECTED", nb_line_rejected_talendStats_DB);
    

	



				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 
                if(log.isDebugEnabled())
            log.debug("talendStats_DB - "  + ("Done.") );

ok_Hash.put("talendStats_DB", true);
end_Hash.put("talendStats_DB", System.currentTimeMillis());




/**
 * [talendStats_DB end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:talendStats_STATS:sub_ok_talendStats_connectionStatsLogs_Commit", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("sub_ok_talendStats_connectionStatsLogs_Commit", 0, "ok");
								} 
							
							connectionStatsLogs_CommitProcess(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendStats_STATS finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";

	

 



/**
 * [talendStats_STATS finally ] stop
 */

	
	/**
	 * [talendStats_DB finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_DB";
	
	currentComponent="talendStats_DB";

	



    if (resourceMap.get("statementClosed_talendStats_DB") == null) {
                java.sql.PreparedStatement pstmtToClose_talendStats_DB = null;
                if ((pstmtToClose_talendStats_DB = (java.sql.PreparedStatement) resourceMap.remove("pstmt_talendStats_DB")) != null) {
                    pstmtToClose_talendStats_DB.close();
                }
    }
 



/**
 * [talendStats_DB finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendStats_STATS_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendLogs_LOGSStruct implements routines.system.IPersistableRow<row_talendLogs_LOGSStruct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}
				
			    public String pid;

				public String getPid () {
					return this.pid;
				}
				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}
				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}
				
			    public String project;

				public String getProject () {
					return this.project;
				}
				
			    public String job;

				public String getJob () {
					return this.job;
				}
				
			    public String context;

				public String getContext () {
					return this.context;
				}
				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}
				
			    public String type;

				public String getType () {
					return this.type;
				}
				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}
				
			    public String message;

				public String getMessage () {
					return this.message;
				}
				
			    public Integer code;

				public Integer getCode () {
					return this.code;
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(priority == null){
        					sb.append("<null>");
        				}else{
            				sb.append(priority);
            			}
            		
        			sb.append("|");
        		
        				if(type == null){
        					sb.append("<null>");
        				}else{
            				sb.append(type);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(message == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message);
            			}
            		
        			sb.append("|");
        		
        				if(code == null){
        					sb.append("<null>");
        				}else{
            				sb.append(code);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row_talendLogs_LOGSStruct other) {

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
public void talendLogs_LOGSProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendLogs_LOGS_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendLogs_LOGSStruct row_talendLogs_LOGS = new row_talendLogs_LOGSStruct();




	
	/**
	 * [talendLogs_DB begin ] start
	 */

	

	
		
		ok_Hash.put("talendLogs_DB", false);
		start_Hash.put("talendLogs_DB", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendLogs_DB = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendLogs_DB{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendLogs_DB = new StringBuilder();
                    log4jParamters_talendLogs_DB.append("Parameters:");
                            log4jParamters_talendLogs_DB.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("CONNECTION" + " = " + "connectionStatsLogs");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("TABLE" + " = " + "\"logs\"");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("TABLE_ACTION" + " = " + "CREATE_IF_NOT_EXISTS");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_talendLogs_DB.append(" | ");
                            log4jParamters_talendLogs_DB.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_talendLogs_DB.append(" | ");
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + (log4jParamters_talendLogs_DB) );
                    } 
                } 
            new BytesLimit65535_talendLogs_DB().limitLog4jByte();
            }






    
    int nb_line_talendLogs_DB = 0;
    int nb_line_update_talendLogs_DB = 0;
    int nb_line_inserted_talendLogs_DB = 0;
    int nb_line_deleted_talendLogs_DB = 0;
    int nb_line_rejected_talendLogs_DB = 0;

    int tmp_batchUpdateCount_talendLogs_DB = 0;

    int deletedCount_talendLogs_DB=0;
    int updatedCount_talendLogs_DB=0;
    int insertedCount_talendLogs_DB=0;
    int rowsToCommitCount_talendLogs_DB=0;
    int rejectedCount_talendLogs_DB=0;

    boolean whetherReject_talendLogs_DB = false;

    java.sql.Connection conn_talendLogs_DB = null;

    //optional table
    String dbschema_talendLogs_DB = null;
    String tableName_talendLogs_DB = null;
        dbschema_talendLogs_DB = (String)globalMap.get("dbschema_connectionStatsLogs");
		
        conn_talendLogs_DB = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + ("Uses an existing connection with username '")  + (conn_talendLogs_DB.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_talendLogs_DB.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + ("Connection is set auto commit to '")  + (conn_talendLogs_DB.getAutoCommit())  + ("'.") );
        int count_talendLogs_DB=0;

        if(dbschema_talendLogs_DB == null || dbschema_talendLogs_DB.trim().length() == 0) {
            tableName_talendLogs_DB = ("logs");
        } else {
            tableName_talendLogs_DB = dbschema_talendLogs_DB + "." + ("logs");
        }

                    // [%connection%][checktable][tableName]
                    String keyCheckTable_talendLogs_DB = conn_talendLogs_DB + "[checktable]" + "[" + "logs" + "]";

                if(GlobalResource.resourceMap.get(keyCheckTable_talendLogs_DB)== null){//}

                    synchronized (GlobalResource.resourceLockMap.get(keyCheckTable_talendLogs_DB)) {//}
                        if(GlobalResource.resourceMap.get(keyCheckTable_talendLogs_DB)== null){//}
                                String tableNameForSearch_talendLogs_DB= "" + ((String)"logs") + "";
String dbschemaForSearch_talendLogs_DB= null;
if(dbschema_talendLogs_DB== null || dbschema_talendLogs_DB.trim().length() == 0) {
dbschemaForSearch_talendLogs_DB= ((String)globalMap.get("username_connectionStatsLogs")).toUpperCase();
} else {
dbschemaForSearch_talendLogs_DB= dbschema_talendLogs_DB.toUpperCase();
}

                                java.sql.DatabaseMetaData dbMetaData_talendLogs_DB = conn_talendLogs_DB.getMetaData();
                                if(tableNameForSearch_talendLogs_DB.indexOf("\"")==-1){
                                    tableNameForSearch_talendLogs_DB = tableNameForSearch_talendLogs_DB.toUpperCase();
                                }else{
                                    tableNameForSearch_talendLogs_DB = tableNameForSearch_talendLogs_DB.replaceAll("\"","");
                                }
                                boolean whetherExist_talendLogs_DB = false;
                                try (java.sql.ResultSet rsTable_talendLogs_DB = dbMetaData_talendLogs_DB.getTables(null, dbschemaForSearch_talendLogs_DB, tableNameForSearch_talendLogs_DB, new String[]{"TABLE"})) {
                                    if(rsTable_talendLogs_DB.next()) {
                                        whetherExist_talendLogs_DB = true;
                                    }
                                }

                                if(!whetherExist_talendLogs_DB) {
                                    try (java.sql.Statement stmtCreate_talendLogs_DB = conn_talendLogs_DB.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + ("Creating")  + (" table '")  + (tableName_talendLogs_DB)  + ("'.") );
                                        stmtCreate_talendLogs_DB.execute("CREATE TABLE " + tableName_talendLogs_DB + "(moment DATE ,pid VARCHAR2(20)  ,root_pid VARCHAR2(20)  ,father_pid VARCHAR2(20)  ,project VARCHAR2(50)  ,job VARCHAR2(255)  ,context VARCHAR2(50)  ,priority INT ,type VARCHAR2(255)  ,origin VARCHAR2(255)  ,message VARCHAR2(255)  ,code INT )");
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + ("Create")  + (" table '")  + (tableName_talendLogs_DB)  + ("' has succeeded.") );
                                    }
                                }
                            GlobalResource.resourceMap.put(keyCheckTable_talendLogs_DB, true);
            //{{{
                        } // end of if
                    } // end synchronized
                }
                String insert_talendLogs_DB = "INSERT INTO " + tableName_talendLogs_DB + " (moment,pid,root_pid,father_pid,project,job,context,priority,type,origin,message,code) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_talendLogs_DB = null;
                        // [%connection%][psmt][tableName]
                        String keyPsmt_talendLogs_DB = conn_talendLogs_DB + "[psmt]" + "[" + "logs" + "]";
                        pstmt_talendLogs_DB = SharedDBPreparedStatement.getSharedPreparedStatement(conn_talendLogs_DB,insert_talendLogs_DB,keyPsmt_talendLogs_DB);





 



/**
 * [talendLogs_DB begin ] stop
 */



	
	/**
	 * [talendLogs_LOGS begin ] start
	 */

	

	
		
		ok_Hash.put("talendLogs_LOGS", false);
		start_Hash.put("talendLogs_LOGS", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";

	
		int tos_count_talendLogs_LOGS = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendLogs_LOGS - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendLogs_LOGS{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendLogs_LOGS = new StringBuilder();
                    log4jParamters_talendLogs_LOGS.append("Parameters:");
                            log4jParamters_talendLogs_LOGS.append("CATCH_JAVA_EXCEPTION" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                            log4jParamters_talendLogs_LOGS.append("CATCH_TDIE" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                            log4jParamters_talendLogs_LOGS.append("CATCH_TWARN" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                            log4jParamters_talendLogs_LOGS.append("CATCH_TACTIONFAILURE" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                if(log.isDebugEnabled())
            log.debug("talendLogs_LOGS - "  + (log4jParamters_talendLogs_LOGS) );
                    } 
                } 
            new BytesLimit65535_talendLogs_LOGS().limitLog4jByte();
            }

try {
	for (LogCatcherUtils.LogCatcherMessage lcm : talendLogs_LOGS.getMessages()) {
		row_talendLogs_LOGS.type = lcm.getType();
		row_talendLogs_LOGS.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
		row_talendLogs_LOGS.priority = lcm.getPriority();
		row_talendLogs_LOGS.message = lcm.getMessage();
		row_talendLogs_LOGS.code = lcm.getCode();
		
		row_talendLogs_LOGS.moment = java.util.Calendar.getInstance().getTime();
	
    	row_talendLogs_LOGS.pid = pid;
		row_talendLogs_LOGS.root_pid = rootPid;
		row_talendLogs_LOGS.father_pid = fatherPid;
	
    	row_talendLogs_LOGS.project = projectName;
    	row_talendLogs_LOGS.job = jobName;
    	row_talendLogs_LOGS.context = contextStr;
    		
 



/**
 * [talendLogs_LOGS begin ] stop
 */
	
	/**
	 * [talendLogs_LOGS main ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";

	

 


	tos_count_talendLogs_LOGS++;

/**
 * [talendLogs_LOGS main ] stop
 */
	
	/**
	 * [talendLogs_LOGS process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";

	

 



/**
 * [talendLogs_LOGS process_data_begin ] stop
 */

	
	/**
	 * [talendLogs_DB main ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					



        whetherReject_talendLogs_DB = false;
                        if(row_talendLogs_LOGS.moment != null) {
pstmt_talendLogs_DB.setTimestamp(1, new java.sql.Timestamp(row_talendLogs_LOGS.moment.getTime()));
} else {
pstmt_talendLogs_DB.setNull(1, java.sql.Types.DATE);
}

                        if(row_talendLogs_LOGS.pid == null) {
pstmt_talendLogs_DB.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(2, row_talendLogs_LOGS.pid);
}

                        if(row_talendLogs_LOGS.root_pid == null) {
pstmt_talendLogs_DB.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(3, row_talendLogs_LOGS.root_pid);
}

                        if(row_talendLogs_LOGS.father_pid == null) {
pstmt_talendLogs_DB.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(4, row_talendLogs_LOGS.father_pid);
}

                        if(row_talendLogs_LOGS.project == null) {
pstmt_talendLogs_DB.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(5, row_talendLogs_LOGS.project);
}

                        if(row_talendLogs_LOGS.job == null) {
pstmt_talendLogs_DB.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(6, row_talendLogs_LOGS.job);
}

                        if(row_talendLogs_LOGS.context == null) {
pstmt_talendLogs_DB.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(7, row_talendLogs_LOGS.context);
}

                        if(row_talendLogs_LOGS.priority == null) {
pstmt_talendLogs_DB.setNull(8, java.sql.Types.INTEGER);
} else {pstmt_talendLogs_DB.setInt(8, row_talendLogs_LOGS.priority);
}

                        if(row_talendLogs_LOGS.type == null) {
pstmt_talendLogs_DB.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(9, row_talendLogs_LOGS.type);
}

                        if(row_talendLogs_LOGS.origin == null) {
pstmt_talendLogs_DB.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(10, row_talendLogs_LOGS.origin);
}

                        if(row_talendLogs_LOGS.message == null) {
pstmt_talendLogs_DB.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_talendLogs_DB.setString(11, row_talendLogs_LOGS.message);
}

                        if(row_talendLogs_LOGS.code == null) {
pstmt_talendLogs_DB.setNull(12, java.sql.Types.INTEGER);
} else {pstmt_talendLogs_DB.setInt(12, row_talendLogs_LOGS.code);
}

                try {
                    nb_line_talendLogs_DB++;
                    int processedCount_talendLogs_DB = pstmt_talendLogs_DB.executeUpdate();
                    insertedCount_talendLogs_DB += processedCount_talendLogs_DB;
                    rowsToCommitCount_talendLogs_DB += processedCount_talendLogs_DB;
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + ("Inserting")  + (" the record ")  + (nb_line_talendLogs_DB)  + (".") );
                } catch(java.lang.Exception e_talendLogs_DB) {
globalMap.put("talendLogs_DB_ERROR_MESSAGE",e_talendLogs_DB.getMessage());
                    whetherReject_talendLogs_DB = true;
            log.error("talendLogs_DB - "  + (e_talendLogs_DB.getMessage()) );
                            System.err.print(e_talendLogs_DB.getMessage());
                }

 


	tos_count_talendLogs_DB++;

/**
 * [talendLogs_DB main ] stop
 */
	
	/**
	 * [talendLogs_DB process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";

	

 



/**
 * [talendLogs_DB process_data_begin ] stop
 */
	
	/**
	 * [talendLogs_DB process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";

	

 



/**
 * [talendLogs_DB process_data_end ] stop
 */



	
	/**
	 * [talendLogs_LOGS process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";

	

 



/**
 * [talendLogs_LOGS process_data_end ] stop
 */
	
	/**
	 * [talendLogs_LOGS end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";

	
	}
} catch (Exception e_talendLogs_LOGS) {
globalMap.put("talendLogs_LOGS_ERROR_MESSAGE",e_talendLogs_LOGS.getMessage());
	logIgnoredError(String.format("talendLogs_LOGS - tLogCatcher failed to process log message(s) due to internal error: %s", e_talendLogs_LOGS), e_talendLogs_LOGS);
}

 
                if(log.isDebugEnabled())
            log.debug("talendLogs_LOGS - "  + ("Done.") );

ok_Hash.put("talendLogs_LOGS", true);
end_Hash.put("talendLogs_LOGS", System.currentTimeMillis());




/**
 * [talendLogs_LOGS end ] stop
 */

	
	/**
	 * [talendLogs_DB end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";

	
	



	
        if(pstmt_talendLogs_DB != null) {
			
				SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendLogs_DB);
			
        }
    resourceMap.put("statementClosed_talendLogs_DB", true);

	
	nb_line_deleted_talendLogs_DB=nb_line_deleted_talendLogs_DB+ deletedCount_talendLogs_DB;
	nb_line_update_talendLogs_DB=nb_line_update_talendLogs_DB + updatedCount_talendLogs_DB;
	nb_line_inserted_talendLogs_DB=nb_line_inserted_talendLogs_DB + insertedCount_talendLogs_DB;
	nb_line_rejected_talendLogs_DB=nb_line_rejected_talendLogs_DB + rejectedCount_talendLogs_DB;
	
        globalMap.put("talendLogs_DB_NB_LINE",nb_line_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_UPDATED",nb_line_update_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_INSERTED",nb_line_inserted_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_DELETED",nb_line_deleted_talendLogs_DB);
        globalMap.put("talendLogs_DB_NB_LINE_REJECTED", nb_line_rejected_talendLogs_DB);
    

	



				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 
                if(log.isDebugEnabled())
            log.debug("talendLogs_DB - "  + ("Done.") );

ok_Hash.put("talendLogs_DB", true);
end_Hash.put("talendLogs_DB", System.currentTimeMillis());




/**
 * [talendLogs_DB end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:talendLogs_LOGS:sub_ok_talendLogs_connectionStatsLogs_Commit", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("sub_ok_talendLogs_connectionStatsLogs_Commit", 0, "ok");
								} 
							
							connectionStatsLogs_CommitProcess(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendLogs_LOGS finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";

	

 



/**
 * [talendLogs_LOGS finally ] stop
 */

	
	/**
	 * [talendLogs_DB finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_DB";
	
	currentComponent="talendLogs_DB";

	



    if (resourceMap.get("statementClosed_talendLogs_DB") == null) {
                java.sql.PreparedStatement pstmtToClose_talendLogs_DB = null;
                if ((pstmtToClose_talendLogs_DB = (java.sql.PreparedStatement) resourceMap.remove("pstmt_talendLogs_DB")) != null) {
                    pstmtToClose_talendLogs_DB.close();
                }
    }
 



/**
 * [talendLogs_DB finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendLogs_LOGS_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendMeter_METTERStruct implements routines.system.IPersistableRow<row_talendMeter_METTERStruct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}
				
			    public String pid;

				public String getPid () {
					return this.pid;
				}
				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}
				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}
				
			    public Long system_pid;

				public Long getSystem_pid () {
					return this.system_pid;
				}
				
			    public String project;

				public String getProject () {
					return this.project;
				}
				
			    public String job;

				public String getJob () {
					return this.job;
				}
				
			    public String job_repository_id;

				public String getJob_repository_id () {
					return this.job_repository_id;
				}
				
			    public String job_version;

				public String getJob_version () {
					return this.job_version;
				}
				
			    public String context;

				public String getContext () {
					return this.context;
				}
				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}
				
			    public String label;

				public String getLabel () {
					return this.label;
				}
				
			    public Integer count;

				public Integer getCount () {
					return this.count;
				}
				
			    public Integer reference;

				public Integer getReference () {
					return this.reference;
				}
				
			    public String thresholds;

				public String getThresholds () {
					return this.thresholds;
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

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH_ARTICLE_CASSE_FRAIS) {

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
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.count,dos);
					
					// Integer
				
						writeInteger(this.reference,dos);
					
					// String
				
						writeString(this.thresholds,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.label,dos);
					
					// Integer
				
						writeInteger(this.count,dos);
					
					// Integer
				
						writeInteger(this.reference,dos);
					
					// String
				
						writeString(this.thresholds,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",system_pid="+String.valueOf(system_pid));
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",job_repository_id="+job_repository_id);
		sb.append(",job_version="+job_version);
		sb.append(",context="+context);
		sb.append(",origin="+origin);
		sb.append(",label="+label);
		sb.append(",count="+String.valueOf(count));
		sb.append(",reference="+String.valueOf(reference));
		sb.append(",thresholds="+thresholds);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(system_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(system_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(job_repository_id == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job_repository_id);
            			}
            		
        			sb.append("|");
        		
        				if(job_version == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job_version);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(label == null){
        					sb.append("<null>");
        				}else{
            				sb.append(label);
            			}
            		
        			sb.append("|");
        		
        				if(count == null){
        					sb.append("<null>");
        				}else{
            				sb.append(count);
            			}
            		
        			sb.append("|");
        		
        				if(reference == null){
        					sb.append("<null>");
        				}else{
            				sb.append(reference);
            			}
            		
        			sb.append("|");
        		
        				if(thresholds == null){
        					sb.append("<null>");
        				}else{
            				sb.append(thresholds);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row_talendMeter_METTERStruct other) {

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
public void talendMeter_METTERProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendMeter_METTER_SUBPROCESS_STATE", 0);

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
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendMeter_METTERStruct row_talendMeter_METTER = new row_talendMeter_METTERStruct();




	
	/**
	 * [talendMeter_DB begin ] start
	 */

	

	
		
		ok_Hash.put("talendMeter_DB", false);
		start_Hash.put("talendMeter_DB", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendMeter_DB = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendMeter_DB{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendMeter_DB = new StringBuilder();
                    log4jParamters_talendMeter_DB.append("Parameters:");
                            log4jParamters_talendMeter_DB.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("CONNECTION" + " = " + "connectionStatsLogs");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("TABLE" + " = " + "\"FLOWMETER\"");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("TABLE_ACTION" + " = " + "CREATE_IF_NOT_EXISTS");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("USE_ALTERNATE_SCHEMA" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("USE_BATCH_AND_USE_CONN" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_talendMeter_DB.append(" | ");
                            log4jParamters_talendMeter_DB.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_talendMeter_DB.append(" | ");
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + (log4jParamters_talendMeter_DB) );
                    } 
                } 
            new BytesLimit65535_talendMeter_DB().limitLog4jByte();
            }






    
    int nb_line_talendMeter_DB = 0;
    int nb_line_update_talendMeter_DB = 0;
    int nb_line_inserted_talendMeter_DB = 0;
    int nb_line_deleted_talendMeter_DB = 0;
    int nb_line_rejected_talendMeter_DB = 0;

    int tmp_batchUpdateCount_talendMeter_DB = 0;

    int deletedCount_talendMeter_DB=0;
    int updatedCount_talendMeter_DB=0;
    int insertedCount_talendMeter_DB=0;
    int rowsToCommitCount_talendMeter_DB=0;
    int rejectedCount_talendMeter_DB=0;

    boolean whetherReject_talendMeter_DB = false;

    java.sql.Connection conn_talendMeter_DB = null;

    //optional table
    String dbschema_talendMeter_DB = null;
    String tableName_talendMeter_DB = null;
        dbschema_talendMeter_DB = (String)globalMap.get("dbschema_connectionStatsLogs");
		
        conn_talendMeter_DB = (java.sql.Connection)globalMap.get("conn_connectionStatsLogs");
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + ("Uses an existing connection with username '")  + (conn_talendMeter_DB.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_talendMeter_DB.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + ("Connection is set auto commit to '")  + (conn_talendMeter_DB.getAutoCommit())  + ("'.") );
        int count_talendMeter_DB=0;

        if(dbschema_talendMeter_DB == null || dbschema_talendMeter_DB.trim().length() == 0) {
            tableName_talendMeter_DB = ("FLOWMETER");
        } else {
            tableName_talendMeter_DB = dbschema_talendMeter_DB + "." + ("FLOWMETER");
        }

                    // [%connection%][checktable][tableName]
                    String keyCheckTable_talendMeter_DB = conn_talendMeter_DB + "[checktable]" + "[" + "FLOWMETER" + "]";

                if(GlobalResource.resourceMap.get(keyCheckTable_talendMeter_DB)== null){//}

                    synchronized (GlobalResource.resourceLockMap.get(keyCheckTable_talendMeter_DB)) {//}
                        if(GlobalResource.resourceMap.get(keyCheckTable_talendMeter_DB)== null){//}
                                String tableNameForSearch_talendMeter_DB= "" + ((String)"FLOWMETER") + "";
String dbschemaForSearch_talendMeter_DB= null;
if(dbschema_talendMeter_DB== null || dbschema_talendMeter_DB.trim().length() == 0) {
dbschemaForSearch_talendMeter_DB= ((String)globalMap.get("username_connectionStatsLogs")).toUpperCase();
} else {
dbschemaForSearch_talendMeter_DB= dbschema_talendMeter_DB.toUpperCase();
}

                                java.sql.DatabaseMetaData dbMetaData_talendMeter_DB = conn_talendMeter_DB.getMetaData();
                                if(tableNameForSearch_talendMeter_DB.indexOf("\"")==-1){
                                    tableNameForSearch_talendMeter_DB = tableNameForSearch_talendMeter_DB.toUpperCase();
                                }else{
                                    tableNameForSearch_talendMeter_DB = tableNameForSearch_talendMeter_DB.replaceAll("\"","");
                                }
                                boolean whetherExist_talendMeter_DB = false;
                                try (java.sql.ResultSet rsTable_talendMeter_DB = dbMetaData_talendMeter_DB.getTables(null, dbschemaForSearch_talendMeter_DB, tableNameForSearch_talendMeter_DB, new String[]{"TABLE"})) {
                                    if(rsTable_talendMeter_DB.next()) {
                                        whetherExist_talendMeter_DB = true;
                                    }
                                }

                                if(!whetherExist_talendMeter_DB) {
                                    try (java.sql.Statement stmtCreate_talendMeter_DB = conn_talendMeter_DB.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + ("Creating")  + (" table '")  + (tableName_talendMeter_DB)  + ("'.") );
                                        stmtCreate_talendMeter_DB.execute("CREATE TABLE " + tableName_talendMeter_DB + "(moment DATE ,pid VARCHAR2(20)  ,father_pid VARCHAR2(20)  ,root_pid VARCHAR2(20)  ,system_pid NUMBER(8,0)  ,project VARCHAR2(50)  ,job VARCHAR2(255)  ,job_repository_id VARCHAR2(255)  ,job_version VARCHAR2(255)  ,context VARCHAR2(50)  ,origin VARCHAR2(255)  ,label VARCHAR2(255)  ,count INT ,reference INT ,thresholds VARCHAR2(255)  )");
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + ("Create")  + (" table '")  + (tableName_talendMeter_DB)  + ("' has succeeded.") );
                                    }
                                }
                            GlobalResource.resourceMap.put(keyCheckTable_talendMeter_DB, true);
            //{{{
                        } // end of if
                    } // end synchronized
                }
                String insert_talendMeter_DB = "INSERT INTO " + tableName_talendMeter_DB + " (moment,pid,father_pid,root_pid,system_pid,project,job,job_repository_id,job_version,context,origin,label,count,reference,thresholds) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_talendMeter_DB = null;
                        // [%connection%][psmt][tableName]
                        String keyPsmt_talendMeter_DB = conn_talendMeter_DB + "[psmt]" + "[" + "FLOWMETER" + "]";
                        pstmt_talendMeter_DB = SharedDBPreparedStatement.getSharedPreparedStatement(conn_talendMeter_DB,insert_talendMeter_DB,keyPsmt_talendMeter_DB);





 



/**
 * [talendMeter_DB begin ] stop
 */



	
	/**
	 * [talendMeter_METTER begin ] start
	 */

	

	
		
		ok_Hash.put("talendMeter_METTER", false);
		start_Hash.put("talendMeter_METTER", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";

	
		int tos_count_talendMeter_METTER = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendMeter_METTER - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendMeter_METTER{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendMeter_METTER = new StringBuilder();
                    log4jParamters_talendMeter_METTER.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("talendMeter_METTER - "  + (log4jParamters_talendMeter_METTER) );
                    } 
                } 
            new BytesLimit65535_talendMeter_METTER().limitLog4jByte();
            }

	for (MetterCatcherUtils.MetterCatcherMessage mcm : talendMeter_METTER.getMessages()) {
		row_talendMeter_METTER.pid = pid;
		row_talendMeter_METTER.root_pid = rootPid;
		row_talendMeter_METTER.father_pid = fatherPid;	
        row_talendMeter_METTER.project = projectName;
        row_talendMeter_METTER.job = jobName;
        row_talendMeter_METTER.context = contextStr;
		row_talendMeter_METTER.origin = (mcm.getOrigin()==null || mcm.getOrigin().length()<1 ? null : mcm.getOrigin());
		row_talendMeter_METTER.moment = mcm.getMoment();
		row_talendMeter_METTER.job_version = mcm.getJobVersion();
		row_talendMeter_METTER.job_repository_id = mcm.getJobId();
		row_talendMeter_METTER.system_pid = mcm.getSystemPid();
		row_talendMeter_METTER.label = mcm.getLabel();
		row_talendMeter_METTER.count = mcm.getCount();
		row_talendMeter_METTER.reference = talendMeter_METTER.getConnLinesCount(mcm.getReferense()+"_count");
		row_talendMeter_METTER.thresholds = mcm.getThresholds();
		

 



/**
 * [talendMeter_METTER begin ] stop
 */
	
	/**
	 * [talendMeter_METTER main ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";

	

 


	tos_count_talendMeter_METTER++;

/**
 * [talendMeter_METTER main ] stop
 */
	
	/**
	 * [talendMeter_METTER process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";

	

 



/**
 * [talendMeter_METTER process_data_begin ] stop
 */

	
	/**
	 * [talendMeter_DB main ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					



        whetherReject_talendMeter_DB = false;
                        if(row_talendMeter_METTER.moment != null) {
pstmt_talendMeter_DB.setTimestamp(1, new java.sql.Timestamp(row_talendMeter_METTER.moment.getTime()));
} else {
pstmt_talendMeter_DB.setNull(1, java.sql.Types.DATE);
}

                        if(row_talendMeter_METTER.pid == null) {
pstmt_talendMeter_DB.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(2, row_talendMeter_METTER.pid);
}

                        if(row_talendMeter_METTER.father_pid == null) {
pstmt_talendMeter_DB.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(3, row_talendMeter_METTER.father_pid);
}

                        if(row_talendMeter_METTER.root_pid == null) {
pstmt_talendMeter_DB.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(4, row_talendMeter_METTER.root_pid);
}

                        if(row_talendMeter_METTER.system_pid == null) {
pstmt_talendMeter_DB.setNull(5, java.sql.Types.INTEGER);
} else {pstmt_talendMeter_DB.setLong(5, row_talendMeter_METTER.system_pid);
}

                        if(row_talendMeter_METTER.project == null) {
pstmt_talendMeter_DB.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(6, row_talendMeter_METTER.project);
}

                        if(row_talendMeter_METTER.job == null) {
pstmt_talendMeter_DB.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(7, row_talendMeter_METTER.job);
}

                        if(row_talendMeter_METTER.job_repository_id == null) {
pstmt_talendMeter_DB.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(8, row_talendMeter_METTER.job_repository_id);
}

                        if(row_talendMeter_METTER.job_version == null) {
pstmt_talendMeter_DB.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(9, row_talendMeter_METTER.job_version);
}

                        if(row_talendMeter_METTER.context == null) {
pstmt_talendMeter_DB.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(10, row_talendMeter_METTER.context);
}

                        if(row_talendMeter_METTER.origin == null) {
pstmt_talendMeter_DB.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(11, row_talendMeter_METTER.origin);
}

                        if(row_talendMeter_METTER.label == null) {
pstmt_talendMeter_DB.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(12, row_talendMeter_METTER.label);
}

                        if(row_talendMeter_METTER.count == null) {
pstmt_talendMeter_DB.setNull(13, java.sql.Types.INTEGER);
} else {pstmt_talendMeter_DB.setInt(13, row_talendMeter_METTER.count);
}

                        if(row_talendMeter_METTER.reference == null) {
pstmt_talendMeter_DB.setNull(14, java.sql.Types.INTEGER);
} else {pstmt_talendMeter_DB.setInt(14, row_talendMeter_METTER.reference);
}

                        if(row_talendMeter_METTER.thresholds == null) {
pstmt_talendMeter_DB.setNull(15, java.sql.Types.VARCHAR);
} else {pstmt_talendMeter_DB.setString(15, row_talendMeter_METTER.thresholds);
}

                try {
                    nb_line_talendMeter_DB++;
                    int processedCount_talendMeter_DB = pstmt_talendMeter_DB.executeUpdate();
                    insertedCount_talendMeter_DB += processedCount_talendMeter_DB;
                    rowsToCommitCount_talendMeter_DB += processedCount_talendMeter_DB;
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + ("Inserting")  + (" the record ")  + (nb_line_talendMeter_DB)  + (".") );
                } catch(java.lang.Exception e_talendMeter_DB) {
globalMap.put("talendMeter_DB_ERROR_MESSAGE",e_talendMeter_DB.getMessage());
                    whetherReject_talendMeter_DB = true;
            log.error("talendMeter_DB - "  + (e_talendMeter_DB.getMessage()) );
                            System.err.print(e_talendMeter_DB.getMessage());
                }

 


	tos_count_talendMeter_DB++;

/**
 * [talendMeter_DB main ] stop
 */
	
	/**
	 * [talendMeter_DB process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";

	

 



/**
 * [talendMeter_DB process_data_begin ] stop
 */
	
	/**
	 * [talendMeter_DB process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";

	

 



/**
 * [talendMeter_DB process_data_end ] stop
 */



	
	/**
	 * [talendMeter_METTER process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";

	

 



/**
 * [talendMeter_METTER process_data_end ] stop
 */
	
	/**
	 * [talendMeter_METTER end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";

	

	}


 
                if(log.isDebugEnabled())
            log.debug("talendMeter_METTER - "  + ("Done.") );

ok_Hash.put("talendMeter_METTER", true);
end_Hash.put("talendMeter_METTER", System.currentTimeMillis());




/**
 * [talendMeter_METTER end ] stop
 */

	
	/**
	 * [talendMeter_DB end ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";

	
	



	
        if(pstmt_talendMeter_DB != null) {
			
				SharedDBPreparedStatement.releasePreparedStatement(keyPsmt_talendMeter_DB);
			
        }
    resourceMap.put("statementClosed_talendMeter_DB", true);

	
	nb_line_deleted_talendMeter_DB=nb_line_deleted_talendMeter_DB+ deletedCount_talendMeter_DB;
	nb_line_update_talendMeter_DB=nb_line_update_talendMeter_DB + updatedCount_talendMeter_DB;
	nb_line_inserted_talendMeter_DB=nb_line_inserted_talendMeter_DB + insertedCount_talendMeter_DB;
	nb_line_rejected_talendMeter_DB=nb_line_rejected_talendMeter_DB + rejectedCount_talendMeter_DB;
	
        globalMap.put("talendMeter_DB_NB_LINE",nb_line_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_UPDATED",nb_line_update_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_INSERTED",nb_line_inserted_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_DELETED",nb_line_deleted_talendMeter_DB);
        globalMap.put("talendMeter_DB_NB_LINE_REJECTED", nb_line_rejected_talendMeter_DB);
    

	



				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 
                if(log.isDebugEnabled())
            log.debug("talendMeter_DB - "  + ("Done.") );

ok_Hash.put("talendMeter_DB", true);
end_Hash.put("talendMeter_DB", System.currentTimeMillis());




/**
 * [talendMeter_DB end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:talendMeter_METTER:sub_ok_talendMeter_connectionStatsLogs_Commit", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("sub_ok_talendMeter_connectionStatsLogs_Commit", 0, "ok");
								} 
							
							connectionStatsLogs_CommitProcess(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendMeter_METTER finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_METTER";
	
	currentComponent="talendMeter_METTER";

	

 



/**
 * [talendMeter_METTER finally ] stop
 */

	
	/**
	 * [talendMeter_DB finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendMeter_DB";
	
	currentComponent="talendMeter_DB";

	



    if (resourceMap.get("statementClosed_talendMeter_DB") == null) {
                java.sql.PreparedStatement pstmtToClose_talendMeter_DB = null;
                if ((pstmtToClose_talendMeter_DB = (java.sql.PreparedStatement) resourceMap.remove("pstmt_talendMeter_DB")) != null) {
                    pstmtToClose_talendMeter_DB.close();
                }
    }
 



/**
 * [talendMeter_DB finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendMeter_METTER_SUBPROCESS_STATE", 1);
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
        final DWH_ARTICLE_CASSE_FRAIS DWH_ARTICLE_CASSE_FRAISClass = new DWH_ARTICLE_CASSE_FRAIS();

        int exitCode = DWH_ARTICLE_CASSE_FRAISClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'DWH_ARTICLE_CASSE_FRAIS' - Done.");
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
        	log.info("TalendJob: 'DWH_ARTICLE_CASSE_FRAIS' - Start.");
    	
    	
    	
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
            java.io.InputStream inContext = DWH_ARTICLE_CASSE_FRAIS.class.getClassLoader().getResourceAsStream("bi_team_projects/dwh_article_casse_frais_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = DWH_ARTICLE_CASSE_FRAIS.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {
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
        talendStats_STATS.addMessage("begin");


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;preStaLogConProcess(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_preStaLogCon) {
globalMap.put("preStaLogCon_SUBPROCESS_STATE", -1);

e_preStaLogCon.printStackTrace();

}



        try {
            talendStats_STATSProcess(globalMap);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
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

try {
errorCode = null;tDBInput_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBInput_1) {
globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

e_tDBInput_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : DWH_ARTICLE_CASSE_FRAIS");
        }
        talendStats_STATS.addMessage(status==""?"end":status, (end-startTime));
        try {
            talendStats_STATSProcess(globalMap);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
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
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_connectionStatsLogs");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_connectionStatsLogs");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_connectionStatsLogs", globalMap.get("conn_connectionStatsLogs"));
            connections.put("conn_connectionStatsLogs", globalMap.get("conn_connectionStatsLogs"));






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
 *     412695 characters generated by Talend Cloud Data Management Platform 
 *     on the 21 juillet 2022 à 17:05:29 WEST
 ************************************************************************************************/