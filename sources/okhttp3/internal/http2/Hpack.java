package okhttp3.internal.http2;

import com.developer.filepicker.model.DialogConfigs;
import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kc.i;
import kc.t;
import okhttp3.internal.Util;
import qd.a0;
import qd.c;
import qd.f;
import qd.g;
import qd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<g, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final f source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(a0 a0Var, int i10) {
            this(a0Var, i10, 0, 4, null);
            j0.i(a0Var, "source");
        }

        public Reader(a0 a0Var, int i10, int i11) {
            j0.i(a0Var, "source");
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.headerList = new ArrayList();
            this.source = o.c(a0Var);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Reader(a0 a0Var, int i10, int i11, int i12, vc.g gVar) {
            this(a0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }

        private final void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private final void clearDynamicTable() {
            i.i(this.dynamicTable, null, 0, 0, 6);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i10) {
            return this.nextHeaderIndex + 1 + i10;
        }

        private final int evictToRecoverBytes(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i11 = this.nextHeaderIndex;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    j0.f(header);
                    int i13 = header.hpackSize;
                    i10 -= i13;
                    this.dynamicTableByteCount -= i13;
                    this.headerCount--;
                    i12++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.headerCount);
                this.nextHeaderIndex += i12;
            }
            return i12;
        }

        private final g getName(int i10) throws IOException {
            Header header;
            if (!isStaticHeader(i10)) {
                int iDynamicTableIndex = dynamicTableIndex(i10 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                if (iDynamicTableIndex >= 0) {
                    Header[] headerArr = this.dynamicTable;
                    if (iDynamicTableIndex < headerArr.length) {
                        header = headerArr[iDynamicTableIndex];
                        j0.f(header);
                    }
                }
                throw new IOException(j0.p("Header index too large ", Integer.valueOf(i10 + 1)));
            }
            header = Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i10];
            return header.name;
        }

        private final void insertIntoDynamicTable(int i10, Header header) {
            this.headerList.add(header);
            int i11 = header.hpackSize;
            if (i10 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i10)];
                j0.f(header2);
                i11 -= header2.hpackSize;
            }
            int i12 = this.maxDynamicTableByteCount;
            if (i11 > i12) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i11) - i12);
            if (i10 == -1) {
                int i13 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i13 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i14 = this.nextHeaderIndex;
                this.nextHeaderIndex = i14 - 1;
                this.dynamicTable[i14] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i10) + iEvictToRecoverBytes + i10] = header;
            }
            this.dynamicTableByteCount += i11;
        }

        private final boolean isStaticHeader(int i10) {
            return i10 >= 0 && i10 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i10) throws IOException {
            if (isStaticHeader(i10)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i10]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i10 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    j0.f(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException(j0.p("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i10) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i10), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i10) throws IOException {
            this.headerList.add(new Header(getName(i10), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listH = t.H(this.headerList);
            this.headerList.clear();
            return listH;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final g readByteString() throws IOException {
            int i10 = readByte();
            boolean z10 = (i10 & 128) == 128;
            long j10 = readInt(i10, 127);
            if (!z10) {
                return this.source.d(j10);
            }
            c cVar = new c();
            Huffman.INSTANCE.decode(this.source, j10, cVar);
            return cVar.I();
        }

        public final void readHeaders() throws IOException {
            while (!this.source.y()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i10 = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i10;
                    if (i10 < 0 || i10 > this.headerTableSizeSetting) {
                        throw new IOException(j0.p("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = readByte();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final c out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i10, c cVar) {
            this(i10, false, cVar, 2, null);
            j0.i(cVar, "out");
        }

        public Writer(int i10, boolean z10, c cVar) {
            j0.i(cVar, "out");
            this.headerTableSizeSetting = i10;
            this.useCompression = z10;
            this.out = cVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i10;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i10, boolean z10, c cVar, int i11, vc.g gVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, cVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(c cVar) {
            this(0, false, cVar, 3, null);
            j0.i(cVar, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private final void clearDynamicTable() {
            i.i(this.dynamicTable, null, 0, 0, 6);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i11 = this.nextHeaderIndex;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    j0.f(header);
                    i10 -= header.hpackSize;
                    int i13 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    j0.f(header2);
                    this.dynamicTableByteCount = i13 - header2.hpackSize;
                    this.headerCount--;
                    i12++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i14 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.nextHeaderIndex += i12;
            }
            return i12;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i10 = header.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void resizeHeaderTable(int i10) {
            this.headerTableSizeSetting = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.maxDynamicTableByteCount;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        public final void writeByteString(g gVar) throws IOException {
            int iC;
            int i10;
            j0.i(gVar, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(gVar) < gVar.c()) {
                    c cVar = new c();
                    huffman.encode(gVar, cVar);
                    gVar = cVar.I();
                    iC = gVar.c();
                    i10 = 128;
                } else {
                    iC = gVar.c();
                    i10 = 0;
                }
            } else {
                iC = gVar.c();
                i10 = 0;
            }
            writeInt(iC, 127, i10);
            this.out.K(gVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0081  */
        public final void writeHeaders(List<Header> list) throws IOException {
            int length;
            int length2;
            j0.i(list, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i10 = this.smallestHeaderTableSizeSetting;
                if (i10 < this.maxDynamicTableByteCount) {
                    writeInt(i10, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Header header = list.get(i11);
                g gVarK = header.name.k();
                g gVar = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(gVarK);
                if (num != null) {
                    length2 = num.intValue() + 1;
                    if (!(2 <= length2 && length2 < 8)) {
                        length = length2;
                        length2 = -1;
                    } else if (j0.d(hpack.getSTATIC_HEADER_TABLE()[length2 - 1].value, gVar)) {
                        length = length2;
                    } else if (j0.d(hpack.getSTATIC_HEADER_TABLE()[length2].value, gVar)) {
                        length2++;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i13 = this.nextHeaderIndex + 1;
                    int length3 = this.dynamicTable.length;
                    while (i13 < length3) {
                        int i14 = i13 + 1;
                        Header header2 = this.dynamicTable[i13];
                        j0.f(header2);
                        if (j0.d(header2.name, gVarK)) {
                            Header header3 = this.dynamicTable[i13];
                            j0.f(header3);
                            if (j0.d(header3.value, gVar)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i13 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i13 - this.nextHeaderIndex);
                            }
                        }
                        i13 = i14;
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else {
                    if (length == -1) {
                        this.out.R(64);
                        writeByteString(gVarK);
                    } else if (!gVarK.j(Header.PSEUDO_PREFIX) || j0.d(Header.TARGET_AUTHORITY, gVarK)) {
                        writeInt(length, 63, 64);
                    } else {
                        writeInt(length, 15, 0);
                        writeByteString(gVar);
                    }
                    writeByteString(gVar);
                    insertIntoDynamicTable(header);
                }
                i11 = i12;
            }
        }

        public final void writeInt(int i10, int i11, int i12) {
            int i13;
            c cVar;
            if (i10 < i11) {
                cVar = this.out;
                i13 = i10 | i12;
            } else {
                this.out.R(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.out.R(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                cVar = this.out;
            }
            cVar.R(i13);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        g gVar = Header.TARGET_METHOD;
        g gVar2 = Header.TARGET_PATH;
        g gVar3 = Header.TARGET_SCHEME;
        g gVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(gVar, "GET"), new Header(gVar, "POST"), new Header(gVar2, DialogConfigs.DIRECTORY_SEPERATOR), new Header(gVar2, "/index.html"), new Header(gVar3, "http"), new Header(gVar3, "https"), new Header(gVar4, "200"), new Header(gVar4, "204"), new Header(gVar4, "206"), new Header(gVar4, "304"), new Header(gVar4, "400"), new Header(gVar4, "404"), new Header(gVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<g, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i10].name)) {
                linkedHashMap.put(headerArr2[i10].name, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<g, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        j0.h(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final g checkLowercase(g gVar) throws IOException {
        j0.i(gVar, "name");
        int iC = gVar.c();
        int i10 = 0;
        while (i10 < iC) {
            int i11 = i10 + 1;
            byte bF = gVar.f(i10);
            if (65 <= bF && bF <= 90) {
                throw new IOException(j0.p("PROTOCOL_ERROR response malformed: mixed case name: ", gVar.l()));
            }
            i10 = i11;
        }
        return gVar;
    }

    public final Map<g, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
