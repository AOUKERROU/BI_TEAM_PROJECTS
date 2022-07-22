
package bi_team_projects.dwh___fournisseur_0_1;

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
 * Job: DWH___FOURNISSEUR Purpose: <br>
 * Description:  <br>
 * @author oukerrou, Ayoub
 * @version 8.0.1.20220317_0634-patch
 * @status 
 */
public class DWH___FOURNISSEUR implements TalendJob {
	static {System.setProperty("TalendJob.log", "DWH___FOURNISSEUR.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(DWH___FOURNISSEUR.class);
	

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
	private final String jobName = "DWH___FOURNISSEUR";
	private final String projectName = "BI_TEAM_PROJECTS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_klRxYAf9Eeu-aZJbmylHcw", "0.1");
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
				DWH___FOURNISSEUR.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(DWH___FOURNISSEUR.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tReplicate_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFlowToIterate_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tFlowMeter_13_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			public void tDBRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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

public static class out4Struct implements routines.system.IPersistableRow<out4Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
		sb.append(",BOOL="+String.valueOf(BOOL));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
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

public static class out3Struct implements routines.system.IPersistableRow<out3Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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

public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
		sb.append(",BOOL="+String.valueOf(BOOL));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
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

public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
		sb.append(",BOOL="+String.valueOf(BOOL));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
		sb.append(",BOOL="+String.valueOf(BOOL));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				
			    public Integer BOOL;

				public Integer getBOOL () {
					return this.BOOL;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
						this.BOOL = readInteger(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
					// Integer
				
						writeInteger(this.BOOL,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
		sb.append(",BOOL="+String.valueOf(BOOL));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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
        		
        				if(BOOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOOL);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
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
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISSEUR_INT = (BigDecimal) dis.readObject();
					
						this.ID_FOURNISSEUR = (BigDecimal) dis.readObject();
					
					this.LIBELLE = readString(dis);
					
					this.ETAT = readString(dis);
					
					this.TYPE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR_INT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISSEUR);
					
					// String
				
						writeString(this.LIBELLE,dos);
					
					// String
				
						writeString(this.ETAT,dos);
					
					// String
				
						writeString(this.TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISSEUR_INT="+String.valueOf(ID_FOURNISSEUR_INT));
		sb.append(",ID_FOURNISSEUR="+String.valueOf(ID_FOURNISSEUR));
		sb.append(",LIBELLE="+LIBELLE);
		sb.append(",ETAT="+ETAT);
		sb.append(",TYPE="+TYPE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
			    public BigDecimal ID_FOURNISEUR_INT;

				public BigDecimal getID_FOURNISEUR_INT () {
					return this.ID_FOURNISEUR_INT;
				}
				
			    public String ID_FOURNISEUR;

				public String getID_FOURNISEUR () {
					return this.ID_FOURNISEUR;
				}
				
			    public String CNUF;

				public String getCNUF () {
					return this.CNUF;
				}
				
			    public String LIB_FOURNISSEUR;

				public String getLIB_FOURNISSEUR () {
					return this.LIB_FOURNISSEUR;
				}
				
			    public BigDecimal FOURNISSEUR_ETAT;

				public BigDecimal getFOURNISSEUR_ETAT () {
					return this.FOURNISSEUR_ETAT;
				}
				
			    public String FOURNISSEUR_TYPE;

				public String getFOURNISSEUR_TYPE () {
					return this.FOURNISSEUR_TYPE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISEUR_INT = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISEUR = readString(dis);
					
					this.CNUF = readString(dis);
					
					this.LIB_FOURNISSEUR = readString(dis);
					
						this.FOURNISSEUR_ETAT = (BigDecimal) dis.readObject();
					
					this.FOURNISSEUR_TYPE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISEUR_INT = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISEUR = readString(dis);
					
					this.CNUF = readString(dis);
					
					this.LIB_FOURNISSEUR = readString(dis);
					
						this.FOURNISSEUR_ETAT = (BigDecimal) dis.readObject();
					
					this.FOURNISSEUR_TYPE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISEUR_INT);
					
					// String
				
						writeString(this.ID_FOURNISEUR,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// String
				
						writeString(this.LIB_FOURNISSEUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FOURNISSEUR_ETAT);
					
					// String
				
						writeString(this.FOURNISSEUR_TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISEUR_INT);
					
					// String
				
						writeString(this.ID_FOURNISEUR,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// String
				
						writeString(this.LIB_FOURNISSEUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FOURNISSEUR_ETAT);
					
					// String
				
						writeString(this.FOURNISSEUR_TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISEUR_INT="+String.valueOf(ID_FOURNISEUR_INT));
		sb.append(",ID_FOURNISEUR="+ID_FOURNISEUR);
		sb.append(",CNUF="+CNUF);
		sb.append(",LIB_FOURNISSEUR="+LIB_FOURNISSEUR);
		sb.append(",FOURNISSEUR_ETAT="+String.valueOf(FOURNISSEUR_ETAT));
		sb.append(",FOURNISSEUR_TYPE="+FOURNISSEUR_TYPE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_FOURNISEUR_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISEUR_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISEUR);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(FOURNISSEUR_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOURNISSEUR_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(FOURNISSEUR_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOURNISSEUR_TYPE);
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];

	
			    public BigDecimal ID_FOURNISEUR_INT;

				public BigDecimal getID_FOURNISEUR_INT () {
					return this.ID_FOURNISEUR_INT;
				}
				
			    public String ID_FOURNISEUR;

				public String getID_FOURNISEUR () {
					return this.ID_FOURNISEUR;
				}
				
			    public String CNUF;

				public String getCNUF () {
					return this.CNUF;
				}
				
			    public String LIB_FOURNISSEUR;

				public String getLIB_FOURNISSEUR () {
					return this.LIB_FOURNISSEUR;
				}
				
			    public BigDecimal FOURNISSEUR_ETAT;

				public BigDecimal getFOURNISSEUR_ETAT () {
					return this.FOURNISSEUR_ETAT;
				}
				
			    public String FOURNISSEUR_TYPE;

				public String getFOURNISSEUR_TYPE () {
					return this.FOURNISSEUR_TYPE;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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
			if(length > commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length) {
				if(length < 1024 && commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR.length == 0) {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[1024];
				} else {
   					commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length);
			strReturn = new String(commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISEUR_INT = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISEUR = readString(dis);
					
					this.CNUF = readString(dis);
					
					this.LIB_FOURNISSEUR = readString(dis);
					
						this.FOURNISSEUR_ETAT = (BigDecimal) dis.readObject();
					
					this.FOURNISSEUR_TYPE = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

        	try {

        		int length = 0;
		
						this.ID_FOURNISEUR_INT = (BigDecimal) dis.readObject();
					
					this.ID_FOURNISEUR = readString(dis);
					
					this.CNUF = readString(dis);
					
					this.LIB_FOURNISSEUR = readString(dis);
					
						this.FOURNISSEUR_ETAT = (BigDecimal) dis.readObject();
					
					this.FOURNISSEUR_TYPE = readString(dis);
					
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
				
       			    	dos.writeObject(this.ID_FOURNISEUR_INT);
					
					// String
				
						writeString(this.ID_FOURNISEUR,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// String
				
						writeString(this.LIB_FOURNISSEUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FOURNISSEUR_ETAT);
					
					// String
				
						writeString(this.FOURNISSEUR_TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ID_FOURNISEUR_INT);
					
					// String
				
						writeString(this.ID_FOURNISEUR,dos);
					
					// String
				
						writeString(this.CNUF,dos);
					
					// String
				
						writeString(this.LIB_FOURNISSEUR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FOURNISSEUR_ETAT);
					
					// String
				
						writeString(this.FOURNISSEUR_TYPE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ID_FOURNISEUR_INT="+String.valueOf(ID_FOURNISEUR_INT));
		sb.append(",ID_FOURNISEUR="+ID_FOURNISEUR);
		sb.append(",CNUF="+CNUF);
		sb.append(",LIB_FOURNISSEUR="+LIB_FOURNISSEUR);
		sb.append(",FOURNISSEUR_ETAT="+String.valueOf(FOURNISSEUR_ETAT));
		sb.append(",FOURNISSEUR_TYPE="+FOURNISSEUR_TYPE);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ID_FOURNISEUR_INT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISEUR_INT);
            			}
            		
        			sb.append("|");
        		
        				if(ID_FOURNISEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ID_FOURNISEUR);
            			}
            		
        			sb.append("|");
        		
        				if(CNUF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CNUF);
            			}
            		
        			sb.append("|");
        		
        				if(LIB_FOURNISSEUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIB_FOURNISSEUR);
            			}
            		
        			sb.append("|");
        		
        				if(FOURNISSEUR_ETAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOURNISSEUR_ETAT);
            			}
            		
        			sb.append("|");
        		
        				if(FOURNISSEUR_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOURNISSEUR_TYPE);
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

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
out2Struct out2 = new out2Struct();
row5Struct row5 = new row5Struct();
row7Struct row7 = new row7Struct();
out3Struct out3 = new out3Struct();
row4Struct row4 = new row4Struct();
row6Struct row6 = new row6Struct();
out4Struct out4 = new out4Struct();
row9Struct row9 = new row9Struct();









	
	/**
	 * [tFlowToIterate_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFlowToIterate_1", false);
		start_Hash.put("tFlowToIterate_1", System.currentTimeMillis());
		
	
	currentComponent="tFlowToIterate_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"out3");
			
		int tos_count_tFlowToIterate_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFlowToIterate_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFlowToIterate_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFlowToIterate_1 = new StringBuilder();
                    log4jParamters_tFlowToIterate_1.append("Parameters:");
                            log4jParamters_tFlowToIterate_1.append("DEFAULT_MAP" + " = " + "true");
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
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row7");
			
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
		int count_row7_tMap_3 = 0;
		
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
	 * [tFilterRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_1", false);
		start_Hash.put("tFilterRow_1", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
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
				talendJobLog.addCM("tFilterRow_1", "UPDATE", "tFilterRow");
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
	 * [tFlowMeter_13 begin ] start
	 */

	

	
		
		ok_Hash.put("tFlowMeter_13", false);
		start_Hash.put("tFlowMeter_13", System.currentTimeMillis());
		
	
	currentComponent="tFlowMeter_13";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
		int tos_count_tFlowMeter_13 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_13 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFlowMeter_13{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFlowMeter_13 = new StringBuilder();
                    log4jParamters_tFlowMeter_13.append("Parameters:");
                            log4jParamters_tFlowMeter_13.append("USEROWLABEL" + " = " + "true");
                        log4jParamters_tFlowMeter_13.append(" | ");
                            log4jParamters_tFlowMeter_13.append("ABSOLUTE" + " = " + "Absolute");
                        log4jParamters_tFlowMeter_13.append(" | ");
                            log4jParamters_tFlowMeter_13.append("THRESHLODS" + " = " + "[]");
                        log4jParamters_tFlowMeter_13.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_13 - "  + (log4jParamters_tFlowMeter_13) );
                    } 
                } 
            new BytesLimit65535_tFlowMeter_13().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFlowMeter_13", "tFlowMeter_13", "tFlowMeter");
				talendJobLogProcess(globalMap);
			}
			

    int count_tFlowMeter_13 = 0; 
 



/**
 * [tFlowMeter_13 begin ] stop
 */



	
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
                            log4jParamters_tDBOutput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:nRYKwokXXkyHaba7UQQTVIxF4vrDuWbKrxk246VfOFIw43Q=").substring(0, 4) + "...");     
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"DWH_FOURNISSEUR\"");
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
				talendJobLog.addCM("tDBOutput_1", "Oracle_DW", "tOracleOutput");
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
 
	final String decryptedPassword_tDBOutput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:j60jNvHi4tzCw25Ni85o6Tyhutg2AHERqRbxHouFpJ1JSCc=");

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
            tableName_tDBOutput_1 = ("DWH_FOURNISSEUR");
        } else {
            tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "." + ("DWH_FOURNISSEUR");
        }
                String insert_tDBOutput_1 = "INSERT INTO " + tableName_tDBOutput_1 + " (ID_FOURNISSEUR_INT,ID_FOURNISSEUR,LIBELLE,ETAT,TYPE) VALUES (?,?,?,?,?)";    

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

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row6");
			
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
		int count_row6_tMap_4 = 0;
		
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
	 * [tFilterRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterRow_2", false);
		start_Hash.put("tFilterRow_2", System.currentTimeMillis());
		
	
	currentComponent="tFilterRow_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row4");
			
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
				talendJobLog.addCM("tFilterRow_2", "INSERT", "tFilterRow");
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
                            log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:wVRrmY4DLzkoOygAw/p/KIViEt6FzIO7Uu6XJVIk9/m0k+4n").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select *from ODS_FOUDGENE\"");
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
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISEUR_INT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ID_FOURNISEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CNUF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIB_FOURNISSEUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FOURNISSEUR_ETAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FOURNISSEUR_TYPE")+"}]");
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
				talendJobLog.addCM("tDBInput_1", "Oracle_ODS", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_1);
				
			String url_tDBInput_1 = null;
				url_tDBInput_1 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_1 = "ods";

				

				 
	final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:UpEqVSVaql7Q3MdYq5VWqTJDkpafmwIbvpEMiesmkb5fQkQE");

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

		    String dbquery_tDBInput_1 = "select *from ODS_FOUDGENE";
		    
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
								row1.ID_FOURNISEUR_INT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(1) != null) {
						row1.ID_FOURNISEUR_INT = rs_tDBInput_1.getBigDecimal(1);
					} else {
				
						row1.ID_FOURNISEUR_INT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.ID_FOURNISEUR = null;
							} else {
	                         		
        	row1.ID_FOURNISEUR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.CNUF = null;
							} else {
	                         		
        	row1.CNUF = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.LIB_FOURNISSEUR = null;
							} else {
	                         		
        	row1.LIB_FOURNISSEUR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.FOURNISSEUR_ETAT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(5) != null) {
						row1.FOURNISSEUR_ETAT = rs_tDBInput_1.getBigDecimal(5);
					} else {
				
						row1.FOURNISSEUR_ETAT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.FOURNISSEUR_TYPE = null;
							} else {
	                         		
        	row1.FOURNISSEUR_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
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
				
					,"row1","tDBInput_1","Oracle_ODS","tOracleInput","tMap_1","tMap_1","tMap"
				
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

out1_tmp.ID_FOURNISSEUR_INT = row1.ID_FOURNISEUR_INT ;
out1_tmp.ID_FOURNISSEUR = new BigDecimal(row1.CNUF);
out1_tmp.LIBELLE = row1.LIB_FOURNISSEUR ;
out1_tmp.ETAT = Integer.parseInt(row1.FOURNISSEUR_ETAT.toString())==1?"Actif": Integer.parseInt(row1.FOURNISSEUR_ETAT.toString())==2?"Gele":Integer.parseInt(row1.FOURNISSEUR_ETAT.toString())==3?"Supprime":"-1" ;
out1_tmp.TYPE = row1.FOURNISSEUR_TYPE ;
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
								
                        		    		    row3HashKey.ID_FOURNISSEUR = out1.ID_FOURNISSEUR;
                        		    		

								
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

out2_tmp.ID_FOURNISSEUR_INT = out1.ID_FOURNISSEUR_INT ;
out2_tmp.ID_FOURNISSEUR = out1.ID_FOURNISSEUR ;
out2_tmp.LIBELLE = out1.LIBELLE ;
out2_tmp.ETAT = out1.ETAT ;
out2_tmp.TYPE = out1.TYPE ;
out2_tmp.BOOL = out1.ID_FOURNISSEUR.equals(row3.ID_FOURNISSEUR)==true && out1.ID_FOURNISSEUR_INT.equals(row3.ID_FOURNISSEUR_INT)==true ?1:0 ;
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
	 * [tReplicate_1 main ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out2","tMap_2","tMap_2","tMap","tReplicate_1","tReplicate_1","tReplicate"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out2 - " + (out2==null? "": out2.toLogString()));
    			}
    		


	row5 = new row5Struct();
						
	row5.ID_FOURNISSEUR_INT = out2.ID_FOURNISSEUR_INT;								
	row5.ID_FOURNISSEUR = out2.ID_FOURNISSEUR;								
	row5.LIBELLE = out2.LIBELLE;								
	row5.ETAT = out2.ETAT;								
	row5.TYPE = out2.TYPE;								
	row5.BOOL = out2.BOOL;			
	row4 = new row4Struct();
						
	row4.ID_FOURNISSEUR_INT = out2.ID_FOURNISSEUR_INT;								
	row4.ID_FOURNISSEUR = out2.ID_FOURNISSEUR;								
	row4.LIBELLE = out2.LIBELLE;								
	row4.ETAT = out2.ETAT;								
	row4.TYPE = out2.TYPE;								
	row4.BOOL = out2.BOOL;			


 


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
	 * [tFilterRow_1 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tReplicate_1","tReplicate_1","tReplicate","tFilterRow_1","UPDATE","tFilterRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		

          row7 = null;
    Operator_tFilterRow_1 ope_tFilterRow_1 = new Operator_tFilterRow_1("&&");
            ope_tFilterRow_1.matches((row5.BOOL == null? false : row5.BOOL.compareTo(ParserUtils.parseTo_Integer(String.valueOf(1))) == 0)
                           , "BOOL.compareTo(1) == 0 failed");
		 	
    
    if (ope_tFilterRow_1.getMatchFlag()) {
              if(row7 == null){ 
                row7 = new row7Struct();
              }
               row7.ID_FOURNISSEUR_INT = row5.ID_FOURNISSEUR_INT;
               row7.ID_FOURNISSEUR = row5.ID_FOURNISSEUR;
               row7.LIBELLE = row5.LIBELLE;
               row7.ETAT = row5.ETAT;
               row7.TYPE = row5.TYPE;
               row7.BOOL = row5.BOOL;
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
// Start of branch "row7"
if(row7 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row7","tFilterRow_1","UPDATE","tFilterRow","tMap_3","tMap_3","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row7 - " + (row7==null? "": row7.toLogString()));
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

out3_tmp.ID_FOURNISSEUR_INT = row7.ID_FOURNISSEUR_INT ;
out3_tmp.ID_FOURNISSEUR = row7.ID_FOURNISSEUR ;
out3_tmp.LIBELLE = row7.LIBELLE ;
out3_tmp.ETAT = row7.ETAT ;
out3_tmp.TYPE = row7.TYPE ;
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
	 * [tFlowToIterate_1 main ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out3","tMap_3","tMap_3","tMap","tFlowToIterate_1","tFlowToIterate_1","tFlowToIterate"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out3 - " + (out3==null? "": out3.toLogString()));
    			}
    		


    	
                if(log.isTraceEnabled())
            log.trace("tFlowToIterate_1 - "  + ("Set global var, key=out3.ID_FOURNISSEUR_INT, value=")  + (out3.ID_FOURNISSEUR_INT)  + (".") );            
            globalMap.put("out3.ID_FOURNISSEUR_INT", out3.ID_FOURNISSEUR_INT);
    	
                if(log.isTraceEnabled())
            log.trace("tFlowToIterate_1 - "  + ("Set global var, key=out3.ID_FOURNISSEUR, value=")  + (out3.ID_FOURNISSEUR)  + (".") );            
            globalMap.put("out3.ID_FOURNISSEUR", out3.ID_FOURNISSEUR);
    	
                if(log.isTraceEnabled())
            log.trace("tFlowToIterate_1 - "  + ("Set global var, key=out3.LIBELLE, value=")  + (out3.LIBELLE)  + (".") );            
            globalMap.put("out3.LIBELLE", out3.LIBELLE);
    	
                if(log.isTraceEnabled())
            log.trace("tFlowToIterate_1 - "  + ("Set global var, key=out3.ETAT, value=")  + (out3.ETAT)  + (".") );            
            globalMap.put("out3.ETAT", out3.ETAT);
    	
                if(log.isTraceEnabled())
            log.trace("tFlowToIterate_1 - "  + ("Set global var, key=out3.TYPE, value=")  + (out3.TYPE)  + (".") );            
            globalMap.put("out3.TYPE", out3.TYPE);
    	
 
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
	
	/**
	 * [tFlowToIterate_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 process_data_end ] stop
 */

} // End of branch "out3"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "row7"




	
	/**
	 * [tFilterRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 process_data_end ] stop
 */




	
	/**
	 * [tFilterRow_2 main ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row4","tReplicate_1","tReplicate_1","tReplicate","tFilterRow_2","INSERT","tFilterRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		

          row6 = null;
    Operator_tFilterRow_2 ope_tFilterRow_2 = new Operator_tFilterRow_2("&&");
            ope_tFilterRow_2.matches((row4.BOOL == null? false : row4.BOOL.compareTo(ParserUtils.parseTo_Integer(String.valueOf(0))) == 0)
                           , "BOOL.compareTo(0) == 0 failed");
		 	
    
    if (ope_tFilterRow_2.getMatchFlag()) {
              if(row6 == null){ 
                row6 = new row6Struct();
              }
               row6.ID_FOURNISSEUR_INT = row4.ID_FOURNISSEUR_INT;
               row6.ID_FOURNISSEUR = row4.ID_FOURNISSEUR;
               row6.LIBELLE = row4.LIBELLE;
               row6.ETAT = row4.ETAT;
               row6.TYPE = row4.TYPE;
               row6.BOOL = row4.BOOL;
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
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row6","tFilterRow_2","INSERT","tFilterRow","tMap_4","tMap_4","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row6 - " + (row6==null? "": row6.toLogString()));
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

out4_tmp.ID_FOURNISSEUR_INT = row6.ID_FOURNISSEUR_INT ;
out4_tmp.ID_FOURNISSEUR = row6.ID_FOURNISSEUR ;
out4_tmp.LIBELLE = row6.LIBELLE ;
out4_tmp.ETAT = row6.ETAT ;
out4_tmp.TYPE = row6.TYPE ;
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
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"out4","tMap_4","tMap_4","tMap","tDBOutput_1","Oracle_DW","tOracleOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("out4 - " + (out4==null? "": out4.toLogString()));
    			}
    		



            row9 = null;
        whetherReject_tDBOutput_1 = false;
                        pstmt_tDBOutput_1.setBigDecimal(1, out4.ID_FOURNISSEUR_INT);

                        pstmt_tDBOutput_1.setBigDecimal(2, out4.ID_FOURNISSEUR);

                        if(out4.LIBELLE == null) {
pstmt_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(3, out4.LIBELLE);
}

                        if(out4.ETAT == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(4, out4.ETAT);
}

                        if(out4.TYPE == null) {
pstmt_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(5, out4.TYPE);
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
                                row9.ID_FOURNISSEUR_INT = out4.ID_FOURNISSEUR_INT;
                                row9.ID_FOURNISSEUR = out4.ID_FOURNISSEUR;
                                row9.LIBELLE = out4.LIBELLE;
                                row9.ETAT = out4.ETAT;
                                row9.TYPE = out4.TYPE;
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
	 * [tFlowMeter_13 main ] start
	 */

	

	
	
	currentComponent="tFlowMeter_13";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row9","tDBOutput_1","Oracle_DW","tOracleOutput","tFlowMeter_13","tFlowMeter_13","tFlowMeter"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		

    count_tFlowMeter_13++; 
 


	tos_count_tFlowMeter_13++;

/**
 * [tFlowMeter_13 main ] stop
 */
	
	/**
	 * [tFlowMeter_13 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFlowMeter_13";

	

 



/**
 * [tFlowMeter_13 process_data_begin ] stop
 */
	
	/**
	 * [tFlowMeter_13 process_data_end ] start
	 */

	

	
	
	currentComponent="tFlowMeter_13";

	

 



/**
 * [tFlowMeter_13 process_data_end ] stop
 */

} // End of branch "row9"




	
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

} // End of branch "row6"




	
	/**
	 * [tFilterRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	

 



/**
 * [tFilterRow_2 process_data_end ] stop
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
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'out1': " + count_out1_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_1","Oracle_ODS","tOracleInput","tMap_1","tMap_1","tMap","output")) {
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
	 * [tReplicate_1 end ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out2",2,0,
			 			"tMap_2","tMap_2","tMap","tReplicate_1","tReplicate_1","tReplicate","output")) {
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
	 * [tFilterRow_1 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	
    globalMap.put("tFilterRow_1_NB_LINE", nb_line_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_OK", nb_line_ok_tFilterRow_1);
    globalMap.put("tFilterRow_1_NB_LINE_REJECT", nb_line_reject_tFilterRow_1);
    
    	log.info("tFilterRow_1 - Processed records count:" + nb_line_tFilterRow_1 + ". Matched records count:" + nb_line_ok_tFilterRow_1 + ". Rejected records count:" + nb_line_reject_tFilterRow_1 + ".");

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tReplicate_1","tReplicate_1","tReplicate","tFilterRow_1","UPDATE","tFilterRow","output")) {
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
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'out3': " + count_out3_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row7",2,0,
			 			"tFilterRow_1","UPDATE","tFilterRow","tMap_3","tMap_3","tMap","output")) {
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
	 * [tFlowToIterate_1 end ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

globalMap.put("tFlowToIterate_1_NB_LINE",nb_line_tFlowToIterate_1);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"out3",2,0,
			 			"tMap_3","tMap_3","tMap","tFlowToIterate_1","tFlowToIterate_1","tFlowToIterate","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFlowToIterate_1 - "  + ("Done.") );

ok_Hash.put("tFlowToIterate_1", true);
end_Hash.put("tFlowToIterate_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBRow_1Process(globalMap);



/**
 * [tFlowToIterate_1 end ] stop
 */










	
	/**
	 * [tFilterRow_2 end ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	
    globalMap.put("tFilterRow_2_NB_LINE", nb_line_tFilterRow_2);
    globalMap.put("tFilterRow_2_NB_LINE_OK", nb_line_ok_tFilterRow_2);
    globalMap.put("tFilterRow_2_NB_LINE_REJECT", nb_line_reject_tFilterRow_2);
    
    	log.info("tFilterRow_2 - Processed records count:" + nb_line_tFilterRow_2 + ". Matched records count:" + nb_line_ok_tFilterRow_2 + ". Rejected records count:" + nb_line_reject_tFilterRow_2 + ".");

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row4",2,0,
			 			"tReplicate_1","tReplicate_1","tReplicate","tFilterRow_2","INSERT","tFilterRow","output")) {
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
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'out4': " + count_out4_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row6",2,0,
			 			"tFilterRow_2","INSERT","tFilterRow","tMap_4","tMap_4","tMap","output")) {
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
			 			"tMap_4","tMap_4","tMap","tDBOutput_1","Oracle_DW","tOracleOutput","output")) {
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
	 * [tFlowMeter_13 end ] start
	 */

	

	
	
