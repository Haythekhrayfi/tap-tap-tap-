package org.joda.time.tz;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.material.datepicker.UtcDates;
import defpackage.a;
import h0.f;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        public final Recurrence iEndRecurrence;
        public final int iStandardOffset;
        public final Recurrence iStartRecurrence;

        public DSTZone(String str, int i10, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i10;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j10) {
            long next;
            int i10 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j10, i10, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                next = j10;
            }
            try {
                j10 = recurrence2.next(j10, i10, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j10 ? recurrence : recurrence2;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            return getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence);
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j10) {
            return findMatchingRecurrence(j10).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j10) {
            return this.iStandardOffset + findMatchingRecurrence(j10).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j10) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j10) {
            long next;
            int i10 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j10, i10, recurrence2.getSaveMillis());
                if (j10 > 0 && next < 0) {
                    next = j10;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long next2 = recurrence2.next(j10, i10, recurrence.getSaveMillis());
                if (j10 <= 0 || next2 >= 0) {
                    j10 = next2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j10 ? j10 : next;
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j10) {
            long jPrevious;
            long j11 = j10 + 1;
            int i10 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                jPrevious = recurrence.previous(j11, i10, recurrence2.getSaveMillis());
                if (j11 < 0 && jPrevious > 0) {
                    jPrevious = j11;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long jPrevious2 = recurrence2.previous(j11, i10, recurrence.getSaveMillis());
                if (j11 >= 0 || jPrevious2 <= 0) {
                    j11 = jPrevious2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jPrevious <= j11) {
                jPrevious = j11;
            }
            return jPrevious - 1;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    public static final class OfYear {
        public final boolean iAdvance;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final char iMode;
        public final int iMonthOfYear;

        public OfYear(char c10, int i10, int i11, int i12, boolean z10, int i13) {
            if (c10 != 'u' && c10 != 'w' && c10 != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c10);
            }
            this.iMode = c10;
            this.iMonthOfYear = i10;
            this.iDayOfMonth = i11;
            this.iDayOfWeek = i12;
            this.iAdvance = z10;
            this.iMillisOfDay = i13;
        }

        public static OfYear readFrom(DataInput dataInput) throws IOException {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j10) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j10, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j10, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j10) {
            try {
                return setDayOfMonth(chronology, j10);
            } catch (IllegalArgumentException e10) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e10;
                }
                while (!chronology.year().isLeap(j10)) {
                    j10 = chronology.year().add(j10, 1);
                }
                return setDayOfMonth(chronology, j10);
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j10) {
            try {
                return setDayOfMonth(chronology, j10);
            } catch (IllegalArgumentException e10) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e10;
                }
                while (!chronology.year().isLeap(j10)) {
                    j10 = chronology.year().add(j10, -1);
                }
                return setDayOfMonth(chronology, j10);
            }
        }

        private long setDayOfWeek(Chronology chronology, long j10) {
            int i10 = this.iDayOfWeek - chronology.dayOfWeek().get(j10);
            if (i10 == 0) {
                return j10;
            }
            if (this.iAdvance) {
                if (i10 < 0) {
                    i10 += 7;
                }
            } else if (i10 > 0) {
                i10 -= 7;
            }
            return chronology.dayOfWeek().add(j10, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfYear)) {
                return false;
            }
            OfYear ofYear = (OfYear) obj;
            return this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay;
        }

        public long next(long j10, int i10, int i11) {
            char c10 = this.iMode;
            if (c10 == 'w') {
                i10 += i11;
            } else if (c10 != 's') {
                i10 = 0;
            }
            long j11 = i10;
            long j12 = j10 + j11;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j12, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j12) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthNext <= j12) {
                dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthNext, 0), this.iMillisOfDay) - j11;
        }

        public long previous(long j10, int i10, int i11) {
            char c10 = this.iMode;
            if (c10 == 'w') {
                i10 += i11;
            } else if (c10 != 's') {
                i10 = 0;
            }
            long j11 = i10;
            long j12 = j10 + j11;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j12, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j12) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthPrevious >= j12) {
                dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthPrevious, 0), this.iMillisOfDay) - j11;
        }

        public long setInstant(int i10, int i11, int i12) {
            char c10 = this.iMode;
            if (c10 == 'w') {
                i11 += i12;
            } else if (c10 != 's') {
                i11 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i10), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - ((long) i11);
        }

        public String toString() {
            StringBuilder sbA = a.a("[OfYear]\nMode: ");
            sbA.append(this.iMode);
            sbA.append('\n');
            sbA.append("MonthOfYear: ");
            sbA.append(this.iMonthOfYear);
            sbA.append('\n');
            sbA.append("DayOfMonth: ");
            sbA.append(this.iDayOfMonth);
            sbA.append('\n');
            sbA.append("DayOfWeek: ");
            sbA.append(this.iDayOfWeek);
            sbA.append('\n');
            sbA.append("AdvanceDayOfWeek: ");
            sbA.append(this.iAdvance);
            sbA.append('\n');
            sbA.append("MillisOfDay: ");
            return f.a(sbA, this.iMillisOfDay, '\n');
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z10, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalArgumentException();
            }
            long[] jArr = new long[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            String[] strArr = new String[size];
            Transition transition = null;
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Transition transition2 = arrayList.get(i11);
                if (!transition2.isTransitionFrom(transition)) {
                    throw new IllegalArgumentException(str);
                }
                jArr[i11] = transition2.getMillis();
                iArr[i11] = transition2.getWallOffset();
                iArr2[i11] = transition2.getStandardOffset();
                strArr[i11] = transition2.getNameKey();
                i11++;
                transition = transition2;
            }
            String[] strArr2 = new String[5];
            for (String[] strArr3 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                if (strArr3 != null && strArr3.length == 5 && str.equals(strArr3[0])) {
                    strArr2 = strArr3;
                }
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            while (i10 < size - 1) {
                String str2 = strArr[i10];
                int i12 = i10 + 1;
                String str3 = strArr[i12];
                long j10 = iArr[i10];
                long j11 = iArr[i12];
                String[] strArr4 = strArr;
                String[] strArr5 = strArr2;
                long j12 = iArr2[i10];
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j13 = iArr2[i12];
                int i13 = size;
                Period period = new Period(jArr[i10], jArr[i12], PeriodType.yearMonthDay(), instanceUTC);
                if (j10 != j11 && j12 == j13 && str2.equals(str3) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str2.equals(strArr5[2]) && str2.equals(strArr5[4])) {
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Fixing duplicate name key - " + str3);
                        PrintStream printStream = System.out;
                        StringBuilder sbA = a.a("     - ");
                        sbA.append(new DateTime(jArr[i10], instanceUTC));
                        sbA.append(" - ");
                        sbA.append(new DateTime(jArr[i12], instanceUTC));
                        printStream.println(sbA.toString());
                    }
                    if (j10 > j11) {
                        strArr4[i10] = (str2 + "-Summer").intern();
                    } else if (j10 < j11) {
                        strArr4[i12] = (str3 + "-Summer").intern();
                        i10 = i12;
                    }
                }
                i10++;
                strArr2 = strArr5;
                strArr = strArr4;
                iArr = iArr3;
                iArr2 = iArr4;
                size = i13;
            }
            int[] iArr5 = iArr;
            int[] iArr6 = iArr2;
            String[] strArr6 = strArr;
            if (dSTZone == null || !dSTZone.iStartRecurrence.getNameKey().equals(dSTZone.iEndRecurrence.getNameKey())) {
                dSTZone2 = dSTZone;
            } else {
                if (ZoneInfoLogger.verbose()) {
                    PrintStream printStream2 = System.out;
                    StringBuilder sbA2 = a.a("Fixing duplicate recurrent name key - ");
                    sbA2.append(dSTZone.iStartRecurrence.getNameKey());
                    printStream2.println(sbA2.toString());
                }
                dSTZone2 = dSTZone.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence.renameAppend("-Summer"), dSTZone.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence, dSTZone.iEndRecurrence.renameAppend("-Summer"));
            }
            return new PrecalculatedZone(z10 ? str : "", jArr, iArr5, iArr6, strArr6, dSTZone2);
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i10 = 0; i10 < unsignedShort; i10++) {
                strArr[i10] = dataInput.readUTF();
            }
            int i11 = dataInput.readInt();
            long[] jArr = new long[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            String[] strArr2 = new String[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                jArr[i12] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i12] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i12] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i12] = strArr[unsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone == null) {
                    if (dSTZone2 == null) {
                        return true;
                    }
                } else if (dSTZone.equals(dSTZone2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return this.iNameKeys[iBinarySearch];
            }
            int i10 = ~iBinarySearch;
            if (i10 < jArr.length) {
                return i10 > 0 ? this.iNameKeys[i10 - 1] : UtcDates.UTC;
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i10 - 1] : dSTZone.getNameKey(j10);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return this.iWallOffsets[iBinarySearch];
            }
            int i10 = ~iBinarySearch;
            if (i10 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i10 - 1] : dSTZone.getOffset(j10);
            }
            if (i10 > 0) {
                return this.iWallOffsets[i10 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return this.iStandardOffsets[iBinarySearch];
            }
            int i10 = ~iBinarySearch;
            if (i10 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i10 - 1] : dSTZone.getStandardOffset(j10);
            }
            if (i10 > 0) {
                return this.iStandardOffsets[i10 - 1];
            }
            return 0;
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d10 = 0.0d;
            int i10 = 0;
            for (int i11 = 1; i11 < jArr.length; i11++) {
                long j10 = jArr[i11] - jArr[i11 - 1];
                if (j10 < 63158400000L) {
                    d10 += j10;
                    i10++;
                }
            }
            return i10 > 0 && (d10 / ((double) i10)) / 8.64E7d >= 25.0d;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            int i10 = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i10 < jArr.length) {
                return jArr[i10];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j10;
            }
            long j11 = jArr[jArr.length - 1];
            if (j10 < j11) {
                j10 = j11;
            }
            return dSTZone.nextTransition(j10);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return j10 > Long.MIN_VALUE ? j10 - 1 : j10;
            }
            int i10 = ~iBinarySearch;
            if (i10 < jArr.length) {
                if (i10 > 0) {
                    long j11 = jArr[i10 - 1];
                    if (j11 > Long.MIN_VALUE) {
                        return j11 - 1;
                    }
                }
                return j10;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long jPreviousTransition = dSTZone.previousTransition(j10);
                if (jPreviousTransition < j10) {
                    return jPreviousTransition;
                }
            }
            long j12 = jArr[i10 - 1];
            return j12 > Long.MIN_VALUE ? j12 - 1 : j10;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < length; i10++) {
                hashSet.add(this.iNameKeys[i10]);
            }
            int size = hashSet.size();
            if (size > 65535) {
                throw new UnsupportedOperationException("String pool is too large");
            }
            String[] strArr = new String[size];
            Iterator it = hashSet.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                strArr[i11] = (String) it.next();
                i11++;
            }
            dataOutput.writeShort(size);
            for (int i12 = 0; i12 < size; i12++) {
                dataOutput.writeUTF(strArr[i12]);
            }
            dataOutput.writeInt(length);
            for (int i13 = 0; i13 < length; i13++) {
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i13]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i13]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i13]);
                String str = this.iNameKeys[i13];
                for (int i14 = 0; i14 < size; i14++) {
                    if (strArr[i14].equals(str)) {
                        if (size < 256) {
                            dataOutput.writeByte(i14);
                            break;
                        } else {
                            dataOutput.writeShort(i14);
                            break;
                        }
                    }
                }
            }
            dataOutput.writeBoolean(this.iTailZone != null);
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                dSTZone.writeTo(dataOutput);
            }
        }
    }

    public static final class Recurrence {
        public final String iNameKey;
        public final OfYear iOfYear;
        public final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i10) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i10;
        }

        public static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            return this.iSaveMillis == recurrence.iSaveMillis && this.iNameKey.equals(recurrence.iNameKey) && this.iOfYear.equals(recurrence.iOfYear);
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public long next(long j10, int i10, int i11) {
            return this.iOfYear.next(j10, i10, i11);
        }

        public long previous(long j10, int i10, int i11) {
            return this.iOfYear.previous(j10, i10, i11);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public String toString() {
            return this.iOfYear + " named " + this.iNameKey + " at " + this.iSaveMillis;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    public static final class Rule {
        public final int iFromYear;
        public final Recurrence iRecurrence;
        public final int iToYear;

        public Rule(Recurrence recurrence, int i10, int i11) {
            this.iRecurrence = recurrence;
            this.iFromYear = i10;
            this.iToYear = i11;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j10, int i10, int i11) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i12 = i10 + i11;
            long next = this.iRecurrence.next(((j10 > Long.MIN_VALUE ? 1 : (j10 == Long.MIN_VALUE ? 0 : -1)) == 0 ? Integer.MIN_VALUE : instanceUTC.year().get(((long) i12) + j10)) < this.iFromYear ? (instanceUTC.year().set(0L, this.iFromYear) - ((long) i12)) - 1 : j10, i10, i11);
            return (next <= j10 || instanceUTC.year().get(((long) i12) + next) <= this.iToYear) ? next : j10;
        }

        public String toString() {
            return this.iFromYear + " to " + this.iToYear + " using " + this.iRecurrence;
        }
    }

    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }

        public void addRule(Rule rule) {
            if (this.iRules.contains(rule)) {
                return;
            }
            this.iRules.add(rule);
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() != 2) {
                return null;
            }
            Rule rule = this.iRules.get(0);
            Rule rule2 = this.iRules.get(1);
            if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
            }
            return null;
        }

        public Transition firstTransition(long j10) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i10 = this.iStandardOffset;
                return new Transition(j10, str, i10 + this.iInitialSaveMillis, i10);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long j11 = Long.MIN_VALUE;
            int saveMillis = 0;
            Transition transition = null;
            while (true) {
                Transition transitionNextTransition = nextTransition(j11, saveMillis);
                if (transitionNextTransition == null) {
                    break;
                }
                long millis = transitionNextTransition.getMillis();
                if (millis == j10) {
                    transition = new Transition(j10, transitionNextTransition);
                    break;
                }
                if (millis > j10) {
                    if (transition == null) {
                        for (Rule rule : arrayList) {
                            if (rule.getSaveMillis() == 0) {
                                transition = new Transition(j10, rule, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition != null) {
                        break;
                    }
                    String nameKey = transitionNextTransition.getNameKey();
                    int i11 = this.iStandardOffset;
                    transition = new Transition(j10, nameKey, i11, i11);
                    break;
                }
                transition = new Transition(j10, transitionNextTransition);
                saveMillis = transitionNextTransition.getSaveMillis();
                j11 = millis;
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i10) {
            int i11 = this.iUpperYear;
            return i11 == Integer.MAX_VALUE ? RecyclerView.FOREVER_NS : this.iUpperOfYear.setInstant(i11, this.iStandardOffset, i10);
        }

        public Transition nextTransition(long j10, int i10) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it = this.iRules.iterator();
            long j11 = RecyclerView.FOREVER_NS;
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                long next2 = next.next(j10, this.iStandardOffset, i10);
                if (next2 <= j10) {
                    it.remove();
                } else if (next2 <= j11) {
                    rule = next;
                    j11 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j11) >= YEAR_LIMIT) {
                return null;
            }
            int i11 = this.iUpperYear;
            if (i11 >= Integer.MAX_VALUE || j11 < this.iUpperOfYear.setInstant(i11, this.iStandardOffset, i10)) {
                return new Transition(j11, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i10) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i10;
        }

        public void setStandardOffset(int i10) {
            this.iStandardOffset = i10;
        }

        public void setUpperLimit(int i10, OfYear ofYear) {
            this.iUpperYear = i10;
            this.iUpperOfYear = ofYear;
        }

        public String toString() {
            return this.iInitialNameKey + " initial: " + this.iInitialSaveMillis + " std: " + this.iStandardOffset + " upper: " + this.iUpperYear + " " + this.iUpperOfYear + " " + this.iRules;
        }
    }

    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j10, String str, int i10, int i11) {
            this.iMillis = j10;
            this.iNameKey = str;
            this.iWallOffset = i10;
            this.iStandardOffset = i11;
        }

        public Transition(long j10, Rule rule, int i10) {
            this.iMillis = j10;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i10;
            this.iStandardOffset = i10;
        }

        public Transition(long j10, Transition transition) {
            this.iMillis = j10;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            if (transition == null) {
                return true;
            }
            return this.iMillis > transition.iMillis && !(this.iWallOffset == transition.iWallOffset && this.iStandardOffset == transition.iStandardOffset && this.iNameKey.equals(transition.iNameKey));
        }

        public String toString() {
            return new DateTime(this.iMillis, DateTimeZone.UTC) + " " + this.iStandardOffset + " " + this.iWallOffset;
        }

        public Transition withMillis(long j10) {
            return new Transition(j10, this.iNameKey, this.iWallOffset, this.iStandardOffset);
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i10 = size - 1;
        Transition transition2 = arrayList.get(i10);
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (transition.getMillis() + ((long) transition2.getWallOffset()) == transition2.getMillis() + ((long) (size >= 2 ? arrayList.get(size - 2).getWallOffset() : 0))) {
            return addTransition(arrayList, transition.withMillis(arrayList.remove(i10).getMillis()));
        }
        arrayList.add(transition);
        return true;
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i10, int i11) {
        return (UtcDates.UTC.equals(str) && str.equals(str2) && i10 == 0 && i11 == 0) ? DateTimeZone.UTC : new FixedDateTimeZone(str, str2, i10, i11);
    }

    private RuleSet getLastRuleSet() {
        if (this.iRuleSets.size() == 0) {
            addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        ArrayList<RuleSet> arrayList = this.iRuleSets;
        return arrayList.get(arrayList.size() - 1);
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return PrecalculatedZone.readFrom(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        return inputStream instanceof DataInput ? readFrom((DataInput) inputStream, str) : readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    public static long readMillis(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j10;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i10 = unsignedByte2 >> 6;
        if (i10 == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j10 = 60000;
        } else if (i10 == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j10 = 1000;
        } else {
            if (i10 == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j10 = ComponentTracker.DEFAULT_TIMEOUT;
        }
        return unsignedByte * j10;
    }

    public static void writeMillis(DataOutput dataOutput, long j10) throws IOException {
        if (j10 % ComponentTracker.DEFAULT_TIMEOUT == 0) {
            long j11 = j10 / ComponentTracker.DEFAULT_TIMEOUT;
            if (((j11 << 58) >> 58) == j11) {
                dataOutput.writeByte((int) (j11 & 63));
                return;
            }
        }
        if (j10 % 60000 == 0) {
            long j12 = j10 / 60000;
            if (((j12 << 34) >> 34) == j12) {
                dataOutput.writeInt(1073741824 | ((int) (j12 & 1073741823)));
                return;
            }
        }
        if (j10 % 1000 == 0) {
            long j13 = j10 / 1000;
            if (((j13 << 26) >> 26) == j13) {
                dataOutput.writeByte(((int) ((j13 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) ((-1) & j13));
                return;
            }
        }
        dataOutput.writeByte(j10 < 0 ? 255 : 192);
        dataOutput.writeLong(j10);
    }

    public DateTimeZoneBuilder addCutover(int i10, char c10, int i11, int i12, int i13, boolean z10, int i14) {
        if (this.iRuleSets.size() > 0) {
            OfYear ofYear = new OfYear(c10, i11, i12, i13, z10, i14);
            ArrayList<RuleSet> arrayList = this.iRuleSets;
            arrayList.get(arrayList.size() - 1).setUpperLimit(i10, ofYear);
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i10, int i11, int i12, char c10, int i13, int i14, int i15, boolean z10, int i16) {
        if (i11 <= i12) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c10, i13, i14, i15, z10, i16), str, i10), i11, i12));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i10) {
        getLastRuleSet().setFixedSavings(str, i10);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i10) {
        getLastRuleSet().setStandardOffset(i10);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z10) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Transition> arrayList = new ArrayList<>();
        DSTZone dSTZoneBuildTailZone = null;
        long upperLimit = Long.MIN_VALUE;
        int size = this.iRuleSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            RuleSet ruleSet = this.iRuleSets.get(i10);
            Transition transitionFirstTransition = ruleSet.firstTransition(upperLimit);
            if (transitionFirstTransition != null) {
                addTransition(arrayList, transitionFirstTransition);
                long millis = transitionFirstTransition.getMillis();
                int saveMillis = transitionFirstTransition.getSaveMillis();
                RuleSet ruleSet2 = new RuleSet(ruleSet);
                while (true) {
                    Transition transitionNextTransition = ruleSet2.nextTransition(millis, saveMillis);
                    if (transitionNextTransition == null || (addTransition(arrayList, transitionNextTransition) && dSTZoneBuildTailZone != null)) {
                        break;
                    }
                    long millis2 = transitionNextTransition.getMillis();
                    int saveMillis2 = transitionNextTransition.getSaveMillis();
                    if (dSTZoneBuildTailZone == null && i10 == size - 1) {
                        dSTZoneBuildTailZone = ruleSet2.buildTailZone(str);
                    }
                    saveMillis = saveMillis2;
                    millis = millis2;
                }
                upperLimit = ruleSet2.getUpperLimit(saveMillis);
            }
        }
        if (arrayList.size() == 0) {
            return dSTZoneBuildTailZone != null ? dSTZoneBuildTailZone : buildFixedZone(str, UtcDates.UTC, 0, 0);
        }
        if (arrayList.size() == 1 && dSTZoneBuildTailZone == null) {
            Transition transition = arrayList.get(0);
            return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
        }
        PrecalculatedZone precalculatedZoneCreate = PrecalculatedZone.create(str, z10, arrayList, dSTZoneBuildTailZone);
        return precalculatedZoneCreate.isCachable() ? CachedDateTimeZone.forZone(precalculatedZoneCreate) : precalculatedZoneCreate;
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }
}
