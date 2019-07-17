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

public class FrameSize {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getqvga320x200() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("qvga320x200");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setqvga320x200(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("qvga320x200", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getvga640x480() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("vga640x480");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setvga640x480(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("vga640x480", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getsvga800x600() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("svga800x600");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setsvga800x600(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("svga800x600", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getxga1024x768() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("xga1024x768");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setxga1024x768(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("xga1024x768", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getsxga1280x1024() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("sxga1280x1024");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setsxga1280x1024(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("sxga1280x1024", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getwxga1366x768() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("wxga1366x768");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setwxga1366x768(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("wxga1366x768", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getwsxga1600x1024() {
    try {
      java.lang.String res =
          Javonet.getType("NReco.VideoConverter.FrameSize").get("wsxga1600x1024");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setwsxga1600x1024(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("wsxga1600x1024", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getuxga1600x1200() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("uxga1600x1200");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setuxga1600x1200(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("uxga1600x1200", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String gethd480() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("hd480");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void sethd480(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("hd480", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String gethd720() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("hd720");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void sethd720(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("hd720", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String gethd1080() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.FrameSize").get("hd1080");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void sethd1080(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.FrameSize").set("hd1080", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FrameSize() {
    try {
      javonetHandle = Javonet.New("NReco.VideoConverter.FrameSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FrameSize(NObject handle) {
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
