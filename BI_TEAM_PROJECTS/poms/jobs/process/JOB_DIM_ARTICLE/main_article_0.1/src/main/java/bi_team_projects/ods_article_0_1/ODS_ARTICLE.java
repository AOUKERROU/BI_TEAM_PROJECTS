
package bi_team_projects.ods_article_0_1;

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
 * Job: ODS_ARTICLE Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status 
 */
public class ODS_ARTICLE implements TalendJob {
	static {System.setProperty("TalendJob.log", "ODS_ARTICLE.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(ODS_ARTICLE.class);
	

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
	private final String jobName = "ODS_ARTICLE";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_5XIUkB0vEeyr8JHfQ7Qjrw", "0.1");
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
				ODS_ARTICLE.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(ODS_ARTICLE.this, new Object[] { e , currentComponent, globalMap});
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

			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError1", 0, "error");
								}
							
							
								errorCode = null;
								tDie_1Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
						try {
							
								if(this.execStat){
									runStat.updateStatOnConnection("OnComponentError2", 0, "error");
								}
							
							
								errorCode = null;
								tDie_2Process(globalMap);
								if (!"failure".equals(status)) {
									status = "end";
								}
								

						} catch (Exception e) {
							e.printStackTrace();
						}
						
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_4_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_7_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_7_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_7_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_9_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_9_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_10_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_11_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_12_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_13_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_14_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row17_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row18_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row21_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row16_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row19_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row20_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
			public void tDBInput_8_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public static class out1Struct implements routines.system.IPersistableRow<out1Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_GROUPE_PRODUIT;

				public String getID_GROUPE_PRODUIT () {
					return this.ID_GROUPE_PRODUIT;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_CEXUV;

				public BigDecimal getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String EAN13;

				public String getEAN13 () {
					return this.EAN13;
				}
				
			    public String ARTICLE_COURT;

				public String getARTICLE_COURT () {
					return this.ARTICLE_COURT;
				}
				
			    public String ARTICLE_LONG;

				public String getARTICLE_LONG () {
					return this.ARTICLE_LONG;
				}
				
			    public BigDecimal ID_ETAT;

				public BigDecimal getID_ETAT () {
					return this.ID_ETAT;
				}
				
			    public String ETAT_COURT;

				public String getETAT_COURT () {
					return this.ETAT_COURT;
				}
				
			    public String ETAT_LONG;

				public String getETAT_LONG () {
					return this.ETAT_LONG;
				}
				
			    public java.util.Date DT_CREATION;

				public java.util.Date getDT_CREATION () {
					return this.DT_CREATION;
				}
				
			    public String SAISONNALITE;

				public String getSAISONNALITE () {
					return this.SAISONNALITE;
				}
				
			    public String ARTICLE_PROVENANCE;

				public String getARTICLE_PROVENANCE () {
					return this.ARTICLE_PROVENANCE;
				}
				
			    public String ARTICLE_DETENTION;

				public String getARTICLE_DETENTION () {
					return this.ARTICLE_DETENTION;
				}
				
			    public String ARTICLE_TYPE;

				public String getARTICLE_TYPE () {
					return this.ARTICLE_TYPE;
				}
				
			    public String ARTICLE_QRTL;

				public String getARTICLE_QRTL () {
					return this.ARTICLE_QRTL;
				}
				
			    public String ARTICLE_MARQ;

				public String getARTICLE_MARQ () {
					return this.ARTICLE_MARQ;
				}
				
			    public BigDecimal CONTENANCE;

				public BigDecimal getCONTENANCE () {
					return this.CONTENANCE;
				}
				
			    public BigDecimal PA;

				public BigDecimal getPA () {
					return this.PA;
				}
				
			    public BigDecimal PV;

				public BigDecimal getPV () {
					return this.PV;
				}
				
			    public BigDecimal DEBUT_STOCK;

				public BigDecimal getDEBUT_STOCK () {
					return this.DEBUT_STOCK;
				}
				
			    public BigDecimal FIN_STOCK;

				public BigDecimal getFIN_STOCK () {
					return this.FIN_STOCK;
				}
				
			    public BigDecimal RUPT_LONG_DUREE;

				public BigDecimal getRUPT_LONG_DUREE () {
					return this.RUPT_LONG_DUREE;
				}
				
			    public String ID_FOURNISSEUR;

				public String getID_FOURNISSEUR () {
					return this.ID_FOURNISSEUR;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
						this.ID_ETAT = (BigDecimal) dis.readObject();
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readDate(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
						this.CONTENANCE = (BigDecimal) dis.readObject();
					
						this.PA = (BigDecimal) dis.readObject();
					
						this.PV = (BigDecimal) dis.readObject();
					
						this.DEBUT_STOCK = (BigDecimal) dis.readObject();
					
						this.FIN_STOCK = (BigDecimal) dis.readObject();
					
						this.RUPT_LONG_DUREE = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
						this.ID_ETAT = (BigDecimal) dis.readObject();
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readDate(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
						this.CONTENANCE = (BigDecimal) dis.readObject();
					
						this.PA = (BigDecimal) dis.readObject();
					
						this.PV = (BigDecimal) dis.readObject();
					
						this.DEBUT_STOCK = (BigDecimal) dis.readObject();
					
						this.FIN_STOCK = (BigDecimal) dis.readObject();
					
						this.RUPT_LONG_DUREE = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ETAT);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// java.util.Date
				
						writeDate(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CONTENANCE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DEBUT_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIN_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RUPT_LONG_DUREE);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ETAT);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// java.util.Date
				
						writeDate(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CONTENANCE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DEBUT_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIN_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RUPT_LONG_DUREE);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_GROUPE_PRODUIT="+ID_GROUPE_PRODUIT);
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_CEXUV="+String.valueOf(ID_ARTICLE_CEXUV));
		sb.append(",EAN13="+EAN13);
		sb.append(",ARTICLE_COURT="+ARTICLE_COURT);
		sb.append(",ARTICLE_LONG="+ARTICLE_LONG);
		sb.append(",ID_ETAT="+String.valueOf(ID_ETAT));
		sb.append(",ETAT_COURT="+ETAT_COURT);
		sb.append(",ETAT_LONG="+ETAT_LONG);
		sb.append(",DT_CREATION="+String.valueOf(DT_CREATION));
		sb.append(",SAISONNALITE="+SAISONNALITE);
		sb.append(",ARTICLE_PROVENANCE="+ARTICLE_PROVENANCE);
		sb.append(",ARTICLE_DETENTION="+ARTICLE_DETENTION);
		sb.append(",ARTICLE_TYPE="+ARTICLE_TYPE);
		sb.append(",ARTICLE_QRTL="+ARTICLE_QRTL);
		sb.append(",ARTICLE_MARQ="+ARTICLE_MARQ);
		sb.append(",CONTENANCE="+String.valueOf(CONTENANCE));
		sb.append(",PA="+String.valueOf(PA));
		sb.append(",PV="+String.valueOf(PV));
		sb.append(",DEBUT_STOCK="+String.valueOf(DEBUT_STOCK));
		sb.append(",FIN_STOCK="+String.valueOf(FIN_STOCK));
		sb.append(",RUPT_LONG_DUREE="+String.valueOf(RUPT_LONG_DUREE));
		sb.append(",ID_FOURNISSEUR="+ID_FOURNISSEUR);
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_GROUPE_PRODUIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_GROUPE_PRODUIT);
            			}
            		
        			sb.append("|");
        		
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(EAN13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN13);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(DT_CREATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_CREATION);
            			}
            		
        			sb.append("|");
        		
        				if(SAISONNALITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAISONNALITE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_DETENTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_DETENTION);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_QRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_QRTL);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_MARQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_MARQ);
            			}
            		
        			sb.append("|");
        		
        				if(CONTENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(PA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PA);
            			}
            		
        			sb.append("|");
        		
        				if(PV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PV);
            			}
            		
        			sb.append("|");
        		
        				if(DEBUT_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEBUT_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(FIN_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIN_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(RUPT_LONG_DUREE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RUPT_LONG_DUREE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_GROUPE_PRODUIT;

				public String getID_GROUPE_PRODUIT () {
					return this.ID_GROUPE_PRODUIT;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_CEXUV;

				public BigDecimal getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String EAN13;

				public String getEAN13 () {
					return this.EAN13;
				}
				
			    public String ARTICLE_COURT;

				public String getARTICLE_COURT () {
					return this.ARTICLE_COURT;
				}
				
			    public String ARTICLE_LONG;

				public String getARTICLE_LONG () {
					return this.ARTICLE_LONG;
				}
				
			    public BigDecimal ID_ETAT;

				public BigDecimal getID_ETAT () {
					return this.ID_ETAT;
				}
				
			    public String ETAT_COURT;

				public String getETAT_COURT () {
					return this.ETAT_COURT;
				}
				
			    public String ETAT_LONG;

				public String getETAT_LONG () {
					return this.ETAT_LONG;
				}
				
			    public java.util.Date DT_CREATION;

				public java.util.Date getDT_CREATION () {
					return this.DT_CREATION;
				}
				
			    public String SAISONNALITE;

				public String getSAISONNALITE () {
					return this.SAISONNALITE;
				}
				
			    public String ARTICLE_PROVENANCE;

				public String getARTICLE_PROVENANCE () {
					return this.ARTICLE_PROVENANCE;
				}
				
			    public String ARTICLE_DETENTION;

				public String getARTICLE_DETENTION () {
					return this.ARTICLE_DETENTION;
				}
				
			    public String ARTICLE_TYPE;

				public String getARTICLE_TYPE () {
					return this.ARTICLE_TYPE;
				}
				
			    public String ARTICLE_QRTL;

				public String getARTICLE_QRTL () {
					return this.ARTICLE_QRTL;
				}
				
			    public String ARTICLE_MARQ;

				public String getARTICLE_MARQ () {
					return this.ARTICLE_MARQ;
				}
				
			    public BigDecimal CONTENANCE;

				public BigDecimal getCONTENANCE () {
					return this.CONTENANCE;
				}
				
			    public BigDecimal PA;

				public BigDecimal getPA () {
					return this.PA;
				}
				
			    public BigDecimal PV;

				public BigDecimal getPV () {
					return this.PV;
				}
				
			    public BigDecimal DEBUT_STOCK;

				public BigDecimal getDEBUT_STOCK () {
					return this.DEBUT_STOCK;
				}
				
			    public BigDecimal FIN_STOCK;

				public BigDecimal getFIN_STOCK () {
					return this.FIN_STOCK;
				}
				
			    public BigDecimal RUPT_LONG_DUREE;

				public BigDecimal getRUPT_LONG_DUREE () {
					return this.RUPT_LONG_DUREE;
				}
				
			    public String ID_FOURNISSEUR;

				public String getID_FOURNISSEUR () {
					return this.ID_FOURNISSEUR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_ARTICLE_CEXR = readString(dis);
					
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
						this.ID_ETAT = (BigDecimal) dis.readObject();
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readDate(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
						this.CONTENANCE = (BigDecimal) dis.readObject();
					
						this.PA = (BigDecimal) dis.readObject();
					
						this.PV = (BigDecimal) dis.readObject();
					
						this.DEBUT_STOCK = (BigDecimal) dis.readObject();
					
						this.FIN_STOCK = (BigDecimal) dis.readObject();
					
						this.RUPT_LONG_DUREE = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISSEUR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_ARTICLE_CEXR = readString(dis);
					
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
						this.ID_ETAT = (BigDecimal) dis.readObject();
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readDate(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
						this.CONTENANCE = (BigDecimal) dis.readObject();
					
						this.PA = (BigDecimal) dis.readObject();
					
						this.PV = (BigDecimal) dis.readObject();
					
						this.DEBUT_STOCK = (BigDecimal) dis.readObject();
					
						this.FIN_STOCK = (BigDecimal) dis.readObject();
					
						this.RUPT_LONG_DUREE = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISSEUR = readString(dis);
					
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
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ETAT);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// java.util.Date
				
						writeDate(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CONTENANCE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DEBUT_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIN_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RUPT_LONG_DUREE);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ETAT);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// java.util.Date
				
						writeDate(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CONTENANCE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DEBUT_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIN_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RUPT_LONG_DUREE);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
		sb.append(",ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_GROUPE_PRODUIT="+ID_GROUPE_PRODUIT);
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_CEXUV="+String.valueOf(ID_ARTICLE_CEXUV));
		sb.append(",EAN13="+EAN13);
		sb.append(",ARTICLE_COURT="+ARTICLE_COURT);
		sb.append(",ARTICLE_LONG="+ARTICLE_LONG);
		sb.append(",ID_ETAT="+String.valueOf(ID_ETAT));
		sb.append(",ETAT_COURT="+ETAT_COURT);
		sb.append(",ETAT_LONG="+ETAT_LONG);
		sb.append(",DT_CREATION="+String.valueOf(DT_CREATION));
		sb.append(",SAISONNALITE="+SAISONNALITE);
		sb.append(",ARTICLE_PROVENANCE="+ARTICLE_PROVENANCE);
		sb.append(",ARTICLE_DETENTION="+ARTICLE_DETENTION);
		sb.append(",ARTICLE_TYPE="+ARTICLE_TYPE);
		sb.append(",ARTICLE_QRTL="+ARTICLE_QRTL);
		sb.append(",ARTICLE_MARQ="+ARTICLE_MARQ);
		sb.append(",CONTENANCE="+String.valueOf(CONTENANCE));
		sb.append(",PA="+String.valueOf(PA));
		sb.append(",PV="+String.valueOf(PV));
		sb.append(",DEBUT_STOCK="+String.valueOf(DEBUT_STOCK));
		sb.append(",FIN_STOCK="+String.valueOf(FIN_STOCK));
		sb.append(",RUPT_LONG_DUREE="+String.valueOf(RUPT_LONG_DUREE));
		sb.append(",ID_FOURNISSEUR="+ID_FOURNISSEUR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_GROUPE_PRODUIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_GROUPE_PRODUIT);
            			}
            		
        			sb.append("|");
        		
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(EAN13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN13);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(DT_CREATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_CREATION);
            			}
            		
        			sb.append("|");
        		
        				if(SAISONNALITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAISONNALITE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_DETENTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_DETENTION);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_QRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_QRTL);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_MARQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_MARQ);
            			}
            		
        			sb.append("|");
        		
        				if(CONTENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(PA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PA);
            			}
            		
        			sb.append("|");
        		
        				if(PV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PV);
            			}
            		
        			sb.append("|");
        		
        				if(DEBUT_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEBUT_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(FIN_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIN_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(RUPT_LONG_DUREE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RUPT_LONG_DUREE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR);
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
out1Struct out1 = new out1Struct();





	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out1");
			
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
                            log4jParamters_tDBOutput_1.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:VDs+APOGmxdU9wjSOewCxqyQo0iPOUtZUqY5qHD2UAQV/8UD").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"ODS_STRUCTURE_MARCHANDISE_TMP\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE_ACTION" + " = " + "TRUNCATE");
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
                            log4jParamters_tDBOutput_1.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "true");
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
				talendJobLog.addCM("tDBOutput_1", "STRUCTURE_MARCHANDISE_TMP", "tOracleOutput");
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
                String dbUser_tDBOutput_1 = "ods";
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:m094AbU27R5q5ljq/xoFo+G86akD2nPzuv2zyMEAe38JtW/e");

                String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;
                dbschema_tDBOutput_1 = "ODS";

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
            tableName_tDBOutput_1 = ("ODS_STRUCTURE_MARCHANDISE_TMP").toUpperCase();
        } else {
            tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "." + ("ODS_STRUCTURE_MARCHANDISE_TMP").toUpperCase();
        }
            int rsTruncCountNumber_tDBOutput_1 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_1 = stmtTruncCount_tDBOutput_1.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_1 + "")) {
                    if(rsTruncCount_tDBOutput_1.next()) {
                        rsTruncCountNumber_tDBOutput_1 = rsTruncCount_tDBOutput_1.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_1 = conn_tDBOutput_1.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_1)  + ("'.") );
                stmtTrunc_tDBOutput_1.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_1 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_1)  + ("' has succeeded.") );
                deletedCount_tDBOutput_1 += rsTruncCountNumber_tDBOutput_1;
            }
                String insert_tDBOutput_1 = "INSERT INTO " + tableName_tDBOutput_1 + " (ID_DEPARTEMENT_INT,ID_RAYON_INT,ID_FAMILLE_INT,ID_SFAMILLE_INT,ID_SSFAMILLE_INT,ID_UNITE_BESOIN_INT,ID_GROUPE_PRODUIT,ID_ARTICLE_INR,ID_ARTICLE_INV,ID_ARTICLE,ID_ARTICLE_CEXUV,EAN13,ARTICLE_COURT,ARTICLE_LONG,ID_ETAT,ETAT_COURT,ETAT_LONG,DT_CREATION,SAISONNALITE,ARTICLE_PROVENANCE,ARTICLE_DETENTION,ARTICLE_TYPE,ARTICLE_QRTL,ARTICLE_MARQ,CONTENANCE,PA,PV,DEBUT_STOCK,FIN_STOCK,RUPT_LONG_DUREE,ID_FOURNISSEUR,ID_ARTICLE_CEXR) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
                        resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);





 



/**
 * [tDBOutput_1 begin ] stop
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
                            log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:+dWikhuYH5WjrNhyC9b8dhW6+WUj8iTMq6+LF9or8Z3U0A==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"SELECT   ID_ARTICLE_CEXR,  ID_DEPARTEMENT_INT,                  ID_RAYON_INT,                  ID_FAMILLE_INT,                  ID_SFAMILLE_INT,                  ID_SSFAMILLE_INT,                  ID_UNITE_BESOIN_INT,                  ID_GROUPE_PRODUIT,                  ID_ARTICLE_INR,                  ID_ARTICLE_INV,                  ID_ARTICLE,                  ID_ARTICLE_CEXUV,                  EAN13,                  ARTICLE_COURT,                  ARTICLE_LONG,                  ID_ETAT,                  ETAT_COURT,                  ETAT_LONG,                  DT_CREATION,                  SAISONNALITE,                 ARTICLE_PROVENANCE,                  ARTICLE_DETENTION,                  ARTICLE_TYPE,                  ARTICLE_QRTL,                  ARTICLE_MARQ,                  CONTENANCE,                  PA,                  PV,                  DEBUT_STOCK,                  FIN_STOCK,                  RUPT_LONG_DUREE,                  NVL (SUBSTR (PKFOUDGENE.GET_CNUF (FCLCFIN), 1, 13), -1)                     AS ID_FOURNISSEUR             FROM (SELECT NVL (PKSTRUCREL.GET_NIVEAU ('1',                                                      ARTCINR,                                                      2,                                                      SYSDATE),                               ARTCINR)                             AS ID_DEPARTEMENT_INT,                          NVL (PKSTRUCREL.GET_NIVEAU ('1',                                                      ARTCINR,                                                      3,                                                      SYSDATE),                               ARTCINR)                             AS ID_RAYON_INT,                          NVL (PKSTRUCREL.GET_NIVEAU ('1',                                                      ARTCINR,                                                      4,                                                      SYSDATE),                               ARTCINR)                             AS ID_FAMILLE_INT,                          NVL (PKSTRUCREL.GET_NIVEAU ('1',                                                      ARTCINR,                                                      5,                                                      SYSDATE),                               ARTCINR)                             AS ID_SFAMILLE_INT,                          NVL (PKSTRUCREL.GET_NIVEAU ('1',                                                      ARTCINR,                                                      6,                                                      SYSDATE),                               ARTCINR)                             AS ID_SSFAMILLE_INT,                          NVL (PKSTRUCREL.GET_NIVEAU ('1',                                                      ARTCINR,                                                      7,                                                      SYSDATE),                               ARTCINR)                             AS ID_UNITE_BESOIN_INT,                          NVL (mj_gram.GetGpNum (ARTCINR), -1) AS ID_GROUPE_PRODUIT,                          ARTCINR AS ID_ARTICLE_INR,                          NVL (ARVCINV, -1) AS ID_ARTICLE_INV,                          SUBSTR (PKSTRUCOBJ.GET_CEXT (ARTCINR), 1, 13) AS ID_ARTICLE,                          NVL (ARVCEXV, -1) AS ID_ARTICLE_CEXUV,                         NVL (ARVCEXR, -1) AS ID_ARTICLE_CEXR,                                                SUBSTR (PKARTCOCA.GET_CLOSESTEAN (ARVCINV), 1, 13) AS EAN13,                          SUBSTR (PKSTRUCOBJ.GET_DESC (ARVCLIBL, 'FR'), 1, 20)                             AS ARTICLE_COURT,                          SUBSTR (PKSTRUCOBJ.GET_DESC (ARVCLIBL, 'FR'), 1, 50)                             AS ARTICLE_LONG,                          ARTETAT AS ID_ETAT,                          SUBSTR (PKPARPOSTES.GET_POSTLIBC (10,                                                            955,                                                            ARTETAT,                                                            'FR'), 1, 1)                             AS ETAT_COURT,                          SUBSTR (PKPARPOSTES.GET_POSTLIBL (10,                                                            955,                                                            ARTETAT,                                                            'FR'), 1, 20)                             AS ETAT_LONG,                          ARTDCRE AS DT_CREATION,                          mj_pkmarjane.get_saisonnalite (ARTCINR) AS SAISONNALITE,                          NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'PROV'),                               'ND')                             AS ARTICLE_PROVENANCE,                          NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'DET'),                               'ND')                             AS ARTICLE_DETENTION,                          NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'TYPE'),                               'ND')                             AS ARTICLE_TYPE,                          NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'QRTL'),                               'ND')                             AS ARTICLE_QRTL,                          NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'MARQ'),                               'ND')                             AS ARTICLE_MARQ,                          NVL (V.ARVPUVC, -1) AS CONTENANCE,                          NVL (mj_pkmarjane.                                select_prix_achat (                                  v.arvcinr,                                  v.arvcinv,                                  mj_pkmarjane.                                   GET_SEQVL_FOURN_PRINCIPAL (v.arvcinr, 99, SYSDATE),                                  1,                                  99,                                  mj_pkmarjane.                                   GET_FOURNISSEUR_PRINCIPAL (v.arvcinr, 99, SYSDATE),                                  mj_pkmarjane.                                   GET_CONTRAT_COM_PRINCIPAL (v.arvcinr, 99, SYSDATE),                                  SYSDATE),                               0)                             AS PA,                          NVL (                             MJ_PKMARJANE.                              GET_PRIX_VENTE_PERMANENT_CINV (v.arvcinv, 99, SYSDATE),                             0)                             AS PV,                          NVL (                             (SELECT 1                                FROM artattri                               WHERE     aatcinr = v.arvcinr                                     AND aatccla = 'DEBS'                                     AND aatcatt = 'DEBS'                                     AND TRUNC (SYSDATE) BETWEEN aatddeb AND aatdfin                                     AND ROWNUM = 1),                             0)                             AS DEBUT_STOCK,                          NVL (                             (SELECT 1                                FROM artattri                               WHERE     aatcinr = v.arvcinr                                     AND aatccla = 'FINS'                                     AND aatcatt = 'FINS'                                     AND TRUNC (SYSDATE) BETWEEN aatddeb AND aatdfin                                     AND ROWNUM = 1),                             0)                             AS FIN_STOCK,                          NVL (                             (SELECT 1                                FROM artattri                               WHERE     aatcinr = v.arvcinr                                     AND aatccla = 'RUPT'                                     AND aatcatt = 'LONG'                                     AND TRUNC (SYSDATE) BETWEEN aatddeb AND aatdfin                                     AND ROWNUM = 1),                             0)                             AS RUPT_LONG_DUREE                     FROM ARTRAC A, ARTUV V                    WHERE A.ARTCINR = V.ARVCINR(+)) A,                  FOUCATALOG F            WHERE A.ID_ARTICLE_INV = F.FCLCINV(+)\"");
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
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_CEXR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_UNITE_BESOIN_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_GROUPE_PRODUIT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_CEXUV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EAN13")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_COURT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_LONG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ETAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT_COURT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT_LONG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DT_CREATION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SAISONNALITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_PROVENANCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_DETENTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_QRTL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_MARQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONTENANCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEBUT_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FIN_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RUPT_LONG_DUREE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR")+"}]");
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

				

				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:p39F8n95rzlIYJ//BCTWwEJ0EMe9qIYgfXzPMay48g3YEg==");

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

		    String dbquery_tDBInput_1 = "SELECT   ID_ARTICLE_CEXR,\nID_DEPARTEMENT_INT, \n               ID_RAYON_INT, \n               ID_FAMILLE_INT, \n      "
+"         ID_SFAMILLE_INT, \n               ID_SSFAMILLE_INT, \n               ID_UNITE_BESOIN_INT, \n               ID_G"
+"ROUPE_PRODUIT, \n               ID_ARTICLE_INR, \n               ID_ARTICLE_INV, \n               ID_ARTICLE, \n        "
+"       ID_ARTICLE_CEXUV, \n               EAN13, \n               ARTICLE_COURT, \n               ARTICLE_LONG, \n      "
+"         ID_ETAT, \n               ETAT_COURT, \n               ETAT_LONG, \n               DT_CREATION, \n             "
+"  SAISONNALITE,\n               ARTICLE_PROVENANCE, \n               ARTICLE_DETENTION, \n               ARTICLE_TYPE, "
+"\n               ARTICLE_QRTL, \n               ARTICLE_MARQ, \n               CONTENANCE, \n               PA, \n       "
+"        PV, \n               DEBUT_STOCK, \n               FIN_STOCK, \n               RUPT_LONG_DUREE, \n              "
+" NVL (SUBSTR (PKFOUDGENE.GET_CNUF (FCLCFIN), 1, 13), -1) \n                  AS ID_FOURNISSEUR \n          FROM (SELECT "
+"NVL (PKSTRUCREL.GET_NIVEAU ('1', \n                                                   ARTCINR, \n                       "
+"                            2, \n                                                   SYSDATE), \n                        "
+"    ARTCINR) \n                          AS ID_DEPARTEMENT_INT, \n                       NVL (PKSTRUCREL.GET_NIVEAU ('1'"
+", \n                                                   ARTCINR, \n                                                   3, "
+"\n                                                   SYSDATE), \n                            ARTCINR) \n                "
+"          AS ID_RAYON_INT, \n                       NVL (PKSTRUCREL.GET_NIVEAU ('1', \n                                 "
+"                  ARTCINR, \n                                                   4, \n                                   "
+"                SYSDATE), \n                            ARTCINR) \n                          AS ID_FAMILLE_INT, \n      "
+"                 NVL (PKSTRUCREL.GET_NIVEAU ('1', \n                                                   ARTCINR, \n      "
+"                                             5, \n                                                   SYSDATE), \n       "
+"                     ARTCINR) \n                          AS ID_SFAMILLE_INT, \n                       NVL (PKSTRUCREL.G"
+"ET_NIVEAU ('1', \n                                                   ARTCINR, \n                                        "
+"           6, \n                                                   SYSDATE), \n                            ARTCINR) \n  "
+"                        AS ID_SSFAMILLE_INT, \n                       NVL (PKSTRUCREL.GET_NIVEAU ('1', \n               "
+"                                    ARTCINR, \n                                                   7, \n                 "
+"                                  SYSDATE), \n                            ARTCINR) \n                          AS ID_UNI"
+"TE_BESOIN_INT, \n                       NVL (mj_gram.GetGpNum (ARTCINR), -1) AS ID_GROUPE_PRODUIT, \n                   "
+"    ARTCINR AS ID_ARTICLE_INR, \n                       NVL (ARVCINV, -1) AS ID_ARTICLE_INV, \n                       SU"
+"BSTR (PKSTRUCOBJ.GET_CEXT (ARTCINR), 1, 13) AS ID_ARTICLE, \n                       NVL (ARVCEXV, -1) AS ID_ARTICLE_CEXU"
+"V,\n                       NVL (ARVCEXR, -1) AS ID_ARTICLE_CEXR,                       \n                       SUBSTR ("
+"PKARTCOCA.GET_CLOSESTEAN (ARVCINV), 1, 13) AS EAN13, \n                       SUBSTR (PKSTRUCOBJ.GET_DESC (ARVCLIBL, 'FR"
+"'), 1, 20) \n                          AS ARTICLE_COURT, \n                       SUBSTR (PKSTRUCOBJ.GET_DESC (ARVCLIBL,"
+" 'FR'), 1, 50) \n                          AS ARTICLE_LONG, \n                       ARTETAT AS ID_ETAT, \n             "
+"          SUBSTR (PKPARPOSTES.GET_POSTLIBC (10, \n                                                         955, \n      "
+"                                                   ARTETAT, \n                                                         '"
+"FR'), 1, 1) \n                          AS ETAT_COURT, \n                       SUBSTR (PKPARPOSTES.GET_POSTLIBL (10, \n"
+"                                                         955, \n                                                        "
+" ARTETAT, \n                                                         'FR'), 1, 20) \n                          AS ETAT_L"
+"ONG, \n                       ARTDCRE AS DT_CREATION, \n                       mj_pkmarjane.get_saisonnalite (ARTCINR) A"
+"S SAISONNALITE, \n                       NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'PROV'), \n                  "
+"          'ND') \n                          AS ARTICLE_PROVENANCE, \n                       NVL (mj_pkmarjane.GET_ART_LI"
+"BL_ATTRIBUT (ARTCINR, 'DET'), \n                            'ND') \n                          AS ARTICLE_DETENTION, \n  "
+"                     NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'TYPE'), \n                            'ND') \n  "
+"                        AS ARTICLE_TYPE, \n                       NVL (mj_pkmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'QRT"
+"L'), \n                            'ND') \n                          AS ARTICLE_QRTL, \n                       NVL (mj_p"
+"kmarjane.GET_ART_LIBL_ATTRIBUT (ARTCINR, 'MARQ'), \n                            'ND') \n                          AS ART"
+"ICLE_MARQ, \n                       NVL (V.ARVPUVC, -1) AS CONTENANCE, \n                       NVL (mj_pkmarjane. \n   "
+"                          select_prix_achat ( \n                               v.arvcinr, \n                            "
+"   v.arvcinv, \n                               mj_pkmarjane. \n                                GET_SEQVL_FOURN_PRINCIPAL"
+" (v.arvcinr, 99, SYSDATE), \n                               1, \n                               99, \n                  "
+"             mj_pkmarjane. \n                                GET_FOURNISSEUR_PRINCIPAL (v.arvcinr, 99, SYSDATE), \n     "
+"                          mj_pkmarjane. \n                                GET_CONTRAT_COM_PRINCIPAL (v.arvcinr, 99, SYSD"
+"ATE), \n                               SYSDATE), \n                            0) \n                          AS PA, \n "
+"                      NVL ( \n                          MJ_PKMARJANE. \n                           GET_PRIX_VENTE_PERMAN"
+"ENT_CINV (v.arvcinv, 99, SYSDATE), \n                          0) \n                          AS PV, \n                 "
+"      NVL ( \n                          (SELECT 1 \n                             FROM artattri \n                       "
+"     WHERE     aatcinr = v.arvcinr \n                                  AND aatccla = 'DEBS' \n                          "
+"        AND aatcatt = 'DEBS' \n                                  AND TRUNC (SYSDATE) BETWEEN aatddeb AND aatdfin \n     "
+"                             AND ROWNUM = 1), \n                          0) \n                          AS DEBUT_STOCK,"
+" \n                       NVL ( \n                          (SELECT 1 \n                             FROM artattri \n   "
+"                         WHERE     aatcinr = v.arvcinr \n                                  AND aatccla = 'FINS' \n      "
+"                            AND aatcatt = 'FINS' \n                                  AND TRUNC (SYSDATE) BETWEEN aatddeb"
+" AND aatdfin \n                                  AND ROWNUM = 1), \n                          0) \n                     "
+"     AS FIN_STOCK, \n                       NVL ( \n                          (SELECT 1 \n                             F"
+"ROM artattri \n                            WHERE     aatcinr = v.arvcinr \n                                  AND aatccla"
+" = 'RUPT' \n                                  AND aatcatt = 'LONG' \n                                  AND TRUNC (SYSDAT"
+"E) BETWEEN aatddeb AND aatdfin \n                                  AND ROWNUM = 1), \n                          0) \n   "
+"                       AS RUPT_LONG_DUREE \n                  FROM ARTRAC A, ARTUV V \n                 WHERE A.ARTCINR "
+"= V.ARVCINR(+)) A, \n               FOUCATALOG F \n         WHERE A.ID_ARTICLE_INV = F.FCLCINV(+)";
		    
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
								row1.ID_ARTICLE_CEXR = null;
							} else {
	                         		
        	row1.ID_ARTICLE_CEXR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.ID_DEPARTEMENT_INT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(2) != null) {
						row1.ID_DEPARTEMENT_INT = rs_tDBInput_1.getBigDecimal(2);
					} else {
				
						row1.ID_DEPARTEMENT_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.ID_RAYON_INT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(3) != null) {
						row1.ID_RAYON_INT = rs_tDBInput_1.getBigDecimal(3);
					} else {
				
						row1.ID_RAYON_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.ID_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(4) != null) {
						row1.ID_FAMILLE_INT = rs_tDBInput_1.getBigDecimal(4);
					} else {
				
						row1.ID_FAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.ID_SFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(5) != null) {
						row1.ID_SFAMILLE_INT = rs_tDBInput_1.getBigDecimal(5);
					} else {
				
						row1.ID_SFAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.ID_SSFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(6) != null) {
						row1.ID_SSFAMILLE_INT = rs_tDBInput_1.getBigDecimal(6);
					} else {
				
						row1.ID_SSFAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.ID_UNITE_BESOIN_INT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(7) != null) {
						row1.ID_UNITE_BESOIN_INT = rs_tDBInput_1.getBigDecimal(7);
					} else {
				
						row1.ID_UNITE_BESOIN_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.ID_GROUPE_PRODUIT = null;
							} else {
	                         		
        	row1.ID_GROUPE_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 8, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.ID_ARTICLE_INR = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(9) != null) {
						row1.ID_ARTICLE_INR = rs_tDBInput_1.getBigDecimal(9);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.ID_ARTICLE_INV = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(10) != null) {
						row1.ID_ARTICLE_INV = rs_tDBInput_1.getBigDecimal(10);
					} else {
				
						row1.ID_ARTICLE_INV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.ID_ARTICLE = null;
							} else {
	                         		
        	row1.ID_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 11, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.ID_ARTICLE_CEXUV = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(12) != null) {
						row1.ID_ARTICLE_CEXUV = rs_tDBInput_1.getBigDecimal(12);
					} else {
				
						row1.ID_ARTICLE_CEXUV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.EAN13 = null;
							} else {
	                         		
        	row1.EAN13 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 13, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.ARTICLE_COURT = null;
							} else {
	                         		
        	row1.ARTICLE_COURT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 14, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.ARTICLE_LONG = null;
							} else {
	                         		
        	row1.ARTICLE_LONG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.ID_ETAT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(16) != null) {
						row1.ID_ETAT = rs_tDBInput_1.getBigDecimal(16);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.ETAT_COURT = null;
							} else {
	                         		
        	row1.ETAT_COURT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.ETAT_LONG = null;
							} else {
	                         		
        	row1.ETAT_LONG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row1.DT_CREATION = null;
							} else {
										
			row1.DT_CREATION = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 19);
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row1.SAISONNALITE = null;
							} else {
	                         		
        	row1.SAISONNALITE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 20, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row1.ARTICLE_PROVENANCE = null;
							} else {
	                         		
        	row1.ARTICLE_PROVENANCE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 21, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row1.ARTICLE_DETENTION = null;
							} else {
	                         		
        	row1.ARTICLE_DETENTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row1.ARTICLE_TYPE = null;
							} else {
	                         		
        	row1.ARTICLE_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 23, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row1.ARTICLE_QRTL = null;
							} else {
	                         		
        	row1.ARTICLE_QRTL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 24, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 25) {
								row1.ARTICLE_MARQ = null;
							} else {
	                         		
        	row1.ARTICLE_MARQ = routines.system.JDBCUtil.getString(rs_tDBInput_1, 25, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 26) {
								row1.CONTENANCE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(26) != null) {
						row1.CONTENANCE = rs_tDBInput_1.getBigDecimal(26);
					} else {
				
						row1.CONTENANCE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 27) {
								row1.PA = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(27) != null) {
						row1.PA = rs_tDBInput_1.getBigDecimal(27);
					} else {
				
						row1.PA = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 28) {
								row1.PV = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(28) != null) {
						row1.PV = rs_tDBInput_1.getBigDecimal(28);
					} else {
				
						row1.PV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 29) {
								row1.DEBUT_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(29) != null) {
						row1.DEBUT_STOCK = rs_tDBInput_1.getBigDecimal(29);
					} else {
				
						row1.DEBUT_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 30) {
								row1.FIN_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(30) != null) {
						row1.FIN_STOCK = rs_tDBInput_1.getBigDecimal(30);
					} else {
				
						row1.FIN_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 31) {
								row1.RUPT_LONG_DUREE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(31) != null) {
						row1.RUPT_LONG_DUREE = rs_tDBInput_1.getBigDecimal(31);
					} else {
				
						row1.RUPT_LONG_DUREE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 32) {
								row1.ID_FOURNISSEUR = null;
							} else {
	                         		
        	row1.ID_FOURNISSEUR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 32, false);
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

out1_tmp.ID_DEPARTEMENT_INT = row1.ID_DEPARTEMENT_INT ;
out1_tmp.ID_RAYON_INT = row1.ID_RAYON_INT ;
out1_tmp.ID_FAMILLE_INT = row1.ID_FAMILLE_INT ;
out1_tmp.ID_SFAMILLE_INT = row1.ID_SFAMILLE_INT ;
out1_tmp.ID_SSFAMILLE_INT = row1.ID_SSFAMILLE_INT ;
out1_tmp.ID_UNITE_BESOIN_INT = row1.ID_UNITE_BESOIN_INT ;
out1_tmp.ID_GROUPE_PRODUIT = row1.ID_GROUPE_PRODUIT ;
out1_tmp.ID_ARTICLE_INR = row1.ID_ARTICLE_INR ;
out1_tmp.ID_ARTICLE_INV = row1.ID_ARTICLE_INV ;
out1_tmp.ID_ARTICLE = row1.ID_ARTICLE ;
out1_tmp.ID_ARTICLE_CEXUV = row1.ID_ARTICLE_CEXUV ;
out1_tmp.EAN13 = row1.EAN13 ;
out1_tmp.ARTICLE_COURT = row1.ARTICLE_COURT ;
out1_tmp.ARTICLE_LONG = row1.ARTICLE_LONG ;
out1_tmp.ID_ETAT = row1.ID_ETAT ;
out1_tmp.ETAT_COURT = row1.ETAT_COURT ;
out1_tmp.ETAT_LONG = row1.ETAT_LONG ;
out1_tmp.DT_CREATION = row1.DT_CREATION ;
out1_tmp.SAISONNALITE = row1.SAISONNALITE ;
out1_tmp.ARTICLE_PROVENANCE = row1.ARTICLE_PROVENANCE==null?"ND":row1.ARTICLE_PROVENANCE ;
out1_tmp.ARTICLE_DETENTION = row1.ARTICLE_DETENTION==null?"ND":row1.ARTICLE_DETENTION ;
out1_tmp.ARTICLE_TYPE = row1.ARTICLE_TYPE ==null?"ND":row1.ARTICLE_TYPE ;
out1_tmp.ARTICLE_QRTL = row1.ARTICLE_QRTL==null?"ND":row1.ARTICLE_QRTL ;
out1_tmp.ARTICLE_MARQ = row1.ARTICLE_MARQ==null?"ND":row1.ARTICLE_MARQ ;
out1_tmp.CONTENANCE = row1.CONTENANCE==null?
new BigDecimal(Integer.toString(-1)):row1.CONTENANCE ;
out1_tmp.PA = row1.PA ;
out1_tmp.PV = row1.PV ;
out1_tmp.DEBUT_STOCK = row1.DEBUT_STOCK ;
out1_tmp.FIN_STOCK = row1.FIN_STOCK ;
out1_tmp.RUPT_LONG_DUREE = row1.RUPT_LONG_DUREE ;
out1_tmp.ID_FOURNISSEUR = row1.ID_FOURNISSEUR ;
out1_tmp.ID_ARTICLE_CEXR = row1.ID_ARTICLE_CEXR ;
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
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out1","tMap_1","tMap_1","tMap","tDBOutput_1","STRUCTURE_MARCHANDISE_TMP","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out1 - " + (out1==null? "": out1.toLogString()));
    			}
    		



        whetherReject_tDBOutput_1 = false;
                        pstmt_tDBOutput_1.setBigDecimal(1, out1.ID_DEPARTEMENT_INT);

                        pstmt_tDBOutput_1.setBigDecimal(2, out1.ID_RAYON_INT);

                        pstmt_tDBOutput_1.setBigDecimal(3, out1.ID_FAMILLE_INT);

                        pstmt_tDBOutput_1.setBigDecimal(4, out1.ID_SFAMILLE_INT);

                        pstmt_tDBOutput_1.setBigDecimal(5, out1.ID_SSFAMILLE_INT);

                        pstmt_tDBOutput_1.setBigDecimal(6, out1.ID_UNITE_BESOIN_INT);

                        if(out1.ID_GROUPE_PRODUIT == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(7, out1.ID_GROUPE_PRODUIT);
}

                        pstmt_tDBOutput_1.setBigDecimal(8, out1.ID_ARTICLE_INR);

                        pstmt_tDBOutput_1.setBigDecimal(9, out1.ID_ARTICLE_INV);

                        if(out1.ID_ARTICLE == null) {
pstmt_tDBOutput_1.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(10, out1.ID_ARTICLE);
}

                        pstmt_tDBOutput_1.setBigDecimal(11, out1.ID_ARTICLE_CEXUV);

                        if(out1.EAN13 == null) {
pstmt_tDBOutput_1.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(12, out1.EAN13);
}

                        if(out1.ARTICLE_COURT == null) {
pstmt_tDBOutput_1.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(13, out1.ARTICLE_COURT);
}

                        if(out1.ARTICLE_LONG == null) {
pstmt_tDBOutput_1.setNull(14, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(14, out1.ARTICLE_LONG);
}

                        pstmt_tDBOutput_1.setBigDecimal(15, out1.ID_ETAT);

                        if(out1.ETAT_COURT == null) {
pstmt_tDBOutput_1.setNull(16, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(16, out1.ETAT_COURT);
}

                        if(out1.ETAT_LONG == null) {
pstmt_tDBOutput_1.setNull(17, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(17, out1.ETAT_LONG);
}

                        if(out1.DT_CREATION != null) {
pstmt_tDBOutput_1.setObject(18, new java.sql.Timestamp(out1.DT_CREATION.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_1.setNull(18, java.sql.Types.DATE);
}

                        if(out1.SAISONNALITE == null) {
pstmt_tDBOutput_1.setNull(19, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(19, out1.SAISONNALITE);
}

                        if(out1.ARTICLE_PROVENANCE == null) {
pstmt_tDBOutput_1.setNull(20, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(20, out1.ARTICLE_PROVENANCE);
}

                        if(out1.ARTICLE_DETENTION == null) {
pstmt_tDBOutput_1.setNull(21, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(21, out1.ARTICLE_DETENTION);
}

                        if(out1.ARTICLE_TYPE == null) {
pstmt_tDBOutput_1.setNull(22, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(22, out1.ARTICLE_TYPE);
}

                        if(out1.ARTICLE_QRTL == null) {
pstmt_tDBOutput_1.setNull(23, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(23, out1.ARTICLE_QRTL);
}

                        if(out1.ARTICLE_MARQ == null) {
pstmt_tDBOutput_1.setNull(24, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(24, out1.ARTICLE_MARQ);
}

                        pstmt_tDBOutput_1.setBigDecimal(25, out1.CONTENANCE);

                        pstmt_tDBOutput_1.setBigDecimal(26, out1.PA);

                        pstmt_tDBOutput_1.setBigDecimal(27, out1.PV);

                        pstmt_tDBOutput_1.setBigDecimal(28, out1.DEBUT_STOCK);

                        pstmt_tDBOutput_1.setBigDecimal(29, out1.FIN_STOCK);

                        pstmt_tDBOutput_1.setBigDecimal(30, out1.RUPT_LONG_DUREE);

                        if(out1.ID_FOURNISSEUR == null) {
pstmt_tDBOutput_1.setNull(31, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(31, out1.ID_FOURNISSEUR);
}

                        if(out1.ID_ARTICLE_CEXR == null) {
pstmt_tDBOutput_1.setNull(32, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(32, out1.ID_ARTICLE_CEXR);
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
            if(!whetherReject_tDBOutput_1) {
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



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out1",2,0,
			 			"tMap_1","tMap_1","tMap","tDBOutput_1","STRUCTURE_MARCHANDISE_TMP","tOracleOutput","output")) {
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

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tDBRow_1Process(globalMap); 
						



	
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
	

public void tDie_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_2_SUBPROCESS_STATE", 0);

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
	 * [tDie_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_2", false);
		start_Hash.put("tDie_2", System.currentTimeMillis());
		
	
	currentComponent="tDie_2";

	
		int tos_count_tDie_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_2 = new StringBuilder();
                    log4jParamters_tDie_2.append("Parameters:");
                            log4jParamters_tDie_2.append("MESSAGE" + " = " + "\"Probleme de connexion a la base BI\"");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("CODE" + " = " + "4");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_tDie_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + (log4jParamters_tDie_2) );
                    } 
                } 
            new BytesLimit65535_tDie_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_2", "tDie_2", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_2 begin ] stop
 */
	
	/**
	 * [tDie_2 main ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

	try {
	globalMap.put("tDie_2_DIE_PRIORITY", 5);
	System.err.println("Probleme de connexion a la base BI");
	
		log.error("tDie_2 - The die message: "+"Probleme de connexion a la base BI");
	
	globalMap.put("tDie_2_DIE_MESSAGE", "Probleme de connexion a la base BI");
	globalMap.put("tDie_2_DIE_MESSAGES", "Probleme de connexion a la base BI");
	
	} catch (Exception | Error e_tDie_2) {
	    globalMap.put("tDie_2_ERROR_MESSAGE",e_tDie_2.getMessage());
		logIgnoredError(String.format("tDie_2 - tDie failed to log message due to internal error: %s", e_tDie_2), e_tDie_2);
	}
	
	currentComponent = "tDie_2";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_2_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_2++;

/**
 * [tDie_2 main ] stop
 */
	
	/**
	 * [tDie_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 



/**
 * [tDie_2 process_data_begin ] stop
 */
	
	/**
	 * [tDie_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 



/**
 * [tDie_2 process_data_end ] stop
 */
	
	/**
	 * [tDie_2 end ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + ("Done.") );

ok_Hash.put("tDie_2", true);
end_Hash.put("tDie_2", System.currentTimeMillis());




/**
 * [tDie_2 end ] stop
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
	 * [tDie_2 finally ] start
	 */

	

	
	
	currentComponent="tDie_2";

	

 



