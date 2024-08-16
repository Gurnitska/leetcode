package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithTheMostWaterTest {

    @Test
    public void test1(){
        ContainerWithTheMostWater containerWithTheMostWater = new ContainerWithTheMostWater();
        int[] testArray = new int[]{8361,5302,8672,2400,5150,3527,9216,6713,2902,310,555,9176,311,9968,5705,3983,7992,8553,6953,9541,5828,1750,6731,3552,5274,7303,3724,5387,9504,1900,937,1146,7266,7943,7911,9055,8046,7180,6516,7810,686,5210,1956,4540,7540,2083,1579,4260,2450,2527,6524,5723,6766,777,5694,6018,2880,3653,6011,8172,5943,2862,6594,2902,9887,5878,3065,8197,9195,4560,3428,2209,475,852,9488,3368,4319,6230,1975,5829,9474,4490,2067,6048,9136,5344,6022,1787,5553,140,5130,524,3450,4008,721,6154,5598,8219,4614,3404,8232,9023,4552,7711,6057,5324,8578,3595,4663,4,3703,1429,7921,3085,3694,1461,8932,2632,7046,801,6043,617,7565,3469,1627,1464,3050,7982,6702,5467,8604,5515,9155,3260,5040,313,8885,929,4103,7947,1139,702,1047,2889,1439,3945,4738,2462,8491,7699,376,4639,1329,3644,7408,3665,7417,1388,861,7510,7908,4568,2618,4565,7222,2003,1586,9494,1744,7997,7389,9476,2752,701,5925,4963,6859,1634,7170,1336,1514,6757,698,5123,4390,7910,7527,9520,156,6402,1428,789,3411,106,3206,8216,700,994,337,9329,5310,7897,1462,5709,872,1482,3137,1197,6459,822,1715,6575,2697,8903,4315,2139,2295,7797,1060,3511,1564,6625,3579,6412,4178,4003,9431,4251,1147,3418,5180,8712,9484,2582,4408,1945,6068,1269,1464,7459,2953,9773,2621,9471,9295,7095,3236,3526,7493,2437,2845,9123,2062,7329,6133,7696,3930,8297,3552,4879,3535,2458,3488,4176,2415,4964,4239,7299,6820,9586,2081,6675,184,5397,2308,3539,6628,4177,8087,7245,7271,4318,1580,9122,9304,401,5758,1588,3916,674,2974,7613,2025,4849,7326,953,2123,5015,472,948,3567,498,2581,2096,3383,4879,4756,9720,728,6750,3038,2847,2998,9481,5581,3169,5290,7535,5075,8450,7762,1803,9782,7883,9003,9391,5001,6764,6375,5030,8386,6587,3738,5303,5264,4319,8203,2980,8868,8362,8101,3149,4320,2573,2943,1488,3917,32,9303,3487,600,6192,1802,3422,7481,354,393,8572,1298,5802,6840,2817,6800,6788,9100,502,5140,314,9376,3843,8519,2182,2263,9766,6228,5199,7297,8633,4783,8498,340,8277,3956,9703,1232,8493,9622,6942,1693,3805,4399,8602,7528,1389,803,3398,2618,856,9096,6858,6869,154,8359,9353,4177,9312,9038,4321,9456,2467,508,4458,2524,3854,3584,37,3115,7749,8399,6624,8141,7953,4148,3375,5908,983,9884,138,8115,2083,2807,412,6219,2194,750,4691,9589,6373,2550,2487,7026,9012,7493,3427,8828,6864,1674,7130,7546,9631,5863,3734,3647,1456,8084,2958,8324,7425,6769,8926,7832,3599,4224,4182,5634,3962,7000,4113,6987,8670,8560,6895,1115,764,6944,468,853};
        int result = containerWithTheMostWater.maxArea(testArray);
        assertEquals(0, result);
    }
}