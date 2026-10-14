package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;

    @GuardedBy("DynamiteModule.class")
    private static Boolean zzb = null;

    @GuardedBy("DynamiteModule.class")
    private static String zzc = null;

    @GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;

    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;

    @GuardedBy("DynamiteModule.class")
    private static Boolean zzf;

    @GuardedBy("DynamiteModule.class")
    private static zzq zzk;

    @GuardedBy("DynamiteModule.class")
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z10) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0209 A[Catch: all -> 0x0212, TRY_ENTER, TryCatch #2 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0209, B:102:0x0211), top: B:148:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x028d A[Catch: all -> 0x02d6, TryCatch #6 {all -> 0x02d6, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x0216, B:108:0x0221, B:110:0x0223, B:112:0x0225, B:113:0x022d, B:131:0x028d, B:132:0x02a4, B:115:0x022f, B:117:0x024d, B:119:0x025e, B:129:0x0284, B:130:0x028c, B:133:0x02a5, B:134:0x02d5), top: B:151:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x007d A[Catch: all -> 0x02d6, TRY_LEAVE, TryCatch #6 {all -> 0x02d6, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x0216, B:108:0x0221, B:110:0x0223, B:112:0x0225, B:113:0x022d, B:131:0x028d, B:132:0x02a4, B:115:0x022f, B:117:0x024d, B:119:0x025e, B:129:0x0284, B:130:0x028c, B:133:0x02a5, B:134:0x02d5), top: B:151:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[Catch: all -> 0x0212, TryCatch #2 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0209, B:102:0x0211), top: B:148:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014d A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0159 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017d A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0184 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018c A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b6 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ee A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0200 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x028d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0159, please report this as an issue */
    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        int i10;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        Cursor cursor;
        zzr zzrVar;
        zzn zznVar2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor2;
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + selectionResultSelectModule.localVersion + " and remote module " + str + ":" + selectionResultSelectModule.remoteVersion);
            int i11 = selectionResultSelectModule.selection;
            if (i11 != 0) {
                if (i11 != -1) {
                    if (i11 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i11 == -1) {
                            DynamiteModule dynamiteModuleZzc = zzc(context, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = zznVar4.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModuleZzc;
                        }
                        if (i11 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i11, null);
                        }
                        try {
                            i10 = selectionResultSelectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (zzf(context)) {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                    bool = zzb;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = zzl;
                                    }
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zznVar2 = (zzn) threadLocal.get();
                                    if (zznVar2 != null || zznVar2.zza == null) {
                                        throw new LoadingException("No result cursor", null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = zznVar2.zza;
                                    ObjectWrapper.wrap(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(zze >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i10, ObjectWrapper.wrap(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i10, ObjectWrapper.wrap(cursor3));
                                    }
                                    Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context", null);
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    zzqVarZzg = zzg(context);
                                    if (zzqVarZzg != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    iZze = zzqVarZzg.zze();
                                    if (iZze >= 3) {
                                        zznVar = (zzn) threadLocal.get();
                                        if (zznVar != null) {
                                            throw new LoadingException("No cached result cursor holder", null);
                                        }
                                        iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i10, ObjectWrapper.wrap(zznVar.zza));
                                    } else if (iZze == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i10);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i10);
                                    }
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                    if (objUnwrap != null) {
                                        throw new LoadingException("Failed to load remote module.", null);
                                    }
                                    dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                }
                                if (jLongValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(Long.valueOf(jLongValue));
                                }
                                cursor = zznVar4.zza;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(zznVar3);
                                return dynamiteModule;
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10, null);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e12) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                            int i12 = selectionResultSelectModule.localVersion;
                            if (i12 == 0 || versionPolicy.selectModule(context, str, new zzo(i12, 0)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e12, null);
                            }
                            DynamiteModule dynamiteModuleZzc2 = zzc(context, str);
                            if (jLongValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor4 = zznVar4.zza;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            zzg.set(zznVar3);
                            return dynamiteModuleZzc2;
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i11 = -1;
                    if (i11 == 1) {
                    }
                    if (i11 == -1) {
                        DynamiteModule dynamiteModuleZzc3 = zzc(context, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = zznVar4.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModuleZzc3;
                    }
                    if (i11 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i11, null);
                    }
                    i10 = selectionResultSelectModule.remoteVersion;
                    synchronized (DynamiteModule.class) {
                        if (zzf(context)) {
                            throw new LoadingException("Remote loading disabled", null);
                        }
                        bool = zzb;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                            synchronized (DynamiteModule.class) {
                                zzrVar = zzl;
                                if (zzrVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                zznVar2 = (zzn) threadLocal.get();
                                if (zznVar2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                        zzqVarZzg = zzg(context);
                        if (zzqVarZzg != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        iZze = zzqVarZzg.zze();
                        if (iZze >= 3) {
                            zznVar = (zzn) threadLocal.get();
                            if (zznVar != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i10, ObjectWrapper.wrap(zznVar.zza));
                        } else if (iZze == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i10);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i10);
                        }
                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                        if (objUnwrap != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModule;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = zznVar4.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzg.set(zznVar3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a5 A[Catch: all -> 0x00af, TryCatch #5 {, blocks: (B:9:0x0026, B:11:0x0032, B:48:0x00ad, B:14:0x0038, B:16:0x003f, B:18:0x0045, B:21:0x0048, B:23:0x004c, B:27:0x0056, B:29:0x005e, B:32:0x0065, B:39:0x008f, B:40:0x0097, B:35:0x006c, B:37:0x0072, B:38:0x0081, B:43:0x009a, B:46:0x009d, B:47:0x00a5, B:15:0x003b), top: B:130:0x0026, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0163 A[Catch: all -> 0x01bf, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01bf, blocks: (B:3:0x0002, B:61:0x00d6, B:63:0x00dc, B:68:0x00fd, B:90:0x0155, B:94:0x0163, B:115:0x01b8, B:116:0x01bb, B:110:0x01b0, B:66:0x00e2, B:119:0x01be, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00d3, B:19:0x0046, B:41:0x0098, B:44:0x009b, B:52:0x00b1, B:60:0x00d5, B:58:0x00b7), top: B:136:0x0002, inners: #2, #11 }] */
    public static int zza(Context context, String str, boolean z10) {
        Throwable th;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    } else {
                                        try {
                                            int iZzb = zzb(context, str, z10, true);
                                            String str2 = zzc;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = zzc;
                                                        Preconditions.checkNotNull(str3);
                                                        classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = zzc;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                zzd(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzb = bool2;
                                                return iZzb;
                                            }
                                            return iZzb;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                            zzb = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z10, false);
                    } catch (LoadingException e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                if (zzqVarZzg != null) {
                    try {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z10, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                cursor2 = (i10 <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i10;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z10);
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return iZzf;
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int zzb(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th;
        Exception e10;
        ?? r10 = 0;
        ?? r11 = 0;
        ?? r12 = 0;
        ?? r13 = 0;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzc = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zze = cursorQuery.getInt(columnIndex);
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (cursorQuery.getInt(columnIndex2) == 0) {
                                            z12 = false;
                                        }
                                        zzd = z12;
                                        z13 = z12;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r12 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i10;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        if (e10 instanceof LoadingException) {
                            throw e10;
                        }
                        throw new LoadingException("V2 version check failed", e10, r11 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r13 == true ? 1 : 0);
            } catch (Throwable th2) {
                th = th2;
                r10 = context;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzf = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