	currentComponent="tFlowMeter_13";

	


			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
			 			"tDBOutput_1","Oracle_DW","tOracleOutput","tFlowMeter_13","tFlowMeter_13","tFlowMeter","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFlowMeter_13 - "  + ("Done.") );

ok_Hash.put("tFlowMeter_13", true);
end_Hash.put("tFlowMeter_13", System.currentTimeMillis());




/**
 * [tFlowMeter_13 end ] stop
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
				
					     			//free memory for "tMap_2"
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
	 * [tReplicate_1 finally ] start
	 */

	

	
	
	currentComponent="tReplicate_1";

	

 



/**
 * [tReplicate_1 finally ] stop
 */

	
	/**
	 * [tFilterRow_1 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_1";

	

 



/**
 * [tFilterRow_1 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tFlowToIterate_1 finally ] start
	 */

	

	
	
	currentComponent="tFlowToIterate_1";

	

 



/**
 * [tFlowToIterate_1 finally ] stop
 */










	
	/**
	 * [tFilterRow_2 finally ] start
	 */

	

	
	
	currentComponent="tFilterRow_2";

	

 



/**
 * [tFilterRow_2 finally ] stop
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

	
	/**
	 * [tFlowMeter_13 finally ] start
	 */

	

	
	
	currentComponent="tFlowMeter_13";

	

 



