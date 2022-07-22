
package bi_team_projects.dwh__article_0_1;

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
 * Job: DWH__ARTICLE Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status 
 */
public class DWH__ARTICLE implements TalendJob {
	static {System.setProperty("TalendJob.log", "DWH__ARTICLE.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(DWH__ARTICLE.class);
	

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
	private final String jobName = "DWH__ARTICLE";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_SYiCAAfaEeuZ9NN85WBztg", "0.1");
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
				DWH__ARTICLE.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(DWH__ARTICLE.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tFlowToIterate_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tReplicate_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowMeter_16_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row11_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row10_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public static class out5Struct implements routines.system.IPersistableRow<out5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_ARTICLE_CEXUV;

				public BigDecimal getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String ean_Principale;

				public String getEan_Principale () {
					return this.ean_Principale;
				}
				
			    public String libelle_Court;

				public String getLibelle_Court () {
					return this.libelle_Court;
				}
				
			    public String libelle_Long;

				public String getLibelle_Long () {
					return this.libelle_Long;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String famille;

				public String getFamille () {
					return this.famille;
				}
				
			    public String sous_famille;

				public String getSous_famille () {
					return this.sous_famille;
				}
				
			    public String ss_famille;

				public String getSs_famille () {
					return this.ss_famille;
				}
				
			    public String ub;

				public String getUb () {
					return this.ub;
				}
				
			    public String saisonalite;

				public String getSaisonalite () {
					return this.saisonalite;
				}
				
			    public String quartile_prix;

				public String getQuartile_prix () {
					return this.quartile_prix;
				}
				
			    public String marque;

				public String getMarque () {
					return this.marque;
				}
				
			    public String etat_court_Article;

				public String getEtat_court_Article () {
					return this.etat_court_Article;
				}
				
			    public BigDecimal id_dept;

				public BigDecimal getId_dept () {
					return this.id_dept;
				}
				
			    public BigDecimal id_rayon;

				public BigDecimal getId_rayon () {
					return this.id_rayon;
				}
				
			    public BigDecimal id_Famille;

				public BigDecimal getId_Famille () {
					return this.id_Famille;
				}
				
			    public BigDecimal id_SSFam;

				public BigDecimal getId_SSFam () {
					return this.id_SSFam;
				}
				
			    public BigDecimal id_SFam;

				public BigDecimal getId_SFam () {
					return this.id_SFam;
				}
				
			    public BigDecimal id_ub;

				public BigDecimal getId_ub () {
					return this.id_ub;
				}
				
			    public String PROVENANCE;

				public String getPROVENANCE () {
					return this.PROVENANCE;
				}
				
			    public BigDecimal ID_ARTICLE_CEXR;

				public BigDecimal getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public BigDecimal FK_FOURNISSEUR;

				public BigDecimal getFK_FOURNISSEUR () {
					return this.FK_FOURNISSEUR;
				}
				
			    public String Local_Import;

				public String getLocal_Import () {
					return this.Local_Import;
				}
				
			    public java.util.Date Date_MODIFICATION_DWH;

				public java.util.Date getDate_MODIFICATION_DWH () {
					return this.Date_MODIFICATION_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
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
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE_CEXUV="+String.valueOf(ID_ARTICLE_CEXUV));
		sb.append(",ean_Principale="+ean_Principale);
		sb.append(",libelle_Court="+libelle_Court);
		sb.append(",libelle_Long="+libelle_Long);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",famille="+famille);
		sb.append(",sous_famille="+sous_famille);
		sb.append(",ss_famille="+ss_famille);
		sb.append(",ub="+ub);
		sb.append(",saisonalite="+saisonalite);
		sb.append(",quartile_prix="+quartile_prix);
		sb.append(",marque="+marque);
		sb.append(",etat_court_Article="+etat_court_Article);
		sb.append(",id_dept="+String.valueOf(id_dept));
		sb.append(",id_rayon="+String.valueOf(id_rayon));
		sb.append(",id_Famille="+String.valueOf(id_Famille));
		sb.append(",id_SSFam="+String.valueOf(id_SSFam));
		sb.append(",id_SFam="+String.valueOf(id_SFam));
		sb.append(",id_ub="+String.valueOf(id_ub));
		sb.append(",PROVENANCE="+PROVENANCE);
		sb.append(",ID_ARTICLE_CEXR="+String.valueOf(ID_ARTICLE_CEXR));
		sb.append(",FK_FOURNISSEUR="+String.valueOf(FK_FOURNISSEUR));
		sb.append(",Local_Import="+Local_Import);
		sb.append(",Date_MODIFICATION_DWH="+String.valueOf(Date_MODIFICATION_DWH));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
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
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(ean_Principale == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ean_Principale);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Court == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Court);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Long == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Long);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(famille);
            			}
            		
        			sb.append("|");
        		
        				if(sous_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(sous_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ss_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ss_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ub);
            			}
            		
        			sb.append("|");
        		
        				if(saisonalite == null){
        					sb.append("<null>");
        				}else{
            				sb.append(saisonalite);
            			}
            		
        			sb.append("|");
        		
        				if(quartile_prix == null){
        					sb.append("<null>");
        				}else{
            				sb.append(quartile_prix);
            			}
            		
        			sb.append("|");
        		
        				if(marque == null){
        					sb.append("<null>");
        				}else{
            				sb.append(marque);
            			}
            		
        			sb.append("|");
        		
        				if(etat_court_Article == null){
        					sb.append("<null>");
        				}else{
            				sb.append(etat_court_Article);
            			}
            		
        			sb.append("|");
        		
        				if(id_dept == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_dept);
            			}
            		
        			sb.append("|");
        		
        				if(id_rayon == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_rayon);
            			}
            		
        			sb.append("|");
        		
        				if(id_Famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_Famille);
            			}
            		
        			sb.append("|");
        		
        				if(id_SSFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SSFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_SFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_ub);
            			}
            		
        			sb.append("|");
        		
        				if(PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(FK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(Local_Import == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Local_Import);
            			}
            		
        			sb.append("|");
        		
        				if(Date_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_MODIFICATION_DWH);
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

public static class copyOfout3Struct implements routines.system.IPersistableRow<copyOfout3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public String ID_ARTICLE_CEXUV;

				public String getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String ean_Principale;

				public String getEan_Principale () {
					return this.ean_Principale;
				}
				
			    public String libelle_Court;

				public String getLibelle_Court () {
					return this.libelle_Court;
				}
				
			    public String libelle_Long;

				public String getLibelle_Long () {
					return this.libelle_Long;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String famille;

				public String getFamille () {
					return this.famille;
				}
				
			    public String sous_famille;

				public String getSous_famille () {
					return this.sous_famille;
				}
				
			    public String ss_famille;

				public String getSs_famille () {
					return this.ss_famille;
				}
				
			    public String ub;

				public String getUb () {
					return this.ub;
				}
				
			    public String saisonalite;

				public String getSaisonalite () {
					return this.saisonalite;
				}
				
			    public String quartile_prix;

				public String getQuartile_prix () {
					return this.quartile_prix;
				}
				
			    public String marque;

				public String getMarque () {
					return this.marque;
				}
				
			    public String etat_court_Article;

				public String getEtat_court_Article () {
					return this.etat_court_Article;
				}
				
			    public BigDecimal id_dept;

				public BigDecimal getId_dept () {
					return this.id_dept;
				}
				
			    public BigDecimal id_rayon;

				public BigDecimal getId_rayon () {
					return this.id_rayon;
				}
				
			    public BigDecimal id_Famille;

				public BigDecimal getId_Famille () {
					return this.id_Famille;
				}
				
			    public BigDecimal id_SSFam;

				public BigDecimal getId_SSFam () {
					return this.id_SSFam;
				}
				
			    public BigDecimal id_SFam;

				public BigDecimal getId_SFam () {
					return this.id_SFam;
				}
				
			    public BigDecimal id_ub;

				public BigDecimal getId_ub () {
					return this.id_ub;
				}
				
			    public String PROVENANCE;

				public String getPROVENANCE () {
					return this.PROVENANCE;
				}
				
			    public BigDecimal ID_ARTICLE_CEXR;

				public BigDecimal getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public BigDecimal FK_FOURNISSEUR;

				public BigDecimal getFK_FOURNISSEUR () {
					return this.FK_FOURNISSEUR;
				}
				
			    public String Local_Import;

				public String getLocal_Import () {
					return this.Local_Import;
				}
				
			    public java.util.Date Date_MODIFICATION_DWH;

				public java.util.Date getDate_MODIFICATION_DWH () {
					return this.Date_MODIFICATION_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE_CEXUV = readString(dis);
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
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
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXUV,dos);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE_CEXUV="+ID_ARTICLE_CEXUV);
		sb.append(",ean_Principale="+ean_Principale);
		sb.append(",libelle_Court="+libelle_Court);
		sb.append(",libelle_Long="+libelle_Long);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",famille="+famille);
		sb.append(",sous_famille="+sous_famille);
		sb.append(",ss_famille="+ss_famille);
		sb.append(",ub="+ub);
		sb.append(",saisonalite="+saisonalite);
		sb.append(",quartile_prix="+quartile_prix);
		sb.append(",marque="+marque);
		sb.append(",etat_court_Article="+etat_court_Article);
		sb.append(",id_dept="+String.valueOf(id_dept));
		sb.append(",id_rayon="+String.valueOf(id_rayon));
		sb.append(",id_Famille="+String.valueOf(id_Famille));
		sb.append(",id_SSFam="+String.valueOf(id_SSFam));
		sb.append(",id_SFam="+String.valueOf(id_SFam));
		sb.append(",id_ub="+String.valueOf(id_ub));
		sb.append(",PROVENANCE="+PROVENANCE);
		sb.append(",ID_ARTICLE_CEXR="+String.valueOf(ID_ARTICLE_CEXR));
		sb.append(",FK_FOURNISSEUR="+String.valueOf(FK_FOURNISSEUR));
		sb.append(",Local_Import="+Local_Import);
		sb.append(",Date_MODIFICATION_DWH="+String.valueOf(Date_MODIFICATION_DWH));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
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
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(ean_Principale == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ean_Principale);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Court == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Court);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Long == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Long);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(famille);
            			}
            		
        			sb.append("|");
        		
        				if(sous_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(sous_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ss_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ss_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ub);
            			}
            		
        			sb.append("|");
        		
        				if(saisonalite == null){
        					sb.append("<null>");
        				}else{
            				sb.append(saisonalite);
            			}
            		
        			sb.append("|");
        		
        				if(quartile_prix == null){
        					sb.append("<null>");
        				}else{
            				sb.append(quartile_prix);
            			}
            		
        			sb.append("|");
        		
        				if(marque == null){
        					sb.append("<null>");
        				}else{
            				sb.append(marque);
            			}
            		
        			sb.append("|");
        		
        				if(etat_court_Article == null){
        					sb.append("<null>");
        				}else{
            				sb.append(etat_court_Article);
            			}
            		
        			sb.append("|");
        		
        				if(id_dept == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_dept);
            			}
            		
        			sb.append("|");
        		
        				if(id_rayon == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_rayon);
            			}
            		
        			sb.append("|");
        		
        				if(id_Famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_Famille);
            			}
            		
        			sb.append("|");
        		
        				if(id_SSFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SSFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_SFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_ub);
            			}
            		
        			sb.append("|");
        		
        				if(PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(FK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(Local_Import == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Local_Import);
            			}
            		
        			sb.append("|");
        		
        				if(Date_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_MODIFICATION_DWH);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(copyOfout3Struct other) {

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

public static class row8Struct implements routines.system.IPersistableRow<row8Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
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
				
			    public BigDecimal ID_FOURNISSEUR;

				public BigDecimal getID_FOURNISSEUR () {
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
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public java.util.Date Date_Creation_DWH;

				public java.util.Date getDate_Creation_DWH () {
					return this.Date_Creation_DWH;
				}
				
			    public java.util.Date Date_MODIFICATION_DWH;

				public java.util.Date getDate_MODIFICATION_DWH () {
					return this.Date_MODIFICATION_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
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
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",BOOL="+String.valueOf(BOOL));
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
		sb.append(",Date_Creation_DWH="+String.valueOf(Date_Creation_DWH));
		sb.append(",Date_MODIFICATION_DWH="+String.valueOf(Date_MODIFICATION_DWH));
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
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Creation_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Creation_DWH);
            			}
            		
        			sb.append("|");
        		
        				if(Date_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_MODIFICATION_DWH);
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

public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_ARTICLE_CEXUV;

				public BigDecimal getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String ean_Principale;

				public String getEan_Principale () {
					return this.ean_Principale;
				}
				
			    public String libelle_Court;

				public String getLibelle_Court () {
					return this.libelle_Court;
				}
				
			    public String libelle_Long;

				public String getLibelle_Long () {
					return this.libelle_Long;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String famille;

				public String getFamille () {
					return this.famille;
				}
				
			    public String sous_famille;

				public String getSous_famille () {
					return this.sous_famille;
				}
				
			    public String ss_famille;

				public String getSs_famille () {
					return this.ss_famille;
				}
				
			    public String ub;

				public String getUb () {
					return this.ub;
				}
				
			    public String saisonalite;

				public String getSaisonalite () {
					return this.saisonalite;
				}
				
			    public String quartile_prix;

				public String getQuartile_prix () {
					return this.quartile_prix;
				}
				
			    public String marque;

				public String getMarque () {
					return this.marque;
				}
				
			    public String etat_court_Article;

				public String getEtat_court_Article () {
					return this.etat_court_Article;
				}
				
			    public BigDecimal id_dept;

				public BigDecimal getId_dept () {
					return this.id_dept;
				}
				
			    public BigDecimal id_rayon;

				public BigDecimal getId_rayon () {
					return this.id_rayon;
				}
				
			    public BigDecimal id_Famille;

				public BigDecimal getId_Famille () {
					return this.id_Famille;
				}
				
			    public BigDecimal id_SSFam;

				public BigDecimal getId_SSFam () {
					return this.id_SSFam;
				}
				
			    public BigDecimal id_SFam;

				public BigDecimal getId_SFam () {
					return this.id_SFam;
				}
				
			    public BigDecimal id_ub;

				public BigDecimal getId_ub () {
					return this.id_ub;
				}
				
			    public String PROVENANCE;

				public String getPROVENANCE () {
					return this.PROVENANCE;
				}
				
			    public BigDecimal ID_ARTICLE_CEXR;

				public BigDecimal getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public BigDecimal FK_FOURNISSEUR;

				public BigDecimal getFK_FOURNISSEUR () {
					return this.FK_FOURNISSEUR;
				}
				
			    public String Local_Import;

				public String getLocal_Import () {
					return this.Local_Import;
				}
				
			    public java.util.Date Date_Creation_DWH;

				public java.util.Date getDate_Creation_DWH () {
					return this.Date_Creation_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
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
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE_CEXUV="+String.valueOf(ID_ARTICLE_CEXUV));
		sb.append(",ean_Principale="+ean_Principale);
		sb.append(",libelle_Court="+libelle_Court);
		sb.append(",libelle_Long="+libelle_Long);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",famille="+famille);
		sb.append(",sous_famille="+sous_famille);
		sb.append(",ss_famille="+ss_famille);
		sb.append(",ub="+ub);
		sb.append(",saisonalite="+saisonalite);
		sb.append(",quartile_prix="+quartile_prix);
		sb.append(",marque="+marque);
		sb.append(",etat_court_Article="+etat_court_Article);
		sb.append(",id_dept="+String.valueOf(id_dept));
		sb.append(",id_rayon="+String.valueOf(id_rayon));
		sb.append(",id_Famille="+String.valueOf(id_Famille));
		sb.append(",id_SSFam="+String.valueOf(id_SSFam));
		sb.append(",id_SFam="+String.valueOf(id_SFam));
		sb.append(",id_ub="+String.valueOf(id_ub));
		sb.append(",PROVENANCE="+PROVENANCE);
		sb.append(",ID_ARTICLE_CEXR="+String.valueOf(ID_ARTICLE_CEXR));
		sb.append(",FK_FOURNISSEUR="+String.valueOf(FK_FOURNISSEUR));
		sb.append(",Local_Import="+Local_Import);
		sb.append(",Date_Creation_DWH="+String.valueOf(Date_Creation_DWH));
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_INV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_INV);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(ean_Principale == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ean_Principale);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Court == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Court);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Long == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Long);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(famille);
            			}
            		
        			sb.append("|");
        		
        				if(sous_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(sous_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ss_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ss_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ub);
            			}
            		
        			sb.append("|");
        		
        				if(saisonalite == null){
        					sb.append("<null>");
        				}else{
            				sb.append(saisonalite);
            			}
            		
        			sb.append("|");
        		
        				if(quartile_prix == null){
        					sb.append("<null>");
        				}else{
            				sb.append(quartile_prix);
            			}
            		
        			sb.append("|");
        		
        				if(marque == null){
        					sb.append("<null>");
        				}else{
            				sb.append(marque);
            			}
            		
        			sb.append("|");
        		
        				if(etat_court_Article == null){
        					sb.append("<null>");
        				}else{
            				sb.append(etat_court_Article);
            			}
            		
        			sb.append("|");
        		
        				if(id_dept == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_dept);
            			}
            		
        			sb.append("|");
        		
        				if(id_rayon == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_rayon);
            			}
            		
        			sb.append("|");
        		
        				if(id_Famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_Famille);
            			}
            		
        			sb.append("|");
        		
        				if(id_SSFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SSFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_SFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_ub);
            			}
            		
        			sb.append("|");
        		
        				if(PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(FK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(Local_Import == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Local_Import);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Creation_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Creation_DWH);
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

public static class out3Struct implements routines.system.IPersistableRow<out3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public String ID_ARTICLE;

				public String getID_ARTICLE () {
					return this.ID_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_ARTICLE_CEXUV;

				public BigDecimal getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String ean_Principale;

				public String getEan_Principale () {
					return this.ean_Principale;
				}
				
			    public String libelle_Court;

				public String getLibelle_Court () {
					return this.libelle_Court;
				}
				
			    public String libelle_Long;

				public String getLibelle_Long () {
					return this.libelle_Long;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String famille;

				public String getFamille () {
					return this.famille;
				}
				
			    public String sous_famille;

				public String getSous_famille () {
					return this.sous_famille;
				}
				
			    public String ss_famille;

				public String getSs_famille () {
					return this.ss_famille;
				}
				
			    public String ub;

				public String getUb () {
					return this.ub;
				}
				
			    public String saisonalite;

				public String getSaisonalite () {
					return this.saisonalite;
				}
				
			    public String quartile_prix;

				public String getQuartile_prix () {
					return this.quartile_prix;
				}
				
			    public String marque;

				public String getMarque () {
					return this.marque;
				}
				
			    public String etat_court_Article;

				public String getEtat_court_Article () {
					return this.etat_court_Article;
				}
				
			    public BigDecimal id_dept;

				public BigDecimal getId_dept () {
					return this.id_dept;
				}
				
			    public BigDecimal id_rayon;

				public BigDecimal getId_rayon () {
					return this.id_rayon;
				}
				
			    public BigDecimal id_Famille;

				public BigDecimal getId_Famille () {
					return this.id_Famille;
				}
				
			    public BigDecimal id_SSFam;

				public BigDecimal getId_SSFam () {
					return this.id_SSFam;
				}
				
			    public BigDecimal id_SFam;

				public BigDecimal getId_SFam () {
					return this.id_SFam;
				}
				
			    public BigDecimal id_ub;

				public BigDecimal getId_ub () {
					return this.id_ub;
				}
				
			    public String PROVENANCE;

				public String getPROVENANCE () {
					return this.PROVENANCE;
				}
				
			    public BigDecimal ID_ARTICLE_CEXR;

				public BigDecimal getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public BigDecimal FK_FOURNISSEUR;

				public BigDecimal getFK_FOURNISSEUR () {
					return this.FK_FOURNISSEUR;
				}
				
			    public String Local_Import;

				public String getLocal_Import () {
					return this.Local_Import;
				}
				
			    public java.util.Date Date_Creation_DWH;

				public java.util.Date getDate_Creation_DWH () {
					return this.Date_Creation_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
					this.ID_ARTICLE = readString(dis);
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_CEXUV = (BigDecimal) dis.readObject();
					
					this.ean_Principale = readString(dis);
					
					this.libelle_Court = readString(dis);
					
					this.libelle_Long = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.famille = readString(dis);
					
					this.sous_famille = readString(dis);
					
					this.ss_famille = readString(dis);
					
					this.ub = readString(dis);
					
					this.saisonalite = readString(dis);
					
					this.quartile_prix = readString(dis);
					
					this.marque = readString(dis);
					
					this.etat_court_Article = readString(dis);
					
						this.id_dept = (BigDecimal) dis.readObject();
					
						this.id_rayon = (BigDecimal) dis.readObject();
					
						this.id_Famille = (BigDecimal) dis.readObject();
					
						this.id_SSFam = (BigDecimal) dis.readObject();
					
						this.id_SFam = (BigDecimal) dis.readObject();
					
						this.id_ub = (BigDecimal) dis.readObject();
					
					this.PROVENANCE = readString(dis);
					
						this.ID_ARTICLE_CEXR = (BigDecimal) dis.readObject();
					
						this.FK_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.Local_Import = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
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
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// String
				
						writeString(this.ID_ARTICLE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXUV);
					
					// String
				
						writeString(this.ean_Principale,dos);
					
					// String
				
						writeString(this.libelle_Court,dos);
					
					// String
				
						writeString(this.libelle_Long,dos);
					
					// String
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.famille,dos);
					
					// String
				
						writeString(this.sous_famille,dos);
					
					// String
				
						writeString(this.ss_famille,dos);
					
					// String
				
						writeString(this.ub,dos);
					
					// String
				
						writeString(this.saisonalite,dos);
					
					// String
				
						writeString(this.quartile_prix,dos);
					
					// String
				
						writeString(this.marque,dos);
					
					// String
				
						writeString(this.etat_court_Article,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_dept);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_rayon);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_Famille);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SSFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_SFam);
					
					// BigDecimal
				
       			    	dos.writeObject(this.id_ub);
					
					// String
				
						writeString(this.PROVENANCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_CEXR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FK_FOURNISSEUR);
					
					// String
				
						writeString(this.Local_Import,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE="+ID_ARTICLE);
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE_CEXUV="+String.valueOf(ID_ARTICLE_CEXUV));
		sb.append(",ean_Principale="+ean_Principale);
		sb.append(",libelle_Court="+libelle_Court);
		sb.append(",libelle_Long="+libelle_Long);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",famille="+famille);
		sb.append(",sous_famille="+sous_famille);
		sb.append(",ss_famille="+ss_famille);
		sb.append(",ub="+ub);
		sb.append(",saisonalite="+saisonalite);
		sb.append(",quartile_prix="+quartile_prix);
		sb.append(",marque="+marque);
		sb.append(",etat_court_Article="+etat_court_Article);
		sb.append(",id_dept="+String.valueOf(id_dept));
		sb.append(",id_rayon="+String.valueOf(id_rayon));
		sb.append(",id_Famille="+String.valueOf(id_Famille));
		sb.append(",id_SSFam="+String.valueOf(id_SSFam));
		sb.append(",id_SFam="+String.valueOf(id_SFam));
		sb.append(",id_ub="+String.valueOf(id_ub));
		sb.append(",PROVENANCE="+PROVENANCE);
		sb.append(",ID_ARTICLE_CEXR="+String.valueOf(ID_ARTICLE_CEXR));
		sb.append(",FK_FOURNISSEUR="+String.valueOf(FK_FOURNISSEUR));
		sb.append(",Local_Import="+Local_Import);
		sb.append(",Date_Creation_DWH="+String.valueOf(Date_Creation_DWH));
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
        		
        				if(ID_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_INV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_INV);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(ean_Principale == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ean_Principale);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Court == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Court);
            			}
            		
        			sb.append("|");
        		
        				if(libelle_Long == null){
        					sb.append("<null>");
        				}else{
            				sb.append(libelle_Long);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(famille);
            			}
            		
        			sb.append("|");
        		
        				if(sous_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(sous_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ss_famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ss_famille);
            			}
            		
        			sb.append("|");
        		
        				if(ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ub);
            			}
            		
        			sb.append("|");
        		
        				if(saisonalite == null){
        					sb.append("<null>");
        				}else{
            				sb.append(saisonalite);
            			}
            		
        			sb.append("|");
        		
        				if(quartile_prix == null){
        					sb.append("<null>");
        				}else{
            				sb.append(quartile_prix);
            			}
            		
        			sb.append("|");
        		
        				if(marque == null){
        					sb.append("<null>");
        				}else{
            				sb.append(marque);
            			}
            		
        			sb.append("|");
        		
        				if(etat_court_Article == null){
        					sb.append("<null>");
        				}else{
            				sb.append(etat_court_Article);
            			}
            		
        			sb.append("|");
        		
        				if(id_dept == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_dept);
            			}
            		
        			sb.append("|");
        		
        				if(id_rayon == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_rayon);
            			}
            		
        			sb.append("|");
        		
        				if(id_Famille == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_Famille);
            			}
            		
        			sb.append("|");
        		
        				if(id_SSFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SSFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_SFam == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_SFam);
            			}
            		
        			sb.append("|");
        		
        				if(id_ub == null){
        					sb.append("<null>");
        				}else{
            				sb.append(id_ub);
            			}
            		
        			sb.append("|");
        		
        				if(PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(FK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(Local_Import == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Local_Import);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Creation_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Creation_DWH);
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

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
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
				
			    public BigDecimal ID_FOURNISSEUR;

				public BigDecimal getID_FOURNISSEUR () {
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
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public java.util.Date Date_Creation_DWH;

				public java.util.Date getDate_Creation_DWH () {
					return this.Date_Creation_DWH;
				}
				
			    public java.util.Date Date_MODIFICATION_DWH;

				public java.util.Date getDate_MODIFICATION_DWH () {
					return this.Date_MODIFICATION_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
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
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",BOOL="+String.valueOf(BOOL));
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
		sb.append(",Date_Creation_DWH="+String.valueOf(Date_Creation_DWH));
		sb.append(",Date_MODIFICATION_DWH="+String.valueOf(Date_MODIFICATION_DWH));
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
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Creation_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Creation_DWH);
            			}
            		
        			sb.append("|");
        		
        				if(Date_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_MODIFICATION_DWH);
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

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
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
				
			    public BigDecimal ID_FOURNISSEUR;

				public BigDecimal getID_FOURNISSEUR () {
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
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public java.util.Date Date_Creation_DWH;

				public java.util.Date getDate_Creation_DWH () {
					return this.Date_Creation_DWH;
				}
				
			    public java.util.Date Date_MODIFICATION_DWH;

				public java.util.Date getDate_MODIFICATION_DWH () {
					return this.Date_MODIFICATION_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
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
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",BOOL="+String.valueOf(BOOL));
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
		sb.append(",Date_Creation_DWH="+String.valueOf(Date_Creation_DWH));
		sb.append(",Date_MODIFICATION_DWH="+String.valueOf(Date_MODIFICATION_DWH));
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
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Creation_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Creation_DWH);
            			}
            		
        			sb.append("|");
        		
        				if(Date_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_MODIFICATION_DWH);
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

