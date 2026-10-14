package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import ch.qos.logback.core.util.FileUtil;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06957x {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C06977z A01(String str, C7Q c7q, Map<String, String> map) {
        C06977z c06977z = null;
        try {
            c06977z = new C06977z(c7q.A08().A01(), c7q.A08().A02(), new C06827j(str, map, true).A02());
            A0C(c06977z, c7q);
            return c06977z;
        } catch (Exception unused) {
            return c06977z;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static JSONArray A04(C7Q c7q, int i10) {
        InterfaceC06927u interfaceC06927uA07;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (new File(c7q.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7q)).exists()) {
                        fileInputStreamOpenFileInput = c7q.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7q));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null || i10 == 0) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(line);
                            if (!jSONObject.has(A02(260, 7, 27))) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                            }
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                int i11 = jSONObject.getInt(A02(260, 7, 27));
                                Map<String, Integer> map = A05;
                                if (map.containsKey(string)) {
                                    jSONObject.put(A02(260, 7, 27), String.valueOf(map.get(string)));
                                } else {
                                    A0E(string, i11);
                                }
                                jSONArray.put(jSONObject);
                                if (i10 > 0) {
                                    i10--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            e = e10;
                            interfaceC06927uA07 = c7q.A07();
                            interfaceC06927uA07.A3X(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (IOException | JSONException e11) {
                    c7q.A07().A3X(e11);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e12) {
                            e = e12;
                            interfaceC06927uA07 = c7q.A07();
                            interfaceC06927uA07.A3X(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e13) {
                        c7q.A07().A3X(e13);
                        throw th;
                    }
                }
                if (0 != 0) {
                    inputStreamReader.close();
                }
                if (0 != 0) {
                    fileInputStreamOpenFileInput.close();
                }
                throw th;
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, Ascii.FS, 3, 48, Ascii.FS, 6, Ascii.GS, 7, 22, 1, 73, 83, 63, Ascii.GS, 18, 91, 8, 92, Ascii.CAN, Ascii.EM, 16, Ascii.EM, 8, Ascii.EM, 92, Ascii.CAN, Ascii.EM, Ascii.RS, 9, Ascii.ESC, 92, Ascii.EM, 10, Ascii.EM, 18, 8, 15, 92, Ascii.SUB, 21, 16, Ascii.EM, 82, 14, 44, 35, 106, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, 108, 119, 118, 113, 102, 116, 108, 99, 97, 118, 117, 42, Ascii.EM, 10, 1, Ascii.ESC, 44, 0, Ascii.SUB, 1, Ascii.ESC, 41, 45, 46, Ascii.SUB, 11, 6, 10, 1, 12, 10, 33, 10, Ascii.ESC, Ascii.CAN, 0, Ascii.GS, 4, Ascii.US, 58, 61, 40, 42, 111, 43, 42, 45, 58, 40, 111, 42, 57, 42, 33, 59, 60, 111, 41, 38, 35, 42, 97, 69, 9, 38, 35, 42, 111, 60, 38, 53, 42, 117, 111, 111, 87, 85, 76, 76, 89, 88, Ascii.FS, 89, 74, 89, 82, 72, 79, 18, 40, 16, 18, 11, 11, 18, 21, Ascii.FS, 91, Ascii.CAN, 20, 9, 9, 14, 11, 15, Ascii.RS, Ascii.US, 91, Ascii.US, Ascii.RS, Ascii.EM, 14, Ascii.FS, 91, Ascii.RS, 13, Ascii.RS, 21, 15, 91, 23, 18, 21, Ascii.RS, 85, 98, 68, 79, 95, 88, 81, 22, 66, 89, 22, 67, 70, 82, 87, 66, 83, 22, 67, 88, 68, 83, 85, 89, 68, 82, 83, 82, 22, 82, 83, 84, 67, 81, 122, 89, 81, 115, 64, 83, 88, 66, Ascii.CAN, 22, 87, 82, 82, 95, 88, 81, 22, 66, 89, 22, 121, 88, 81, 89, 95, 88, 81, 115, 64, 83, 88, 66, Ascii.CAN, 58, 17, 0, 8, 21, 6, 19, 19, 2, 10, 23, 19, 88, 93, 72, 93, Ascii.DEL, 126, 68, 119, 116, 124, 124, 114, 117, 124, 43, 42, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, Ascii.GS, 88, 75, 88, 83, 73, Ascii.GS, 78, 85, 82, 72, 81, 89, Ascii.GS, 83, 82, 73, Ascii.GS, 95, 88, Ascii.GS, 72, 77, 89, 92, 73, 88, 89, Ascii.GS, 73, 82, Ascii.GS, 114, 83, 90, 82, 84, 83, 90, 120, 75, 88, 83, 73, 19, 107, 102, 126, 104, 126, 126, 100, 98, 99, 82, 100, 105, 72, 94, 72, 72, 82, 84, 85, 100, 79, 82, 86, 94, 105, 113, 115, 106, 106, Ascii.DEL, 126, 95, 108, Ascii.DEL, 116, 110, 105, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, 72, 93, 103, 91, 87, 92, 93, 119, 106, 110, 102, 85, 88, 81, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0G(C7Q c7q) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            int i10 = 0;
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    if (new File(c7q.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7q)).exists()) {
                        fileInputStreamOpenFileInput = c7q.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7q));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(line);
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                Map<String, Integer> map = A05;
                                if (map.containsKey(string)) {
                                    Integer num = map.get(string);
                                    Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                    int iA02 = IP.A02(c7q);
                                    if (iA02 <= -1 || numValueOf.intValue() <= iA02 - 1) {
                                        jSONObject.put(A02(260, 7, 27), String.valueOf(numValueOf));
                                        jSONArray.put(jSONObject);
                                    } else {
                                        A0D(string);
                                        i10++;
                                    }
                                } else {
                                    jSONArray.put(jSONObject);
                                }
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            sb2.append(jSONArray.getJSONObject(i11).toString()).append('\n');
                        }
                        fileOutputStreamOpenFileOutput = c7q.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7q), 0);
                        fileOutputStreamOpenFileOutput.write(sb2.toString().getBytes());
                    }
                    A09(c7q, A00(c7q));
                    if (i10 > 0) {
                        c7q.A07().A9K(A02(271, 10, 103), C06937v.A2V, new C06947w(A02(138, 15, 64), A02(367, 16, 102) + i10));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            c7q.A07().A3X(e10);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A06.clear();
                    A05.clear();
                    return true;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            c7q.A07().A3X(e11);
                            A06.clear();
                            A05.clear();
                            throw th;
                        }
                    }
                    if (0 != 0) {
                        inputStreamReader.close();
                    }
                    if (0 != 0) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (0 != 0) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A06.clear();
                    A05.clear();
                    throw th;
                }
            } catch (IOException | JSONException e12) {
                c7q.A07().A3X(e12);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e13) {
                        c7q.A07().A3X(e13);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0227 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x022c A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0231 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0236 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x023b A[Catch: IOException -> 0x023f, all -> 0x0252, TRY_LEAVE, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x005d A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0H(C7Q c7q) {
        int iIntValue;
        synchronized (A03) {
            int i10 = 0;
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            FileInputStream fileInputStreamOpenFileInput2 = null;
            FileOutputStream fileOutputStreamOpenFileOutput2 = null;
            try {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7q);
                    File file = new File(c7q.getFilesDir(), processSpecificName);
                    String str = processSpecificName + A02(255, 5, 25);
                    A0A(c7q, str);
                    if (file.exists()) {
                        fileOutputStreamOpenFileOutput2 = c7q.openFileOutput(str, FileUtil.BUF_SIZE);
                        fileInputStreamOpenFileInput = c7q.openFileInput(processSpecificName);
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        try {
                                            JSONObject jSONObject = new JSONObject(line);
                                            String string = jSONObject.getString(A02(343, 2, 126));
                                            if (!A06.contains(string)) {
                                                Map<String, Integer> map = A05;
                                                if (map.containsKey(string)) {
                                                    try {
                                                        Integer num = map.get(string);
                                                        if (num != null) {
                                                            try {
                                                                iIntValue = num.intValue();
                                                            } catch (IOException e10) {
                                                                e = e10;
                                                            } catch (JSONException e11) {
                                                                e = e11;
                                                                if (c7q.A04().A8n()) {
                                                                    Log.e(A04, A02(153, 36, 7), e);
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                if (bufferedReader != null) {
                                                                    try {
                                                                        bufferedReader.close();
                                                                    } catch (IOException e12) {
                                                                        c7q.A07().A3X(e12);
                                                                        A06.clear();
                                                                        A05.clear();
                                                                        throw th;
                                                                    }
                                                                }
                                                                if (inputStreamReader != null) {
                                                                    inputStreamReader.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput != null) {
                                                                    fileInputStreamOpenFileInput.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput != null) {
                                                                    fileOutputStreamOpenFileOutput.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput2 != null) {
                                                                    fileInputStreamOpenFileInput2.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput2 != null) {
                                                                    fileOutputStreamOpenFileOutput2.close();
                                                                }
                                                                A06.clear();
                                                                A05.clear();
                                                                throw th;
                                                            }
                                                        } else {
                                                            iIntValue = 0;
                                                        }
                                                        Integer numValueOf = Integer.valueOf(iIntValue);
                                                        int iA02 = IP.A02(c7q);
                                                        if (iA02 > -1) {
                                                            try {
                                                                if (numValueOf.intValue() > iA02 - 1) {
                                                                    try {
                                                                        try {
                                                                            A0D(string);
                                                                            i10++;
                                                                        } catch (JSONException e13) {
                                                                            e = e13;
                                                                            if (c7q.A04().A8n()) {
                                                                                Log.e(A04, A02(153, 36, 7), e);
                                                                            }
                                                                        }
                                                                    } catch (IOException e14) {
                                                                        e = e14;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        if (bufferedReader != null) {
                                                                            bufferedReader.close();
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (fileInputStreamOpenFileInput != null) {
                                                                            fileInputStreamOpenFileInput.close();
                                                                        }
                                                                        if (fileOutputStreamOpenFileOutput != null) {
                                                                            fileOutputStreamOpenFileOutput.close();
                                                                        }
                                                                        if (fileInputStreamOpenFileInput2 != null) {
                                                                            fileInputStreamOpenFileInput2.close();
                                                                        }
                                                                        if (fileOutputStreamOpenFileOutput2 != null) {
                                                                            fileOutputStreamOpenFileOutput2.close();
                                                                        }
                                                                        A06.clear();
                                                                        A05.clear();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (IOException e15) {
                                                                e = e15;
                                                            } catch (JSONException e16) {
                                                                e = e16;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                if (bufferedReader != null) {
                                                                    bufferedReader.close();
                                                                }
                                                                if (inputStreamReader != null) {
                                                                    inputStreamReader.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput != null) {
                                                                    fileInputStreamOpenFileInput.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput != null) {
                                                                    fileOutputStreamOpenFileOutput.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput2 != null) {
                                                                    fileInputStreamOpenFileInput2.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput2 != null) {
                                                                    fileOutputStreamOpenFileOutput2.close();
                                                                }
                                                                A06.clear();
                                                                A05.clear();
                                                                throw th;
                                                            }
                                                        }
                                                        jSONObject.put(A02(260, 7, 27), String.valueOf(numValueOf));
                                                        fileOutputStreamOpenFileOutput2.write((jSONObject.toString() + '\n').getBytes());
                                                    } catch (IOException e17) {
                                                        e = e17;
                                                    } catch (JSONException e18) {
                                                        e = e18;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } else {
                                                    fileOutputStreamOpenFileOutput2.write((jSONObject.toString() + '\n').getBytes());
                                                }
                                            }
                                        } catch (JSONException e19) {
                                            e = e19;
                                        }
                                    } catch (IOException e20) {
                                        e = e20;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                    c7q.A07().A3X(e);
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e21) {
                                            c7q.A07().A3X(e21);
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        inputStreamReader.close();
                                    }
                                    if (fileInputStreamOpenFileInput != null) {
                                        fileInputStreamOpenFileInput.close();
                                    }
                                    if (fileOutputStreamOpenFileOutput != null) {
                                        fileOutputStreamOpenFileOutput.close();
                                    }
                                    if (fileInputStreamOpenFileInput2 != null) {
                                        fileInputStreamOpenFileInput2.close();
                                    }
                                    if (fileOutputStreamOpenFileOutput2 != null) {
                                        fileOutputStreamOpenFileOutput2.close();
                                    }
                                    A06.clear();
                                    A05.clear();
                                    return false;
                                }
                                fileInputStreamOpenFileInput2 = c7q.openFileInput(str);
                                fileOutputStreamOpenFileOutput = c7q.openFileOutput(processSpecificName, 0);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i11 = fileInputStreamOpenFileInput2.read(bArr);
                                    if (i11 <= 0) {
                                        break;
                                    }
                                    fileOutputStreamOpenFileOutput.write(bArr, 0, i11);
                                }
                                fileInputStreamOpenFileInput2.close();
                                fileOutputStreamOpenFileOutput2.close();
                                A0A(c7q, str);
                            } catch (IOException e22) {
                                e = e22;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (IOException e23) {
                            e = e23;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    A09(c7q, A00(c7q));
                    if (i10 > 0) {
                        c7q.A07().A9K(A02(271, 10, 103), C06937v.A2V, new C06947w(A02(138, 15, 64), A02(367, 16, 102) + i10));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e24) {
                            c7q.A07().A3X(e24);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    if (fileInputStreamOpenFileInput2 != null) {
                        fileInputStreamOpenFileInput2.close();
                    }
                    if (fileOutputStreamOpenFileOutput2 != null) {
                        fileOutputStreamOpenFileOutput2.close();
                    }
                    A06.clear();
                    A05.clear();
                    return true;
                } catch (IOException e25) {
                    e = e25;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    static {
        A06();
        A04 = C06957x.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static JSONArray A03(C7Q c7q) {
        return A04(c7q, -1);
    }

    public static JSONObject A05(C06977z c06977z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 93), c06977z.A03());
        jSONObject.put(A02(402, 4, 127), LF.A02(c06977z.A01()));
        jSONObject.put(A02(355, 12, 71), LF.A02(c06977z.A00()));
        jSONObject.put(A02(345, 10, 113), c06977z.A02());
        jSONObject.put(A02(267, 4, 64), c06977z.A04() != null ? new JSONObject(c06977z.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File debugFile = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (debugFile.exists()) {
                debugFile.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A09(Context context, int i10) {
        int i11 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (i10 >= 0) {
            i11 = i10;
        }
        editorEdit.putInt(A02(75, 10, 19), i11).apply();
    }

    public static void A0A(C7Q c7q, String str) {
        File file = new File(c7q.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c7q.A07().A3X(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0B(C1336Xv c1336Xv, String str) {
        Map<String, Integer> map = A05;
        Integer num = map.get(str);
        if (num == null) {
            if (c1336Xv.A04().A8n()) {
                Log.e(A04, A02(189, 66, 74));
            }
            num = 0;
        } else {
            map.remove(str);
        }
        map.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void A0C(C06977z c06977z, C7Q c7q) {
        if (c06977z != null && c7q != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c7q);
                    File file = new File(c7q.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int iA07 = IP.A07(c7q);
                        long length = file.length();
                        if (iA07 > 0 && length > iA07) {
                            boolean zDelete = file.delete();
                            A09(c7q, 0);
                            A06.clear();
                            A05.clear();
                            if (zDelete) {
                                Map<String, String> mapA4i = c7q.A03().A4i();
                                mapA4i.put(A02(383, 7, 62), A02(271, 10, 103));
                                mapA4i.put(A02(390, 12, 68), String.valueOf(2401));
                                A01(A02(102, 36, 51) + length + A02(1, 15, 15) + A00.getAndIncrement(), c7q, mapA4i);
                                return;
                            }
                            Log.e(A02(85, 17, 19), A02(16, 31, 0));
                        }
                    }
                    JSONObject jSONObjectA05 = A05(c06977z);
                    FileOutputStream outputStream = c7q.openFileOutput(processSpecificName, FileUtil.BUF_SIZE);
                    outputStream.write((jSONObjectA05.toString() + A02(0, 1, 113)).getBytes());
                    outputStream.close();
                    A08(c7q);
                } catch (Exception e10) {
                    c7q.A07().A3X(e10);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i10) {
        if (!A06.contains(str)) {
            Map<String, Integer> map = A05;
            boolean zContainsKey = map.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            A02[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (zContainsKey) {
                map.remove(str);
            }
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0F(C7Q c7q) {
        if (IP.A0O(c7q)) {
            return A0H(c7q);
        }
        boolean zA0G = A0G(c7q);
        String[] strArr = A02;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
        strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
        return zA0G;
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