/**
 * [tDie_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_2_SUBPROCESS_STATE", 1);
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
                            log4jParamters_tDBRow_1.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:UqaJqi8pdv98X3XsN4HlgaJuo5oR1Fd3zN+oDkiWZ0lDQGf8").substring(0, 4) + "...");     
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("QUERY" + " = " + "\"UPDATE ODS_STRUCTURE_MARCHANDISE_TMP  SET ID_DEPARTEMENT_INT = -1  WHERE ID_DEPARTEMENT_INT = ID_ARTICLE_INR \"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("USE_NB_LINE" + " = " + "NONE");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("COMMIT_EVERY" + " = " + "10000");
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
				talendJobLog.addCM("tDBRow_1", "Set ID_DEPARTEMENT_INT to -1", "tOracleRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_1 = null;
	String query_tDBRow_1 = "";
	boolean whetherReject_tDBRow_1 = false;
			String driverClass_tDBRow_1 = "oracle.jdbc.OracleDriver";
		    java.lang.Class jdbcclazz_tDBRow_1 = java.lang.Class.forName(driverClass_tDBRow_1);
		
			String url_tDBRow_1 = null;
				url_tDBRow_1 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
	    		log.debug("tDBRow_1 - Driver ClassName: "+driverClass_tDBRow_1+".");
			
					String dbUser_tDBRow_1 = "ods";
	        
            		
            		
            		 
	final String decryptedPassword_tDBRow_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:MUVp3/Ue7dUUgW1nJ4PsXKTVFltPMhsjzvHo+7sRPGw6aGtY");
        		   	
        	        String dbPwd_tDBRow_1 = decryptedPassword_tDBRow_1;
	        
					
	    		log.debug("tDBRow_1 - Connection attempt to '" + url_tDBRow_1 + "' with the username '" + dbUser_tDBRow_1 + "'.");
			
			conn_tDBRow_1 = java.sql.DriverManager.getConnection(url_tDBRow_1,dbUser_tDBRow_1,dbPwd_tDBRow_1);
		
	    		log.debug("tDBRow_1 - Connection to '" + url_tDBRow_1 + "' has succeeded.");
			
        resourceMap.put("conn_tDBRow_1", conn_tDBRow_1);
					if(conn_tDBRow_1.getAutoCommit()) {
						
	    		log.debug("tDBRow_1 - Connection is set auto commit to 'false'.");
			
				conn_tDBRow_1.setAutoCommit(false);
			
					}        
					int commitEvery_tDBRow_1 = 10000;
					int commitCounter_tDBRow_1 = 0;
				
        java.sql.Statement stmt_tDBRow_1 = conn_tDBRow_1.createStatement();
        resourceMap.put("stmt_tDBRow_1", stmt_tDBRow_1);

 



/**
 * [tDBRow_1 begin ] stop
 */
	
	/**
	 * [tDBRow_1 main ] start
	 */

	

	
	
	currentComponent="tDBRow_1";

	

