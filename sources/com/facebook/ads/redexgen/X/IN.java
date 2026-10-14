package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ch.qos.logback.core.util.FileSize;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IN {
    public static IN A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0R(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 46);
            i13++;
        }
    }

    public static void A0c() {
        A02 = new byte[]{108, 73, 107, 100, 105, 111, 102, 82, 126, Ascii.DEL, 101, 120, Ascii.DEL, 100, 116, 3, 47, 46, 52, 41, 46, 53, 37, Ascii.DEL, 106, 92, 70, 19, 68, 90, 95, 95, 19, 81, 86, 19, 71, 82, 88, 86, 93, 19, 71, 92, 19, 82, 93, 92, 71, 91, 86, 65, 19, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, Ascii.GS, 6, 17, Ascii.EM, 8, 112, 109, 112, 109, 0, 45, 58, 50, 35, 91, 71, 91, 71, 70, 70, 70, 43, 123, 108, 100, 117, 125, 12, 10, 121, 123, 123, 113, 124, 125, 118, 108, 121, 116, 71, 123, 116, 113, 123, 115, 107, 71, 123, 119, 118, 126, 113, Ascii.DEL, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, Ascii.FS, 32, 47, 42, 32, 40, 48, Ascii.FS, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, Ascii.FS, 48, 55, 38, 51, Ascii.FS, 32, 34, 45, 32, 38, 47, Ascii.FS, 33, 54, 55, 55, 44, 45, Ascii.FS, 55, 38, 59, 55, Ascii.EM, Ascii.ESC, Ascii.ESC, 17, Ascii.FS, Ascii.GS, 22, 12, Ascii.EM, 20, 39, Ascii.ESC, 20, 17, Ascii.ESC, 19, 11, 39, Ascii.ESC, 23, 22, Ascii.RS, 17, Ascii.US, 86, 12, 15, 23, 39, 11, 12, Ascii.GS, 8, 39, Ascii.ESC, 23, 22, Ascii.RS, 17, 10, 21, 39, Ascii.SUB, 13, 12, 12, 23, 22, 39, 12, Ascii.GS, 0, 12, 3, 1, 1, 11, 6, 7, 12, 22, 3, 14, 61, 1, 14, 11, 1, 9, 17, 61, 1, 13, 12, 4, 11, 5, 76, 22, 21, 13, 61, 17, 22, 7, 18, 61, 1, 13, 12, 4, 11, 16, 15, 3, 22, 11, 13, 12, 68, 70, 70, 76, 65, 64, 75, 81, 68, 73, 122, 70, 73, 76, 70, 78, 86, 122, 70, 74, 75, 67, 76, 66, 11, 81, 82, 74, 122, 86, 81, 64, 85, 122, 70, 74, 75, 67, 76, 87, 72, 68, 81, 76, 74, 75, 122, 71, 74, 65, 92, Ascii.RS, Ascii.FS, Ascii.FS, 22, Ascii.ESC, Ascii.SUB, 17, 11, Ascii.RS, 19, 32, Ascii.FS, 19, 22, Ascii.FS, 20, 12, 32, Ascii.FS, 16, 17, Ascii.EM, 22, Ascii.CAN, 81, 11, 8, 16, 32, 12, 11, Ascii.SUB, 15, 32, Ascii.FS, 16, 17, Ascii.EM, 22, 13, 18, Ascii.RS, 11, 22, 16, 17, 32, 11, 22, 11, 19, Ascii.SUB, 100, 97, 107, 114, 90, 100, 102, 102, 96, 117, 113, 100, 103, 105, 96, 90, 118, 113, 100, 102, 110, 113, 119, 100, 102, 96, 90, 102, 106, 107, 113, 96, 125, 113, 90, 99, 108, 105, 113, 96, 119, 90, 118, 108, Ascii.DEL, 96, 23, 18, Ascii.CAN, 1, 41, 23, 21, 21, 19, 6, 2, 23, 20, Ascii.SUB, 19, 41, 5, 2, 23, 21, Ascii.GS, 2, 4, 23, 21, 19, 41, Ascii.SUB, 19, Ascii.CAN, 17, 2, Ascii.RS, 63, 58, 48, 41, 1, 63, 58, 1, 58, 59, 42, 63, 55, 50, 45, 1, 61, 50, 55, 61, 53, 63, 60, 50, 59, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 121, 116, 116, 119, 111, 71, 116, 119, 121, 124, 71, 124, 109, 106, 113, 118, Ascii.DEL, 71, 107, 112, 119, 111, 113, 118, Ascii.DEL, Ascii.US, Ascii.SUB, 16, 9, 33, Ascii.US, 16, Ascii.SUB, 12, 17, 23, Ascii.SUB, 33, Ascii.US, 16, 12, 33, Ascii.SUB, Ascii.ESC, 10, Ascii.ESC, Ascii.GS, 10, 17, 12, 33, Ascii.ESC, 16, Ascii.US, Ascii.FS, 18, Ascii.ESC, 46, 43, 33, 56, 16, 46, 33, 43, 61, 32, 38, 43, 16, 46, 33, 61, 16, 43, 42, 59, 42, 44, 59, 32, 61, 16, 59, 38, 34, 42, 32, 58, 59, 16, 34, 60, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 61, 62, 49, 49, 58, 45, 0, 58, 39, 43, 45, 62, 0, 55, 54, 49, 43, 44, 0, 57, 54, 39, 0, 58, 49, 62, 61, 51, 58, 59, 112, 117, Ascii.DEL, 102, 78, 112, Ascii.DEL, 117, 99, 126, 120, 117, 78, 115, 125, 112, 114, 122, 125, 120, 98, 101, 116, 117, 78, 120, Ascii.DEL, 101, 116, Ascii.DEL, 101, 78, 100, 99, 125, 78, 97, 99, 116, 119, 120, 105, 116, 98, 33, 36, 46, 55, Ascii.US, 33, 46, 36, 50, 47, 41, 36, Ascii.US, 34, 44, 47, 35, 43, Ascii.US, 53, 46, 51, 33, 38, 37, Ascii.US, 48, 44, 33, 57, 33, 34, 44, 37, Ascii.US, 39, 33, 45, 37, 51, Ascii.US, 35, 33, 35, 40, 37, 5, 0, 10, 19, 59, 5, 10, 0, 22, 11, 13, 0, 59, 6, Ascii.GS, 20, 5, 23, 23, 59, 20, 5, 7, 15, 5, 3, 1, 59, 0, 1, 16, 1, 7, 16, 13, 11, 10, 59, 2, 11, 22, 59, 0, 1, 1, 20, 8, 13, 10, 15, 23, 115, 118, 124, 101, 77, 115, 124, 118, 96, 125, 123, 118, 77, 113, 115, 113, 122, 119, 77, Ascii.DEL, 125, 118, 103, 126, 119, 77, Ascii.DEL, 115, 106, 77, 97, 123, 104, 119, Ascii.FS, Ascii.EM, 19, 10, 34, Ascii.FS, 19, Ascii.EM, 15, 18, 20, Ascii.EM, 34, Ascii.RS, Ascii.FS, Ascii.RS, 21, Ascii.CAN, 34, 16, 18, Ascii.EM, 8, 17, Ascii.CAN, 34, 15, Ascii.CAN, 9, 15, 4, 34, 17, 20, 16, 20, 9, 69, 64, 74, 83, 123, 69, 74, 64, 86, 75, 77, 64, 123, 71, 69, 86, 75, 81, 87, 65, 72, 123, 83, 76, 77, 80, 65, 123, 77, 74, 80, 65, 86, 87, 80, 77, 80, 77, 69, 72, 97, 100, 110, 119, 95, 97, 110, 100, 114, 111, 105, 100, 95, 99, 111, 109, 112, 114, 101, 115, 115, 95, 105, 109, 97, 103, 101, 115, 95, 100, 117, 114, 105, 110, 103, 95, 100, 111, 119, 110, 108, 111, 97, 100, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 66, 67, 64, 71, 83, 74, 82, 121, 71, 85, 85, 67, 82, 121, 86, 84, 67, 74, 73, 71, 66, 121, 85, 79, 92, 67, 121, 68, 95, 82, 67, 85, 126, 123, 113, 104, 64, 126, 113, 123, 109, 112, 118, 123, 64, 123, 118, 108, 126, 125, 115, 122, 64, 111, 115, 126, 102, 126, 125, 115, 122, 64, 111, 109, 122, 124, 126, 
        124, 119, 122, 125, 120, 114, 107, 67, 125, 114, 120, 110, 115, 117, 120, 67, 120, 115, 67, 114, 115, 104, 67, 105, 111, 121, 67, 111, 104, 125, 104, 121, 67, 116, 125, 114, 120, 112, 121, 110, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 51, 56, 55, 52, 58, 51, 9, 56, 55, 34, 63, 32, 51, 9, 48, 35, 56, 56, 51, 58, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 84, 73, 94, 110, 65, 93, 80, 72, 84, 67, 110, 82, 80, 82, 89, 84, 110, 92, 80, 73, 110, 66, 88, 75, 84, 12, 9, 3, Ascii.SUB, 50, 12, 3, 9, Ascii.US, 2, 4, 9, 50, 11, 12, 4, 1, 50, 12, 9, 50, 1, 2, 12, 9, 50, 2, 3, 50, 9, 4, Ascii.RS, 6, 50, 8, Ascii.US, Ascii.US, 2, Ascii.US, Ascii.RS, 120, 125, 119, 110, 70, 120, 119, 125, 107, 118, 112, 125, 70, Ascii.DEL, 120, 112, 117, 70, 118, 119, 70, 110, 124, 123, 111, 112, 124, 110, 70, 124, 107, 107, 118, 107, 106, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 109, 100, 121, 104, 110, 84, 99, 106, 121, 111, 124, 106, 121, 110, 84, 106, 104, 104, 110, 103, 110, 121, 106, Ascii.DEL, 98, 100, 101, 10, 15, 5, Ascii.FS, 52, 10, 5, 15, Ascii.EM, 4, 2, 15, 52, 3, 2, 15, 14, 52, Ascii.GS, 2, 15, 14, 4, Ascii.ESC, Ascii.EM, 4, 12, Ascii.EM, 14, Ascii.CAN, Ascii.CAN, 52, 10, 5, 2, 6, 10, Ascii.US, 2, 4, 5, 21, 16, Ascii.SUB, 3, 43, 21, Ascii.SUB, 16, 6, Ascii.ESC, Ascii.GS, 16, 43, Ascii.GS, Ascii.EM, 21, 19, 17, 43, 23, 21, 23, Ascii.FS, 17, 43, 7, 0, Ascii.ESC, 6, 17, 43, 22, 13, 0, 17, 43, 23, Ascii.ESC, 1, Ascii.SUB, 0, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 98, 101, Ascii.DEL, 110, 101, Ascii.DEL, 84, 101, 100, 84, 101, 110, 124, 84, Ascii.DEL, 106, 120, 96, 43, 46, 36, 61, 21, 43, 36, 46, 56, 37, 35, 46, 21, 39, 47, 39, 37, 56, 51, 21, 37, 58, 62, 71, 66, 72, 81, 121, 71, 72, 66, 84, 73, 79, 66, 121, 75, 84, 69, 121, 79, 75, 86, 84, 67, 85, 85, 79, 73, 72, 121, 64, 73, 84, 121, 72, 71, 82, 79, 80, 67, 121, 80, 79, 66, 67, 73, 121, 71, 66, 85, 121, 80, 20, 121, 124, 118, 111, 71, 121, 118, 124, 106, 119, 113, 124, 71, 118, 121, 108, 113, 110, 125, 71, 123, 121, 106, 119, 109, 107, 125, 116, 71, 125, 96, 108, 125, 118, 107, 113, 119, 118, 71, 110, 121, 106, 113, 121, 118, 108, 103, 98, 104, 113, 89, 103, 104, 98, 116, 105, 111, 98, 89, 104, 103, 114, 111, 112, 99, 89, 104, 99, 113, 89, 101, 103, 116, 105, 115, 117, 99, 106, 89, 98, 99, 117, 111, 97, 104, 124, 121, 115, 106, 66, 124, 115, 121, 111, 114, 116, 121, 66, 115, 120, 105, 106, 114, 111, 118, 66, 121, 120, 123, 124, 104, 113, 105, 66, 126, 114, 115, 115, 120, 126, 105, 116, 114, 115, 66, 105, 116, 112, 120, 114, 104, 105, 66, 112, 110, 56, 61, 55, 46, 6, 56, 55, 61, 43, 54, 48, 61, 6, 55, 60, 45, 46, 54, 43, 50, 6, 61, 60, 63, 56, 44, 53, 45, 6, 43, 60, 56, 61, 6, 45, 48, 52, 60, 54, 44, 45, 6, 52, 42, 86, 83, 89, 64, 104, 86, 89, 83, 69, 88, 94, 83, 104, 89, 82, 67, 64, 88, 69, 92, 104, 83, 82, 81, 86, 66, 91, 67, 104, 69, 82, 67, 69, 94, 82, 68, 104, 89, 66, 90, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 84, 95, 78, 77, 85, 72, 81, 101, 94, 95, 92, 91, 79, 86, 78, 101, 78, 82, 72, 85, 78, 78, 86, 95, 101, 78, 83, 87, 95, 85, 79, 78, 101, 87, 73, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 59, 48, 33, 34, 58, 39, 62, 10, 49, 48, 51, 52, 32, 57, 33, 10, 33, 60, 56, 48, 58, 32, 33, 10, 56, 38, 14, 11, 1, Ascii.CAN, 48, 14, 1, 11, Ascii.GS, 0, 6, 11, 48, 0, Ascii.ESC, Ascii.FS, 3, 48, 10, 1, 14, 13, 3, 10, 11, 109, 104, 98, 123, 83, 109, 98, 104, 126, 99, 101, 104, 83, 126, 105, 97, 99, 122, 105, 83, 125, 121, 105, 126, 117, 83, 124, 109, 126, 120, 83, 106, 126, 99, 97, 83, 111, 109, 111, 100, 105, 83, 103, 105, 117, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 41, 62, 43, 52, 41, 47, 4, 43, 41, 62, 40, 62, 53, 47, 58, 47, 50, 52, 53, 4, 62, 41, 41, 52, 41, 4, 44, 51, 62, 53, 4, 53, 52, 4, 50, 54, 43, 41, 62, 40, 40, 50, 52, 53, 35, 38, 44, 53, Ascii.GS, 35, 44, 38, 48, 45, 43, 38, Ascii.GS, 48, 39, 50, 45, 48, 54, Ascii.GS, 50, 48, 39, 49, 39, 44, 54, 35, 54, 43, 45, 44, Ascii.GS, 39, 48, 48, 45, 48, 49, Ascii.GS, 43, 44, 49, 54, 39, 35, 38, Ascii.GS, 45, 36, Ascii.GS, 43, 44, 54, 39, 48, 44, 35, 46, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 73, 82, 85, 79, 86, 94, 101, 88, 86, 85, 89, 81, 101, 73, 67, 84, 89, 101, 85, 84, 101, 88, 91, 89, 81, 93, 72, 85, 79, 84, 94, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 63, 36, 35, 57, 32, 40, 19, 36, 37, 40, 41, 19, 32, 35, 45, 40, 41, 62, 7, 2, 8, 17, 57, 7, 8, 2, 20, 9, 15, 2, 57, 21, 14, 9, 19, 10, 2, 57, 
        15, 8, 15, 18, 57, 19, 8, 21, 13, 15, 22, 22, 7, 4, 10, 3, 57, 21, 3, 5, 9, 8, 2, 21, 57, 5, 9, 11, 22, 10, 3, 18, 3, 41, 44, 38, 63, 23, 41, 38, 44, 58, 39, 33, 44, 23, 59, 32, 39, 61, 36, 44, 23, 36, 41, 61, 38, 43, 32, 23, 56, 36, 41, 49, 23, 59, 60, 39, 58, 45, 23, 33, 38, 23, 39, 62, 45, 58, 36, 41, 49, 114, 119, 125, 100, 76, 114, 125, 119, 97, 124, 122, 119, 76, 96, 123, 124, 102, Ascii.DEL, 119, 76, 97, 118, 96, 118, 103, 76, 117, 124, 112, 102, 96, 76, 124, 125, 76, 125, 114, 103, 122, 101, 118, 76, 97, 118, 99, 124, 97, 103, 122, 125, 116, 122, Ascii.DEL, 117, 108, 68, 122, 117, Ascii.DEL, 105, 116, 114, Ascii.DEL, 68, 110, 121, 109, 105, 120, 21, 16, Ascii.SUB, 3, 43, 21, Ascii.SUB, 16, 6, Ascii.ESC, Ascii.GS, 16, 43, 1, 7, 17, 43, 23, 21, 23, Ascii.FS, 17, 43, Ascii.EM, Ascii.ESC, 16, 1, Ascii.CAN, 17, 43, 18, Ascii.ESC, 6, 43, Ascii.GS, Ascii.EM, 21, 19, 17, 7, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 79, 73, 95, 101, 73, 78, 95, 91, 87, 83, 84, 93, 101, 83, 87, 91, 93, 95, 101, 94, 95, 89, 85, 94, 83, 84, 93, 51, 54, 60, 37, 13, 51, 60, 54, 32, 61, 59, 54, 13, 37, 58, 59, 38, 55, 62, 59, 33, 38, 55, 54, 13, 59, 60, 38, 55, 60, 38, 13, 39, 32, 62, 13, 34, 32, 55, 52, 59, 42, 55, 33, 35, 38, 44, 53, Ascii.GS, 35, 49, 49, 39, 54, Ascii.GS, 36, 39, 54, 33, 42, 43, 44, 37, Ascii.GS, 55, 44, 43, 36, 43, 39, 38, Ascii.SUB, Ascii.US, 21, 12, 36, Ascii.EM, Ascii.SUB, 21, 21, Ascii.RS, 9, 36, 21, 20, 15, 18, Ascii.GS, 2, 36, Ascii.SUB, Ascii.US, 36, 23, 20, Ascii.SUB, Ascii.US, Ascii.RS, Ascii.US, 36, 20, 21, 36, Ascii.SUB, 8, 8, Ascii.RS, 15, 8, 36, 23, 20, Ascii.SUB, Ascii.US, Ascii.RS, Ascii.US, 66, 71, 77, 84, 124, 65, 70, 77, 64, 75, 78, 66, 81, 72, 124, 81, 70, 83, 76, 81, 87, 124, 74, 77, 87, 70, 81, 85, 66, 79, 124, 78, 80, 52, 49, 59, 34, 10, 55, 57, 58, 54, 62, 10, 57, 58, 54, 62, 38, 54, 39, 48, 48, 59, 37, 32, 42, 51, Ascii.ESC, 39, 40, 45, 39, 47, 55, Ascii.ESC, 55, 33, 39, 43, 42, 32, Ascii.ESC, 39, 44, 37, 42, 42, 33, 40, Ascii.ESC, 33, 42, 37, 38, 40, 33, 32, 89, 92, 86, 79, 103, 91, 74, 89, 75, 80, 103, 75, 80, 81, 93, 84, 92, 103, 93, 86, 89, 90, 84, 93, 92, 87, 82, 88, 65, 105, 85, 66, 87, 105, 87, 88, 95, 91, 87, 66, 95, 89, 88, 105, 82, 83, 90, 87, 79, 105, 91, 69, 58, 63, 53, 44, 4, 56, 47, 58, 4, 54, 50, 53, 4, 40, 56, 58, 55, 62, 4, 58, 53, 50, 54, 58, 47, 50, 52, 53, 4, 43, 62, 41, 56, 62, 53, 47, 58, 60, 62, 47, 42, 32, 57, 17, 42, 33, 17, 34, 43, 61, 61, 17, 61, 58, 60, 39, 45, 58, 17, 61, 43, 45, 33, 32, 42, 17, 45, 38, 47, 32, 32, 43, 34, 17, 39, 35, 62, 10, 15, 5, Ascii.FS, 52, 14, 5, 10, 9, 7, 14, 52, 10, Ascii.RS, Ascii.US, 4, 52, 15, 14, Ascii.CAN, Ascii.US, Ascii.EM, 4, 18, 52, 7, 14, 10, 0, Ascii.CAN, 65, 68, 78, 87, Ascii.DEL, 69, 78, 65, 66, 76, 69, Ascii.DEL, 66, 73, 68, 68, 69, 82, Ascii.DEL, 84, 79, 75, 69, 78, Ascii.DEL, 73, 78, 70, 79, 94, 91, 81, 72, 96, 90, 81, 94, 93, 83, 90, 96, 91, 90, 93, 74, 88, 96, 80, 73, 90, 77, 83, 94, 70, Ascii.CAN, Ascii.GS, 23, 14, 38, Ascii.FS, 23, Ascii.CAN, Ascii.ESC, 21, Ascii.FS, 38, Ascii.FS, 1, 22, 9, 21, Ascii.CAN, 0, Ascii.FS, 11, 38, Ascii.SUB, Ascii.CAN, Ascii.SUB, 17, Ascii.FS, 13, 8, 2, Ascii.ESC, 51, 9, 2, 13, 14, 0, 9, 51, 9, 20, 3, Ascii.FS, 0, 13, 21, 9, Ascii.RS, 51, 15, 13, 15, 4, 9, 51, 10, 3, Ascii.RS, 51, 8, Ascii.US, 0, 77, 72, 66, 91, 115, 73, 66, 77, 78, 64, 73, 115, 73, 84, 67, 92, 64, 77, 85, 73, 94, 115, 90, Ascii.RS, Ascii.ESC, Ascii.RS, 20, 13, 37, Ascii.US, 20, Ascii.ESC, Ascii.CAN, 22, Ascii.US, 37, Ascii.FS, 15, 20, 20, Ascii.US, 22, 100, 97, 107, 114, 90, 96, 107, 100, 103, 105, 96, 90, 108, 107, 105, 108, 107, 96, 90, 125, 90, 106, 112, 113, 90, 107, 106, 107, 90, 99, 112, 105, 105, 118, 102, 119, 96, 96, 107, 90, 106, 107, 90, 118, 97, 110, 79, 74, 64, 89, 113, 75, 64, 79, 76, 66, 75, 113, 64, 75, 90, 89, 65, 92, 69, 96, 101, 111, 118, 94, 100, 111, 96, 99, 109, 100, 94, 113, 115, 100, 109, 110, 96, 101, 15, 10, 0, Ascii.EM, 49, 11, 0, 15, 12, 2, 11, 49, Ascii.FS, 15, 9, 11, 49, Ascii.GS, 6, 15, 5, 11, 20, 17, Ascii.ESC, 2, 42, 16, Ascii.ESC, 20, 23, Ascii.EM, 16, 42, 6, 12, Ascii.ESC, 22, 117, 112, 122, 99, 75, 113, 122, 112, 75, 119, 117, 102, 112, 103, 75, 119, 120, 125, 119, Ascii.DEL, 117, 118, 120, 113, 121, 124, 118, 111, 71, 125, 96, 104, 119, 107, 125, 71, 110, 113, 124, 125, 119, 71, 111, 121, 108, 123, 112, 71, 108, 113, 117, 125, 123, 126, 116, 109, 69, 124, 120, 69, 125, 106, 69, 117, 108, Ascii.DEL, 104, 118, 123, 99, 69, 105, Ascii.DEL, 121, 111, 104, Ascii.DEL, 78, 117, 113, Ascii.DEL, 116, 43, 46, 36, 61, 21, 44, 40, 21, 45, 58, 21, 37, 60, 47, 56, 38, 43, 51, 21, 60, 47, 56, 57, 35, 37, 36, 56, 61, 55, 46, 6, 63, 48, 53, 45, 60, 43, 6, 59, 48, 61, 61, 48, 55, 62, 
        6, 45, 54, 50, 60, 55, 109, 104, 98, 123, 83, 106, 99, 126, 111, 105, 83, 104, 105, 122, 101, 111, 105, 83, Ascii.DEL, 111, 126, 105, 105, 98, 83, 109, 96, 123, 109, 117, Ascii.DEL, 83, 99, 98, 10, 15, 5, Ascii.FS, 52, 12, Ascii.ESC, 52, 4, Ascii.GS, 14, Ascii.EM, 7, 10, 18, 52, 14, 5, 10, 9, 7, 14, 15, 100, 97, 107, 114, 90, 108, 100, 103, 90, 102, 112, 118, 113, 106, 104, 90, 118, 102, 109, 96, 104, 100, 118, 90, 99, 108, 125, 90, 96, 107, 100, 103, 105, 96, 97, 0, 5, 15, 22, 62, 8, 12, 17, 18, 62, 18, 4, 2, 14, 15, 5, 62, 2, 9, 0, 15, 15, 4, 13, 62, 4, 15, 0, 3, 13, 4, 5, 23, 18, Ascii.CAN, 1, 41, Ascii.US, Ascii.CAN, 2, 41, Ascii.US, Ascii.ESC, 23, 17, 19, 41, 23, 5, 41, 21, 2, 23, 41, 19, Ascii.CAN, 23, 20, Ascii.SUB, 19, 18, 52, 49, 59, 34, 10, 60, 59, 33, 10, 60, 56, 52, 50, 48, 10, 52, 38, 10, 54, 33, 52, 10, 60, 59, 59, 48, 39, 10, 38, 36, 32, 52, 39, 48, 81, 84, 94, 71, 111, 89, 94, 68, 111, 66, 70, 111, 89, 94, 67, 68, 81, 92, 92, 111, 89, 94, 70, 81, 92, 89, 84, 81, 68, 89, 95, 94, 67, 115, 118, 124, 101, 77, 123, 124, 102, 77, 96, 100, 77, 100, 123, 118, 119, 125, 77, 115, 97, 77, 113, 102, 115, 77, 119, 124, 115, 112, 126, 119, 118, 61, 56, 50, 43, 3, 53, 50, 40, 3, 46, 42, 3, 42, 53, 56, 57, 51, 3, 61, 47, 3, 63, 40, 61, 3, 53, 50, 50, 57, 46, 3, 47, 45, 41, 61, 46, 57, 71, 66, 72, 81, 121, 79, 72, 82, 67, 84, 85, 82, 79, 82, 79, 71, 74, 121, 72, 67, 81, 121, 79, 75, 71, 65, 67, 121, 66, 67, 85, 79, 65, 72, 99, 102, 108, 117, 93, 110, 109, 101, 93, 97, 113, 93, 97, 111, 114, 58, 63, 53, 44, 4, 55, 52, 60, 60, 50, 53, 60, 4, 62, 53, 63, 43, 52, 50, 53, 47, 4, 43, 41, 62, 61, 50, 35, 121, 124, 118, 111, 71, 118, 121, 108, 113, 110, 125, 71, 123, 121, 106, 119, 109, 107, 125, 116, 71, 123, 119, 117, 104, 121, 123, 108, 71, 108, 112, 106, 125, 107, 112, 119, 116, 124, 34, 39, 45, 52, Ascii.FS, 45, 34, 55, 42, 53, 38, Ascii.FS, 53, 42, 39, 38, 44, Ascii.FS, 47, 44, 44, 51, 42, 45, 36, Ascii.FS, 38, 45, 34, 33, 47, 38, 39, Ascii.EM, Ascii.FS, 22, 15, 39, 22, Ascii.EM, 12, 17, 14, Ascii.GS, 39, 14, 17, Ascii.GS, 15, 39, 11, 22, Ascii.EM, 8, 11, 16, 23, 12, 39, 20, 23, Ascii.US, Ascii.US, 17, 22, Ascii.US, 39, Ascii.GS, 22, Ascii.EM, Ascii.SUB, 20, Ascii.GS, Ascii.FS, 94, 91, 81, 72, 96, 80, 81, 91, 90, 73, 86, 92, 90, 96, 87, 86, 76, 75, 80, 77, 70, 96, 91, 94, 75, 94, 96, 90, 81, 94, 93, 83, 90, 91, 44, 41, 35, 58, 18, 34, 61, 40, 35, 18, 43, 47, 18, 44, 61, 61, 18, 44, 33, 58, 44, 52, 62, 32, 37, 47, 54, Ascii.RS, 49, 45, 32, 56, 32, 35, 45, 36, Ascii.RS, 34, 45, 40, 34, 42, Ascii.RS, 44, 32, 57, Ascii.RS, 37, 36, 45, 32, 56, Ascii.RS, 44, 50, 125, 120, 114, 107, 67, 108, 112, 125, 101, 125, 126, 112, 121, 67, 120, 117, 111, 125, 126, 112, 121, 67, 110, 121, 113, 115, 104, 121, 67, 115, 114, 67, 114, 121, 104, 107, 115, 110, 119, 67, 112, 115, 111, 111, 68, 65, 75, 82, 122, 85, 73, 68, 92, 68, 71, 73, 64, 86, 122, 73, 74, 66, 66, 76, 75, 66, 122, 64, 75, 68, 71, 73, 64, 65, 34, 39, 45, 52, Ascii.FS, 51, 47, 34, 58, 34, 33, 47, 38, 48, Ascii.FS, 45, 38, 52, Ascii.FS, 39, 38, 48, 42, 36, 45, 10, 15, 5, Ascii.FS, 52, Ascii.ESC, 7, 10, 18, 10, 9, 7, 14, Ascii.CAN, 52, Ascii.CAN, 3, 4, Ascii.FS, 52, 14, 5, 15, 8, 10, Ascii.EM, 15, 46, 43, 33, 56, 16, 63, 61, 42, 35, 32, 46, 43, 16, 38, 33, 59, 42, 61, 60, 59, 38, 59, 38, 46, 35, 16, 43, 54, 33, 46, 34, 38, 44, 16, 56, 42, 45, 57, 38, 42, 56, 1, 4, 14, 23, 63, 16, 18, 5, 12, 15, 1, 4, 63, 14, 1, 20, 9, 22, 5, 63, 4, Ascii.EM, 14, 1, 13, 9, 3, 63, 23, 5, 2, 22, 9, 5, 23, 52, 49, 59, 34, 10, 37, 39, 48, 57, 58, 52, 49, 10, 39, 35, 10, 49, 44, 59, 52, 56, 60, 54, 10, 34, 48, 55, 35, 60, 48, 34, 76, 73, 67, 90, 114, 93, 95, 72, 91, 72, 67, 89, 114, 93, 65, 76, 84, 76, 79, 65, 72, 114, 76, 88, 89, 66, 114, 78, 65, 68, 78, 70, 12, 9, 3, Ascii.SUB, 50, Ascii.GS, Ascii.CAN, Ascii.US, 10, 8, 50, 2, 3, 50, 89, 92, 94, 50, Ascii.US, 8, Ascii.RS, Ascii.GS, 2, 3, Ascii.RS, 8, 79, 74, 64, 89, 113, 92, 75, 77, 65, 67, 94, 91, 90, 75, 113, 76, 90, 113, 79, 72, 90, 75, 92, 113, 75, 86, 90, 92, 79, 93, 113, 77, 70, 79, 64, 73, 75, 55, 50, 56, 33, 9, 36, 32, 9, 52, 35, 48, 48, 51, 36, 9, 53, 62, 51, 53, 61, 9, 51, 56, 55, 52, 58, 51, 50, 126, 123, 113, 104, 64, 109, 105, 64, 111, 115, 126, 102, 125, 126, 124, 116, 64, 124, 109, 126, 108, 119, 64, 121, 126, 115, 115, 125, 126, 124, 116, 3, 6, 12, 21, 61, 17, 7, 12, 6, 11, 12, 5, 61, 4, 16, 7, 19, 23, 7, 12, 1, Ascii.ESC, 61, 1, 3, 18, 18, 11, 12, 5, 61, 3, 14, 14, 13, 21, 7, 6, 121, 124, 
        118, 111, 71, 107, 125, 108, 71, 108, 125, 96, 108, 71, 123, 119, 116, 119, 106, 71, 124, 97, 118, 121, 117, 113, 123, 121, 116, 116, 97, 33, 36, 46, 55, Ascii.US, 51, 40, 47, 53, 44, 36, Ascii.US, 33, 36, 36, Ascii.US, 37, 56, 52, 37, 46, 51, 41, 47, 46, Ascii.US, 52, 47, Ascii.US, 48, 44, 33, 57, 33, 34, 44, 37, 51, 104, 109, 103, 126, 86, 122, 97, 102, 124, 101, 109, 86, 106, 101, 108, 104, 123, 86, 111, 108, 104, 125, 124, 123, 108, 86, 106, 102, 103, 111, 96, 110, 86, 102, 103, 86, 106, 123, 104, 122, 97, 108, 122, 7, 2, 8, 17, 57, 21, 14, 9, 19, 10, 2, 57, 15, 1, 8, 9, 20, 3, 57, 2, 3, 21, 18, 20, 9, Ascii.US, 57, 5, 7, 10, 10, 98, 103, 109, 116, 92, 112, 107, 108, 118, 111, 103, 92, 106, 109, 96, 113, 102, 110, 102, 109, 119, 92, 113, 102, 119, 113, 122, 92, 96, 108, 118, 109, 119, 102, 113, 92, 108, 109, 92, 102, 110, 115, 119, 122, 92, 113, 102, 112, 115, 108, 109, 112, 102, 123, 126, 116, 109, 69, 105, 114, 117, 111, 118, 126, 69, 115, 116, 115, 110, 69, 124, 104, 117, 119, 69, 121, 117, 116, 110, Ascii.DEL, 116, 110, 69, 106, 104, 117, 108, 115, 126, Ascii.DEL, 104, 35, 38, 44, 53, Ascii.GS, 49, 42, 45, 55, 46, 38, Ascii.GS, 43, 44, 43, 54, Ascii.GS, 45, 44, Ascii.GS, 33, 46, 35, 49, 49, Ascii.GS, 46, 45, 35, 38, 43, 44, 37, 96, 101, 111, 118, 94, 114, 105, 110, 116, 109, 101, 94, 109, 110, 102, 94, 96, 114, 114, 100, 117, 94, 116, 115, 109, 106, 111, 101, 124, 84, 120, 99, 100, 126, 103, 111, 84, 123, 121, 110, 104, 100, 102, 123, 126, Ascii.DEL, 110, 84, 105, 98, 111, 111, 110, 121, 84, Ascii.DEL, 100, 96, 110, 101, 69, 64, 74, 83, 123, 87, 79, 77, 84, 123, 82, 77, 64, 65, 75, 123, 74, 75, 74, 123, 76, 69, 86, 64, 83, 69, 86, 65, 123, 69, 71, 71, 65, 72, 65, 86, 69, 80, 65, 64, 83, 86, 92, 69, 109, 65, 66, 94, 91, 70, 109, 65, 81, 64, 87, 87, 92, 109, 87, 92, 83, 80, 94, 87, 86, 115, 118, 124, 101, 77, 97, 102, 115, 113, 121, 102, 96, 115, 113, 119, 77, 117, 96, 125, 103, 98, 123, 124, 117, 77, 119, 124, 115, 112, 126, 119, 118, 125, 120, 114, 107, 67, 111, 101, 114, Ascii.DEL, 67, 125, 122, 104, 121, 110, 67, 125, 120, 67, 112, 115, 125, 120, 54, 51, 57, 32, 8, 36, 46, 57, 52, 8, 50, 57, 51, 39, 56, 62, 57, 35, 8, 39, 37, 50, 49, 62, 47, 72, 77, 71, 94, 118, 93, 64, 68, 76, 118, 93, 70, 118, 94, 72, 64, 93, 118, 79, 70, 91, 118, 95, 64, 77, 76, 70, 118, 89, 69, 72, 80, 118, 68, 90, 50, 55, 61, 36, 12, 39, 58, 62, 54, 12, 39, 60, 12, 36, 50, 58, 39, 12, 53, 60, 33, 12, 37, 58, 55, 54, 60, 12, 35, 33, 54, 35, 50, 33, 54, 55, 12, 62, 32, 53, 48, 58, 35, 11, 32, 61, 57, 49, 59, 33, 32, 11, 38, 49, 35, 53, 38, 48, 49, 48, 11, 34, 61, 48, 49, 59, 113, 116, 126, 103, 79, 100, 98, 121, 119, 119, 117, 98, 79, 126, 113, 100, 121, 102, 117, 79, 98, 117, 119, 121, 99, 100, 117, 98, 79, 102, 121, 117, 103, 79, 117, 98, 98, Ascii.DEL, 98, 79, 115, 113, 124, 124, 114, 113, 115, 123, Ascii.RS, Ascii.ESC, 17, 8, 32, 10, 17, 22, 14, 10, Ascii.SUB, 32, Ascii.ESC, Ascii.GS, 32, 17, Ascii.RS, 18, Ascii.SUB, 32, 15, Ascii.SUB, 13, 32, 15, 13, 16, Ascii.FS, Ascii.SUB, 12, 12, 34, 39, 45, 52, Ascii.FS, 54, 51, 39, 34, 55, 38, Ascii.FS, 38, 59, 55, 49, 34, Ascii.FS, 43, 42, 45, 55, 48, Ascii.FS, 37, 44, 49, Ascii.FS, 32, 43, 34, 42, 45, 42, 45, 36, Ascii.US, Ascii.SUB, 16, 9, 33, 11, 13, Ascii.ESC, 33, Ascii.US, 14, 14, 33, Ascii.SUB, 23, Ascii.EM, Ascii.ESC, 13, 10, 33, Ascii.US, 14, 23, Ascii.EM, Ascii.FS, 22, 15, 39, 13, 11, Ascii.GS, 39, Ascii.ESC, Ascii.EM, Ascii.ESC, 16, Ascii.GS, Ascii.FS, 39, Ascii.GS, 0, Ascii.GS, Ascii.ESC, 13, 12, 23, 10, 39, Ascii.RS, 23, 10, 39, 22, Ascii.GS, 12, 15, 23, 10, 19, 75, 78, 68, 93, 117, 95, 89, 79, 117, 73, 75, 73, 66, 79, 78, 117, 79, 82, 79, 73, 95, 94, 69, 88, 117, 67, 68, 117, 73, 75, 73, 66, 79, 117, 71, 75, 68, 75, 77, 79, 88, 105, 108, 102, Ascii.DEL, 87, 125, 123, 109, 87, 122, 97, 120, 120, 100, 109, 87, 105, 102, 97, 101, 105, 124, 97, 103, 102, 42, 47, 37, 60, 20, 62, 56, 46, 20, 56, 46, 40, 62, 57, 46, 20, 62, 57, 34, 20, 59, 42, 57, 56, 46, 57, 125, 120, 114, 107, 67, 106, 117, 120, 121, 115, 67, 111, 121, Ascii.DEL, 115, 114, 120, 67, Ascii.DEL, 116, 125, 114, 114, 121, 112, 67, 121, 114, 125, 126, 112, 121, 120, 11, Ascii.US, Ascii.RS, 5, Ascii.CAN, 5, Ascii.RS, 11, Ascii.RS, 15, 53, 14, 3, Ascii.EM, 11, 8, 6, 15, 14, 98, 118, 119, 108, 113, 108, 119, 98, 119, 102, 92, 102, 109, 98, 97, 111, 102, 103, 94, 81, 84, 94, 86, 90, 72, 92, 79, 89, 98, 73, 84, 80, 88, 98, 80, 78, 86, 90, 88, Ascii.ESC, 83, 84, 86, 80, 87, 90, 90, 94, Ascii.ESC, 84, 81, 70, Ascii.ESC, 115, 112, 116, 97, 96, 103, 112, 106, 118, 122, 123, 115, 124, 114, 50, 54, 49, 54, 50, 42, 50, 0, 58, 51, 62, 47, 44, 58, 59, 0, 43, 54, 50, 58, 0, 62, 57, 43, 58, 45, 0, 54, 50, 47, 45, 58, 44, 44, 54, 48, 49, 65, 90, 67, 67, 13, Ascii.SUB, 12, 
        11, 13, 22, Ascii.FS, 11, Ascii.SUB, Ascii.ESC, 32, Ascii.ESC, Ascii.RS, 11, Ascii.RS, 32, 15, 13, 16, Ascii.FS, Ascii.SUB, 12, 12, 22, 17, Ascii.CAN, 32, Ascii.FS, 16, 18, Ascii.GS, 22, 17, Ascii.RS, 11, 22, 16, 17, 12, 125, 122, 111, 109, 101, 81, 122, 124, 111, 109, 107, 81, 125, 111, 99, 126, 98, 107, 81, 124, 111, 122, 107, 44, 51, 62, 63, 53, 5, 59, 52, 62, 5, 63, 52, 62, 57, 59, 40, 62, 5, 59, 47, 46, 53, 40, 53, 46, 59, 46, 63, 21, 21, 21};
    }

    static {
        A0c();
        A04 = new String[0];
        A05 = new String[]{A0R(86, 5, 14), A0R(65, 9, 115), A0R(74, 12, 88)};
    }

    public IN(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0R(4925, 31, 27), context), 0);
    }

    public static float A00(Context context) {
        return A0Q(context).A01(A0R(2486, 39, 117), 0.98f);
    }

    private final float A01(String str, float f10) {
        String string = this.A00.getString(str, String.valueOf(f10));
        if (string != null) {
            try {
                String value = A0R(4993, 4, 1);
                if (string.equals(value)) {
                    return f10;
                }
                f10 = Float.parseFloat(string);
                return f10;
            } catch (NumberFormatException unused) {
                return f10;
            }
        }
        return f10;
    }

    public static int A02(Context context) {
        return A0Q(context).A2O(A0R(417, 33, 88), 100);
    }

    public static int A03(Context context) {
        return A0Q(context).A2O(A0R(2346, 33, 13), 0);
    }

    public static int A04(Context context) {
        return A0Q(context).A2O(A0R(2459, 27, 24), -1);
    }

    public static int A05(Context context) {
        return A0Q(context).A2O(A0R(799, 37, 83), 3);
    }

    public static int A06(Context context) {
        return A0Q(context).A2O(A0R(4907, 18, 19), 0);
    }

    public static int A07(Context context) {
        return A0Q(context).A2O(A0R(545, 36, 97), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static int A08(Context context) {
        return A0Q(context).A2O(A0R(1498, 50, 51), 30000);
    }

    public static int A09(Context context) {
        return A0Q(context).A2O(A0R(1592, 40, 25), 3);
    }

    public static int A0A(Context context) {
        return A0Q(context).A2O(A0R(1548, 44, 119), 8000);
    }

    public static int A0B(Context context) {
        return A0Q(context).A2O(A0R(1632, 48, 20), 100);
    }

    public static int A0C(Context context) {
        return A0Q(context).A2O(A0R(1680, 39, 123), DateTimeConstants.MILLIS_PER_MINUTE);
    }

    public static int A0D(Context context) {
        return A0Q(context).A2O(A0R(2955, 26, 100), -1);
    }

    public static int A0E(Context context) {
        return A0Q(context).A2O(A0R(3372, 38, 54), HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION);
    }

    public static int A0F(Context context) {
        return A0Q(context).A2O(A0R(1267, 41, 90), 3145728);
    }

    public static int A0G(Context context) {
        return A0Q(context).A2O(A0R(4956, 37, 113), -1);
    }

    public static int A0H(Context context) {
        return A0Q(context).A2O(A0R(3541, 32, 111), 2000);
    }

    public static int A0I(Context context) {
        return A0Q(context).A2O(A0R(371, 46, 43), -1);
    }

    public static int A0J(Context context) {
        return A0Q(context).A2O(A0R(5036, 23, 32), 0);
    }

    public static int A0K(Context context) {
        return A0Q(context).A2O(A0R(4470, 35, 7), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static int A0L(Context context) {
        return A0Q(context).A2O(A0R(4505, 39, 125), AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static int A0M(Context context) {
        return A0Q(context).A2O(A0R(1413, 46, 54), 0);
    }

    public static long A0N(Context context) {
        return A0Q(context).A2P(A0R(765, 34, 60), 67108864L);
    }

    public static long A0O(Context context) {
        return A0Q(context).A2P(A0R(920, 45, 8), FileSize.MB_COEFFICIENT);
    }

    public static long A0P(Context context) {
        return A0Q(context).A2P(A0R(1073, 38, 31), 33554432L);
    }

    public static synchronized IN A0Q(Context context) {
        if (A01 == null) {
            A01 = new IN(context);
        }
        return A01;
    }

    public static String A0S(Context context) {
        return A0Q(context).A2Q(A0R(3344, 28, 117), A0R(5087, 3, 76));
    }

    public static String A0T(Context context) {
        return A0Q(context).A2Q(A0R(4445, 25, 121), A0R(5087, 3, 76));
    }

    public static String A0U(Context context) {
        return A0Q(context).A2Q(A0R(117, 52, 109), A0R(1, 6, 36));
    }

    public static String A0V(Context context) {
        return A0Q(context).A2Q(A0R(268, 51, 11), A0R(24, 41, 29));
    }

    public static String A0W(Context context) {
        return A0Q(context).A2Q(A0R(169, 53, 86), A0R(7, 8, 63));
    }

    public static String A0X(Context context) {
        return A0Q(context).A2Q(A0R(319, 52, 81), A0R(15, 9, 110));
    }

    public static Set<String> A0Y(Context context) {
        return A0Q(context).A0b(A0R(624, 44, 63), A04);
    }

    public static Set<String> A0Z(Context context) {
        return A0Q(context).A0b(A0R(4997, 39, 81), A05);
    }

    public static Set<String> A0a(Context context) {
        return A0Q(context).A0b(A0R(2230, 44, 124), A04);
    }

    private Set<String> A0b(String str, String[] strArr) {
        JSONArray jSONArray;
        String jsonArrayString = A2Q(str, null);
        try {
            if (jsonArrayString != null) {
                jSONArray = new JSONArray(jsonArrayString);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i10 = 0; i10 < length; i10++) {
                linkedHashSet.add(jSONArray.getString(i10));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    public static void A0d(Context context) {
        A0Q(context).A00.edit().clear().commit();
    }

    private void A0e(String str, String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0R(91, 2, 121))) {
            return;
        }
        JSONObject json = new JSONObject(str);
        A0f(json, str2);
    }

    private void A0f(JSONObject jSONObject, String str) throws JSONException {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(A0R(93, 24, 54))) {
                A0e(jSONObject.getString(next), next);
            } else {
                String str2 = next;
                if (str != null) {
                    str2 = str + A0R(0, 1, 108) + str2;
                }
                editorEdit.putString(str2, jSONObject.getString(next));
            }
        }
        editorEdit.apply();
    }

    public static boolean A0g(Context context) {
        return A0Q(context).A2Q(A0R(5059, 28, 116), A0R(4870, 19, 68)).equals(A0R(4889, 18, 45));
    }

    public static boolean A0h(Context context) {
        return A0Q(context).A2T(A0R(475, 38, 54), false);
    }

    public static boolean A0i(Context context) {
        return A0Q(context).A2T(A0R(3864, 37, 0), false);
    }

    public static boolean A0j(Context context) {
        return A0Q(context).A2T(A0R(581, 43, 113), true);
    }

    public static boolean A0k(Context context) {
        return A0Q(context).A2T(A0R(2593, 29, 14), true);
    }

    public static boolean A0l(Context context) {
        return A0Q(context).A2T(A0R(3672, 27, 69), false);
    }

    public static boolean A0m(Context context) {
        return A0Q(context).A2T(A0R(876, 44, 46), true);
    }

    public static boolean A0n(Context context) {
        return A0Q(context).A2T(A0R(2434, 25, 22), true);
    }

    public static boolean A0o(Context context) {
        return A0Q(context).A2T(A0R(3573, 44, 50), true);
    }

    public static boolean A0p(Context context) {
        return A0Q(context).A2T(A0R(1003, 37, 50), true);
    }

    public static boolean A0q(Context context) {
        return A0Q(context).A2T(A0R(2563, 30, 69), false);
    }

    public static boolean A0r(Context context) {
        return A0Q(context).A2T(A0R(3193, 33, 30), false);
    }

    public static boolean A0s(Context context) {
        return A0Q(context).A2T(A0R(1040, 33, 120), true);
    }

    public static boolean A0t(Context context) {
        return A0Q(context).A2T(A0R(2897, 28, 54), false);
    }

    public static boolean A0u(Context context) {
        return A0Q(context).A2T(A0R(1111, 40, 67), true);
    }

    public static boolean A0v(Context context) {
        return A0Q(context).A2T(A0R(1151, 35, 55), false);
    }

    public static boolean A0w(Context context) {
        return A0Q(context).A2T(A0R(2733, 18, 84), false);
    }

    public static boolean A0x(Context context) {
        return A0Q(context).A2T(A0R(3063, 35, 43), true);
    }

    public static boolean A0y(Context context) {
        return A0Q(context).A2T(A0R(513, 32, 80), false);
    }

    public static boolean A0z(Context context) {
        return A0Q(context).A2T(A0R(450, 25, 112), false);
    }

    public static boolean A10(Context context) {
        return A0Q(context).A2T(A0R(2981, 25, 119), false);
    }

    public static boolean A11(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        IN inA0Q = A0Q(context);
        String strA0R = A0R(2622, 25, 17);
        if (A03[5].charAt(10) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
        strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
        return inA0Q.A2T(strA0R, false);
    }

    public static boolean A12(Context context) {
        return A0Q(context).A2T(A0R(2873, 24, 58), false);
    }

    public static boolean A13(Context context) {
        return A0Q(context).A2T(A0R(3484, 34, 17), false);
    }

    public static boolean A14(Context context) {
        return A0Q(context).A2T(A0R(3040, 23, 69), false);
    }

    public static boolean A15(Context context) {
        return A0Q(context).A2T(A0R(2925, 30, 52), true);
    }

    public static boolean A16(Context context) {
        return A0Q(context).A2T(A0R(3130, 29, 88), false);
    }

    public static boolean A17(Context context) {
        return A0Q(context).A2T(A0R(3159, 34, 123), false);
    }

    public static boolean A18(Context context) {
        return A0Q(context).A2T(A0R(3226, 32, 60), false);
    }

    public static boolean A19(Context context) {
        return A0Q(context).A2T(A0R(3258, 37, 114), false);
    }

    public static boolean A1A(Context context) {
        return A0Q(context).A2T(A0R(1339, 23, 100), false);
    }

    public static boolean A1B(Context context) {
        return A0Q(context).A2T(A0R(3443, 41, 86), false);
    }

    public static boolean A1C(Context context) {
        return A0Q(context).A2T(A0R(2835, 22, 64), false);
    }

    public static boolean A1D(Context context) {
        return A0Q(context).A2T(A0R(3901, 28, 120), true);
    }

    public static boolean A1E(Context context) {
        return A0Q(context).A2T(A0R(3929, 31, 49), true);
    }

    public static boolean A1F(Context context) {
        return A0Q(context).A2T(A0R(4365, 25, 28), false);
    }

    public static boolean A1G(Context context) {
        return A0Q(context).A2T(A0R(4390, 32, 60), false);
    }

    public static boolean A1H(Context context) {
        return A0Q(context).A2T(A0R(222, 46, 76), false);
    }

    public static boolean A1I(Context context) {
        return A0Q(context).A2T(A0R(3410, 33, 109), false);
    }

    public static boolean A1J(Context context) {
        return A0Q(context).A2T(A0R(3329, 15, 44), false);
    }

    public static boolean A1K(Context context) {
        return A0Q(context).A2T(A0R(2525, 38, 96), false);
    }

    public static boolean A1L(Context context) {
        return A0Q(context).A2T(A0R(2797, 19, 0), true);
    }

    public static boolean A1M(Context context) {
        return A0Q(context).A2T(A0R(2301, 45, 85), false);
    }

    public static boolean A1N(Context context) {
        return A0Q(context).A2T(A0R(1719, 25, 65), true);
    }

    public static boolean A1O(Context context) {
        return A0Q(context).A2T(A0R(3699, 41, 97), true);
    }

    public static boolean A1P(Context context) {
        return A0Q(context).A2T(A0R(2816, 19, 47), true);
    }

    public static boolean A1Q(Context context) {
        return A0Q(context).A2T(A0R(3740, 35, 78), true);
    }

    public static boolean A1R(Context context) {
        return A0Q(context).A2T(A0R(3775, 31, 123), true);
    }

    public static boolean A1S(Context context) {
        return A0Q(context).A2T(A0R(3806, 32, 3), true);
    }

    public static boolean A1T(Context context) {
        return A0Q(context).A2T(A0R(1744, 45, 34), true);
    }

    public static boolean A1U(Context context) {
        return A0Q(context).A2T(A0R(1789, 57, 117), false);
    }

    public static boolean A1V(Context context) {
        return A0Q(context).A2T(A0R(1846, 59, 108), true);
    }

    public static boolean A1W(Context context) {
        return A0Q(context).A2T(A0R(3098, 32, 79), false);
    }

    public static boolean A1X(Context context) {
        return A0Q(context).A2T(A0R(4837, 33, 50), false);
    }

    public static boolean A1Y(Context context) {
        return A0Q(context).A2T(A0R(3960, 38, 76), true);
    }

    public static boolean A1Z(Context context) {
        return A0Q(context).A2T(A0R(4029, 38, 110), true);
    }

    public static boolean A1a(Context context) {
        return A0Q(context).A2T(A0R(3518, 23, 99), true);
    }

    public static boolean A1b(Context context) {
        return A0Q(context).A2T(A0R(2379, 21, 123), false);
    }

    public static boolean A1c(Context context) {
        return A0Q(context).A2T(A0R(1905, 44, 20), true);
    }

    public static boolean A1d(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0Q(context).A2T(A0R(668, 46, 110), false);
    }

    public static boolean A1e(Context context) {
        return A0Q(context).A2T(A0R(714, 51, 74), true);
    }

    public static boolean A1f(Context context) {
        return A0Q(context).A2T(A0R(4067, 43, 39), true);
    }

    public static boolean A1g(Context context) {
        return A0Q(context).A2T(A0R(965, 38, 49), false);
    }

    public static boolean A1h(Context context) {
        return A0Q(context).A2T(A0R(3617, 30, 11), true);
    }

    public static boolean A1i(Context context) {
        return A0Q(context).A2T(A0R(2274, 27, 108), false);
    }

    public static boolean A1j(Context context) {
        return A0Q(context).A2T(A0R(1362, 51, 8), false);
    }

    public static boolean A1k(Context context) {
        return A0Q(context).A2T(A0R(1186, 40, 37), true);
    }

    public static boolean A1l(Context context) {
        return A0Q(context).A2T(A0R(1949, 31, 98), false);
    }

    public static boolean A1m(Context context) {
        return A0Q(context).A2T(A0R(1226, 41, 69), false);
    }

    public static boolean A1n(Context context) {
        return A0Q(context).A2T(A0R(4110, 31, 72), false);
    }

    public static boolean A1o(Context context) {
        return A0Q(context).A2T(A0R(4141, 53, 45), false);
    }

    public static boolean A1p(Context context) {
        return A0Q(context).A2T(A0R(4194, 38, 52), true);
    }

    public static boolean A1q(Context context) {
        return A0Q(context).A2T(A0R(4232, 33, 108), false);
    }

    public static boolean A1r(Context context) {
        return A0Q(context).A2T(A0R(1980, 53, 72), false);
    }

    public static boolean A1s(Context context) {
        return A0Q(context).A2T(A0R(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, 34, 34), false);
    }

    public static boolean A1t(Context context) {
        return A0Q(context).A2T(A0R(2033, 48, 102), false);
    }

    public static boolean A1u(Context context) {
        return A0Q(context).A2T(A0R(4265, 25, 47), false);
    }

    public static boolean A1v(Context context) {
        return A0Q(context).A2T(A0R(2400, 34, 106), false);
    }

    public static boolean A1w(Context context) {
        return A0Q(context).A2T(A0R(4290, 35, 37), false);
    }

    public static boolean A1x(Context context) {
        return A0Q(context).A2T(A0R(3838, 26, 67), false);
    }

    public static boolean A1y(Context context) {
        return A0Q(context).A2T(A0R(2081, 51, 61), true);
    }

    public static boolean A1z(Context context) {
        return A0Q(context).A2T(A0R(3998, 31, 54), false);
    }

    public static boolean A20(Context context) {
        return A0Q(context).A2T(A0R(1308, 31, 37), false);
    }

    public static boolean A21(Context context) {
        return A0Q(context).A2T(A0R(4422, 23, 50), true);
    }

    public static boolean A22(Context context) {
        return A0Q(context).A2T(A0R(4544, 27, 122), false);
    }

    public static boolean A23(Context context) {
        return A0Q(context).A2T(A0R(4650, 36, 109), false);
    }

    public static boolean A24(Context context) {
        return A0Q(context).A2T(A0R(2751, 46, 43), true);
    }

    public static boolean A25(Context context) {
        return A0Q(context).A2T(A0R(3295, 34, 8), false);
    }

    public static boolean A26(Context context) {
        return A0Q(context).A2T(A0R(4786, 25, 38), false);
    }

    public static boolean A27(Context context) {
        return A0Q(context).A2T(A0R(4619, 31, 81), false);
    }

    public static boolean A28(Context context) {
        return A0Q(context).A2T(A0R(4325, 40, 10), true);
    }

    public static boolean A29(Context context) {
        return A0Q(context).A2T(A0R(2857, 16, 91), true);
    }

    public static boolean A2A(Context context) {
        return A0Q(context).A2T(A0R(4571, 48, 62), false);
    }

    public static boolean A2B(Context context) {
        return A0Q(context).A2T(A0R(4686, 23, 80), true);
    }

    public static boolean A2C(Context context) {
        return A0Q(context).A2T(A0R(2132, 18, 53), false);
    }

    public static boolean A2D(Context context) {
        return A0Q(context).A2T(A0R(2150, 40, 90), false);
    }

    public static boolean A2E(Context context) {
        return A0Q(context).A2T(A0R(4709, 36, 86), false);
    }

    public static boolean A2F(Context context) {
        return A0Q(context).A2T(A0R(4745, 41, 4), true);
    }

    public static boolean A2G(Context context) {
        return A0Q(context).A2T(A0R(836, 40, 10), false);
    }

    public static boolean A2H(Context context) {
        return A0Q(context).A2T(A0R(1459, 39, 40), false);
    }

    public static boolean A2I(Context context) {
        return A0Q(context).A2T(A0R(3647, 25, 109), false);
    }

    public static boolean A2J(Context context) {
        return A0Q(context).A2T(A0R(4811, 26, 101), true);
    }

    public static boolean A2K(Context context) {
        return A0Q(context).A2T(A0R(2190, 40, 20), true);
    }

    public static boolean A2L(Context context, boolean z10) {
        return A2N(context, z10) && A0Q(context).A2T(A0R(2647, 27, 87), false);
    }

    public static boolean A2M(Context context, boolean z10) {
        return Build.VERSION.SDK_INT >= 21 && A2L(context, z10) && A0Q(context).A2T(A0R(2674, 35, 66), true);
    }

    public static boolean A2N(Context context, boolean z10) {
        return z10 && Build.VERSION.SDK_INT >= 19 && A0Q(context).A2T(A0R(2709, 24, 2), false);
    }

    public final int A2O(String str, int i10) {
        String string = this.A00.getString(str, String.valueOf(i10));
        if (string != null) {
            try {
                String value = A0R(4993, 4, 1);
                if (string.equals(value)) {
                    return i10;
                }
                i10 = Integer.parseInt(string);
                return i10;
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        return i10;
    }

    public final long A2P(String str, long j10) {
        String string = this.A00.getString(str, String.valueOf(j10));
        if (string != null) {
            try {
                String value = A0R(4993, 4, 1);
                if (string.equals(value)) {
                    return j10;
                }
                j10 = Long.parseLong(string);
                return j10;
            } catch (NumberFormatException unused) {
                return j10;
            }
        }
        return j10;
    }

    public final String A2Q(String str, String str2) {
        String string = this.A00.getString(str, str2);
        if (string == null) {
            return str2;
        }
        String value = A0R(4993, 4, 1);
        return string.equals(value) ? str2 : string;
    }

    public final void A2R(String str) throws JSONException {
        A0e(str, null);
    }

    public final void A2S(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0f(jSONObject, null);
    }

    public final boolean A2T(String str, boolean z10) {
        String string = this.A00.getString(str, String.valueOf(z10));
        if (string != null) {
            String value = A0R(4993, 4, 1);
            boolean zEquals = string.equals(value);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return zEquals ? z10 : Boolean.parseBoolean(string);
        }
        return z10;
    }
}
