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
import jio.System.IO.*;
import jio.System.*;
import jio.System.Diagnostics.*;

public class FFMpegConverter {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setFFMpegToolPath(java.lang.String value) {
    try {
      javonetHandle.set("FFMpegToolPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFFMpegToolPath() {
    try {
      java.lang.String res = javonetHandle.get("FFMpegToolPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFFMpegExeName(java.lang.String value) {
    try {
      javonetHandle.set("FFMpegExeName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFFMpegExeName() {
    try {
      java.lang.String res = javonetHandle.get("FFMpegExeName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExecutionTimeout(Nullable<TimeSpan> value) {
    try {
      javonetHandle.set("ExecutionTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<TimeSpan> getExecutionTimeout() {
    try {
      Object res = javonetHandle.<NObject>get("ExecutionTimeout");
      if (res == null) return null;
      return new Nullable<TimeSpan>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFFMpegProcessPriority(ProcessPriorityClass value) {
    try {
      javonetHandle.set("FFMpegProcessPriority", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProcessPriorityClass getFFMpegProcessPriority() {
    try {
      Object res = javonetHandle.<NEnum>get("FFMpegProcessPriority");
      if (res == null) return null;
      return ProcessPriorityClass.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFFMpegProcessUser(FFMpegUserCredential value) {
    try {
      javonetHandle.set("FFMpegProcessUser", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FFMpegUserCredential getFFMpegProcessUser() {
    try {
      Object res = javonetHandle.<NObject>get("FFMpegProcessUser");
      if (res == null) return null;
      return new FFMpegUserCredential((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLogLevel(java.lang.String value) {
    try {
      javonetHandle.set("LogLevel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLogLevel() {
    try {
      java.lang.String res = javonetHandle.get("LogLevel");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public FFMpegConverter() {
    try {
      javonetHandle = Javonet.New("NReco.VideoConverter.FFMpegConverter");
      javonetHandle.addEventListener(
          "ConvertProgress",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<ConvertProgressEventArgs> handler :
                  _ConvertProgressListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ConvertProgressEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "LogReceived",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandlerTEventArgs<FFMpegLogEventArgs> handler : _LogReceivedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FFMpegLogEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FFMpegConverter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertMedia(
      java.lang.String inputFile, java.lang.String outputFile, java.lang.String outputFormat) {
    try {
      javonetHandle.invoke("ConvertMedia", inputFile, outputFile, outputFormat);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertMedia(
      java.lang.String inputFile,
      java.lang.String inputFormat,
      java.lang.String outputFile,
      java.lang.String outputFormat,
      ConvertSettings settings) {
    try {
      javonetHandle.invoke(
          "ConvertMedia", inputFile, inputFormat, outputFile, outputFormat, settings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertMedia(
      java.lang.String inputFile, Stream outputStream, java.lang.String outputFormat) {
    try {
      javonetHandle.invoke("ConvertMedia", inputFile, outputStream, outputFormat);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertMedia(
      java.lang.String inputFile,
      java.lang.String inputFormat,
      Stream outputStream,
      java.lang.String outputFormat,
      ConvertSettings settings) {
    try {
      javonetHandle.invoke(
          "ConvertMedia", inputFile, inputFormat, outputStream, outputFormat, settings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConvertMedia(
      FFMpegInput[] inputs,
      java.lang.String output,
      java.lang.String outputFormat,
      OutputSettings settings) {
    try {
      javonetHandle.invoke("ConvertMedia", new Object[] {inputs}, output, outputFormat, settings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ConvertLiveMediaTask ConvertLiveMedia(
      java.lang.String inputFormat,
      Stream outputStream,
      java.lang.String outputFormat,
      ConvertSettings settings) {
    try {
      Object res =
          javonetHandle.invoke(
              "ConvertLiveMedia", inputFormat, outputStream, outputFormat, settings);
      if (res == null) return null;
      return new ConvertLiveMediaTask((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ConvertLiveMediaTask ConvertLiveMedia(
      java.lang.String inputSource,
      java.lang.String inputFormat,
      Stream outputStream,
      java.lang.String outputFormat,
      ConvertSettings settings) {
    try {
      Object res =
          javonetHandle.invoke(
              "ConvertLiveMedia", inputSource, inputFormat, outputStream, outputFormat, settings);
      if (res == null) return null;
      return new ConvertLiveMediaTask((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ConvertLiveMediaTask ConvertLiveMedia(
      Stream inputStream,
      java.lang.String inputFormat,
      java.lang.String outputFile,
      java.lang.String outputFormat,
      ConvertSettings settings) {
    try {
      Object res =
          javonetHandle.invoke(
              "ConvertLiveMedia", inputStream, inputFormat, outputFile, outputFormat, settings);
      if (res == null) return null;
      return new ConvertLiveMediaTask((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ConvertLiveMediaTask ConvertLiveMedia(
      Stream inputStream,
      java.lang.String inputFormat,
      Stream outputStream,
      java.lang.String outputFormat,
      ConvertSettings settings) {
    try {
      Object res =
          javonetHandle.invoke(
              "ConvertLiveMedia", inputStream, inputFormat, outputStream, outputFormat, settings);
      if (res == null) return null;
      return new ConvertLiveMediaTask((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetVideoThumbnail(java.lang.String inputFile, Stream outputJpegStream) {
    try {
      javonetHandle.invoke("GetVideoThumbnail", inputFile, outputJpegStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetVideoThumbnail(java.lang.String inputFile, java.lang.String outputFile) {
    try {
      javonetHandle.invoke("GetVideoThumbnail", inputFile, outputFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetVideoThumbnail(
      java.lang.String inputFile, Stream outputJpegStream, Nullable<java.lang.Float> frameTime) {
    try {
      javonetHandle.invoke("GetVideoThumbnail", inputFile, outputJpegStream, frameTime);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetVideoThumbnail(
      java.lang.String inputFile,
      java.lang.String outputFile,
      Nullable<java.lang.Float> frameTime) {
    try {
      javonetHandle.invoke("GetVideoThumbnail", inputFile, outputFile, frameTime);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ConcatMedia(
      java.lang.String[] inputFiles,
      java.lang.String outputFile,
      java.lang.String outputFormat,
      ConcatSettings settings) {
    try {
      javonetHandle.invoke(
          "ConcatMedia", new Object[] {inputFiles}, outputFile, outputFormat, settings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Invoke(java.lang.String ffmpegArgs) {
    try {
      javonetHandle.invoke("Invoke", ffmpegArgs);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ExtractFFmpeg() {
    try {
      javonetHandle.invoke("ExtractFFmpeg");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Abort() {
    try {
      javonetHandle.invoke("Abort");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Stop() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Stop");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<ConvertProgressEventArgs>>
      _ConvertProgressListeners =
          new java.util.ArrayList<EventHandlerTEventArgs<ConvertProgressEventArgs>>();

  public void addConvertProgress(EventHandlerTEventArgs<ConvertProgressEventArgs> toAdd) {
    _ConvertProgressListeners.add(toAdd);
  }

  public void removeConvertProgress(EventHandlerTEventArgs<ConvertProgressEventArgs> toRemove) {
    _ConvertProgressListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandlerTEventArgs<FFMpegLogEventArgs>> _LogReceivedListeners =
      new java.util.ArrayList<EventHandlerTEventArgs<FFMpegLogEventArgs>>();

  public void addLogReceived(EventHandlerTEventArgs<FFMpegLogEventArgs> toAdd) {
    _LogReceivedListeners.add(toAdd);
  }

  public void removeLogReceived(EventHandlerTEventArgs<FFMpegLogEventArgs> toRemove) {
    _LogReceivedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
