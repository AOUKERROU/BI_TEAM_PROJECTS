
package bi_team_projects.dwh__ca__jours_0_1;

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
 * Job: DWH__CA__JOURS Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status 
 */
public class DWH__CA__JOURS implements TalendJob {
	static {System.setProperty("TalendJob.log", "DWH__CA__JOURS.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(DWH__CA__JOURS.class);
	

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
	private final String jobName = "DWH__CA__JOURS";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_h-ccgEFCEeyhHY8XgXwr1Q", "0.1");
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
				DWH__CA__JOURS.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(DWH__CA__JOURS.this, new Object[] { e , currentComponent, globalMap});
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

			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
						
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tConvertType_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
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
						
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_2_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowMeter_14_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tAdvancedHash_row5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tWarn_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public String DT_JOUR;

				public String getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_RAYON_EX;

				public String getID_RAYON_EX () {
					return this.ID_RAYON_EX;
				}
				
			    public String GP;

				public String getGP () {
					return this.GP;
				}
				
			    public String CNUF_PRINCIPALE;

				public String getCNUF_PRINCIPALE () {
					return this.CNUF_PRINCIPALE;
				}
				
			    public String CNUF_DIRECT;

				public String getCNUF_DIRECT () {
					return this.CNUF_DIRECT;
				}
				
			    public BigDecimal ID_ENTITE;

				public BigDecimal getID_ENTITE () {
					return this.ID_ENTITE;
				}
				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal PRIX_REVIENT_VENTE;

				public BigDecimal getPRIX_REVIENT_VENTE () {
					return this.PRIX_REVIENT_VENTE;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_RAYON_EX = readString(dis);
					
					this.GP = readString(dis);
					
					this.CNUF_PRINCIPALE = readString(dis);
					
					this.CNUF_DIRECT = readString(dis);
					
						this.ID_ENTITE = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_VENTE = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_RAYON_EX = readString(dis);
					
					this.GP = readString(dis);
					
					this.CNUF_PRINCIPALE = readString(dis);
					
					this.CNUF_DIRECT = readString(dis);
					
						this.ID_ENTITE = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_VENTE = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
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
				
						writeString(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_RAYON_EX,dos);
					
					// String
				
						writeString(this.GP,dos);
					
					// String
				
						writeString(this.CNUF_PRINCIPALE,dos);
					
					// String
				
						writeString(this.CNUF_DIRECT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_RAYON_EX,dos);
					
					// String
				
						writeString(this.GP,dos);
					
					// String
				
						writeString(this.CNUF_PRINCIPALE,dos);
					
					// String
				
						writeString(this.CNUF_DIRECT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+DT_JOUR);
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_RAYON_EX="+ID_RAYON_EX);
		sb.append(",GP="+GP);
		sb.append(",CNUF_PRINCIPALE="+CNUF_PRINCIPALE);
		sb.append(",CNUF_DIRECT="+CNUF_DIRECT);
		sb.append(",ID_ENTITE="+String.valueOf(ID_ENTITE));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",PRIX_REVIENT_VENTE="+String.valueOf(PRIX_REVIENT_VENTE));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(ID_RAYON_EX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_EX);
            			}
            		
        			sb.append("|");
        		
        				if(GP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GP);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF_PRINCIPALE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF_PRINCIPALE);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF_DIRECT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF_DIRECT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ENTITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ENTITE);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(PRIX_REVIENT_VENTE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIX_REVIENT_VENTE);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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

public static class copyOfout1Struct implements routines.system.IPersistableRow<copyOfout1Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public String DT_JOUR;

				public String getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_RAYON_EX;

				public String getID_RAYON_EX () {
					return this.ID_RAYON_EX;
				}
				
			    public String GP;

				public String getGP () {
					return this.GP;
				}
				
			    public String CNUF_PRINCIPALE;

				public String getCNUF_PRINCIPALE () {
					return this.CNUF_PRINCIPALE;
				}
				
			    public String CNUF_DIRECT;

				public String getCNUF_DIRECT () {
					return this.CNUF_DIRECT;
				}
				
			    public BigDecimal ID_ENTITE;

				public BigDecimal getID_ENTITE () {
					return this.ID_ENTITE;
				}
				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal PRIX_REVIENT_VENTE;

				public BigDecimal getPRIX_REVIENT_VENTE () {
					return this.PRIX_REVIENT_VENTE;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_RAYON_EX = readString(dis);
					
					this.GP = readString(dis);
					
					this.CNUF_PRINCIPALE = readString(dis);
					
					this.CNUF_DIRECT = readString(dis);
					
						this.ID_ENTITE = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_VENTE = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_RAYON_EX = readString(dis);
					
					this.GP = readString(dis);
					
					this.CNUF_PRINCIPALE = readString(dis);
					
					this.CNUF_DIRECT = readString(dis);
					
						this.ID_ENTITE = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_VENTE = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
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
				
						writeString(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_RAYON_EX,dos);
					
					// String
				
						writeString(this.GP,dos);
					
					// String
				
						writeString(this.CNUF_PRINCIPALE,dos);
					
					// String
				
						writeString(this.CNUF_DIRECT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_RAYON_EX,dos);
					
					// String
				
						writeString(this.GP,dos);
					
					// String
				
						writeString(this.CNUF_PRINCIPALE,dos);
					
					// String
				
						writeString(this.CNUF_DIRECT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+DT_JOUR);
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_RAYON_EX="+ID_RAYON_EX);
		sb.append(",GP="+GP);
		sb.append(",CNUF_PRINCIPALE="+CNUF_PRINCIPALE);
		sb.append(",CNUF_DIRECT="+CNUF_DIRECT);
		sb.append(",ID_ENTITE="+String.valueOf(ID_ENTITE));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",PRIX_REVIENT_VENTE="+String.valueOf(PRIX_REVIENT_VENTE));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(ID_RAYON_EX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_EX);
            			}
            		
        			sb.append("|");
        		
        				if(GP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GP);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF_PRINCIPALE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF_PRINCIPALE);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF_DIRECT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF_DIRECT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ENTITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ENTITE);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(PRIX_REVIENT_VENTE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIX_REVIENT_VENTE);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(copyOfout1Struct other) {

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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_RAYON_EX;

				public String getID_RAYON_EX () {
					return this.ID_RAYON_EX;
				}
				
			    public String GP;

				public String getGP () {
					return this.GP;
				}
				
			    public String CNUF_PRINCIPALE;

				public String getCNUF_PRINCIPALE () {
					return this.CNUF_PRINCIPALE;
				}
				
			    public String CNUF_DIRECT;

				public String getCNUF_DIRECT () {
					return this.CNUF_DIRECT;
				}
				
			    public BigDecimal ID_ENTITE;

				public BigDecimal getID_ENTITE () {
					return this.ID_ENTITE;
				}
				
			    public BigDecimal QTE_STOCK;

				public BigDecimal getQTE_STOCK () {
					return this.QTE_STOCK;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal PRIX_REVIENT_VENTE;

				public BigDecimal getPRIX_REVIENT_VENTE () {
					return this.PRIX_REVIENT_VENTE;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_RAYON_EX = readString(dis);
					
					this.GP = readString(dis);
					
					this.CNUF_PRINCIPALE = readString(dis);
					
					this.CNUF_DIRECT = readString(dis);
					
						this.ID_ENTITE = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_VENTE = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_RAYON_EX = readString(dis);
					
					this.GP = readString(dis);
					
					this.CNUF_PRINCIPALE = readString(dis);
					
					this.CNUF_DIRECT = readString(dis);
					
						this.ID_ENTITE = (BigDecimal) dis.readObject();
					
						this.QTE_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_VENTE = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_RAYON_EX,dos);
					
					// String
				
						writeString(this.GP,dos);
					
					// String
				
						writeString(this.CNUF_PRINCIPALE,dos);
					
					// String
				
						writeString(this.CNUF_DIRECT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_RAYON_EX,dos);
					
					// String
				
						writeString(this.GP,dos);
					
					// String
				
						writeString(this.CNUF_PRINCIPALE,dos);
					
					// String
				
						writeString(this.CNUF_DIRECT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ENTITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_VENTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_RAYON_EX="+ID_RAYON_EX);
		sb.append(",GP="+GP);
		sb.append(",CNUF_PRINCIPALE="+CNUF_PRINCIPALE);
		sb.append(",CNUF_DIRECT="+CNUF_DIRECT);
		sb.append(",ID_ENTITE="+String.valueOf(ID_ENTITE));
		sb.append(",QTE_STOCK="+String.valueOf(QTE_STOCK));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",PRIX_REVIENT_VENTE="+String.valueOf(PRIX_REVIENT_VENTE));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
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
        		
        				if(ID_RAYON_EX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON_EX);
            			}
            		
        			sb.append("|");
        		
        				if(GP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GP);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF_PRINCIPALE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF_PRINCIPALE);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF_DIRECT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF_DIRECT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ENTITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ENTITE);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(PRIX_REVIENT_VENTE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIX_REVIENT_VENTE);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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



		row7Struct row7 = new row7Struct();
copyOfout1Struct copyOfout1 = new copyOfout1Struct();
row9Struct row9 = new row9Struct();






	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
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
                            log4jParamters_tDBOutput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:HtcoRE8t5Y9fh+Xs7JYNrNjrWMoZFDG++BW3UsO/U4GSn70x").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"ods_ca_jour\"");
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
                            log4jParamters_tDBOutput_1.append("COMMIT_EVERY" + " = " + "1000");
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
				talendJobLog.addCM("tDBOutput_1", "Oracle_ODS_CA_JOUR", "tOracleOutput");
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
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:mUln2+tLzJEo+TKVWjOkj4erEv4rlZodiunjSjBEQwsay5Rh");

                String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;
                dbschema_tDBOutput_1 = "ODS";

                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection attempts to '")  + (url_tDBOutput_1)  + ("' with the username '")  + (dbUser_tDBOutput_1)  + ("'.") );

                    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1, dbUser_tDBOutput_1, dbPwd_tDBOutput_1);
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection to '")  + (url_tDBOutput_1)  + ("' has succeeded.") );
        resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
            conn_tDBOutput_1.setAutoCommit(false);
            int commitEvery_tDBOutput_1 = 1000;
            int commitCounter_tDBOutput_1 = 0;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_1.getAutoCommit())  + ("'.") );
        int count_tDBOutput_1=0;

        if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
            tableName_tDBOutput_1 = ("ods_ca_jour");
        } else {
            tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "." + ("ods_ca_jour");
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
                String insert_tDBOutput_1 = "INSERT INTO " + tableName_tDBOutput_1 + " (DT_JOUR,ID_ARTICLE_INR,ID_ARTICLE_INV,ID_RAYON_EX,GP,CNUF_PRINCIPALE,CNUF_DIRECT,ID_ENTITE,QTE_STOCK,VALEUR_STOCK,PRIX_REVIENT_VENTE,QTE_VENDUE,CA_HT,CA_TTC,TAUX_TVA,TVA,CYCLE_DE_VIE,DEP,PI,FID,MARGE_BRUT_UNIT) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
                        resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);





 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tConvertType_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tConvertType_1", false);
		start_Hash.put("tConvertType_1", System.currentTimeMillis());
		
	
	currentComponent="tConvertType_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"copyOfout1");
			
		int tos_count_tConvertType_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tConvertType_1", "tConvertType_1", "tConvertType");
				talendJobLogProcess(globalMap);
			}
			
	int nb_line_tConvertType_1 = 0;  
 



