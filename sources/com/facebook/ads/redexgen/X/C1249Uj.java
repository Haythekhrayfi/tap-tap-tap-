package com.facebook.ads.redexgen.X;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1249Uj implements HA {
    public static byte[] A02;
    public static String[] A03 = {"V9uyJ8pLVYRD0ZldKEQ8Fm6zvmqMDXWy", "Hg71UAiYySRbQdhhlwilCiKnXjev2ePA", "dXXMV49sZASER8PJdu1teXvpuaC", "ItxDGkbDnUyb6oqtSMasVXx46j9iOzYk", "dhSjei0RHB98MxffIoNKZhf7ZhQ", "21gtHhMrMv89rh6v8Px22ucxkmd", "UIi9EoWARjlD8E8YBHi4CxflqQKZlpEG", "jZKVHFEUmyWXIM9jvQw89fwKPj"};
    public static final C1249Uj A04;
    public int A00;
    public final Map<String, byte[]> A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{20, 51, 43, 60, 49, 52, 57, 125, 43, 60, 49, 40, 56, 125, 46, 52, 39, 56, 103, 125, 87, 107, 102, 35, 112, 106, 121, 102, 35, 108, 101, 35, 38, 112, 35, 43, 38, 103, 42, 35, 106, 112, 35, 100, 113, 102, 98, 119, 102, 113, 35, 119, 107, 98, 109, 35, 110, 98, 123, 106, 110, 118, 110, 35, 98, 111, 111, 108, 116, 102, 103, 57, 35, 38, 103, 79, 78, 92, 55, 34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A05(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (String str : map2.keySet()) {
            byte[] bArrA07 = A07(map2.get(str));
            if (bArrA07.length > 10485760) {
                throw new IllegalArgumentException(String.format(A01(20, 55, 92), str, Integer.valueOf(bArrA07.length), 10485760));
            }
            map.put(str, bArrA07);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private boolean A06(Map<String, byte[]> map) {
        if (this.A01.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    static {
        A03();
        A04 = new C1249Uj(Collections.emptyMap());
    }

    public C1249Uj(Map<String, byte[]> metadata) {
        this.A01 = Collections.unmodifiableMap(metadata);
    }

    public static C1249Uj A00(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int valueSize = dataInputStream.readInt();
            if (valueSize >= 0) {
                if (A03[5].length() == 7) {
                    throw new RuntimeException();
                }
                A03[5] = "wIzKKnz4WNrtvGk5MZN9OtyZE";
                if (valueSize <= 10485760) {
                    byte[] bArr = new byte[valueSize];
                    dataInputStream.readFully(bArr);
                    map.put(utf, bArr);
                }
            }
            throw new IOException(A01(0, 20, 2) + valueSize);
        }
        return new C1249Uj(map);
    }

    public static Map<String, byte[]> A02(Map<String, byte[]> otherMetadata, HC hc2) {
        HashMap map = new HashMap(otherMetadata);
        A04(map, hc2.A04());
        A05(map, hc2.A05());
        return map;
    }

    public static void A04(HashMap<String, byte[]> metadata, List<String> names) {
        for (int i10 = 0; i10 < i; i10++) {
            metadata.remove(names.get(i10));
        }
    }

    public static byte[] A07(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(A01(75, 5, 69)));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public final C1249Uj A08(HC hc2) {
        Map<String, byte[]> mapA02 = A02(this.A01, hc2);
        if (A06(mapA02)) {
            return this;
        }
        return new C1249Uj(mapA02);
    }

    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A01.size());
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.facebook.ads.redexgen.X.HA
    public final long A5k(String str, long j10) {
        if (this.A01.containsKey(str)) {
            byte[] bytes = this.A01.get(str);
            return ByteBuffer.wrap(bytes).getLong();
        }
        return j10;
    }

    @Override // com.facebook.ads.redexgen.X.HA
    public final String A5m(String str, String str2) {
        if (this.A01.containsKey(str)) {
            return new String(this.A01.get(str), Charset.forName(A01(75, 5, 69)));
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A06(((C1249Uj) obj).A01);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i10 = 0;
            for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
                int iHashCode = entry.getKey().hashCode();
                int result = Arrays.hashCode(entry.getValue());
                i10 += iHashCode ^ result;
            }
            this.A00 = i10;
        }
        int result2 = this.A00;
        return result2;
    }
}
