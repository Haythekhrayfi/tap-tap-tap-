package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.84, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass84 {
    public static Sensor A00;
    public static Sensor A01;
    public static SensorEventListener A02;
    public static SensorEventListener A03;
    public static SensorManager A04;
    public static Map<String, String> A05;
    public static byte[] A06;
    public static String[] A07;
    public static final AtomicReference<String> A08;
    public static volatile float[] A09;
    public static volatile float[] A0A;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-97, -12, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, -67, -65, -48, -59, -46, -59, -48, -43, 41, 54, 44, 58, 55, 49, 44, -10, 49, 54, 60, 45, 54, 60, -10, 41, 43, 60, 49, 55, 54, -10, 10, 9, Ascii.FS, Ascii.FS, 13, Ascii.SUB, 33, 39, 11, 16, 9, 22, 15, 13, 12, 23, 44, 23, Ascii.US, 34, 23, Ascii.CAN, 34, Ascii.ESC, 21, 35, Ascii.ESC, 35, 37, 40, 47, 33, 32, 51, 51, 36, 49, 56, -4, 1, -6, 11, 0, 2, 7, 0, 35, 47, 34, 34, Ascii.FS, 48, 45, Ascii.RS, 32, 34, -18, -20, -11, -20, -7, -16, -22, 19, 12, Ascii.GS, 12, 19, -60, -63, -58, -77, -58, -69, -63, -64, -79, -60, -76, -78, -67, -74, 4, -10, -1, 4, 0, 3, 8, 9, -10, 9, 10, 8, 45, 40, 45, Ascii.SUB, 37, Ascii.CAN, 38, Ascii.RS, 38, 40, 43, 50, 16, 17, -49};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A08(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String strValueOf = String.valueOf(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        A08.set(strValueOf);
        A05.put(A01(92, 10, 111), strValueOf);
    }

    static {
        A03();
        A04 = null;
        A00 = null;
        A01 = null;
        A05 = new ConcurrentHashMap();
        A07 = new String[]{A01(SyslogConstants.LOG_LOCAL3, 1, 74), A01(153, 1, 74), A01(154, 1, 7)};
        A08 = new AtomicReference<>();
    }

    public static String A00() {
        return A08.get();
    }

    public static Map<String, String> A02() {
        HashMap map = new HashMap();
        Map<String, String> currentAnalogInfo = A05;
        map.putAll(currentAnalogInfo);
        A0C(map);
        return map;
    }

    public static synchronized void A06() {
        SensorManager sensorManager = A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(A02);
        }
        A02 = null;
    }

    public static synchronized void A07() {
        SensorManager sensorManager = A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(A03);
        }
        A03 = null;
    }

    public static void A09(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(A01(16, 8, 14))).getMemoryInfo(memoryInfo);
        A05.put(A01(61, 16, 104), String.valueOf(memoryInfo.availMem));
        if (Build.VERSION.SDK_INT >= 16) {
            A05.put(A01(140, 12, 107), String.valueOf(memoryInfo.totalMem));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.ads.redexgen.X.7Q] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.ads.redexgen.X.7Q] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Intent] */
    public static void A0A(C7Q c7q) {
        try {
            c7q = c7q.registerReceiver(null, new IntentFilter(A01(24, 37, 122)));
            if (c7q == 0) {
                return;
            }
            int intExtra = c7q.getIntExtra(A01(109, 5, 89), -1);
            int scale = c7q.getIntExtra(A01(123, 5, 3), -1);
            int level = c7q.getIntExtra(A01(134, 6, 71), -1);
            boolean z10 = level == 2 || level == 5;
            float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (scale > 0) {
                f10 = (intExtra / scale) * 100.0f;
            }
            A05.put(A01(77, 7, 113), String.valueOf(f10));
            A05.put(A01(84, 8, 75), z10 ? A01(1, 1, 117) : A01(0, 1, 33));
        } catch (IllegalArgumentException e10) {
            c7q.A07().A9K(A01(102, 7, 57), C06937v.A1T, new C06947w(e10));
        }
    }

    public static synchronized void A0B(C7Q c7q) {
        A09(c7q);
        A0A(c7q);
        if (A04 == null) {
            SensorManager sensorManager = (SensorManager) c7q.getSystemService(A01(128, 6, 67));
            A04 = sensorManager;
            if (sensorManager == null) {
                return;
            }
        }
        if (A00 == null) {
            A00 = A04.getDefaultSensor(1);
        }
        if (A01 == null) {
            A01 = A04.getDefaultSensor(4);
        }
        AnonymousClass81 anonymousClass81 = null;
        if (A02 == null) {
            AnonymousClass82 anonymousClass82 = new AnonymousClass82();
            A02 = anonymousClass82;
            Sensor sensor = A00;
            if (sensor != null) {
                A04.registerListener(anonymousClass82, sensor, 3);
            }
        }
        if (A03 == null) {
            AnonymousClass83 anonymousClass83 = new AnonymousClass83();
            A03 = anonymousClass83;
            Sensor sensor2 = A01;
            if (sensor2 != null) {
                A04.registerListener(anonymousClass83, sensor2, 3);
            }
        }
    }

    public static void A0C(Map<String, String> map) {
        float[] fArr = A09;
        float[] fArr2 = A0A;
        if (fArr != null) {
            int iMin = Math.min(A07.length, fArr.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                map.put(A01(2, 14, 65) + A07[i10], String.valueOf(fArr[i10]));
            }
        }
        if (fArr2 != null) {
            int iMin2 = Math.min(A07.length, fArr2.length);
            for (int i11 = 0; i11 < iMin2; i11++) {
                map.put(A01(114, 9, 4) + A07[i11], String.valueOf(fArr2[i11]));
            }
        }
    }
}