query_tDBRow_1 = "UPDATE ODS_STRUCTURE_MARCHANDISE_TMP\nSET ID_DEPARTEMENT_INT = -1\nWHERE ID_DEPARTEMENT_INT = ID_ARTICLE_INR ";
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
	
		commitCounter_tDBRow_1++;
		if(commitEvery_tDBRow_1 <= commitCounter_tDBRow_1) {
			
	    		log.debug("tDBRow_1 - Connection starting to commit.");
			
			conn_tDBRow_1.commit();
			
	    		log.debug("tDBRow_1 - Connection commit has succeeded.");
			
			commitCounter_tDBRow_1=0;
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
		if(commitEvery_tDBRow_1>commitCounter_tDBRow_1){

			
	    		log.debug("tDBRow_1 - Connection starting to commit.");
			
			conn_tDBRow_1.commit();
			
	    		log.debug("tDBRow_1 - Connection commit has succeeded.");
			
	
			commitCounter_tDBRow_1=0;
	
		}
	    		log.debug("tDBRow_1 - Closing the connection to the database.");
			
			conn_tDBRow_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBRow_1 - Connection to the database closed.");
			
    resourceMap.put("finish_tDBRow_1", true);

 
                if(log.isDebugEnabled())
            log.debug("tDBRow_1 - "  + ("Done.") );

ok_Hash.put("tDBRow_1", true);
end_Hash.put("tDBRow_1", System.currentTimeMillis());




/**
 * [tDBRow_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tDBRow_2Process(globalMap); 
						



	
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
	 * [tDBRow_1 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_1";

	

try {
    if (resourceMap.get("statementClosed_tDBRow_1") == null) {
            java.sql.Statement stmtToClose_tDBRow_1 = null;
            if ((stmtToClose_tDBRow_1 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_1")) != null) {
                stmtToClose_tDBRow_1.close();
            }
    }
} finally {
        if(resourceMap.get("finish_tDBRow_1") == null){
            java.sql.Connection ctn_tDBRow_1 = null;
            if((ctn_tDBRow_1 = (java.sql.Connection)resourceMap.get("conn_tDBRow_1")) != null){
                try {
	    		log.debug("tDBRow_1 - Closing the connection to the database.");
			
                    ctn_tDBRow_1.close();
	    		log.debug("tDBRow_1 - Connection to the database closed.");
			
                } catch (java.sql.SQLException sqlEx_tDBRow_1) {
                    String errorMessage_tDBRow_1 = "failed to close the connection in tDBRow_1 :" + sqlEx_tDBRow_1.getMessage();
				log.error("tDBRow_1 - " + sqlEx_tDBRow_1.getMessage());
			
                    System.err.println(errorMessage_tDBRow_1);
                }
            }
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
	

public void tDBRow_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_2_SUBPROCESS_STATE", 0);

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
                            log4jParamters_tDBRow_2.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:0D3LEUUI0wFcyNLB+O8R8sbdX3hlrQkESCHBEQ/jfBHafcyN").substring(0, 4) + "...");     
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("QUERY" + " = " + "\"UPDATE ODS_STRUCTURE_MARCHANDISE_TMP  SET ID_RAYON_INT = -1  WHERE ID_RAYON_INT = ID_ARTICLE_INR\" ");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("USE_NB_LINE" + " = " + "NONE");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBRow_2.append(" | ");
                            log4jParamters_tDBRow_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleRow");
                        log4jParamters_tDBRow_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBRow_2 - "  + (log4jParamters_tDBRow_2) );
                    } 
                } 
            new BytesLimit65535_tDBRow_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_2", "Set ID_RAYON_INT to -1", "tOracleRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_2 = null;
	String query_tDBRow_2 = "";
	boolean whetherReject_tDBRow_2 = false;
			String driverClass_tDBRow_2 = "oracle.jdbc.OracleDriver";
		    java.lang.Class jdbcclazz_tDBRow_2 = java.lang.Class.forName(driverClass_tDBRow_2);
		
			String url_tDBRow_2 = null;
				url_tDBRow_2 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
	    		log.debug("tDBRow_2 - Driver ClassName: "+driverClass_tDBRow_2+".");
			
					String dbUser_tDBRow_2 = "ods";
	        
            		
            		
            		 
	final String decryptedPassword_tDBRow_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:qY8ZxP9i7hqyGFpKptGYRnrIT+UnB54cf7j6jMtSTkAB6FjB");
        		   	
        	        String dbPwd_tDBRow_2 = decryptedPassword_tDBRow_2;
	        
					
	    		log.debug("tDBRow_2 - Connection attempt to '" + url_tDBRow_2 + "' with the username '" + dbUser_tDBRow_2 + "'.");
			
			conn_tDBRow_2 = java.sql.DriverManager.getConnection(url_tDBRow_2,dbUser_tDBRow_2,dbPwd_tDBRow_2);
		
	    		log.debug("tDBRow_2 - Connection to '" + url_tDBRow_2 + "' has succeeded.");
			
        resourceMap.put("conn_tDBRow_2", conn_tDBRow_2);
					if(conn_tDBRow_2.getAutoCommit()) {
						
	    		log.debug("tDBRow_2 - Connection is set auto commit to 'false'.");
			
				conn_tDBRow_2.setAutoCommit(false);
			
					}        
					int commitEvery_tDBRow_2 = 10000;
					int commitCounter_tDBRow_2 = 0;
				
        java.sql.Statement stmt_tDBRow_2 = conn_tDBRow_2.createStatement();
        resourceMap.put("stmt_tDBRow_2", stmt_tDBRow_2);

 



/**
 * [tDBRow_2 begin ] stop
 */
	
	/**
	 * [tDBRow_2 main ] start
	 */

	

	
	
	currentComponent="tDBRow_2";

	

query_tDBRow_2 = "UPDATE ODS_STRUCTURE_MARCHANDISE_TMP\nSET ID_RAYON_INT = -1\nWHERE ID_RAYON_INT = ID_ARTICLE_INR" ;
whetherReject_tDBRow_2 = false;
	    		log.debug("tDBRow_2 - Executing the query: '" + query_tDBRow_2 + "'.");
			
globalMap.put("tDBRow_2_QUERY",query_tDBRow_2);
try {
		stmt_tDBRow_2.execute(query_tDBRow_2);
		
	    		log.info("tDBRow_2 - Execute the query: '" + query_tDBRow_2 + "' has finished.");
			
	} catch (java.lang.Exception e) {
globalMap.put("tDBRow_2_ERROR_MESSAGE",e.getMessage());
		whetherReject_tDBRow_2 = true;
		
				log.error("tDBRow_2 - " + e.getMessage());
			
				System.err.print(e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_2) {
		
	}
	
		commitCounter_tDBRow_2++;
		if(commitEvery_tDBRow_2 <= commitCounter_tDBRow_2) {
			
	    		log.debug("tDBRow_2 - Connection starting to commit.");
			
			conn_tDBRow_2.commit();
			
	    		log.debug("tDBRow_2 - Connection commit has succeeded.");
			
			commitCounter_tDBRow_2=0;
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
		if(commitEvery_tDBRow_2>commitCounter_tDBRow_2){

			
	    		log.debug("tDBRow_2 - Connection starting to commit.");
			
			conn_tDBRow_2.commit();
			
	    		log.debug("tDBRow_2 - Connection commit has succeeded.");
			
	
			commitCounter_tDBRow_2=0;
	
		}
	    		log.debug("tDBRow_2 - Closing the connection to the database.");
			
			conn_tDBRow_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBRow_2 - Connection to the database closed.");
			
    resourceMap.put("finish_tDBRow_2", true);

 
                if(log.isDebugEnabled())
            log.debug("tDBRow_2 - "  + ("Done.") );

ok_Hash.put("tDBRow_2", true);
end_Hash.put("tDBRow_2", System.currentTimeMillis());




/**
 * [tDBRow_2 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tDBRow_3Process(globalMap); 
						



	
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
	 * [tDBRow_2 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_2";

	

try {
    if (resourceMap.get("statementClosed_tDBRow_2") == null) {
            java.sql.Statement stmtToClose_tDBRow_2 = null;
            if ((stmtToClose_tDBRow_2 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_2")) != null) {
                stmtToClose_tDBRow_2.close();
            }
    }
} finally {
        if(resourceMap.get("finish_tDBRow_2") == null){
            java.sql.Connection ctn_tDBRow_2 = null;
            if((ctn_tDBRow_2 = (java.sql.Connection)resourceMap.get("conn_tDBRow_2")) != null){
                try {
	    		log.debug("tDBRow_2 - Closing the connection to the database.");
			
                    ctn_tDBRow_2.close();
	    		log.debug("tDBRow_2 - Connection to the database closed.");
			
                } catch (java.sql.SQLException sqlEx_tDBRow_2) {
                    String errorMessage_tDBRow_2 = "failed to close the connection in tDBRow_2 :" + sqlEx_tDBRow_2.getMessage();
				log.error("tDBRow_2 - " + sqlEx_tDBRow_2.getMessage());
			
                    System.err.println(errorMessage_tDBRow_2);
                }
            }
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
	

public void tDBRow_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_3_SUBPROCESS_STATE", 0);

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
	 * [tDBRow_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_3", false);
		start_Hash.put("tDBRow_3", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_3";

	
		int tos_count_tDBRow_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBRow_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBRow_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBRow_3 = new StringBuilder();
                    log4jParamters_tDBRow_3.append("Parameters:");
                            log4jParamters_tDBRow_3.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:W0UB2WV8ZMEYvX/ky0EXGGwXiNmQ8ZTIWtAVlpF1I51LXvd2").substring(0, 4) + "...");     
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("QUERY" + " = " + "\"UPDATE ODS_STRUCTURE_MARCHANDISE  SET ID_FAMILLE_INT = -1  WHERE ID_FAMILLE_INT = ID_ARTICLE_INR  \"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("USE_NB_LINE" + " = " + "NONE");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBRow_3.append(" | ");
                            log4jParamters_tDBRow_3.append("UNIFIED_COMPONENTS" + " = " + "tOracleRow");
                        log4jParamters_tDBRow_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBRow_3 - "  + (log4jParamters_tDBRow_3) );
                    } 
                } 
            new BytesLimit65535_tDBRow_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_3", "Set ID_FAMILLE_INT to -1", "tOracleRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_3 = null;
	String query_tDBRow_3 = "";
	boolean whetherReject_tDBRow_3 = false;
			String driverClass_tDBRow_3 = "oracle.jdbc.OracleDriver";
		    java.lang.Class jdbcclazz_tDBRow_3 = java.lang.Class.forName(driverClass_tDBRow_3);
		
			String url_tDBRow_3 = null;
				url_tDBRow_3 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
	    		log.debug("tDBRow_3 - Driver ClassName: "+driverClass_tDBRow_3+".");
			
					String dbUser_tDBRow_3 = "ods";
	        
            		
            		
            		 
	final String decryptedPassword_tDBRow_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:8RuviugO1+95xpv4g0RTFxQ+ZHKttmoMiffYX+KOzmOfS3OO");
        		   	
        	        String dbPwd_tDBRow_3 = decryptedPassword_tDBRow_3;
	        
					
	    		log.debug("tDBRow_3 - Connection attempt to '" + url_tDBRow_3 + "' with the username '" + dbUser_tDBRow_3 + "'.");
			
			conn_tDBRow_3 = java.sql.DriverManager.getConnection(url_tDBRow_3,dbUser_tDBRow_3,dbPwd_tDBRow_3);
		
	    		log.debug("tDBRow_3 - Connection to '" + url_tDBRow_3 + "' has succeeded.");
			
        resourceMap.put("conn_tDBRow_3", conn_tDBRow_3);
					if(conn_tDBRow_3.getAutoCommit()) {
						
	    		log.debug("tDBRow_3 - Connection is set auto commit to 'false'.");
			
				conn_tDBRow_3.setAutoCommit(false);
			
					}        
					int commitEvery_tDBRow_3 = 10000;
					int commitCounter_tDBRow_3 = 0;
				
        java.sql.Statement stmt_tDBRow_3 = conn_tDBRow_3.createStatement();
        resourceMap.put("stmt_tDBRow_3", stmt_tDBRow_3);

 



/**
 * [tDBRow_3 begin ] stop
 */
	
	/**
	 * [tDBRow_3 main ] start
	 */

	

	
	
	currentComponent="tDBRow_3";

	

query_tDBRow_3 = "UPDATE ODS_STRUCTURE_MARCHANDISE\nSET ID_FAMILLE_INT = -1\nWHERE ID_FAMILLE_INT = ID_ARTICLE_INR  ";
whetherReject_tDBRow_3 = false;
	    		log.debug("tDBRow_3 - Executing the query: '" + query_tDBRow_3 + "'.");
			
globalMap.put("tDBRow_3_QUERY",query_tDBRow_3);
try {
		stmt_tDBRow_3.execute(query_tDBRow_3);
		
	    		log.info("tDBRow_3 - Execute the query: '" + query_tDBRow_3 + "' has finished.");
			
	} catch (java.lang.Exception e) {
globalMap.put("tDBRow_3_ERROR_MESSAGE",e.getMessage());
		whetherReject_tDBRow_3 = true;
		
				log.error("tDBRow_3 - " + e.getMessage());
			
				System.err.print(e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_3) {
		
	}
	
		commitCounter_tDBRow_3++;
		if(commitEvery_tDBRow_3 <= commitCounter_tDBRow_3) {
			
	    		log.debug("tDBRow_3 - Connection starting to commit.");
			
			conn_tDBRow_3.commit();
			
	    		log.debug("tDBRow_3 - Connection commit has succeeded.");
			
			commitCounter_tDBRow_3=0;
		}
		

 


	tos_count_tDBRow_3++;

/**
 * [tDBRow_3 main ] stop
 */
	
	/**
	 * [tDBRow_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_3";

	

 



/**
 * [tDBRow_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_3";

	

 



/**
 * [tDBRow_3 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_3 end ] start
	 */

	

	
	
	currentComponent="tDBRow_3";

	

	
        stmt_tDBRow_3.close();
        resourceMap.remove("stmt_tDBRow_3");
    resourceMap.put("statementClosed_tDBRow_3", true);
		if(commitEvery_tDBRow_3>commitCounter_tDBRow_3){

			
	    		log.debug("tDBRow_3 - Connection starting to commit.");
			
			conn_tDBRow_3.commit();
			
	    		log.debug("tDBRow_3 - Connection commit has succeeded.");
			
	
			commitCounter_tDBRow_3=0;
	
		}
	    		log.debug("tDBRow_3 - Closing the connection to the database.");
			
			conn_tDBRow_3.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBRow_3 - Connection to the database closed.");
			
    resourceMap.put("finish_tDBRow_3", true);

 
                if(log.isDebugEnabled())
            log.debug("tDBRow_3 - "  + ("Done.") );

ok_Hash.put("tDBRow_3", true);
end_Hash.put("tDBRow_3", System.currentTimeMillis());




/**
 * [tDBRow_3 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_3:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tDBRow_6Process(globalMap); 
						



	
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
	 * [tDBRow_3 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_3";

	

try {
    if (resourceMap.get("statementClosed_tDBRow_3") == null) {
            java.sql.Statement stmtToClose_tDBRow_3 = null;
            if ((stmtToClose_tDBRow_3 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_3")) != null) {
                stmtToClose_tDBRow_3.close();
            }
    }
} finally {
        if(resourceMap.get("finish_tDBRow_3") == null){
            java.sql.Connection ctn_tDBRow_3 = null;
            if((ctn_tDBRow_3 = (java.sql.Connection)resourceMap.get("conn_tDBRow_3")) != null){
                try {
	    		log.debug("tDBRow_3 - Closing the connection to the database.");
			
                    ctn_tDBRow_3.close();
	    		log.debug("tDBRow_3 - Connection to the database closed.");
			
                } catch (java.sql.SQLException sqlEx_tDBRow_3) {
                    String errorMessage_tDBRow_3 = "failed to close the connection in tDBRow_3 :" + sqlEx_tDBRow_3.getMessage();
				log.error("tDBRow_3 - " + sqlEx_tDBRow_3.getMessage());
			
                    System.err.println(errorMessage_tDBRow_3);
                }
            }
        }
    }
 



/**
 * [tDBRow_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_3_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_6_SUBPROCESS_STATE", 0);

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
	 * [tDBRow_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_6", false);
		start_Hash.put("tDBRow_6", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_6";

	
		int tos_count_tDBRow_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBRow_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBRow_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBRow_6 = new StringBuilder();
                    log4jParamters_tDBRow_6.append("Parameters:");
                            log4jParamters_tDBRow_6.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:zGHsOO1MeBJk/aeT3yWO2r+Gagm1D+XqxVNKPE6i7AhwrRXs").substring(0, 4) + "...");     
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("QUERY" + " = " + "\"UPDATE ODS_STRUCTURE_MARCHANDISE_TMP  SET ID_UNITE_BESOIN_INT = -1  WHERE ID_UNITE_BESOIN_INT = ID_ARTICLE_INR  \"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("USE_NB_LINE" + " = " + "NONE");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBRow_6.append(" | ");
                            log4jParamters_tDBRow_6.append("UNIFIED_COMPONENTS" + " = " + "tOracleRow");
                        log4jParamters_tDBRow_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBRow_6 - "  + (log4jParamters_tDBRow_6) );
                    } 
                } 
            new BytesLimit65535_tDBRow_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_6", "Set ID_UNITE_BESOIN_INT to -1", "tOracleRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_6 = null;
	String query_tDBRow_6 = "";
	boolean whetherReject_tDBRow_6 = false;
			String driverClass_tDBRow_6 = "oracle.jdbc.OracleDriver";
		    java.lang.Class jdbcclazz_tDBRow_6 = java.lang.Class.forName(driverClass_tDBRow_6);
		
			String url_tDBRow_6 = null;
				url_tDBRow_6 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
	    		log.debug("tDBRow_6 - Driver ClassName: "+driverClass_tDBRow_6+".");
			
					String dbUser_tDBRow_6 = "ods";
	        
            		
            		
            		 
	final String decryptedPassword_tDBRow_6 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:UBVopAjVUKHwAnsaxzHUBQzuijYaHJAaDSF9R3aHtHqpKLd5");
        		   	
        	        String dbPwd_tDBRow_6 = decryptedPassword_tDBRow_6;
	        
					
	    		log.debug("tDBRow_6 - Connection attempt to '" + url_tDBRow_6 + "' with the username '" + dbUser_tDBRow_6 + "'.");
			
			conn_tDBRow_6 = java.sql.DriverManager.getConnection(url_tDBRow_6,dbUser_tDBRow_6,dbPwd_tDBRow_6);
		
	    		log.debug("tDBRow_6 - Connection to '" + url_tDBRow_6 + "' has succeeded.");
			
        resourceMap.put("conn_tDBRow_6", conn_tDBRow_6);
					if(conn_tDBRow_6.getAutoCommit()) {
						
	    		log.debug("tDBRow_6 - Connection is set auto commit to 'false'.");
			
				conn_tDBRow_6.setAutoCommit(false);
			
					}        
					int commitEvery_tDBRow_6 = 10000;
					int commitCounter_tDBRow_6 = 0;
				
        java.sql.Statement stmt_tDBRow_6 = conn_tDBRow_6.createStatement();
        resourceMap.put("stmt_tDBRow_6", stmt_tDBRow_6);

 



/**
 * [tDBRow_6 begin ] stop
 */
	
	/**
	 * [tDBRow_6 main ] start
	 */

	

	
	
	currentComponent="tDBRow_6";

	

query_tDBRow_6 = "UPDATE ODS_STRUCTURE_MARCHANDISE_TMP\nSET ID_UNITE_BESOIN_INT = -1\nWHERE ID_UNITE_BESOIN_INT = ID_ARTICLE_INR  ";
whetherReject_tDBRow_6 = false;
	    		log.debug("tDBRow_6 - Executing the query: '" + query_tDBRow_6 + "'.");
			
globalMap.put("tDBRow_6_QUERY",query_tDBRow_6);
try {
		stmt_tDBRow_6.execute(query_tDBRow_6);
		
	    		log.info("tDBRow_6 - Execute the query: '" + query_tDBRow_6 + "' has finished.");
			
	} catch (java.lang.Exception e) {
globalMap.put("tDBRow_6_ERROR_MESSAGE",e.getMessage());
		whetherReject_tDBRow_6 = true;
		
				log.error("tDBRow_6 - " + e.getMessage());
			
				System.err.print(e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_6) {
		
	}
	
		commitCounter_tDBRow_6++;
		if(commitEvery_tDBRow_6 <= commitCounter_tDBRow_6) {
			
	    		log.debug("tDBRow_6 - Connection starting to commit.");
			
			conn_tDBRow_6.commit();
			
	    		log.debug("tDBRow_6 - Connection commit has succeeded.");
			
			commitCounter_tDBRow_6=0;
		}
		

 


	tos_count_tDBRow_6++;

/**
 * [tDBRow_6 main ] stop
 */
	
	/**
	 * [tDBRow_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_6";

	

 



/**
 * [tDBRow_6 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_6";

	

 



/**
 * [tDBRow_6 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_6 end ] start
	 */

	

	
	
	currentComponent="tDBRow_6";

	

	
        stmt_tDBRow_6.close();
        resourceMap.remove("stmt_tDBRow_6");
    resourceMap.put("statementClosed_tDBRow_6", true);
		if(commitEvery_tDBRow_6>commitCounter_tDBRow_6){

			
	    		log.debug("tDBRow_6 - Connection starting to commit.");
			
			conn_tDBRow_6.commit();
			
	    		log.debug("tDBRow_6 - Connection commit has succeeded.");
			
	
			commitCounter_tDBRow_6=0;
	
		}
	    		log.debug("tDBRow_6 - Closing the connection to the database.");
			
			conn_tDBRow_6.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBRow_6 - Connection to the database closed.");
			
    resourceMap.put("finish_tDBRow_6", true);

 
                if(log.isDebugEnabled())
            log.debug("tDBRow_6 - "  + ("Done.") );

ok_Hash.put("tDBRow_6", true);
end_Hash.put("tDBRow_6", System.currentTimeMillis());




/**
 * [tDBRow_6 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_6:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk7", 0, "ok");
								} 
							
							tDBRow_5Process(globalMap); 
						



	
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
	 * [tDBRow_6 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_6";

	

try {
    if (resourceMap.get("statementClosed_tDBRow_6") == null) {
            java.sql.Statement stmtToClose_tDBRow_6 = null;
            if ((stmtToClose_tDBRow_6 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_6")) != null) {
                stmtToClose_tDBRow_6.close();
            }
    }
} finally {
        if(resourceMap.get("finish_tDBRow_6") == null){
            java.sql.Connection ctn_tDBRow_6 = null;
            if((ctn_tDBRow_6 = (java.sql.Connection)resourceMap.get("conn_tDBRow_6")) != null){
                try {
	    		log.debug("tDBRow_6 - Closing the connection to the database.");
			
                    ctn_tDBRow_6.close();
	    		log.debug("tDBRow_6 - Connection to the database closed.");
			
                } catch (java.sql.SQLException sqlEx_tDBRow_6) {
                    String errorMessage_tDBRow_6 = "failed to close the connection in tDBRow_6 :" + sqlEx_tDBRow_6.getMessage();
				log.error("tDBRow_6 - " + sqlEx_tDBRow_6.getMessage());
			
                    System.err.println(errorMessage_tDBRow_6);
                }
            }
        }
    }
 



/**
 * [tDBRow_6 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_6_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_5_SUBPROCESS_STATE", 0);

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
	 * [tDBRow_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_5", false);
		start_Hash.put("tDBRow_5", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_5";

	
		int tos_count_tDBRow_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBRow_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBRow_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBRow_5 = new StringBuilder();
                    log4jParamters_tDBRow_5.append("Parameters:");
                            log4jParamters_tDBRow_5.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:d+hddddTzhzmOJcbPtrzrkt9ppU9ml6VA9UX+daB3qLfDSRn").substring(0, 4) + "...");     
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("QUERY" + " = " + "\"UPDATE ODS_STRUCTURE_MARCHANDISE_TMP  SET ID_SSFAMILLE_INT = -1  WHERE ID_SSFAMILLE_INT = ID_ARTICLE_INR \"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("USE_NB_LINE" + " = " + "NONE");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBRow_5.append(" | ");
                            log4jParamters_tDBRow_5.append("UNIFIED_COMPONENTS" + " = " + "tOracleRow");
                        log4jParamters_tDBRow_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBRow_5 - "  + (log4jParamters_tDBRow_5) );
                    } 
                } 
            new BytesLimit65535_tDBRow_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_5", "Set ID_SSFAMILLE_INT to -1", "tOracleRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_5 = null;
	String query_tDBRow_5 = "";
	boolean whetherReject_tDBRow_5 = false;
			String driverClass_tDBRow_5 = "oracle.jdbc.OracleDriver";
		    java.lang.Class jdbcclazz_tDBRow_5 = java.lang.Class.forName(driverClass_tDBRow_5);
		
			String url_tDBRow_5 = null;
				url_tDBRow_5 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
	    		log.debug("tDBRow_5 - Driver ClassName: "+driverClass_tDBRow_5+".");
			
					String dbUser_tDBRow_5 = "ods";
	        
            		
            		
            		 
	final String decryptedPassword_tDBRow_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Jx364g+laEyL79CV5KCrTqtfDJhgpZwdf2yoREK+40HC4GeZ");
        		   	
        	        String dbPwd_tDBRow_5 = decryptedPassword_tDBRow_5;
	        
					
	    		log.debug("tDBRow_5 - Connection attempt to '" + url_tDBRow_5 + "' with the username '" + dbUser_tDBRow_5 + "'.");
			
			conn_tDBRow_5 = java.sql.DriverManager.getConnection(url_tDBRow_5,dbUser_tDBRow_5,dbPwd_tDBRow_5);
		
	    		log.debug("tDBRow_5 - Connection to '" + url_tDBRow_5 + "' has succeeded.");
			
        resourceMap.put("conn_tDBRow_5", conn_tDBRow_5);
					if(conn_tDBRow_5.getAutoCommit()) {
						
	    		log.debug("tDBRow_5 - Connection is set auto commit to 'false'.");
			
				conn_tDBRow_5.setAutoCommit(false);
			
					}        
					int commitEvery_tDBRow_5 = 10000;
					int commitCounter_tDBRow_5 = 0;
				
        java.sql.Statement stmt_tDBRow_5 = conn_tDBRow_5.createStatement();
        resourceMap.put("stmt_tDBRow_5", stmt_tDBRow_5);

 



/**
 * [tDBRow_5 begin ] stop
 */
	
	/**
	 * [tDBRow_5 main ] start
	 */

	

	
	
	currentComponent="tDBRow_5";

	

query_tDBRow_5 = "UPDATE ODS_STRUCTURE_MARCHANDISE_TMP\nSET ID_SSFAMILLE_INT = -1\nWHERE ID_SSFAMILLE_INT = ID_ARTICLE_INR ";
whetherReject_tDBRow_5 = false;
	    		log.debug("tDBRow_5 - Executing the query: '" + query_tDBRow_5 + "'.");
			
globalMap.put("tDBRow_5_QUERY",query_tDBRow_5);
try {
		stmt_tDBRow_5.execute(query_tDBRow_5);
		
	    		log.info("tDBRow_5 - Execute the query: '" + query_tDBRow_5 + "' has finished.");
			
	} catch (java.lang.Exception e) {
globalMap.put("tDBRow_5_ERROR_MESSAGE",e.getMessage());
		whetherReject_tDBRow_5 = true;
		
				log.error("tDBRow_5 - " + e.getMessage());
			
				System.err.print(e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_5) {
		
	}
	
		commitCounter_tDBRow_5++;
		if(commitEvery_tDBRow_5 <= commitCounter_tDBRow_5) {
			
	    		log.debug("tDBRow_5 - Connection starting to commit.");
			
			conn_tDBRow_5.commit();
			
	    		log.debug("tDBRow_5 - Connection commit has succeeded.");
			
			commitCounter_tDBRow_5=0;
		}
		

 


	tos_count_tDBRow_5++;

/**
 * [tDBRow_5 main ] stop
 */
	
	/**
	 * [tDBRow_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_5";

	

 



/**
 * [tDBRow_5 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_5";

	

 



/**
 * [tDBRow_5 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_5 end ] start
	 */

	

	
	
	currentComponent="tDBRow_5";

	

	
        stmt_tDBRow_5.close();
        resourceMap.remove("stmt_tDBRow_5");
    resourceMap.put("statementClosed_tDBRow_5", true);
		if(commitEvery_tDBRow_5>commitCounter_tDBRow_5){

			
	    		log.debug("tDBRow_5 - Connection starting to commit.");
			
			conn_tDBRow_5.commit();
			
	    		log.debug("tDBRow_5 - Connection commit has succeeded.");
			
	
			commitCounter_tDBRow_5=0;
	
		}
	    		log.debug("tDBRow_5 - Closing the connection to the database.");
			
			conn_tDBRow_5.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBRow_5 - Connection to the database closed.");
			
    resourceMap.put("finish_tDBRow_5", true);

 
                if(log.isDebugEnabled())
            log.debug("tDBRow_5 - "  + ("Done.") );

ok_Hash.put("tDBRow_5", true);
end_Hash.put("tDBRow_5", System.currentTimeMillis());




/**
 * [tDBRow_5 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_5:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk6", 0, "ok");
								} 
							
							tDBRow_4Process(globalMap); 
						



	
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
	 * [tDBRow_5 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_5";

	

try {
    if (resourceMap.get("statementClosed_tDBRow_5") == null) {
            java.sql.Statement stmtToClose_tDBRow_5 = null;
            if ((stmtToClose_tDBRow_5 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_5")) != null) {
                stmtToClose_tDBRow_5.close();
            }
    }
} finally {
        if(resourceMap.get("finish_tDBRow_5") == null){
            java.sql.Connection ctn_tDBRow_5 = null;
            if((ctn_tDBRow_5 = (java.sql.Connection)resourceMap.get("conn_tDBRow_5")) != null){
                try {
	    		log.debug("tDBRow_5 - Closing the connection to the database.");
			
                    ctn_tDBRow_5.close();
	    		log.debug("tDBRow_5 - Connection to the database closed.");
			
                } catch (java.sql.SQLException sqlEx_tDBRow_5) {
                    String errorMessage_tDBRow_5 = "failed to close the connection in tDBRow_5 :" + sqlEx_tDBRow_5.getMessage();
				log.error("tDBRow_5 - " + sqlEx_tDBRow_5.getMessage());
			
                    System.err.println(errorMessage_tDBRow_5);
                }
            }
        }
    }
 



/**
 * [tDBRow_5 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_5_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_4_SUBPROCESS_STATE", 0);

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
	 * [tDBRow_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_4", false);
		start_Hash.put("tDBRow_4", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_4";

	
		int tos_count_tDBRow_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBRow_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBRow_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBRow_4 = new StringBuilder();
                    log4jParamters_tDBRow_4.append("Parameters:");
                            log4jParamters_tDBRow_4.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:ODLR6RM0IpENuaKZlhqxGiGSBF7UH22DLGgPoCX4X90vTuEz").substring(0, 4) + "...");     
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("QUERY" + " = " + "\"UPDATE ODS_STRUCTURE_MARCHANDISE_TMP  SET ID_SFAMILLE_INT = -1  WHERE ID_SFAMILLE_INT = ID_ARTICLE_INR  \"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("USE_NB_LINE" + " = " + "NONE");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("PROPAGATE_RECORD_SET" + " = " + "false");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("USE_PREPAREDSTATEMENT" + " = " + "false");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBRow_4.append(" | ");
                            log4jParamters_tDBRow_4.append("UNIFIED_COMPONENTS" + " = " + "tOracleRow");
                        log4jParamters_tDBRow_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBRow_4 - "  + (log4jParamters_tDBRow_4) );
                    } 
                } 
            new BytesLimit65535_tDBRow_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_4", "Set ID_SFAMILLE_INT to -1", "tOracleRow");
				talendJobLogProcess(globalMap);
			}
			

	java.sql.Connection conn_tDBRow_4 = null;
	String query_tDBRow_4 = "";
	boolean whetherReject_tDBRow_4 = false;
			String driverClass_tDBRow_4 = "oracle.jdbc.OracleDriver";
		    java.lang.Class jdbcclazz_tDBRow_4 = java.lang.Class.forName(driverClass_tDBRow_4);
		
			String url_tDBRow_4 = null;
				url_tDBRow_4 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
	    		log.debug("tDBRow_4 - Driver ClassName: "+driverClass_tDBRow_4+".");
			
					String dbUser_tDBRow_4 = "ods";
	        
            		
            		
            		 
	final String decryptedPassword_tDBRow_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:8OwAUNrVbW8iiKibj7HX1ywfiB9j1mxUbZ0ScNrBIs0IOwei");
        		   	
        	        String dbPwd_tDBRow_4 = decryptedPassword_tDBRow_4;
	        
					
	    		log.debug("tDBRow_4 - Connection attempt to '" + url_tDBRow_4 + "' with the username '" + dbUser_tDBRow_4 + "'.");
			
			conn_tDBRow_4 = java.sql.DriverManager.getConnection(url_tDBRow_4,dbUser_tDBRow_4,dbPwd_tDBRow_4);
		
	    		log.debug("tDBRow_4 - Connection to '" + url_tDBRow_4 + "' has succeeded.");
			
        resourceMap.put("conn_tDBRow_4", conn_tDBRow_4);
					if(conn_tDBRow_4.getAutoCommit()) {
						
	    		log.debug("tDBRow_4 - Connection is set auto commit to 'false'.");
			
				conn_tDBRow_4.setAutoCommit(false);
			
					}        
					int commitEvery_tDBRow_4 = 10000;
					int commitCounter_tDBRow_4 = 0;
				
        java.sql.Statement stmt_tDBRow_4 = conn_tDBRow_4.createStatement();
        resourceMap.put("stmt_tDBRow_4", stmt_tDBRow_4);

 



/**
 * [tDBRow_4 begin ] stop
 */
	
	/**
	 * [tDBRow_4 main ] start
	 */

	

	
	
	currentComponent="tDBRow_4";

	

query_tDBRow_4 = "UPDATE ODS_STRUCTURE_MARCHANDISE_TMP\nSET ID_SFAMILLE_INT = -1\nWHERE ID_SFAMILLE_INT = ID_ARTICLE_INR  ";
whetherReject_tDBRow_4 = false;
	    		log.debug("tDBRow_4 - Executing the query: '" + query_tDBRow_4 + "'.");
			
globalMap.put("tDBRow_4_QUERY",query_tDBRow_4);
try {
		stmt_tDBRow_4.execute(query_tDBRow_4);
		
	    		log.info("tDBRow_4 - Execute the query: '" + query_tDBRow_4 + "' has finished.");
			
	} catch (java.lang.Exception e) {
globalMap.put("tDBRow_4_ERROR_MESSAGE",e.getMessage());
		whetherReject_tDBRow_4 = true;
		
				log.error("tDBRow_4 - " + e.getMessage());
			
				System.err.print(e.getMessage());
				
	}
	
	if(!whetherReject_tDBRow_4) {
		
	}
	
		commitCounter_tDBRow_4++;
		if(commitEvery_tDBRow_4 <= commitCounter_tDBRow_4) {
			
	    		log.debug("tDBRow_4 - Connection starting to commit.");
			
			conn_tDBRow_4.commit();
			
	    		log.debug("tDBRow_4 - Connection commit has succeeded.");
			
			commitCounter_tDBRow_4=0;
		}
		

 


	tos_count_tDBRow_4++;

/**
 * [tDBRow_4 main ] stop
 */
	
	/**
	 * [tDBRow_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_4";

	

 



/**
 * [tDBRow_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_4";

	

 



/**
 * [tDBRow_4 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_4 end ] start
	 */

	

	
	
	currentComponent="tDBRow_4";

	

	
        stmt_tDBRow_4.close();
        resourceMap.remove("stmt_tDBRow_4");
    resourceMap.put("statementClosed_tDBRow_4", true);
		if(commitEvery_tDBRow_4>commitCounter_tDBRow_4){

			
	    		log.debug("tDBRow_4 - Connection starting to commit.");
			
			conn_tDBRow_4.commit();
			
	    		log.debug("tDBRow_4 - Connection commit has succeeded.");
			
	
			commitCounter_tDBRow_4=0;
	
		}
	    		log.debug("tDBRow_4 - Closing the connection to the database.");
			
			conn_tDBRow_4.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBRow_4 - Connection to the database closed.");
			
    resourceMap.put("finish_tDBRow_4", true);

 
                if(log.isDebugEnabled())
            log.debug("tDBRow_4 - "  + ("Done.") );

ok_Hash.put("tDBRow_4", true);
end_Hash.put("tDBRow_4", System.currentTimeMillis());




/**
 * [tDBRow_4 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_4:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
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
	 * [tDBRow_4 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_4";

	

try {
    if (resourceMap.get("statementClosed_tDBRow_4") == null) {
            java.sql.Statement stmtToClose_tDBRow_4 = null;
            if ((stmtToClose_tDBRow_4 = (java.sql.Statement) resourceMap.remove("stmt_tDBRow_4")) != null) {
                stmtToClose_tDBRow_4.close();
            }
    }
} finally {
        if(resourceMap.get("finish_tDBRow_4") == null){
            java.sql.Connection ctn_tDBRow_4 = null;
            if((ctn_tDBRow_4 = (java.sql.Connection)resourceMap.get("conn_tDBRow_4")) != null){
                try {
	    		log.debug("tDBRow_4 - Closing the connection to the database.");
			
                    ctn_tDBRow_4.close();
	    		log.debug("tDBRow_4 - Connection to the database closed.");
			
                } catch (java.sql.SQLException sqlEx_tDBRow_4) {
                    String errorMessage_tDBRow_4 = "failed to close the connection in tDBRow_4 :" + sqlEx_tDBRow_4.getMessage();
				log.error("tDBRow_4 - " + sqlEx_tDBRow_4.getMessage());
			
                    System.err.println(errorMessage_tDBRow_4);
                }
            }
        }
    }
 



/**
 * [tDBRow_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_4_SUBPROCESS_STATE", 1);
	}
	


public static class out2Struct implements routines.system.IPersistableRow<out2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN);
            			}
            		
        			sb.append("|");
        		
        				if(UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNITE_BESOIN);
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

public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_SS_FAMILLE_INT;

				public BigDecimal getID_SS_FAMILLE_INT () {
					return this.ID_SS_FAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SS_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SS_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_SS_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SS_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_SS_FAMILLE_INT="+String.valueOf(ID_SS_FAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_SS_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SS_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN);
            			}
            		
        			sb.append("|");
        		
        				if(UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNITE_BESOIN);
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



		row3Struct row3 = new row3Struct();
out2Struct out2 = new out2Struct();





	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out2");
			
		int tos_count_tDBOutput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_2 = new StringBuilder();
                    log4jParamters_tDBOutput_2.append("Parameters:");
                            log4jParamters_tDBOutput_2.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:riiQocytpbFnOkKHGR1zbR1lC6tQ6TsgY0Eh9kUaXY9omdgk").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE" + " = " + "\"ODS_UNITE_BESOIN\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("COMMIT_EVERY" + " = " + "10000");
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
                            log4jParamters_tDBOutput_2.append("USE_BATCH_SIZE" + " = " + "false");
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
				talendJobLog.addCM("tDBOutput_2", "Oracle_ODS_UNITE_BESOIN", "tOracleOutput");
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
                    String driverClass_tDBOutput_2 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_2)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_2);
                String url_tDBOutput_2 = null;
                    url_tDBOutput_2 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_2 = "ods";
 
	final String decryptedPassword_tDBOutput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:5VfDMy9yq6KKWy7txujybSjK7dxJfFN57lC2oaHH4qhWiisV");

                String dbPwd_tDBOutput_2 = decryptedPassword_tDBOutput_2;
                dbschema_tDBOutput_2 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection attempts to '")  + (url_tDBOutput_2)  + ("' with the username '")  + (dbUser_tDBOutput_2)  + ("'.") );

                    conn_tDBOutput_2 = java.sql.DriverManager.getConnection(url_tDBOutput_2, dbUser_tDBOutput_2, dbPwd_tDBOutput_2);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection to '")  + (url_tDBOutput_2)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_2", conn_tDBOutput_2);
            conn_tDBOutput_2.setAutoCommit(false);
            int commitEvery_tDBOutput_2 = 10000;
            int commitCounter_tDBOutput_2 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_2.getAutoCommit())  + ("'.") );
        int count_tDBOutput_2=0;

        if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
            tableName_tDBOutput_2 = ("ODS_UNITE_BESOIN");
        } else {
            tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "." + ("ODS_UNITE_BESOIN");
        }
            int rsTruncCountNumber_tDBOutput_2 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_2 = conn_tDBOutput_2.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_2 = stmtTruncCount_tDBOutput_2.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_2 + "")) {
                    if(rsTruncCount_tDBOutput_2.next()) {
                        rsTruncCountNumber_tDBOutput_2 = rsTruncCount_tDBOutput_2.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_2 = conn_tDBOutput_2.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_2)  + ("'.") );
                stmtTrunc_tDBOutput_2.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_2 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_2)  + ("' has succeeded.") );
                deletedCount_tDBOutput_2 += rsTruncCountNumber_tDBOutput_2;
            }
                String insert_tDBOutput_2 = "INSERT INTO " + tableName_tDBOutput_2 + " (ID_SSFAMILLE_INT,ID_UNITE_BESOIN_INT,ID_UNITE_BESOIN,UNITE_BESOIN) VALUES (?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
                        resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);





 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row3");
			
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
		int count_row3_tMap_2 = 0;
		
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
                            log4jParamters_tDBInput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:+fl0iMXnRx0Fvfahy19eplA2Pdm9ORaLCBxdXEXSuzlPjQ==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"SELECT   objpere AS id_ss_famille_int,           sobcint AS id_unite_besoin_int,           sobcext AS id_unite_besoin,           SUBSTR (pkstrucobj.get_desc (sobcint, 'FR'), 1, 50) AS unite_besoin    FROM   STRUCOBJ, STRUCREL   WHERE   sobcint = STRUCREL.objcint AND sobidniv = 7\"");
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
                            log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SS_FAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_UNITE_BESOIN_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_UNITE_BESOIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UNITE_BESOIN")+"}]");
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
				talendJobLog.addCM("tDBInput_2", "ORACLE_GOLD_unite_besoin", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_2);
				
			String url_tDBInput_2 = null;
				url_tDBInput_2 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_2 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:pnHAOwAQ9lreTg5WD3eTrCdNPHUmY+NdgbFXpWfARL/o7w==");

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

		    String dbquery_tDBInput_2 = "SELECT   objpere AS id_ss_famille_int,\n         sobcint AS id_unite_besoin_int,\n         sobcext AS id_unite_besoin,"
+"\n         SUBSTR (pkstrucobj.get_desc (sobcint, 'FR'), 1, 50) AS unite_besoin\n  FROM   STRUCOBJ, STRUCREL\n WHERE   sob"
+"cint = STRUCREL.objcint AND sobidniv = 7";
		    
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
								row3.ID_SS_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(1) != null) {
						row3.ID_SS_FAMILLE_INT = rs_tDBInput_2.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row3.ID_UNITE_BESOIN_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(2) != null) {
						row3.ID_UNITE_BESOIN_INT = rs_tDBInput_2.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row3.ID_UNITE_BESOIN = null;
							} else {
	                         		
        	row3.ID_UNITE_BESOIN = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row3.UNITE_BESOIN = null;
							} else {
	                         		
        	row3.UNITE_BESOIN = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
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
				
					,"row3","tDBInput_2","ORACLE_GOLD_unite_besoin","tOracleInput","tMap_2","tMap_2","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
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

out2 = null;


// # Output table : 'out2'
count_out2_tMap_2++;

out2_tmp.ID_SSFAMILLE_INT = row3.ID_SS_FAMILLE_INT ;
out2_tmp.ID_UNITE_BESOIN_INT = row3.ID_UNITE_BESOIN_INT ;
out2_tmp.ID_UNITE_BESOIN = row3.ID_UNITE_BESOIN ;
out2_tmp.UNITE_BESOIN = row3.UNITE_BESOIN ;
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
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out2","tMap_2","tMap_2","tMap","tDBOutput_2","Oracle_ODS_UNITE_BESOIN","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out2 - " + (out2==null? "": out2.toLogString()));
    			}
    		



        whetherReject_tDBOutput_2 = false;
                        pstmt_tDBOutput_2.setBigDecimal(1, out2.ID_SSFAMILLE_INT);

                        pstmt_tDBOutput_2.setBigDecimal(2, out2.ID_UNITE_BESOIN_INT);

                        if(out2.ID_UNITE_BESOIN == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(3, out2.ID_UNITE_BESOIN);
}

                        if(out2.UNITE_BESOIN == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(4, out2.UNITE_BESOIN);
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
                commitCounter_tDBOutput_2++;
                if(commitEvery_tDBOutput_2 <= commitCounter_tDBOutput_2) {
                    if(rowsToCommitCount_tDBOutput_2 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_2)  + (" record(s).") );
                    }
                    conn_tDBOutput_2.commit();
                    if(rowsToCommitCount_tDBOutput_2 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_2 = 0;
                    }
                    commitCounter_tDBOutput_2=0;
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

} // End of branch "out2"




	
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
				log.debug("tMap_2 - Written records count in the table 'out2': " + count_out2_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tDBInput_2","ORACLE_GOLD_unite_besoin","tOracleInput","tMap_2","tMap_2","tMap","output")) {
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
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
	



	
        if(pstmt_tDBOutput_2 != null) {
			
				pstmt_tDBOutput_2.close();
				resourceMap.remove("pstmt_tDBOutput_2");
			
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);
		if(commitCounter_tDBOutput_2 > 0 && rowsToCommitCount_tDBOutput_2 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_2)  + (" record(s).") );
		}
		conn_tDBOutput_2.commit();
		if(commitCounter_tDBOutput_2 > 0 && rowsToCommitCount_tDBOutput_2 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_2 = 0;
		}
		commitCounter_tDBOutput_2 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_2 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_2", true);
   	

	
	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_2)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out2",2,0,
			 			"tMap_2","tMap_2","tMap","tDBOutput_2","Oracle_ODS_UNITE_BESOIN","tOracleOutput","output")) {
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

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk8", 0, "ok");
								} 
							
							tDBInput_3Process(globalMap); 
						



	
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
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_2") == null){
            java.sql.Connection ctn_tDBOutput_2 = null;
            if((ctn_tDBOutput_2 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_2")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_2.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_2) {
                    String errorMessage_tDBOutput_2 = "failed to close the connection in tDBOutput_2 :" + sqlEx_tDBOutput_2.getMessage();
            log.error("tDBOutput_2 - "  + (errorMessage_tDBOutput_2) );
                    System.err.println(errorMessage_tDBOutput_2);
                }
            }
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
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class out3Struct implements routines.system.IPersistableRow<out3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public String ID_SSFAMILLE;

				public String getID_SSFAMILLE () {
					return this.ID_SSFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public String ID_SSFAMILLE;

				public String getID_SSFAMILLE () {
					return this.ID_SSFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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



		row5Struct row5 = new row5Struct();
out3Struct out3 = new out3Struct();





	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out3");
			
		int tos_count_tDBOutput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_3 = new StringBuilder();
                    log4jParamters_tDBOutput_3.append("Parameters:");
                            log4jParamters_tDBOutput_3.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:S0VI8QueCfzJ1G5eRMFphLNJ/2OlSy2zhQ+PFWFp98RtCFap").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TABLE" + " = " + "\"ODS_SS_FAMILLE\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_3.append(" | ");
                            log4jParamters_tDBOutput_3.append("COMMIT_EVERY" + " = " + "10000");
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
                            log4jParamters_tDBOutput_3.append("USE_BATCH_SIZE" + " = " + "false");
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
				talendJobLog.addCM("tDBOutput_3", "Oracle_ODS_SS_FAMILLE", "tOracleOutput");
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
                    String driverClass_tDBOutput_3 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_3)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_3);
                String url_tDBOutput_3 = null;
                    url_tDBOutput_3 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_3 = "ods";
 
	final String decryptedPassword_tDBOutput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:nHb1cecqGnaX8Wmubt3UU7541R1AC1zuWzkr1F9I6rAS7Ran");

                String dbPwd_tDBOutput_3 = decryptedPassword_tDBOutput_3;
                dbschema_tDBOutput_3 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection attempts to '")  + (url_tDBOutput_3)  + ("' with the username '")  + (dbUser_tDBOutput_3)  + ("'.") );

                    conn_tDBOutput_3 = java.sql.DriverManager.getConnection(url_tDBOutput_3, dbUser_tDBOutput_3, dbPwd_tDBOutput_3);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection to '")  + (url_tDBOutput_3)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_3", conn_tDBOutput_3);
            conn_tDBOutput_3.setAutoCommit(false);
            int commitEvery_tDBOutput_3 = 10000;
            int commitCounter_tDBOutput_3 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_3.getAutoCommit())  + ("'.") );
        int count_tDBOutput_3=0;

        if(dbschema_tDBOutput_3 == null || dbschema_tDBOutput_3.trim().length() == 0) {
            tableName_tDBOutput_3 = ("ODS_SS_FAMILLE");
        } else {
            tableName_tDBOutput_3 = dbschema_tDBOutput_3 + "." + ("ODS_SS_FAMILLE");
        }
            int rsTruncCountNumber_tDBOutput_3 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_3 = conn_tDBOutput_3.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_3 = stmtTruncCount_tDBOutput_3.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_3 + "")) {
                    if(rsTruncCount_tDBOutput_3.next()) {
                        rsTruncCountNumber_tDBOutput_3 = rsTruncCount_tDBOutput_3.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_3 = conn_tDBOutput_3.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_3)  + ("'.") );
                stmtTrunc_tDBOutput_3.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_3 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_3)  + ("' has succeeded.") );
                deletedCount_tDBOutput_3 += rsTruncCountNumber_tDBOutput_3;
            }
                String insert_tDBOutput_3 = "INSERT INTO " + tableName_tDBOutput_3 + " (ID_SFAMILLE_INT,ID_SSFAMILLE_INT,ID_SSFAMILLE,SSFAMILLE) VALUES (?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(insert_tDBOutput_3);
                        resourceMap.put("pstmt_tDBOutput_3", pstmt_tDBOutput_3);





 



/**
 * [tDBOutput_3 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
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
		int count_row5_tMap_3 = 0;
		
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
                            log4jParamters_tDBInput_3.append("DB_VERSION" + " = " + "ORACLE_18");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("HOST" + " = " + "\"192.168.99.98\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PORT" + " = " + "\"1521\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("DBNAME" + " = " + "\"GOLDV5\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("USER" + " = " + "\"CENPRD\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:glEJyIFMIr9SMviTCi+/i6WiDGDua2rpxQSqy4Lj7bgfCQ==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"SELECT objpere AS ID_SFAMILLE_INT, sobcint AS ID_SSFAMILLE_INT, sobcext AS ID_SSFAMILLE,         SUBSTR (pkstrucobj.get_desc (sobcint, 'FR'), 1, 50) AS SSFAMILLE    FROM STRUCOBJ, STRUCREL   WHERE sobcint = STRUCREL.objcint AND sobidniv = 6\"");
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
                            log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SSFAMILLE")+"}]");
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
				talendJobLog.addCM("tDBInput_3", "ORACLE_GOLD_SQL_SSFAMILLE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_3);
				
			String url_tDBInput_3 = null;
				url_tDBInput_3 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_3 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:on68rzRcJ2xgH5wyg7tRt5Uk/7gJCVvyvrXbtbwuoiZMnQ==");

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

		    String dbquery_tDBInput_3 = "SELECT objpere AS ID_SFAMILLE_INT, sobcint AS ID_SSFAMILLE_INT, sobcext AS ID_SSFAMILLE,\n       SUBSTR (pkstrucobj.get"
+"_desc (sobcint, 'FR'), 1, 50) AS SSFAMILLE\n  FROM STRUCOBJ, STRUCREL\n WHERE sobcint = STRUCREL.objcint AND sobidniv = "
+"6";
		    
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
								row5.ID_SFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(1) != null) {
						row5.ID_SFAMILLE_INT = rs_tDBInput_3.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row5.ID_SSFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(2) != null) {
						row5.ID_SSFAMILLE_INT = rs_tDBInput_3.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row5.ID_SSFAMILLE = null;
							} else {
	                         		
        	row5.ID_SSFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 3, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row5.SSFAMILLE = null;
							} else {
	                         		
        	row5.SSFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 4, false);
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
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tDBInput_3","ORACLE_GOLD_SQL_SSFAMILLE","tOracleInput","tMap_3","tMap_3","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
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

out3_tmp.ID_SFAMILLE_INT = row5.ID_SFAMILLE_INT ;
out3_tmp.ID_SSFAMILLE_INT = row5.ID_SSFAMILLE_INT ;
out3_tmp.ID_SSFAMILLE = row5.ID_SSFAMILLE ;
out3_tmp.SSFAMILLE = row5.SSFAMILLE ;
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
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out3","tMap_3","tMap_3","tMap","tDBOutput_3","Oracle_ODS_SS_FAMILLE","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out3 - " + (out3==null? "": out3.toLogString()));
    			}
    		



        whetherReject_tDBOutput_3 = false;
                        pstmt_tDBOutput_3.setBigDecimal(1, out3.ID_SFAMILLE_INT);

                        pstmt_tDBOutput_3.setBigDecimal(2, out3.ID_SSFAMILLE_INT);

                        if(out3.ID_SSFAMILLE == null) {
pstmt_tDBOutput_3.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(3, out3.ID_SSFAMILLE);
}

                        if(out3.SSFAMILLE == null) {
pstmt_tDBOutput_3.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(4, out3.SSFAMILLE);
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
                commitCounter_tDBOutput_3++;
                if(commitEvery_tDBOutput_3 <= commitCounter_tDBOutput_3) {
                    if(rowsToCommitCount_tDBOutput_3 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_3)  + (" record(s).") );
                    }
                    conn_tDBOutput_3.commit();
                    if(rowsToCommitCount_tDBOutput_3 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_3 = 0;
                    }
                    commitCounter_tDBOutput_3=0;
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

} // End of branch "out3"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
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
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'out3': " + count_out3_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tDBInput_3","ORACLE_GOLD_SQL_SSFAMILLE","tOracleInput","tMap_3","tMap_3","tMap","output")) {
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
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	
	



	
        if(pstmt_tDBOutput_3 != null) {
			
				pstmt_tDBOutput_3.close();
				resourceMap.remove("pstmt_tDBOutput_3");
			
        }
    resourceMap.put("statementClosed_tDBOutput_3", true);
		if(commitCounter_tDBOutput_3 > 0 && rowsToCommitCount_tDBOutput_3 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_3)  + (" record(s).") );
		}
		conn_tDBOutput_3.commit();
		if(commitCounter_tDBOutput_3 > 0 && rowsToCommitCount_tDBOutput_3 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_3 = 0;
		}
		commitCounter_tDBOutput_3 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_3 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_3", true);
   	

	
	nb_line_deleted_tDBOutput_3=nb_line_deleted_tDBOutput_3+ deletedCount_tDBOutput_3;
	nb_line_update_tDBOutput_3=nb_line_update_tDBOutput_3 + updatedCount_tDBOutput_3;
	nb_line_inserted_tDBOutput_3=nb_line_inserted_tDBOutput_3 + insertedCount_tDBOutput_3;
	nb_line_rejected_tDBOutput_3=nb_line_rejected_tDBOutput_3 + rejectedCount_tDBOutput_3;
	
        globalMap.put("tDBOutput_3_NB_LINE",nb_line_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_UPDATED",nb_line_update_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_DELETED",nb_line_deleted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_3);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_3)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out3",2,0,
			 			"tMap_3","tMap_3","tMap","tDBOutput_3","Oracle_ODS_SS_FAMILLE","tOracleOutput","output")) {
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

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_3:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk9", 0, "ok");
								} 
							
							tDBInput_4Process(globalMap); 
						



	
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
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_3") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_3 = null;
                if ((pstmtToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_3")) != null) {
                    pstmtToClose_tDBOutput_3.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_3") == null){
            java.sql.Connection ctn_tDBOutput_3 = null;
            if((ctn_tDBOutput_3 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_3")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_3.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_3 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_3) {
                    String errorMessage_tDBOutput_3 = "failed to close the connection in tDBOutput_3 :" + sqlEx_tDBOutput_3.getMessage();
            log.error("tDBOutput_3 - "  + (errorMessage_tDBOutput_3) );
                    System.err.println(errorMessage_tDBOutput_3);
                }
            }
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
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class out4Struct implements routines.system.IPersistableRow<out4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public String ID_SFAMILLE;

				public String getID_SFAMILLE () {
					return this.ID_SFAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SFAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SFAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
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

public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public String ID_SFAMILLE;

				public String getID_SFAMILLE () {
					return this.ID_SFAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SFAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_SFAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
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



		row7Struct row7 = new row7Struct();
out4Struct out4 = new out4Struct();





	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out4");
			
		int tos_count_tDBOutput_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_4 = new StringBuilder();
                    log4jParamters_tDBOutput_4.append("Parameters:");
                            log4jParamters_tDBOutput_4.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:D5r8ih6kSa6fv2FLR4Xid3K/dnl3JnX/hKEVB/WQ68zXkq17").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TABLE" + " = " + "\"ODS_S_FAMILLE\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_4.append(" | ");
                            log4jParamters_tDBOutput_4.append("COMMIT_EVERY" + " = " + "10000");
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
                            log4jParamters_tDBOutput_4.append("USE_BATCH_SIZE" + " = " + "false");
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
				talendJobLog.addCM("tDBOutput_4", "Oracle_ODS_S_FAMILLE", "tOracleOutput");
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
                    String driverClass_tDBOutput_4 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_4)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_4);
                String url_tDBOutput_4 = null;
                    url_tDBOutput_4 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_4 = "ods";
 
	final String decryptedPassword_tDBOutput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Xz/i1J/p4IH9tuALGfMJ92zsTkh75+K8iwfqe5qY6ZISyxEc");

                String dbPwd_tDBOutput_4 = decryptedPassword_tDBOutput_4;
                dbschema_tDBOutput_4 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection attempts to '")  + (url_tDBOutput_4)  + ("' with the username '")  + (dbUser_tDBOutput_4)  + ("'.") );

                    conn_tDBOutput_4 = java.sql.DriverManager.getConnection(url_tDBOutput_4, dbUser_tDBOutput_4, dbPwd_tDBOutput_4);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection to '")  + (url_tDBOutput_4)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_4", conn_tDBOutput_4);
            conn_tDBOutput_4.setAutoCommit(false);
            int commitEvery_tDBOutput_4 = 10000;
            int commitCounter_tDBOutput_4 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_4.getAutoCommit())  + ("'.") );
        int count_tDBOutput_4=0;

        if(dbschema_tDBOutput_4 == null || dbschema_tDBOutput_4.trim().length() == 0) {
            tableName_tDBOutput_4 = ("ODS_S_FAMILLE");
        } else {
            tableName_tDBOutput_4 = dbschema_tDBOutput_4 + "." + ("ODS_S_FAMILLE");
        }
            int rsTruncCountNumber_tDBOutput_4 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_4 = conn_tDBOutput_4.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_4 = stmtTruncCount_tDBOutput_4.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_4 + "")) {
                    if(rsTruncCount_tDBOutput_4.next()) {
                        rsTruncCountNumber_tDBOutput_4 = rsTruncCount_tDBOutput_4.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_4 = conn_tDBOutput_4.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_4)  + ("'.") );
                stmtTrunc_tDBOutput_4.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_4 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_4)  + ("' has succeeded.") );
                deletedCount_tDBOutput_4 += rsTruncCountNumber_tDBOutput_4;
            }
                String insert_tDBOutput_4 = "INSERT INTO " + tableName_tDBOutput_4 + " (ID_FAMILLE_INT,ID_SFAMILLE_INT,ID_SFAMILLE,SFAMILLE) VALUES (?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(insert_tDBOutput_4);
                        resourceMap.put("pstmt_tDBOutput_4", pstmt_tDBOutput_4);





 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row7");
			
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
		int count_row7_tMap_4 = 0;
		
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
                            log4jParamters_tDBInput_4.append("DB_VERSION" + " = " + "ORACLE_18");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("HOST" + " = " + "\"192.168.99.98\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("PORT" + " = " + "\"1521\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("DBNAME" + " = " + "\"GOLDV5\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("USER" + " = " + "\"CENPRD\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:8hbk1YEhcjALhC1yaPtK5pBCefludZzxdKTqQ/RLUr0IKA==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERY" + " = " + "\"SELECT     objpere AS ID_FAMILLE_INT, sobcint AS ID_SFAMILLE_INT, sobcext AS ID_SFAMILLE, SUBSTR(pkstrucobj.get_desc(sobcint, 'FR'), 1, 50) AS SFAMILLE  FROM         STRUCOBJ, STRUCREL  WHERE     sobcint = STRUCREL.objcint AND sobidniv = 5\"");
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
                            log4jParamters_tDBInput_4.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SFAMILLE")+"}]");
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
				talendJobLog.addCM("tDBInput_4", "ORACLE_GOLD_SQL_SFAMILLE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				String driverClass_tDBInput_4 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_4);
				
			String url_tDBInput_4 = null;
				url_tDBInput_4 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_4 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:xlAoxI0K4/wzFn3fv5XE7NzyaM+NOx2iHHHQ6OCEgWQLsw==");

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

		    String dbquery_tDBInput_4 = "SELECT     objpere AS ID_FAMILLE_INT, sobcint AS ID_SFAMILLE_INT, sobcext AS ID_SFAMILLE, SUBSTR(pkstrucobj.get_desc(so"
+"bcint, 'FR'), 1, 50) AS SFAMILLE\nFROM         STRUCOBJ, STRUCREL\nWHERE     sobcint = STRUCREL.objcint AND sobidniv = 5"
+"";
		    
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
								row7.ID_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(1) != null) {
						row7.ID_FAMILLE_INT = rs_tDBInput_4.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row7.ID_SFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(2) != null) {
						row7.ID_SFAMILLE_INT = rs_tDBInput_4.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row7.ID_SFAMILLE = null;
							} else {
	                         		
        	row7.ID_SFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_4, 3, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row7.SFAMILLE = null;
							} else {
	                         		
        	row7.SFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_4, 4, false);
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
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row7","tDBInput_4","ORACLE_GOLD_SQL_SFAMILLE","tOracleInput","tMap_4","tMap_4","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row7 - " + (row7==null? "": row7.toLogString()));
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

out4 = null;


// # Output table : 'out4'
count_out4_tMap_4++;

out4_tmp.ID_FAMILLE_INT = row7.ID_FAMILLE_INT ;
out4_tmp.ID_SFAMILLE_INT = row7.ID_SFAMILLE_INT ;
out4_tmp.ID_SFAMILLE = row7.ID_SFAMILLE ;
out4_tmp.SFAMILLE = row7.SFAMILLE ;
out4 = out4_tmp;
log.debug("tMap_4 - Outputting the record " + count_out4_tMap_4 + " of the output table 'out4'.");

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
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out4","tMap_4","tMap_4","tMap","tDBOutput_4","Oracle_ODS_S_FAMILLE","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out4 - " + (out4==null? "": out4.toLogString()));
    			}
    		



        whetherReject_tDBOutput_4 = false;
                        pstmt_tDBOutput_4.setBigDecimal(1, out4.ID_FAMILLE_INT);

                        pstmt_tDBOutput_4.setBigDecimal(2, out4.ID_SFAMILLE_INT);

                        if(out4.ID_SFAMILLE == null) {
pstmt_tDBOutput_4.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(3, out4.ID_SFAMILLE);
}

                        if(out4.SFAMILLE == null) {
pstmt_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(4, out4.SFAMILLE);
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
                commitCounter_tDBOutput_4++;
                if(commitEvery_tDBOutput_4 <= commitCounter_tDBOutput_4) {
                    if(rowsToCommitCount_tDBOutput_4 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_4)  + (" record(s).") );
                    }
                    conn_tDBOutput_4.commit();
                    if(rowsToCommitCount_tDBOutput_4 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_4 = 0;
                    }
                    commitCounter_tDBOutput_4=0;
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

} // End of branch "out4"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
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
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'out4': " + count_out4_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row7",2,0,
			 			"tDBInput_4","ORACLE_GOLD_SQL_SFAMILLE","tOracleInput","tMap_4","tMap_4","tMap","output")) {
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
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	
	



	
        if(pstmt_tDBOutput_4 != null) {
			
				pstmt_tDBOutput_4.close();
				resourceMap.remove("pstmt_tDBOutput_4");
			
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);
		if(commitCounter_tDBOutput_4 > 0 && rowsToCommitCount_tDBOutput_4 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_4)  + (" record(s).") );
		}
		conn_tDBOutput_4.commit();
		if(commitCounter_tDBOutput_4 > 0 && rowsToCommitCount_tDBOutput_4 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_4 = 0;
		}
		commitCounter_tDBOutput_4 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_4 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_4", true);
   	

	
	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_4)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out4",2,0,
			 			"tMap_4","tMap_4","tMap","tDBOutput_4","Oracle_ODS_S_FAMILLE","tOracleOutput","output")) {
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

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_4:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk10", 0, "ok");
								} 
							
							tDBInput_5Process(globalMap); 
						



	
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
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_4 = null;
                if ((pstmtToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_4")) != null) {
                    pstmtToClose_tDBOutput_4.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_4") == null){
            java.sql.Connection ctn_tDBOutput_4 = null;
            if((ctn_tDBOutput_4 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_4")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_4.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_4 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_4) {
                    String errorMessage_tDBOutput_4 = "failed to close the connection in tDBOutput_4 :" + sqlEx_tDBOutput_4.getMessage();
            log.error("tDBOutput_4 - "  + (errorMessage_tDBOutput_4) );
                    System.err.println(errorMessage_tDBOutput_4);
                }
            }
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
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class out5Struct implements routines.system.IPersistableRow<out5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public String ID_FAMILLE;

				public String getID_FAMILLE () {
					return this.ID_FAMILLE;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_FAMILLE = readString(dis);
					
					this.FAMILLE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_FAMILLE = readString(dis);
					
					this.FAMILLE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",FAMILLE="+FAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out5Struct other) {

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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public String ID_FAMILLE;

				public String getID_FAMILLE () {
					return this.ID_FAMILLE;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_FAMILLE = readString(dis);
					
					this.FAMILLE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
					this.ID_FAMILLE = readString(dis);
					
					this.FAMILLE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",FAMILLE="+FAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
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



		row9Struct row9 = new row9Struct();
out5Struct out5 = new out5Struct();





	
	/**
	 * [tDBOutput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_5", false);
		start_Hash.put("tDBOutput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_5";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out5");
			
		int tos_count_tDBOutput_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_5 = new StringBuilder();
                    log4jParamters_tDBOutput_5.append("Parameters:");
                            log4jParamters_tDBOutput_5.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:LzL98C5p9j36RgV6jbkM3GXWSEoyqKFwFbquNiKctvl0ADlj").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TABLE" + " = " + "\"ODS_FAMILLE\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_BATCH_SIZE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_5.append(" | ");
                            log4jParamters_tDBOutput_5.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + (log4jParamters_tDBOutput_5) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_5", "Oracle_ODS_FAMILLE", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_5 = 0;
    int nb_line_update_tDBOutput_5 = 0;
    int nb_line_inserted_tDBOutput_5 = 0;
    int nb_line_deleted_tDBOutput_5 = 0;
    int nb_line_rejected_tDBOutput_5 = 0;

    int tmp_batchUpdateCount_tDBOutput_5 = 0;

    int deletedCount_tDBOutput_5=0;
    int updatedCount_tDBOutput_5=0;
    int insertedCount_tDBOutput_5=0;
    int rowsToCommitCount_tDBOutput_5=0;
    int rejectedCount_tDBOutput_5=0;

    boolean whetherReject_tDBOutput_5 = false;

    java.sql.Connection conn_tDBOutput_5 = null;

    //optional table
    String dbschema_tDBOutput_5 = null;
    String tableName_tDBOutput_5 = null;
                    String driverClass_tDBOutput_5 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_5)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_5);
                String url_tDBOutput_5 = null;
                    url_tDBOutput_5 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_5 = "ods";
 
	final String decryptedPassword_tDBOutput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:VevZoVQRieu884kqBdPUqnCyzY/okYJpqFT5hXSYfjgmYa3k");

                String dbPwd_tDBOutput_5 = decryptedPassword_tDBOutput_5;
                dbschema_tDBOutput_5 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection attempts to '")  + (url_tDBOutput_5)  + ("' with the username '")  + (dbUser_tDBOutput_5)  + ("'.") );

                    conn_tDBOutput_5 = java.sql.DriverManager.getConnection(url_tDBOutput_5, dbUser_tDBOutput_5, dbPwd_tDBOutput_5);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection to '")  + (url_tDBOutput_5)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_5", conn_tDBOutput_5);
            conn_tDBOutput_5.setAutoCommit(false);
            int commitEvery_tDBOutput_5 = 10000;
            int commitCounter_tDBOutput_5 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_5.getAutoCommit())  + ("'.") );
        int count_tDBOutput_5=0;

        if(dbschema_tDBOutput_5 == null || dbschema_tDBOutput_5.trim().length() == 0) {
            tableName_tDBOutput_5 = ("ODS_FAMILLE");
        } else {
            tableName_tDBOutput_5 = dbschema_tDBOutput_5 + "." + ("ODS_FAMILLE");
        }
            int rsTruncCountNumber_tDBOutput_5 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_5 = conn_tDBOutput_5.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_5 = stmtTruncCount_tDBOutput_5.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_5 + "")) {
                    if(rsTruncCount_tDBOutput_5.next()) {
                        rsTruncCountNumber_tDBOutput_5 = rsTruncCount_tDBOutput_5.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_5 = conn_tDBOutput_5.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_5)  + ("'.") );
                stmtTrunc_tDBOutput_5.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_5 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_5)  + ("' has succeeded.") );
                deletedCount_tDBOutput_5 += rsTruncCountNumber_tDBOutput_5;
            }
                String insert_tDBOutput_5 = "INSERT INTO " + tableName_tDBOutput_5 + " (ID_RAYON_INT,ID_FAMILLE_INT,ID_FAMILLE,FAMILLE) VALUES (?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(insert_tDBOutput_5);
                        resourceMap.put("pstmt_tDBOutput_5", pstmt_tDBOutput_5);





 



/**
 * [tDBOutput_5 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
		int tos_count_tMap_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_5 = new StringBuilder();
                    log4jParamters_tMap_5.append("Parameters:");
                            log4jParamters_tMap_5.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_5.append(" | ");
                            log4jParamters_tMap_5.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_5.append(" | ");
                            log4jParamters_tMap_5.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_5.append(" | ");
                            log4jParamters_tMap_5.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_5 - "  + (log4jParamters_tMap_5) );
                    } 
                } 
            new BytesLimit65535_tMap_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_5", "tMap_5", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row9_tMap_5 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_5__Struct  {
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out5_tMap_5 = 0;
				
out5Struct out5_tmp = new out5Struct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
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
                            log4jParamters_tDBInput_5.append("DB_VERSION" + " = " + "ORACLE_18");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("HOST" + " = " + "\"192.168.99.98\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("PORT" + " = " + "\"1521\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("DBNAME" + " = " + "\"GOLDV5\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("USER" + " = " + "\"CENPRD\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:RAZc3qrGcWK9upSADxVQkiK05p+/XwJzuKRfmthbljBrQA==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERY" + " = " + "\"SELECT objpere AS ID_RAYON_INT, sobcint AS ID_FAMILLE_INT, sobcext AS ID_FAMILLE,         SUBSTR (pkstrucobj.get_desc (sobcint, 'FR'), 1, 50) AS FAMILLE    FROM STRUCOBJ, STRUCREL   WHERE sobcint = STRUCREL.objcint AND sobidniv = 4\"");
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
                            log4jParamters_tDBInput_5.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FAMILLE")+"}]");
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
				talendJobLog.addCM("tDBInput_5", "ORACLE_GOLD_SQL_FAMILLE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				String driverClass_tDBInput_5 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_5);
				
			String url_tDBInput_5 = null;
				url_tDBInput_5 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_5 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:nwp0lQkaNs3MCeuAM8jeQc9fflwyIVEhn7lwvxltPyog+w==");

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

		    String dbquery_tDBInput_5 = "SELECT objpere AS ID_RAYON_INT, sobcint AS ID_FAMILLE_INT, sobcext AS ID_FAMILLE,\n       SUBSTR (pkstrucobj.get_desc ("
+"sobcint, 'FR'), 1, 50) AS FAMILLE\n  FROM STRUCOBJ, STRUCREL\n WHERE sobcint = STRUCREL.objcint AND sobidniv = 4";
		    
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
								row9.ID_RAYON_INT = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(1) != null) {
						row9.ID_RAYON_INT = rs_tDBInput_5.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row9.ID_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(2) != null) {
						row9.ID_FAMILLE_INT = rs_tDBInput_5.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row9.ID_FAMILLE = null;
							} else {
	                         		
        	row9.ID_FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_5, 3, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row9.FAMILLE = null;
							} else {
	                         		
        	row9.FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_5, 4, false);
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
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row9","tDBInput_5","ORACLE_GOLD_SQL_FAMILLE","tOracleInput","tMap_5","tMap_5","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_5 = false;
		  boolean mainRowRejected_tMap_5 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_5__Struct Var = Var__tMap_5;// ###############################
        // ###############################
        // # Output tables

out5 = null;


// # Output table : 'out5'
count_out5_tMap_5++;

out5_tmp.ID_RAYON_INT = row9.ID_RAYON_INT ;
out5_tmp.ID_FAMILLE_INT = row9.ID_FAMILLE_INT ;
out5_tmp.ID_FAMILLE = row9.ID_FAMILLE ;
out5_tmp.FAMILLE = row9.FAMILLE ;
out5 = out5_tmp;
log.debug("tMap_5 - Outputting the record " + count_out5_tMap_5 + " of the output table 'out5'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_5 = false;










 


	tos_count_tMap_5++;

/**
 * [tMap_5 main ] stop
 */
	
	/**
	 * [tMap_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_begin ] stop
 */
// Start of branch "out5"
if(out5 != null) { 



	
	/**
	 * [tDBOutput_5 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out5","tMap_5","tMap_5","tMap","tDBOutput_5","Oracle_ODS_FAMILLE","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out5 - " + (out5==null? "": out5.toLogString()));
    			}
    		



        whetherReject_tDBOutput_5 = false;
                        pstmt_tDBOutput_5.setBigDecimal(1, out5.ID_RAYON_INT);

                        pstmt_tDBOutput_5.setBigDecimal(2, out5.ID_FAMILLE_INT);

                        if(out5.ID_FAMILLE == null) {
pstmt_tDBOutput_5.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(3, out5.ID_FAMILLE);
}

                        if(out5.FAMILLE == null) {
pstmt_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(4, out5.FAMILLE);
}

                try {
                    nb_line_tDBOutput_5++;
                    int processedCount_tDBOutput_5 = pstmt_tDBOutput_5.executeUpdate();
                    insertedCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    rowsToCommitCount_tDBOutput_5 += processedCount_tDBOutput_5;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_5)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_5) {
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e_tDBOutput_5.getMessage());
                    whetherReject_tDBOutput_5 = true;
            log.error("tDBOutput_5 - "  + (e_tDBOutput_5.getMessage()) );
                            System.err.print(e_tDBOutput_5.getMessage());
                }
                commitCounter_tDBOutput_5++;
                if(commitEvery_tDBOutput_5 <= commitCounter_tDBOutput_5) {
                    if(rowsToCommitCount_tDBOutput_5 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_5)  + (" record(s).") );
                    }
                    conn_tDBOutput_5.commit();
                    if(rowsToCommitCount_tDBOutput_5 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_5 = 0;
                    }
                    commitCounter_tDBOutput_5=0;
                }

 


	tos_count_tDBOutput_5++;

/**
 * [tDBOutput_5 main ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_end ] stop
 */

} // End of branch "out5"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
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
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_5 - Written records count in the table 'out5': " + count_out5_tMap_5 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
			 			"tDBInput_5","ORACLE_GOLD_SQL_FAMILLE","tOracleInput","tMap_5","tMap_5","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_5 - "  + ("Done.") );

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tDBOutput_5 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	
	



	
        if(pstmt_tDBOutput_5 != null) {
			
				pstmt_tDBOutput_5.close();
				resourceMap.remove("pstmt_tDBOutput_5");
			
        }
    resourceMap.put("statementClosed_tDBOutput_5", true);
		if(commitCounter_tDBOutput_5 > 0 && rowsToCommitCount_tDBOutput_5 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_5)  + (" record(s).") );
		}
		conn_tDBOutput_5.commit();
		if(commitCounter_tDBOutput_5 > 0 && rowsToCommitCount_tDBOutput_5 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_5 = 0;
		}
		commitCounter_tDBOutput_5 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_5 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_5", true);
   	

	
	nb_line_deleted_tDBOutput_5=nb_line_deleted_tDBOutput_5+ deletedCount_tDBOutput_5;
	nb_line_update_tDBOutput_5=nb_line_update_tDBOutput_5 + updatedCount_tDBOutput_5;
	nb_line_inserted_tDBOutput_5=nb_line_inserted_tDBOutput_5 + insertedCount_tDBOutput_5;
	nb_line_rejected_tDBOutput_5=nb_line_rejected_tDBOutput_5 + rejectedCount_tDBOutput_5;
	
        globalMap.put("tDBOutput_5_NB_LINE",nb_line_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_UPDATED",nb_line_update_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_DELETED",nb_line_deleted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_5);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_5)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out5",2,0,
			 			"tMap_5","tMap_5","tMap","tDBOutput_5","Oracle_ODS_FAMILLE","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Done.") );