public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
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
				
			    public BigDecimal ID_FOURNISSEUR;

				public BigDecimal getID_FOURNISSEUR () {
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
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public java.util.Date Date_Creation_DWH;

				public java.util.Date getDate_Creation_DWH () {
					return this.Date_Creation_DWH;
				}
				
			    public java.util.Date Date_MODIFICATION_DWH;

				public java.util.Date getDate_MODIFICATION_DWH () {
					return this.Date_MODIFICATION_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
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
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",BOOL="+String.valueOf(BOOL));
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
		sb.append(",Date_Creation_DWH="+String.valueOf(Date_Creation_DWH));
		sb.append(",Date_MODIFICATION_DWH="+String.valueOf(Date_MODIFICATION_DWH));
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
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Creation_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Creation_DWH);
            			}
            		
        			sb.append("|");
        		
        				if(Date_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_MODIFICATION_DWH);
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

public static class out2Struct implements routines.system.IPersistableRow<out2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
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
				
			    public BigDecimal ID_FOURNISSEUR;

				public BigDecimal getID_FOURNISSEUR () {
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
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
				}
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				
			    public String ID_ARTICLE_CEXR;

				public String getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public java.util.Date Date_Creation_DWH;

				public java.util.Date getDate_Creation_DWH () {
					return this.Date_Creation_DWH;
				}
				
			    public java.util.Date Date_MODIFICATION_DWH;

				public java.util.Date getDate_MODIFICATION_DWH () {
					return this.Date_MODIFICATION_DWH;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
						this.BOOL = readInteger(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
					this.Date_Creation_DWH = readDate(dis);
					
					this.Date_MODIFICATION_DWH = readDate(dis);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
					// String
				
						writeString(this.ID_ARTICLE_CEXR,dos);
					
					// java.util.Date
				
						writeDate(this.Date_Creation_DWH,dos);
					
					// java.util.Date
				
						writeDate(this.Date_MODIFICATION_DWH,dos);
					
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
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
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
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
		sb.append(",BOOL="+String.valueOf(BOOL));
		sb.append(",ID_ARTICLE_CEXR="+ID_ARTICLE_CEXR);
		sb.append(",Date_Creation_DWH="+String.valueOf(Date_Creation_DWH));
		sb.append(",Date_MODIFICATION_DWH="+String.valueOf(Date_MODIFICATION_DWH));
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
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(Date_Creation_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_Creation_DWH);
            			}
            		
        			sb.append("|");
        		
        				if(Date_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Date_MODIFICATION_DWH);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
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
				
			    public BigDecimal ID_FOURNISSEUR;

				public BigDecimal getID_FOURNISSEUR () {
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
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_DEPARTEMENT_INT = (BigDecimal) dis.readObject();
					
						this.ID_RAYON_INT = (BigDecimal) dis.readObject();
					
						this.ID_FAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SSFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_SFAMILLE_INT = (BigDecimal) dis.readObject();
					
						this.ID_UNITE_BESOIN_INT = (BigDecimal) dis.readObject();
					
					this.ID_GROUPE_PRODUIT = readString(dis);
					
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
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
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.ID_DEPARTEMENT = readString(dis);
					
					this.ID_RAYON = readString(dis);
					
					this.ID_FAMILLE = readString(dis);
					
					this.ID_SFAMILLE = readString(dis);
					
					this.ID_SSFAMILLE = readString(dis);
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_ARTICLE_INV);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
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
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
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
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",ID_DEPARTEMENT="+ID_DEPARTEMENT);
		sb.append(",ID_RAYON="+ID_RAYON);
		sb.append(",ID_FAMILLE="+ID_FAMILLE);
		sb.append(",ID_SFAMILLE="+ID_SFAMILLE);
		sb.append(",ID_SSFAMILLE="+ID_SSFAMILLE);
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
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
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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

public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
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
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public String SFAMILLE;

				public String getSFAMILLE () {
					return this.SFAMILLE;
				}
				
			    public String SSFAMILLE;

				public String getSSFAMILLE () {
					return this.SSFAMILLE;
				}
				
			    public String UNITE_BESOIN;

				public String getUNITE_BESOIN () {
					return this.UNITE_BESOIN;
				}
				
			    public String ID_UNITE_BESOIN;

				public String getID_UNITE_BESOIN () {
					return this.ID_UNITE_BESOIN;
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

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
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
					this.ID_ARTICLE_CEXR = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

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
					
					this.DEPARTEMENT = readString(dis);
					
					this.RAYON = readString(dis);
					
					this.FAMILLE = readString(dis);
					
					this.SFAMILLE = readString(dis);
					
					this.SSFAMILLE = readString(dis);
					
					this.UNITE_BESOIN = readString(dis);
					
					this.ID_UNITE_BESOIN = readString(dis);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
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
				
						writeString(this.DEPARTEMENT,dos);
					
					// String
				
						writeString(this.RAYON,dos);
					
					// String
				
						writeString(this.FAMILLE,dos);
					
					// String
				
						writeString(this.SFAMILLE,dos);
					
					// String
				
						writeString(this.SSFAMILLE,dos);
					
					// String
				
						writeString(this.UNITE_BESOIN,dos);
					
					// String
				
						writeString(this.ID_UNITE_BESOIN,dos);
					
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
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",RAYON="+RAYON);
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",SFAMILLE="+SFAMILLE);
		sb.append(",SSFAMILLE="+SSFAMILLE);
		sb.append(",UNITE_BESOIN="+UNITE_BESOIN);
		sb.append(",ID_UNITE_BESOIN="+ID_UNITE_BESOIN);
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
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
            			}
            		
        			sb.append("|");
        		
        				if(RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RAYON);
            			}
            		
        			sb.append("|");
        		
        				if(FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SFAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(SSFAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SSFAMILLE);
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

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_RAYON = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_RAYON = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_RAYON="+ID_RAYON);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];

	
			    public String ID_RAYON;

				public String getID_RAYON () {
					return this.ID_RAYON;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_RAYON = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
					this.ID_RAYON = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ID_RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ID_RAYON,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_RAYON="+ID_RAYON);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_RAYON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_RAYON);
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
		tDBInput_5Process(globalMap);
		tDBInput_4Process(globalMap);

		row1Struct row1 = new row1Struct();
row2Struct row2 = new row2Struct();
out1Struct out1 = new out1Struct();
out2Struct out2 = new out2Struct();
row5Struct row5 = new row5Struct();
row6Struct row6 = new row6Struct();
out3Struct out3 = new out3Struct();
row9Struct row9 = new row9Struct();
row4Struct row4 = new row4Struct();
row8Struct row8 = new row8Struct();
copyOfout3Struct copyOfout3 = new copyOfout3Struct();
out5Struct out5 = new out5Struct();




	
	/**
	 * [tFlowToIterate_1 begin ] start
	 */

				
			int NB_ITERATE_tDBInput_2 = 0; //for statistics
			

	
		
		ok_Hash.put("tFlowToIterate_1", false);
		start_Hash.put("tFlowToIterate_1", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
		int tos_count_tFlowToIterate_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFlowToIterate_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFlowToIterate_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFlowToIterate_1 = new StringBuilder();
                    log4jParamters_tFlowToIterate_1.append("Parameters:");
                            log4jParamters_tFlowToIterate_1.append("DEFAULT_MAP" + " = " + "false");
                        log4jParamters_tFlowToIterate_1.append(" | ");
                            log4jParamters_tFlowToIterate_1.append("MAP" + " = " + "[{VALUE="+("ID_RAYON")+", KEY="+("\"ID_RAYON\"")+"}]");
                        log4jParamters_tFlowToIterate_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFlowToIterate_1 - "  + (log4jParamters_tFlowToIterate_1) );
                    } 
                } 
            new BytesLimit65535_tFlowToIterate_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFlowToIterate_1", "tFlowToIterate_1", "tFlowToIterate");
				talendJobLogProcess(globalMap);
			}
			

int nb_line_tFlowToIterate_1 = 0;
int counter_tFlowToIterate_1 = 0;

 