/**
 * [tConvertType_1 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row7");
			
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
		int count_row7_tMap_6 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6__Struct  {
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_copyOfout1_tMap_6 = 0;
				
copyOfout1Struct copyOfout1_tmp = new copyOfout1Struct();
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
                            log4jParamters_tDBInput_6.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:DsSzydwfDvLxzk/2Tro2fUscHwVzwPjlSpOkD5rPRwFl4Q==").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERY" + " = " + "\"select id_article_inr,id_article_inv,id_rayon_ex,gp,cnuf_principale,cnuf_direct,id_entite,qte_stock,valeur_stock,prix_revient_vente,qte_vendue,ca_ht,  ca_ttc,taux_tva,tva,cycle_de_vie,dep,pi,fid,  marge_unitaire_valeur  from ( select arvcinr as id_article_inr,t.stmcinl as id_article_inv,pkstrucobj.get_cext (pkstrucrel.get_niveau (1,arvcinr,3,sysdate))as id_rayon_ex,  mj_gram.getgpnumadate (arvcinr, trunc (sysdate)) gp,decode (pkfoudgene.get_cnuf (mj_pkmarjane.get_fournisseur_principal (arvcinr, t.stmsite, sysdate)),'-1', nvl((select pkfoudgene.get_cnuf (fclcfin)  from foucatalog where fclcinv = t.stmcinl and trunc (sysdate) between fclddeb and fcldfin and rownum = 1),'-1'),  pkfoudgene.get_cnuf (mj_pkmarjane.get_fournisseur_principal (arvcinr, t.stmsite, sysdate))) as cnuf_principale,  decode (pkfoudgene.get_cnuf (mj_pk_wholesale.recup_fourn_princ (arvcinr, trunc (sysdate))),'-1', nvl((select pkfoudgene.get_cnuf (fclcfin)  from foucatalog where fclcinv = t.stmcinl and trunc (sysdate) between fclddeb and fcldfin and rownum = 1),'-1'),  pkfoudgene.get_cnuf (mj_pk_wholesale.recup_fourn_princ (arvcinr, trunc (sysdate))))as cnuf_direct,  t.stmsite as id_entite, case when sum (t.stmval)=0 then 0 else sum (t.stmvpr)/sum (t.stmval) end as prix_revient_vente,  pkstock.getstockdispoenpds(t.stmsite, t.stmcinl) qte_stock,  pkstock.getstockdispoenvaleur(t.stmsite, t.stmcinl) valeur_stock,  -sum(t.stmval) as qte_vendue,  -sum(t.stmvpv - t.stmtva) as ca_ht,  -sum(t.stmvpv) as ca_ttc,  (select pktvas.gettauxtva(arttvav, 3, trunc(sysdate)) from artrac where  artcinr = arvcinr) as taux_tva,  -sum(t.stmtva) as tva,  mj_pk_cycledevie.recup_cycle_de_vie(arvcinr, -1, t.stmsite) cycle_de_vie,  (select nvl (pkattrival.getlibellelongattribut ('DEP', aatcatt, 'FR'),'ND')from artattri a where 1 = 1 and a.aatccla = 'DEP' and a.aatcinr = v.arvcinr  and trunc(stmdmvt) between a.aatddeb and a.aatdfin and rownum = 1) dep,  (select nvl (pkattrival.getlibellelongattribut ('PI', aatcatt, 'FR'),'ND') from artattri a where 1 = 1 and a.aatccla = 'PI' and a.aatcinr = v.arvcinr  and trunc(stmdmvt) between a.aatddeb and a.aatdfin and rownum = 1) pi, (select nvl (pkattrival.getlibellelongattribut ('FID', aatcatt, 'FR'),'ND')  from artattri a where 1 = 1 and a.aatccla = 'FID' and a.aatcinr = v.arvcinr and trunc(stmdmvt) between a.aatddeb and a.aatdfin and rownum = 1)fid,  case when sum (t.stmval)=0 then 0 else sum((nvl (t.stmvpv, 0) - nvl (t.stmtva, 0) - nvl (t.stmvpr, 0))) /sum(t.stmval) end as  marge_unitaire_valeur  from artuv v, stomvt t  where 1 = 1  and stmdmvt >= to_date (sysdate-1, 'DD/MM/RRRR')   and stmdmvt < trunc(to_date (sysdate-1, 'DD/MM/RRRR')+1)  and t.stmtmvt between 150 and 174  and t.stmcinl = v.arvcinv    and t.stmsite in (select socsite from sitdgene                     where socsite not in (95, 96, 98, 99)                       and soccmag = 10)  group by t.stmcinl,  v.arvcinr,  t.stmsite,  trunc (stmdmvt),  arvcinv  )  \"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TRIM_ALL_COLUMN" + " = " + "true");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("NO_NULL_VALUES" + " = " + "true");
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
				String driverClass_tDBInput_6 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_6);
				
			String url_tDBInput_6 = null;
				url_tDBInput_6 = "jdbc:oracle:thin:@" + "192.168.99.98" + ":" + "1521" + ":" + "GOLDV5";

				String dbUser_tDBInput_6 = "CENPRD";

				

				 
	final String decryptedPassword_tDBInput_6 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Fa9Ic2mm1LPn4IzXevTbtfoKUvJ3+ds35R1iGKFOjjTHSg==");

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

		    String dbquery_tDBInput_6 = "select id_article_inr,id_article_inv,id_rayon_ex,gp,cnuf_principale,cnuf_direct,id_entite,qte_stock,valeur_stock,prix_r"
+"evient_vente,qte_vendue,ca_ht,\nca_ttc,taux_tva,tva,cycle_de_vie,dep,pi,fid,  marge_unitaire_valeur\nfrom ( select arvci"
+"nr as id_article_inr,t.stmcinl as id_article_inv,pkstrucobj.get_cext (pkstrucrel.get_niveau (1,arvcinr,3,sysdate))as id_"
+"rayon_ex,\nmj_gram.getgpnumadate (arvcinr, trunc (sysdate)) gp,decode (pkfoudgene.get_cnuf (mj_pkmarjane.get_fournisseur"
+"_principal (arvcinr, t.stmsite, sysdate)),'-1', nvl((select pkfoudgene.get_cnuf (fclcfin)\nfrom foucatalog where fclcinv"
+" = t.stmcinl and trunc (sysdate) between fclddeb and fcldfin and rownum = 1),'-1'),\npkfoudgene.get_cnuf (mj_pkmarjane.g"
+"et_fournisseur_principal (arvcinr, t.stmsite, sysdate))) as cnuf_principale,\ndecode (pkfoudgene.get_cnuf (mj_pk_wholesa"
+"le.recup_fourn_princ (arvcinr, trunc (sysdate))),'-1', nvl((select pkfoudgene.get_cnuf (fclcfin)\nfrom foucatalog where "
+"fclcinv = t.stmcinl and trunc (sysdate) between fclddeb and fcldfin and rownum = 1),'-1'),\npkfoudgene.get_cnuf (mj_pk_w"
+"holesale.recup_fourn_princ (arvcinr, trunc (sysdate))))as cnuf_direct,\nt.stmsite as id_entite, case when sum (t.stmval)"
+"=0 then 0 else sum (t.stmvpr)/sum (t.stmval) end as prix_revient_vente,\npkstock.getstockdispoenpds(t.stmsite, t.stmcinl"
+") qte_stock,\npkstock.getstockdispoenvaleur(t.stmsite, t.stmcinl) valeur_stock,\n-sum(t.stmval) as qte_vendue,\n-sum(t.s"
+"tmvpv - t.stmtva) as ca_ht,\n-sum(t.stmvpv) as ca_ttc,\n(select pktvas.gettauxtva(arttvav, 3, trunc(sysdate)) from artra"
+"c where\nartcinr = arvcinr) as taux_tva,\n-sum(t.stmtva) as tva,\nmj_pk_cycledevie.recup_cycle_de_vie(arvcinr, -1, t.stm"
+"site) cycle_de_vie,\n(select nvl (pkattrival.getlibellelongattribut ('DEP', aatcatt, 'FR'),'ND')from artattri a where 1 "
+"= 1 and a.aatccla = 'DEP' and a.aatcinr = v.arvcinr\nand trunc(stmdmvt) between a.aatddeb and a.aatdfin and rownum = 1) "
+"dep,\n(select nvl (pkattrival.getlibellelongattribut ('PI', aatcatt, 'FR'),'ND') from artattri a where 1 = 1 and a.aatcc"
+"la = 'PI' and a.aatcinr = v.arvcinr\nand trunc(stmdmvt) between a.aatddeb and a.aatdfin and rownum = 1) pi, (select nvl "
+"(pkattrival.getlibellelongattribut ('FID', aatcatt, 'FR'),'ND')\nfrom artattri a where 1 = 1 and a.aatccla = 'FID' and a"
+".aatcinr = v.arvcinr and trunc(stmdmvt) between a.aatddeb and a.aatdfin and rownum = 1)fid,\ncase when sum (t.stmval)=0 "
+"then 0 else sum((nvl (t.stmvpv, 0) - nvl (t.stmtva, 0) - nvl (t.stmvpr, 0))) /sum(t.stmval) end as  marge_unitaire_valeu"
+"r\nfrom artuv v, stomvt t\nwhere 1 = 1\nand stmdmvt >= to_date (sysdate-1, 'DD/MM/RRRR') \nand stmdmvt < trunc(to_date ("
+"sysdate-1, 'DD/MM/RRRR')+1)\nand t.stmtmvt between 150 and 174\nand t.stmcinl = v.arvcinv\n\nand t.stmsite in (select so"
+"csite from sitdgene\n                   where socsite not in (95, 96, 98, 99)\n                     and soccmag = 10)\ng"
+"roup by t.stmcinl,\nv.arvcinr,\nt.stmsite,\ntrunc (stmdmvt),\narvcinv\n)\n";
		    
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
								row7.ID_ARTICLE_INR = null;
							} else {
		                          
					row7.ID_ARTICLE_INR = rs_tDBInput_6.getBigDecimal(1);
					
						if(row7.ID_ARTICLE_INR == null){
					
				
						row7.ID_ARTICLE_INR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row7.ID_ARTICLE_INV = null;
							} else {
		                          
					row7.ID_ARTICLE_INV = rs_tDBInput_6.getBigDecimal(2);
					
						if(row7.ID_ARTICLE_INV == null){
					
				
						row7.ID_ARTICLE_INV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row7.ID_RAYON_EX = null;
							} else {
	                         		
        	row7.ID_RAYON_EX = routines.system.JDBCUtil.getString(rs_tDBInput_6, 3, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row7.GP = null;
							} else {
	                         		
        	row7.GP = routines.system.JDBCUtil.getString(rs_tDBInput_6, 4, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row7.CNUF_PRINCIPALE = null;
							} else {
	                         		
        	row7.CNUF_PRINCIPALE = routines.system.JDBCUtil.getString(rs_tDBInput_6, 5, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row7.CNUF_DIRECT = null;
							} else {
	                         		
        	row7.CNUF_DIRECT = routines.system.JDBCUtil.getString(rs_tDBInput_6, 6, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row7.ID_ENTITE = null;
							} else {
		                          
					row7.ID_ENTITE = rs_tDBInput_6.getBigDecimal(7);
					
						if(row7.ID_ENTITE == null){
					
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row7.QTE_STOCK = null;
							} else {
		                          
					row7.QTE_STOCK = rs_tDBInput_6.getBigDecimal(8);
					
						if(row7.QTE_STOCK == null){
					
				
						row7.QTE_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 9) {
								row7.VALEUR_STOCK = null;
							} else {
		                          
					row7.VALEUR_STOCK = rs_tDBInput_6.getBigDecimal(9);
					
						if(row7.VALEUR_STOCK == null){
					
				
						row7.VALEUR_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 10) {
								row7.PRIX_REVIENT_VENTE = null;
							} else {
		                          
					row7.PRIX_REVIENT_VENTE = rs_tDBInput_6.getBigDecimal(10);
					
						if(row7.PRIX_REVIENT_VENTE == null){
					
				
						row7.PRIX_REVIENT_VENTE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 11) {
								row7.QTE_VENDUE = null;
							} else {
		                          
					row7.QTE_VENDUE = rs_tDBInput_6.getBigDecimal(11);
					
						if(row7.QTE_VENDUE == null){
					
				
						row7.QTE_VENDUE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 12) {
								row7.CA_HT = null;
							} else {
		                          
					row7.CA_HT = rs_tDBInput_6.getBigDecimal(12);
					
						if(row7.CA_HT == null){
					
				
						row7.CA_HT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 13) {
								row7.CA_TTC = null;
							} else {
		                          
					row7.CA_TTC = rs_tDBInput_6.getBigDecimal(13);
					
						if(row7.CA_TTC == null){
					
				
						row7.CA_TTC = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 14) {
								row7.TAUX_TVA = null;
							} else {
		                          
					row7.TAUX_TVA = rs_tDBInput_6.getBigDecimal(14);
					
						if(row7.TAUX_TVA == null){
					
				
						row7.TAUX_TVA = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 15) {
								row7.TVA = null;
							} else {
		                          
					row7.TVA = rs_tDBInput_6.getBigDecimal(15);
					
						if(row7.TVA == null){
					
				
						row7.TVA = null;
					}
		                    }
							if(colQtyInRs_tDBInput_6 < 16) {
								row7.CYCLE_DE_VIE = null;
							} else {
	                         		
        	row7.CYCLE_DE_VIE = routines.system.JDBCUtil.getString(rs_tDBInput_6, 16, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 17) {
								row7.DEP = null;
							} else {
	                         		
        	row7.DEP = routines.system.JDBCUtil.getString(rs_tDBInput_6, 17, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 18) {
								row7.PI = null;
							} else {
	                         		
        	row7.PI = routines.system.JDBCUtil.getString(rs_tDBInput_6, 18, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 19) {
								row7.FID = null;
							} else {
	                         		
        	row7.FID = routines.system.JDBCUtil.getString(rs_tDBInput_6, 19, true);
		                    }
							if(colQtyInRs_tDBInput_6 < 20) {
								row7.MARGE_BRUT_UNIT = null;
							} else {
		                          
					row7.MARGE_BRUT_UNIT = rs_tDBInput_6.getBigDecimal(20);
					
						if(row7.MARGE_BRUT_UNIT == null){
					
				
						row7.MARGE_BRUT_UNIT = null;
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
				
					,"row7","tDBInput_6","ORACLE_GOLD","tOracleInput","tMap_6","tMap_6","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row7 - " + (row7==null? "": row7.toLogString()));
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

copyOfout1 = null;


// # Output table : 'copyOfout1'
count_copyOfout1_tMap_6++;

copyOfout1_tmp.DT_JOUR = TalendDate.addDate(TalendDate.getDate("dd/MM/yyyy"),"dd/MM/yyyy",-1,"dd") ;
copyOfout1_tmp.ID_ARTICLE_INR = row7.ID_ARTICLE_INR ;
copyOfout1_tmp.ID_ARTICLE_INV = row7.ID_ARTICLE_INV ;
copyOfout1_tmp.ID_RAYON_EX = row7.ID_RAYON_EX ;
copyOfout1_tmp.GP = row7.GP ;
copyOfout1_tmp.CNUF_PRINCIPALE = row7.CNUF_PRINCIPALE ;
copyOfout1_tmp.CNUF_DIRECT = row7.CNUF_DIRECT ;
copyOfout1_tmp.ID_ENTITE = row7.ID_ENTITE ;
copyOfout1_tmp.QTE_STOCK = row7.QTE_STOCK ;
copyOfout1_tmp.VALEUR_STOCK = row7.VALEUR_STOCK ;
copyOfout1_tmp.PRIX_REVIENT_VENTE = row7.PRIX_REVIENT_VENTE ;
copyOfout1_tmp.QTE_VENDUE = row7.QTE_VENDUE ;
copyOfout1_tmp.CA_HT = row7.CA_HT ;
copyOfout1_tmp.CA_TTC = row7.CA_TTC ;
copyOfout1_tmp.TAUX_TVA = row7.TAUX_TVA ;
copyOfout1_tmp.TVA = row7.TVA ;
copyOfout1_tmp.CYCLE_DE_VIE = row7.CYCLE_DE_VIE ;
copyOfout1_tmp.DEP = row7.DEP ;
copyOfout1_tmp.PI = row7.PI ;
copyOfout1_tmp.FID = row7.FID ;
copyOfout1_tmp.MARGE_BRUT_UNIT = row7.MARGE_BRUT_UNIT ;
copyOfout1 = copyOfout1_tmp;
log.debug("tMap_6 - Outputting the record " + count_copyOfout1_tMap_6 + " of the output table 'copyOfout1'.");

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
// Start of branch "copyOfout1"
if(copyOfout1 != null) { 



	
	/**
	 * [tConvertType_1 main ] start
	 */

	

	
	
	currentComponent="tConvertType_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"copyOfout1","tMap_6","tMap_6","tMap","tConvertType_1","tConvertType_1","tConvertType"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("copyOfout1 - " + (copyOfout1==null? "": copyOfout1.toLogString()));
    			}
    		


  row9 = new row9Struct();
  boolean bHasError_tConvertType_1 = false;             
          try {
              if ("".equals(copyOfout1.DT_JOUR)){  
                copyOfout1.DT_JOUR = null;
              }
              row9.DT_JOUR=TypeConvert.String2String(copyOfout1.DT_JOUR);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.ID_ARTICLE_INR=TypeConvert.BigDecimal2BigDecimal(copyOfout1.ID_ARTICLE_INR);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.ID_ARTICLE_INV=TypeConvert.BigDecimal2BigDecimal(copyOfout1.ID_ARTICLE_INV);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.ID_RAYON_EX)){  
                copyOfout1.ID_RAYON_EX = null;
              }
              row9.ID_RAYON_EX=TypeConvert.String2String(copyOfout1.ID_RAYON_EX);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.GP)){  
                copyOfout1.GP = null;
              }
              row9.GP=TypeConvert.String2String(copyOfout1.GP);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.CNUF_PRINCIPALE)){  
                copyOfout1.CNUF_PRINCIPALE = null;
              }
              row9.CNUF_PRINCIPALE=TypeConvert.String2String(copyOfout1.CNUF_PRINCIPALE);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.CNUF_DIRECT)){  
                copyOfout1.CNUF_DIRECT = null;
              }
              row9.CNUF_DIRECT=TypeConvert.String2String(copyOfout1.CNUF_DIRECT);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.ID_ENTITE=TypeConvert.BigDecimal2BigDecimal(copyOfout1.ID_ENTITE);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.QTE_STOCK=TypeConvert.BigDecimal2BigDecimal(copyOfout1.QTE_STOCK);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.VALEUR_STOCK=TypeConvert.BigDecimal2BigDecimal(copyOfout1.VALEUR_STOCK);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.PRIX_REVIENT_VENTE=TypeConvert.BigDecimal2BigDecimal(copyOfout1.PRIX_REVIENT_VENTE);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.QTE_VENDUE=TypeConvert.BigDecimal2BigDecimal(copyOfout1.QTE_VENDUE);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.CA_HT=TypeConvert.BigDecimal2BigDecimal(copyOfout1.CA_HT);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.CA_TTC=TypeConvert.BigDecimal2BigDecimal(copyOfout1.CA_TTC);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.TAUX_TVA=TypeConvert.BigDecimal2BigDecimal(copyOfout1.TAUX_TVA);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.TVA=TypeConvert.BigDecimal2BigDecimal(copyOfout1.TVA);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.CYCLE_DE_VIE)){  
                copyOfout1.CYCLE_DE_VIE = null;
              }
              row9.CYCLE_DE_VIE=TypeConvert.String2String(copyOfout1.CYCLE_DE_VIE);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.DEP)){  
                copyOfout1.DEP = null;
              }
              row9.DEP=TypeConvert.String2String(copyOfout1.DEP);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.PI)){  
                copyOfout1.PI = null;
              }
              row9.PI=TypeConvert.String2String(copyOfout1.PI);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              if ("".equals(copyOfout1.FID)){  
                copyOfout1.FID = null;
              }
              row9.FID=TypeConvert.String2String(copyOfout1.FID);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }           
          try {
              row9.MARGE_BRUT_UNIT=TypeConvert.BigDecimal2BigDecimal(copyOfout1.MARGE_BRUT_UNIT);            
          } catch(java.lang.Exception e){
globalMap.put("tConvertType_1_ERROR_MESSAGE",e.getMessage());
            bHasError_tConvertType_1 = true;            
              System.err.println(e.getMessage());          
          }
      if (bHasError_tConvertType_1) {row9 = null;}

  nb_line_tConvertType_1 ++ ;

 


	tos_count_tConvertType_1++;