ok_Hash.put("tDBOutput_5", true);
end_Hash.put("tDBOutput_5", System.currentTimeMillis());




/**
 * [tDBOutput_5 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_5:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk11", 0, "ok");
								} 
							
							tDBInput_6Process(globalMap); 
						



	
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
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tDBOutput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_5") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_5 = null;
                if ((pstmtToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_5")) != null) {
                    pstmtToClose_tDBOutput_5.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_5") == null){
            java.sql.Connection ctn_tDBOutput_5 = null;
            if((ctn_tDBOutput_5 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_5")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_5.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_5 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_5) {
                    String errorMessage_tDBOutput_5 = "failed to close the connection in tDBOutput_5 :" + sqlEx_tDBOutput_5.getMessage();
            log.error("tDBOutput_5 - "  + (errorMessage_tDBOutput_5) );
                    System.err.println(errorMessage_tDBOutput_5);
                }
            }
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
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class out6Struct implements routines.system.IPersistableRow<out6Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
					this.ID_RAYON = readString(dis);
					
					this.RAYON = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
					this.ID_RAYON = readString(dis);
					
					this.RAYON = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",RAYON="+RAYON);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out6Struct other) {

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

public static class row11Struct implements routines.system.IPersistableRow<row11Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
					this.ID_RAYON = readString(dis);
					
					this.RAYON = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
					this.ID_RAYON = readString(dis);
					
					this.RAYON = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",RAYON="+RAYON);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
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
public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

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



		row11Struct row11 = new row11Struct();
out6Struct out6 = new out6Struct();





	
	/**
	 * [tDBOutput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_6", false);
		start_Hash.put("tDBOutput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_6";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out6");
			
		int tos_count_tDBOutput_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_6 = new StringBuilder();
                    log4jParamters_tDBOutput_6.append("Parameters:");
                            log4jParamters_tDBOutput_6.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:T6FS/ZlrS6kxh6470diQM756ROmo1zBzXMPfNxBfD5G3KGDW").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("TABLE" + " = " + "\"ODS_RAYON\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_6.append(" | ");
                            log4jParamters_tDBOutput_6.append("COMMIT_EVERY" + " = " + "10000");
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
                            log4jParamters_tDBOutput_6.append("USE_BATCH_SIZE" + " = " + "false");
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
				talendJobLog.addCM("tDBOutput_6", "Oracle_ODS_RAYON", "tOracleOutput");
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
                    String driverClass_tDBOutput_6 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_6)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_6);
                String url_tDBOutput_6 = null;
                    url_tDBOutput_6 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_6 = "ods";
 
	final String decryptedPassword_tDBOutput_6 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:6ydO7sUndhIQhtFenGVH6JmPhFXS1xKVbz27JUM/nj6kxaTH");

                String dbPwd_tDBOutput_6 = decryptedPassword_tDBOutput_6;
                dbschema_tDBOutput_6 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection attempts to '")  + (url_tDBOutput_6)  + ("' with the username '")  + (dbUser_tDBOutput_6)  + ("'.") );

                    conn_tDBOutput_6 = java.sql.DriverManager.getConnection(url_tDBOutput_6, dbUser_tDBOutput_6, dbPwd_tDBOutput_6);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection to '")  + (url_tDBOutput_6)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_6", conn_tDBOutput_6);
            conn_tDBOutput_6.setAutoCommit(false);
            int commitEvery_tDBOutput_6 = 10000;
            int commitCounter_tDBOutput_6 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_6.getAutoCommit())  + ("'.") );
        int count_tDBOutput_6=0;

        if(dbschema_tDBOutput_6 == null || dbschema_tDBOutput_6.trim().length() == 0) {
            tableName_tDBOutput_6 = ("ODS_RAYON");
        } else {
            tableName_tDBOutput_6 = dbschema_tDBOutput_6 + "." + ("ODS_RAYON");
        }
            int rsTruncCountNumber_tDBOutput_6 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_6 = conn_tDBOutput_6.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_6 = stmtTruncCount_tDBOutput_6.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_6 + "")) {
                    if(rsTruncCount_tDBOutput_6.next()) {
                        rsTruncCountNumber_tDBOutput_6 = rsTruncCount_tDBOutput_6.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_6 = conn_tDBOutput_6.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_6)  + ("'.") );
                stmtTrunc_tDBOutput_6.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_6 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_6)  + ("' has succeeded.") );
                deletedCount_tDBOutput_6 += rsTruncCountNumber_tDBOutput_6;
            }
                String insert_tDBOutput_6 = "INSERT INTO " + tableName_tDBOutput_6 + " (ID_DEPARTEMENT_INT,ID_RAYON_INT,ID_RAYON,RAYON) VALUES (?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_6 = conn_tDBOutput_6.prepareStatement(insert_tDBOutput_6);
                        resourceMap.put("pstmt_tDBOutput_6", pstmt_tDBOutput_6);





 



/**
 * [tDBOutput_6 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row11");
			
		int tos_count_tMap_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_6 = new StringBuilder();
                    log4jParamters_tMap_6.append("Parameters:");
                            log4jParamters_tMap_6.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + (log4jParamters_tMap_6) );
                    } 
                } 
            new BytesLimit65535_tMap_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_6", "tMap_6", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row11_tMap_6 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6__Struct  {
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out6_tMap_6 = 0;
				
out6Struct out6_tmp = new out6Struct();
// ###############################

        
        



        









 



/**
 * [tMap_6 begin ] stop
 */



	
	/**
	 * [tDBInput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_6", false);
		start_Hash.put("tDBInput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_6";

	
		int tos_count_tDBInput_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_6 = new StringBuilder();
                    log4jParamters_tDBInput_6.append("Parameters:");
                            log4jParamters_tDBInput_6.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("DB_VERSION" + " = " + "ORACLE_18");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("HOST" + " = " + "\"192.168.99.98\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("PORT" + " = " + "\"1521\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("DBNAME" + " = " + "\"GOLDV5\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("USER" + " = " + "\"CENPRD\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:PvDGufuC8NG4Sh6TjtjqBwvUWyN25cM9DyDgMjD3wNv2KQ==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERY" + " = " + "\"SELECT objpere AS ID_DEPARTEMENT_INT, sobcint AS ID_RAYON_INT, sobcext AS ID_RAYON,         SUBSTR (pkstrucobj.get_desc (sobcint, 'FR'), 1, 50) AS RAYON    FROM STRUCOBJ, STRUCREL   WHERE sobcint = STRUCREL.objcint AND sobidniv = 3\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RAYON")+"}]");
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
				talendJobLog.addCM("tDBInput_6", "ORACLE_GOLD_SQL_RAYON", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_6 = 0;
		    java.sql.Connection conn_tDBInput_6 = null;
				String driverClass_tDBInput_6 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_6);
				
			String url_tDBInput_6 = null;
				url_tDBInput_6 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_6 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_6 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:zJm2KUPJDIOXXWyMxUqDFS4yoUnULkGrjryV+rooy5Lf9w==");

				String dbPwd_tDBInput_6 = decryptedPassword_tDBInput_6;

				
	    		log.debug("tDBInput_6 - Driver ClassName: "+driverClass_tDBInput_6+".");
			
	    		log.debug("tDBInput_6 - Connection attempt to '" + url_tDBInput_6 + "' with the username '" + dbUser_tDBInput_6 + "'.");
			
					conn_tDBInput_6 = java.sql.DriverManager.getConnection(url_tDBInput_6,dbUser_tDBInput_6,dbPwd_tDBInput_6);
	    		log.debug("tDBInput_6 - Connection to '" + url_tDBInput_6 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_6 = conn_tDBInput_6.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_6 = stmtGetTZ_tDBInput_6.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_6 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_6.next()) {
					sessionTimezone_tDBInput_6 = rsGetTZ_tDBInput_6.getString(1);
				}
                                if (!(conn_tDBInput_6 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_6.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_6.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_6.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_6);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_6).setSessionTimeZone(sessionTimezone_tDBInput_6);
                                }
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "SELECT objpere AS ID_DEPARTEMENT_INT, sobcint AS ID_RAYON_INT, sobcext AS ID_RAYON,\n       SUBSTR (pkstrucobj.get_desc"
+" (sobcint, 'FR'), 1, 50) AS RAYON\n  FROM STRUCOBJ, STRUCREL\n WHERE sobcint = STRUCREL.objcint AND sobidniv = 3";
		    
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
								row11.ID_DEPARTEMENT_INT = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(1) != null) {
						row11.ID_DEPARTEMENT_INT = rs_tDBInput_6.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row11.ID_RAYON_INT = null;
							} else {
		                          
					if(rs_tDBInput_6.getObject(2) != null) {
						row11.ID_RAYON_INT = rs_tDBInput_6.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row11.ID_RAYON = null;
							} else {
	                         		
        	row11.ID_RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_6, 3, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row11.RAYON = null;
							} else {
	                         		
        	row11.RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_6, 4, false);
		                    }
					
						log.debug("tDBInput_6 - Retrieving the record " + nb_line_tDBInput_6 + ".");
					




 



/**
 * [tDBInput_6 begin ] stop
 */
	
	/**
	 * [tDBInput_6 main ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 


	tos_count_tDBInput_6++;

/**
 * [tDBInput_6 main ] stop
 */
	
	/**
	 * [tDBInput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_begin ] stop
 */

	
	/**
	 * [tMap_6 main ] start
	 */

	

	
	
	currentComponent="tMap_6";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row11","tDBInput_6","ORACLE_GOLD_SQL_RAYON","tOracleInput","tMap_6","tMap_6","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row11 - " + (row11==null? "": row11.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6 = false;
		  boolean mainRowRejected_tMap_6 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_6__Struct Var = Var__tMap_6;// ###############################
        // ###############################
        // # Output tables

out6 = null;


// # Output table : 'out6'
count_out6_tMap_6++;

