package ch.qos.logback.core.util;

import androidx.activity.j;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import com.developer.filepicker.model.DialogConfigs;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import w2.d;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil extends ContextAwareBase {
    public static final int BUF_SIZE = 32768;

    public FileUtil(Context context) {
        setContext(context);
    }

    public static boolean createMissingParentDirectories(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return true;
        }
        parentFile.mkdirs();
        return parentFile.exists();
    }

    public static URL fileToURL(File file) {
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e10) {
            throw new RuntimeException(d.a("Unexpected exception on file [", file, "]"), e10);
        }
    }

    public static String prefixRelativePath(String str, String str2) {
        return (str == null || OptionHelper.isEmpty(str.trim()) || new File(str2).isAbsolute()) ? str2 : j.a(str, DialogConfigs.DIRECTORY_SEPERATOR, str2);
    }

    public void copy(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        IOException e10;
        BufferedInputStream bufferedInputStream;
        IOException iOException;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    try {
                        byte[] bArr = new byte[BUF_SIZE];
                        while (true) {
                            int i10 = bufferedInputStream.read(bArr);
                            if (i10 != -1) {
                                bufferedOutputStream.write(bArr, 0, i10);
                            } else {
                                bufferedInputStream.close();
                                try {
                                    bufferedOutputStream.close();
                                    return;
                                } catch (IOException e11) {
                                    iOException = e11;
                                    bufferedInputStream = null;
                                    e10 = iOException;
                                    String str3 = "Failed to copy [" + str + "] to [" + str2 + "]";
                                    addError(str3, e10);
                                    throw new RolloverFailure(str3);
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (bufferedOutputStream == null) {
                                throw th;
                            }
                            try {
                                bufferedOutputStream.close();
                                throw th;
                            } catch (IOException unused2) {
                                throw th;
                            }
                        }
                    } catch (IOException e12) {
                        e10 = e12;
                        String str4 = "Failed to copy [" + str + "] to [" + str2 + "]";
                        addError(str4, e10);
                        throw new RolloverFailure(str4);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                }
            } catch (IOException e13) {
                iOException = e13;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                bufferedInputStream2 = bufferedInputStream;
            }
        } catch (IOException e14) {
            bufferedOutputStream = null;
            e10 = e14;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