/**
 * [tFlowToIterate_1 begin ] stop
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
                            log4jParamters_tDBInput_1.append("DB_VERSION" + " = " + "ORACLE_11");
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
                            log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:5jEvS78gU5x9+2iI8DMIq7OyJoOOPYRN4mtUv+X3U/+4oTNj").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select distinct id_rayon from ODS_STRUCTURE_MARCHANDISE\"");
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
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON")+"}]");
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
				talendJobLog.addCM("tDBInput_1", "Oracle_ODS_structure_marchandise", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_1);
				
			String url_tDBInput_1 = null;
				url_tDBInput_1 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_1 = "ods";

				

				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:cXn3QqlIoyTenGeUynTrfNZuV2RL2JHPr5HqLQvEEPmtPYai");

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

		    String dbquery_tDBInput_1 = "select distinct id_rayon from ODS_STRUCTURE_MARCHANDISE";
		    
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
								row1.ID_RAYON = null;
							} else {
	                         		
        	row1.ID_RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
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
	 * [tFlowToIterate_1 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tDBInput_1","Oracle_ODS_structure_marchandise","tOracleInput","tFlowToIterate_1","tFlowToIterate_1","tFlowToIterate"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		

	
    	
                if(log.isTraceEnabled())
            log.trace("tFlowToIterate_1 - "  + ("Set global var, key=")  + ("ID_RAYON")  + (", value=")  + (row1.ID_RAYON)  + (".") );
              globalMap.put("ID_RAYON", row1.ID_RAYON); 
	   nb_line_tFlowToIterate_1++;  
       counter_tFlowToIterate_1++;
                if(log.isDebugEnabled())
            log.debug("tFlowToIterate_1 - "  + ("Current iteration is: ")  + (counter_tFlowToIterate_1)  + (".") );
       globalMap.put("tFlowToIterate_1_CURRENT_ITERATION", counter_tFlowToIterate_1);
 


	tos_count_tFlowToIterate_1++;

/**
 * [tFlowToIterate_1 main ] stop
 */
	
	/**
	 * [tFlowToIterate_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 process_data_begin ] stop
 */
	NB_ITERATE_tDBInput_2++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("row9", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("copyOfout3", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row5", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out3", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row4", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out5", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out1", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("out2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row6", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("row8", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate1", 1, "exec" + NB_ITERATE_tDBInput_2);
					//Thread.sleep(1000);
				}				
			








	
	/**
	 * [tFlowMeter_16 begin ] start
	 */

	

	
		
		ok_Hash.put("tFlowMeter_16", false);
		start_Hash.put("tFlowMeter_16", System.currentTimeMillis());
		
	
	currentComponent="tFlowMeter_16";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
		int tos_count_tFlowMeter_16 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_16 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFlowMeter_16{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFlowMeter_16 = new StringBuilder();
                    log4jParamters_tFlowMeter_16.append("Parameters:");
                            log4jParamters_tFlowMeter_16.append("USEROWLABEL" + " = " + "true");
                        log4jParamters_tFlowMeter_16.append(" | ");
                            log4jParamters_tFlowMeter_16.append("ABSOLUTE" + " = " + "Absolute");
                        log4jParamters_tFlowMeter_16.append(" | ");
                            log4jParamters_tFlowMeter_16.append("THRESHLODS" + " = " + "[]");
                        log4jParamters_tFlowMeter_16.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_16 - "  + (log4jParamters_tFlowMeter_16) );
                    } 
                } 
            new BytesLimit65535_tFlowMeter_16().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFlowMeter_16", "tFlowMeter_16", "tFlowMeter");
				talendJobLogProcess(globalMap);
			}
			

    int count_tFlowMeter_16 = 0; 
 



/**
 * [tFlowMeter_16 begin ] stop
 */



	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out3");
			
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
                            log4jParamters_tDBOutput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:495sGoOnX6UNTtco8O9V/AV6kMh1Zc08zNsXzs5QBu1Spf4=").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"dwh_article\"");
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
				talendJobLog.addCM("tDBOutput_1", "inserte_article", "tOracleOutput");
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
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:G5Qx0pFVTdpEcp7e7cz/3Mza2kYLjPh3MzhToD87lCfPUko=");

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
            tableName_tDBOutput_1 = ("dwh_article");
        } else {
            tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "." + ("dwh_article");
        }
                String insert_tDBOutput_1 = "INSERT INTO " + tableName_tDBOutput_1 + " (ID_ARTICLE_INR,ID_ARTICLE,ID_ARTICLE_INV,ID_ARTICLE_CEXUV,ean_Principale,libelle_Court,libelle_Long,DEPARTEMENT,RAYON,famille,sous_famille,ss_famille,ub,saisonalite,quartile_prix,marque,etat_court_Article,id_dept,id_rayon,id_Famille,id_SSFam,id_SFam,id_ub,PROVENANCE,ID_ARTICLE_CEXR,FK_FOURNISSEUR,Local_Import,Date_Creation_DWH) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    

                        java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
                        resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);





 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row6");
			
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
		int count_row6_tMap_2 = 0;
		
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
				int count_out3_tMap_2 = 0;
				
out3Struct out3_tmp = new out3Struct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tFilterRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_2", false);
		start_Hash.put("tFilterRow_2", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
		int tos_count_tFilterRow_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFilterRow_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFilterRow_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFilterRow_2 = new StringBuilder();
                    log4jParamters_tFilterRow_2.append("Parameters:");
                            log4jParamters_tFilterRow_2.append("LOGICAL_OP" + " = " + "&&");
                        log4jParamters_tFilterRow_2.append(" | ");
                            log4jParamters_tFilterRow_2.append("CONDITIONS" + " = " + "[{OPERATOR="+("==")+", RVALUE="+("0")+", INPUT_COLUMN="+("BOOL")+", FUNCTION="+("")+"}]");
                        log4jParamters_tFilterRow_2.append(" | ");
                            log4jParamters_tFilterRow_2.append("USE_ADVANCED" + " = " + "false");
                        log4jParamters_tFilterRow_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFilterRow_2 - "  + (log4jParamters_tFilterRow_2) );
                    } 
                } 
            new BytesLimit65535_tFilterRow_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFilterRow_2", "INSERT_ARTICLE", "tFilterRow");
				talendJobLogProcess(globalMap);
			}
			
    int nb_line_tFilterRow_2 = 0;
    int nb_line_ok_tFilterRow_2 = 0;
    int nb_line_reject_tFilterRow_2 = 0;

    class Operator_tFilterRow_2 {
      private String sErrorMsg = "";
      private boolean bMatchFlag = true;
      private String sUnionFlag = "&&";

      public Operator_tFilterRow_2(String unionFlag){
        sUnionFlag = unionFlag;
        bMatchFlag =  "||".equals(unionFlag) ? false : true;
      }

      public String getErrorMsg() {
        if (sErrorMsg != null && sErrorMsg.length() > 1)
          return sErrorMsg.substring(1);
        else 
          return null;
      }

      public boolean getMatchFlag() {
        return bMatchFlag;
      }

      public void matches(boolean partMatched, String reason) {
        // no need to care about the next judgement
        if ("||".equals(sUnionFlag) && bMatchFlag){
          return;
        }

        if (!partMatched) {
          sErrorMsg += "|" + reason;
        }

        if ("||".equals(sUnionFlag))
          bMatchFlag = bMatchFlag || partMatched;
        else
          bMatchFlag = bMatchFlag && partMatched;
      }
    }

 



