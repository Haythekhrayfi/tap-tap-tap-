package bin.mt.signature;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.developer.filepicker.model.DialogConfigs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* JADX INFO: loaded from: classes4.dex */
public class KillerApplication extends Application {
    public static final String URL = "https://github.com/L-JINBIN/ApkSignatureKillerEx";

    static {
        killPM("com.inscode.autoclicker", "MIIDgTCCAmmgAwIBAgIEEHt1UDANBgkqhkiG9w0BAQsFADBxMQswCQYDVQQGEwJQTDESMBAGA1UE\nCBMJQ2xpY2ttYXRlMRIwEAYDVQQHEwlDbGlja21hdGUxEjAQBgNVBAoTCUNsaWNrbWF0ZTESMBAG\nA1UECxMJQ2xpY2ttYXRlMRIwEAYDVQQDEwlDbGlja21hdGUwHhcNMTkwODAxMTI1MDI1WhcNNDQw\nNzI1MTI1MDI1WjBxMQswCQYDVQQGEwJQTDESMBAGA1UECBMJQ2xpY2ttYXRlMRIwEAYDVQQHEwlD\nbGlja21hdGUxEjAQBgNVBAoTCUNsaWNrbWF0ZTESMBAGA1UECxMJQ2xpY2ttYXRlMRIwEAYDVQQD\nEwlDbGlja21hdGUwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCeqTmdEmzDRLvmx2HV\nWCt+l+9SLPvTDZQWetQZMHJ9uLuP0DqZIoGSZd/WoQRoT6hgXEsoEr+Q89SLwIJtcuNa8JRaFpWF\nzVOM0ZrOoYFj0aHVCdSeiZI++9uTIywkA1YVPBYfZqFvJwFGnTGFRz6wALoQkMcUnrrjm36DpyVZ\nuIb95B0ihwtTbjqeVA4PNgWsE74alnBI3opZJVHVHnGKQH3J4BlWqEXL39X46Srtnf6ud7NJau65\neJ7e25fM3YBMV5cLPeRQmHZkQQ1WMwLjqj4dmoUpRpkbWI2AwyYsB/BxH+JoL4FrX3Yj2IgFlNoa\nKdEYI0gU/idtNORH8lJxAgMBAAGjITAfMB0GA1UdDgQWBBTLFxFGHK9Cw8CgkNNlhLnsuj6aaDAN\nBgkqhkiG9w0BAQsFAAOCAQEABt2/P0Ezzl9RiC8/cTxc/r81fb0AB4B5N/CmynaImpICgll9bahF\nC+5y3WBb6VAcemyDOKh7QUxCtBndE5I6hrdtaeT6qBU7YP4E0FGpCMWS2fDa0hP4/nryNR9Cl1FM\npgPeg0uNluLOjngBzelbaNgY2hvTL7AgB7hr9wLCN4XHcdOoKBhxGqE3ouzUYhfPuwjXas/mmRBy\nhCh38Tyb7rgJXMvjg5PYVGdQABWzP5k2P8syEXUEJbP2oOPFO49fwXmbQ4iI85B5zhpiFJ+ejqh2\n0oj3aG8fQV5Rd0WALo/i5gsr5oATIvP2aaocW8hEiR538iGUGiuqv+9cypA6RQ==\n");
        killOpen("com.inscode.autoclicker");
    }