/**
 * [tFlowMeter_13 finally ] stop
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
                            log4jParamters_tDBRow_1.append("SCHEMA_DB" + " = " + "\"DW\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("USER" + " = " + "\"dw\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:+M1vMRIVpuofyFnDqh+i5MGX6mgSemYsQZanaGBeQ+5sqAY=").substring(0, 4) + "...");     
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBRow_1.append(" | ");
                            log4jParamters_tDBRow_1.append("QUERY" + " = " + "\"UPDATE  DWH_FOURNISSEUR  SET  ID_FOURNISSEUR_INT=\"+((BigDecimal)globalMap.get(\"row7.ID_FOURNISSEUR_INT\"))+\",  LIBELLE='\"+((String)globalMap.get(\"row7.LIBELLE\"))+\"',  ETAT='\"+((String)globalMap.get(\"row7.ETAT\"))+\"',  TYPE='\"+((String)globalMap.get(\"row7.TYPE\"))+\"'  where  ID_FOURNISSEUR=\"+((BigDecimal)globalMap.get(\"row7.ID_FOURNISSEUR\"))+\"\"");
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
				talendJobLog.addCM("tDBRow_1", "Oracle_DW", "tOracleRow");
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
			
					String dbUser_tDBRow_1 = "dw";
	        
            		
            		
            		 
	final String decryptedPassword_tDBRow_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Nt0QdBscHgzaEodRf1UbhBrmsJcl9A9xwyWBkTtet5kVFa8=");
        		   	
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

	

query_tDBRow_1 = "UPDATE  DWH_FOURNISSEUR\nSET\nID_FOURNISSEUR_INT="+((BigDecimal)globalMap.get("row7.ID_FOURNISSEUR_INT"))+",\nLIBELLE='"+((String)globalMap.get("row7.LIBELLE"))+"',\nETAT='"+((String)globalMap.get("row7.ETAT"))+"',\nTYPE='"+((String)globalMap.get("row7.TYPE"))+"'\nwhere\nID_FOURNISSEUR="+((BigDecimal)globalMap.get("row7.ID_FOURNISSEUR"))+"";
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
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"Probleme de la connexion a la base BI\"");
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
	System.err.println("Probleme de la connexion a la base BI");
	
		log.error("tDie_1 - The die message: "+"Probleme de la connexion a la base BI");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Probleme de la connexion a la base BI");
	globalMap.put("tDie_1_DIE_MESSAGES", "Probleme de la connexion a la base BI");
	
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
    final static byte[] commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
    static byte[] commonByteArray_BI_TEAM_PROJECTS_DWH___FOURNISSEUR = new byte[0];
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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

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

		synchronized(commonByteArrayLock_BI_TEAM_PROJECTS_DWH___FOURNISSEUR) {

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
                            log4jParamters_tDBInput_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:60VL6FjKltSed3KBJAC2wyx9nTsXskZpyfSLYcrW3n4yRjE=").substring(0, 4) + "...");     
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
				talendJobLog.addCM("tDBInput_2", "Oracle_DW", "tOracleInput");
				talendJobLogProcess(globalMap);
			}
			
	


	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "oracle.jdbc.OracleDriver";
				java.lang.Class.forName(driverClass_tDBInput_2);
				
			String url_tDBInput_2 = null;
				url_tDBInput_2 = "jdbc:oracle:thin:@" + "192.168.99.92" + ":" + "15211" + ":" + "BI";

				String dbUser_tDBInput_2 = "dw";

				

				 
	final String decryptedPassword_tDBInput_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:V7YLuAzlxf3ORBjrJYGZUO5tdcvM9fxPfQxRAjuUgi0AE7A=");

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
				
					,"row3","tDBInput_2","Oracle_DW","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash"
				
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
			 			"tDBInput_2","Oracle_DW","tOracleInput","tAdvancedHash_row3","tAdvancedHash_row3","tAdvancedHash","output")) {
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
        final DWH___FOURNISSEUR DWH___FOURNISSEURClass = new DWH___FOURNISSEUR();

        int exitCode = DWH___FOURNISSEURClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'DWH___FOURNISSEUR' - Done.");
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
        	log.info("TalendJob: 'DWH___FOURNISSEUR' - Start.");
    	
    	
    	
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
            java.io.InputStream inContext = DWH___FOURNISSEUR.class.getClassLoader().getResourceAsStream("bi_team_projects/dwh___fournisseur_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = DWH___FOURNISSEUR.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : DWH___FOURNISSEUR");
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
 *     261365 characters generated by Talend Cloud Data Management Platform 
 *     on the 22 juillet 2022 à 15:54:05 WEST
 ************************************************************************************************/