/**
 * [tConvertType_1 main ] stop
 */
	
	/**
	 * [tConvertType_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tConvertType_1";

	

 



/**
 * [tConvertType_1 process_data_begin ] stop
 */
// Start of branch "row9"
if(row9 != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row9","tConvertType_1","tConvertType_1","tConvertType","tDBOutput_1","Oracle_ODS_CA_JOUR","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		



        whetherReject_tDBOutput_1 = false;
                        if(row9.DT_JOUR == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, row9.DT_JOUR);
}

                        pstmt_tDBOutput_1.setBigDecimal(2, row9.ID_ARTICLE_INR);

                        pstmt_tDBOutput_1.setBigDecimal(3, row9.ID_ARTICLE_INV);

                        if(row9.ID_RAYON_EX == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(4, row9.ID_RAYON_EX);
}

                        if(row9.GP == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(5, row9.GP);
}

                        if(row9.CNUF_PRINCIPALE == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(6, row9.CNUF_PRINCIPALE);
}

                        if(row9.CNUF_DIRECT == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(7, row9.CNUF_DIRECT);
}

                        pstmt_tDBOutput_1.setBigDecimal(8, row9.ID_ENTITE);

                        pstmt_tDBOutput_1.setBigDecimal(9, row9.QTE_STOCK);

                        pstmt_tDBOutput_1.setBigDecimal(10, row9.VALEUR_STOCK);

                        pstmt_tDBOutput_1.setBigDecimal(11, row9.PRIX_REVIENT_VENTE);

                        pstmt_tDBOutput_1.setBigDecimal(12, row9.QTE_VENDUE);

                        pstmt_tDBOutput_1.setBigDecimal(13, row9.CA_HT);

                        pstmt_tDBOutput_1.setBigDecimal(14, row9.CA_TTC);

                        pstmt_tDBOutput_1.setBigDecimal(15, row9.TAUX_TVA);

                        pstmt_tDBOutput_1.setBigDecimal(16, row9.TVA);

                        if(row9.CYCLE_DE_VIE == null) {
pstmt_tDBOutput_1.setNull(17, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(17, row9.CYCLE_DE_VIE);
}

                        if(row9.DEP == null) {
pstmt_tDBOutput_1.setNull(18, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(18, row9.DEP);
}

                        if(row9.PI == null) {
pstmt_tDBOutput_1.setNull(19, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(19, row9.PI);
}

                        if(row9.FID == null) {
pstmt_tDBOutput_1.setNull(20, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(20, row9.FID);
}

                        pstmt_tDBOutput_1.setBigDecimal(21, row9.MARGE_BRUT_UNIT);

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

} // End of branch "row9"




	
	/**
	 * [tConvertType_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tConvertType_1";

	

 



/**
 * [tConvertType_1 process_data_end ] stop
 */

} // End of branch "copyOfout1"




	
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
				log.debug("tMap_6 - Written records count in the table 'copyOfout1': " + count_copyOfout1_tMap_6 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row7",2,0,
			 			"tDBInput_6","ORACLE_GOLD","tOracleInput","tMap_6","tMap_6","tMap","output")) {
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
	 * [tConvertType_1 end ] start
	 */

	

	
	
	currentComponent="tConvertType_1";

	
      globalMap.put("tConvertType_1_NB_LINE", nb_line_tConvertType_1);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"copyOfout1",2,0,
			 			"tMap_6","tMap_6","tMap","tConvertType_1","tConvertType_1","tConvertType","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tConvertType_1", true);
end_Hash.put("tConvertType_1", System.currentTimeMillis());




/**
 * [tConvertType_1 end ] stop
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



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
			 			"tConvertType_1","tConvertType_1","tConvertType","tDBOutput_1","Oracle_ODS_CA_JOUR","tOracleOutput","output")) {
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
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_6:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
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
	 * [tConvertType_1 finally ] start
	 */

	

	
	
	currentComponent="tConvertType_1";

	

 



/**
 * [tConvertType_1 finally ] stop
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
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
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
	


public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal PRIX_REVIENT_HT;

				public BigDecimal getPRIX_REVIENT_HT () {
					return this.PRIX_REVIENT_HT;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String OPERATION;

				public String getOPERATION () {
					return this.OPERATION;
				}
				
			    public long FK_ARTICLE;

				public long getFK_ARTICLE () {
					return this.FK_ARTICLE;
				}
				
			    public BigDecimal FK_FOURNISSEUR;

				public BigDecimal getFK_FOURNISSEUR () {
					return this.FK_FOURNISSEUR;
				}
				
			    public BigDecimal FK_SITE;

				public BigDecimal getFK_SITE () {
					return this.FK_SITE;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_HT = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.OPERATION = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.FK_SITE = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_HT = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.OPERATION = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.FK_SITE = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.OPERATION,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.OPERATION,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",PRIX_REVIENT_HT="+String.valueOf(PRIX_REVIENT_HT));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",OPERATION="+OPERATION);
		sb.append(",FK_ARTICLE="+String.valueOf(FK_ARTICLE));
		sb.append(",FK_FOURNISSEUR="+String.valueOf(FK_FOURNISSEUR));
		sb.append(",FK_SITE="+String.valueOf(FK_SITE));
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(PRIX_REVIENT_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIX_REVIENT_HT);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(OPERATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OPERATION);
            			}
            		
        			sb.append("|");
        		
        				sb.append(FK_ARTICLE);
        			
        			sb.append("|");
        		
        				if(FK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(FK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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

public static class out5Struct implements routines.system.IPersistableRow<out5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal PRIX_REVIENT_HT;

				public BigDecimal getPRIX_REVIENT_HT () {
					return this.PRIX_REVIENT_HT;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String OPERATION;

				public String getOPERATION () {
					return this.OPERATION;
				}
				
			    public long FK_ARTICLE;

				public long getFK_ARTICLE () {
					return this.FK_ARTICLE;
				}
				
			    public BigDecimal FK_FOURNISSEUR;

				public BigDecimal getFK_FOURNISSEUR () {
					return this.FK_FOURNISSEUR;
				}
				
			    public BigDecimal FK_SITE;

				public BigDecimal getFK_SITE () {
					return this.FK_SITE;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_HT = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.OPERATION = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.FK_SITE = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.PRIX_REVIENT_HT = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.OPERATION = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.FK_SITE = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.OPERATION,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIX_REVIENT_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.OPERATION,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",PRIX_REVIENT_HT="+String.valueOf(PRIX_REVIENT_HT));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",OPERATION="+OPERATION);
		sb.append(",FK_ARTICLE="+String.valueOf(FK_ARTICLE));
		sb.append(",FK_FOURNISSEUR="+String.valueOf(FK_FOURNISSEUR));
		sb.append(",FK_SITE="+String.valueOf(FK_SITE));
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(PRIX_REVIENT_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIX_REVIENT_HT);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(OPERATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OPERATION);
            			}
            		
        			sb.append("|");
        		
        				sb.append(FK_ARTICLE);
        			
        			sb.append("|");
        		
        				if(FK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(FK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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

public static class out4Struct implements routines.system.IPersistableRow<out4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal VALEUR_PRIX;

				public BigDecimal getVALEUR_PRIX () {
					return this.VALEUR_PRIX;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public long FK_ARTICLE;

				public long getFK_ARTICLE () {
					return this.FK_ARTICLE;
				}
				
			    public BigDecimal PK_FOURNISSEUR;

				public BigDecimal getPK_FOURNISSEUR () {
					return this.PK_FOURNISSEUR;
				}
				
			    public BigDecimal PK_SITE;

				public BigDecimal getPK_SITE () {
					return this.PK_SITE;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.PK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.PK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.PK_SITE = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",VALEUR_PRIX="+String.valueOf(VALEUR_PRIX));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",FK_ARTICLE="+String.valueOf(FK_ARTICLE));
		sb.append(",PK_FOURNISSEUR="+String.valueOf(PK_FOURNISSEUR));
		sb.append(",PK_SITE="+String.valueOf(PK_SITE));
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_PRIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_PRIX);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				sb.append(FK_ARTICLE);
        			
        			sb.append("|");
        		
        				if(PK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(PK_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_SITE;

				public BigDecimal getID_SITE () {
					return this.ID_SITE;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal VALEUR_PRIX;

				public BigDecimal getVALEUR_PRIX () {
					return this.VALEUR_PRIX;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public long FK_ARTICLE;

				public long getFK_ARTICLE () {
					return this.FK_ARTICLE;
				}
				
			    public BigDecimal PK_FOURNISSEUR;

				public BigDecimal getPK_FOURNISSEUR () {
					return this.PK_FOURNISSEUR;
				}
				
			    public BigDecimal LEVEL3_ID;

				public BigDecimal getLEVEL3_ID () {
					return this.LEVEL3_ID;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.PK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.PK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.LEVEL3_ID = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LEVEL3_ID);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_SITE="+String.valueOf(ID_SITE));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",VALEUR_PRIX="+String.valueOf(VALEUR_PRIX));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",FK_ARTICLE="+String.valueOf(FK_ARTICLE));
		sb.append(",PK_FOURNISSEUR="+String.valueOf(PK_FOURNISSEUR));
		sb.append(",LEVEL3_ID="+String.valueOf(LEVEL3_ID));
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(ID_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_PRIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_PRIX);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				sb.append(FK_ARTICLE);
        			
        			sb.append("|");
        		
        				if(PK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(LEVEL3_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEVEL3_ID);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_SITE;

				public BigDecimal getID_SITE () {
					return this.ID_SITE;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal VALEUR_PRIX;

				public BigDecimal getVALEUR_PRIX () {
					return this.VALEUR_PRIX;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public long FK_ARTICLE;

				public long getFK_ARTICLE () {
					return this.FK_ARTICLE;
				}
				
			    public BigDecimal PK_FOURNISSEUR;

				public BigDecimal getPK_FOURNISSEUR () {
					return this.PK_FOURNISSEUR;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.PK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.PK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PK_FOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_SITE="+String.valueOf(ID_SITE));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",VALEUR_PRIX="+String.valueOf(VALEUR_PRIX));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",FK_ARTICLE="+String.valueOf(FK_ARTICLE));
		sb.append(",PK_FOURNISSEUR="+String.valueOf(PK_FOURNISSEUR));
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(ID_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_PRIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_PRIX);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				sb.append(FK_ARTICLE);
        			
        			sb.append("|");
        		
        				if(PK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_FFOURNISSEUR;

				public BigDecimal getID_FFOURNISSEUR () {
					return this.ID_FFOURNISSEUR;
				}
				
			    public BigDecimal ID_SITE;

				public BigDecimal getID_SITE () {
					return this.ID_SITE;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal VALEUR_PRIX;

				public BigDecimal getVALEUR_PRIX () {
					return this.VALEUR_PRIX;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public long FK_ARTICLE;

				public long getFK_ARTICLE () {
					return this.FK_ARTICLE;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_FFOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_FFOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
			        this.FK_ARTICLE = dis.readLong();
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FFOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FFOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// long
				
		            	dos.writeLong(this.FK_ARTICLE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_FFOURNISSEUR="+String.valueOf(ID_FFOURNISSEUR));
		sb.append(",ID_SITE="+String.valueOf(ID_SITE));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",VALEUR_PRIX="+String.valueOf(VALEUR_PRIX));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",FK_ARTICLE="+String.valueOf(FK_ARTICLE));
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(ID_FFOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FFOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_PRIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_PRIX);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				sb.append(FK_ARTICLE);
        			
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_FFOURNISSEUR;

				public BigDecimal getID_FFOURNISSEUR () {
					return this.ID_FFOURNISSEUR;
				}
				
			    public BigDecimal ID_SITE;

				public BigDecimal getID_SITE () {
					return this.ID_SITE;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal VALEUR_PRIX;

				public BigDecimal getVALEUR_PRIX () {
					return this.VALEUR_PRIX;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_FFOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_FFOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FFOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FFOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_FFOURNISSEUR="+String.valueOf(ID_FFOURNISSEUR));
		sb.append(",ID_SITE="+String.valueOf(ID_SITE));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",VALEUR_PRIX="+String.valueOf(VALEUR_PRIX));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(ID_FFOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FFOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_PRIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_PRIX);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];

	
			    public java.util.Date DT_JOUR;

				public java.util.Date getDT_JOUR () {
					return this.DT_JOUR;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_FFOURNISSEUR;

				public BigDecimal getID_FFOURNISSEUR () {
					return this.ID_FFOURNISSEUR;
				}
				
			    public BigDecimal ID_SITE;

				public BigDecimal getID_SITE () {
					return this.ID_SITE;
				}
				
			    public BigDecimal VALEUR_STOCK;

				public BigDecimal getVALEUR_STOCK () {
					return this.VALEUR_STOCK;
				}
				
			    public BigDecimal VALEUR_PRIX;

				public BigDecimal getVALEUR_PRIX () {
					return this.VALEUR_PRIX;
				}
				
			    public BigDecimal QTE_VENDUE;

				public BigDecimal getQTE_VENDUE () {
					return this.QTE_VENDUE;
				}
				
			    public BigDecimal CA_HT;

				public BigDecimal getCA_HT () {
					return this.CA_HT;
				}
				
			    public BigDecimal CA_TTC;

				public BigDecimal getCA_TTC () {
					return this.CA_TTC;
				}
				
			    public BigDecimal TAUX_TVA;

				public BigDecimal getTAUX_TVA () {
					return this.TAUX_TVA;
				}
				
			    public BigDecimal TVA;

				public BigDecimal getTVA () {
					return this.TVA;
				}
				
			    public String CYCLE_DE_VIE;

				public String getCYCLE_DE_VIE () {
					return this.CYCLE_DE_VIE;
				}
				
			    public String TYPE_CA;

				public String getTYPE_CA () {
					return this.TYPE_CA;
				}
				
			    public String DEP;

				public String getDEP () {
					return this.DEP;
				}
				
			    public String PI;

				public String getPI () {
					return this.PI;
				}
				
			    public String FID;

				public String getFID () {
					return this.FID;
				}
				
			    public BigDecimal MARGE_BRUT_UNIT;

				public BigDecimal getMARGE_BRUT_UNIT () {
					return this.MARGE_BRUT_UNIT;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_FFOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
					this.DT_JOUR = readDate(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_FFOURNISSEUR = (BigDecimal) dis.readObject();
					
						this.ID_SITE = (BigDecimal) dis.readObject();
					
						this.VALEUR_STOCK = (BigDecimal) dis.readObject();
					
						this.VALEUR_PRIX = (BigDecimal) dis.readObject();
					
						this.QTE_VENDUE = (BigDecimal) dis.readObject();
					
						this.CA_HT = (BigDecimal) dis.readObject();
					
						this.CA_TTC = (BigDecimal) dis.readObject();
					
						this.TAUX_TVA = (BigDecimal) dis.readObject();
					
						this.TVA = (BigDecimal) dis.readObject();
					
					this.CYCLE_DE_VIE = readString(dis);
					
					this.TYPE_CA = readString(dis);
					
					this.DEP = readString(dis);
					
					this.PI = readString(dis);
					
					this.FID = readString(dis);
					
						this.MARGE_BRUT_UNIT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FFOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.DT_JOUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FFOURNISSEUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_SITE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_STOCK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.VALEUR_PRIX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.QTE_VENDUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_HT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CA_TTC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAUX_TVA);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TVA);
					
					// String
				
						writeString(this.CYCLE_DE_VIE,dos);
					
					// String
				
						writeString(this.TYPE_CA,dos);
					
					// String
				
						writeString(this.DEP,dos);
					
					// String
				
						writeString(this.PI,dos);
					
					// String
				
						writeString(this.FID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MARGE_BRUT_UNIT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("DT_JOUR="+String.valueOf(DT_JOUR));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_FFOURNISSEUR="+String.valueOf(ID_FFOURNISSEUR));
		sb.append(",ID_SITE="+String.valueOf(ID_SITE));
		sb.append(",VALEUR_STOCK="+String.valueOf(VALEUR_STOCK));
		sb.append(",VALEUR_PRIX="+String.valueOf(VALEUR_PRIX));
		sb.append(",QTE_VENDUE="+String.valueOf(QTE_VENDUE));
		sb.append(",CA_HT="+String.valueOf(CA_HT));
		sb.append(",CA_TTC="+String.valueOf(CA_TTC));
		sb.append(",TAUX_TVA="+String.valueOf(TAUX_TVA));
		sb.append(",TVA="+String.valueOf(TVA));
		sb.append(",CYCLE_DE_VIE="+CYCLE_DE_VIE);
		sb.append(",TYPE_CA="+TYPE_CA);
		sb.append(",DEP="+DEP);
		sb.append(",PI="+PI);
		sb.append(",FID="+FID);
		sb.append(",MARGE_BRUT_UNIT="+String.valueOf(MARGE_BRUT_UNIT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(DT_JOUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DT_JOUR);
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
        		
        				if(ID_FFOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FFOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SITE);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_STOCK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_STOCK);
            			}
            		
        			sb.append("|");
        		
        				if(VALEUR_PRIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VALEUR_PRIX);
            			}
            		
        			sb.append("|");
        		
        				if(QTE_VENDUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QTE_VENDUE);
            			}
            		
        			sb.append("|");
        		
        				if(CA_HT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_HT);
            			}
            		
        			sb.append("|");
        		
        				if(CA_TTC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CA_TTC);
            			}
            		
        			sb.append("|");
        		
        				if(TAUX_TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAUX_TVA);
            			}
            		
        			sb.append("|");
        		
        				if(TVA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVA);
            			}
            		
        			sb.append("|");
        		
        				if(CYCLE_DE_VIE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CYCLE_DE_VIE);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE_CA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE_CA);
            			}
            		
        			sb.append("|");
        		
        				if(DEP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEP);
            			}
            		
        			sb.append("|");
        		
        				if(PI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PI);
            			}
            		
        			sb.append("|");
        		
        				if(FID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FID);
            			}
            		
        			sb.append("|");
        		
        				if(MARGE_BRUT_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARGE_BRUT_UNIT);
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


		tDBInput_3Process(globalMap);
		tDBInput_2Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_5Process(globalMap);

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
out2Struct out2 = new out2Struct();
out3Struct out3 = new out3Struct();
out4Struct out4 = new out4Struct();
out5Struct out5 = new out5Struct();
row6Struct row6 = new row6Struct();










	
	/**
	 * [tFlowMeter_14 begin ] start
	 */

	

	
		
		ok_Hash.put("tFlowMeter_14", false);
		start_Hash.put("tFlowMeter_14", System.currentTimeMillis());
		
	
	currentComponent="tFlowMeter_14";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row6");
			
		int tos_count_tFlowMeter_14 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_14 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFlowMeter_14{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFlowMeter_14 = new StringBuilder();
                    log4jParamters_tFlowMeter_14.append("Parameters:");
                            log4jParamters_tFlowMeter_14.append("USEROWLABEL" + " = " + "true");
                        log4jParamters_tFlowMeter_14.append(" | ");
                            log4jParamters_tFlowMeter_14.append("ABSOLUTE" + " = " + "Absolute");
                        log4jParamters_tFlowMeter_14.append(" | ");
                            log4jParamters_tFlowMeter_14.append("THRESHLODS" + " = " + "[]");
                        log4jParamters_tFlowMeter_14.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_14 - "  + (log4jParamters_tFlowMeter_14) );
                    } 
                } 
            new BytesLimit65535_tFlowMeter_14().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFlowMeter_14", "tFlowMeter_14", "tFlowMeter");
				talendJobLogProcess(globalMap);
			}
			

    int count_tFlowMeter_14 = 0; 
 