/**
 * [tFilterRow_2 begin ] stop
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
                            log4jParamters_tDBOutput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:Ji7pLNNR7uXRYlDutKLb7n3nl2S3lGG8Zb8GXv0CRzP8TtY=").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE" + " = " + "\"dwh_article\"");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_2.append(" | ");
                            log4jParamters_tDBOutput_2.append("DATA_ACTION" + " = " + "UPDATE");
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
				talendJobLog.addCM("tDBOutput_2", "inserte_article", "tOracleOutput");
				talendJobLogProcess(globalMap);
			}
			






        int updateKeyCount_tDBOutput_2 = 3;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 28 && true) {        
                throw new RuntimeException("For update, every Schema column can not be a key");
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
 
	final String decryptedPassword_tDBOutput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:J9NURknrIMus+Ezuwv5zpLBkM2z+f6upoUj6MRboDh+0gjU=");

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
            tableName_tDBOutput_2 = ("dwh_article");
        } else {
            tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "." + ("dwh_article");
        }
                String update_tDBOutput_2 = "UPDATE " + tableName_tDBOutput_2 + " SET ID_ARTICLE = ?,ID_ARTICLE_CEXUV = ?,libelle_Court = ?,libelle_Long = ?,DEPARTEMENT = ?,RAYON = ?,famille = ?,sous_famille = ?,ss_famille = ?,ub = ?,saisonalite = ?,quartile_prix = ?,marque = ?,etat_court_Article = ?,id_dept = ?,id_rayon = ?,id_Famille = ?,id_SSFam = ?,id_SFam = ?,id_ub = ?,PROVENANCE = ?,ID_ARTICLE_CEXR = ?,FK_FOURNISSEUR = ?,Local_Import = ?,Date_MODIFICATION_DWH = ? WHERE ID_ARTICLE_INR = ? AND ID_ARTICLE_INV = ? AND ean_Principale = ?";
                java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
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

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"copyOfout3");
			
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
		int count_copyOfout3_tMap_5 = 0;
		
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

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row8");
			
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
		int count_row8_tMap_4 = 0;
		
		int count_row10_tMap_4 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct> tHash_Lookup_row10 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct>) 
					globalMap.get( "tHash_Lookup_row10" ))
					;					
					
	

row10Struct row10HashKey = new row10Struct();
row10Struct row10Default = new row10Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_copyOfout3_tMap_4 = 0;
				
copyOfout3Struct copyOfout3_tmp = new copyOfout3Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tFilterRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_1", false);
		start_Hash.put("tFilterRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row4");
			
		int tos_count_tFilterRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFilterRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFilterRow_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFilterRow_1 = new StringBuilder();
                    log4jParamters_tFilterRow_1.append("Parameters:");
                            log4jParamters_tFilterRow_1.append("LOGICAL_OP" + " = " + "&&");
                        log4jParamters_tFilterRow_1.append(" | ");
                            log4jParamters_tFilterRow_1.append("CONDITIONS" + " = " + "[{OPERATOR="+("==")+", RVALUE="+("1")+", INPUT_COLUMN="+("BOOL")+", FUNCTION="+("")+"}]");
                        log4jParamters_tFilterRow_1.append(" | ");
                            log4jParamters_tFilterRow_1.append("USE_ADVANCED" + " = " + "false");
                        log4jParamters_tFilterRow_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFilterRow_1 - "  + (log4jParamters_tFilterRow_1) );
                    } 
                } 
            new BytesLimit65535_tFilterRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFilterRow_1", "UPDATE_ARTICLE", "tFilterRow");
				talendJobLogProcess(globalMap);
			}
			
    int nb_line_tFilterRow_1 = 0;
    int nb_line_ok_tFilterRow_1 = 0;
    int nb_line_reject_tFilterRow_1 = 0;

    class Operator_tFilterRow_1 {
      private String sErrorMsg = "";
      private boolean bMatchFlag = true;
      private String sUnionFlag = "&&";

      public Operator_tFilterRow_1(String unionFlag){
        sUnionFlag = unionFlag;
        bMatchFlag =  "||".equals(unionFlag) ? false : true;
      }

      public String getErrorMsg() {
        if (sErrorMsg != null && sErrorMsg.length() > 1)
          return sErrorMsg.substring(1);
        else 
          return null;
      }

      public boolean getMatchFlag() {
        return bMatchFlag;
      }

      public void matches(boolean partMatched, String reason) {
        // no need to care about the next judgement
        if ("||".equals(sUnionFlag) && bMatchFlag){
          return;
        }

        if (!partMatched) {
          sErrorMsg += "|" + reason;
        }

        if ("||".equals(sUnionFlag))
          bMatchFlag = bMatchFlag || partMatched;
        else
          bMatchFlag = bMatchFlag && partMatched;
      }
    }

 



/**
 * [tFilterRow_1 begin ] stop
 */



	
	/**
	 * [tReplicate_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tReplicate_1", false);
		start_Hash.put("tReplicate_1", System.currentTimeMillis());
		
	
	currentComponent="tReplicate_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out2");
			
		int tos_count_tReplicate_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tReplicate_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tReplicate_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tReplicate_1 = new StringBuilder();
                    log4jParamters_tReplicate_1.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("tReplicate_1 - "  + (log4jParamters_tReplicate_1) );
                    } 
                } 
            new BytesLimit65535_tReplicate_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tReplicate_1", "tReplicate_1", "tReplicate");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tReplicate_1 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out1");
			
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
		int count_out1_tMap_3 = 0;
		
		int count_row3_tMap_3 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out2_tMap_3 = 0;
				
out2Struct out2_tmp = new out2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
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
				int count_out1_tMap_1 = 0;
				
out1Struct out1_tmp = new out1Struct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
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
                            log4jParamters_tDBInput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:BV5dRoVrEh4FBGIo7wkFoQ8UbiHFisIxP4a38E22wR1hMwZs").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"select * from ODS_STRUCTURE_MARCHANDISE where id_rayon=\"+ (String)globalMap.get(\"ID_RAYON\")+\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USE_CURSOR" + " = " + "false");
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
				talendJobLog.addCM("tDBInput_2", "Oracle_ODS", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_2);
				
			String url_tDBInput_2 = null;
				url_tDBInput_2 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_2 = "ods";

				

				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:grxfMrWGA+TBu3dOfYy7MfMp3Jf07fxL658tY2R4vHFTd9ET");

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

		    String dbquery_tDBInput_2 = "select * from ODS_STRUCTURE_MARCHANDISE where id_rayon="+ (String)globalMap.get("ID_RAYON")+"";
		    
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
								row2.ID_DEPARTEMENT_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(1) != null) {
						row2.ID_DEPARTEMENT_INT = rs_tDBInput_2.getBigDecimal(1);
					} else {
				
						row2.ID_DEPARTEMENT_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row2.ID_RAYON_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(2) != null) {
						row2.ID_RAYON_INT = rs_tDBInput_2.getBigDecimal(2);
					} else {
				
						row2.ID_RAYON_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row2.ID_FAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(3) != null) {
						row2.ID_FAMILLE_INT = rs_tDBInput_2.getBigDecimal(3);
					} else {
				
						row2.ID_FAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row2.ID_SSFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(4) != null) {
						row2.ID_SSFAMILLE_INT = rs_tDBInput_2.getBigDecimal(4);
					} else {
				
						row2.ID_SSFAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row2.ID_SFAMILLE_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(5) != null) {
						row2.ID_SFAMILLE_INT = rs_tDBInput_2.getBigDecimal(5);
					} else {
				
						row2.ID_SFAMILLE_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row2.ID_UNITE_BESOIN_INT = null;
							} else {
		                          
					if(rs_tDBInput_2.getObject(6) != null) {
						row2.ID_UNITE_BESOIN_INT = rs_tDBInput_2.getBigDecimal(6);
					} else {
				
						row2.ID_UNITE_BESOIN_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row2.ID_GROUPE_PRODUIT = null;
							} else {
	                         		
        	row2.ID_GROUPE_PRODUIT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								row2.ID_ARTICLE_INR = null;
							} else {
	                         		
        	row2.ID_ARTICLE_INR = routines.system.JDBCUtil.getString(rs_tDBInput_2, 8, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								row2.ID_ARTICLE_INV = null;
							} else {
	                         		
        	row2.ID_ARTICLE_INV = routines.system.JDBCUtil.getString(rs_tDBInput_2, 9, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								row2.ID_ARTICLE = null;
							} else {
	                         		
        	row2.ID_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 10, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								row2.ID_ARTICLE_CEXUV = null;
							} else {
	                         		
        	row2.ID_ARTICLE_CEXUV = routines.system.JDBCUtil.getString(rs_tDBInput_2, 11, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 12) {
								row2.EAN13 = null;
							} else {
	                         		
        	row2.EAN13 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 12, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 13) {
								row2.ARTICLE_COURT = null;
							} else {
	                         		
        	row2.ARTICLE_COURT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 13, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 14) {
								row2.ARTICLE_LONG = null;
							} else {
	                         		
        	row2.ARTICLE_LONG = routines.system.JDBCUtil.getString(rs_tDBInput_2, 14, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 15) {
								row2.ID_ETAT = null;
							} else {
	                         		
        	row2.ID_ETAT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 15, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 16) {
								row2.ETAT_COURT = null;
							} else {
	                         		
        	row2.ETAT_COURT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 16, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 17) {
								row2.ETAT_LONG = null;
							} else {
	                         		
        	row2.ETAT_LONG = routines.system.JDBCUtil.getString(rs_tDBInput_2, 17, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 18) {
								row2.DT_CREATION = null;
							} else {
	                         		
        	row2.DT_CREATION = routines.system.JDBCUtil.getString(rs_tDBInput_2, 18, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 19) {
								row2.SAISONNALITE = null;
							} else {
	                         		
        	row2.SAISONNALITE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 19, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 20) {
								row2.ARTICLE_PROVENANCE = null;
							} else {
	                         		
        	row2.ARTICLE_PROVENANCE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 20, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 21) {
								row2.ARTICLE_DETENTION = null;
							} else {
	                         		
        	row2.ARTICLE_DETENTION = routines.system.JDBCUtil.getString(rs_tDBInput_2, 21, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 22) {
								row2.ARTICLE_TYPE = null;
							} else {
	                         		
        	row2.ARTICLE_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 22, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 23) {
								row2.ARTICLE_QRTL = null;
							} else {
	                         		
        	row2.ARTICLE_QRTL = routines.system.JDBCUtil.getString(rs_tDBInput_2, 23, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 24) {
								row2.ARTICLE_MARQ = null;
							} else {
	                         		
        	row2.ARTICLE_MARQ = routines.system.JDBCUtil.getString(rs_tDBInput_2, 24, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 25) {
								row2.CONTENANCE = null;
							} else {
	                         		
        	row2.CONTENANCE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 25, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 26) {
								row2.PA = null;
							} else {
	                         		
        	row2.PA = routines.system.JDBCUtil.getString(rs_tDBInput_2, 26, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 27) {
								row2.PV = null;
							} else {
	                         		
        	row2.PV = routines.system.JDBCUtil.getString(rs_tDBInput_2, 27, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 28) {
								row2.DEBUT_STOCK = null;
							} else {
	                         		
        	row2.DEBUT_STOCK = routines.system.JDBCUtil.getString(rs_tDBInput_2, 28, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 29) {
								row2.FIN_STOCK = null;
							} else {
	                         		
        	row2.FIN_STOCK = routines.system.JDBCUtil.getString(rs_tDBInput_2, 29, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 30) {
								row2.RUPT_LONG_DUREE = null;
							} else {
	                         		
        	row2.RUPT_LONG_DUREE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 30, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 31) {
								row2.ID_FOURNISSEUR = null;
							} else {
	                         		
        	row2.ID_FOURNISSEUR = routines.system.JDBCUtil.getString(rs_tDBInput_2, 31, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 32) {
								row2.ID_DEPARTEMENT = null;
							} else {
	                         		
        	row2.ID_DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 32, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 33) {
								row2.ID_RAYON = null;
							} else {
	                         		
        	row2.ID_RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_2, 33, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 34) {
								row2.ID_FAMILLE = null;
							} else {
	                         		
        	row2.ID_FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 34, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 35) {
								row2.ID_SFAMILLE = null;
							} else {
	                         		
        	row2.ID_SFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 35, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 36) {
								row2.ID_SSFAMILLE = null;
							} else {
	                         		
        	row2.ID_SSFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 36, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 37) {
								row2.DEPARTEMENT = null;
							} else {
	                         		
        	row2.DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 37, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 38) {
								row2.RAYON = null;
							} else {
	                         		
        	row2.RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_2, 38, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 39) {
								row2.FAMILLE = null;
							} else {
	                         		
        	row2.FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 39, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 40) {
								row2.SFAMILLE = null;
							} else {
	                         		
        	row2.SFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 40, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 41) {
								row2.SSFAMILLE = null;
							} else {
	                         		
        	row2.SSFAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 41, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 42) {
								row2.UNITE_BESOIN = null;
							} else {
	                         		
        	row2.UNITE_BESOIN = routines.system.JDBCUtil.getString(rs_tDBInput_2, 42, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 43) {
								row2.ID_UNITE_BESOIN = null;
							} else {
	                         		
        	row2.ID_UNITE_BESOIN = routines.system.JDBCUtil.getString(rs_tDBInput_2, 43, true);
		                    }
							if(colQtyInRs_tDBInput_2 < 44) {
								row2.ID_ARTICLE_CEXR = null;
							} else {
	                         		
        	row2.ID_ARTICLE_CEXR = routines.system.JDBCUtil.getString(rs_tDBInput_2, 44, true);
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
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tDBInput_2","Oracle_ODS","tOracleInput","tMap_1","tMap_1","tMap"
				
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

out1 = null;


// # Output table : 'out1'
count_out1_tMap_1++;

out1_tmp.ID_DEPARTEMENT_INT = row2.ID_DEPARTEMENT_INT ;
out1_tmp.ID_RAYON_INT = row2.ID_RAYON_INT ;
out1_tmp.ID_FAMILLE_INT = row2.ID_FAMILLE_INT ;
out1_tmp.ID_SSFAMILLE_INT = row2.ID_SSFAMILLE_INT ;
out1_tmp.ID_SFAMILLE_INT = row2.ID_SFAMILLE_INT ;
out1_tmp.ID_UNITE_BESOIN_INT = row2.ID_UNITE_BESOIN_INT ;
out1_tmp.ID_GROUPE_PRODUIT = row2.ID_GROUPE_PRODUIT ;
out1_tmp.ID_ARTICLE_INR = new BigDecimal(row2.ID_ARTICLE_INR) ;
out1_tmp.ID_ARTICLE_INV = new BigDecimal(row2.ID_ARTICLE_INV) ;
out1_tmp.ID_ARTICLE = row2.ID_ARTICLE ;
out1_tmp.ID_ARTICLE_CEXUV = row2.ID_ARTICLE_CEXUV ;
out1_tmp.EAN13 = row2.EAN13;
out1_tmp.ARTICLE_COURT = row2.ARTICLE_COURT ;
out1_tmp.ARTICLE_LONG = row2.ARTICLE_LONG ;
out1_tmp.ID_ETAT = row2.ID_ETAT ;
out1_tmp.ETAT_COURT = row2.ETAT_COURT ;
out1_tmp.ETAT_LONG = row2.ETAT_LONG ;
out1_tmp.DT_CREATION = row2.DT_CREATION ;
out1_tmp.SAISONNALITE = row2.SAISONNALITE ;
out1_tmp.ARTICLE_PROVENANCE = row2.ARTICLE_PROVENANCE ;
out1_tmp.ARTICLE_DETENTION = row2.ARTICLE_DETENTION ;
out1_tmp.ARTICLE_TYPE = row2.ARTICLE_TYPE ;
out1_tmp.ARTICLE_QRTL = row2.ARTICLE_QRTL ;
out1_tmp.ARTICLE_MARQ = row2.ARTICLE_MARQ ;
out1_tmp.CONTENANCE = row2.CONTENANCE ;
out1_tmp.PA = row2.PA ;
out1_tmp.PV = row2.PV ;
out1_tmp.DEBUT_STOCK = row2.DEBUT_STOCK ;
out1_tmp.FIN_STOCK = row2.FIN_STOCK ;
out1_tmp.RUPT_LONG_DUREE = row2.RUPT_LONG_DUREE ;
out1_tmp.ID_FOURNISSEUR = new BigDecimal(row2.ID_FOURNISSEUR) ;
out1_tmp.ID_DEPARTEMENT = row2.ID_DEPARTEMENT ;
out1_tmp.ID_RAYON = row2.ID_RAYON ;
out1_tmp.ID_FAMILLE = row2.ID_FAMILLE ;
out1_tmp.ID_SFAMILLE = row2.ID_SFAMILLE ;
out1_tmp.ID_SSFAMILLE = row2.ID_SSFAMILLE ;
out1_tmp.DEPARTEMENT = row2.DEPARTEMENT ;
out1_tmp.RAYON = row2.RAYON ;
out1_tmp.FAMILLE = row2.FAMILLE ;
out1_tmp.SFAMILLE = row2.SFAMILLE ;
out1_tmp.SSFAMILLE = row2.SSFAMILLE ;
out1_tmp.UNITE_BESOIN = row2.UNITE_BESOIN ;
out1_tmp.ID_UNITE_BESOIN = row2.ID_UNITE_BESOIN ;
out1_tmp.ID_ARTICLE_CEXR = row2.ID_ARTICLE_CEXR ;
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
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out1","tMap_1","tMap_1","tMap","tMap_3","tMap_3","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out1 - " + (out1==null? "": out1.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row3HashKey.ID_ARTICLE_INR = out1.ID_ARTICLE_INR;
                        		    		
                        		    		    row3HashKey.ID_ARTICLE_INV = out1.ID_ARTICLE_INV;
                        		    		
                        		    		    row3HashKey.EAN_PRINCIPALE = out1.EAN13;
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

 								
		  				
	  								
						
									
  									  		
 								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.ID_ARTICLE_INR = '" + row3HashKey.ID_ARTICLE_INR + "', row3.ID_ARTICLE_INV = '" + row3HashKey.ID_ARTICLE_INV + "', row3.EAN_PRINCIPALE = '" + row3HashKey.EAN_PRINCIPALE + "'");
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
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

out2 = null;


// # Output table : 'out2'
count_out2_tMap_3++;

out2_tmp.ID_DEPARTEMENT_INT = out1.ID_DEPARTEMENT_INT ;
out2_tmp.ID_RAYON_INT = out1.ID_RAYON_INT ;
out2_tmp.ID_FAMILLE_INT = out1.ID_FAMILLE_INT ;
out2_tmp.ID_SSFAMILLE_INT = out1.ID_SSFAMILLE_INT ;
out2_tmp.ID_SFAMILLE_INT = out1.ID_SFAMILLE_INT ;
out2_tmp.ID_UNITE_BESOIN_INT = out1.ID_UNITE_BESOIN_INT ;
out2_tmp.ID_GROUPE_PRODUIT = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_GROUPE_PRODUIT)) ;
out2_tmp.ID_ARTICLE_INR = out1.ID_ARTICLE_INR ;
out2_tmp.ID_ARTICLE_INV = out1.ID_ARTICLE_INV ;
out2_tmp.ID_ARTICLE = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_ARTICLE)) ;
out2_tmp.ID_ARTICLE_CEXUV = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_ARTICLE_CEXUV)) ;
out2_tmp.EAN13 = out1.EAN13;
out2_tmp.ARTICLE_COURT = StringHandling.FTRIM(StringHandling.BTRIM(out1.ARTICLE_COURT)) ;
out2_tmp.ARTICLE_LONG = StringHandling.FTRIM(StringHandling.BTRIM(out1.ARTICLE_LONG)) ;
out2_tmp.ID_ETAT = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_ETAT)) ;
out2_tmp.ETAT_COURT = StringHandling.FTRIM(StringHandling.BTRIM(out1.ETAT_COURT)) ;
out2_tmp.ETAT_LONG = StringHandling.FTRIM(StringHandling.BTRIM(out1.ETAT_LONG)) ;
out2_tmp.DT_CREATION = StringHandling.FTRIM(StringHandling.BTRIM(out1.DT_CREATION)) ;
out2_tmp.SAISONNALITE = StringHandling.FTRIM(StringHandling.BTRIM(out1.SAISONNALITE)) ;
out2_tmp.ARTICLE_PROVENANCE = StringHandling.FTRIM(StringHandling.BTRIM(out1.ARTICLE_PROVENANCE)) ;
out2_tmp.ARTICLE_DETENTION = StringHandling.FTRIM(StringHandling.BTRIM(out1.ARTICLE_DETENTION)) ;
out2_tmp.ARTICLE_TYPE = StringHandling.FTRIM(StringHandling.BTRIM(out1.ARTICLE_TYPE)) ;
out2_tmp.ARTICLE_QRTL = StringHandling.FTRIM(StringHandling.BTRIM(out1.ARTICLE_QRTL)) ;
out2_tmp.ARTICLE_MARQ = StringHandling.FTRIM(StringHandling.BTRIM(out1.ARTICLE_MARQ)) ;
out2_tmp.CONTENANCE = StringHandling.FTRIM(StringHandling.BTRIM(out1.CONTENANCE)) ;
out2_tmp.PA = StringHandling.FTRIM(StringHandling.BTRIM(out1.PA)) ;
out2_tmp.PV = StringHandling.FTRIM(StringHandling.BTRIM(out1.PV)) ;
out2_tmp.DEBUT_STOCK = StringHandling.FTRIM(StringHandling.BTRIM(out1.DEBUT_STOCK)) ;
out2_tmp.FIN_STOCK = StringHandling.FTRIM(StringHandling.BTRIM(out1.FIN_STOCK)) ;
out2_tmp.RUPT_LONG_DUREE = StringHandling.FTRIM(StringHandling.BTRIM(out1.RUPT_LONG_DUREE)) ;
out2_tmp.ID_FOURNISSEUR = out1.ID_FOURNISSEUR ;
out2_tmp.ID_DEPARTEMENT = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_DEPARTEMENT)) ;
out2_tmp.ID_RAYON = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_RAYON)) ;
out2_tmp.ID_FAMILLE = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_FAMILLE)) ;
out2_tmp.ID_SFAMILLE = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_SFAMILLE)) ;
out2_tmp.ID_SSFAMILLE = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_SSFAMILLE)) ;
out2_tmp.DEPARTEMENT = StringHandling.FTRIM(StringHandling.BTRIM(out1.DEPARTEMENT)) ;
out2_tmp.RAYON = StringHandling.FTRIM(StringHandling.BTRIM(out1.RAYON)) ;
out2_tmp.FAMILLE = StringHandling.FTRIM(StringHandling.BTRIM(out1.FAMILLE)) ;
out2_tmp.SFAMILLE = StringHandling.FTRIM(StringHandling.BTRIM(out1.SFAMILLE)) ;
out2_tmp.SSFAMILLE = StringHandling.FTRIM(StringHandling.BTRIM(out1.SSFAMILLE)) ;
out2_tmp.UNITE_BESOIN = StringHandling.FTRIM(StringHandling.BTRIM(out1.UNITE_BESOIN)) ;
out2_tmp.ID_UNITE_BESOIN = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_UNITE_BESOIN)) ;
out2_tmp.BOOL = out1.ID_ARTICLE_INR.equals(row3.ID_ARTICLE_INR)==true &&
out1.ID_ARTICLE_INV.equals(row3.ID_ARTICLE_INV)==true &&
out1.EAN13.equals(row3.EAN_PRINCIPALE)==true?1:0 ;
out2_tmp.ID_ARTICLE_CEXR = StringHandling.FTRIM(StringHandling.BTRIM(out1.ID_ARTICLE_CEXR)) ;
out2_tmp.Date_Creation_DWH = TalendDate.getCurrentDate() ;
out2_tmp.Date_MODIFICATION_DWH = TalendDate.getCurrentDate() ;
out2 = out2_tmp;
log.debug("tMap_3 - Outputting the record " + count_out2_tMap_3 + " of the output table 'out2'.");

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
// Start of branch "out2"
if(out2 != null) { 



	
	/**
	 * [tReplicate_1 main ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out2","tMap_3","tMap_3","tMap","tReplicate_1","tReplicate_1","tReplicate"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out2 - " + (out2==null? "": out2.toLogString()));
    			}
    		


	row5 = new row5Struct();
						
	row5.ID_DEPARTEMENT_INT = out2.ID_DEPARTEMENT_INT;								
	row5.ID_RAYON_INT = out2.ID_RAYON_INT;								
	row5.ID_FAMILLE_INT = out2.ID_FAMILLE_INT;								
	row5.ID_SSFAMILLE_INT = out2.ID_SSFAMILLE_INT;								
	row5.ID_SFAMILLE_INT = out2.ID_SFAMILLE_INT;								
	row5.ID_UNITE_BESOIN_INT = out2.ID_UNITE_BESOIN_INT;								
	row5.ID_GROUPE_PRODUIT = out2.ID_GROUPE_PRODUIT;								
	row5.ID_ARTICLE_INR = out2.ID_ARTICLE_INR;								
	row5.ID_ARTICLE_INV = out2.ID_ARTICLE_INV;								
	row5.ID_ARTICLE = out2.ID_ARTICLE;								
	row5.ID_ARTICLE_CEXUV = out2.ID_ARTICLE_CEXUV;								
	row5.EAN13 = out2.EAN13;								
	row5.ARTICLE_COURT = out2.ARTICLE_COURT;								
	row5.ARTICLE_LONG = out2.ARTICLE_LONG;								
	row5.ID_ETAT = out2.ID_ETAT;								
	row5.ETAT_COURT = out2.ETAT_COURT;								
	row5.ETAT_LONG = out2.ETAT_LONG;								
	row5.DT_CREATION = out2.DT_CREATION;								
	row5.SAISONNALITE = out2.SAISONNALITE;								
	row5.ARTICLE_PROVENANCE = out2.ARTICLE_PROVENANCE;								
	row5.ARTICLE_DETENTION = out2.ARTICLE_DETENTION;								
	row5.ARTICLE_TYPE = out2.ARTICLE_TYPE;								
	row5.ARTICLE_QRTL = out2.ARTICLE_QRTL;								
	row5.ARTICLE_MARQ = out2.ARTICLE_MARQ;								
	row5.CONTENANCE = out2.CONTENANCE;								
	row5.PA = out2.PA;								
	row5.PV = out2.PV;								
	row5.DEBUT_STOCK = out2.DEBUT_STOCK;								
	row5.FIN_STOCK = out2.FIN_STOCK;								
	row5.RUPT_LONG_DUREE = out2.RUPT_LONG_DUREE;								
	row5.ID_FOURNISSEUR = out2.ID_FOURNISSEUR;								
	row5.ID_DEPARTEMENT = out2.ID_DEPARTEMENT;								
	row5.ID_RAYON = out2.ID_RAYON;								
	row5.ID_FAMILLE = out2.ID_FAMILLE;								
	row5.ID_SFAMILLE = out2.ID_SFAMILLE;								
	row5.ID_SSFAMILLE = out2.ID_SSFAMILLE;								
	row5.DEPARTEMENT = out2.DEPARTEMENT;								
	row5.RAYON = out2.RAYON;								
	row5.FAMILLE = out2.FAMILLE;								
	row5.SFAMILLE = out2.SFAMILLE;								
	row5.SSFAMILLE = out2.SSFAMILLE;								
	row5.UNITE_BESOIN = out2.UNITE_BESOIN;								
	row5.ID_UNITE_BESOIN = out2.ID_UNITE_BESOIN;								
	row5.BOOL = out2.BOOL;								
	row5.ID_ARTICLE_CEXR = out2.ID_ARTICLE_CEXR;								
	row5.Date_Creation_DWH = out2.Date_Creation_DWH;								
	row5.Date_MODIFICATION_DWH = out2.Date_MODIFICATION_DWH;			
	row4 = new row4Struct();
						
	row4.ID_DEPARTEMENT_INT = out2.ID_DEPARTEMENT_INT;								
	row4.ID_RAYON_INT = out2.ID_RAYON_INT;								
	row4.ID_FAMILLE_INT = out2.ID_FAMILLE_INT;								
	row4.ID_SSFAMILLE_INT = out2.ID_SSFAMILLE_INT;								
	row4.ID_SFAMILLE_INT = out2.ID_SFAMILLE_INT;								
	row4.ID_UNITE_BESOIN_INT = out2.ID_UNITE_BESOIN_INT;								
	row4.ID_GROUPE_PRODUIT = out2.ID_GROUPE_PRODUIT;								
	row4.ID_ARTICLE_INR = out2.ID_ARTICLE_INR;								
	row4.ID_ARTICLE_INV = out2.ID_ARTICLE_INV;								
	row4.ID_ARTICLE = out2.ID_ARTICLE;								
	row4.ID_ARTICLE_CEXUV = out2.ID_ARTICLE_CEXUV;								
	row4.EAN13 = out2.EAN13;								
	row4.ARTICLE_COURT = out2.ARTICLE_COURT;								
	row4.ARTICLE_LONG = out2.ARTICLE_LONG;								
	row4.ID_ETAT = out2.ID_ETAT;								
	row4.ETAT_COURT = out2.ETAT_COURT;								
	row4.ETAT_LONG = out2.ETAT_LONG;								
	row4.DT_CREATION = out2.DT_CREATION;								
	row4.SAISONNALITE = out2.SAISONNALITE;								
	row4.ARTICLE_PROVENANCE = out2.ARTICLE_PROVENANCE;								
	row4.ARTICLE_DETENTION = out2.ARTICLE_DETENTION;								
	row4.ARTICLE_TYPE = out2.ARTICLE_TYPE;								
	row4.ARTICLE_QRTL = out2.ARTICLE_QRTL;								
	row4.ARTICLE_MARQ = out2.ARTICLE_MARQ;								
	row4.CONTENANCE = out2.CONTENANCE;								
	row4.PA = out2.PA;								
	row4.PV = out2.PV;								
	row4.DEBUT_STOCK = out2.DEBUT_STOCK;								
	row4.FIN_STOCK = out2.FIN_STOCK;								
	row4.RUPT_LONG_DUREE = out2.RUPT_LONG_DUREE;								
	row4.ID_FOURNISSEUR = out2.ID_FOURNISSEUR;								
	row4.ID_DEPARTEMENT = out2.ID_DEPARTEMENT;								
	row4.ID_RAYON = out2.ID_RAYON;								
	row4.ID_FAMILLE = out2.ID_FAMILLE;								
	row4.ID_SFAMILLE = out2.ID_SFAMILLE;								
	row4.ID_SSFAMILLE = out2.ID_SSFAMILLE;								
	row4.DEPARTEMENT = out2.DEPARTEMENT;								
	row4.RAYON = out2.RAYON;								
	row4.FAMILLE = out2.FAMILLE;								
	row4.SFAMILLE = out2.SFAMILLE;								
	row4.SSFAMILLE = out2.SSFAMILLE;								
	row4.UNITE_BESOIN = out2.UNITE_BESOIN;								
	row4.ID_UNITE_BESOIN = out2.ID_UNITE_BESOIN;								
	row4.BOOL = out2.BOOL;								
	row4.ID_ARTICLE_CEXR = out2.ID_ARTICLE_CEXR;								
	row4.Date_Creation_DWH = out2.Date_Creation_DWH;								
	row4.Date_MODIFICATION_DWH = out2.Date_MODIFICATION_DWH;			


 


	tos_count_tReplicate_1++;

/**
 * [tReplicate_1 main ] stop
 */
	
	/**
	 * [tReplicate_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	

 



/**
 * [tReplicate_1 process_data_begin ] stop
 */

	
	/**
	 * [tFilterRow_2 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tReplicate_1","tReplicate_1","tReplicate","tFilterRow_2","INSERT_ARTICLE","tFilterRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		

          row6 = null;
    Operator_tFilterRow_2 ope_tFilterRow_2 = new Operator_tFilterRow_2("&&");
            ope_tFilterRow_2.matches((row5.BOOL == null? false : row5.BOOL.compareTo(ParserUtils.parseTo_Integer(String.valueOf(0))) == 0)
                           , "BOOL.compareTo(0) == 0 failed");
		 	
    
    if (ope_tFilterRow_2.getMatchFlag()) {
              if(row6 == null){ 
                row6 = new row6Struct();
              }
               row6.ID_DEPARTEMENT_INT = row5.ID_DEPARTEMENT_INT;
               row6.ID_RAYON_INT = row5.ID_RAYON_INT;
               row6.ID_FAMILLE_INT = row5.ID_FAMILLE_INT;
               row6.ID_SSFAMILLE_INT = row5.ID_SSFAMILLE_INT;
               row6.ID_SFAMILLE_INT = row5.ID_SFAMILLE_INT;
               row6.ID_UNITE_BESOIN_INT = row5.ID_UNITE_BESOIN_INT;
               row6.ID_GROUPE_PRODUIT = row5.ID_GROUPE_PRODUIT;
               row6.ID_ARTICLE_INR = row5.ID_ARTICLE_INR;
               row6.ID_ARTICLE_INV = row5.ID_ARTICLE_INV;
               row6.ID_ARTICLE = row5.ID_ARTICLE;
               row6.ID_ARTICLE_CEXUV = row5.ID_ARTICLE_CEXUV;
               row6.EAN13 = row5.EAN13;
               row6.ARTICLE_COURT = row5.ARTICLE_COURT;
               row6.ARTICLE_LONG = row5.ARTICLE_LONG;
               row6.ID_ETAT = row5.ID_ETAT;
               row6.ETAT_COURT = row5.ETAT_COURT;
               row6.ETAT_LONG = row5.ETAT_LONG;
               row6.DT_CREATION = row5.DT_CREATION;
               row6.SAISONNALITE = row5.SAISONNALITE;
               row6.ARTICLE_PROVENANCE = row5.ARTICLE_PROVENANCE;
               row6.ARTICLE_DETENTION = row5.ARTICLE_DETENTION;
               row6.ARTICLE_TYPE = row5.ARTICLE_TYPE;
               row6.ARTICLE_QRTL = row5.ARTICLE_QRTL;
               row6.ARTICLE_MARQ = row5.ARTICLE_MARQ;
               row6.CONTENANCE = row5.CONTENANCE;
               row6.PA = row5.PA;
               row6.PV = row5.PV;
               row6.DEBUT_STOCK = row5.DEBUT_STOCK;
               row6.FIN_STOCK = row5.FIN_STOCK;
               row6.RUPT_LONG_DUREE = row5.RUPT_LONG_DUREE;
               row6.ID_FOURNISSEUR = row5.ID_FOURNISSEUR;
               row6.ID_DEPARTEMENT = row5.ID_DEPARTEMENT;
               row6.ID_RAYON = row5.ID_RAYON;
               row6.ID_FAMILLE = row5.ID_FAMILLE;
               row6.ID_SFAMILLE = row5.ID_SFAMILLE;
               row6.ID_SSFAMILLE = row5.ID_SSFAMILLE;
               row6.DEPARTEMENT = row5.DEPARTEMENT;
               row6.RAYON = row5.RAYON;
               row6.FAMILLE = row5.FAMILLE;
               row6.SFAMILLE = row5.SFAMILLE;
               row6.SSFAMILLE = row5.SSFAMILLE;
               row6.UNITE_BESOIN = row5.UNITE_BESOIN;
               row6.ID_UNITE_BESOIN = row5.ID_UNITE_BESOIN;
               row6.BOOL = row5.BOOL;
               row6.ID_ARTICLE_CEXR = row5.ID_ARTICLE_CEXR;
               row6.Date_Creation_DWH = row5.Date_Creation_DWH;
               row6.Date_MODIFICATION_DWH = row5.Date_MODIFICATION_DWH;
					log.debug("tFilterRow_2 - Process the record " + (nb_line_tFilterRow_2+1) + ".");
					    
      nb_line_ok_tFilterRow_2++;
    } else {
      nb_line_reject_tFilterRow_2++;
    }

nb_line_tFilterRow_2++;

 


	tos_count_tFilterRow_2++;

/**
 * [tFilterRow_2 main ] stop
 */
	
	/**
	 * [tFilterRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	

 



/**
 * [tFilterRow_2 process_data_begin ] stop
 */
// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row6","tFilterRow_2","INSERT_ARTICLE","tFilterRow","tMap_2","tMap_2","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row6 - " + (row6==null? "": row6.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

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
								
                        		    		    row11HashKey.ID_FOURNISSEUR_INT = row6.ID_FOURNISSEUR;
                        		    		

								
		                        	row11HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row11.lookup( row11HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row11.hasNext()) { // G_TM_M_090

  								
		  				
	  								
						
									
	
		  								forceLooprow11 = true;
	  					
  									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
								
								else { // G 20 - G 21
   									forceLooprow11 = true;
			           		  	} // G 21
                    		  	
                    		

							row11Struct row11 = null;
                    		  	 
							

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

out3 = null;


// # Output table : 'out3'
count_out3_tMap_2++;

out3_tmp.ID_ARTICLE_INR = row6.ID_ARTICLE_INR;
out3_tmp.ID_ARTICLE = row6.ID_ARTICLE ;
out3_tmp.ID_ARTICLE_INV = row6.ID_ARTICLE_INV ;
out3_tmp.ID_ARTICLE_CEXUV = new BigDecimal(row6.ID_ARTICLE_CEXUV) ;
out3_tmp.ean_Principale = row6.EAN13;
out3_tmp.libelle_Court = row6.ARTICLE_COURT ;
out3_tmp.libelle_Long = row6.ARTICLE_LONG ;
out3_tmp.DEPARTEMENT = row6.DEPARTEMENT ;
out3_tmp.RAYON = row6.RAYON ;
out3_tmp.famille = row6.FAMILLE ;
out3_tmp.sous_famille = row6.SFAMILLE ;
out3_tmp.ss_famille = row6.SSFAMILLE ;
out3_tmp.ub = row6.UNITE_BESOIN ;
out3_tmp.saisonalite = row6.SAISONNALITE ;
out3_tmp.quartile_prix = row6.ARTICLE_QRTL ;
out3_tmp.marque = row6.ARTICLE_MARQ ;
out3_tmp.etat_court_Article = row6.ETAT_COURT ;
out3_tmp.id_dept = row6.ID_DEPARTEMENT_INT ;
out3_tmp.id_rayon = row6.ID_RAYON_INT ;
out3_tmp.id_Famille = row6.ID_FAMILLE_INT ;
out3_tmp.id_SSFam = row6.ID_SSFAMILLE_INT ;
out3_tmp.id_SFam = row6.ID_SFAMILLE_INT ;
out3_tmp.id_ub = row6.ID_UNITE_BESOIN_INT ;
out3_tmp.PROVENANCE = row6.ARTICLE_PROVENANCE ;
out3_tmp.ID_ARTICLE_CEXR = new BigDecimal(row6.ID_ARTICLE_CEXR);
out3_tmp.FK_FOURNISSEUR = row11.PK_FOURNISSEUR;
out3_tmp.Local_Import = row6.ARTICLE_TYPE ;
out3_tmp.Date_Creation_DWH = row6.Date_Creation_DWH ;
out3 = out3_tmp;
log.debug("tMap_2 - Outputting the record " + count_out3_tMap_2 + " of the output table 'out3'.");

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
// Start of branch "out3"
if(out3 != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out3","tMap_2","tMap_2","tMap","tDBOutput_1","inserte_article","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out3 - " + (out3==null? "": out3.toLogString()));
    			}
    		



            row9 = null;
        whetherReject_tDBOutput_1 = false;
                        pstmt_tDBOutput_1.setBigDecimal(1, out3.ID_ARTICLE_INR);

                        if(out3.ID_ARTICLE == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2, out3.ID_ARTICLE);
}

                        pstmt_tDBOutput_1.setBigDecimal(3, out3.ID_ARTICLE_INV);

                        pstmt_tDBOutput_1.setBigDecimal(4, out3.ID_ARTICLE_CEXUV);

                        if(out3.ean_Principale == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(5, out3.ean_Principale);
}

                        if(out3.libelle_Court == null) {
pstmt_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(6, out3.libelle_Court);
}

                        if(out3.libelle_Long == null) {
pstmt_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(7, out3.libelle_Long);
}

                        if(out3.DEPARTEMENT == null) {
pstmt_tDBOutput_1.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(8, out3.DEPARTEMENT);
}

                        if(out3.RAYON == null) {
pstmt_tDBOutput_1.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(9, out3.RAYON);
}

                        if(out3.famille == null) {
pstmt_tDBOutput_1.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(10, out3.famille);
}

                        if(out3.sous_famille == null) {
pstmt_tDBOutput_1.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(11, out3.sous_famille);
}

                        if(out3.ss_famille == null) {
pstmt_tDBOutput_1.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(12, out3.ss_famille);
}

                        if(out3.ub == null) {
pstmt_tDBOutput_1.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(13, out3.ub);
}

                        if(out3.saisonalite == null) {
pstmt_tDBOutput_1.setNull(14, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(14, out3.saisonalite);
}

                        if(out3.quartile_prix == null) {
pstmt_tDBOutput_1.setNull(15, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(15, out3.quartile_prix);
}

                        if(out3.marque == null) {
pstmt_tDBOutput_1.setNull(16, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(16, out3.marque);
}

                        if(out3.etat_court_Article == null) {
pstmt_tDBOutput_1.setNull(17, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(17, out3.etat_court_Article);
}

                        pstmt_tDBOutput_1.setBigDecimal(18, out3.id_dept);

                        pstmt_tDBOutput_1.setBigDecimal(19, out3.id_rayon);

                        pstmt_tDBOutput_1.setBigDecimal(20, out3.id_Famille);

                        pstmt_tDBOutput_1.setBigDecimal(21, out3.id_SSFam);

                        pstmt_tDBOutput_1.setBigDecimal(22, out3.id_SFam);

                        pstmt_tDBOutput_1.setBigDecimal(23, out3.id_ub);

                        if(out3.PROVENANCE == null) {
pstmt_tDBOutput_1.setNull(24, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(24, out3.PROVENANCE);
}

                        pstmt_tDBOutput_1.setBigDecimal(25, out3.ID_ARTICLE_CEXR);

                        pstmt_tDBOutput_1.setBigDecimal(26, out3.FK_FOURNISSEUR);

                        if(out3.Local_Import == null) {
pstmt_tDBOutput_1.setNull(27, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(27, out3.Local_Import);
}

                        if(out3.Date_Creation_DWH != null) {
pstmt_tDBOutput_1.setObject(28, new java.sql.Timestamp(out3.Date_Creation_DWH.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_1.setNull(28, java.sql.Types.DATE);
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
                            row9 = new row9Struct();
                                row9.ID_ARTICLE_INR = out3.ID_ARTICLE_INR;
                                row9.ID_ARTICLE = out3.ID_ARTICLE;
                                row9.ID_ARTICLE_INV = out3.ID_ARTICLE_INV;
                                row9.ID_ARTICLE_CEXUV = out3.ID_ARTICLE_CEXUV;
                                row9.ean_Principale = out3.ean_Principale;
                                row9.libelle_Court = out3.libelle_Court;
                                row9.libelle_Long = out3.libelle_Long;
                                row9.DEPARTEMENT = out3.DEPARTEMENT;
                                row9.RAYON = out3.RAYON;
                                row9.famille = out3.famille;
                                row9.sous_famille = out3.sous_famille;
                                row9.ss_famille = out3.ss_famille;
                                row9.ub = out3.ub;
                                row9.saisonalite = out3.saisonalite;
                                row9.quartile_prix = out3.quartile_prix;
                                row9.marque = out3.marque;
                                row9.etat_court_Article = out3.etat_court_Article;
                                row9.id_dept = out3.id_dept;
                                row9.id_rayon = out3.id_rayon;
                                row9.id_Famille = out3.id_Famille;
                                row9.id_SSFam = out3.id_SSFam;
                                row9.id_SFam = out3.id_SFam;
                                row9.id_ub = out3.id_ub;
                                row9.PROVENANCE = out3.PROVENANCE;
                                row9.ID_ARTICLE_CEXR = out3.ID_ARTICLE_CEXR;
                                row9.FK_FOURNISSEUR = out3.FK_FOURNISSEUR;
                                row9.Local_Import = out3.Local_Import;
                                row9.Date_Creation_DWH = out3.Date_Creation_DWH;
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
// Start of branch "row9"
if(row9 != null) { 



	
	/**
	 * [tFlowMeter_16 main ] start
	 */

	

	
	
	currentComponent="tFlowMeter_16";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row9","tDBOutput_1","inserte_article","tOracleOutput","tFlowMeter_16","tFlowMeter_16","tFlowMeter"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		

    count_tFlowMeter_16++; 
 


	tos_count_tFlowMeter_16++;

/**
 * [tFlowMeter_16 main ] stop
 */
	
	/**
	 * [tFlowMeter_16 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowMeter_16";

	

 



/**
 * [tFlowMeter_16 process_data_begin ] stop
 */
	
	/**
	 * [tFlowMeter_16 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowMeter_16";

	

 



/**
 * [tFlowMeter_16 process_data_end ] stop
 */

} // End of branch "row9"




	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "out3"



	
		} // close loop of lookup 'row11' // G_TM_M_043
	
	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row6"




	
	/**
	 * [tFilterRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	

 



/**
 * [tFilterRow_2 process_data_end ] stop
 */




	
	/**
	 * [tFilterRow_1 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row4","tReplicate_1","tReplicate_1","tReplicate","tFilterRow_1","UPDATE_ARTICLE","tFilterRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		

          row8 = null;
    Operator_tFilterRow_1 ope_tFilterRow_1 = new Operator_tFilterRow_1("&&");
            ope_tFilterRow_1.matches((row4.BOOL == null? false : row4.BOOL.compareTo(ParserUtils.parseTo_Integer(String.valueOf(1))) == 0)
                           , "BOOL.compareTo(1) == 0 failed");
		 	
    
    if (ope_tFilterRow_1.getMatchFlag()) {
              if(row8 == null){ 
                row8 = new row8Struct();
              }
               row8.ID_DEPARTEMENT_INT = row4.ID_DEPARTEMENT_INT;
               row8.ID_RAYON_INT = row4.ID_RAYON_INT;
               row8.ID_FAMILLE_INT = row4.ID_FAMILLE_INT;
               row8.ID_SSFAMILLE_INT = row4.ID_SSFAMILLE_INT;
               row8.ID_SFAMILLE_INT = row4.ID_SFAMILLE_INT;
               row8.ID_UNITE_BESOIN_INT = row4.ID_UNITE_BESOIN_INT;
               row8.ID_GROUPE_PRODUIT = row4.ID_GROUPE_PRODUIT;
               row8.ID_ARTICLE_INR = row4.ID_ARTICLE_INR;
               row8.ID_ARTICLE_INV = row4.ID_ARTICLE_INV;
               row8.ID_ARTICLE = row4.ID_ARTICLE;
               row8.ID_ARTICLE_CEXUV = row4.ID_ARTICLE_CEXUV;
               row8.EAN13 = row4.EAN13;
               row8.ARTICLE_COURT = row4.ARTICLE_COURT;
               row8.ARTICLE_LONG = row4.ARTICLE_LONG;
               row8.ID_ETAT = row4.ID_ETAT;
               row8.ETAT_COURT = row4.ETAT_COURT;
               row8.ETAT_LONG = row4.ETAT_LONG;
               row8.DT_CREATION = row4.DT_CREATION;
               row8.SAISONNALITE = row4.SAISONNALITE;
               row8.ARTICLE_PROVENANCE = row4.ARTICLE_PROVENANCE;
               row8.ARTICLE_DETENTION = row4.ARTICLE_DETENTION;
               row8.ARTICLE_TYPE = row4.ARTICLE_TYPE;
               row8.ARTICLE_QRTL = row4.ARTICLE_QRTL;
               row8.ARTICLE_MARQ = row4.ARTICLE_MARQ;
               row8.CONTENANCE = row4.CONTENANCE;
               row8.PA = row4.PA;
               row8.PV = row4.PV;
               row8.DEBUT_STOCK = row4.DEBUT_STOCK;
               row8.FIN_STOCK = row4.FIN_STOCK;
               row8.RUPT_LONG_DUREE = row4.RUPT_LONG_DUREE;
               row8.ID_FOURNISSEUR = row4.ID_FOURNISSEUR;
               row8.ID_DEPARTEMENT = row4.ID_DEPARTEMENT;
               row8.ID_RAYON = row4.ID_RAYON;
               row8.ID_FAMILLE = row4.ID_FAMILLE;
               row8.ID_SFAMILLE = row4.ID_SFAMILLE;
               row8.ID_SSFAMILLE = row4.ID_SSFAMILLE;
               row8.DEPARTEMENT = row4.DEPARTEMENT;
               row8.RAYON = row4.RAYON;
               row8.FAMILLE = row4.FAMILLE;
               row8.SFAMILLE = row4.SFAMILLE;
               row8.SSFAMILLE = row4.SSFAMILLE;
               row8.UNITE_BESOIN = row4.UNITE_BESOIN;
               row8.ID_UNITE_BESOIN = row4.ID_UNITE_BESOIN;
               row8.BOOL = row4.BOOL;
               row8.ID_ARTICLE_CEXR = row4.ID_ARTICLE_CEXR;
               row8.Date_Creation_DWH = row4.Date_Creation_DWH;
               row8.Date_MODIFICATION_DWH = row4.Date_MODIFICATION_DWH;
					log.debug("tFilterRow_1 - Process the record " + (nb_line_tFilterRow_1+1) + ".");
					    
      nb_line_ok_tFilterRow_1++;
    } else {
      nb_line_reject_tFilterRow_1++;
    }

nb_line_tFilterRow_1++;

 


	tos_count_tFilterRow_1++;

/**
 * [tFilterRow_1 main ] stop
 */
	
	/**
	 * [tFilterRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_begin ] stop
 */
// Start of branch "row8"
if(row8 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row8","tFilterRow_1","UPDATE_ARTICLE","tFilterRow","tMap_4","tMap_4","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row8 - " + (row8==null? "": row8.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row10" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow10 = false;
       		  	    	
       		  	    	
 							row10Struct row10ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
                        		    		    row10HashKey.ID_FOURNISSEUR = row8.ID_FOURNISSEUR;
                        		    		

								
		                        	row10HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row10.lookup( row10HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row10.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_4 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row10 != null && tHash_Lookup_row10.getCount(row10HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row10' and it contains more one result from keys :  row10.ID_FOURNISSEUR = '" + row10HashKey.ID_FOURNISSEUR + "'");
								} // G 071
							

							row10Struct row10 = null;
                    		  	 
							   
                    		  	 
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
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

copyOfout3 = null;

if(!rejectedInnerJoin_tMap_4 ) {

// # Output table : 'copyOfout3'
count_copyOfout3_tMap_4++;

copyOfout3_tmp.ID_ARTICLE = row8.ID_ARTICLE ;
copyOfout3_tmp.ID_ARTICLE_INR = row8.ID_ARTICLE_INR ;
copyOfout3_tmp.ID_ARTICLE_INV = row8.ID_ARTICLE_INV ;
copyOfout3_tmp.ID_ARTICLE_CEXUV = row8.ID_ARTICLE_CEXUV ;
copyOfout3_tmp.ean_Principale = row8.EAN13 ;
copyOfout3_tmp.libelle_Court = row8.ARTICLE_COURT ;
copyOfout3_tmp.libelle_Long = row8.ARTICLE_LONG ;
copyOfout3_tmp.DEPARTEMENT = row8.DEPARTEMENT ;
copyOfout3_tmp.RAYON = row8.RAYON ;
copyOfout3_tmp.famille = row8.FAMILLE ;
copyOfout3_tmp.sous_famille = row8.SFAMILLE ;
copyOfout3_tmp.ss_famille = row8.SSFAMILLE ;
copyOfout3_tmp.ub = row8.UNITE_BESOIN ;
copyOfout3_tmp.saisonalite = row8.SAISONNALITE ;
copyOfout3_tmp.quartile_prix = row8.ARTICLE_QRTL ;
copyOfout3_tmp.marque = row8.ARTICLE_MARQ ;
copyOfout3_tmp.etat_court_Article = row8.ETAT_COURT ;
copyOfout3_tmp.id_dept = row8.ID_DEPARTEMENT_INT ;
copyOfout3_tmp.id_rayon = row8.ID_RAYON_INT ;
copyOfout3_tmp.id_Famille = row8.ID_FAMILLE_INT ;
copyOfout3_tmp.id_SSFam = row8.ID_SSFAMILLE_INT ;
copyOfout3_tmp.id_SFam = row8.ID_SFAMILLE_INT ;
copyOfout3_tmp.id_ub = row8.ID_UNITE_BESOIN_INT ;
copyOfout3_tmp.PROVENANCE = row8.ARTICLE_PROVENANCE ;
copyOfout3_tmp.ID_ARTICLE_CEXR = new BigDecimal(row8.ID_ARTICLE_CEXR) ;
copyOfout3_tmp.FK_FOURNISSEUR = row10.PK_FOURNISSEUR ;
copyOfout3_tmp.Local_Import = row8.ARTICLE_TYPE ;
copyOfout3_tmp.Date_MODIFICATION_DWH = row8.Date_MODIFICATION_DWH ;
copyOfout3 = copyOfout3_tmp;
log.debug("tMap_4 - Outputting the record " + count_copyOfout3_tMap_4 + " of the output table 'copyOfout3'.");

}  // closing inner join bracket (2)
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
// Start of branch "copyOfout3"
if(copyOfout3 != null) { 



	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"copyOfout3","tMap_4","tMap_4","tMap","tMap_5","tMap_5","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("copyOfout3 - " + (copyOfout3==null? "": copyOfout3.toLogString()));
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

out5_tmp.ID_ARTICLE = copyOfout3.ID_ARTICLE ;
out5_tmp.ID_ARTICLE_INR = copyOfout3.ID_ARTICLE_INR ;
out5_tmp.ID_ARTICLE_INV = copyOfout3.ID_ARTICLE_INV ;
out5_tmp.ID_ARTICLE_CEXUV = new BigDecimal(copyOfout3.ID_ARTICLE_CEXUV) ;
out5_tmp.ean_Principale = copyOfout3.ean_Principale ;
out5_tmp.libelle_Court = copyOfout3.libelle_Court ;
out5_tmp.libelle_Long = copyOfout3.libelle_Long ;
out5_tmp.DEPARTEMENT = copyOfout3.DEPARTEMENT ;
out5_tmp.RAYON = copyOfout3.RAYON ;
out5_tmp.famille = copyOfout3.famille ;
out5_tmp.sous_famille = copyOfout3.sous_famille ;
out5_tmp.ss_famille = copyOfout3.ss_famille ;
out5_tmp.ub = copyOfout3.ub ;
out5_tmp.saisonalite = copyOfout3.saisonalite ;
out5_tmp.quartile_prix = copyOfout3.quartile_prix ;
out5_tmp.marque = copyOfout3.marque ;
out5_tmp.etat_court_Article = copyOfout3.etat_court_Article ;
out5_tmp.id_dept = copyOfout3.id_dept ;
out5_tmp.id_rayon = copyOfout3.id_rayon ;
out5_tmp.id_Famille = copyOfout3.id_Famille ;
out5_tmp.id_SSFam = copyOfout3.id_SSFam ;
out5_tmp.id_SFam = copyOfout3.id_SFam ;
out5_tmp.id_ub = copyOfout3.id_ub ;
out5_tmp.PROVENANCE = copyOfout3.PROVENANCE ;
out5_tmp.ID_ARTICLE_CEXR = copyOfout3.ID_ARTICLE_CEXR ;
out5_tmp.FK_FOURNISSEUR = copyOfout3.FK_FOURNISSEUR ;
out5_tmp.Local_Import = copyOfout3.Local_Import ;
out5_tmp.Date_MODIFICATION_DWH = copyOfout3.Date_MODIFICATION_DWH ;
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
				
					,"out5","tMap_5","tMap_5","tMap","tDBOutput_2","inserte_article","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out5 - " + (out5==null? "": out5.toLogString()));
    			}
    		



        whetherReject_tDBOutput_2 = false;
                    if(out5.ID_ARTICLE == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(1, out5.ID_ARTICLE);
}

                    pstmt_tDBOutput_2.setBigDecimal(2, out5.ID_ARTICLE_CEXUV);

                    if(out5.libelle_Court == null) {
pstmt_tDBOutput_2.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(3, out5.libelle_Court);
}

                    if(out5.libelle_Long == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(4, out5.libelle_Long);
}

                    if(out5.DEPARTEMENT == null) {
pstmt_tDBOutput_2.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(5, out5.DEPARTEMENT);
}

                    if(out5.RAYON == null) {
pstmt_tDBOutput_2.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(6, out5.RAYON);
}

                    if(out5.famille == null) {
pstmt_tDBOutput_2.setNull(7, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(7, out5.famille);
}

                    if(out5.sous_famille == null) {
pstmt_tDBOutput_2.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(8, out5.sous_famille);
}

                    if(out5.ss_famille == null) {
pstmt_tDBOutput_2.setNull(9, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(9, out5.ss_famille);
}

                    if(out5.ub == null) {
pstmt_tDBOutput_2.setNull(10, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(10, out5.ub);
}

                    if(out5.saisonalite == null) {
pstmt_tDBOutput_2.setNull(11, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(11, out5.saisonalite);
}

                    if(out5.quartile_prix == null) {
pstmt_tDBOutput_2.setNull(12, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(12, out5.quartile_prix);
}

                    if(out5.marque == null) {
pstmt_tDBOutput_2.setNull(13, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(13, out5.marque);
}

                    if(out5.etat_court_Article == null) {
pstmt_tDBOutput_2.setNull(14, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(14, out5.etat_court_Article);
}

                    pstmt_tDBOutput_2.setBigDecimal(15, out5.id_dept);

                    pstmt_tDBOutput_2.setBigDecimal(16, out5.id_rayon);

                    pstmt_tDBOutput_2.setBigDecimal(17, out5.id_Famille);

                    pstmt_tDBOutput_2.setBigDecimal(18, out5.id_SSFam);

                    pstmt_tDBOutput_2.setBigDecimal(19, out5.id_SFam);

                    pstmt_tDBOutput_2.setBigDecimal(20, out5.id_ub);

                    if(out5.PROVENANCE == null) {
pstmt_tDBOutput_2.setNull(21, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(21, out5.PROVENANCE);
}

                    pstmt_tDBOutput_2.setBigDecimal(22, out5.ID_ARTICLE_CEXR);

                    pstmt_tDBOutput_2.setBigDecimal(23, out5.FK_FOURNISSEUR);

                    if(out5.Local_Import == null) {
pstmt_tDBOutput_2.setNull(24, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(24, out5.Local_Import);
}

                    if(out5.Date_MODIFICATION_DWH != null) {
pstmt_tDBOutput_2.setObject(25, new java.sql.Timestamp(out5.Date_MODIFICATION_DWH.getTime()),java.sql.Types.DATE);
} else {
pstmt_tDBOutput_2.setNull(25, java.sql.Types.DATE);
}


                    pstmt_tDBOutput_2.setBigDecimal(26 + count_tDBOutput_2, out5.ID_ARTICLE_INR);


                    pstmt_tDBOutput_2.setBigDecimal(27 + count_tDBOutput_2, out5.ID_ARTICLE_INV);


                    if(out5.ean_Principale == null) {
pstmt_tDBOutput_2.setNull(28 + count_tDBOutput_2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(28 + count_tDBOutput_2, out5.ean_Principale);
}

                try {
                    nb_line_tDBOutput_2++;
                    int processedCount_tDBOutput_2 = pstmt_tDBOutput_2.executeUpdate();
                    updatedCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    rowsToCommitCount_tDBOutput_2 += processedCount_tDBOutput_2;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Updating")  + (" the record ")  + (nb_line_tDBOutput_2)  + (".") );
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

} // End of branch "out5"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
 */

} // End of branch "copyOfout3"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "row8"




	
	/**
	 * [tFilterRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_end ] stop
 */



	
	/**
	 * [tReplicate_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	

 



/**
 * [tReplicate_1 process_data_end ] stop
 */

} // End of branch "out2"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
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
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'out1': " + count_out1_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tDBInput_2","Oracle_ODS","tOracleInput","tMap_1","tMap_1","tMap","output")) {
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
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'out2': " + count_out2_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out1",2,0,
			 			"tMap_1","tMap_1","tMap","tMap_3","tMap_3","tMap","output")) {
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
	 * [tReplicate_1 end ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out2",2,0,
			 			"tMap_3","tMap_3","tMap","tReplicate_1","tReplicate_1","tReplicate","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tReplicate_1 - "  + ("Done.") );

ok_Hash.put("tReplicate_1", true);
end_Hash.put("tReplicate_1", System.currentTimeMillis());




/**
 * [tReplicate_1 end ] stop
 */

	
	/**
	 * [tFilterRow_2 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	
    globalMap.put("tFilterRow_2_NB_LINE", nb_line_tFilterRow_2);
    globalMap.put("tFilterRow_2_NB_LINE_OK", nb_line_ok_tFilterRow_2);
    globalMap.put("tFilterRow_2_NB_LINE_REJECT", nb_line_reject_tFilterRow_2);
    
    	log.info("tFilterRow_2 - Processed records count:" + nb_line_tFilterRow_2 + ". Matched records count:" + nb_line_ok_tFilterRow_2 + ". Rejected records count:" + nb_line_reject_tFilterRow_2 + ".");

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tReplicate_1","tReplicate_1","tReplicate","tFilterRow_2","INSERT_ARTICLE","tFilterRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFilterRow_2 - "  + ("Done.") );

ok_Hash.put("tFilterRow_2", true);
end_Hash.put("tFilterRow_2", System.currentTimeMillis());




/**
 * [tFilterRow_2 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'out3': " + count_out3_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row6",2,0,
			 			"tFilterRow_2","INSERT_ARTICLE","tFilterRow","tMap_2","tMap_2","tMap","output")) {
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



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out3",2,0,
			 			"tMap_2","tMap_2","tMap","tDBOutput_1","inserte_article","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Done.") );

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */

	
	/**
	 * [tFlowMeter_16 end ] start
	 */

	

	
	
	currentComponent="tFlowMeter_16";

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
			 			"tDBOutput_1","inserte_article","tOracleOutput","tFlowMeter_16","tFlowMeter_16","tFlowMeter","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_16 - "  + ("Done.") );

ok_Hash.put("tFlowMeter_16", true);
end_Hash.put("tFlowMeter_16", System.currentTimeMillis());




/**
 * [tFlowMeter_16 end ] stop
 */













	
	/**
	 * [tFilterRow_1 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
    globalMap.put("tFilterRow_1_NB_LINE", nb_line_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_OK", nb_line_ok_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_REJECT", nb_line_reject_tFilterRow_1);
    
    	log.info("tFilterRow_1 - Processed records count:" + nb_line_tFilterRow_1 + ". Matched records count:" + nb_line_ok_tFilterRow_1 + ". Rejected records count:" + nb_line_reject_tFilterRow_1 + ".");

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row4",2,0,
			 			"tReplicate_1","tReplicate_1","tReplicate","tFilterRow_1","UPDATE_ARTICLE","tFilterRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFilterRow_1 - "  + ("Done.") );

ok_Hash.put("tFilterRow_1", true);
end_Hash.put("tFilterRow_1", System.currentTimeMillis());




/**
 * [tFilterRow_1 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'copyOfout3': " + count_copyOfout3_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row8",2,0,
			 			"tFilterRow_1","UPDATE_ARTICLE","tFilterRow","tMap_4","tMap_4","tMap","output")) {
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





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"copyOfout3",2,0,
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
            log.debug("tDBOutput_2 - "  + ("Has ")  + ("updated")  + (" ")  + (nb_line_update_tDBOutput_2)  + (" record(s).") );



			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out5",2,0,
			 			"tMap_5","tMap_5","tMap","tDBOutput_2","inserte_article","tOracleOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_2 - "  + ("Done.") );

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */





















						if(execStat){
							runStat.updateStatOnConnection("iterate1", 2, "exec" + NB_ITERATE_tDBInput_2);
						}				
					




	
	/**
	 * [tFlowToIterate_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 process_data_end ] stop
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
	 * [tFlowToIterate_1 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

globalMap.put("tFlowToIterate_1_NB_LINE",nb_line_tFlowToIterate_1);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_1","Oracle_ODS_structure_marchandise","tOracleInput","tFlowToIterate_1","tFlowToIterate_1","tFlowToIterate","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFlowToIterate_1 - "  + ("Done.") );

ok_Hash.put("tFlowToIterate_1", true);
end_Hash.put("tFlowToIterate_1", System.currentTimeMillis());




/**
 * [tFlowToIterate_1 end ] stop
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
					     			globalMap.remove("tHash_Lookup_row10"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row11"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_1 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 finally ] stop
 */

	
	/**
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tReplicate_1 finally ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	

 



/**
 * [tReplicate_1 finally ] stop
 */

	
	/**
	 * [tFilterRow_2 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	

 



/**
 * [tFilterRow_2 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
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

	
	/**
	 * [tFlowMeter_16 finally ] start
	 */

	

	
	
	currentComponent="tFlowMeter_16";

	

 



/**
 * [tFlowMeter_16 finally ] stop
 */













	
	/**
	 * [tFilterRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 finally ] stop
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



























				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
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
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Probleme de connexion a la base BI\"");
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
	System.err.println("Probleme de connexion a la base BI");
	
		log.error("tDie_1 - The die message: "+"Probleme de connexion a la base BI");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Probleme de connexion a la base BI");
	globalMap.put("tDie_1_DIE_MESSAGES", "Probleme de connexion a la base BI");
	
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
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public BigDecimal PK_ARTICLE;

				public BigDecimal getPK_ARTICLE () {
					return this.PK_ARTICLE;
				}
				
			    public BigDecimal ID_ARTICLE_INR;

				public BigDecimal getID_ARTICLE_INR () {
					return this.ID_ARTICLE_INR;
				}
				
			    public BigDecimal ID_ARTICLE_INV;

				public BigDecimal getID_ARTICLE_INV () {
					return this.ID_ARTICLE_INV;
				}
				
			    public BigDecimal ID_ARTICLE_CEXR;

				public BigDecimal getID_ARTICLE_CEXR () {
					return this.ID_ARTICLE_CEXR;
				}
				
			    public BigDecimal ID_ARTICLE_CEXUV;

				public BigDecimal getID_ARTICLE_CEXUV () {
					return this.ID_ARTICLE_CEXUV;
				}
				
			    public String LIBELLE_COURT;

				public String getLIBELLE_COURT () {
					return this.LIBELLE_COURT;
				}
				
			    public String LIBELLE_LONG;

				public String getLIBELLE_LONG () {
					return this.LIBELLE_LONG;
				}
				
			    public String ECOM_O_N;

				public String getECOM_O_N () {
					return this.ECOM_O_N;
				}
				
			    public BigDecimal ID_DEPT;

				public BigDecimal getID_DEPT () {
					return this.ID_DEPT;
				}
				
			    public String DEPARTEMENT;

				public String getDEPARTEMENT () {
					return this.DEPARTEMENT;
				}
				
			    public BigDecimal ID_RAYON;

				public BigDecimal getID_RAYON () {
					return this.ID_RAYON;
				}
				
			    public String RAYON;

				public String getRAYON () {
					return this.RAYON;
				}
				
			    public BigDecimal ID_FAMILLE;

				public BigDecimal getID_FAMILLE () {
					return this.ID_FAMILLE;
				}
				
			    public String FAMILLE;

				public String getFAMILLE () {
					return this.FAMILLE;
				}
				
			    public BigDecimal ID_SFAM;

				public BigDecimal getID_SFAM () {
					return this.ID_SFAM;
				}
				
			    public String SOUS_FAMILLE;

				public String getSOUS_FAMILLE () {
					return this.SOUS_FAMILLE;
				}
				
			    public BigDecimal ID_SSFAM;

				public BigDecimal getID_SSFAM () {
					return this.ID_SSFAM;
				}
				
			    public String SS_FAMILLE;

				public String getSS_FAMILLE () {
					return this.SS_FAMILLE;
				}
				
			    public BigDecimal ID_UB;

				public BigDecimal getID_UB () {
					return this.ID_UB;
				}
				
			    public String UB;

				public String getUB () {
					return this.UB;
				}
				
			    public String MARQUE;

				public String getMARQUE () {
					return this.MARQUE;
				}
				
			    public String SAISONALITE;

				public String getSAISONALITE () {
					return this.SAISONALITE;
				}
				
			    public String QUARTILE_PRIX;

				public String getQUARTILE_PRIX () {
					return this.QUARTILE_PRIX;
				}
				
			    public String PROVENANCE;

				public String getPROVENANCE () {
					return this.PROVENANCE;
				}
				
			    public String LOCAL_IMPORT;

				public String getLOCAL_IMPORT () {
					return this.LOCAL_IMPORT;
				}
				
			    public BigDecimal FK_FOURNISSEUR;

				public BigDecimal getFK_FOURNISSEUR () {
					return this.FK_FOURNISSEUR;
				}
				
			    public String ETAT_COURT_ARTICLE;

				public String getETAT_COURT_ARTICLE () {
					return this.ETAT_COURT_ARTICLE;
				}
				
			    public java.util.Date DATE_CREATION_DWH;

				public java.util.Date getDATE_CREATION_DWH () {
					return this.DATE_CREATION_DWH;
				}
				
			    public java.util.Date DATE_MODIFICATION_DWH;

				public java.util.Date getDATE_MODIFICATION_DWH () {
					return this.DATE_MODIFICATION_DWH;
				}
				
			    public String EAN_PRINCIPALE;

				public String getEAN_PRINCIPALE () {
					return this.EAN_PRINCIPALE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ID_ARTICLE_INR == null) ? 0 : new Double(this.ID_ARTICLE_INR.doubleValue()).hashCode());
						
						result = prime * result + ((this.ID_ARTICLE_INV == null) ? 0 : new Double(this.ID_ARTICLE_INV.doubleValue()).hashCode());
						
						result = prime * result + ((this.EAN_PRINCIPALE == null) ? 0 : this.EAN_PRINCIPALE.hashCode());
					
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
					
						if (this.EAN_PRINCIPALE == null) {
							if (other.EAN_PRINCIPALE != null)
								return false;
						
						} else if (!this.EAN_PRINCIPALE.equals(other.EAN_PRINCIPALE))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.PK_ARTICLE = this.PK_ARTICLE;
	            other.ID_ARTICLE_INR = this.ID_ARTICLE_INR;
	            other.ID_ARTICLE_INV = this.ID_ARTICLE_INV;
	            other.ID_ARTICLE_CEXR = this.ID_ARTICLE_CEXR;
	            other.ID_ARTICLE_CEXUV = this.ID_ARTICLE_CEXUV;
	            other.LIBELLE_COURT = this.LIBELLE_COURT;
	            other.LIBELLE_LONG = this.LIBELLE_LONG;
	            other.ECOM_O_N = this.ECOM_O_N;
	            other.ID_DEPT = this.ID_DEPT;
	            other.DEPARTEMENT = this.DEPARTEMENT;
	            other.ID_RAYON = this.ID_RAYON;
	            other.RAYON = this.RAYON;
	            other.ID_FAMILLE = this.ID_FAMILLE;
	            other.FAMILLE = this.FAMILLE;
	            other.ID_SFAM = this.ID_SFAM;
	            other.SOUS_FAMILLE = this.SOUS_FAMILLE;
	            other.ID_SSFAM = this.ID_SSFAM;
	            other.SS_FAMILLE = this.SS_FAMILLE;
	            other.ID_UB = this.ID_UB;
	            other.UB = this.UB;
	            other.MARQUE = this.MARQUE;
	            other.SAISONALITE = this.SAISONALITE;
	            other.QUARTILE_PRIX = this.QUARTILE_PRIX;
	            other.PROVENANCE = this.PROVENANCE;
	            other.LOCAL_IMPORT = this.LOCAL_IMPORT;
	            other.FK_FOURNISSEUR = this.FK_FOURNISSEUR;
	            other.ETAT_COURT_ARTICLE = this.ETAT_COURT_ARTICLE;
	            other.DATE_CREATION_DWH = this.DATE_CREATION_DWH;
	            other.DATE_MODIFICATION_DWH = this.DATE_MODIFICATION_DWH;
	            other.EAN_PRINCIPALE = this.EAN_PRINCIPALE;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.ID_ARTICLE_INR = this.ID_ARTICLE_INR;
	            	other.ID_ARTICLE_INV = this.ID_ARTICLE_INV;
	            	other.EAN_PRINCIPALE = this.EAN_PRINCIPALE;
	            	
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
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

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.EAN_PRINCIPALE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_ARTICLE_INR = (BigDecimal) dis.readObject();
					
						this.ID_ARTICLE_INV = (BigDecimal) dis.readObject();
					
					this.EAN_PRINCIPALE = readString(dis);
					
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
					
					// String
				
						writeString(this.EAN_PRINCIPALE,dos);
					
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
					
					// String
				
						writeString(this.EAN_PRINCIPALE,dos);
					
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
					
       			    	this.ID_ARTICLE_CEXR = (BigDecimal) ois.readObject();
					
       			    	this.ID_ARTICLE_CEXUV = (BigDecimal) ois.readObject();
					
						this.LIBELLE_COURT = readString(dis,ois);
					
						this.LIBELLE_LONG = readString(dis,ois);
					
						this.ECOM_O_N = readString(dis,ois);
					
       			    	this.ID_DEPT = (BigDecimal) ois.readObject();
					
						this.DEPARTEMENT = readString(dis,ois);
					
       			    	this.ID_RAYON = (BigDecimal) ois.readObject();
					
						this.RAYON = readString(dis,ois);
					
       			    	this.ID_FAMILLE = (BigDecimal) ois.readObject();
					
						this.FAMILLE = readString(dis,ois);
					
       			    	this.ID_SFAM = (BigDecimal) ois.readObject();
					
						this.SOUS_FAMILLE = readString(dis,ois);
					
       			    	this.ID_SSFAM = (BigDecimal) ois.readObject();
					
						this.SS_FAMILLE = readString(dis,ois);
					
       			    	this.ID_UB = (BigDecimal) ois.readObject();
					
						this.UB = readString(dis,ois);
					
						this.MARQUE = readString(dis,ois);
					
						this.SAISONALITE = readString(dis,ois);
					
						this.QUARTILE_PRIX = readString(dis,ois);
					
						this.PROVENANCE = readString(dis,ois);
					
						this.LOCAL_IMPORT = readString(dis,ois);
					
       			    	this.FK_FOURNISSEUR = (BigDecimal) ois.readObject();
					
						this.ETAT_COURT_ARTICLE = readString(dis,ois);
					
						this.DATE_CREATION_DWH = readDate(dis,ois);
					
						this.DATE_MODIFICATION_DWH = readDate(dis,ois);
					
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
					
       			    	this.ID_ARTICLE_CEXR = (BigDecimal) objectIn.readObject();
					
       			    	this.ID_ARTICLE_CEXUV = (BigDecimal) objectIn.readObject();
					
						this.LIBELLE_COURT = readString(dis,objectIn);
					
						this.LIBELLE_LONG = readString(dis,objectIn);
					
						this.ECOM_O_N = readString(dis,objectIn);
					
       			    	this.ID_DEPT = (BigDecimal) objectIn.readObject();
					
						this.DEPARTEMENT = readString(dis,objectIn);
					
       			    	this.ID_RAYON = (BigDecimal) objectIn.readObject();
					
						this.RAYON = readString(dis,objectIn);
					
       			    	this.ID_FAMILLE = (BigDecimal) objectIn.readObject();
					
						this.FAMILLE = readString(dis,objectIn);
					
       			    	this.ID_SFAM = (BigDecimal) objectIn.readObject();
					
						this.SOUS_FAMILLE = readString(dis,objectIn);
					
       			    	this.ID_SSFAM = (BigDecimal) objectIn.readObject();
					
						this.SS_FAMILLE = readString(dis,objectIn);
					
       			    	this.ID_UB = (BigDecimal) objectIn.readObject();
					
						this.UB = readString(dis,objectIn);
					
						this.MARQUE = readString(dis,objectIn);
					
						this.SAISONALITE = readString(dis,objectIn);
					
						this.QUARTILE_PRIX = readString(dis,objectIn);
					
						this.PROVENANCE = readString(dis,objectIn);
					
						this.LOCAL_IMPORT = readString(dis,objectIn);
					
       			    	this.FK_FOURNISSEUR = (BigDecimal) objectIn.readObject();
					
						this.ETAT_COURT_ARTICLE = readString(dis,objectIn);
					
						this.DATE_CREATION_DWH = readDate(dis,objectIn);
					
						this.DATE_MODIFICATION_DWH = readDate(dis,objectIn);
					
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
					
       			    	oos.writeObject(this.ID_ARTICLE_CEXR);
					
       			    	oos.writeObject(this.ID_ARTICLE_CEXUV);
					
						writeString(this.LIBELLE_COURT, dos, oos);
					
						writeString(this.LIBELLE_LONG, dos, oos);
					
						writeString(this.ECOM_O_N, dos, oos);
					
       			    	oos.writeObject(this.ID_DEPT);
					
						writeString(this.DEPARTEMENT, dos, oos);
					
       			    	oos.writeObject(this.ID_RAYON);
					
						writeString(this.RAYON, dos, oos);
					
       			    	oos.writeObject(this.ID_FAMILLE);
					
						writeString(this.FAMILLE, dos, oos);
					
       			    	oos.writeObject(this.ID_SFAM);
					
						writeString(this.SOUS_FAMILLE, dos, oos);
					
       			    	oos.writeObject(this.ID_SSFAM);
					
						writeString(this.SS_FAMILLE, dos, oos);
					
       			    	oos.writeObject(this.ID_UB);
					
						writeString(this.UB, dos, oos);
					
						writeString(this.MARQUE, dos, oos);
					
						writeString(this.SAISONALITE, dos, oos);
					
						writeString(this.QUARTILE_PRIX, dos, oos);
					
						writeString(this.PROVENANCE, dos, oos);
					
						writeString(this.LOCAL_IMPORT, dos, oos);
					
       			    	oos.writeObject(this.FK_FOURNISSEUR);
					
						writeString(this.ETAT_COURT_ARTICLE, dos, oos);
					
						writeDate(this.DATE_CREATION_DWH, dos, oos);
					
						writeDate(this.DATE_MODIFICATION_DWH, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
       			    	objectOut.writeObject(this.PK_ARTICLE);
					
       			    	objectOut.writeObject(this.ID_ARTICLE_CEXR);
					
       			    	objectOut.writeObject(this.ID_ARTICLE_CEXUV);
					
						writeString(this.LIBELLE_COURT, dos, objectOut);
					
						writeString(this.LIBELLE_LONG, dos, objectOut);
					
						writeString(this.ECOM_O_N, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_DEPT);
					
						writeString(this.DEPARTEMENT, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_RAYON);
					
						writeString(this.RAYON, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_FAMILLE);
					
						writeString(this.FAMILLE, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_SFAM);
					
						writeString(this.SOUS_FAMILLE, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_SSFAM);
					
						writeString(this.SS_FAMILLE, dos, objectOut);
					
       			    	objectOut.writeObject(this.ID_UB);
					
						writeString(this.UB, dos, objectOut);
					
						writeString(this.MARQUE, dos, objectOut);
					
						writeString(this.SAISONALITE, dos, objectOut);
					
						writeString(this.QUARTILE_PRIX, dos, objectOut);
					
						writeString(this.PROVENANCE, dos, objectOut);
					
						writeString(this.LOCAL_IMPORT, dos, objectOut);
					
       			    	objectOut.writeObject(this.FK_FOURNISSEUR);
					
						writeString(this.ETAT_COURT_ARTICLE, dos, objectOut);
					
						writeDate(this.DATE_CREATION_DWH, dos, objectOut);
					
						writeDate(this.DATE_MODIFICATION_DWH, dos, objectOut);
					
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
		sb.append("PK_ARTICLE="+String.valueOf(PK_ARTICLE));
		sb.append(",ID_ARTICLE_INR="+String.valueOf(ID_ARTICLE_INR));
		sb.append(",ID_ARTICLE_INV="+String.valueOf(ID_ARTICLE_INV));
		sb.append(",ID_ARTICLE_CEXR="+String.valueOf(ID_ARTICLE_CEXR));
		sb.append(",ID_ARTICLE_CEXUV="+String.valueOf(ID_ARTICLE_CEXUV));
		sb.append(",LIBELLE_COURT="+LIBELLE_COURT);
		sb.append(",LIBELLE_LONG="+LIBELLE_LONG);
		sb.append(",ECOM_O_N="+ECOM_O_N);
		sb.append(",ID_DEPT="+String.valueOf(ID_DEPT));
		sb.append(",DEPARTEMENT="+DEPARTEMENT);
		sb.append(",ID_RAYON="+String.valueOf(ID_RAYON));
		sb.append(",RAYON="+RAYON);
		sb.append(",ID_FAMILLE="+String.valueOf(ID_FAMILLE));
		sb.append(",FAMILLE="+FAMILLE);
		sb.append(",ID_SFAM="+String.valueOf(ID_SFAM));
		sb.append(",SOUS_FAMILLE="+SOUS_FAMILLE);
		sb.append(",ID_SSFAM="+String.valueOf(ID_SSFAM));
		sb.append(",SS_FAMILLE="+SS_FAMILLE);
		sb.append(",ID_UB="+String.valueOf(ID_UB));
		sb.append(",UB="+UB);
		sb.append(",MARQUE="+MARQUE);
		sb.append(",SAISONALITE="+SAISONALITE);
		sb.append(",QUARTILE_PRIX="+QUARTILE_PRIX);
		sb.append(",PROVENANCE="+PROVENANCE);
		sb.append(",LOCAL_IMPORT="+LOCAL_IMPORT);
		sb.append(",FK_FOURNISSEUR="+String.valueOf(FK_FOURNISSEUR));
		sb.append(",ETAT_COURT_ARTICLE="+ETAT_COURT_ARTICLE);
		sb.append(",DATE_CREATION_DWH="+String.valueOf(DATE_CREATION_DWH));
		sb.append(",DATE_MODIFICATION_DWH="+String.valueOf(DATE_MODIFICATION_DWH));
		sb.append(",EAN_PRINCIPALE="+EAN_PRINCIPALE);
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
        		
        				if(ID_ARTICLE_CEXR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXR);
            			}
            		
        			sb.append("|");
        		
        				if(ID_ARTICLE_CEXUV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_ARTICLE_CEXUV);
            			}
            		
        			sb.append("|");
        		
        				if(LIBELLE_COURT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBELLE_COURT);
            			}
            		
        			sb.append("|");
        		
        				if(LIBELLE_LONG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIBELLE_LONG);
            			}
            		
        			sb.append("|");
        		
        				if(ECOM_O_N == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ECOM_O_N);
            			}
            		
        			sb.append("|");
        		
        				if(ID_DEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_DEPT);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTEMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTEMENT);
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
        		
        				if(ID_SFAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SFAM);
            			}
            		
        			sb.append("|");
        		
        				if(SOUS_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOUS_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_SSFAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_SSFAM);
            			}
            		
        			sb.append("|");
        		
        				if(SS_FAMILLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SS_FAMILLE);
            			}
            		
        			sb.append("|");
        		
        				if(ID_UB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_UB);
            			}
            		
        			sb.append("|");
        		
        				if(UB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UB);
            			}
            		
        			sb.append("|");
        		
        				if(MARQUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARQUE);
            			}
            		
        			sb.append("|");
        		
        				if(SAISONALITE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAISONALITE);
            			}
            		
        			sb.append("|");
        		
        				if(QUARTILE_PRIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(QUARTILE_PRIX);
            			}
            		
        			sb.append("|");
        		
        				if(PROVENANCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROVENANCE);
            			}
            		
        			sb.append("|");
        		
        				if(LOCAL_IMPORT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOCAL_IMPORT);
            			}
            		
        			sb.append("|");
        		
        				if(FK_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FK_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(ETAT_COURT_ARTICLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETAT_COURT_ARTICLE);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_CREATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_CREATION_DWH);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_MODIFICATION_DWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_MODIFICATION_DWH);
            			}
            		
        			sb.append("|");
        		
        				if(EAN_PRINCIPALE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EAN_PRINCIPALE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_ARTICLE_INR, other.ID_ARTICLE_INR);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ID_ARTICLE_INV, other.ID_ARTICLE_INV);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.EAN_PRINCIPALE, other.EAN_PRINCIPALE);
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
			   		// linked node: tMap_3 - inputs:(out1,row3) outputs:(out2)
			   
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
                            log4jParamters_tDBInput_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:zFhB0AmapKOn4m6Y4Mnh4guv8criePn/3RnxtuDuyRN2wPg=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"select *from dwh_article\"");
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
                            log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PK_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_INV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_CEXR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_ARTICLE_CEXUV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIBELLE_COURT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIBELLE_LONG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ECOM_O_N")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_DEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPARTEMENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_RAYON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RAYON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SFAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOUS_FAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_SSFAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SS_FAMILLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_UB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MARQUE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SAISONALITE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("QUARTILE_PRIX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PROVENANCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LOCAL_IMPORT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FK_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT_COURT_ARTICLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_CREATION_DWH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_MODIFICATION_DWH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EAN_PRINCIPALE")+"}]");
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
				talendJobLog.addCM("tDBInput_3", "Oracle_DW", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_3);
				
			String url_tDBInput_3 = null;
				url_tDBInput_3 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_3 = "dw";

				

				 
	final String decryptedPassword_tDBInput_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:daHsHpTFknC+f1tTwpNbS+7iIOzORlEcLeDJyMhJX761/B0=");

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

		    String dbquery_tDBInput_3 = "select *from dwh_article";
		    
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
								row3.PK_ARTICLE = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(1) != null) {
						row3.PK_ARTICLE = rs_tDBInput_3.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row3.ID_ARTICLE_INR = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(2) != null) {
						row3.ID_ARTICLE_INR = rs_tDBInput_3.getBigDecimal(2);
					} else {
				
						row3.ID_ARTICLE_INR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row3.ID_ARTICLE_INV = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(3) != null) {
						row3.ID_ARTICLE_INV = rs_tDBInput_3.getBigDecimal(3);
					} else {
				
						row3.ID_ARTICLE_INV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row3.ID_ARTICLE_CEXR = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(4) != null) {
						row3.ID_ARTICLE_CEXR = rs_tDBInput_3.getBigDecimal(4);
					} else {
				
						row3.ID_ARTICLE_CEXR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row3.ID_ARTICLE_CEXUV = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(5) != null) {
						row3.ID_ARTICLE_CEXUV = rs_tDBInput_3.getBigDecimal(5);
					} else {
				
						row3.ID_ARTICLE_CEXUV = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row3.LIBELLE_COURT = null;
							} else {
	                         		
        	row3.LIBELLE_COURT = routines.system.JDBCUtil.getString(rs_tDBInput_3, 6, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 7) {
								row3.LIBELLE_LONG = null;
							} else {
	                         		
        	row3.LIBELLE_LONG = routines.system.JDBCUtil.getString(rs_tDBInput_3, 7, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 8) {
								row3.ECOM_O_N = null;
							} else {
	                         		
        	row3.ECOM_O_N = routines.system.JDBCUtil.getString(rs_tDBInput_3, 8, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 9) {
								row3.ID_DEPT = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(9) != null) {
						row3.ID_DEPT = rs_tDBInput_3.getBigDecimal(9);
					} else {
				
						row3.ID_DEPT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 10) {
								row3.DEPARTEMENT = null;
							} else {
	                         		
        	row3.DEPARTEMENT = routines.system.JDBCUtil.getString(rs_tDBInput_3, 10, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 11) {
								row3.ID_RAYON = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(11) != null) {
						row3.ID_RAYON = rs_tDBInput_3.getBigDecimal(11);
					} else {
				
						row3.ID_RAYON = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 12) {
								row3.RAYON = null;
							} else {
	                         		
        	row3.RAYON = routines.system.JDBCUtil.getString(rs_tDBInput_3, 12, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 13) {
								row3.ID_FAMILLE = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(13) != null) {
						row3.ID_FAMILLE = rs_tDBInput_3.getBigDecimal(13);
					} else {
				
						row3.ID_FAMILLE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 14) {
								row3.FAMILLE = null;
							} else {
	                         		
        	row3.FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 14, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 15) {
								row3.ID_SFAM = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(15) != null) {
						row3.ID_SFAM = rs_tDBInput_3.getBigDecimal(15);
					} else {
				
						row3.ID_SFAM = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 16) {
								row3.SOUS_FAMILLE = null;
							} else {
	                         		
        	row3.SOUS_FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 16, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 17) {
								row3.ID_SSFAM = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(17) != null) {
						row3.ID_SSFAM = rs_tDBInput_3.getBigDecimal(17);
					} else {
				
						row3.ID_SSFAM = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 18) {
								row3.SS_FAMILLE = null;
							} else {
	                         		
        	row3.SS_FAMILLE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 18, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 19) {
								row3.ID_UB = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(19) != null) {
						row3.ID_UB = rs_tDBInput_3.getBigDecimal(19);
					} else {
				
						row3.ID_UB = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 20) {
								row3.UB = null;
							} else {
	                         		
        	row3.UB = routines.system.JDBCUtil.getString(rs_tDBInput_3, 20, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 21) {
								row3.MARQUE = null;
							} else {
	                         		
        	row3.MARQUE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 21, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 22) {
								row3.SAISONALITE = null;
							} else {
	                         		
        	row3.SAISONALITE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 22, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 23) {
								row3.QUARTILE_PRIX = null;
							} else {
	                         		
        	row3.QUARTILE_PRIX = routines.system.JDBCUtil.getString(rs_tDBInput_3, 23, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 24) {
								row3.PROVENANCE = null;
							} else {
	                         		
        	row3.PROVENANCE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 24, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 25) {
								row3.LOCAL_IMPORT = null;
							} else {
	                         		
        	row3.LOCAL_IMPORT = routines.system.JDBCUtil.getString(rs_tDBInput_3, 25, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 26) {
								row3.FK_FOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_3.getObject(26) != null) {
						row3.FK_FOURNISSEUR = rs_tDBInput_3.getBigDecimal(26);
					} else {
				
						row3.FK_FOURNISSEUR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_3 < 27) {
								row3.ETAT_COURT_ARTICLE = null;
							} else {
	                         		
        	row3.ETAT_COURT_ARTICLE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 27, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 28) {
								row3.DATE_CREATION_DWH = null;
							} else {
										
			row3.DATE_CREATION_DWH = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 28);
		                    }
							if(colQtyInRs_tDBInput_3 < 29) {
								row3.DATE_MODIFICATION_DWH = null;
							} else {
										
			row3.DATE_MODIFICATION_DWH = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 29);
		                    }
							if(colQtyInRs_tDBInput_3 < 30) {
								row3.EAN_PRINCIPALE = null;
							} else {
	                         		
        	row3.EAN_PRINCIPALE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 30, false);
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
				
					,"row3","tDBInput_3","Oracle_DW","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		


			   
			   

					row3Struct row3_HashRow = new row3Struct();
		   	   	   
				
				row3_HashRow.PK_ARTICLE = row3.PK_ARTICLE;
				
				row3_HashRow.ID_ARTICLE_INR = row3.ID_ARTICLE_INR;
				
				row3_HashRow.ID_ARTICLE_INV = row3.ID_ARTICLE_INV;
				
				row3_HashRow.ID_ARTICLE_CEXR = row3.ID_ARTICLE_CEXR;
				
				row3_HashRow.ID_ARTICLE_CEXUV = row3.ID_ARTICLE_CEXUV;
				
				row3_HashRow.LIBELLE_COURT = row3.LIBELLE_COURT;
				
				row3_HashRow.LIBELLE_LONG = row3.LIBELLE_LONG;
				
				row3_HashRow.ECOM_O_N = row3.ECOM_O_N;
				
				row3_HashRow.ID_DEPT = row3.ID_DEPT;
				
				row3_HashRow.DEPARTEMENT = row3.DEPARTEMENT;
				
				row3_HashRow.ID_RAYON = row3.ID_RAYON;
				
				row3_HashRow.RAYON = row3.RAYON;
				
				row3_HashRow.ID_FAMILLE = row3.ID_FAMILLE;
				
				row3_HashRow.FAMILLE = row3.FAMILLE;
				
				row3_HashRow.ID_SFAM = row3.ID_SFAM;
				
				row3_HashRow.SOUS_FAMILLE = row3.SOUS_FAMILLE;
				
				row3_HashRow.ID_SSFAM = row3.ID_SSFAM;
				
				row3_HashRow.SS_FAMILLE = row3.SS_FAMILLE;
				
				row3_HashRow.ID_UB = row3.ID_UB;
				
				row3_HashRow.UB = row3.UB;
				
				row3_HashRow.MARQUE = row3.MARQUE;
				
				row3_HashRow.SAISONALITE = row3.SAISONALITE;
				
				row3_HashRow.QUARTILE_PRIX = row3.QUARTILE_PRIX;
				
				row3_HashRow.PROVENANCE = row3.PROVENANCE;
				
				row3_HashRow.LOCAL_IMPORT = row3.LOCAL_IMPORT;
				
				row3_HashRow.FK_FOURNISSEUR = row3.FK_FOURNISSEUR;
				
				row3_HashRow.ETAT_COURT_ARTICLE = row3.ETAT_COURT_ARTICLE;
				
				row3_HashRow.DATE_CREATION_DWH = row3.DATE_CREATION_DWH;
				
				row3_HashRow.DATE_MODIFICATION_DWH = row3.DATE_MODIFICATION_DWH;
				
				row3_HashRow.EAN_PRINCIPALE = row3.EAN_PRINCIPALE;
				
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
			 			"tDBInput_3","Oracle_DW","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash","output")) {
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
	


public static class row11Struct implements routines.system.IPersistableComparableLookupRow<row11Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
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
	
						result = prime * result + ((this.ID_FOURNISSEUR_INT == null) ? 0 : new Double(this.ID_FOURNISSEUR_INT.doubleValue()).hashCode());
						
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
		
						if (this.ID_FOURNISSEUR_INT == null) {
							if (other.ID_FOURNISSEUR_INT != null)
								return false;
						
						} else if ((other.ID_FOURNISSEUR_INT == null) || (this.ID_FOURNISSEUR_INT.compareTo(other.ID_FOURNISSEUR_INT)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row11Struct other) {

		other.PK_FOURNISSEUR = this.PK_FOURNISSEUR;
	            other.ID_FOURNISSEUR_INT = this.ID_FOURNISSEUR_INT;
	            other.ID_FOURNISSEUR = this.ID_FOURNISSEUR;
	            other.LIBELLE = this.LIBELLE;
	            other.ETAT = this.ETAT;
	            other.TYPE = this.TYPE;
	            
	}

	public void copyKeysDataTo(row11Struct other) {

		other.ID_FOURNISSEUR_INT = this.ID_FOURNISSEUR_INT;
	            	
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
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
					
       			    	this.ID_FOURNISSEUR = (BigDecimal) ois.readObject();
					
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
					
       			    	this.ID_FOURNISSEUR = (BigDecimal) objectIn.readObject();
					
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
					
       			    	oos.writeObject(this.ID_FOURNISSEUR);
					
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
					
       			    	objectOut.writeObject(this.ID_FOURNISSEUR);
					
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
    public int compareTo(row11Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ID_FOURNISSEUR_INT, other.ID_FOURNISSEUR_INT);
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
			   		// source node:tDBInput_5 - inputs:(after_tDBInput_1) outputs:(row11,row11) | target node:tAdvancedHash_row11 - inputs:(row11) outputs:()
			   		// linked node: tMap_2 - inputs:(row6,row11) outputs:(out3)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row11 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.ALL_MATCHES;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row11Struct> tHash_Lookup_row11 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row11Struct>getLookup(matchingModeEnum_row11);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row11", tHash_Lookup_row11);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row11 begin ] stop
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
                            log4jParamters_tDBInput_5.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:NfSchuRfHchfcTx8vqSaFUkD1IXmu594YKb7cKNvLwQymE4=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_5.append(" | ");
                            log4jParamters_tDBInput_5.append("QUERY" + " = " + "\"select *from DWH_FOURNISSEUR\"");
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
                            log4jParamters_tDBInput_5.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PK_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIBELLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TYPE")+"}]");
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
				talendJobLog.addCM("tDBInput_5", "Fournisseur", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				String driverClass_tDBInput_5 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_5);
				
			String url_tDBInput_5 = null;
				url_tDBInput_5 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_5 = "dw";

				

				 
	final String decryptedPassword_tDBInput_5 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:qBad8sU9px8oesnqcOJO2e3oHcZETX1qUrDkiPmWINjoiWc=");

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

		    String dbquery_tDBInput_5 = "select *from DWH_FOURNISSEUR";
		    
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
								row11.PK_FOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(1) != null) {
						row11.PK_FOURNISSEUR = rs_tDBInput_5.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row11.ID_FOURNISSEUR_INT = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(2) != null) {
						row11.ID_FOURNISSEUR_INT = rs_tDBInput_5.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row11.ID_FOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_5.getObject(3) != null) {
						row11.ID_FOURNISSEUR = rs_tDBInput_5.getBigDecimal(3);
					} else {
				
						row11.ID_FOURNISSEUR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row11.LIBELLE = null;
							} else {
	                         		
        	row11.LIBELLE = routines.system.JDBCUtil.getString(rs_tDBInput_5, 4, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row11.ETAT = null;
							} else {
	                         		
        	row11.ETAT = routines.system.JDBCUtil.getString(rs_tDBInput_5, 5, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 6) {
								row11.TYPE = null;
							} else {
	                         		
        	row11.TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_5, 6, false);
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
	 * [tAdvancedHash_row11 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row11","tDBInput_5","Fournisseur","tOracleInput","tAdvancedHash_row11","tAdvancedHash_row11","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row11 - " + (row11==null? "": row11.toLogString()));
    			}
    		


			   
			   

					row11Struct row11_HashRow = new row11Struct();
		   	   	   
				
				row11_HashRow.PK_FOURNISSEUR = row11.PK_FOURNISSEUR;
				
				row11_HashRow.ID_FOURNISSEUR_INT = row11.ID_FOURNISSEUR_INT;
				
				row11_HashRow.ID_FOURNISSEUR = row11.ID_FOURNISSEUR;
				
				row11_HashRow.LIBELLE = row11.LIBELLE;
				
				row11_HashRow.ETAT = row11.ETAT;
				
				row11_HashRow.TYPE = row11.TYPE;
				
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
	 * [tAdvancedHash_row11 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row11";

	

tHash_Lookup_row11.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row11",2,0,
			 			"tDBInput_5","Fournisseur","tOracleInput","tAdvancedHash_row11","tAdvancedHash_row11","tAdvancedHash","output")) {
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
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class row10Struct implements routines.system.IPersistableComparableLookupRow<row10Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH__ARTICLE = new byte[0];
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
		final row10Struct other = (row10Struct) obj;
		
						if (this.ID_FOURNISSEUR == null) {
							if (other.ID_FOURNISSEUR != null)
								return false;
						
						} else if ((other.ID_FOURNISSEUR == null) || (this.ID_FOURNISSEUR.compareTo(other.ID_FOURNISSEUR)!=0))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row10Struct other) {

		other.PK_FOURNISSEUR = this.PK_FOURNISSEUR;
	            other.ID_FOURNISSEUR_INT = this.ID_FOURNISSEUR_INT;
	            other.ID_FOURNISSEUR = this.ID_FOURNISSEUR;
	            other.LIBELLE = this.LIBELLE;
	            other.ETAT = this.ETAT;
	            other.TYPE = this.TYPE;
	            
	}

	public void copyKeysDataTo(row10Struct other) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH__ARTICLE) {

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
    public int compareTo(row10Struct other) {

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
			   		// source node:tDBInput_4 - inputs:(after_tDBInput_1) outputs:(row10,row10) | target node:tAdvancedHash_row10 - inputs:(row10) outputs:()
			   		// linked node: tMap_4 - inputs:(row8,row10) outputs:(copyOfout3)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row10 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row10Struct> tHash_Lookup_row10 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row10Struct>getLookup(matchingModeEnum_row10);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row10", tHash_Lookup_row10);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row10 begin ] stop
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
                            log4jParamters_tDBInput_4.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:r0BecpKiIL2dxbsIS9q+c6LwY2OJpkLKRARonQ5yFvRL5ss=").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_4.append(" | ");
                            log4jParamters_tDBInput_4.append("QUERY" + " = " + "\"select *from DWH_FOURNISSEUR\"");
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
                            log4jParamters_tDBInput_4.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PK_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIBELLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TYPE")+"}]");
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
				talendJobLog.addCM("tDBInput_4", "Fournisseur", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				String driverClass_tDBInput_4 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_4);
				
			String url_tDBInput_4 = null;
				url_tDBInput_4 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_4 = "dw";

				

				 
	final String decryptedPassword_tDBInput_4 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:S57I91gc1smKgILSVWeZK/mwFlI/B4nnxPldmN2k6D/wWbE=");

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

		    String dbquery_tDBInput_4 = "select *from DWH_FOURNISSEUR";
		    
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
								row10.PK_FOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(1) != null) {
						row10.PK_FOURNISSEUR = rs_tDBInput_4.getBigDecimal(1);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row10.ID_FOURNISSEUR_INT = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(2) != null) {
						row10.ID_FOURNISSEUR_INT = rs_tDBInput_4.getBigDecimal(2);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row10.ID_FOURNISSEUR = null;
							} else {
		                          
					if(rs_tDBInput_4.getObject(3) != null) {
						row10.ID_FOURNISSEUR = rs_tDBInput_4.getBigDecimal(3);
					} else {
				
						row10.ID_FOURNISSEUR = null;
					}
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row10.LIBELLE = null;
							} else {
	                         		
        	row10.LIBELLE = routines.system.JDBCUtil.getString(rs_tDBInput_4, 4, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row10.ETAT = null;
							} else {
	                         		
        	row10.ETAT = routines.system.JDBCUtil.getString(rs_tDBInput_4, 5, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 6) {
								row10.TYPE = null;
							} else {
	                         		
        	row10.TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_4, 6, false);
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
	 * [tAdvancedHash_row10 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row10","tDBInput_4","Fournisseur","tOracleInput","tAdvancedHash_row10","tAdvancedHash_row10","tAdvancedHash"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row10 - " + (row10==null? "": row10.toLogString()));
    			}
    		


			   
			   

					row10Struct row10_HashRow = new row10Struct();
		   	   	   
				
				row10_HashRow.PK_FOURNISSEUR = row10.PK_FOURNISSEUR;
				
				row10_HashRow.ID_FOURNISSEUR_INT = row10.ID_FOURNISSEUR_INT;
				
				row10_HashRow.ID_FOURNISSEUR = row10.ID_FOURNISSEUR;
				
				row10_HashRow.LIBELLE = row10.LIBELLE;
				
				row10_HashRow.ETAT = row10.ETAT;
				
				row10_HashRow.TYPE = row10.TYPE;
				
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
	 * [tAdvancedHash_row10 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row10";

	

tHash_Lookup_row10.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row10",2,0,
			 			"tDBInput_4","Fournisseur","tOracleInput","tAdvancedHash_row10","tAdvancedHash_row10","tAdvancedHash","output")) {
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
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
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
        final DWH__ARTICLE DWH__ARTICLEClass = new DWH__ARTICLE();

        int exitCode = DWH__ARTICLEClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'DWH__ARTICLE' - Done.");
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
        	log.info("TalendJob: 'DWH__ARTICLE' - Start.");
    	
    	
    	
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
            java.io.InputStream inContext = DWH__ARTICLE.class.getClassLoader().getResourceAsStream("bi_team_projects/dwh__article_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = DWH__ARTICLE.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : DWH__ARTICLE");
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
 *     669506 characters generated by Talend Cloud Data Management Platform 
 *     on the 22 juillet 2022 à 15:57:39 WEST
 ************************************************************************************************/