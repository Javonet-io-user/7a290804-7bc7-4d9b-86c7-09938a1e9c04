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

public class FFMpegInput {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setInput(java.lang.String value) {
    try {
      javonetHandle.set("Input", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInput() {
    try {
      java.lang.String res = javonetHandle.get("Input");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFormat(java.lang.String value) {
    try {
      javonetHandle.set("Format", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFormat() {
    try {
      java.lang.String res = javonetHandle.get("Format");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCustomInputArgs(java.lang.String value) {
    try {
      javonetHandle.set("CustomInputArgs", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCustomInputArgs() {
    try {
      java.lang.String res = javonetHandle.get("CustomInputArgs");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public FFMpegInput(java.lang.String input) {
    try {
      javonetHandle = Javonet.New("NReco.VideoConverter.FFMpegInput", input);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FFMpegInput(java.lang.String input, java.lang.String format) {
    try {
      javonetHandle = Javonet.New("NReco.VideoConverter.FFMpegInput", input, format);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FFMpegInput(NObject handle) {
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