/**
 * [tFlowMeter_14 begin ] stop
 */



	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out5");
			
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
                            log4jParamters_tDBOutput_2.append("TABLESCHEMA" + " = " + "\"DW\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:OemvXwOmeusmQii7F6dVWD6W5G5ghxLTpTBKQmkkjnJ0srk=").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE" + " = " + "\"DWH_CA_JOURS\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE_ACTION" + " = " + "NONE");
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
				talendJobLog.addCM("tDBOutput_2", "DW_CA_JOURS", "tOracleOutput");
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
                String dbUser_tDBOutput_2 = "dw";
 
	final String decryptedPassword_tDBOutput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Q3HthP2EQDst29wiB8tmpropvhfenMVUeeFT/bQeEl73XwE=");

                String dbPwd_tDBOutput_2 = decryptedPassword_tDBOutput_2;
                dbschema_tDBOutput_2 = "DW";

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
            tableName_tDBOutput_2 = ("DWH_CA_JOURS");
        } else {
            tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "." + ("DWH_CA_JOURS");
        }
                String insert_tDBOutput_2 = "INSERT INTO " + tableName_tDBOutput_2 + " (DT_JOUR,ID_ARTICLE_INR,ID_ARTICLE_INV,VALEUR_STOCK,PRIX_REVIENT_HT,QTE_VENDUE,CA_HT,CA_TTC,TAUX_TVA,TVA,CYCLE_DE_VIE,TYPE_CA,OPERATION,FK_ARTICLE,FK_FOURNISSEUR,FK_SITE,MARGE_BRUT_UNIT) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
                        resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);





 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out4");
			
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
		int count_out4_tMap_5 = 0;
		
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
		
		int count_row5_tMap_4 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
					globalMap.get( "tHash_Lookup_row5" ))
					;					
					
	