    private static Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e10) {
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls.equals(Object.class)) {
                    break;
                }
                try {
                    Field declaredField2 = cls.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e10;
        }
    }

    private static String getApkPath(String str) {
        String str2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return null;
                    }
                    String[] strArrSplit = line.split("\\s+");
                    str2 = strArrSplit[strArrSplit.length - 1];
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw new RuntimeException(e);
            } while (!isApkPath(str, str2));
            bufferedReader.close();
            return str2;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static File getDataFile(String str) {
        String name = Environment.getExternalStorageDirectory().getName();
        if (name.matches("\\d+")) {
            File file = new File("/data/user/" + name + DialogConfigs.DIRECTORY_SEPERATOR + str);
            if (file.canWrite()) {
                return file;
            }
        }
        return new File("/data/data/" + str);
    }

    private static native void hookApkPath(String str, String str2);

    private static boolean isApkPath(String str, String str2) {
        if (str2.startsWith(DialogConfigs.DIRECTORY_SEPERATOR) && str2.endsWith(".apk")) {
            String[] strArrSplit = str2.substring(1).split(DialogConfigs.DIRECTORY_SEPERATOR, 6);
            int length = strArrSplit.length;
            if (length == 4 || length == 5) {
                if (strArrSplit[0].equals("data") && strArrSplit[1].equals("app") && strArrSplit[length - 1].equals("base.apk")) {
                    return strArrSplit[length - 2].startsWith(str);
                }
                if (strArrSplit[0].equals(DialogConfigs.STORAGE_DIR) && strArrSplit[1].equals("asec") && strArrSplit[length - 1].equals("pkg.apk")) {
                    return strArrSplit[length - 2].startsWith(str);
                }
            } else if (length == 3) {
                if (strArrSplit[0].equals("data") && strArrSplit[1].equals("app")) {
                    return strArrSplit[2].startsWith(str);
                }
            } else if (length == 6 && strArrSplit[0].equals(DialogConfigs.STORAGE_DIR) && strArrSplit[1].equals("expand") && strArrSplit[3].equals("app") && strArrSplit[5].equals("base.apk")) {
                return strArrSplit[4].endsWith(str);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void killOpen(String str) {
        try {
            System.loadLibrary("SignatureKiller");
            String apkPath = getApkPath(str);
            if (apkPath == null) {
                System.err.println("Get apk path failed");
                return;
            }
            File file = new File(apkPath);
            File file2 = new File(getDataFile(str), "origin.apk");
            try {
                ZipFile zipFile = new ZipFile(file);
                try {
                    ZipEntry entry = zipFile.getEntry("assets/SignatureKiller/origin.apk");
                    if (entry == null) {
                        System.err.println("Entry not found: assets/SignatureKiller/origin.apk");
                        zipFile.close();
                        return;
                    }
                    if (!file2.exists() || file2.length() != entry.getSize()) {
                        InputStream inputStream = zipFile.getInputStream(entry);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] bArr = new byte[102400];
                                while (true) {
                                    int i10 = inputStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i10);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                        }
                                    }
                                    throw th;
                                }
                                fileOutputStream.close();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th4;
                        }
                    }
                    zipFile.close();
                    hookApkPath(file.getAbsolutePath(), file2.getAbsolutePath());
                    return;
                } catch (Throwable th5) {
                    try {
                        zipFile.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
            throw new RuntimeException(e10);
        } catch (Throwable unused) {
            System.err.println("Load SignatureKiller library failed");
        }
    }

    private static void killPM(final String str, String str2) {
        final Signature signature = new Signature(Base64.decode(str2, 0));
        final Parcelable.Creator creator = PackageInfo.CREATOR;
        try {
            findField(PackageInfo.class, "CREATOR").set(null, new Parcelable.Creator<PackageInfo>() { // from class: bin.mt.signature.KillerApplication.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo createFromParcel(Parcel parcel) {
                    Signature[] apkContentsSigners;
                    PackageInfo packageInfo = (PackageInfo) creator.createFromParcel(parcel);
                    if (packageInfo.packageName.equals(str)) {
                        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                            packageInfo.signatures[0] = signature;
                        }
                        if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                            apkContentsSigners[0] = signature;
                        }
                    }
                    return packageInfo;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo[] newArray(int i10) {
                    return (PackageInfo[]) creator.newArray(i10);
                }
            });
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.addHiddenApiExemptions("Landroid/os/Parcel;", "Landroid/content/pm", "Landroid/app");
            }
            try {
                Object obj = findField(PackageManager.class, "sPackageInfoCache").get(null);
                obj.getClass().getMethod("clear", new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable unused) {
            }
            try {
                ((Map) findField(Parcel.class, "mCreators").get(null)).clear();
            } catch (Throwable unused2) {
            }
            try {
                ((Map) findField(Parcel.class, "sPairedCreators").get(null)).clear();
            } catch (Throwable unused3) {
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