out6_tmp.ID_DEPARTEMENT_INT = row11.ID_DEPARTEMENT_INT ;
out6_tmp.ID_RAYON_INT = row11.ID_RAYON_INT ;
out6_tmp.ID_RAYON = row11.ID_RAYON ;
out6_tmp.RAYON = row11.RAYON ;
out6 = out6_tmp;
log.debug("tMap_6 - Outputting the record " + count_out6_tMap_6 + " of the output table 'out6'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_6 = false;










 


	tos_count_tMap_6++;

/**
 * [tMap_6 main ] stop
 */
	
	/**
	 * [tMap_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_begin ] stop
 */
// Start of branch "out6"
if(out6 != null) { 



	
	/**
	 * [tDBOutput_6 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out6","tMap_6","tMap_6","tMap","tDBOutput_6","Oracle_ODS_RAYON","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out6 - " + (out6==null? "": out6.toLogString()));
    			}
    		



        whetherReject_tDBOutput_6 = false;
                        pstmt_tDBOutput_6.setBigDecimal(1, out6.ID_DEPARTEMENT_INT);

                        pstmt_tDBOutput_6.setBigDecimal(2, out6.ID_RAYON_INT);

                        if(out6.ID_RAYON == null) {
pstmt_tDBOutput_6.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(3, out6.ID_RAYON);
}

                        if(out6.RAYON == null) {
pstmt_tDBOutput_6.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(4, out6.RAYON);
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
                commitCounter_tDBOutput_6++;
                if(commitEvery_tDBOutput_6 <= commitCounter_tDBOutput_6) {
                    if(rowsToCommitCount_tDBOutput_6 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_6)  + (" record(s).") );
                    }
                    conn_tDBOutput_6.commit();
                    if(rowsToCommitCount_tDBOutput_6 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_6 = 0;
                    }
                    commitCounter_tDBOutput_6=0;
                }

 


	tos_count_tDBOutput_6++;

/**
 * [tDBOutput_6 main ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	

 



/**
 * [tDBOutput_6 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	

 



/**
 * [tDBOutput_6 process_data_end ] stop
 */

} // End of branch "out6"




	
	/**
	 * [tMap_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_6 end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

}
}finally{
	if (rs_tDBInput_6 != null) {
		rs_tDBInput_6.close();
	}
	if (stmt_tDBInput_6 != null) {
		stmt_tDBInput_6.close();
	}
	if(conn_tDBInput_6 != null && !conn_tDBInput_6.isClosed()) {
	
	    		log.debug("tDBInput_6 - Closing the connection to the database.");
			
			conn_tDBInput_6.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_6 - Connection to the database closed.");
			
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
	 * [tMap_6 end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_6 - Written records count in the table 'out6': " + count_out6_tMap_6 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row11",2,0,
			 			"tDBInput_6","ORACLE_GOLD_SQL_RAYON","tOracleInput","tMap_6","tMap_6","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + ("Done.") );

ok_Hash.put("tMap_6", true);
end_Hash.put("tMap_6", System.currentTimeMillis());




/**
 * [tMap_6 end ] stop
 */

	
	/**
	 * [tDBOutput_6 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	
	



	
        if(pstmt_tDBOutput_6 != null) {
			
				pstmt_tDBOutput_6.close();
				resourceMap.remove("pstmt_tDBOutput_6");
			
        }
    resourceMap.put("statementClosed_tDBOutput_6", true);
		if(commitCounter_tDBOutput_6 > 0 && rowsToCommitCount_tDBOutput_6 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_6)  + (" record(s).") );
		}
		conn_tDBOutput_6.commit();
		if(commitCounter_tDBOutput_6 > 0 && rowsToCommitCount_tDBOutput_6 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_6 = 0;
		}
		commitCounter_tDBOutput_6 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_6 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_6", true);
   	

	
	nb_line_deleted_tDBOutput_6=nb_line_deleted_tDBOutput_6+ deletedCount_tDBOutput_6;
	nb_line_update_tDBOutput_6=nb_line_update_tDBOutput_6 + updatedCount_tDBOutput_6;
	nb_line_inserted_tDBOutput_6=nb_line_inserted_tDBOutput_6 + insertedCount_tDBOutput_6;
	nb_line_rejected_tDBOutput_6=nb_line_rejected_tDBOutput_6 + rejectedCount_tDBOutput_6;
	
        globalMap.put("tDBOutput_6_NB_LINE",nb_line_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_UPDATED",nb_line_update_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_DELETED",nb_line_deleted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_6);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_6)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out6",2,0,
			 			"tMap_6","tMap_6","tMap","tDBOutput_6","Oracle_ODS_RAYON","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Done.") );

ok_Hash.put("tDBOutput_6", true);
end_Hash.put("tDBOutput_6", System.currentTimeMillis());




/**
 * [tDBOutput_6 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_6:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk12", 0, "ok");
								} 
							
							tDBInput_7Process(globalMap); 
						



	
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
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 finally ] stop
 */

	
	/**
	 * [tMap_6 finally ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 finally ] stop
 */

	
	/**
	 * [tDBOutput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_6") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_6 = null;
                if ((pstmtToClose_tDBOutput_6 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_6")) != null) {
                    pstmtToClose_tDBOutput_6.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_6") == null){
            java.sql.Connection ctn_tDBOutput_6 = null;
            if((ctn_tDBOutput_6 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_6")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_6.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_6 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_6) {
                    String errorMessage_tDBOutput_6 = "failed to close the connection in tDBOutput_6 :" + sqlEx_tDBOutput_6.getMessage();
            log.error("tDBOutput_6 - "  + (errorMessage_tDBOutput_6) );
                    System.err.println(errorMessage_tDBOutput_6);
                }
            }
        }
    }
 



/**
 * [tDBOutput_6 finally ] stop
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
	


public static class out7Struct implements routines.system.IPersistableRow<out7Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public String ID_DEPARTEMENT;

				public String getID_DEPARTEMENT () {
					return this.ID_DEPARTEMENT;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out7Struct other) {

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

public static class row13Struct implements routines.system.IPersistableRow<row13Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public String ID_DEPARTEMENT;

				public String getID_DEPARTEMENT () {
					return this.ID_DEPARTEMENT;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row13Struct other) {

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



		row13Struct row13 = new row13Struct();
out7Struct out7 = new out7Struct();





	
	/**
	 * [tDBOutput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_7", false);
		start_Hash.put("tDBOutput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_7";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out7");
			
		int tos_count_tDBOutput_7 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_7{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_7 = new StringBuilder();
                    log4jParamters_tDBOutput_7.append("Parameters:");
                            log4jParamters_tDBOutput_7.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:jJNifaduFmslYhu2W9FwI4j9XzxObFh7p1f0odlakdKi5B8i").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("TABLE" + " = " + "\"ODS_DEPARTEMENT\"");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("USE_BATCH_SIZE" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_7.append(" | ");
                            log4jParamters_tDBOutput_7.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_7.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + (log4jParamters_tDBOutput_7) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_7().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_7", "Oracle_ODS_DEPARTEMENT", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_7 = 0;
    int nb_line_update_tDBOutput_7 = 0;
    int nb_line_inserted_tDBOutput_7 = 0;
    int nb_line_deleted_tDBOutput_7 = 0;
    int nb_line_rejected_tDBOutput_7 = 0;

    int tmp_batchUpdateCount_tDBOutput_7 = 0;

    int deletedCount_tDBOutput_7=0;
    int updatedCount_tDBOutput_7=0;
    int insertedCount_tDBOutput_7=0;
    int rowsToCommitCount_tDBOutput_7=0;
    int rejectedCount_tDBOutput_7=0;

    boolean whetherReject_tDBOutput_7 = false;

    java.sql.Connection conn_tDBOutput_7 = null;

    //optional table
    String dbschema_tDBOutput_7 = null;
    String tableName_tDBOutput_7 = null;
                    String driverClass_tDBOutput_7 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_7)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_7);
                String url_tDBOutput_7 = null;
                    url_tDBOutput_7 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_7 = "ods";
 
	final String decryptedPassword_tDBOutput_7 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:wZo+dFtzoklzf/WzjL5weeDgJhcpFASuxJ8/78Ej+TALDL/e");

                String dbPwd_tDBOutput_7 = decryptedPassword_tDBOutput_7;
                dbschema_tDBOutput_7 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection attempts to '")  + (url_tDBOutput_7)  + ("' with the username '")  + (dbUser_tDBOutput_7)  + ("'.") );

                    conn_tDBOutput_7 = java.sql.DriverManager.getConnection(url_tDBOutput_7, dbUser_tDBOutput_7, dbPwd_tDBOutput_7);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection to '")  + (url_tDBOutput_7)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_7", conn_tDBOutput_7);
            conn_tDBOutput_7.setAutoCommit(false);
            int commitEvery_tDBOutput_7 = 10000;
            int commitCounter_tDBOutput_7 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_7.getAutoCommit())  + ("'.") );
        int count_tDBOutput_7=0;

        if(dbschema_tDBOutput_7 == null || dbschema_tDBOutput_7.trim().length() == 0) {
            tableName_tDBOutput_7 = ("ODS_DEPARTEMENT");
        } else {
            tableName_tDBOutput_7 = dbschema_tDBOutput_7 + "." + ("ODS_DEPARTEMENT");
        }
            int rsTruncCountNumber_tDBOutput_7 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_7 = conn_tDBOutput_7.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_7 = stmtTruncCount_tDBOutput_7.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_7 + "")) {
                    if(rsTruncCount_tDBOutput_7.next()) {
                        rsTruncCountNumber_tDBOutput_7 = rsTruncCount_tDBOutput_7.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_7 = conn_tDBOutput_7.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_7)  + ("'.") );
                stmtTrunc_tDBOutput_7.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_7 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_7)  + ("' has succeeded.") );
                deletedCount_tDBOutput_7 += rsTruncCountNumber_tDBOutput_7;
            }
                String insert_tDBOutput_7 = "INSERT INTO " + tableName_tDBOutput_7 + " (ID_DEPARTEMENT_INT,ID_DEPARTEMENT,DEPARTEMENT) VALUES (?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_7 = conn_tDBOutput_7.prepareStatement(insert_tDBOutput_7);
                        resourceMap.put("pstmt_tDBOutput_7", pstmt_tDBOutput_7);





 



/**
 * [tDBOutput_7 begin ] stop
 */



	
	/**
	 * [tMap_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_7", false);
		start_Hash.put("tMap_7", System.currentTimeMillis());
		
	
	currentComponent="tMap_7";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row13");
			
		int tos_count_tMap_7 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_7 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_7{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_7 = new StringBuilder();
                    log4jParamters_tMap_7.append("Parameters:");
                            log4jParamters_tMap_7.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_7.append(" | ");
                            log4jParamters_tMap_7.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_7.append(" | ");
                            log4jParamters_tMap_7.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_7.append(" | ");
                            log4jParamters_tMap_7.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_7.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_7 - "  + (log4jParamters_tMap_7) );
                    } 
                } 
            new BytesLimit65535_tMap_7().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_7", "tMap_7", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row13_tMap_7 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_7__Struct  {
}
Var__tMap_7__Struct Var__tMap_7 = new Var__tMap_7__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out7_tMap_7 = 0;
				
out7Struct out7_tmp = new out7Struct();
// ###############################

        
        



        









 



/**
 * [tMap_7 begin ] stop
 */



	
	/**
	 * [tDBInput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_7", false);
		start_Hash.put("tDBInput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_7";

	
		int tos_count_tDBInput_7 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_7 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_7{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_7 = new StringBuilder();
                    log4jParamters_tDBInput_7.append("Parameters:");
                            log4jParamters_tDBInput_7.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("DB_VERSION" + " = " + "ORACLE_18");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("HOST" + " = " + "\"192.168.99.98\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("PORT" + " = " + "\"1521\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("DBNAME" + " = " + "\"GOLDV5\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("SCHEMA_DB" + " = " + "\"\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("USER" + " = " + "\"CENPRD\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:9XgO5zBEosSpejdjecrtm07RGLXDvdpur/GO+XGNcz55Lg==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("QUERY" + " = " + "\"SELECT sobcint AS id_departement_int,          substr (sobcext, 1, 3) AS id_departement,         substr (pkstrucobj.get_desc (sobcint, 'FR'), 1, 50) AS departement    FROM STRUCOBJ   WHERE sobidniv = 2\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_7.append(" | ");
                            log4jParamters_tDBInput_7.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPARTEMENT")+"}]");
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
				talendJobLog.addCM("tDBInput_7", "ORACLE_GOLD_SQL_DEPARTEMENT", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_7 = 0;
		    java.sql.Connection conn_tDBInput_7 = null;
				String driverClass_tDBInput_7 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_7);
				
			String url_tDBInput_7 = null;
				url_tDBInput_7 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_7 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_7 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:YIRTAHLrQY9yK8ovo5RkWsmCNF/rp7ixADCu5FAlr3f9fw==");

				String dbPwd_tDBInput_7 = decryptedPassword_tDBInput_7;

				
	    		log.debug("tDBInput_7 - Driver ClassName: "+driverClass_tDBInput_7+".");
			
	    		log.debug("tDBInput_7 - Connection attempt to '" + url_tDBInput_7 + "' with the username '" + dbUser_tDBInput_7 + "'.");
			
					conn_tDBInput_7 = java.sql.DriverManager.getConnection(url_tDBInput_7,dbUser_tDBInput_7,dbPwd_tDBInput_7);
	    		log.debug("tDBInput_7 - Connection to '" + url_tDBInput_7 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_7 = conn_tDBInput_7.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_7 = stmtGetTZ_tDBInput_7.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_7 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_7.next()) {
					sessionTimezone_tDBInput_7 = rsGetTZ_tDBInput_7.getString(1);
				}
                                if (!(conn_tDBInput_7 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_7.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_7.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_7.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_7);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_7).setSessionTimeZone(sessionTimezone_tDBInput_7);
                                }
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT sobcint AS id_departement_int, \n       substr (sobcext, 1, 3) AS id_departement,\n       substr (pkstrucobj.get"
+"_desc (sobcint, 'FR'), 1, 50) AS departement\n  FROM STRUCOBJ\n WHERE sobidniv = 2";
		    
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
								row13.ID_DEPARTEMENT_INT = null;
							} else {
		                          
					if(rs_tDBInput_7.getObject(1) != null) {
						row13.ID_DEPARTEMENT_INT = rs_tDBInput_7.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								row13.ID_DEPARTEMENT = null;
							} else {
	                         		
        	row13.ID_DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_7, 2, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 3) {
								row13.DEPARTEMENT = null;
							} else {
	                         		
        	row13.DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_7, 3, false);
		                    }
					
						log.debug("tDBInput_7 - Retrieving the record " + nb_line_tDBInput_7 + ".");
					




 



/**
 * [tDBInput_7 begin ] stop
 */
	
	/**
	 * [tDBInput_7 main ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 


	tos_count_tDBInput_7++;

/**
 * [tDBInput_7 main ] stop
 */
	
	/**
	 * [tDBInput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_begin ] stop
 */

	
	/**
	 * [tMap_7 main ] start
	 */

	

	
	
	currentComponent="tMap_7";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row13","tDBInput_7","ORACLE_GOLD_SQL_DEPARTEMENT","tOracleInput","tMap_7","tMap_7","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row13 - " + (row13==null? "": row13.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_7 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_7 = false;
		  boolean mainRowRejected_tMap_7 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_7__Struct Var = Var__tMap_7;// ###############################
        // ###############################
        // # Output tables

out7 = null;


// # Output table : 'out7'
count_out7_tMap_7++;

out7_tmp.ID_DEPARTEMENT_INT = row13.ID_DEPARTEMENT_INT ;
out7_tmp.ID_DEPARTEMENT = row13.ID_DEPARTEMENT ;
out7_tmp.DEPARTEMENT = row13.DEPARTEMENT ;
out7 = out7_tmp;
log.debug("tMap_7 - Outputting the record " + count_out7_tMap_7 + " of the output table 'out7'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_7 = false;










 


	tos_count_tMap_7++;

/**
 * [tMap_7 main ] stop
 */
	
	/**
	 * [tMap_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 process_data_begin ] stop
 */
// Start of branch "out7"
if(out7 != null) { 



	
	/**
	 * [tDBOutput_7 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out7","tMap_7","tMap_7","tMap","tDBOutput_7","Oracle_ODS_DEPARTEMENT","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out7 - " + (out7==null? "": out7.toLogString()));
    			}
    		



        whetherReject_tDBOutput_7 = false;
                        pstmt_tDBOutput_7.setBigDecimal(1, out7.ID_DEPARTEMENT_INT);

                        if(out7.ID_DEPARTEMENT == null) {
pstmt_tDBOutput_7.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(2, out7.ID_DEPARTEMENT);
}

                        if(out7.DEPARTEMENT == null) {
pstmt_tDBOutput_7.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(3, out7.DEPARTEMENT);
}

                try {
                    nb_line_tDBOutput_7++;
                    int processedCount_tDBOutput_7 = pstmt_tDBOutput_7.executeUpdate();
                    insertedCount_tDBOutput_7 += processedCount_tDBOutput_7;
                    rowsToCommitCount_tDBOutput_7 += processedCount_tDBOutput_7;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_7)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_7) {
globalMap.put("tDBOutput_7_ERROR_MESSAGE",e_tDBOutput_7.getMessage());
                    whetherReject_tDBOutput_7 = true;
            log.error("tDBOutput_7 - "  + (e_tDBOutput_7.getMessage()) );
                            System.err.print(e_tDBOutput_7.getMessage());
                }
                commitCounter_tDBOutput_7++;
                if(commitEvery_tDBOutput_7 <= commitCounter_tDBOutput_7) {
                    if(rowsToCommitCount_tDBOutput_7 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_7)  + (" record(s).") );
                    }
                    conn_tDBOutput_7.commit();
                    if(rowsToCommitCount_tDBOutput_7 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_7 = 0;
                    }
                    commitCounter_tDBOutput_7=0;
                }

 


	tos_count_tDBOutput_7++;

/**
 * [tDBOutput_7 main ] stop
 */
	
	/**
	 * [tDBOutput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	

 



/**
 * [tDBOutput_7 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	

 



/**
 * [tDBOutput_7 process_data_end ] stop
 */

} // End of branch "out7"




	
	/**
	 * [tMap_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_7 end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

}
}finally{
	if (rs_tDBInput_7 != null) {
		rs_tDBInput_7.close();
	}
	if (stmt_tDBInput_7 != null) {
		stmt_tDBInput_7.close();
	}
	if(conn_tDBInput_7 != null && !conn_tDBInput_7.isClosed()) {
	
	    		log.debug("tDBInput_7 - Closing the connection to the database.");
			
			conn_tDBInput_7.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_7 - Connection to the database closed.");
			
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
	 * [tMap_7 end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_7 - Written records count in the table 'out7': " + count_out7_tMap_7 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row13",2,0,
			 			"tDBInput_7","ORACLE_GOLD_SQL_DEPARTEMENT","tOracleInput","tMap_7","tMap_7","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_7 - "  + ("Done.") );

ok_Hash.put("tMap_7", true);
end_Hash.put("tMap_7", System.currentTimeMillis());




/**
 * [tMap_7 end ] stop
 */

	
	/**
	 * [tDBOutput_7 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	
	



	
        if(pstmt_tDBOutput_7 != null) {
			
				pstmt_tDBOutput_7.close();
				resourceMap.remove("pstmt_tDBOutput_7");
			
        }
    resourceMap.put("statementClosed_tDBOutput_7", true);
		if(commitCounter_tDBOutput_7 > 0 && rowsToCommitCount_tDBOutput_7 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_7)  + (" record(s).") );
		}
		conn_tDBOutput_7.commit();
		if(commitCounter_tDBOutput_7 > 0 && rowsToCommitCount_tDBOutput_7 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_7 = 0;
		}
		commitCounter_tDBOutput_7 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_7 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_7", true);
   	

	
	nb_line_deleted_tDBOutput_7=nb_line_deleted_tDBOutput_7+ deletedCount_tDBOutput_7;
	nb_line_update_tDBOutput_7=nb_line_update_tDBOutput_7 + updatedCount_tDBOutput_7;
	nb_line_inserted_tDBOutput_7=nb_line_inserted_tDBOutput_7 + insertedCount_tDBOutput_7;
	nb_line_rejected_tDBOutput_7=nb_line_rejected_tDBOutput_7 + rejectedCount_tDBOutput_7;
	
        globalMap.put("tDBOutput_7_NB_LINE",nb_line_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_UPDATED",nb_line_update_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_DELETED",nb_line_deleted_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_7);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_7)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out7",2,0,
			 			"tMap_7","tMap_7","tMap","tDBOutput_7","Oracle_ODS_DEPARTEMENT","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Done.") );

ok_Hash.put("tDBOutput_7", true);
end_Hash.put("tDBOutput_7", System.currentTimeMillis());




/**
 * [tDBOutput_7 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_7:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk13", 0, "ok");
								} 
							
							tDBInput_8Process(globalMap); 
						



	
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
	 * [tDBInput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 finally ] stop
 */

	
	/**
	 * [tMap_7 finally ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 finally ] stop
 */

	
	/**
	 * [tDBOutput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_7") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_7 = null;
                if ((pstmtToClose_tDBOutput_7 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_7")) != null) {
                    pstmtToClose_tDBOutput_7.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_7") == null){
            java.sql.Connection ctn_tDBOutput_7 = null;
            if((ctn_tDBOutput_7 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_7")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_7.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_7 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_7) {
                    String errorMessage_tDBOutput_7 = "failed to close the connection in tDBOutput_7 :" + sqlEx_tDBOutput_7.getMessage();
            log.error("tDBOutput_7 - "  + (errorMessage_tDBOutput_7) );
                    System.err.println(errorMessage_tDBOutput_7);
                }
            }
        }
    }
 



/**
 * [tDBOutput_7 finally ] stop
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
	


public static class out9Struct implements routines.system.IPersistableRow<out9Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_GROUPE_PRODUIT;

				public String getID_GROUPE_PRODUIT () {
					return this.ID_GROUPE_PRODUIT;
				}
				
			    public String ID_ARTICLE_INR;

				public String getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public String ID_ARTICLE_INV;

				public String getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public String ID_ARTICLE_CEXUV;

				public String getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String EAN13;

				public String getEAN13 () {
					return this.EAN13;
				}
				
			    public String ARTICLE_COURT;

				public String getARTICLE_COURT () {
					return this.ARTICLE_COURT;
				}
				
			    public String ARTICLE_LONG;

				public String getARTICLE_LONG () {
					return this.ARTICLE_LONG;
				}
				
			    public String ID_ETAT;

				public String getID_ETAT () {
					return this.ID_ETAT;
				}
				
			    public String ETAT_COURT;

				public String getETAT_COURT () {
					return this.ETAT_COURT;
				}
				
			    public String ETAT_LONG;

				public String getETAT_LONG () {
					return this.ETAT_LONG;
				}
				
			    public String DT_CREATION;

				public String getDT_CREATION () {
					return this.DT_CREATION;
				}
				
			    public String SAISONNALITE;

				public String getSAISONNALITE () {
					return this.SAISONNALITE;
				}
				
			    public String ARTICLE_PROVENANCE;

				public String getARTICLE_PROVENANCE () {
					return this.ARTICLE_PROVENANCE;
				}
				
			    public String ARTICLE_DETENTION;

				public String getARTICLE_DETENTION () {
					return this.ARTICLE_DETENTION;
				}
				
			    public String ARTICLE_TYPE;

				public String getARTICLE_TYPE () {
					return this.ARTICLE_TYPE;
				}
				
			    public String ARTICLE_QRTL;

				public String getARTICLE_QRTL () {
					return this.ARTICLE_QRTL;
				}
				
			    public String ARTICLE_MARQ;

				public String getARTICLE_MARQ () {
					return this.ARTICLE_MARQ;
				}
				
			    public String CONTENANCE;

				public String getCONTENANCE () {
					return this.CONTENANCE;
				}
				
			    public String PA;

				public String getPA () {
					return this.PA;
				}
				
			    public String PV;

				public String getPV () {
					return this.PV;
				}
				
			    public String DEBUT_STOCK;

				public String getDEBUT_STOCK () {
					return this.DEBUT_STOCK;
				}
				
			    public String FIN_STOCK;

				public String getFIN_STOCK () {
					return this.FIN_STOCK;
				}
				
			    public String RUPT_LONG_DUREE;

				public String getRUPT_LONG_DUREE () {
					return this.RUPT_LONG_DUREE;
				}
				
			    public String ID_FOURNISSEUR;

				public String getID_FOURNISSEUR () {
					return this.ID_FOURNISSEUR;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public String ID_SSFAMILLE;

				public String getID_SSFAMILLE () {
					return this.ID_SSFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String ID_SFAMILLE;

				public String getID_SFAMILLE () {
					return this.ID_SFAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String ID_FAMILLE;

				public String getID_FAMILLE () {
					return this.ID_FAMILLE;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String ID_DEPARTEMENT;

				public String getID_DEPARTEMENT () {
					return this.ID_DEPARTEMENT;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_GROUPE_PRODUIT="+ID_GROUPE_PRODUIT);
		sb.append(",ID_ARTICLE_INR="+ID_ARTICLE_INR);
		sb.append(",ID_ARTICLE_INV="+ID_ARTICLE_INV);
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_CEXUV="+ID_ARTICLE_CEXUV);
		sb.append(",EAN13="+EAN13);
		sb.append(",ARTICLE_COURT="+ARTICLE_COURT);
		sb.append(",ARTICLE_LONG="+ARTICLE_LONG);
		sb.append(",ID_ETAT="+ID_ETAT);
		sb.append(",ETAT_COURT="+ETAT_COURT);
		sb.append(",ETAT_LONG="+ETAT_LONG);
		sb.append(",DT_CREATION="+DT_CREATION);
		sb.append(",SAISONNALITE="+SAISONNALITE);
		sb.append(",ARTICLE_PROVENANCE="+ARTICLE_PROVENANCE);
		sb.append(",ARTICLE_DETENTION="+ARTICLE_DETENTION);
		sb.append(",ARTICLE_TYPE="+ARTICLE_TYPE);
		sb.append(",ARTICLE_QRTL="+ARTICLE_QRTL);
		sb.append(",ARTICLE_MARQ="+ARTICLE_MARQ);
		sb.append(",CONTENANCE="+CONTENANCE);
		sb.append(",PA="+PA);
		sb.append(",PV="+PV);
		sb.append(",DEBUT_STOCK="+DEBUT_STOCK);
		sb.append(",FIN_STOCK="+FIN_STOCK);
		sb.append(",RUPT_LONG_DUREE="+RUPT_LONG_DUREE);
		sb.append(",ID_FOURNISSEUR="+ID_FOURNISSEUR);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",RAYON="+RAYON);
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_GROUPE_PRODUIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_GROUPE_PRODUIT);
            			}
            		
        			sb.append("|");
        		
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(EAN13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN13);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(DT_CREATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_CREATION);
            			}
            		
        			sb.append("|");
        		
        				if(SAISONNALITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAISONNALITE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_DETENTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_DETENTION);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_QRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_QRTL);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_MARQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_MARQ);
            			}
            		
        			sb.append("|");
        		
        				if(CONTENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(PA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PA);
            			}
            		
        			sb.append("|");
        		
        				if(PV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PV);
            			}
            		
        			sb.append("|");
        		
        				if(DEBUT_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEBUT_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(FIN_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIN_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(RUPT_LONG_DUREE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RUPT_LONG_DUREE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNITE_BESOIN);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out9Struct other) {

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

public static class out8Struct implements routines.system.IPersistableRow<out8Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_GROUPE_PRODUIT;

				public String getID_GROUPE_PRODUIT () {
					return this.ID_GROUPE_PRODUIT;
				}
				
			    public String ID_ARTICLE_INR;

				public String getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public String ID_ARTICLE_INV;

				public String getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public String ID_ARTICLE_CEXUV;

				public String getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String EAN13;

				public String getEAN13 () {
					return this.EAN13;
				}
				
			    public String ARTICLE_COURT;

				public String getARTICLE_COURT () {
					return this.ARTICLE_COURT;
				}
				
			    public String ARTICLE_LONG;

				public String getARTICLE_LONG () {
					return this.ARTICLE_LONG;
				}
				
			    public String ID_ETAT;

				public String getID_ETAT () {
					return this.ID_ETAT;
				}
				
			    public String ETAT_COURT;

				public String getETAT_COURT () {
					return this.ETAT_COURT;
				}
				
			    public String ETAT_LONG;

				public String getETAT_LONG () {
					return this.ETAT_LONG;
				}
				
			    public String DT_CREATION;

				public String getDT_CREATION () {
					return this.DT_CREATION;
				}
				
			    public String SAISONNALITE;

				public String getSAISONNALITE () {
					return this.SAISONNALITE;
				}
				
			    public String ARTICLE_PROVENANCE;

				public String getARTICLE_PROVENANCE () {
					return this.ARTICLE_PROVENANCE;
				}
				
			    public String ARTICLE_DETENTION;

				public String getARTICLE_DETENTION () {
					return this.ARTICLE_DETENTION;
				}
				
			    public String ARTICLE_TYPE;

				public String getARTICLE_TYPE () {
					return this.ARTICLE_TYPE;
				}
				
			    public String ARTICLE_QRTL;

				public String getARTICLE_QRTL () {
					return this.ARTICLE_QRTL;
				}
				
			    public String ARTICLE_MARQ;

				public String getARTICLE_MARQ () {
					return this.ARTICLE_MARQ;
				}
				
			    public String CONTENANCE;

				public String getCONTENANCE () {
					return this.CONTENANCE;
				}
				
			    public String PA;

				public String getPA () {
					return this.PA;
				}
				
			    public String PV;

				public String getPV () {
					return this.PV;
				}
				
			    public String DEBUT_STOCK;

				public String getDEBUT_STOCK () {
					return this.DEBUT_STOCK;
				}
				
			    public String FIN_STOCK;

				public String getFIN_STOCK () {
					return this.FIN_STOCK;
				}
				
			    public String RUPT_LONG_DUREE;

				public String getRUPT_LONG_DUREE () {
					return this.RUPT_LONG_DUREE;
				}
				
			    public String ID_FOURNISSEUR;

				public String getID_FOURNISSEUR () {
					return this.ID_FOURNISSEUR;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_GROUPE_PRODUIT="+ID_GROUPE_PRODUIT);
		sb.append(",ID_ARTICLE_INR="+ID_ARTICLE_INR);
		sb.append(",ID_ARTICLE_INV="+ID_ARTICLE_INV);
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_CEXUV="+ID_ARTICLE_CEXUV);
		sb.append(",EAN13="+EAN13);
		sb.append(",ARTICLE_COURT="+ARTICLE_COURT);
		sb.append(",ARTICLE_LONG="+ARTICLE_LONG);
		sb.append(",ID_ETAT="+ID_ETAT);
		sb.append(",ETAT_COURT="+ETAT_COURT);
		sb.append(",ETAT_LONG="+ETAT_LONG);
		sb.append(",DT_CREATION="+DT_CREATION);
		sb.append(",SAISONNALITE="+SAISONNALITE);
		sb.append(",ARTICLE_PROVENANCE="+ARTICLE_PROVENANCE);
		sb.append(",ARTICLE_DETENTION="+ARTICLE_DETENTION);
		sb.append(",ARTICLE_TYPE="+ARTICLE_TYPE);
		sb.append(",ARTICLE_QRTL="+ARTICLE_QRTL);
		sb.append(",ARTICLE_MARQ="+ARTICLE_MARQ);
		sb.append(",CONTENANCE="+CONTENANCE);
		sb.append(",PA="+PA);
		sb.append(",PV="+PV);
		sb.append(",DEBUT_STOCK="+DEBUT_STOCK);
		sb.append(",FIN_STOCK="+FIN_STOCK);
		sb.append(",RUPT_LONG_DUREE="+RUPT_LONG_DUREE);
		sb.append(",ID_FOURNISSEUR="+ID_FOURNISSEUR);
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_GROUPE_PRODUIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_GROUPE_PRODUIT);
            			}
            		
        			sb.append("|");
        		
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(EAN13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN13);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(DT_CREATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_CREATION);
            			}
            		
        			sb.append("|");
        		
        				if(SAISONNALITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAISONNALITE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_DETENTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_DETENTION);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_QRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_QRTL);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_MARQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_MARQ);
            			}
            		
        			sb.append("|");
        		
        				if(CONTENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(PA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PA);
            			}
            		
        			sb.append("|");
        		
        				if(PV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PV);
            			}
            		
        			sb.append("|");
        		
        				if(DEBUT_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEBUT_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(FIN_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIN_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(RUPT_LONG_DUREE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RUPT_LONG_DUREE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(out8Struct other) {

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

public static class row15Struct implements routines.system.IPersistableRow<row15Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_GROUPE_PRODUIT;

				public String getID_GROUPE_PRODUIT () {
					return this.ID_GROUPE_PRODUIT;
				}
				
			    public String ID_ARTICLE_INR;

				public String getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public String ID_ARTICLE_INV;

				public String getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public String ID_ARTICLE_CEXUV;

				public String getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String EAN13;

				public String getEAN13 () {
					return this.EAN13;
				}
				
			    public String ARTICLE_COURT;

				public String getARTICLE_COURT () {
					return this.ARTICLE_COURT;
				}
				
			    public String ARTICLE_LONG;

				public String getARTICLE_LONG () {
					return this.ARTICLE_LONG;
				}
				
			    public String ID_ETAT;

				public String getID_ETAT () {
					return this.ID_ETAT;
				}
				
			    public String ETAT_COURT;

				public String getETAT_COURT () {
					return this.ETAT_COURT;
				}
				
			    public String ETAT_LONG;

				public String getETAT_LONG () {
					return this.ETAT_LONG;
				}
				
			    public String DT_CREATION;

				public String getDT_CREATION () {
					return this.DT_CREATION;
				}
				
			    public String SAISONNALITE;

				public String getSAISONNALITE () {
					return this.SAISONNALITE;
				}
				
			    public String ARTICLE_PROVENANCE;

				public String getARTICLE_PROVENANCE () {
					return this.ARTICLE_PROVENANCE;
				}
				
			    public String ARTICLE_DETENTION;

				public String getARTICLE_DETENTION () {
					return this.ARTICLE_DETENTION;
				}
				
			    public String ARTICLE_TYPE;

				public String getARTICLE_TYPE () {
					return this.ARTICLE_TYPE;
				}
				
			    public String ARTICLE_QRTL;

				public String getARTICLE_QRTL () {
					return this.ARTICLE_QRTL;
				}
				
			    public String ARTICLE_MARQ;

				public String getARTICLE_MARQ () {
					return this.ARTICLE_MARQ;
				}
				
			    public String CONTENANCE;

				public String getCONTENANCE () {
					return this.CONTENANCE;
				}
				
			    public String PA;

				public String getPA () {
					return this.PA;
				}
				
			    public String PV;

				public String getPV () {
					return this.PV;
				}
				
			    public String DEBUT_STOCK;

				public String getDEBUT_STOCK () {
					return this.DEBUT_STOCK;
				}
				
			    public String FIN_STOCK;

				public String getFIN_STOCK () {
					return this.FIN_STOCK;
				}
				
			    public String RUPT_LONG_DUREE;

				public String getRUPT_LONG_DUREE () {
					return this.RUPT_LONG_DUREE;
				}
				
			    public String ID_FOURNISSEUR;

				public String getID_FOURNISSEUR () {
					return this.ID_FOURNISSEUR;
				}
				
			    public String ID_DEPARTEMENT;

				public String getID_DEPARTEMENT () {
					return this.ID_DEPARTEMENT;
				}
				
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				
			    public String ID_FAMILLE;

				public String getID_FAMILLE () {
					return this.ID_FAMILLE;
				}
				
			    public String ID_SFAMILLE;

				public String getID_SFAMILLE () {
					return this.ID_SFAMILLE;
				}
				
			    public String ID_SSFAMILLE;

				public String getID_SSFAMILLE () {
					return this.ID_SSFAMILLE;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_GROUPE_PRODUIT="+ID_GROUPE_PRODUIT);
		sb.append(",ID_ARTICLE_INR="+ID_ARTICLE_INR);
		sb.append(",ID_ARTICLE_INV="+ID_ARTICLE_INV);
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_CEXUV="+ID_ARTICLE_CEXUV);
		sb.append(",EAN13="+EAN13);
		sb.append(",ARTICLE_COURT="+ARTICLE_COURT);
		sb.append(",ARTICLE_LONG="+ARTICLE_LONG);
		sb.append(",ID_ETAT="+ID_ETAT);
		sb.append(",ETAT_COURT="+ETAT_COURT);
		sb.append(",ETAT_LONG="+ETAT_LONG);
		sb.append(",DT_CREATION="+DT_CREATION);
		sb.append(",SAISONNALITE="+SAISONNALITE);
		sb.append(",ARTICLE_PROVENANCE="+ARTICLE_PROVENANCE);
		sb.append(",ARTICLE_DETENTION="+ARTICLE_DETENTION);
		sb.append(",ARTICLE_TYPE="+ARTICLE_TYPE);
		sb.append(",ARTICLE_QRTL="+ARTICLE_QRTL);
		sb.append(",ARTICLE_MARQ="+ARTICLE_MARQ);
		sb.append(",CONTENANCE="+CONTENANCE);
		sb.append(",PA="+PA);
		sb.append(",PV="+PV);
		sb.append(",DEBUT_STOCK="+DEBUT_STOCK);
		sb.append(",FIN_STOCK="+FIN_STOCK);
		sb.append(",RUPT_LONG_DUREE="+RUPT_LONG_DUREE);
		sb.append(",ID_FOURNISSEUR="+ID_FOURNISSEUR);
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_GROUPE_PRODUIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_GROUPE_PRODUIT);
            			}
            		
        			sb.append("|");
        		
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(EAN13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN13);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(DT_CREATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_CREATION);
            			}
            		
        			sb.append("|");
        		
        				if(SAISONNALITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAISONNALITE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_DETENTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_DETENTION);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_QRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_QRTL);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_MARQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_MARQ);
            			}
            		
        			sb.append("|");
        		
        				if(CONTENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(PA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PA);
            			}
            		
        			sb.append("|");
        		
        				if(PV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PV);
            			}
            		
        			sb.append("|");
        		
        				if(DEBUT_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEBUT_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(FIN_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIN_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(RUPT_LONG_DUREE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RUPT_LONG_DUREE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row15Struct other) {

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

public static class after_tDBInput_8Struct implements routines.system.IPersistableRow<after_tDBInput_8Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];

	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String ID_GROUPE_PRODUIT;

				public String getID_GROUPE_PRODUIT () {
					return this.ID_GROUPE_PRODUIT;
				}
				
			    public String ID_ARTICLE_INR;

				public String getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public String ID_ARTICLE_INV;

				public String getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public String ID_ARTICLE_CEXUV;

				public String getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String EAN13;

				public String getEAN13 () {
					return this.EAN13;
				}
				
			    public String ARTICLE_COURT;

				public String getARTICLE_COURT () {
					return this.ARTICLE_COURT;
				}
				
			    public String ARTICLE_LONG;

				public String getARTICLE_LONG () {
					return this.ARTICLE_LONG;
				}
				
			    public String ID_ETAT;

				public String getID_ETAT () {
					return this.ID_ETAT;
				}
				
			    public String ETAT_COURT;

				public String getETAT_COURT () {
					return this.ETAT_COURT;
				}
				
			    public String ETAT_LONG;

				public String getETAT_LONG () {
					return this.ETAT_LONG;
				}
				
			    public String DT_CREATION;

				public String getDT_CREATION () {
					return this.DT_CREATION;
				}
				
			    public String SAISONNALITE;

				public String getSAISONNALITE () {
					return this.SAISONNALITE;
				}
				
			    public String ARTICLE_PROVENANCE;

				public String getARTICLE_PROVENANCE () {
					return this.ARTICLE_PROVENANCE;
				}
				
			    public String ARTICLE_DETENTION;

				public String getARTICLE_DETENTION () {
					return this.ARTICLE_DETENTION;
				}
				
			    public String ARTICLE_TYPE;

				public String getARTICLE_TYPE () {
					return this.ARTICLE_TYPE;
				}
				
			    public String ARTICLE_QRTL;

				public String getARTICLE_QRTL () {
					return this.ARTICLE_QRTL;
				}
				
			    public String ARTICLE_MARQ;

				public String getARTICLE_MARQ () {
					return this.ARTICLE_MARQ;
				}
				
			    public String CONTENANCE;

				public String getCONTENANCE () {
					return this.CONTENANCE;
				}
				
			    public String PA;

				public String getPA () {
					return this.PA;
				}
				
			    public String PV;

				public String getPV () {
					return this.PV;
				}
				
			    public String DEBUT_STOCK;

				public String getDEBUT_STOCK () {
					return this.DEBUT_STOCK;
				}
				
			    public String FIN_STOCK;

				public String getFIN_STOCK () {
					return this.FIN_STOCK;
				}
				
			    public String RUPT_LONG_DUREE;

				public String getRUPT_LONG_DUREE () {
					return this.RUPT_LONG_DUREE;
				}
				
			    public String ID_FOURNISSEUR;

				public String getID_FOURNISSEUR () {
					return this.ID_FOURNISSEUR;
				}
				
			    public String ID_DEPARTEMENT;

				public String getID_DEPARTEMENT () {
					return this.ID_DEPARTEMENT;
				}
				
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				
			    public String ID_FAMILLE;

				public String getID_FAMILLE () {
					return this.ID_FAMILLE;
				}
				
			    public String ID_SFAMILLE;

				public String getID_SFAMILLE () {
					return this.ID_SFAMILLE;
				}
				
			    public String ID_SSFAMILLE;

				public String getID_SSFAMILLE () {
					return this.ID_SSFAMILLE;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
					this.ID_ARTICLE_INR = readString(dis);
					
					this.ID_ARTICLE_INV = readString(dis);
					
					this.ID_ARTICLE = readString(dis);
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.EAN13 = readString(dis);
					
					this.ARTICLE_COURT = readString(dis);
					
					this.ARTICLE_LONG = readString(dis);
					
					this.ID_ETAT = readString(dis);
					
					this.ETAT_COURT = readString(dis);
					
					this.ETAT_LONG = readString(dis);
					
					this.DT_CREATION = readString(dis);
					
					this.SAISONNALITE = readString(dis);
					
					this.ARTICLE_PROVENANCE = readString(dis);
					
					this.ARTICLE_DETENTION = readString(dis);
					
					this.ARTICLE_TYPE = readString(dis);
					
					this.ARTICLE_QRTL = readString(dis);
					
					this.ARTICLE_MARQ = readString(dis);
					
					this.CONTENANCE = readString(dis);
					
					this.PA = readString(dis);
					
					this.PV = readString(dis);
					
					this.DEBUT_STOCK = readString(dis);
					
					this.FIN_STOCK = readString(dis);
					
					this.RUPT_LONG_DUREE = readString(dis);
					
					this.ID_FOURNISSEUR = readString(dis);
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
					// String
				
						writeString(this.ID_GROUPE_PRODUIT,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INR,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_INV,dos);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.EAN13,dos);
					
					// String
				
						writeString(this.ARTICLE_COURT,dos);
					
					// String
				
						writeString(this.ARTICLE_LONG,dos);
					
					// String
				
						writeString(this.ID_ETAT,dos);
					
					// String
				
						writeString(this.ETAT_COURT,dos);
					
					// String
				
						writeString(this.ETAT_LONG,dos);
					
					// String
				
						writeString(this.DT_CREATION,dos);
					
					// String
				
						writeString(this.SAISONNALITE,dos);
					
					// String
				
						writeString(this.ARTICLE_PROVENANCE,dos);
					
					// String
				
						writeString(this.ARTICLE_DETENTION,dos);
					
					// String
				
						writeString(this.ARTICLE_TYPE,dos);
					
					// String
				
						writeString(this.ARTICLE_QRTL,dos);
					
					// String
				
						writeString(this.ARTICLE_MARQ,dos);
					
					// String
				
						writeString(this.CONTENANCE,dos);
					
					// String
				
						writeString(this.PA,dos);
					
					// String
				
						writeString(this.PV,dos);
					
					// String
				
						writeString(this.DEBUT_STOCK,dos);
					
					// String
				
						writeString(this.FIN_STOCK,dos);
					
					// String
				
						writeString(this.RUPT_LONG_DUREE,dos);
					
					// String
				
						writeString(this.ID_FOURNISSEUR,dos);
					
					// String
				
						writeString(this.ID_DEPARTEMENT,dos);
					
					// String
				
						writeString(this.ID_RAYON,dos);
					
					// String
				
						writeString(this.ID_FAMILLE,dos);
					
					// String
				
						writeString(this.ID_SFAMILLE,dos);
					
					// String
				
						writeString(this.ID_SSFAMILLE,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",ID_GROUPE_PRODUIT="+ID_GROUPE_PRODUIT);
		sb.append(",ID_ARTICLE_INR="+ID_ARTICLE_INR);
		sb.append(",ID_ARTICLE_INV="+ID_ARTICLE_INV);
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_CEXUV="+ID_ARTICLE_CEXUV);
		sb.append(",EAN13="+EAN13);
		sb.append(",ARTICLE_COURT="+ARTICLE_COURT);
		sb.append(",ARTICLE_LONG="+ARTICLE_LONG);
		sb.append(",ID_ETAT="+ID_ETAT);
		sb.append(",ETAT_COURT="+ETAT_COURT);
		sb.append(",ETAT_LONG="+ETAT_LONG);
		sb.append(",DT_CREATION="+DT_CREATION);
		sb.append(",SAISONNALITE="+SAISONNALITE);
		sb.append(",ARTICLE_PROVENANCE="+ARTICLE_PROVENANCE);
		sb.append(",ARTICLE_DETENTION="+ARTICLE_DETENTION);
		sb.append(",ARTICLE_TYPE="+ARTICLE_TYPE);
		sb.append(",ARTICLE_QRTL="+ARTICLE_QRTL);
		sb.append(",ARTICLE_MARQ="+ARTICLE_MARQ);
		sb.append(",CONTENANCE="+CONTENANCE);
		sb.append(",PA="+PA);
		sb.append(",PV="+PV);
		sb.append(",DEBUT_STOCK="+DEBUT_STOCK);
		sb.append(",FIN_STOCK="+FIN_STOCK);
		sb.append(",RUPT_LONG_DUREE="+RUPT_LONG_DUREE);
		sb.append(",ID_FOURNISSEUR="+ID_FOURNISSEUR);
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_GROUPE_PRODUIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_GROUPE_PRODUIT);
            			}
            		
        			sb.append("|");
        		
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(EAN13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN13);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(DT_CREATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_CREATION);
            			}
            		
        			sb.append("|");
        		
        				if(SAISONNALITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAISONNALITE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_DETENTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_DETENTION);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_QRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_QRTL);
            			}
            		
        			sb.append("|");
        		
        				if(ARTICLE_MARQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ARTICLE_MARQ);
            			}
            		
        			sb.append("|");
        		
        				if(CONTENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(PA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PA);
            			}
            		
        			sb.append("|");
        		
        				if(PV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PV);
            			}
            		
        			sb.append("|");
        		
        				if(DEBUT_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEBUT_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(FIN_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIN_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(RUPT_LONG_DUREE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RUPT_LONG_DUREE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tDBInput_8Struct other) {

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
public void tDBInput_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_8_SUBPROCESS_STATE", 0);

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


		tDBInput_9Process(globalMap);
		tDBInput_10Process(globalMap);
		tDBInput_11Process(globalMap);
		tDBInput_12Process(globalMap);
		tDBInput_13Process(globalMap);
		tDBInput_14Process(globalMap);

		row15Struct row15 = new row15Struct();
out8Struct out8 = new out8Struct();
out9Struct out9 = new out9Struct();






	
	/**
	 * [tDBOutput_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_8", false);
		start_Hash.put("tDBOutput_8", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_8";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out9");
			
		int tos_count_tDBOutput_8 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_8{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_8 = new StringBuilder();
                    log4jParamters_tDBOutput_8.append("Parameters:");
                            log4jParamters_tDBOutput_8.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("TABLESCHEMA" + " = " + "\"ODS\"");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:Wj/6MjZY0zM1nJS5lMHyRrRSJPdMd3+nrLPpVCFyJ5oCR5tZ").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("TABLE" + " = " + "\"ODS_STRUCTURE_MARCHANDISE\"");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("TABLE_ACTION" + " = " + "TRUNCATE");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("COMMIT_EVERY" + " = " + "10000");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("CONVERT_COLUMN_TABLE_TO_UPPERCASE" + " = " + "true");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("CONTAIN_BLOB_FROM_OTHER_DB" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("USE_BATCH_SIZE" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("USE_TIMESTAMP_FOR_DATE_TYPE" + " = " + "true");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("TRIM_CHAR" + " = " + "true");
                        log4jParamters_tDBOutput_8.append(" | ");
                            log4jParamters_tDBOutput_8.append("UNIFIED_COMPONENTS" + " = " + "tOracleOutput");
                        log4jParamters_tDBOutput_8.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + (log4jParamters_tDBOutput_8) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_8().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_8", "Oracle_ODS_STRUCTURE_MARCHANDISE", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






    
    int nb_line_tDBOutput_8 = 0;
    int nb_line_update_tDBOutput_8 = 0;
    int nb_line_inserted_tDBOutput_8 = 0;
    int nb_line_deleted_tDBOutput_8 = 0;
    int nb_line_rejected_tDBOutput_8 = 0;

    int tmp_batchUpdateCount_tDBOutput_8 = 0;

    int deletedCount_tDBOutput_8=0;
    int updatedCount_tDBOutput_8=0;
    int insertedCount_tDBOutput_8=0;
    int rowsToCommitCount_tDBOutput_8=0;
    int rejectedCount_tDBOutput_8=0;

    boolean whetherReject_tDBOutput_8 = false;

    java.sql.Connection conn_tDBOutput_8 = null;

    //optional table
    String dbschema_tDBOutput_8 = null;
    String tableName_tDBOutput_8 = null;
                    String driverClass_tDBOutput_8 = "oracle.jdbc.OracleDriver";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Driver ClassName: ")  + (driverClass_tDBOutput_8)  + (".") );

                java.lang.Class.forName(driverClass_tDBOutput_8);
                String url_tDBOutput_8 = null;
                    url_tDBOutput_8 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";
                String dbUser_tDBOutput_8 = "ods";
 
	final String decryptedPassword_tDBOutput_8 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Wm7flHF5Tqelidl3jvw/Ao9rzaAKoeiCyEMHtWcmlU7HrrOd");

                String dbPwd_tDBOutput_8 = decryptedPassword_tDBOutput_8;
                dbschema_tDBOutput_8 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection attempts to '")  + (url_tDBOutput_8)  + ("' with the username '")  + (dbUser_tDBOutput_8)  + ("'.") );

                    conn_tDBOutput_8 = java.sql.DriverManager.getConnection(url_tDBOutput_8, dbUser_tDBOutput_8, dbPwd_tDBOutput_8);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection to '")  + (url_tDBOutput_8)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_8", conn_tDBOutput_8);
            conn_tDBOutput_8.setAutoCommit(false);
            int commitEvery_tDBOutput_8 = 10000;
            int commitCounter_tDBOutput_8 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_8.getAutoCommit())  + ("'.") );
        int count_tDBOutput_8=0;

        if(dbschema_tDBOutput_8 == null || dbschema_tDBOutput_8.trim().length() == 0) {
            tableName_tDBOutput_8 = ("ODS_STRUCTURE_MARCHANDISE").toUpperCase();
        } else {
            tableName_tDBOutput_8 = dbschema_tDBOutput_8 + "." + ("ODS_STRUCTURE_MARCHANDISE").toUpperCase();
        }
            int rsTruncCountNumber_tDBOutput_8 = 0;
            try(java.sql.Statement stmtTruncCount_tDBOutput_8 = conn_tDBOutput_8.createStatement()) {
                try (java.sql.ResultSet rsTruncCount_tDBOutput_8 = stmtTruncCount_tDBOutput_8.executeQuery("SELECT COUNT(1) FROM " + tableName_tDBOutput_8 + "")) {
                    if(rsTruncCount_tDBOutput_8.next()) {
                        rsTruncCountNumber_tDBOutput_8 = rsTruncCount_tDBOutput_8.getInt(1);
                    }
                }
            }
            try (java.sql.Statement stmtTrunc_tDBOutput_8 = conn_tDBOutput_8.createStatement()) {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Truncating")  + (" table '")  + (tableName_tDBOutput_8)  + ("'.") );
                stmtTrunc_tDBOutput_8.executeUpdate("TRUNCATE TABLE " + tableName_tDBOutput_8 + "");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Truncate")  + (" table '")  + (tableName_tDBOutput_8)  + ("' has succeeded.") );
                deletedCount_tDBOutput_8 += rsTruncCountNumber_tDBOutput_8;
            }
                String insert_tDBOutput_8 = "INSERT INTO " + tableName_tDBOutput_8 + " (ID_DEPARTEMENT_INT,ID_RAYON_INT,ID_FAMILLE_INT,ID_SSFAMILLE_INT,ID_SFAMILLE_INT,ID_UNITE_BESOIN_INT,ID_GROUPE_PRODUIT,ID_ARTICLE_INR,ID_ARTICLE_INV,ID_ARTICLE,ID_ARTICLE_CEXUV,EAN13,ARTICLE_COURT,ARTICLE_LONG,ID_ETAT,ETAT_COURT,ETAT_LONG,DT_CREATION,SAISONNALITE,ARTICLE_PROVENANCE,ARTICLE_DETENTION,ARTICLE_TYPE,ARTICLE_QRTL,ARTICLE_MARQ,CONTENANCE,PA,PV,DEBUT_STOCK,FIN_STOCK,RUPT_LONG_DUREE,ID_FOURNISSEUR,UNITE_BESOIN,ID_UNITE_BESOIN,ID_SSFAMILLE,SSFAMILLE,ID_SFAMILLE,SFAMILLE,ID_FAMILLE,FAMILLE,ID_RAYON,RAYON,ID_DEPARTEMENT,DEPARTEMENT,ID_ARTICLE_CEXR) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_8 = conn_tDBOutput_8.prepareStatement(insert_tDBOutput_8);
                        resourceMap.put("pstmt_tDBOutput_8", pstmt_tDBOutput_8);





 



/**
 * [tDBOutput_8 begin ] stop
 */



	
	/**
	 * [tMap_9 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_9", false);
		start_Hash.put("tMap_9", System.currentTimeMillis());
		
	
	currentComponent="tMap_9";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out8");
			
		int tos_count_tMap_9 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_9 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_9{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_9 = new StringBuilder();
                    log4jParamters_tMap_9.append("Parameters:");
                            log4jParamters_tMap_9.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_9.append(" | ");
                            log4jParamters_tMap_9.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_9.append(" | ");
                            log4jParamters_tMap_9.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_9.append(" | ");
                            log4jParamters_tMap_9.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_9.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_9 - "  + (log4jParamters_tMap_9) );
                    } 
                } 
            new BytesLimit65535_tMap_9().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_9", "tMap_9", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_out8_tMap_9 = 0;
		
		int count_row16_tMap_9 = 0;
		
		int count_row17_tMap_9 = 0;
		
		int count_row18_tMap_9 = 0;
		
		int count_row19_tMap_9 = 0;
		
		int count_row20_tMap_9 = 0;
		
		int count_row21_tMap_9 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row16Struct> tHash_Lookup_row16 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row16Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row16Struct>) 
					globalMap.get( "tHash_Lookup_row16" ))
					;					
					
	

row16Struct row16HashKey = new row16Struct();
row16Struct row16Default = new row16Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row17Struct> tHash_Lookup_row17 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row17Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row17Struct>) 
					globalMap.get( "tHash_Lookup_row17" ))
					;					
					
	

row17Struct row17HashKey = new row17Struct();
row17Struct row17Default = new row17Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row18Struct> tHash_Lookup_row18 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row18Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row18Struct>) 
					globalMap.get( "tHash_Lookup_row18" ))
					;					
					
	

row18Struct row18HashKey = new row18Struct();
row18Struct row18Default = new row18Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row19Struct> tHash_Lookup_row19 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row19Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row19Struct>) 
					globalMap.get( "tHash_Lookup_row19" ))
					;					
					
	

row19Struct row19HashKey = new row19Struct();
row19Struct row19Default = new row19Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row20Struct> tHash_Lookup_row20 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row20Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row20Struct>) 
					globalMap.get( "tHash_Lookup_row20" ))
					;					
					
	

row20Struct row20HashKey = new row20Struct();
row20Struct row20Default = new row20Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row21Struct> tHash_Lookup_row21 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row21Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row21Struct>) 
					globalMap.get( "tHash_Lookup_row21" ))
					;					
					
	

row21Struct row21HashKey = new row21Struct();
row21Struct row21Default = new row21Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_9__Struct  {
}
Var__tMap_9__Struct Var__tMap_9 = new Var__tMap_9__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out9_tMap_9 = 0;
				
out9Struct out9_tmp = new out9Struct();
// ###############################

        
        



        









 



/**
 * [tMap_9 begin ] stop
 */



	
	/**
	 * [tMap_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_8", false);
		start_Hash.put("tMap_8", System.currentTimeMillis());
		
	
	currentComponent="tMap_8";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row15");
			
		int tos_count_tMap_8 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_8 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_8{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_8 = new StringBuilder();
                    log4jParamters_tMap_8.append("Parameters:");
                            log4jParamters_tMap_8.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_8.append(" | ");
                            log4jParamters_tMap_8.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_8.append(" | ");
                            log4jParamters_tMap_8.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_8.append(" | ");
                            log4jParamters_tMap_8.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_8.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_8 - "  + (log4jParamters_tMap_8) );
                    } 
                } 
            new BytesLimit65535_tMap_8().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_8", "tMap_8", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row15_tMap_8 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_8__Struct  {
}
Var__tMap_8__Struct Var__tMap_8 = new Var__tMap_8__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out8_tMap_8 = 0;
				
out8Struct out8_tmp = new out8Struct();
// ###############################

        
        



        









 



/**
 * [tMap_8 begin ] stop
 */



	
	/**
	 * [tDBInput_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_8", false);
		start_Hash.put("tDBInput_8", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_8";

	
		int tos_count_tDBInput_8 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_8 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_8{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_8 = new StringBuilder();
                    log4jParamters_tDBInput_8.append("Parameters:");
                            log4jParamters_tDBInput_8.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:38UayE4+si0ORQFHOFTm6kgqfDOfP0YFVWhx7YboODLgKbmo").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("QUERY" + " = " + "\"SELECT *FROM ODS_STRUCTURE_MARCHANDISE_TMP\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_UNITE_BESOIN_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_GROUPE_PRODUIT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_CEXUV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EAN13")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_COURT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_LONG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ETAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT_COURT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT_LONG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DT_CREATION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SAISONNALITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_PROVENANCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_DETENTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_QRTL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ARTICLE_MARQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONTENANCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEBUT_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FIN_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RUPT_LONG_DUREE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_CEXR")+"}]");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_8.append(" | ");
                            log4jParamters_tDBInput_8.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_8.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_8 - "  + (log4jParamters_tDBInput_8) );
                    } 
                } 
            new BytesLimit65535_tDBInput_8().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_8", "STRUCTURE_MARCHANDISE_TMP", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_8 = 0;
		    java.sql.Connection conn_tDBInput_8 = null;
				String driverClass_tDBInput_8 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_8);
				
			String url_tDBInput_8 = null;
				url_tDBInput_8 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_8 = "ods";

				

				 
	final String decryptedPassword_tDBInput_8 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:oCxMPiIgIZwNtc5zLVkwxyf76c2uABeXnTyuE2w0XZLKIqmy");

				String dbPwd_tDBInput_8 = decryptedPassword_tDBInput_8;

				
	    		log.debug("tDBInput_8 - Driver ClassName: "+driverClass_tDBInput_8+".");
			
	    		log.debug("tDBInput_8 - Connection attempt to '" + url_tDBInput_8 + "' with the username '" + dbUser_tDBInput_8 + "'.");
			
					conn_tDBInput_8 = java.sql.DriverManager.getConnection(url_tDBInput_8,dbUser_tDBInput_8,dbPwd_tDBInput_8);
	    		log.debug("tDBInput_8 - Connection to '" + url_tDBInput_8 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_8 = conn_tDBInput_8.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_8 = stmtGetTZ_tDBInput_8.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_8 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_8.next()) {
					sessionTimezone_tDBInput_8 = rsGetTZ_tDBInput_8.getString(1);
				}
                                if (!(conn_tDBInput_8 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_8.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_8.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_8.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_8);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_8).setSessionTimeZone(sessionTimezone_tDBInput_8);
                                }
		    
			java.sql.Statement stmt_tDBInput_8 = conn_tDBInput_8.createStatement();

		    String dbquery_tDBInput_8 = "SELECT *FROM ODS_STRUCTURE_MARCHANDISE_TMP";
		    
	    		log.debug("tDBInput_8 - Executing the query: '" + dbquery_tDBInput_8 + "'.");
			

            	globalMap.put("tDBInput_8_QUERY",dbquery_tDBInput_8);
		    java.sql.ResultSet rs_tDBInput_8 = null;

		    try {
		    	rs_tDBInput_8 = stmt_tDBInput_8.executeQuery(dbquery_tDBInput_8);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_8 = rs_tDBInput_8.getMetaData();
		    	int colQtyInRs_tDBInput_8 = rsmd_tDBInput_8.getColumnCount();

		    String tmpContent_tDBInput_8 = null;
		    
		    
		    	log.debug("tDBInput_8 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_8.next()) {
		        nb_line_tDBInput_8++;
		        
							if(colQtyInRs_tDBInput_8 < 1) {
								row15.ID_DEPARTEMENT_INT = null;
							} else {
		                          
					if(rs_tDBInput_8.getObject(1) != null) {
						row15.ID_DEPARTEMENT_INT = rs_tDBInput_8.getBigDecimal(1);
					} else {
				
						row15.ID_DEPARTEMENT_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_8 < 2) {
								row15.ID_RAYON_INT = null;
							} else {
		                          
					if(rs_tDBInput_8.getObject(2) != null) {
						row15.ID_RAYON_INT = rs_tDBInput_8.getBigDecimal(2);
					} else {
				
						row15.ID_RAYON_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_8 < 3) {
								row15.ID_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_8.getObject(3) != null) {
						row15.ID_FAMILLE_INT = rs_tDBInput_8.getBigDecimal(3);
					} else {
				
						row15.ID_FAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_8 < 4) {
								row15.ID_SSFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_8.getObject(4) != null) {
						row15.ID_SSFAMILLE_INT = rs_tDBInput_8.getBigDecimal(4);
					} else {
				
						row15.ID_SSFAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_8 < 5) {
								row15.ID_SFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_8.getObject(5) != null) {
						row15.ID_SFAMILLE_INT = rs_tDBInput_8.getBigDecimal(5);
					} else {
				
						row15.ID_SFAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_8 < 6) {
								row15.ID_UNITE_BESOIN_INT = null;
							} else {
		                          
					if(rs_tDBInput_8.getObject(6) != null) {
						row15.ID_UNITE_BESOIN_INT = rs_tDBInput_8.getBigDecimal(6);
					} else {
				
						row15.ID_UNITE_BESOIN_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_8 < 7) {
								row15.ID_GROUPE_PRODUIT = null;
							} else {
	                         		
        	row15.ID_GROUPE_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_8, 7, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 8) {
								row15.ID_ARTICLE_INR = null;
							} else {
	                         		
        	row15.ID_ARTICLE_INR = routines.system.JDBCUtil.getString(rs_tDBInput_8, 8, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 9) {
								row15.ID_ARTICLE_INV = null;
							} else {
	                         		
        	row15.ID_ARTICLE_INV = routines.system.JDBCUtil.getString(rs_tDBInput_8, 9, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 10) {
								row15.ID_ARTICLE = null;
							} else {
	                         		
        	row15.ID_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 10, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 11) {
								row15.ID_ARTICLE_CEXUV = null;
							} else {
	                         		
        	row15.ID_ARTICLE_CEXUV = routines.system.JDBCUtil.getString(rs_tDBInput_8, 11, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 12) {
								row15.EAN13 = null;
							} else {
	                         		
        	row15.EAN13 = routines.system.JDBCUtil.getString(rs_tDBInput_8, 12, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 13) {
								row15.ARTICLE_COURT = null;
							} else {
	                         		
        	row15.ARTICLE_COURT = routines.system.JDBCUtil.getString(rs_tDBInput_8, 13, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 14) {
								row15.ARTICLE_LONG = null;
							} else {
	                         		
        	row15.ARTICLE_LONG = routines.system.JDBCUtil.getString(rs_tDBInput_8, 14, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 15) {
								row15.ID_ETAT = null;
							} else {
	                         		
        	row15.ID_ETAT = routines.system.JDBCUtil.getString(rs_tDBInput_8, 15, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 16) {
								row15.ETAT_COURT = null;
							} else {
	                         		
        	row15.ETAT_COURT = routines.system.JDBCUtil.getString(rs_tDBInput_8, 16, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 17) {
								row15.ETAT_LONG = null;
							} else {
	                         		
        	row15.ETAT_LONG = routines.system.JDBCUtil.getString(rs_tDBInput_8, 17, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 18) {
								row15.DT_CREATION = null;
							} else {
	                         		
        	row15.DT_CREATION = routines.system.JDBCUtil.getString(rs_tDBInput_8, 18, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 19) {
								row15.SAISONNALITE = null;
							} else {
	                         		
        	row15.SAISONNALITE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 19, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 20) {
								row15.ARTICLE_PROVENANCE = null;
							} else {
	                         		
        	row15.ARTICLE_PROVENANCE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 20, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 21) {
								row15.ARTICLE_DETENTION = null;
							} else {
	                         		
        	row15.ARTICLE_DETENTION = routines.system.JDBCUtil.getString(rs_tDBInput_8, 21, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 22) {
								row15.ARTICLE_TYPE = null;
							} else {
	                         		
        	row15.ARTICLE_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 22, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 23) {
								row15.ARTICLE_QRTL = null;
							} else {
	                         		
        	row15.ARTICLE_QRTL = routines.system.JDBCUtil.getString(rs_tDBInput_8, 23, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 24) {
								row15.ARTICLE_MARQ = null;
							} else {
	                         		
        	row15.ARTICLE_MARQ = routines.system.JDBCUtil.getString(rs_tDBInput_8, 24, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 25) {
								row15.CONTENANCE = null;
							} else {
	                         		
        	row15.CONTENANCE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 25, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 26) {
								row15.PA = null;
							} else {
	                         		
        	row15.PA = routines.system.JDBCUtil.getString(rs_tDBInput_8, 26, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 27) {
								row15.PV = null;
							} else {
	                         		
        	row15.PV = routines.system.JDBCUtil.getString(rs_tDBInput_8, 27, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 28) {
								row15.DEBUT_STOCK = null;
							} else {
	                         		
        	row15.DEBUT_STOCK = routines.system.JDBCUtil.getString(rs_tDBInput_8, 28, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 29) {
								row15.FIN_STOCK = null;
							} else {
	                         		
        	row15.FIN_STOCK = routines.system.JDBCUtil.getString(rs_tDBInput_8, 29, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 30) {
								row15.RUPT_LONG_DUREE = null;
							} else {
	                         		
        	row15.RUPT_LONG_DUREE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 30, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 31) {
								row15.ID_FOURNISSEUR = null;
							} else {
	                         		
        	row15.ID_FOURNISSEUR = routines.system.JDBCUtil.getString(rs_tDBInput_8, 31, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 32) {
								row15.ID_DEPARTEMENT = null;
							} else {
	                         		
        	row15.ID_DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_8, 32, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 33) {
								row15.ID_RAYON = null;
							} else {
	                         		
        	row15.ID_RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_8, 33, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 34) {
								row15.ID_FAMILLE = null;
							} else {
	                         		
        	row15.ID_FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 34, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 35) {
								row15.ID_SFAMILLE = null;
							} else {
	                         		
        	row15.ID_SFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 35, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 36) {
								row15.ID_SSFAMILLE = null;
							} else {
	                         		
        	row15.ID_SSFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_8, 36, false);
		                    }
							if(colQtyInRs_tDBInput_8 < 37) {
								row15.ID_ARTICLE_CEXR = null;
							} else {
	                         		
        	row15.ID_ARTICLE_CEXR = routines.system.JDBCUtil.getString(rs_tDBInput_8, 37, false);
		                    }
					
						log.debug("tDBInput_8 - Retrieving the record " + nb_line_tDBInput_8 + ".");
					




 



/**
 * [tDBInput_8 begin ] stop
 */
	
	/**
	 * [tDBInput_8 main ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 


	tos_count_tDBInput_8++;

/**
 * [tDBInput_8 main ] stop
 */
	
	/**
	 * [tDBInput_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 



/**
 * [tDBInput_8 process_data_begin ] stop
 */

	
	/**
	 * [tMap_8 main ] start
	 */

	

	
	
	currentComponent="tMap_8";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row15","tDBInput_8","STRUCTURE_MARCHANDISE_TMP","tOracleInput","tMap_8","tMap_8","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row15 - " + (row15==null? "": row15.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_8 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_8 = false;
		  boolean mainRowRejected_tMap_8 = false;
            				    								  
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_8__Struct Var = Var__tMap_8;// ###############################
        // ###############################
        // # Output tables

out8 = null;


// # Output table : 'out8'
count_out8_tMap_8++;

out8_tmp.ID_DEPARTEMENT_INT = row15.ID_DEPARTEMENT_INT ;
out8_tmp.ID_RAYON_INT = row15.ID_RAYON_INT ;
out8_tmp.ID_FAMILLE_INT = row15.ID_FAMILLE_INT ;
out8_tmp.ID_SSFAMILLE_INT = row15.ID_SSFAMILLE_INT ;
out8_tmp.ID_SFAMILLE_INT = row15.ID_SFAMILLE_INT ;
out8_tmp.ID_UNITE_BESOIN_INT = row15.ID_UNITE_BESOIN_INT ;
out8_tmp.ID_GROUPE_PRODUIT = row15.ID_GROUPE_PRODUIT ;
out8_tmp.ID_ARTICLE_INR = row15.ID_ARTICLE_INR ;
out8_tmp.ID_ARTICLE_INV = row15.ID_ARTICLE_INV ;
out8_tmp.ID_ARTICLE = row15.ID_ARTICLE ;
out8_tmp.ID_ARTICLE_CEXUV = row15.ID_ARTICLE_CEXUV ;
out8_tmp.EAN13 = row15.EAN13 ;
out8_tmp.ARTICLE_COURT = row15.ARTICLE_COURT ;
out8_tmp.ARTICLE_LONG = row15.ARTICLE_LONG ;
out8_tmp.ID_ETAT = row15.ID_ETAT ;
out8_tmp.ETAT_COURT = row15.ETAT_COURT ;
out8_tmp.ETAT_LONG = row15.ETAT_LONG ;
out8_tmp.DT_CREATION = row15.DT_CREATION ;
out8_tmp.SAISONNALITE = row15.SAISONNALITE ;
out8_tmp.ARTICLE_PROVENANCE = row15.ARTICLE_PROVENANCE ;
out8_tmp.ARTICLE_DETENTION = row15.ARTICLE_DETENTION ;
out8_tmp.ARTICLE_TYPE = row15.ARTICLE_TYPE ;
out8_tmp.ARTICLE_QRTL = row15.ARTICLE_QRTL ;
out8_tmp.ARTICLE_MARQ = row15.ARTICLE_MARQ ;
out8_tmp.CONTENANCE = row15.CONTENANCE ;
out8_tmp.PA = row15.PA ;
out8_tmp.PV = row15.PV ;
out8_tmp.DEBUT_STOCK = row15.DEBUT_STOCK ;
out8_tmp.FIN_STOCK = row15.FIN_STOCK ;
out8_tmp.RUPT_LONG_DUREE = row15.RUPT_LONG_DUREE ;
out8_tmp.ID_FOURNISSEUR = row15.ID_FOURNISSEUR ;
out8_tmp.ID_ARTICLE_CEXR = row15.ID_ARTICLE_CEXR ;
out8 = out8_tmp;
log.debug("tMap_8 - Outputting the record " + count_out8_tMap_8 + " of the output table 'out8'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_8 = false;










 


	tos_count_tMap_8++;

/**
 * [tMap_8 main ] stop
 */
	
	/**
	 * [tMap_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_8";

	

 



/**
 * [tMap_8 process_data_begin ] stop
 */
// Start of branch "out8"
if(out8 != null) { 



	
	/**
	 * [tMap_9 main ] start
	 */

	

	
	
	currentComponent="tMap_9";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out8","tMap_8","tMap_8","tMap","tMap_9","tMap_9","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out8 - " + (out8==null? "": out8.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_9 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_9 = false;
		  boolean mainRowRejected_tMap_9 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row16" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow16 = false;
       		  	    	
       		  	    	
 							row16Struct row16ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_9) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_9 = false;
								
                        		    		    row16HashKey.ID_UNITE_BESOIN_INT = out8.ID_UNITE_BESOIN_INT ;
                        		    		

								
		                        	row16HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row16.lookup( row16HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row16 != null && tHash_Lookup_row16.getCount(row16HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row16' and it contains more one result from keys :  row16.ID_UNITE_BESOIN_INT = '" + row16HashKey.ID_UNITE_BESOIN_INT + "'");
								} // G 071
							

							row16Struct row16 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row16Struct fromLookup_row16 = null;
							row16 = row16Default;
										 
							
								 
							
							
								if (tHash_Lookup_row16 !=null && tHash_Lookup_row16.hasNext()) { // G 099
								
							
								
								fromLookup_row16 = tHash_Lookup_row16.next();

							
							
								} // G 099
							
							

							if(fromLookup_row16 != null) {
								row16 = fromLookup_row16;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row17" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow17 = false;
       		  	    	
       		  	    	
 							row17Struct row17ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_9) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_9 = false;
								
                        		    		    row17HashKey.ID_SSFAMILLE_INT = out8.ID_SSFAMILLE_INT ;
                        		    		

								
		                        	row17HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row17.lookup( row17HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row17 != null && tHash_Lookup_row17.getCount(row17HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row17' and it contains more one result from keys :  row17.ID_SSFAMILLE_INT = '" + row17HashKey.ID_SSFAMILLE_INT + "'");
								} // G 071
							

							row17Struct row17 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row17Struct fromLookup_row17 = null;
							row17 = row17Default;
										 
							
								 
							
							
								if (tHash_Lookup_row17 !=null && tHash_Lookup_row17.hasNext()) { // G 099
								
							
								
								fromLookup_row17 = tHash_Lookup_row17.next();

							
							
								} // G 099
							
							

							if(fromLookup_row17 != null) {
								row17 = fromLookup_row17;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row18" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow18 = false;
       		  	    	
       		  	    	
 							row18Struct row18ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_9) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_9 = false;
								
                        		    		    row18HashKey.ID_SFAMILLE_INT = out8.ID_SFAMILLE_INT ;
                        		    		

								
		                        	row18HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row18.lookup( row18HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row18 != null && tHash_Lookup_row18.getCount(row18HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row18' and it contains more one result from keys :  row18.ID_SFAMILLE_INT = '" + row18HashKey.ID_SFAMILLE_INT + "'");
								} // G 071
							

							row18Struct row18 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row18Struct fromLookup_row18 = null;
							row18 = row18Default;
										 
							
								 
							
							
								if (tHash_Lookup_row18 !=null && tHash_Lookup_row18.hasNext()) { // G 099
								
							
								
								fromLookup_row18 = tHash_Lookup_row18.next();

							
							
								} // G 099
							
							

							if(fromLookup_row18 != null) {
								row18 = fromLookup_row18;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row19" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow19 = false;
       		  	    	
       		  	    	
 							row19Struct row19ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_9) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_9 = false;
								
                        		    		    row19HashKey.ID_FAMILLE_INT = out8.ID_FAMILLE_INT ;
                        		    		

								
		                        	row19HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row19.lookup( row19HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row19 != null && tHash_Lookup_row19.getCount(row19HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row19' and it contains more one result from keys :  row19.ID_FAMILLE_INT = '" + row19HashKey.ID_FAMILLE_INT + "'");
								} // G 071
							

							row19Struct row19 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row19Struct fromLookup_row19 = null;
							row19 = row19Default;
										 
							
								 
							
							
								if (tHash_Lookup_row19 !=null && tHash_Lookup_row19.hasNext()) { // G 099
								
							
								
								fromLookup_row19 = tHash_Lookup_row19.next();

							
							
								} // G 099
							
							

							if(fromLookup_row19 != null) {
								row19 = fromLookup_row19;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row20" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow20 = false;
       		  	    	
       		  	    	
 							row20Struct row20ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_9) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_9 = false;
								
                        		    		    row20HashKey.ID_RAYON_INT = out8.ID_RAYON_INT ;
                        		    		

								
		                        	row20HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row20.lookup( row20HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row20 != null && tHash_Lookup_row20.getCount(row20HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row20' and it contains more one result from keys :  row20.ID_RAYON_INT = '" + row20HashKey.ID_RAYON_INT + "'");
								} // G 071
							

							row20Struct row20 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row20Struct fromLookup_row20 = null;
							row20 = row20Default;
										 
							
								 
							
							
								if (tHash_Lookup_row20 !=null && tHash_Lookup_row20.hasNext()) { // G 099
								
							
								
								fromLookup_row20 = tHash_Lookup_row20.next();

							
							
								} // G 099
							
							

							if(fromLookup_row20 != null) {
								row20 = fromLookup_row20;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row21" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow21 = false;
       		  	    	
       		  	    	
 							row21Struct row21ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_9) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_9 = false;
								
                        		    		    row21HashKey.ID_DEPARTEMENT_INT = out8.ID_DEPARTEMENT_INT ;
                        		    		

								
		                        	row21HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row21.lookup( row21HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row21 != null && tHash_Lookup_row21.getCount(row21HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row21' and it contains more one result from keys :  row21.ID_DEPARTEMENT_INT = '" + row21HashKey.ID_DEPARTEMENT_INT + "'");
								} // G 071
							

							row21Struct row21 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row21Struct fromLookup_row21 = null;
							row21 = row21Default;
										 
							
								 
							
							
								if (tHash_Lookup_row21 !=null && tHash_Lookup_row21.hasNext()) { // G 099
								
							
								
								fromLookup_row21 = tHash_Lookup_row21.next();

							
							
								} // G 099
							
							

							if(fromLookup_row21 != null) {
								row21 = fromLookup_row21;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_9__Struct Var = Var__tMap_9;// ###############################
        // ###############################
        // # Output tables

out9 = null;


// # Output table : 'out9'
count_out9_tMap_9++;

out9_tmp.ID_DEPARTEMENT_INT = out8.ID_DEPARTEMENT_INT ;
out9_tmp.ID_RAYON_INT = out8.ID_RAYON_INT ;
out9_tmp.ID_FAMILLE_INT = out8.ID_FAMILLE_INT ;
out9_tmp.ID_SSFAMILLE_INT = out8.ID_SSFAMILLE_INT ;
out9_tmp.ID_SFAMILLE_INT = out8.ID_SFAMILLE_INT ;
out9_tmp.ID_UNITE_BESOIN_INT = out8.ID_UNITE_BESOIN_INT ;
out9_tmp.ID_GROUPE_PRODUIT = out8.ID_GROUPE_PRODUIT ;
out9_tmp.ID_ARTICLE_INR = out8.ID_ARTICLE_INR ;
out9_tmp.ID_ARTICLE_INV = out8.ID_ARTICLE_INV ;
out9_tmp.ID_ARTICLE = out8.ID_ARTICLE ;
out9_tmp.ID_ARTICLE_CEXUV = out8.ID_ARTICLE_CEXUV ;
out9_tmp.EAN13 = out8.EAN13 ;
out9_tmp.ARTICLE_COURT = out8.ARTICLE_COURT ;
out9_tmp.ARTICLE_LONG = out8.ARTICLE_LONG ;
out9_tmp.ID_ETAT = out8.ID_ETAT ;
out9_tmp.ETAT_COURT = out8.ETAT_COURT ;
out9_tmp.ETAT_LONG = out8.ETAT_LONG ;
out9_tmp.DT_CREATION = out8.DT_CREATION ;
out9_tmp.SAISONNALITE = out8.SAISONNALITE ;
out9_tmp.ARTICLE_PROVENANCE = out8.ARTICLE_PROVENANCE ;
out9_tmp.ARTICLE_DETENTION = out8.ARTICLE_DETENTION ;
out9_tmp.ARTICLE_TYPE = out8.ARTICLE_TYPE ;
out9_tmp.ARTICLE_QRTL = out8.ARTICLE_QRTL ;
out9_tmp.ARTICLE_MARQ = out8.ARTICLE_MARQ ;
out9_tmp.CONTENANCE = out8.CONTENANCE ;
out9_tmp.PA = out8.PA ;
out9_tmp.PV = out8.PV ;
out9_tmp.DEBUT_STOCK = out8.DEBUT_STOCK ;
out9_tmp.FIN_STOCK = out8.FIN_STOCK ;
out9_tmp.RUPT_LONG_DUREE = out8.RUPT_LONG_DUREE ;
out9_tmp.ID_FOURNISSEUR = out8.ID_FOURNISSEUR ;
out9_tmp.UNITE_BESOIN = row16.UNITE_BESOIN==null?"ND":row16.UNITE_BESOIN ;
out9_tmp.ID_UNITE_BESOIN = row16.ID_UNITE_BESOIN==null?"-1":row16.ID_UNITE_BESOIN ;
out9_tmp.ID_SSFAMILLE = row17.ID_SSFAMILLE==null?"-1":row17.ID_SSFAMILLE ;
out9_tmp.SSFAMILLE = row17.SSFAMILLE==null?"ND":row17.SSFAMILLE ;
out9_tmp.ID_SFAMILLE = row18.ID_SFAMILLE==null?"-1":row18.ID_SFAMILLE ;
out9_tmp.SFAMILLE = row18.SFAMILLE==null?"ND":row18.SFAMILLE ;
out9_tmp.ID_FAMILLE = row19.ID_FAMILLE==null?"-1":row19.ID_FAMILLE ;
out9_tmp.FAMILLE = row19.FAMILLE==null?"ND":row19.FAMILLE ;
out9_tmp.ID_RAYON = row20.ID_RAYON==null?"-1":row20.ID_RAYON ;
out9_tmp.RAYON = row20.RAYON==null?"ND":row20.RAYON ;
out9_tmp.ID_DEPARTEMENT = row21.ID_DEPARTEMENT==null?"-1":row21.ID_DEPARTEMENT ;
out9_tmp.DEPARTEMENT = row21.DEPARTEMENT==null?"ND":row21.DEPARTEMENT ;
out9_tmp.ID_ARTICLE_CEXR = out8.ID_ARTICLE_CEXR ;
out9 = out9_tmp;
log.debug("tMap_9 - Outputting the record " + count_out9_tMap_9 + " of the output table 'out9'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_9 = false;










 


	tos_count_tMap_9++;

/**
 * [tMap_9 main ] stop
 */
	
	/**
	 * [tMap_9 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_9";

	

 



/**
 * [tMap_9 process_data_begin ] stop
 */
// Start of branch "out9"
if(out9 != null) { 



	
	/**
	 * [tDBOutput_8 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_8";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out9","tMap_9","tMap_9","tMap","tDBOutput_8","Oracle_ODS_STRUCTURE_MARCHANDISE","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out9 - " + (out9==null? "": out9.toLogString()));
    			}
    		



        whetherReject_tDBOutput_8 = false;
                        pstmt_tDBOutput_8.setBigDecimal(1, out9.ID_DEPARTEMENT_INT);

                        pstmt_tDBOutput_8.setBigDecimal(2, out9.ID_RAYON_INT);

                        pstmt_tDBOutput_8.setBigDecimal(3, out9.ID_FAMILLE_INT);

                        pstmt_tDBOutput_8.setBigDecimal(4, out9.ID_SSFAMILLE_INT);

                        pstmt_tDBOutput_8.setBigDecimal(5, out9.ID_SFAMILLE_INT);

                        pstmt_tDBOutput_8.setBigDecimal(6, out9.ID_UNITE_BESOIN_INT);

                        if(out9.ID_GROUPE_PRODUIT == null) {
pstmt_tDBOutput_8.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(7, out9.ID_GROUPE_PRODUIT);
}

                        if(out9.ID_ARTICLE_INR == null) {
pstmt_tDBOutput_8.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(8, out9.ID_ARTICLE_INR);
}

                        if(out9.ID_ARTICLE_INV == null) {
pstmt_tDBOutput_8.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(9, out9.ID_ARTICLE_INV);
}

                        if(out9.ID_ARTICLE == null) {
pstmt_tDBOutput_8.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(10, out9.ID_ARTICLE);
}

                        if(out9.ID_ARTICLE_CEXUV == null) {
pstmt_tDBOutput_8.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(11, out9.ID_ARTICLE_CEXUV);
}

                        if(out9.EAN13 == null) {
pstmt_tDBOutput_8.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(12, out9.EAN13);
}

                        if(out9.ARTICLE_COURT == null) {
pstmt_tDBOutput_8.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(13, out9.ARTICLE_COURT);
}

                        if(out9.ARTICLE_LONG == null) {
pstmt_tDBOutput_8.setNull(14, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(14, out9.ARTICLE_LONG);
}

                        if(out9.ID_ETAT == null) {
pstmt_tDBOutput_8.setNull(15, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(15, out9.ID_ETAT);
}

                        if(out9.ETAT_COURT == null) {
pstmt_tDBOutput_8.setNull(16, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(16, out9.ETAT_COURT);
}

                        if(out9.ETAT_LONG == null) {
pstmt_tDBOutput_8.setNull(17, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(17, out9.ETAT_LONG);
}

                        if(out9.DT_CREATION == null) {
pstmt_tDBOutput_8.setNull(18, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(18, out9.DT_CREATION);
}

                        if(out9.SAISONNALITE == null) {
pstmt_tDBOutput_8.setNull(19, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(19, out9.SAISONNALITE);
}

                        if(out9.ARTICLE_PROVENANCE == null) {
pstmt_tDBOutput_8.setNull(20, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(20, out9.ARTICLE_PROVENANCE);
}

                        if(out9.ARTICLE_DETENTION == null) {
pstmt_tDBOutput_8.setNull(21, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(21, out9.ARTICLE_DETENTION);
}

                        if(out9.ARTICLE_TYPE == null) {
pstmt_tDBOutput_8.setNull(22, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(22, out9.ARTICLE_TYPE);
}

                        if(out9.ARTICLE_QRTL == null) {
pstmt_tDBOutput_8.setNull(23, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(23, out9.ARTICLE_QRTL);
}

                        if(out9.ARTICLE_MARQ == null) {
pstmt_tDBOutput_8.setNull(24, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(24, out9.ARTICLE_MARQ);
}

                        if(out9.CONTENANCE == null) {
pstmt_tDBOutput_8.setNull(25, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(25, out9.CONTENANCE);
}

                        if(out9.PA == null) {
pstmt_tDBOutput_8.setNull(26, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(26, out9.PA);
}

                        if(out9.PV == null) {
pstmt_tDBOutput_8.setNull(27, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(27, out9.PV);
}

                        if(out9.DEBUT_STOCK == null) {
pstmt_tDBOutput_8.setNull(28, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(28, out9.DEBUT_STOCK);
}

                        if(out9.FIN_STOCK == null) {
pstmt_tDBOutput_8.setNull(29, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(29, out9.FIN_STOCK);
}

                        if(out9.RUPT_LONG_DUREE == null) {
pstmt_tDBOutput_8.setNull(30, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(30, out9.RUPT_LONG_DUREE);
}

                        if(out9.ID_FOURNISSEUR == null) {
pstmt_tDBOutput_8.setNull(31, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(31, out9.ID_FOURNISSEUR);
}

                        if(out9.UNITE_BESOIN == null) {
pstmt_tDBOutput_8.setNull(32, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(32, out9.UNITE_BESOIN);
}

                        if(out9.ID_UNITE_BESOIN == null) {
pstmt_tDBOutput_8.setNull(33, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(33, out9.ID_UNITE_BESOIN);
}

                        if(out9.ID_SSFAMILLE == null) {
pstmt_tDBOutput_8.setNull(34, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(34, out9.ID_SSFAMILLE);
}

                        if(out9.SSFAMILLE == null) {
pstmt_tDBOutput_8.setNull(35, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(35, out9.SSFAMILLE);
}

                        if(out9.ID_SFAMILLE == null) {
pstmt_tDBOutput_8.setNull(36, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(36, out9.ID_SFAMILLE);
}

                        if(out9.SFAMILLE == null) {
pstmt_tDBOutput_8.setNull(37, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(37, out9.SFAMILLE);
}

                        if(out9.ID_FAMILLE == null) {
pstmt_tDBOutput_8.setNull(38, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(38, out9.ID_FAMILLE);
}

                        if(out9.FAMILLE == null) {
pstmt_tDBOutput_8.setNull(39, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(39, out9.FAMILLE);
}

                        if(out9.ID_RAYON == null) {
pstmt_tDBOutput_8.setNull(40, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(40, out9.ID_RAYON);
}

                        if(out9.RAYON == null) {
pstmt_tDBOutput_8.setNull(41, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(41, out9.RAYON);
}

                        if(out9.ID_DEPARTEMENT == null) {
pstmt_tDBOutput_8.setNull(42, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(42, out9.ID_DEPARTEMENT);
}

                        if(out9.DEPARTEMENT == null) {
pstmt_tDBOutput_8.setNull(43, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(43, out9.DEPARTEMENT);
}

                        if(out9.ID_ARTICLE_CEXR == null) {
pstmt_tDBOutput_8.setNull(44, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_8.setString(44, out9.ID_ARTICLE_CEXR);
}

                try {
                    nb_line_tDBOutput_8++;
                    int processedCount_tDBOutput_8 = pstmt_tDBOutput_8.executeUpdate();
                    insertedCount_tDBOutput_8 += processedCount_tDBOutput_8;
                    rowsToCommitCount_tDBOutput_8 += processedCount_tDBOutput_8;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_8)  + (".") );
                } catch(java.lang.Exception e_tDBOutput_8) {
globalMap.put("tDBOutput_8_ERROR_MESSAGE",e_tDBOutput_8.getMessage());
                    whetherReject_tDBOutput_8 = true;
            log.error("tDBOutput_8 - "  + (e_tDBOutput_8.getMessage()) );
                            System.err.print(e_tDBOutput_8.getMessage());
                }
                commitCounter_tDBOutput_8++;
                if(commitEvery_tDBOutput_8 <= commitCounter_tDBOutput_8) {
                    if(rowsToCommitCount_tDBOutput_8 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_8)  + (" record(s).") );
                    }
                    conn_tDBOutput_8.commit();
                    if(rowsToCommitCount_tDBOutput_8 != 0){
                    	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection commit has succeeded.") );
                    	rowsToCommitCount_tDBOutput_8 = 0;
                    }
                    commitCounter_tDBOutput_8=0;
                }

 


	tos_count_tDBOutput_8++;

/**
 * [tDBOutput_8 main ] stop
 */
	
	/**
	 * [tDBOutput_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_8";

	

 



/**
 * [tDBOutput_8 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_8";

	

 



/**
 * [tDBOutput_8 process_data_end ] stop
 */

} // End of branch "out9"




	
	/**
	 * [tMap_9 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_9";

	

 



/**
 * [tMap_9 process_data_end ] stop
 */

} // End of branch "out8"




	
	/**
	 * [tMap_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_8";

	

 



/**
 * [tMap_8 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 



/**
 * [tDBInput_8 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_8 end ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

}
}finally{
	if (rs_tDBInput_8 != null) {
		rs_tDBInput_8.close();
	}
	if (stmt_tDBInput_8 != null) {
		stmt_tDBInput_8.close();
	}
	if(conn_tDBInput_8 != null && !conn_tDBInput_8.isClosed()) {
	
	    		log.debug("tDBInput_8 - Closing the connection to the database.");
			
			conn_tDBInput_8.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_8 - Connection to the database closed.");
			
	}
	
}

globalMap.put("tDBInput_8_NB_LINE",nb_line_tDBInput_8);
	    		log.debug("tDBInput_8 - Retrieved records count: "+nb_line_tDBInput_8 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_8 - "  + ("Done.") );

ok_Hash.put("tDBInput_8", true);
end_Hash.put("tDBInput_8", System.currentTimeMillis());




/**
 * [tDBInput_8 end ] stop
 */

	
	/**
	 * [tMap_8 end ] start
	 */

	

	
	
	currentComponent="tMap_8";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_8 - Written records count in the table 'out8': " + count_out8_tMap_8 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row15",2,0,
			 			"tDBInput_8","STRUCTURE_MARCHANDISE_TMP","tOracleInput","tMap_8","tMap_8","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_8 - "  + ("Done.") );

ok_Hash.put("tMap_8", true);
end_Hash.put("tMap_8", System.currentTimeMillis());




/**
 * [tMap_8 end ] stop
 */

	
	/**
	 * [tMap_9 end ] start
	 */

	

	
	
	currentComponent="tMap_9";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row16 != null) {
						tHash_Lookup_row16.endGet();
					}
					globalMap.remove( "tHash_Lookup_row16" );

					
					
				
					if(tHash_Lookup_row17 != null) {
						tHash_Lookup_row17.endGet();
					}
					globalMap.remove( "tHash_Lookup_row17" );

					
					
				
					if(tHash_Lookup_row18 != null) {
						tHash_Lookup_row18.endGet();
					}
					globalMap.remove( "tHash_Lookup_row18" );

					
					
				
					if(tHash_Lookup_row19 != null) {
						tHash_Lookup_row19.endGet();
					}
					globalMap.remove( "tHash_Lookup_row19" );

					
					
				
					if(tHash_Lookup_row20 != null) {
						tHash_Lookup_row20.endGet();
					}
					globalMap.remove( "tHash_Lookup_row20" );

					
					
				
					if(tHash_Lookup_row21 != null) {
						tHash_Lookup_row21.endGet();
					}
					globalMap.remove( "tHash_Lookup_row21" );

					
					
				
// ###############################      
				log.debug("tMap_9 - Written records count in the table 'out9': " + count_out9_tMap_9 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out8",2,0,
			 			"tMap_8","tMap_8","tMap","tMap_9","tMap_9","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_9 - "  + ("Done.") );

ok_Hash.put("tMap_9", true);
end_Hash.put("tMap_9", System.currentTimeMillis());




/**
 * [tMap_9 end ] stop
 */

	
	/**
	 * [tDBOutput_8 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_8";

	
	



	
        if(pstmt_tDBOutput_8 != null) {
			
				pstmt_tDBOutput_8.close();
				resourceMap.remove("pstmt_tDBOutput_8");
			
        }
    resourceMap.put("statementClosed_tDBOutput_8", true);
		if(commitCounter_tDBOutput_8 > 0 && rowsToCommitCount_tDBOutput_8 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection starting to commit ")  + (rowsToCommitCount_tDBOutput_8)  + (" record(s).") );
		}
		conn_tDBOutput_8.commit();
		if(commitCounter_tDBOutput_8 > 0 && rowsToCommitCount_tDBOutput_8 != 0) {
			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection commit has succeeded.") );
			rowsToCommitCount_tDBOutput_8 = 0;
		}
		commitCounter_tDBOutput_8 = 0;
		
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Closing the connection to the database.") );
		conn_tDBOutput_8 .close();
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection to the database has closed.") );
		resourceMap.put("finish_tDBOutput_8", true);
   	

	
	nb_line_deleted_tDBOutput_8=nb_line_deleted_tDBOutput_8+ deletedCount_tDBOutput_8;
	nb_line_update_tDBOutput_8=nb_line_update_tDBOutput_8 + updatedCount_tDBOutput_8;
	nb_line_inserted_tDBOutput_8=nb_line_inserted_tDBOutput_8 + insertedCount_tDBOutput_8;
	nb_line_rejected_tDBOutput_8=nb_line_rejected_tDBOutput_8 + rejectedCount_tDBOutput_8;
	
        globalMap.put("tDBOutput_8_NB_LINE",nb_line_tDBOutput_8);
        globalMap.put("tDBOutput_8_NB_LINE_UPDATED",nb_line_update_tDBOutput_8);
        globalMap.put("tDBOutput_8_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_8);
        globalMap.put("tDBOutput_8_NB_LINE_DELETED",nb_line_deleted_tDBOutput_8);
        globalMap.put("tDBOutput_8_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_8);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tDBOutput_8)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out9",2,0,
			 			"tMap_9","tMap_9","tMap","tDBOutput_8","Oracle_ODS_STRUCTURE_MARCHANDISE","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Done.") );

ok_Hash.put("tDBOutput_8", true);
end_Hash.put("tDBOutput_8", System.currentTimeMillis());




/**
 * [tDBOutput_8 end ] stop
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
				
					     			//free memory for "tMap_9"
					     			globalMap.remove("tHash_Lookup_row17"); 
				     			
					     			//free memory for "tMap_9"
					     			globalMap.remove("tHash_Lookup_row18"); 
				     			
					     			//free memory for "tMap_9"
					     			globalMap.remove("tHash_Lookup_row21"); 
				     			
					     			//free memory for "tMap_9"
					     			globalMap.remove("tHash_Lookup_row16"); 
				     			
					     			//free memory for "tMap_9"
					     			globalMap.remove("tHash_Lookup_row19"); 
				     			
					     			//free memory for "tMap_9"
					     			globalMap.remove("tHash_Lookup_row20"); 
				     			
				try{
					
	
	/**
	 * [tDBInput_8 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_8";

	

 



/**
 * [tDBInput_8 finally ] stop
 */

	
	/**
	 * [tMap_8 finally ] start
	 */

	

	
	
	currentComponent="tMap_8";

	

 



/**
 * [tMap_8 finally ] stop
 */

	
	/**
	 * [tMap_9 finally ] start
	 */

	

	
	
	currentComponent="tMap_9";

	

 



/**
 * [tMap_9 finally ] stop
 */

	
	/**
	 * [tDBOutput_8 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_8";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_8") == null) {
                java.sql.PreparedStatement pstmtToClose_tDBOutput_8 = null;
                if ((pstmtToClose_tDBOutput_8 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_8")) != null) {
                    pstmtToClose_tDBOutput_8.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_8") == null){
            java.sql.Connection ctn_tDBOutput_8 = null;
            if((ctn_tDBOutput_8 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_8")) != null){
                try {
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Closing the connection to the database.") );
                    ctn_tDBOutput_8.close();
                if(log.isDebugEnabled())
            log.debug("tDBOutput_8 - "  + ("Connection to the database has closed.") );
                } catch (java.sql.SQLException sqlEx_tDBOutput_8) {
                    String errorMessage_tDBOutput_8 = "failed to close the connection in tDBOutput_8 :" + sqlEx_tDBOutput_8.getMessage();
            log.error("tDBOutput_8 - "  + (errorMessage_tDBOutput_8) );
                    System.err.println(errorMessage_tDBOutput_8);
                }
            }
        }
    }
 



/**
 * [tDBOutput_8 finally ] stop
 */









				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_8_SUBPROCESS_STATE", 1);
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
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Probleme de connexion GOLD\"");
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
	System.err.println("Probleme de connexion GOLD");
	
		log.error("tDie_1 - The die message: "+"Probleme de connexion GOLD");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Probleme de connexion GOLD");
	globalMap.put("tDie_1_DIE_MESSAGES", "Probleme de connexion GOLD");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
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
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
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
	


public static class row17Struct implements routines.system.IPersistableComparableLookupRow<row17Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal ID_SSFAMILLE_INT;

				public BigDecimal getID_SSFAMILLE_INT () {
					return this.ID_SSFAMILLE_INT;
				}
				
			    public String ID_SSFAMILLE;

				public String getID_SSFAMILLE () {
					return this.ID_SSFAMILLE;
				}
				
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_SSFAMILLE_INT == null) ? 0 : new Double(this.ID_SSFAMILLE_INT.doubleValue()).hashCode());
						
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
		final row17Struct other = (row17Struct) obj;
		
						if (this.ID_SSFAMILLE_INT == null) {
							if (other.ID_SSFAMILLE_INT != null)
								return false;
						
						} else if ((other.ID_SSFAMILLE_INT == null) || (this.ID_SSFAMILLE_INT.compareTo(other.ID_SSFAMILLE_INT)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row17Struct other) {

		other.ID_SSFAMILLE_INT = this.ID_SSFAMILLE_INT;
	            other.ID_SSFAMILLE = this.ID_SSFAMILLE;
	            other.ID_SFAMILLE_INT = this.ID_SFAMILLE_INT;
	            other.SSFAMILLE = this.SSFAMILLE;
	            
	}

	public void copyKeysDataTo(row17Struct other) {

		other.ID_SSFAMILLE_INT = this.ID_SSFAMILLE_INT;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SSFAMILLE_INT);
					
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
		
						this.ID_SSFAMILLE = readString(dis,ois);
					
       			    	this.ID_SFAMILLE_INT = (BigDecimal) ois.readObject();
					
						this.SSFAMILLE = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ID_SSFAMILLE = readString(dis,objectIn);
					
       			    	this.ID_SFAMILLE_INT = (BigDecimal) objectIn.readObject();
					
						this.SSFAMILLE = readString(dis,objectIn);
					
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

		
						writeString(this.ID_SSFAMILLE, dos, oos);
					
       			    	oos.writeObject(this.ID_SFAMILLE_INT);
					
						writeString(this.SSFAMILLE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.ID_SSFAMILLE, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_SFAMILLE_INT);
					
						writeString(this.SSFAMILLE, dos, objectOut);
					
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
		sb.append("ID_SSFAMILLE_INT="+String.valueOf(ID_SSFAMILLE_INT));
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",SSFAMILLE="+SSFAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_SSFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row17Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_SSFAMILLE_INT, other.ID_SSFAMILLE_INT);
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
public void tDBInput_9Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_9_SUBPROCESS_STATE", 0);

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



		row17Struct row17 = new row17Struct();




	
	/**
	 * [tAdvancedHash_row17 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row17", false);
		start_Hash.put("tAdvancedHash_row17", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row17";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row17");
			
		int tos_count_tAdvancedHash_row17 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row17", "tAdvancedHash_row17", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row17
			   		// source node:tDBInput_9 - inputs:(after_tDBInput_8) outputs:(row17,row17) | target node:tAdvancedHash_row17 - inputs:(row17) outputs:()
			   		// linked node: tMap_9 - inputs:(out8,row17,row18,row21,row16,row19,row20) outputs:(out9)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row17 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row17Struct> tHash_Lookup_row17 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row17Struct>getLookup(matchingModeEnum_row17);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row17", tHash_Lookup_row17);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row17 begin ] stop
 */



	
	/**
	 * [tDBInput_9 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_9", false);
		start_Hash.put("tDBInput_9", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_9";

	
		int tos_count_tDBInput_9 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_9 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_9{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_9 = new StringBuilder();
                    log4jParamters_tDBInput_9.append("Parameters:");
                            log4jParamters_tDBInput_9.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:NjmvfEw4WavLR2MsSlg8JVYBaBhW5+HHzXxx/RDEdNd7YIhF").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("QUERY" + " = " + "\"SELECT *FROM ODS_SS_FAMILLE\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SSFAMILLE")+"}]");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_9.append(" | ");
                            log4jParamters_tDBInput_9.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_9.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_9 - "  + (log4jParamters_tDBInput_9) );
                    } 
                } 
            new BytesLimit65535_tDBInput_9().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_9", "Oracle_SSFAMILE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_9 = 0;
		    java.sql.Connection conn_tDBInput_9 = null;
				String driverClass_tDBInput_9 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_9);
				
			String url_tDBInput_9 = null;
				url_tDBInput_9 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_9 = "ods";

				

				 
	final String decryptedPassword_tDBInput_9 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:KZCkT6PhSZ1wj9tGFe9qMSn87UVCNg/nf1SypilY7xSDU6Yl");

				String dbPwd_tDBInput_9 = decryptedPassword_tDBInput_9;

				
	    		log.debug("tDBInput_9 - Driver ClassName: "+driverClass_tDBInput_9+".");
			
	    		log.debug("tDBInput_9 - Connection attempt to '" + url_tDBInput_9 + "' with the username '" + dbUser_tDBInput_9 + "'.");
			
					conn_tDBInput_9 = java.sql.DriverManager.getConnection(url_tDBInput_9,dbUser_tDBInput_9,dbPwd_tDBInput_9);
	    		log.debug("tDBInput_9 - Connection to '" + url_tDBInput_9 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_9 = conn_tDBInput_9.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_9 = stmtGetTZ_tDBInput_9.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_9 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_9.next()) {
					sessionTimezone_tDBInput_9 = rsGetTZ_tDBInput_9.getString(1);
				}
                                if (!(conn_tDBInput_9 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_9.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_9.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_9.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_9);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_9).setSessionTimeZone(sessionTimezone_tDBInput_9);
                                }
		    
			java.sql.Statement stmt_tDBInput_9 = conn_tDBInput_9.createStatement();

		    String dbquery_tDBInput_9 = "SELECT *FROM ODS_SS_FAMILLE";
		    
	    		log.debug("tDBInput_9 - Executing the query: '" + dbquery_tDBInput_9 + "'.");
			

            	globalMap.put("tDBInput_9_QUERY",dbquery_tDBInput_9);
		    java.sql.ResultSet rs_tDBInput_9 = null;

		    try {
		    	rs_tDBInput_9 = stmt_tDBInput_9.executeQuery(dbquery_tDBInput_9);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_9 = rs_tDBInput_9.getMetaData();
		    	int colQtyInRs_tDBInput_9 = rsmd_tDBInput_9.getColumnCount();

		    String tmpContent_tDBInput_9 = null;
		    
		    
		    	log.debug("tDBInput_9 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_9.next()) {
		        nb_line_tDBInput_9++;
		        
							if(colQtyInRs_tDBInput_9 < 1) {
								row17.ID_SSFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_9.getObject(1) != null) {
						row17.ID_SSFAMILLE_INT = rs_tDBInput_9.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_9 < 2) {
								row17.ID_SSFAMILLE = null;
							} else {
	                         		
        	row17.ID_SSFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_9, 2, false);
		                    }
							if(colQtyInRs_tDBInput_9 < 3) {
								row17.ID_SFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_9.getObject(3) != null) {
						row17.ID_SFAMILLE_INT = rs_tDBInput_9.getBigDecimal(3);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_9 < 4) {
								row17.SSFAMILLE = null;
							} else {
	                         		
        	row17.SSFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_9, 4, false);
		                    }
					
						log.debug("tDBInput_9 - Retrieving the record " + nb_line_tDBInput_9 + ".");
					




 



/**
 * [tDBInput_9 begin ] stop
 */
	
	/**
	 * [tDBInput_9 main ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 


	tos_count_tDBInput_9++;

/**
 * [tDBInput_9 main ] stop
 */
	
	/**
	 * [tDBInput_9 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 



/**
 * [tDBInput_9 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row17 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row17";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row17","tDBInput_9","Oracle_SSFAMILE","tOracleInput","tAdvancedHash_row17","tAdvancedHash_row17","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row17 - " + (row17==null? "": row17.toLogString()));
    			}
    		


			   
			   

					row17Struct row17_HashRow = new row17Struct();
		   	   	   
				
				row17_HashRow.ID_SSFAMILLE_INT = row17.ID_SSFAMILLE_INT;
				
				row17_HashRow.ID_SSFAMILLE = row17.ID_SSFAMILLE;
				
				row17_HashRow.ID_SFAMILLE_INT = row17.ID_SFAMILLE_INT;
				
				row17_HashRow.SSFAMILLE = row17.SSFAMILLE;
				
			tHash_Lookup_row17.put(row17_HashRow);
			
            




 


	tos_count_tAdvancedHash_row17++;

/**
 * [tAdvancedHash_row17 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row17 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row17";

	

 



/**
 * [tAdvancedHash_row17 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row17 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row17";

	

 



/**
 * [tAdvancedHash_row17 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_9 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 



/**
 * [tDBInput_9 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_9 end ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

}
}finally{
	if (rs_tDBInput_9 != null) {
		rs_tDBInput_9.close();
	}
	if (stmt_tDBInput_9 != null) {
		stmt_tDBInput_9.close();
	}
	if(conn_tDBInput_9 != null && !conn_tDBInput_9.isClosed()) {
	
	    		log.debug("tDBInput_9 - Closing the connection to the database.");
			
			conn_tDBInput_9.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_9 - Connection to the database closed.");
			
	}
	
}

globalMap.put("tDBInput_9_NB_LINE",nb_line_tDBInput_9);
	    		log.debug("tDBInput_9 - Retrieved records count: "+nb_line_tDBInput_9 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_9 - "  + ("Done.") );

ok_Hash.put("tDBInput_9", true);
end_Hash.put("tDBInput_9", System.currentTimeMillis());




/**
 * [tDBInput_9 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row17 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row17";

	

tHash_Lookup_row17.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row17",2,0,
			 			"tDBInput_9","Oracle_SSFAMILE","tOracleInput","tAdvancedHash_row17","tAdvancedHash_row17","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row17", true);
end_Hash.put("tAdvancedHash_row17", System.currentTimeMillis());




/**
 * [tAdvancedHash_row17 end ] stop
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
	 * [tDBInput_9 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_9";

	

 



/**
 * [tDBInput_9 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row17 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row17";

	

 



/**
 * [tAdvancedHash_row17 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_9_SUBPROCESS_STATE", 1);
	}
	


public static class row18Struct implements routines.system.IPersistableComparableLookupRow<row18Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal ID_SFAMILLE_INT;

				public BigDecimal getID_SFAMILLE_INT () {
					return this.ID_SFAMILLE_INT;
				}
				
			    public String ID_SFAMILLE;

				public String getID_SFAMILLE () {
					return this.ID_SFAMILLE;
				}
				
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_SFAMILLE_INT == null) ? 0 : new Double(this.ID_SFAMILLE_INT.doubleValue()).hashCode());
						
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
		final row18Struct other = (row18Struct) obj;
		
						if (this.ID_SFAMILLE_INT == null) {
							if (other.ID_SFAMILLE_INT != null)
								return false;
						
						} else if ((other.ID_SFAMILLE_INT == null) || (this.ID_SFAMILLE_INT.compareTo(other.ID_SFAMILLE_INT)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row18Struct other) {

		other.ID_SFAMILLE_INT = this.ID_SFAMILLE_INT;
	            other.ID_SFAMILLE = this.ID_SFAMILLE;
	            other.ID_FAMILLE_INT = this.ID_FAMILLE_INT;
	            other.SFAMILLE = this.SFAMILLE;
	            
	}

	public void copyKeysDataTo(row18Struct other) {

		other.ID_SFAMILLE_INT = this.ID_SFAMILLE_INT;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SFAMILLE_INT);
					
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
		
						this.ID_SFAMILLE = readString(dis,ois);
					
       			    	this.ID_FAMILLE_INT = (BigDecimal) ois.readObject();
					
						this.SFAMILLE = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ID_SFAMILLE = readString(dis,objectIn);
					
       			    	this.ID_FAMILLE_INT = (BigDecimal) objectIn.readObject();
					
						this.SFAMILLE = readString(dis,objectIn);
					
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

		
						writeString(this.ID_SFAMILLE, dos, oos);
					
       			    	oos.writeObject(this.ID_FAMILLE_INT);
					
						writeString(this.SFAMILLE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.ID_SFAMILLE, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_FAMILLE_INT);
					
						writeString(this.SFAMILLE, dos, objectOut);
					
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
		sb.append("ID_SFAMILLE_INT="+String.valueOf(ID_SFAMILLE_INT));
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",SFAMILLE="+SFAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_SFAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row18Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_SFAMILLE_INT, other.ID_SFAMILLE_INT);
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
public void tDBInput_10Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_10_SUBPROCESS_STATE", 0);

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



		row18Struct row18 = new row18Struct();




	
	/**
	 * [tAdvancedHash_row18 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row18", false);
		start_Hash.put("tAdvancedHash_row18", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row18";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row18");
			
		int tos_count_tAdvancedHash_row18 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row18", "tAdvancedHash_row18", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row18
			   		// source node:tDBInput_10 - inputs:(after_tDBInput_8) outputs:(row18,row18) | target node:tAdvancedHash_row18 - inputs:(row18) outputs:()
			   		// linked node: tMap_9 - inputs:(out8,row17,row18,row21,row16,row19,row20) outputs:(out9)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row18 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row18Struct> tHash_Lookup_row18 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row18Struct>getLookup(matchingModeEnum_row18);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row18", tHash_Lookup_row18);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row18 begin ] stop
 */



	
	/**
	 * [tDBInput_10 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_10", false);
		start_Hash.put("tDBInput_10", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_10";

	
		int tos_count_tDBInput_10 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_10 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_10{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_10 = new StringBuilder();
                    log4jParamters_tDBInput_10.append("Parameters:");
                            log4jParamters_tDBInput_10.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:CWf3nB6kjWSmhQ+gW/FL/qF6j33kCg2nAgP03nGPmPfoYqLw").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("QUERY" + " = " + "\"SELECT *FROM ODS_S_FAMILLE\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SFAMILLE")+"}]");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_10.append(" | ");
                            log4jParamters_tDBInput_10.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_10.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_10 - "  + (log4jParamters_tDBInput_10) );
                    } 
                } 
            new BytesLimit65535_tDBInput_10().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_10", "Oracle_SFAMILE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_10 = 0;
		    java.sql.Connection conn_tDBInput_10 = null;
				String driverClass_tDBInput_10 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_10);
				
			String url_tDBInput_10 = null;
				url_tDBInput_10 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_10 = "ods";

				

				 
	final String decryptedPassword_tDBInput_10 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:IGKp+cSWBRVj9gkqjC9ToDrctqSjgcV1qS0zYf2LyqyuvnM8");

				String dbPwd_tDBInput_10 = decryptedPassword_tDBInput_10;

				
	    		log.debug("tDBInput_10 - Driver ClassName: "+driverClass_tDBInput_10+".");
			
	    		log.debug("tDBInput_10 - Connection attempt to '" + url_tDBInput_10 + "' with the username '" + dbUser_tDBInput_10 + "'.");
			
					conn_tDBInput_10 = java.sql.DriverManager.getConnection(url_tDBInput_10,dbUser_tDBInput_10,dbPwd_tDBInput_10);
	    		log.debug("tDBInput_10 - Connection to '" + url_tDBInput_10 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_10 = conn_tDBInput_10.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_10 = stmtGetTZ_tDBInput_10.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_10 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_10.next()) {
					sessionTimezone_tDBInput_10 = rsGetTZ_tDBInput_10.getString(1);
				}
                                if (!(conn_tDBInput_10 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_10.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_10.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_10.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_10);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_10).setSessionTimeZone(sessionTimezone_tDBInput_10);
                                }
		    
			java.sql.Statement stmt_tDBInput_10 = conn_tDBInput_10.createStatement();

		    String dbquery_tDBInput_10 = "SELECT *FROM ODS_S_FAMILLE";
		    
	    		log.debug("tDBInput_10 - Executing the query: '" + dbquery_tDBInput_10 + "'.");
			

            	globalMap.put("tDBInput_10_QUERY",dbquery_tDBInput_10);
		    java.sql.ResultSet rs_tDBInput_10 = null;

		    try {
		    	rs_tDBInput_10 = stmt_tDBInput_10.executeQuery(dbquery_tDBInput_10);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_10 = rs_tDBInput_10.getMetaData();
		    	int colQtyInRs_tDBInput_10 = rsmd_tDBInput_10.getColumnCount();

		    String tmpContent_tDBInput_10 = null;
		    
		    
		    	log.debug("tDBInput_10 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_10.next()) {
		        nb_line_tDBInput_10++;
		        
							if(colQtyInRs_tDBInput_10 < 1) {
								row18.ID_SFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_10.getObject(1) != null) {
						row18.ID_SFAMILLE_INT = rs_tDBInput_10.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_10 < 2) {
								row18.ID_SFAMILLE = null;
							} else {
	                         		
        	row18.ID_SFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_10, 2, false);
		                    }
							if(colQtyInRs_tDBInput_10 < 3) {
								row18.ID_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_10.getObject(3) != null) {
						row18.ID_FAMILLE_INT = rs_tDBInput_10.getBigDecimal(3);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_10 < 4) {
								row18.SFAMILLE = null;
							} else {
	                         		
        	row18.SFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_10, 4, false);
		                    }
					
						log.debug("tDBInput_10 - Retrieving the record " + nb_line_tDBInput_10 + ".");
					




 



/**
 * [tDBInput_10 begin ] stop
 */
	
	/**
	 * [tDBInput_10 main ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 


	tos_count_tDBInput_10++;

/**
 * [tDBInput_10 main ] stop
 */
	
	/**
	 * [tDBInput_10 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 



/**
 * [tDBInput_10 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row18 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row18";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row18","tDBInput_10","Oracle_SFAMILE","tOracleInput","tAdvancedHash_row18","tAdvancedHash_row18","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row18 - " + (row18==null? "": row18.toLogString()));
    			}
    		


			   
			   

					row18Struct row18_HashRow = new row18Struct();
		   	   	   
				
				row18_HashRow.ID_SFAMILLE_INT = row18.ID_SFAMILLE_INT;
				
				row18_HashRow.ID_SFAMILLE = row18.ID_SFAMILLE;
				
				row18_HashRow.ID_FAMILLE_INT = row18.ID_FAMILLE_INT;
				
				row18_HashRow.SFAMILLE = row18.SFAMILLE;
				
			tHash_Lookup_row18.put(row18_HashRow);
			
            




 


	tos_count_tAdvancedHash_row18++;

/**
 * [tAdvancedHash_row18 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row18 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row18";

	

 



/**
 * [tAdvancedHash_row18 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row18 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row18";

	

 



/**
 * [tAdvancedHash_row18 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_10 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 



/**
 * [tDBInput_10 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_10 end ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

}
}finally{
	if (rs_tDBInput_10 != null) {
		rs_tDBInput_10.close();
	}
	if (stmt_tDBInput_10 != null) {
		stmt_tDBInput_10.close();
	}
	if(conn_tDBInput_10 != null && !conn_tDBInput_10.isClosed()) {
	
	    		log.debug("tDBInput_10 - Closing the connection to the database.");
			
			conn_tDBInput_10.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_10 - Connection to the database closed.");
			
	}
	
}

globalMap.put("tDBInput_10_NB_LINE",nb_line_tDBInput_10);
	    		log.debug("tDBInput_10 - Retrieved records count: "+nb_line_tDBInput_10 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_10 - "  + ("Done.") );

ok_Hash.put("tDBInput_10", true);
end_Hash.put("tDBInput_10", System.currentTimeMillis());




/**
 * [tDBInput_10 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row18 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row18";

	

tHash_Lookup_row18.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row18",2,0,
			 			"tDBInput_10","Oracle_SFAMILE","tOracleInput","tAdvancedHash_row18","tAdvancedHash_row18","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row18", true);
end_Hash.put("tAdvancedHash_row18", System.currentTimeMillis());




/**
 * [tAdvancedHash_row18 end ] stop
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
	 * [tDBInput_10 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_10";

	

 



/**
 * [tDBInput_10 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row18 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row18";

	

 



/**
 * [tAdvancedHash_row18 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_10_SUBPROCESS_STATE", 1);
	}
	


public static class row21Struct implements routines.system.IPersistableComparableLookupRow<row21Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public String ID_DEPARTEMENT;

				public String getID_DEPARTEMENT () {
					return this.ID_DEPARTEMENT;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_DEPARTEMENT_INT == null) ? 0 : new Double(this.ID_DEPARTEMENT_INT.doubleValue()).hashCode());
						
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
		final row21Struct other = (row21Struct) obj;
		
						if (this.ID_DEPARTEMENT_INT == null) {
							if (other.ID_DEPARTEMENT_INT != null)
								return false;
						
						} else if ((other.ID_DEPARTEMENT_INT == null) || (this.ID_DEPARTEMENT_INT.compareTo(other.ID_DEPARTEMENT_INT)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row21Struct other) {

		other.ID_DEPARTEMENT_INT = this.ID_DEPARTEMENT_INT;
	            other.ID_DEPARTEMENT = this.ID_DEPARTEMENT;
	            other.DEPARTEMENT = this.DEPARTEMENT;
	            
	}

	public void copyKeysDataTo(row21Struct other) {

		other.ID_DEPARTEMENT_INT = this.ID_DEPARTEMENT_INT;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_DEPARTEMENT_INT);
					
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
		
						this.ID_DEPARTEMENT = readString(dis,ois);
					
						this.DEPARTEMENT = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ID_DEPARTEMENT = readString(dis,objectIn);
					
						this.DEPARTEMENT = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.ID_DEPARTEMENT, dos, oos);
					
						writeString(this.DEPARTEMENT, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.ID_DEPARTEMENT, dos, objectOut);
					
						writeString(this.DEPARTEMENT, dos, objectOut);
					
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
		sb.append("ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row21Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_DEPARTEMENT_INT, other.ID_DEPARTEMENT_INT);
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
public void tDBInput_11Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_11_SUBPROCESS_STATE", 0);

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



		row21Struct row21 = new row21Struct();




	
	/**
	 * [tAdvancedHash_row21 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row21", false);
		start_Hash.put("tAdvancedHash_row21", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row21";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row21");
			
		int tos_count_tAdvancedHash_row21 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row21", "tAdvancedHash_row21", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row21
			   		// source node:tDBInput_11 - inputs:(after_tDBInput_8) outputs:(row21,row21) | target node:tAdvancedHash_row21 - inputs:(row21) outputs:()
			   		// linked node: tMap_9 - inputs:(out8,row17,row18,row21,row16,row19,row20) outputs:(out9)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row21 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row21Struct> tHash_Lookup_row21 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row21Struct>getLookup(matchingModeEnum_row21);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row21", tHash_Lookup_row21);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row21 begin ] stop
 */



	
	/**
	 * [tDBInput_11 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_11", false);
		start_Hash.put("tDBInput_11", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_11";

	
		int tos_count_tDBInput_11 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_11 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_11{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_11 = new StringBuilder();
                    log4jParamters_tDBInput_11.append("Parameters:");
                            log4jParamters_tDBInput_11.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:WEsqiIoxdsdWU/7JRa6w/RJM8bzv0YzYzjZ2HoSH5X/B4kEd").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("QUERY" + " = " + "\"SELECT *FROM ODS_DEPARTEMENT\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPARTEMENT")+"}]");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_11.append(" | ");
                            log4jParamters_tDBInput_11.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_11.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_11 - "  + (log4jParamters_tDBInput_11) );
                    } 
                } 
            new BytesLimit65535_tDBInput_11().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_11", "Oracle_DEPARTEMENT", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_11 = 0;
		    java.sql.Connection conn_tDBInput_11 = null;
				String driverClass_tDBInput_11 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_11);
				
			String url_tDBInput_11 = null;
				url_tDBInput_11 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_11 = "ods";

				

				 
	final String decryptedPassword_tDBInput_11 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:L/4npGomBGOtk5b+bFNEDF6/Ebq9fLioQ6ZIx8OnLAoCKp4x");

				String dbPwd_tDBInput_11 = decryptedPassword_tDBInput_11;

				
	    		log.debug("tDBInput_11 - Driver ClassName: "+driverClass_tDBInput_11+".");
			
	    		log.debug("tDBInput_11 - Connection attempt to '" + url_tDBInput_11 + "' with the username '" + dbUser_tDBInput_11 + "'.");
			
					conn_tDBInput_11 = java.sql.DriverManager.getConnection(url_tDBInput_11,dbUser_tDBInput_11,dbPwd_tDBInput_11);
	    		log.debug("tDBInput_11 - Connection to '" + url_tDBInput_11 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_11 = conn_tDBInput_11.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_11 = stmtGetTZ_tDBInput_11.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_11 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_11.next()) {
					sessionTimezone_tDBInput_11 = rsGetTZ_tDBInput_11.getString(1);
				}
                                if (!(conn_tDBInput_11 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_11.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_11.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_11.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_11);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_11).setSessionTimeZone(sessionTimezone_tDBInput_11);
                                }
		    
			java.sql.Statement stmt_tDBInput_11 = conn_tDBInput_11.createStatement();

		    String dbquery_tDBInput_11 = "SELECT *FROM ODS_DEPARTEMENT";
		    
	    		log.debug("tDBInput_11 - Executing the query: '" + dbquery_tDBInput_11 + "'.");
			

            	globalMap.put("tDBInput_11_QUERY",dbquery_tDBInput_11);
		    java.sql.ResultSet rs_tDBInput_11 = null;

		    try {
		    	rs_tDBInput_11 = stmt_tDBInput_11.executeQuery(dbquery_tDBInput_11);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_11 = rs_tDBInput_11.getMetaData();
		    	int colQtyInRs_tDBInput_11 = rsmd_tDBInput_11.getColumnCount();

		    String tmpContent_tDBInput_11 = null;
		    
		    
		    	log.debug("tDBInput_11 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_11.next()) {
		        nb_line_tDBInput_11++;
		        
							if(colQtyInRs_tDBInput_11 < 1) {
								row21.ID_DEPARTEMENT_INT = null;
							} else {
		                          
					if(rs_tDBInput_11.getObject(1) != null) {
						row21.ID_DEPARTEMENT_INT = rs_tDBInput_11.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_11 < 2) {
								row21.ID_DEPARTEMENT = null;
							} else {
	                         		
        	row21.ID_DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_11, 2, false);
		                    }
							if(colQtyInRs_tDBInput_11 < 3) {
								row21.DEPARTEMENT = null;
							} else {
	                         		
        	row21.DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_11, 3, false);
		                    }
					
						log.debug("tDBInput_11 - Retrieving the record " + nb_line_tDBInput_11 + ".");
					




 



/**
 * [tDBInput_11 begin ] stop
 */
	
	/**
	 * [tDBInput_11 main ] start
	 */

	

	
	
	currentComponent="tDBInput_11";

	

 


	tos_count_tDBInput_11++;

/**
 * [tDBInput_11 main ] stop
 */
	
	/**
	 * [tDBInput_11 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_11";

	

 



/**
 * [tDBInput_11 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row21 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row21";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row21","tDBInput_11","Oracle_DEPARTEMENT","tOracleInput","tAdvancedHash_row21","tAdvancedHash_row21","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row21 - " + (row21==null? "": row21.toLogString()));
    			}
    		


			   
			   

					row21Struct row21_HashRow = new row21Struct();
		   	   	   
				
				row21_HashRow.ID_DEPARTEMENT_INT = row21.ID_DEPARTEMENT_INT;
				
				row21_HashRow.ID_DEPARTEMENT = row21.ID_DEPARTEMENT;
				
				row21_HashRow.DEPARTEMENT = row21.DEPARTEMENT;
				
			tHash_Lookup_row21.put(row21_HashRow);
			
            




 


	tos_count_tAdvancedHash_row21++;

/**
 * [tAdvancedHash_row21 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row21 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row21";

	

 



/**
 * [tAdvancedHash_row21 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row21 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row21";

	

 



/**
 * [tAdvancedHash_row21 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_11 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_11";

	

 



/**
 * [tDBInput_11 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_11 end ] start
	 */

	

	
	
	currentComponent="tDBInput_11";

	

}
}finally{
	if (rs_tDBInput_11 != null) {
		rs_tDBInput_11.close();
	}
	if (stmt_tDBInput_11 != null) {
		stmt_tDBInput_11.close();
	}
	if(conn_tDBInput_11 != null && !conn_tDBInput_11.isClosed()) {
	
	    		log.debug("tDBInput_11 - Closing the connection to the database.");
			
			conn_tDBInput_11.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_11 - Connection to the database closed.");
			
	}
	
}

globalMap.put("tDBInput_11_NB_LINE",nb_line_tDBInput_11);
	    		log.debug("tDBInput_11 - Retrieved records count: "+nb_line_tDBInput_11 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_11 - "  + ("Done.") );

ok_Hash.put("tDBInput_11", true);
end_Hash.put("tDBInput_11", System.currentTimeMillis());




/**
 * [tDBInput_11 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row21 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row21";

	

tHash_Lookup_row21.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row21",2,0,
			 			"tDBInput_11","Oracle_DEPARTEMENT","tOracleInput","tAdvancedHash_row21","tAdvancedHash_row21","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row21", true);
end_Hash.put("tAdvancedHash_row21", System.currentTimeMillis());




/**
 * [tAdvancedHash_row21 end ] stop
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
	 * [tDBInput_11 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_11";

	

 



/**
 * [tDBInput_11 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row21 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row21";

	

 



/**
 * [tAdvancedHash_row21 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_11_SUBPROCESS_STATE", 1);
	}
	


public static class row16Struct implements routines.system.IPersistableComparableLookupRow<row16Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public BigDecimal ID_UNITE_BESOIN_INT;

				public BigDecimal getID_UNITE_BESOIN_INT () {
					return this.ID_UNITE_BESOIN_INT;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_UNITE_BESOIN_INT == null) ? 0 : new Double(this.ID_UNITE_BESOIN_INT.doubleValue()).hashCode());
						
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
		final row16Struct other = (row16Struct) obj;
		
						if (this.ID_UNITE_BESOIN_INT == null) {
							if (other.ID_UNITE_BESOIN_INT != null)
								return false;
						
						} else if ((other.ID_UNITE_BESOIN_INT == null) || (this.ID_UNITE_BESOIN_INT.compareTo(other.ID_UNITE_BESOIN_INT)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row16Struct other) {

		other.ID_UNITE_BESOIN = this.ID_UNITE_BESOIN;
	            other.ID_UNITE_BESOIN_INT = this.ID_UNITE_BESOIN_INT;
	            other.UNITE_BESOIN = this.UNITE_BESOIN;
	            
	}

	public void copyKeysDataTo(row16Struct other) {

		other.ID_UNITE_BESOIN_INT = this.ID_UNITE_BESOIN_INT;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_UNITE_BESOIN_INT);
					
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
		
						this.ID_UNITE_BESOIN = readString(dis,ois);
					
						this.UNITE_BESOIN = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ID_UNITE_BESOIN = readString(dis,objectIn);
					
						this.UNITE_BESOIN = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.ID_UNITE_BESOIN, dos, oos);
					
						writeString(this.UNITE_BESOIN, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.ID_UNITE_BESOIN, dos, objectOut);
					
						writeString(this.UNITE_BESOIN, dos, objectOut);
					
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
		sb.append("ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN_INT="+String.valueOf(ID_UNITE_BESOIN_INT));
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UNITE_BESOIN_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UNITE_BESOIN_INT);
            			}
            		
        			sb.append("|");
        		
        				if(UNITE_BESOIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNITE_BESOIN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row16Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_UNITE_BESOIN_INT, other.ID_UNITE_BESOIN_INT);
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
public void tDBInput_12Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_12_SUBPROCESS_STATE", 0);

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



		row16Struct row16 = new row16Struct();




	
	/**
	 * [tAdvancedHash_row16 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row16", false);
		start_Hash.put("tAdvancedHash_row16", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row16";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row16");
			
		int tos_count_tAdvancedHash_row16 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row16", "tAdvancedHash_row16", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row16
			   		// source node:tDBInput_12 - inputs:(after_tDBInput_8) outputs:(row16,row16) | target node:tAdvancedHash_row16 - inputs:(row16) outputs:()
			   		// linked node: tMap_9 - inputs:(out8,row17,row18,row21,row16,row19,row20) outputs:(out9)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row16 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row16Struct> tHash_Lookup_row16 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row16Struct>getLookup(matchingModeEnum_row16);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row16", tHash_Lookup_row16);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row16 begin ] stop
 */



	
	/**
	 * [tDBInput_12 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_12", false);
		start_Hash.put("tDBInput_12", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_12";

	
		int tos_count_tDBInput_12 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_12 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_12{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_12 = new StringBuilder();
                    log4jParamters_tDBInput_12.append("Parameters:");
                            log4jParamters_tDBInput_12.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:hF9t3dQ6GY/fcn6BVzA6ju+wJlKDeOmoOv62ROwfMrxUOzcI").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("QUERY" + " = " + "\"SELECT DISTINCT ID_UNITE_BESOIN, ID_UNITE_BESOIN_INT, UNITE_BESOIN FROM ODS_UNITE_BESOIN\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_UNITE_BESOIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_UNITE_BESOIN_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UNITE_BESOIN")+"}]");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_12.append(" | ");
                            log4jParamters_tDBInput_12.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_12.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_12 - "  + (log4jParamters_tDBInput_12) );
                    } 
                } 
            new BytesLimit65535_tDBInput_12().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_12", "Oracle_UNITE_BESOIN", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_12 = 0;
		    java.sql.Connection conn_tDBInput_12 = null;
				String driverClass_tDBInput_12 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_12);
				
			String url_tDBInput_12 = null;
				url_tDBInput_12 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_12 = "ods";

				

				 
	final String decryptedPassword_tDBInput_12 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:HVOaFvi7GeAHWZI62JcYF6BxjTra66/L+ebej5EB0xoRKBcs");

				String dbPwd_tDBInput_12 = decryptedPassword_tDBInput_12;

				
	    		log.debug("tDBInput_12 - Driver ClassName: "+driverClass_tDBInput_12+".");
			
	    		log.debug("tDBInput_12 - Connection attempt to '" + url_tDBInput_12 + "' with the username '" + dbUser_tDBInput_12 + "'.");
			
					conn_tDBInput_12 = java.sql.DriverManager.getConnection(url_tDBInput_12,dbUser_tDBInput_12,dbPwd_tDBInput_12);
	    		log.debug("tDBInput_12 - Connection to '" + url_tDBInput_12 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_12 = conn_tDBInput_12.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_12 = stmtGetTZ_tDBInput_12.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_12 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_12.next()) {
					sessionTimezone_tDBInput_12 = rsGetTZ_tDBInput_12.getString(1);
				}
                                if (!(conn_tDBInput_12 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_12.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_12.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_12.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_12);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_12).setSessionTimeZone(sessionTimezone_tDBInput_12);
                                }
		    
			java.sql.Statement stmt_tDBInput_12 = conn_tDBInput_12.createStatement();

		    String dbquery_tDBInput_12 = "SELECT DISTINCT ID_UNITE_BESOIN, ID_UNITE_BESOIN_INT, UNITE_BESOIN FROM ODS_UNITE_BESOIN";
		    
	    		log.debug("tDBInput_12 - Executing the query: '" + dbquery_tDBInput_12 + "'.");
			

            	globalMap.put("tDBInput_12_QUERY",dbquery_tDBInput_12);
		    java.sql.ResultSet rs_tDBInput_12 = null;

		    try {
		    	rs_tDBInput_12 = stmt_tDBInput_12.executeQuery(dbquery_tDBInput_12);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_12 = rs_tDBInput_12.getMetaData();
		    	int colQtyInRs_tDBInput_12 = rsmd_tDBInput_12.getColumnCount();

		    String tmpContent_tDBInput_12 = null;
		    
		    
		    	log.debug("tDBInput_12 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_12.next()) {
		        nb_line_tDBInput_12++;
		        
							if(colQtyInRs_tDBInput_12 < 1) {
								row16.ID_UNITE_BESOIN = null;
							} else {
	                         		
        	row16.ID_UNITE_BESOIN = routines.system.JDBCUtil.getString(rs_tDBInput_12, 1, false);
		                    }
							if(colQtyInRs_tDBInput_12 < 2) {
								row16.ID_UNITE_BESOIN_INT = null;
							} else {
		                          
					if(rs_tDBInput_12.getObject(2) != null) {
						row16.ID_UNITE_BESOIN_INT = rs_tDBInput_12.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_12 < 3) {
								row16.UNITE_BESOIN = null;
							} else {
	                         		
        	row16.UNITE_BESOIN = routines.system.JDBCUtil.getString(rs_tDBInput_12, 3, false);
		                    }
					
						log.debug("tDBInput_12 - Retrieving the record " + nb_line_tDBInput_12 + ".");
					




 



/**
 * [tDBInput_12 begin ] stop
 */
	
	/**
	 * [tDBInput_12 main ] start
	 */

	

	
	
	currentComponent="tDBInput_12";

	

 


	tos_count_tDBInput_12++;

/**
 * [tDBInput_12 main ] stop
 */
	
	/**
	 * [tDBInput_12 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_12";

	

 



/**
 * [tDBInput_12 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row16 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row16";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row16","tDBInput_12","Oracle_UNITE_BESOIN","tOracleInput","tAdvancedHash_row16","tAdvancedHash_row16","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row16 - " + (row16==null? "": row16.toLogString()));
    			}
    		


			   
			   

					row16Struct row16_HashRow = new row16Struct();
		   	   	   
				
				row16_HashRow.ID_UNITE_BESOIN = row16.ID_UNITE_BESOIN;
				
				row16_HashRow.ID_UNITE_BESOIN_INT = row16.ID_UNITE_BESOIN_INT;
				
				row16_HashRow.UNITE_BESOIN = row16.UNITE_BESOIN;
				
			tHash_Lookup_row16.put(row16_HashRow);
			
            




 


	tos_count_tAdvancedHash_row16++;

/**
 * [tAdvancedHash_row16 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row16 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row16";

	

 



/**
 * [tAdvancedHash_row16 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row16 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row16";

	

 



/**
 * [tAdvancedHash_row16 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_12 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_12";

	

 



/**
 * [tDBInput_12 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_12 end ] start
	 */

	

	
	
	currentComponent="tDBInput_12";

	

}
}finally{
	if (rs_tDBInput_12 != null) {
		rs_tDBInput_12.close();
	}
	if (stmt_tDBInput_12 != null) {
		stmt_tDBInput_12.close();
	}
	if(conn_tDBInput_12 != null && !conn_tDBInput_12.isClosed()) {
	
	    		log.debug("tDBInput_12 - Closing the connection to the database.");
			
			conn_tDBInput_12.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_12 - Connection to the database closed.");
			
	}
	
}

globalMap.put("tDBInput_12_NB_LINE",nb_line_tDBInput_12);
	    		log.debug("tDBInput_12 - Retrieved records count: "+nb_line_tDBInput_12 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_12 - "  + ("Done.") );

ok_Hash.put("tDBInput_12", true);
end_Hash.put("tDBInput_12", System.currentTimeMillis());




/**
 * [tDBInput_12 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row16 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row16";

	

tHash_Lookup_row16.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row16",2,0,
			 			"tDBInput_12","Oracle_UNITE_BESOIN","tOracleInput","tAdvancedHash_row16","tAdvancedHash_row16","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row16", true);
end_Hash.put("tAdvancedHash_row16", System.currentTimeMillis());




/**
 * [tAdvancedHash_row16 end ] stop
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
	 * [tDBInput_12 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_12";

	

 



/**
 * [tDBInput_12 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row16 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row16";

	

 



/**
 * [tAdvancedHash_row16 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_12_SUBPROCESS_STATE", 1);
	}
	


public static class row19Struct implements routines.system.IPersistableComparableLookupRow<row19Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal ID_FAMILLE_INT;

				public BigDecimal getID_FAMILLE_INT () {
					return this.ID_FAMILLE_INT;
				}
				
			    public String ID_FAMILLE;

				public String getID_FAMILLE () {
					return this.ID_FAMILLE;
				}
				
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_FAMILLE_INT == null) ? 0 : new Double(this.ID_FAMILLE_INT.doubleValue()).hashCode());
						
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
		final row19Struct other = (row19Struct) obj;
		
						if (this.ID_FAMILLE_INT == null) {
							if (other.ID_FAMILLE_INT != null)
								return false;
						
						} else if ((other.ID_FAMILLE_INT == null) || (this.ID_FAMILLE_INT.compareTo(other.ID_FAMILLE_INT)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row19Struct other) {

		other.ID_FAMILLE_INT = this.ID_FAMILLE_INT;
	            other.ID_FAMILLE = this.ID_FAMILLE;
	            other.ID_RAYON_INT = this.ID_RAYON_INT;
	            other.FAMILLE = this.FAMILLE;
	            
	}

	public void copyKeysDataTo(row19Struct other) {

		other.ID_FAMILLE_INT = this.ID_FAMILLE_INT;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FAMILLE_INT);
					
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
		
						this.ID_FAMILLE = readString(dis,ois);
					
       			    	this.ID_RAYON_INT = (BigDecimal) ois.readObject();
					
						this.FAMILLE = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ID_FAMILLE = readString(dis,objectIn);
					
       			    	this.ID_RAYON_INT = (BigDecimal) objectIn.readObject();
					
						this.FAMILLE = readString(dis,objectIn);
					
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

		
						writeString(this.ID_FAMILLE, dos, oos);
					
       			    	oos.writeObject(this.ID_RAYON_INT);
					
						writeString(this.FAMILLE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.ID_FAMILLE, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_RAYON_INT);
					
						writeString(this.FAMILLE, dos, objectOut);
					
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
		sb.append("ID_FAMILLE_INT="+String.valueOf(ID_FAMILLE_INT));
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",FAMILLE="+FAMILLE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_FAMILLE_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row19Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_FAMILLE_INT, other.ID_FAMILLE_INT);
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
public void tDBInput_13Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_13_SUBPROCESS_STATE", 0);

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



		row19Struct row19 = new row19Struct();




	
	/**
	 * [tAdvancedHash_row19 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row19", false);
		start_Hash.put("tAdvancedHash_row19", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row19";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row19");
			
		int tos_count_tAdvancedHash_row19 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row19", "tAdvancedHash_row19", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row19
			   		// source node:tDBInput_13 - inputs:(after_tDBInput_8) outputs:(row19,row19) | target node:tAdvancedHash_row19 - inputs:(row19) outputs:()
			   		// linked node: tMap_9 - inputs:(out8,row17,row18,row21,row16,row19,row20) outputs:(out9)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row19 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row19Struct> tHash_Lookup_row19 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row19Struct>getLookup(matchingModeEnum_row19);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row19", tHash_Lookup_row19);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row19 begin ] stop
 */



	
	/**
	 * [tDBInput_13 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_13", false);
		start_Hash.put("tDBInput_13", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_13";

	
		int tos_count_tDBInput_13 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_13 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_13{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_13 = new StringBuilder();
                    log4jParamters_tDBInput_13.append("Parameters:");
                            log4jParamters_tDBInput_13.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:FSLa1sbT7Rn6zFxWRr0Y6gPujJjY/PlQPm4kKIsVHcOrx8qW").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("QUERY" + " = " + "\"SELECT *FROM ODS_FAMILLE\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FAMILLE")+"}]");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_13.append(" | ");
                            log4jParamters_tDBInput_13.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_13.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_13 - "  + (log4jParamters_tDBInput_13) );
                    } 
                } 
            new BytesLimit65535_tDBInput_13().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_13", "Oracle_FAMILE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_13 = 0;
		    java.sql.Connection conn_tDBInput_13 = null;
				String driverClass_tDBInput_13 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_13);
				
			String url_tDBInput_13 = null;
				url_tDBInput_13 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_13 = "ods";

				

				 
	final String decryptedPassword_tDBInput_13 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:BNaApWDdP8muMfSNpZU8l7EMC3cw7OcHHu4xl/dAIHHKy5ve");

				String dbPwd_tDBInput_13 = decryptedPassword_tDBInput_13;

				
	    		log.debug("tDBInput_13 - Driver ClassName: "+driverClass_tDBInput_13+".");
			
	    		log.debug("tDBInput_13 - Connection attempt to '" + url_tDBInput_13 + "' with the username '" + dbUser_tDBInput_13 + "'.");
			
					conn_tDBInput_13 = java.sql.DriverManager.getConnection(url_tDBInput_13,dbUser_tDBInput_13,dbPwd_tDBInput_13);
	    		log.debug("tDBInput_13 - Connection to '" + url_tDBInput_13 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_13 = conn_tDBInput_13.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_13 = stmtGetTZ_tDBInput_13.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_13 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_13.next()) {
					sessionTimezone_tDBInput_13 = rsGetTZ_tDBInput_13.getString(1);
				}
                                if (!(conn_tDBInput_13 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_13.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_13.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_13.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_13);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_13).setSessionTimeZone(sessionTimezone_tDBInput_13);
                                }
		    
			java.sql.Statement stmt_tDBInput_13 = conn_tDBInput_13.createStatement();

		    String dbquery_tDBInput_13 = "SELECT *FROM ODS_FAMILLE";
		    
	    		log.debug("tDBInput_13 - Executing the query: '" + dbquery_tDBInput_13 + "'.");
			

            	globalMap.put("tDBInput_13_QUERY",dbquery_tDBInput_13);
		    java.sql.ResultSet rs_tDBInput_13 = null;

		    try {
		    	rs_tDBInput_13 = stmt_tDBInput_13.executeQuery(dbquery_tDBInput_13);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_13 = rs_tDBInput_13.getMetaData();
		    	int colQtyInRs_tDBInput_13 = rsmd_tDBInput_13.getColumnCount();

		    String tmpContent_tDBInput_13 = null;
		    
		    
		    	log.debug("tDBInput_13 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_13.next()) {
		        nb_line_tDBInput_13++;
		        
							if(colQtyInRs_tDBInput_13 < 1) {
								row19.ID_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_13.getObject(1) != null) {
						row19.ID_FAMILLE_INT = rs_tDBInput_13.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_13 < 2) {
								row19.ID_FAMILLE = null;
							} else {
	                         		
        	row19.ID_FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_13, 2, false);
		                    }
							if(colQtyInRs_tDBInput_13 < 3) {
								row19.ID_RAYON_INT = null;
							} else {
		                          
					if(rs_tDBInput_13.getObject(3) != null) {
						row19.ID_RAYON_INT = rs_tDBInput_13.getBigDecimal(3);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_13 < 4) {
								row19.FAMILLE = null;
							} else {
	                         		
        	row19.FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_13, 4, false);
		                    }
					
						log.debug("tDBInput_13 - Retrieving the record " + nb_line_tDBInput_13 + ".");
					




 



/**
 * [tDBInput_13 begin ] stop
 */
	
	/**
	 * [tDBInput_13 main ] start
	 */

	

	
	
	currentComponent="tDBInput_13";

	

 


	tos_count_tDBInput_13++;

/**
 * [tDBInput_13 main ] stop
 */
	
	/**
	 * [tDBInput_13 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_13";

	

 



/**
 * [tDBInput_13 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row19 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row19";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row19","tDBInput_13","Oracle_FAMILE","tOracleInput","tAdvancedHash_row19","tAdvancedHash_row19","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row19 - " + (row19==null? "": row19.toLogString()));
    			}
    		


			   
			   

					row19Struct row19_HashRow = new row19Struct();
		   	   	   
				
				row19_HashRow.ID_FAMILLE_INT = row19.ID_FAMILLE_INT;
				
				row19_HashRow.ID_FAMILLE = row19.ID_FAMILLE;
				
				row19_HashRow.ID_RAYON_INT = row19.ID_RAYON_INT;
				
				row19_HashRow.FAMILLE = row19.FAMILLE;
				
			tHash_Lookup_row19.put(row19_HashRow);
			
            




 


	tos_count_tAdvancedHash_row19++;

/**
 * [tAdvancedHash_row19 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row19 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row19";

	

 



/**
 * [tAdvancedHash_row19 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row19 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row19";

	

 



/**
 * [tAdvancedHash_row19 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_13 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_13";

	

 



/**
 * [tDBInput_13 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_13 end ] start
	 */

	

	
	
	currentComponent="tDBInput_13";

	

}
}finally{
	if (rs_tDBInput_13 != null) {
		rs_tDBInput_13.close();
	}
	if (stmt_tDBInput_13 != null) {
		stmt_tDBInput_13.close();
	}
	if(conn_tDBInput_13 != null && !conn_tDBInput_13.isClosed()) {
	
	    		log.debug("tDBInput_13 - Closing the connection to the database.");
			
			conn_tDBInput_13.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_13 - Connection to the database closed.");
			
	}
	
}

globalMap.put("tDBInput_13_NB_LINE",nb_line_tDBInput_13);
	    		log.debug("tDBInput_13 - Retrieved records count: "+nb_line_tDBInput_13 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_13 - "  + ("Done.") );

ok_Hash.put("tDBInput_13", true);
end_Hash.put("tDBInput_13", System.currentTimeMillis());




/**
 * [tDBInput_13 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row19 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row19";

	

tHash_Lookup_row19.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row19",2,0,
			 			"tDBInput_13","Oracle_FAMILE","tOracleInput","tAdvancedHash_row19","tAdvancedHash_row19","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row19", true);
end_Hash.put("tAdvancedHash_row19", System.currentTimeMillis());




/**
 * [tAdvancedHash_row19 end ] stop
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
	 * [tDBInput_13 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_13";

	

 



/**
 * [tDBInput_13 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row19 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row19";

	

 



/**
 * [tAdvancedHash_row19 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_13_SUBPROCESS_STATE", 1);
	}
	


public static class row20Struct implements routines.system.IPersistableComparableLookupRow<row20Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_ODS_ARTICLE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal ID_RAYON_INT;

				public BigDecimal getID_RAYON_INT () {
					return this.ID_RAYON_INT;
				}
				
			    public BigDecimal ID_DEPARTEMENT_INT;

				public BigDecimal getID_DEPARTEMENT_INT () {
					return this.ID_DEPARTEMENT_INT;
				}
				
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_RAYON_INT == null) ? 0 : new Double(this.ID_RAYON_INT.doubleValue()).hashCode());
						
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
		final row20Struct other = (row20Struct) obj;
		
						if (this.ID_RAYON_INT == null) {
							if (other.ID_RAYON_INT != null)
								return false;
						
						} else if ((other.ID_RAYON_INT == null) || (this.ID_RAYON_INT.compareTo(other.ID_RAYON_INT)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row20Struct other) {

		other.ID_RAYON_INT = this.ID_RAYON_INT;
	            other.ID_DEPARTEMENT_INT = this.ID_DEPARTEMENT_INT;
	            other.ID_RAYON = this.ID_RAYON;
	            other.RAYON = this.RAYON;
	            
	}

	public void copyKeysDataTo(row20Struct other) {

		other.ID_RAYON_INT = this.ID_RAYON_INT;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_ODS_ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_RAYON_INT);
					
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
		
       			    	this.ID_DEPARTEMENT_INT = (BigDecimal) ois.readObject();
					
						this.ID_RAYON = readString(dis,ois);
					
						this.RAYON = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
       			    	this.ID_DEPARTEMENT_INT = (BigDecimal) objectIn.readObject();
					
						this.ID_RAYON = readString(dis,objectIn);
					
						this.RAYON = readString(dis,objectIn);
					
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

		
       			    	oos.writeObject(this.ID_DEPARTEMENT_INT);
					
						writeString(this.ID_RAYON, dos, oos);
					
						writeString(this.RAYON, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
       			    	objectOut.writeObject(this.ID_DEPARTEMENT_INT);
					
						writeString(this.ID_RAYON, dos, objectOut);
					
						writeString(this.RAYON, dos, objectOut);
					
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
		sb.append("ID_RAYON_INT="+String.valueOf(ID_RAYON_INT));
		sb.append(",ID_DEPARTEMENT_INT="+String.valueOf(ID_DEPARTEMENT_INT));
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",RAYON="+RAYON);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_RAYON_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPARTEMENT_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPARTEMENT_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row20Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_RAYON_INT, other.ID_RAYON_INT);
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
public void tDBInput_14Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_14_SUBPROCESS_STATE", 0);

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



		row20Struct row20 = new row20Struct();




	
	/**
	 * [tAdvancedHash_row20 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row20", false);
		start_Hash.put("tAdvancedHash_row20", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row20";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row20");
			
		int tos_count_tAdvancedHash_row20 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row20", "tAdvancedHash_row20", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row20
			   		// source node:tDBInput_14 - inputs:(after_tDBInput_8) outputs:(row20,row20) | target node:tAdvancedHash_row20 - inputs:(row20) outputs:()
			   		// linked node: tMap_9 - inputs:(out8,row17,row18,row21,row16,row19,row20) outputs:(out9)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row20 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row20Struct> tHash_Lookup_row20 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row20Struct>getLookup(matchingModeEnum_row20);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row20", tHash_Lookup_row20);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row20 begin ] stop
 */



	
	/**
	 * [tDBInput_14 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_14", false);
		start_Hash.put("tDBInput_14", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_14";

	
		int tos_count_tDBInput_14 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_14 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_14{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_14 = new StringBuilder();
                    log4jParamters_tDBInput_14.append("Parameters:");
                            log4jParamters_tDBInput_14.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("DB_VERSION" + " = " + "ORACLE_11");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:osL5CXYo2L7n/ZJL3nyGKmwSlaZInG+wy8sBPBeYiPdstU/s").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("QUERY" + " = " + "\"SELECT *FROM ODS_RAYON\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPARTEMENT_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RAYON")+"}]");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_14.append(" | ");
                            log4jParamters_tDBInput_14.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_14.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_14 - "  + (log4jParamters_tDBInput_14) );
                    } 
                } 
            new BytesLimit65535_tDBInput_14().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_14", "Oracle_RAYON", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_14 = 0;
		    java.sql.Connection conn_tDBInput_14 = null;
				String driverClass_tDBInput_14 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_14);
				
			String url_tDBInput_14 = null;
				url_tDBInput_14 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_14 = "ods";

				

				 
	final String decryptedPassword_tDBInput_14 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:u+ZO7NHaQj0yFBdejTjMiUdAC7wRXq8p4N56uw7AVcZ402zd");

				String dbPwd_tDBInput_14 = decryptedPassword_tDBInput_14;

				
	    		log.debug("tDBInput_14 - Driver ClassName: "+driverClass_tDBInput_14+".");
			
	    		log.debug("tDBInput_14 - Connection attempt to '" + url_tDBInput_14 + "' with the username '" + dbUser_tDBInput_14 + "'.");
			
					conn_tDBInput_14 = java.sql.DriverManager.getConnection(url_tDBInput_14,dbUser_tDBInput_14,dbPwd_tDBInput_14);
	    		log.debug("tDBInput_14 - Connection to '" + url_tDBInput_14 + "' has succeeded.");
			
				java.sql.Statement stmtGetTZ_tDBInput_14 = conn_tDBInput_14.createStatement();
				java.sql.ResultSet rsGetTZ_tDBInput_14 = stmtGetTZ_tDBInput_14.executeQuery("select sessiontimezone from dual");
				String sessionTimezone_tDBInput_14 = java.util.TimeZone.getDefault().getID();
				while (rsGetTZ_tDBInput_14.next()) {
					sessionTimezone_tDBInput_14 = rsGetTZ_tDBInput_14.getString(1);
				}
                                if (!(conn_tDBInput_14 instanceof oracle.jdbc.OracleConnection) &&
                                        conn_tDBInput_14.isWrapperFor(oracle.jdbc.OracleConnection.class)) {
                                    if (conn_tDBInput_14.unwrap(oracle.jdbc.OracleConnection.class) != null) {
                                        ((oracle.jdbc.OracleConnection)conn_tDBInput_14.unwrap(oracle.jdbc.OracleConnection.class)).setSessionTimeZone(sessionTimezone_tDBInput_14);
                                    }
                                } else {
                                    ((oracle.jdbc.OracleConnection)conn_tDBInput_14).setSessionTimeZone(sessionTimezone_tDBInput_14);
                                }
		    
			java.sql.Statement stmt_tDBInput_14 = conn_tDBInput_14.createStatement();

		    String dbquery_tDBInput_14 = "SELECT *FROM ODS_RAYON";
		    
	    		log.debug("tDBInput_14 - Executing the query: '" + dbquery_tDBInput_14 + "'.");
			

            	globalMap.put("tDBInput_14_QUERY",dbquery_tDBInput_14);
		    java.sql.ResultSet rs_tDBInput_14 = null;

		    try {
		    	rs_tDBInput_14 = stmt_tDBInput_14.executeQuery(dbquery_tDBInput_14);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_14 = rs_tDBInput_14.getMetaData();
		    	int colQtyInRs_tDBInput_14 = rsmd_tDBInput_14.getColumnCount();

		    String tmpContent_tDBInput_14 = null;
		    
		    
		    	log.debug("tDBInput_14 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_14.next()) {
		        nb_line_tDBInput_14++;
		        
							if(colQtyInRs_tDBInput_14 < 1) {
								row20.ID_RAYON_INT = null;
							} else {
		                          
					if(rs_tDBInput_14.getObject(1) != null) {
						row20.ID_RAYON_INT = rs_tDBInput_14.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_14 < 2) {
								row20.ID_DEPARTEMENT_INT = null;
							} else {
		                          
					if(rs_tDBInput_14.getObject(2) != null) {
						row20.ID_DEPARTEMENT_INT = rs_tDBInput_14.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_14 < 3) {
								row20.ID_RAYON = null;
							} else {
	                         		
        	row20.ID_RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_14, 3, false);
		                    }
							if(colQtyInRs_tDBInput_14 < 4) {
								row20.RAYON = null;
							} else {
	                         		
        	row20.RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_14, 4, false);
		                    }
					
						log.debug("tDBInput_14 - Retrieving the record " + nb_line_tDBInput_14 + ".");
					




 



/**
 * [tDBInput_14 begin ] stop
 */
	
	/**
	 * [tDBInput_14 main ] start
	 */

	

	
	
	currentComponent="tDBInput_14";

	

 


	tos_count_tDBInput_14++;

/**
 * [tDBInput_14 main ] stop
 */
	
	/**
	 * [tDBInput_14 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_14";

	

 



/**
 * [tDBInput_14 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row20 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row20";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row20","tDBInput_14","Oracle_RAYON","tOracleInput","tAdvancedHash_row20","tAdvancedHash_row20","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row20 - " + (row20==null? "": row20.toLogString()));
    			}
    		


			   
			   

					row20Struct row20_HashRow = new row20Struct();
		   	   	   
				
				row20_HashRow.ID_RAYON_INT = row20.ID_RAYON_INT;
				
				row20_HashRow.ID_DEPARTEMENT_INT = row20.ID_DEPARTEMENT_INT;
				
				row20_HashRow.ID_RAYON = row20.ID_RAYON;
				
				row20_HashRow.RAYON = row20.RAYON;
				
			tHash_Lookup_row20.put(row20_HashRow);
			
            




 


	tos_count_tAdvancedHash_row20++;

/**
 * [tAdvancedHash_row20 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row20 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row20";

	

 



/**
 * [tAdvancedHash_row20 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row20 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row20";

	

 



/**
 * [tAdvancedHash_row20 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_14 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_14";

	

 



/**
 * [tDBInput_14 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_14 end ] start
	 */

	

	
	
	currentComponent="tDBInput_14";

	

}
}finally{
	if (rs_tDBInput_14 != null) {
		rs_tDBInput_14.close();
	}
	if (stmt_tDBInput_14 != null) {
		stmt_tDBInput_14.close();
	}
	if(conn_tDBInput_14 != null && !conn_tDBInput_14.isClosed()) {
	
	    		log.debug("tDBInput_14 - Closing the connection to the database.");
			
			conn_tDBInput_14.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_14 - Connection to the database closed.");
			
	}
	
}