row5Struct row5HashKey = new row5Struct();
row5Struct row5Default = new row5Struct();
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
                            log4jParamters_tDBInput_1.append("DB_VERSION" + " = " + "ORACLE_9");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("HOST" + " = " + "\"192.168.99.92\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PORT" + " = " + "\"15211\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("DBNAME" + " = " + "\"BI\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:NP6UFHdIESFykwSsji8u6V3qQ/zmKyDEG131LkkzrpJemegL").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"SELECT DT_JOUR, ID_ARTICLE_INR, ID_ARTICLE_INV, CNUF_PRINCIPALE as ID_FFOURNISSEUR, ID_ENTITE as ID_SITE, VALEUR_STOCK , PRIX_REVIENT_VENTE as Valeur_Prix, QTE_VENDUE, CA_HT, CA_TTC, TAUX_TVA,TVA,CYCLE_DE_VIE,  CASE         WHEN DEP IS NOT NULL      THEN 'DEP'      WHEN PI IS NOT NULL      THEN 'PI'      WHEN FID IS NOT NULL      THEN 'FID'      ELSE 'FR'    END type_ca,        CASE         WHEN DEP IS NOT NULL      THEN DEP      ELSE 'N/D'      END DEP,      CASE      WHEN PI IS NOT NULL      THEN PI      ELSE 'N/D'      END PI,            CASE      WHEN FID IS NOT NULL      THEN FID      ELSE 'N/D'      END FID,  MARGE_BRUT_UNIT    FROM ODS_CA_JOUR\"");
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
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("DT_JOUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FFOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("VALEUR_STOCK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("VALEUR_PRIX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("QTE_VENDUE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CA_HT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CA_TTC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAUX_TVA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TVA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CYCLE_DE_VIE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TYPE_CA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MARGE_BRUT_UNIT")+"}]");
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
				talendJobLog.addCM("tDBInput_1", "ODS_CA_JOURS", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "oracle.jdbc.driver.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_1);
				
			String url_tDBInput_1 = null;
				url_tDBInput_1 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_1 = "ods";

				

				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:XMwD67g89IJVM/ER/IiGVVtss32Rz8QNzy1LkI2hOpdLkizX");

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

		    String dbquery_tDBInput_1 = "SELECT DT_JOUR, ID_ARTICLE_INR, ID_ARTICLE_INV, CNUF_PRINCIPALE as ID_FFOURNISSEUR, ID_ENTITE as ID_SITE, VALEUR_STOCK "
+", PRIX_REVIENT_VENTE as Valeur_Prix, QTE_VENDUE, CA_HT, CA_TTC, TAUX_TVA,TVA,CYCLE_DE_VIE,\nCASE \n\n    WHEN DEP IS NOT"
+" NULL\n    THEN 'DEP'\n    WHEN PI IS NOT NULL\n    THEN 'PI'\n    WHEN FID IS NOT NULL\n    THEN 'FID'\n    ELSE 'FR'\n"
+"  END type_ca,\n  \n  CASE \n\n    WHEN DEP IS NOT NULL\n    THEN DEP\n    ELSE 'N/D'\n    END DEP,\n    CASE\n    WHEN "
+"PI IS NOT NULL\n    THEN PI\n    ELSE 'N/D'\n    END PI,\n    \n    CASE\n    WHEN FID IS NOT NULL\n    THEN FID\n    EL"
+"SE 'N/D'\n    END FID,\nMARGE_BRUT_UNIT\n\nFROM ODS_CA_JOUR";
		    
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
								row1.DT_JOUR = null;
							} else {
										
			row1.DT_JOUR = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 1);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.ID_ARTICLE_INR = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(2) != null) {
						row1.ID_ARTICLE_INR = rs_tDBInput_1.getBigDecimal(2);
					} else {
				
						row1.ID_ARTICLE_INR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.ID_ARTICLE_INV = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(3) != null) {
						row1.ID_ARTICLE_INV = rs_tDBInput_1.getBigDecimal(3);
					} else {
				
						row1.ID_ARTICLE_INV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.ID_FFOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(4) != null) {
						row1.ID_FFOURNISSEUR = rs_tDBInput_1.getBigDecimal(4);
					} else {
				
						row1.ID_FFOURNISSEUR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.ID_SITE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(5) != null) {
						row1.ID_SITE = rs_tDBInput_1.getBigDecimal(5);
					} else {
				
						row1.ID_SITE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.VALEUR_STOCK = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(6) != null) {
						row1.VALEUR_STOCK = rs_tDBInput_1.getBigDecimal(6);
					} else {
				
						row1.VALEUR_STOCK = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.VALEUR_PRIX = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(7) != null) {
						row1.VALEUR_PRIX = rs_tDBInput_1.getBigDecimal(7);
					} else {
				
						row1.VALEUR_PRIX = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.QTE_VENDUE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(8) != null) {
						row1.QTE_VENDUE = rs_tDBInput_1.getBigDecimal(8);
					} else {
				
						row1.QTE_VENDUE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.CA_HT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(9) != null) {
						row1.CA_HT = rs_tDBInput_1.getBigDecimal(9);
					} else {
				
						row1.CA_HT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.CA_TTC = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(10) != null) {
						row1.CA_TTC = rs_tDBInput_1.getBigDecimal(10);
					} else {
				
						row1.CA_TTC = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.TAUX_TVA = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(11) != null) {
						row1.TAUX_TVA = rs_tDBInput_1.getBigDecimal(11);
					} else {
				
						row1.TAUX_TVA = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.TVA = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(12) != null) {
						row1.TVA = rs_tDBInput_1.getBigDecimal(12);
					} else {
				
						row1.TVA = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.CYCLE_DE_VIE = null;
							} else {
	                         		
        	row1.CYCLE_DE_VIE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 13, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.TYPE_CA = null;
							} else {
	                         		
        	row1.TYPE_CA = routines.system.JDBCUtil.getString(rs_tDBInput_1, 14, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.DEP = null;
							} else {
	                         		
        	row1.DEP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.PI = null;
							} else {
	                         		
        	row1.PI = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.FID = null;
							} else {
	                         		
        	row1.FID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.MARGE_BRUT_UNIT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(18) != null) {
						row1.MARGE_BRUT_UNIT = rs_tDBInput_1.getBigDecimal(18);
					} else {
				
						row1.MARGE_BRUT_UNIT = null;
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
				
					,"row1","tDBInput_1","ODS_CA_JOURS","tOracleInput","tMap_1","tMap_1","tMap"
				
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
								
                        		    		    row2HashKey.ID_ARTICLE_INV = row1.ID_ARTICLE_INV ;
                        		    		
                        		    		    row2HashKey.ID_ARTICLE_INR = row1.ID_ARTICLE_INR ;
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.ID_ARTICLE_INV = '" + row2HashKey.ID_ARTICLE_INV + "', row2.ID_ARTICLE_INR = '" + row2HashKey.ID_ARTICLE_INR + "'");
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

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'out1'
count_out1_tMap_1++;

out1_tmp.DT_JOUR = row1.DT_JOUR ;
out1_tmp.ID_ARTICLE_INR = row1.ID_ARTICLE_INR ;
out1_tmp.ID_ARTICLE_INV = row1.ID_ARTICLE_INV ;
out1_tmp.ID_FFOURNISSEUR = row1.ID_FFOURNISSEUR ;
out1_tmp.ID_SITE = row1.ID_SITE ;
out1_tmp.VALEUR_STOCK = row1.VALEUR_STOCK ;
out1_tmp.VALEUR_PRIX = row1.VALEUR_PRIX ;
out1_tmp.QTE_VENDUE = row1.QTE_VENDUE ;
out1_tmp.CA_HT = row1.CA_HT ;
out1_tmp.CA_TTC = row1.CA_TTC ;
out1_tmp.TAUX_TVA = row1.TAUX_TVA ;
out1_tmp.TVA = row1.TVA ;
out1_tmp.CYCLE_DE_VIE = row1.CYCLE_DE_VIE ;
out1_tmp.TYPE_CA = row1.TYPE_CA ;
out1_tmp.DEP = row1.DEP ;
out1_tmp.PI = row1.PI ;
out1_tmp.FID = row1.FID ;
out1_tmp.FK_ARTICLE = row2.FK_ARTICLE ;
out1_tmp.MARGE_BRUT_UNIT = row1.MARGE_BRUT_UNIT ;
out1 = out1_tmp;
log.debug("tMap_1 - Outputting the record " + count_out1_tMap_1 + " of the output table 'out1'.");

}  // closing inner join bracket (2)
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
								
                        		    		    row3HashKey.ID_FOURNISSEUR = out1.ID_FFOURNISSEUR ;
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.ID_FOURNISSEUR = '" + row3HashKey.ID_FOURNISSEUR + "'");
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

out2_tmp.DT_JOUR = out1.DT_JOUR ;
out2_tmp.ID_ARTICLE_INR = out1.ID_ARTICLE_INR ;
out2_tmp.ID_ARTICLE_INV = out1.ID_ARTICLE_INV ;
out2_tmp.ID_SITE = out1.ID_SITE ;
out2_tmp.VALEUR_STOCK = out1.VALEUR_STOCK ;
out2_tmp.VALEUR_PRIX = out1.VALEUR_PRIX ;
out2_tmp.QTE_VENDUE = out1.QTE_VENDUE ;
out2_tmp.CA_HT = out1.CA_HT ;
out2_tmp.CA_TTC = out1.CA_TTC ;
out2_tmp.TAUX_TVA = out1.TAUX_TVA ;
out2_tmp.TVA = out1.TVA ;
out2_tmp.CYCLE_DE_VIE = out1.CYCLE_DE_VIE ;
out2_tmp.TYPE_CA = out1.TYPE_CA ;
out2_tmp.DEP = out1.DEP ;
out2_tmp.PI = out1.PI ;
out2_tmp.FID = out1.FID ;
out2_tmp.FK_ARTICLE = out1.FK_ARTICLE ;
out2_tmp.PK_FOURNISSEUR = row3.PK_FOURNISSEUR ;
out2_tmp.MARGE_BRUT_UNIT = out1.MARGE_BRUT_UNIT ;
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
								
                        		    		    row4HashKey.ID_ENTITE_GOLD = out2.ID_SITE ;
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.ID_ENTITE_GOLD = '" + row4HashKey.ID_ENTITE_GOLD + "'");
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

out3_tmp.DT_JOUR = out2.DT_JOUR ;
out3_tmp.ID_ARTICLE_INR = out2.ID_ARTICLE_INR ;
out3_tmp.ID_ARTICLE_INV = out2.ID_ARTICLE_INV ;
out3_tmp.ID_SITE = out2.ID_SITE ;
out3_tmp.VALEUR_STOCK = out2.VALEUR_STOCK ;
out3_tmp.VALEUR_PRIX = out2.VALEUR_PRIX ;
out3_tmp.QTE_VENDUE = out2.QTE_VENDUE ;
out3_tmp.CA_HT = out2.CA_HT ;
out3_tmp.CA_TTC = out2.CA_TTC ;
out3_tmp.TAUX_TVA = out2.TAUX_TVA ;
out3_tmp.TVA = out2.TVA ;
out3_tmp.CYCLE_DE_VIE = out2.CYCLE_DE_VIE ;
out3_tmp.TYPE_CA = out2.TYPE_CA ;
out3_tmp.DEP = out2.DEP ;
out3_tmp.PI = out2.PI ;
out3_tmp.FID = out2.FID ;
out3_tmp.FK_ARTICLE = out2.FK_ARTICLE ;
out3_tmp.PK_FOURNISSEUR = out2.PK_FOURNISSEUR ;
out3_tmp.LEVEL3_ID = row4.LEVEL3_ID == null ?new BigDecimal(-1):row4.LEVEL3_ID ;
out3_tmp.MARGE_BRUT_UNIT = out2.MARGE_BRUT_UNIT ;
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
				// Starting Lookup Table "row5" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow5 = false;
       		  	    	
       		  	    	
 							row5Struct row5ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
                        		    		    row5HashKey.LEVEL3_ID = out3.LEVEL3_ID ;
                        		    		

								
		                        	row5HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row5.lookup( row5HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5' and it contains more one result from keys :  row5.LEVEL3_ID = '" + row5HashKey.LEVEL3_ID + "'");
								} // G 071
							

							row5Struct row5 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row5Struct fromLookup_row5 = null;
							row5 = row5Default;
										 
							
								 
							
							
								if (tHash_Lookup_row5 !=null && tHash_Lookup_row5.hasNext()) { // G 099
								
							
								
								fromLookup_row5 = tHash_Lookup_row5.next();

							
							
								} // G 099
							
							

							if(fromLookup_row5 != null) {
								row5 = fromLookup_row5;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
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

out4_tmp.DT_JOUR = out3.DT_JOUR ;
out4_tmp.ID_ARTICLE_INR = out3.ID_ARTICLE_INR ;
out4_tmp.ID_ARTICLE_INV = out3.ID_ARTICLE_INV ;
out4_tmp.VALEUR_STOCK = out3.VALEUR_STOCK ;
out4_tmp.VALEUR_PRIX = out3.VALEUR_PRIX ;
out4_tmp.QTE_VENDUE = out3.QTE_VENDUE ;
out4_tmp.CA_HT = out3.CA_HT ;
out4_tmp.CA_TTC = out3.CA_TTC ;
out4_tmp.TAUX_TVA = out3.TAUX_TVA ;
out4_tmp.TVA = out3.TVA ;
out4_tmp.CYCLE_DE_VIE = out3.CYCLE_DE_VIE ;
out4_tmp.TYPE_CA = out3.TYPE_CA ;
out4_tmp.DEP = out3.DEP ;
out4_tmp.PI = out3.PI ;
out4_tmp.FID = out3.FID ;
out4_tmp.FK_ARTICLE = out3.FK_ARTICLE ;
out4_tmp.PK_FOURNISSEUR = out3.PK_FOURNISSEUR ;
out4_tmp.PK_SITE = row5.PK_SITE ;
out4_tmp.MARGE_BRUT_UNIT = out3.MARGE_BRUT_UNIT ;
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
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out4","tMap_4","tMap_4","tMap","tMap_5","tMap_5","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out4 - " + (out4==null? "": out4.toLogString()));
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

out5_tmp.DT_JOUR = out4.DT_JOUR ;
out5_tmp.ID_ARTICLE_INR = out4.ID_ARTICLE_INR ;
out5_tmp.ID_ARTICLE_INV = out4.ID_ARTICLE_INV ;
out5_tmp.VALEUR_STOCK = out4.VALEUR_STOCK ;
out5_tmp.PRIX_REVIENT_HT = out4.VALEUR_PRIX ;
out5_tmp.QTE_VENDUE = out4.QTE_VENDUE ;
out5_tmp.CA_HT = out4.CA_HT ;
out5_tmp.CA_TTC = out4.CA_TTC ;
out5_tmp.TAUX_TVA = out4.TAUX_TVA ;
out5_tmp.TVA = out4.TVA ;
out5_tmp.CYCLE_DE_VIE = out4.CYCLE_DE_VIE ;
out5_tmp.TYPE_CA = out4.TYPE_CA ;
out5_tmp.OPERATION = out4.DEP =="FDR"?"N/D":out4.DEP;
out5_tmp.FK_ARTICLE = out4.FK_ARTICLE ;
out5_tmp.FK_FOURNISSEUR = out4.PK_FOURNISSEUR ;
out5_tmp.FK_SITE = out4.PK_SITE ;
out5_tmp.MARGE_BRUT_UNIT = out4.MARGE_BRUT_UNIT ;
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
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out5","tMap_5","tMap_5","tMap","tDBOutput_2","DW_CA_JOURS","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out5 - " + (out5==null? "": out5.toLogString()));
    			}
    		



            row6 = null;
        whetherReject_tDBOutput_2 = false;
                        if(out5.DT_JOUR != null) {
pstmt_tDBOutput_2.setObject(1, new java.sql.Timestamp(out5.DT_JOUR.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.DATE);
}

                        pstmt_tDBOutput_2.setBigDecimal(2, out5.ID_ARTICLE_INR);

                        pstmt_tDBOutput_2.setBigDecimal(3, out5.ID_ARTICLE_INV);

                        pstmt_tDBOutput_2.setBigDecimal(4, out5.VALEUR_STOCK);

                        pstmt_tDBOutput_2.setBigDecimal(5, out5.PRIX_REVIENT_HT);

                        pstmt_tDBOutput_2.setBigDecimal(6, out5.QTE_VENDUE);

                        pstmt_tDBOutput_2.setBigDecimal(7, out5.CA_HT);

                        pstmt_tDBOutput_2.setBigDecimal(8, out5.CA_TTC);

                        pstmt_tDBOutput_2.setBigDecimal(9, out5.TAUX_TVA);

                        pstmt_tDBOutput_2.setBigDecimal(10, out5.TVA);

                        if(out5.CYCLE_DE_VIE == null) {
pstmt_tDBOutput_2.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(11, out5.CYCLE_DE_VIE);
}

                        if(out5.TYPE_CA == null) {
pstmt_tDBOutput_2.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(12, out5.TYPE_CA);
}

                        if(out5.OPERATION == null) {
pstmt_tDBOutput_2.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(13, out5.OPERATION);
}

                        pstmt_tDBOutput_2.setLong(14, out5.FK_ARTICLE);

                        pstmt_tDBOutput_2.setBigDecimal(15, out5.FK_FOURNISSEUR);

                        pstmt_tDBOutput_2.setBigDecimal(16, out5.FK_SITE);

                        pstmt_tDBOutput_2.setBigDecimal(17, out5.MARGE_BRUT_UNIT);

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
            if(!whetherReject_tDBOutput_2) {
                            row6 = new row6Struct();
                                row6.DT_JOUR = out5.DT_JOUR;
                                row6.ID_ARTICLE_INR = out5.ID_ARTICLE_INR;
                                row6.ID_ARTICLE_INV = out5.ID_ARTICLE_INV;
                                row6.VALEUR_STOCK = out5.VALEUR_STOCK;
                                row6.PRIX_REVIENT_HT = out5.PRIX_REVIENT_HT;
                                row6.QTE_VENDUE = out5.QTE_VENDUE;
                                row6.CA_HT = out5.CA_HT;
                                row6.CA_TTC = out5.CA_TTC;
                                row6.TAUX_TVA = out5.TAUX_TVA;
                                row6.TVA = out5.TVA;
                                row6.CYCLE_DE_VIE = out5.CYCLE_DE_VIE;
                                row6.TYPE_CA = out5.TYPE_CA;
                                row6.OPERATION = out5.OPERATION;
                                row6.FK_ARTICLE = out5.FK_ARTICLE;
                                row6.FK_FOURNISSEUR = out5.FK_FOURNISSEUR;
                                row6.FK_SITE = out5.FK_SITE;
                                row6.MARGE_BRUT_UNIT = out5.MARGE_BRUT_UNIT;
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
// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tFlowMeter_14 main ] start
	 */

	

	
	
	currentComponent="tFlowMeter_14";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row6","tDBOutput_2","DW_CA_JOURS","tOracleOutput","tFlowMeter_14","tFlowMeter_14","tFlowMeter"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row6 - " + (row6==null? "": row6.toLogString()));
    			}
    		

    count_tFlowMeter_14++; 
 


	tos_count_tFlowMeter_14++;

/**
 * [tFlowMeter_14 main ] stop
 */
	
	/**
	 * [tFlowMeter_14 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowMeter_14";

	

 



/**
 * [tFlowMeter_14 process_data_begin ] stop
 */
	
	/**
	 * [tFlowMeter_14 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowMeter_14";

	

 



/**
 * [tFlowMeter_14 process_data_end ] stop
 */

} // End of branch "row6"




	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "out5"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
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
			 			"tDBInput_1","ODS_CA_JOURS","tOracleInput","tMap_1","tMap_1","tMap","output")) {
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
					if(tHash_Lookup_row5 != null) {
						tHash_Lookup_row5.endGet();
					}
					globalMap.remove( "tHash_Lookup_row5" );

					
					
				
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
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_5 - Written records count in the table 'out5': " + count_out5_tMap_5 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out4",2,0,
			 			"tMap_4","tMap_4","tMap","tMap_5","tMap_5","tMap","output")) {
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



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out5",2,0,
			 			"tMap_5","tMap_5","tMap","tDBOutput_2","DW_CA_JOURS","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Done.") );

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());

   			if (((Integer)globalMap.get("tDBInput_1_NB_LINE"))==0) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tWarn_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}



