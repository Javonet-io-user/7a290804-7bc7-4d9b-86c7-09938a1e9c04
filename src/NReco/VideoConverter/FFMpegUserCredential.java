package NReco.VideoConverter;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import NReco.VideoConverter.*;
import jio.System.Security.*;

public class FFMpegUserCredential {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserName() {
    try {
      java.lang.String res = javonetHandle.get("UserName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SecureString getPassword() {
    try {
      Object res = javonetHandle.<NObject>get("Password");
      if (res == null) return null;
      return new SecureString((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDomain() {
    try {
      java.lang.String res = javonetHandle.get("Domain");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public FFMpegUserCredential(java.lang.String userName, SecureString password) {
    try {
      javonetHandle = Javonet.New("NReco.VideoConverter.FFMpegUserCredential", userName, password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FFMpegUserCredential(
      java.lang.String userName, SecureString password, java.lang.String domain) {
    try {
      javonetHandle =
          Javonet.New("NReco.VideoConverter.FFMpegUserCredential", userName, password, domain);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FFMpegUserCredential(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