globalMap.put("tDBInput_14_NB_LINE",nb_line_tDBInput_14);
	    		log.debug("tDBInput_14 - Retrieved records count: "+nb_line_tDBInput_14 + " .");
			
 
                if(log.isDebugEnabled())
            log.debug("tDBInput_14 - "  + ("Done.") );

ok_Hash.put("tDBInput_14", true);
end_Hash.put("tDBInput_14", System.currentTimeMillis());




/**
 * [tDBInput_14 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row20 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row20";

	

tHash_Lookup_row20.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row20",2,0,
			 			"tDBInput_14","Oracle_RAYON","tOracleInput","tAdvancedHash_row20","tAdvancedHash_row20","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row20", true);
end_Hash.put("tAdvancedHash_row20", System.currentTimeMillis());




/**
 * [tAdvancedHash_row20 end ] stop
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
	 * [tDBInput_14 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_14";

	

 



/**
 * [tDBInput_14 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row20 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row20";

	

 



/**
 * [tAdvancedHash_row20 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_14_SUBPROCESS_STATE", 1);
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
        final ODS_ARTICLE ODS_ARTICLEClass = new ODS_ARTICLE();

        int exitCode = ODS_ARTICLEClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'ODS_ARTICLE' - Done.");
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
        	log.info("TalendJob: 'ODS_ARTICLE' - Start.");
    	
    	
    	
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
            java.io.InputStream inContext = ODS_ARTICLE.class.getClassLoader().getResourceAsStream("bi_team_projects/ods_article_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = ODS_ARTICLE.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : ODS_ARTICLE");
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


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();






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
 *     909554 characters generated by Talend Cloud Data Management Platform 
 *     on the 22 juillet 2022 à 15:57:39 WEST
 ************************************************************************************************/