/**
 * [tDBOutput_2 end ] stop
 */

	
	/**
	 * [tFlowMeter_14 end ] start
	 */

	

	
	
	currentComponent="tFlowMeter_14";

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row6",2,0,
			 			"tDBOutput_2","DW_CA_JOURS","tOracleOutput","tFlowMeter_14","tFlowMeter_14","tFlowMeter","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_14 - "  + ("Done.") );

ok_Hash.put("tFlowMeter_14", true);
end_Hash.put("tFlowMeter_14", System.currentTimeMillis());




/**
 * [tFlowMeter_14 end ] stop
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
					     			globalMap.remove("tHash_Lookup_row5"); 
				     			
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
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
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

	
	/**
	 * [tFlowMeter_14 finally ] start
	 */

	

	
	
	currentComponent="tFlowMeter_14";

	

 



/**
 * [tFlowMeter_14 finally ] stop
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
                            log4jParamters_tWarn_1.append("MESSAGE" + " = " + "\"aucune ligne dans l'ODS\"");
                        log4jParamters_tWarn_1.append(" | ");
                            log4jParamters_tWarn_1.append("CODE" + " = " + "4");
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
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_1", "", Thread.currentThread().getId() + "", "INFO","","aucune ligne dans l'ODS","", "");
                if(log.isInfoEnabled())
            log.info("tWarn_1 - "  + ("Message: ")  + ("aucune ligne dans l'ODS")  + (". Code: ")  + (4) );
	globalMap.put("tWarn_1_WARN_MESSAGES", "aucune ligne dans l'ODS"); 
	globalMap.put("tWarn_1_WARN_PRIORITY", 3);
	globalMap.put("tWarn_1_WARN_CODE", 4);
	
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
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
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
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Probleme de connexion a GOLD\"");
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
	System.err.println("Probleme de connexion a GOLD");
	
		log.error("tDie_1 - The die message: "+"Probleme de connexion a GOLD");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Probleme de connexion a GOLD");
	globalMap.put("tDie_1_DIE_MESSAGES", "Probleme de connexion a GOLD");
	
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
	


public static class row2Struct implements routines.system.IPersistableComparableLookupRow<row2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public long FK_ARTICLE;

				public long getFK_ARTICLE () {
					return this.FK_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_ARTICLE_INV == null) ? 0 : new Double(this.ID_ARTICLE_INV.doubleValue()).hashCode());
						
						result = prime * result + ((this.ID_ARTICLE_INR == null) ? 0 : new Double(this.ID_ARTICLE_INR.doubleValue()).hashCode());
						
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
		
						if (this.ID_ARTICLE_INV == null) {
							if (other.ID_ARTICLE_INV != null)
								return false;
						
						} else if ((other.ID_ARTICLE_INV == null) || (this.ID_ARTICLE_INV.compareTo(other.ID_ARTICLE_INV)!=0))
						
							return false;
					
						if (this.ID_ARTICLE_INR == null) {
							if (other.ID_ARTICLE_INR != null)
								return false;
						
						} else if ((other.ID_ARTICLE_INR == null) || (this.ID_ARTICLE_INR.compareTo(other.ID_ARTICLE_INR)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.FK_ARTICLE = this.FK_ARTICLE;
	            other.ID_ARTICLE_INV = this.ID_ARTICLE_INV;
	            other.ID_ARTICLE_INR = this.ID_ARTICLE_INR;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.ID_ARTICLE_INV = this.ID_ARTICLE_INV;
	            	other.ID_ARTICLE_INR = this.ID_ARTICLE_INR;
	            	
	}




    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
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
		
			            this.FK_ARTICLE = dis.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.FK_ARTICLE = objectIn.readLong();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeLong(this.FK_ARTICLE);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeLong(this.FK_ARTICLE);
					
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
		sb.append("FK_ARTICLE="+String.valueOf(FK_ARTICLE));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(FK_ARTICLE);
        			
        			sb.append("|");
        		
        				if(ID_ARTICLE_INV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_INV);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_INR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_INR);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_ARTICLE_INV, other.ID_ARTICLE_INV);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_ARTICLE_INR, other.ID_ARTICLE_INR);
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
			   		// source node:tDBInput_3 - inputs:(after_tDBInput_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
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
                            log4jParamters_tDBInput_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:x3Rrmpknauns1FNH9yOFD5VUh1qDGK2V5iMydVA5MGxxE1Q=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"SELECT DISTINCT PK_ARTICLE AS FK_ARTICLE, ID_ARTICLE_INV, ID_ARTICLE_INR  FROM dw.DWH_ARTICLE\"");
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
                            log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("FK_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INR")+"}]");
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
				talendJobLog.addCM("tDBInput_3", "dwh_article", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_3);
				
			String url_tDBInput_3 = null;
				url_tDBInput_3 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_3 = "dw";

				

				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:iBLAgGXU79FF4MXPuw4rPIxy3AXBeOtYMQNR5rCcTthTOLY=");

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

		    String dbquery_tDBInput_3 = "SELECT DISTINCT PK_ARTICLE AS FK_ARTICLE, ID_ARTICLE_INV, ID_ARTICLE_INR\nFROM dw.DWH_ARTICLE";
		    
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
								row2.FK_ARTICLE = 0;
							} else {
		                          
					if(rs_tDBInput_3.getObject(1) != null) {
						row2.FK_ARTICLE = rs_tDBInput_3.getLong(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row2.ID_ARTICLE_INV = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(2) != null) {
						row2.ID_ARTICLE_INV = rs_tDBInput_3.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row2.ID_ARTICLE_INR = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(3) != null) {
						row2.ID_ARTICLE_INR = rs_tDBInput_3.getBigDecimal(3);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
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
	 * [tAdvancedHash_row2 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tDBInput_3","dwh_article","tOracleInput","tAdvancedHash_row2","tAdvancedHash_row2","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		


			   
			   

					row2Struct row2_HashRow = new row2Struct();
		   	   	   
				
				row2_HashRow.FK_ARTICLE = row2.FK_ARTICLE;
				
				row2_HashRow.ID_ARTICLE_INV = row2.ID_ARTICLE_INV;
				
				row2_HashRow.ID_ARTICLE_INR = row2.ID_ARTICLE_INR;
				
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
	 * [tAdvancedHash_row2 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

tHash_Lookup_row2.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tDBInput_3","dwh_article","tOracleInput","tAdvancedHash_row2","tAdvancedHash_row2","tAdvancedHash","output")) {
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
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
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
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal PK_FOURNISSEUR;

				public BigDecimal getPK_FOURNISSEUR () {
					return this.PK_FOURNISSEUR;
				}
				
			    public BigDecimal ID_FOURNISSEUR_INT;

				public BigDecimal getID_FOURNISSEUR_INT () {
					return this.ID_FOURNISSEUR_INT;
				}
				
			    public BigDecimal ID_FOURNISSEUR;

				public BigDecimal getID_FOURNISSEUR () {
					return this.ID_FOURNISSEUR;
				}
				
			    public String LIBELLE;

				public String getLIBELLE () {
					return this.LIBELLE;
				}
				
			    public String ETAT;

				public String getETAT () {
					return this.ETAT;
				}
				
			    public String TYPE;

				public String getTYPE () {
					return this.TYPE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_FOURNISSEUR == null) ? 0 : new Double(this.ID_FOURNISSEUR.doubleValue()).hashCode());
						
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
		
						if (this.ID_FOURNISSEUR == null) {
							if (other.ID_FOURNISSEUR != null)
								return false;
						
						} else if ((other.ID_FOURNISSEUR == null) || (this.ID_FOURNISSEUR.compareTo(other.ID_FOURNISSEUR)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.PK_FOURNISSEUR = this.PK_FOURNISSEUR;
	            other.ID_FOURNISSEUR_INT = this.ID_FOURNISSEUR_INT;
	            other.ID_FOURNISSEUR = this.ID_FOURNISSEUR;
	            other.LIBELLE = this.LIBELLE;
	            other.ETAT = this.ETAT;
	            other.TYPE = this.TYPE;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.ID_FOURNISSEUR = this.ID_FOURNISSEUR;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
		
       			    	this.PK_FOURNISSEUR = (BigDecimal) ois.readObject();
					
       			    	this.ID_FOURNISSEUR_INT = (BigDecimal) ois.readObject();
					
						this.LIBELLE = readString(dis,ois);
					
						this.ETAT = readString(dis,ois);
					
						this.TYPE = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
       			    	this.PK_FOURNISSEUR = (BigDecimal) objectIn.readObject();
					
       			    	this.ID_FOURNISSEUR_INT = (BigDecimal) objectIn.readObject();
					
						this.LIBELLE = readString(dis,objectIn);
					
						this.ETAT = readString(dis,objectIn);
					
						this.TYPE = readString(dis,objectIn);
					
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

		
       			    	oos.writeObject(this.PK_FOURNISSEUR);
					
       			    	oos.writeObject(this.ID_FOURNISSEUR_INT);
					
						writeString(this.LIBELLE, dos, oos);
					
						writeString(this.ETAT, dos, oos);
					
						writeString(this.TYPE, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
       			    	objectOut.writeObject(this.PK_FOURNISSEUR);
					
       			    	objectOut.writeObject(this.ID_FOURNISSEUR_INT);
					
						writeString(this.LIBELLE, dos, objectOut);
					
						writeString(this.ETAT, dos, objectOut);
					
						writeString(this.TYPE, dos, objectOut);
					
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
		sb.append("PK_FOURNISSEUR="+String.valueOf(PK_FOURNISSEUR));
		sb.append(",ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(PK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(LIBELLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBELLE);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TYPE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_FOURNISSEUR, other.ID_FOURNISSEUR);
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
			   		// source node:tDBInput_2 - inputs:(after_tDBInput_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
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
                            log4jParamters_tDBInput_2.append("SCHEMA_DB" + " = " + "\"DW\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:V5lSMzz4Et76YiWj3SlKWeaVWYa7R+WfH0+ChovDCDQvaxc=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"select *from DWH_FOURNISSEUR\"");
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
                            log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PK_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIBELLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TYPE")+"}]");
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
				talendJobLog.addCM("tDBInput_2", "Fournisseur", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_2);
				
			String url_tDBInput_2 = null;
				url_tDBInput_2 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_2 = "dw";

				

				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:AO5bBNpq3okQVfKtunrIJQHaQ7XKBiSPO169JYOW0TGJDoc=");

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

		    String dbquery_tDBInput_2 = "select *from DWH_FOURNISSEUR";
		    
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
								row3.PK_FOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(1) != null) {
						row3.PK_FOURNISSEUR = rs_tDBInput_2.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row3.ID_FOURNISSEUR_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(2) != null) {
						row3.ID_FOURNISSEUR_INT = rs_tDBInput_2.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row3.ID_FOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(3) != null) {
						row3.ID_FOURNISSEUR = rs_tDBInput_2.getBigDecimal(3);
					} else {
				
						row3.ID_FOURNISSEUR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row3.LIBELLE = null;
							} else {
	                         		
        	row3.LIBELLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row3.ETAT = null;
							} else {
	                         		
        	row3.ETAT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row3.TYPE = null;
							} else {
	                         		
        	row3.TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 6, false);
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
	 * [tAdvancedHash_row3 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row3","tDBInput_2","Fournisseur","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		


			   
			   

					row3Struct row3_HashRow = new row3Struct();
		   	   	   
				
				row3_HashRow.PK_FOURNISSEUR = row3.PK_FOURNISSEUR;
				
				row3_HashRow.ID_FOURNISSEUR_INT = row3.ID_FOURNISSEUR_INT;
				
				row3_HashRow.ID_FOURNISSEUR = row3.ID_FOURNISSEUR;
				
				row3_HashRow.LIBELLE = row3.LIBELLE;
				
				row3_HashRow.ETAT = row3.ETAT;
				
				row3_HashRow.TYPE = row3.TYPE;
				
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
	 * [tAdvancedHash_row3 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

tHash_Lookup_row3.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tDBInput_2","Fournisseur","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash","output")) {
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
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
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
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
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
		final row4Struct other = (row4Struct) obj;
		
						if (this.ID_ENTITE_GOLD == null) {
							if (other.ID_ENTITE_GOLD != null)
								return false;
						
						} else if ((other.ID_ENTITE_GOLD == null) || (this.ID_ENTITE_GOLD.compareTo(other.ID_ENTITE_GOLD)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.ID_ENTITE_GOLD = this.ID_ENTITE_GOLD;
	            other.LEVEL3_ID = this.LEVEL3_ID;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

		other.ID_ENTITE_GOLD = this.ID_ENTITE_GOLD;
	            	
	}




    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

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
    public int compareTo(row4Struct other) {

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
                            log4jParamters_tDBInput_4.append("SCHEMA_DB" + " = " + "\"ODS\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("USER" + " = " + "\"ods\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:ve4uMCu9HboCACYSNYfdJ8Cq6p2rUje6k4aRXSVfde8phqS7").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERY" + " = " + "\"select  distinct ID_ENTITE_GOLD,ID_ENTITE  as LEVEL3_ID from ODS_PRM_MAP_ENTITE_GOLD_DWH\"");
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
                            log4jParamters_tDBInput_4.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ENTITE_GOLD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LEVEL3_ID")+"}]");
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
				talendJobLog.addCM("tDBInput_4", "ODS_MAP_ENSEIGNE_GOLD", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				String driverClass_tDBInput_4 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_4);
				
			String url_tDBInput_4 = null;
				url_tDBInput_4 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_4 = "ods";

				

				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:M4+3mIA3bwBVtUUkjOH+ljIIPgPLqR6cDG40gAR9qOQVr1Fh");

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

		    String dbquery_tDBInput_4 = "select  distinct ID_ENTITE_GOLD,ID_ENTITE  as LEVEL3_ID from ODS_PRM_MAP_ENTITE_GOLD_DWH";
		    
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
								row4.ID_ENTITE_GOLD = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(1) != null) {
						row4.ID_ENTITE_GOLD = rs_tDBInput_4.getBigDecimal(1);
					} else {
				
						row4.ID_ENTITE_GOLD = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row4.LEVEL3_ID = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(2) != null) {
						row4.LEVEL3_ID = rs_tDBInput_4.getBigDecimal(2);
					} else {
				
						row4.LEVEL3_ID = null;
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
				
					,"row4","tDBInput_4","ODS_MAP_ENSEIGNE_GOLD","tOracleInput","tAdvancedHash_row4","tAdvancedHash_row4","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		


			   
			   

					row4Struct row4_HashRow = new row4Struct();
		   	   	   
				
				row4_HashRow.ID_ENTITE_GOLD = row4.ID_ENTITE_GOLD;
				
				row4_HashRow.LEVEL3_ID = row4.LEVEL3_ID;
				
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
			 			"tDBInput_4","ODS_MAP_ENSEIGNE_GOLD","tOracleInput","tAdvancedHash_row4","tAdvancedHash_row4","tAdvancedHash","output")) {
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
	


public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__CA__JOURS = new byte[0];
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
		final row5Struct other = (row5Struct) obj;
		
						if (this.LEVEL3_ID == null) {
							if (other.LEVEL3_ID != null)
								return false;
						
						} else if ((other.LEVEL3_ID == null) || (this.LEVEL3_ID.compareTo(other.LEVEL3_ID)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row5Struct other) {

		other.PK_SITE = this.PK_SITE;
	            other.LEVEL3_ID = this.LEVEL3_ID;
	            
	}

	public void copyKeysDataTo(row5Struct other) {

		other.LEVEL3_ID = this.LEVEL3_ID;
	            	
	}




    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__CA__JOURS) {

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
    public int compareTo(row5Struct other) {

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



		row5Struct row5 = new row5Struct();




	
	/**
	 * [tAdvancedHash_row5 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row5", false);
		start_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row5";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
		int tos_count_tAdvancedHash_row5 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_row5", "tAdvancedHash_row5", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:row5
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(row5,row5) | target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
			   		// linked node: tMap_4 - inputs:(out3,row5) outputs:(out4)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row5Struct>getLookup(matchingModeEnum_row5);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row5 begin ] stop
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
                            log4jParamters_tDBInput_5.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:94ls+UJl9uMFYyTaRo7c71C9SXpm35yVKpN2W8VsDE2w4JU=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERY" + " = " + "\"select PK_Site, level3_id from dwh_entite\"");
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
                            log4jParamters_tDBInput_5.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PK_SITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LEVEL3_ID")+"}]");
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
				talendJobLog.addCM("tDBInput_5", "Oracle_DW_ENTITE", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				String driverClass_tDBInput_5 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_5);
				
			String url_tDBInput_5 = null;
				url_tDBInput_5 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_5 = "dw";

				

				 
	final String decryptedPassword_tDBInput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:mgbt9Zu+5LBCnCoku9GvAUdXtr1mMQb2btdgoc/thRldEGY=");

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

		    String dbquery_tDBInput_5 = "select PK_Site, level3_id from dwh_entite";
		    
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
								row5.PK_SITE = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(1) != null) {
						row5.PK_SITE = rs_tDBInput_5.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row5.LEVEL3_ID = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(2) != null) {
						row5.LEVEL3_ID = rs_tDBInput_5.getBigDecimal(2);
					} else {
				
						row5.LEVEL3_ID = null;
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
	 * [tAdvancedHash_row5 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tDBInput_5","Oracle_DW_ENTITE","tOracleInput","tAdvancedHash_row5","tAdvancedHash_row5","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		


			   
			   

					row5Struct row5_HashRow = new row5Struct();
		   	   	   
				
				row5_HashRow.PK_SITE = row5.PK_SITE;
				
				row5_HashRow.LEVEL3_ID = row5.LEVEL3_ID;
				
			tHash_Lookup_row5.put(row5_HashRow);
			
            




 


	tos_count_tAdvancedHash_row5++;

/**
 * [tAdvancedHash_row5 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row5 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 process_data_end ] stop
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
	 * [tAdvancedHash_row5 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

tHash_Lookup_row5.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tDBInput_5","Oracle_DW_ENTITE","tOracleInput","tAdvancedHash_row5","tAdvancedHash_row5","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_row5", true);
end_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());




/**
 * [tAdvancedHash_row5 end ] stop
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
	 * [tAdvancedHash_row5 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 finally ] stop
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
        final DWH__CA__JOURS DWH__CA__JOURSClass = new DWH__CA__JOURS();

        int exitCode = DWH__CA__JOURSClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'DWH__CA__JOURS' - Done.");
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
        	log.info("TalendJob: 'DWH__CA__JOURS' - Start.");
    	
    	
    	
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
            java.io.InputStream inContext = DWH__CA__JOURS.class.getClassLoader().getResourceAsStream("bi_team_projects/dwh__ca__jours_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = DWH__CA__JOURS.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
errorCode = null;tDBInput_6Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBInput_6) {
globalMap.put("tDBInput_6_SUBPROCESS_STATE", -1);

e_tDBInput_6.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : DWH__CA__JOURS");
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
 *     492092 characters generated by Talend Cloud Data Management Platform 
 *     on the 21 juillet 2022 à 17:17:58 WEST
 ************************************************************************************************/