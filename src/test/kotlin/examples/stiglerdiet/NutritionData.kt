package examples.stiglerdiet

fun nutritionData(): MutableList<Array<Any>> {
    val data: MutableList<Array<Any>> = ArrayList()
    data.add(
        arrayOf(
            "Wheat Flour (Enriched)",
            "10 lb.",
            36,
            doubleArrayOf(44.7, 1411.0, 2.0, 365.0, 0.0, 55.4, 33.3, 441.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Macaroni", "1 lb.", 14.1, doubleArrayOf(11.6, 418.0, 0.7, 54.0, 0.0, 3.2, 1.9, 68.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Wheat Cereal (Enriched)",
            "28 oz.",
            24.2,
            doubleArrayOf(11.8, 377.0, 14.4, 175.0, 0.0, 14.4, 8.8, 114.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Corn Flakes", "8 oz.", 7.1, doubleArrayOf(11.4, 252.0, 0.1, 56.0, 0.0, 13.5, 2.3, 68.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Corn Meal", "1 lb.", 4.6, doubleArrayOf(36.0, 897.0, 1.7, 99.0, 30.9, 17.4, 7.9, 106.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Hominy Grits", "24 oz.", 8.5, doubleArrayOf(28.6, 680.0, 0.8, 80.0, 0.0, 10.6, 1.6, 110.0, 0.0)
        )
    )
    data.add(arrayOf("Rice", "1 lb.", 7.5, doubleArrayOf(21.2, 460.0, 0.6, 41.0, 0.0, 2.0, 4.8, 60.0, 0.0)))
    data.add(
        arrayOf(
            "Rolled Oats", "1 lb.", 7.1, doubleArrayOf(25.3, 907.0, 5.1, 341.0, 0.0, 37.1, 8.9, 64.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "White Bread (Enriched)",
            "1 lb.",
            7.9,
            doubleArrayOf(15.0, 488.0, 2.5, 115.0, 0.0, 13.8, 8.5, 126.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Whole Wheat Bread",
            "1 lb.",
            9.1,
            doubleArrayOf(12.2, 484.0, 2.7, 125.0, 0.0, 13.9, 6.4, 160.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Rye Bread", "1 lb.", 9.1, doubleArrayOf(12.4, 439.0, 1.1, 82.0, 0.0, 9.9, 3.0, 66.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Pound Cake", "1 lb.", 24.8, doubleArrayOf(8.0, 130.0, 0.4, 31.0, 18.9, 2.8, 3.0, 17.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Soda Crackers", "1 lb.", 15.1, doubleArrayOf(12.5, 288.0, 0.5, 50.0, 0.0, 0.0, 0.0, 0.0, 0.0)
        )
    )
    data.add(arrayOf("Milk", "1 qt.", 11, doubleArrayOf(6.1, 310.0, 10.5, 18.0, 16.8, 4.0, 16.0, 7.0, 177.0)))
    data.add(
        arrayOf(
            "Evaporated Milk (can)",
            "14.5 oz.",
            6.7,
            doubleArrayOf(8.4, 422.0, 15.1, 9.0, 26.0, 3.0, 23.5, 11.0, 60.0)
        )
    )
    data.add(arrayOf("Butter", "1 lb.", 30.8, doubleArrayOf(10.8, 9.0, 0.2, 3.0, 44.2, 0.0, 0.2, 2.0, 0.0)))
    data.add(
        arrayOf(
            "Oleomargarine", "1 lb.", 16.1, doubleArrayOf(20.6, 17.0, 0.6, 6.0, 55.8, 0.2, 0.0, 0.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Eggs", "1 doz.", 32.6, doubleArrayOf(2.9, 238.0, 1.0, 52.0, 18.6, 2.8, 6.5, 1.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Cheese (Cheddar)",
            "1 lb.",
            24.2,
            doubleArrayOf(7.4, 448.0, 16.4, 19.0, 28.1, 0.8, 10.3, 4.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Cream", "1/2 pt.", 14.1, doubleArrayOf(3.5, 49.0, 1.7, 3.0, 16.9, 0.6, 2.5, 0.0, 17.0)
        )
    )
    data.add(
        arrayOf(
            "Peanut Butter", "1 lb.", 17.9, doubleArrayOf(15.7, 661.0, 1.0, 48.0, 0.0, 9.6, 8.1, 471.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Mayonnaise", "1/2 pt.", 16.7, doubleArrayOf(8.6, 18.0, 0.2, 8.0, 2.7, 0.4, 0.5, 0.0, 0.0)
        )
    )
    data.add(arrayOf("Crisco", "1 lb.", 20.3, doubleArrayOf(20.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)))
    data.add(arrayOf("Lard", "1 lb.", 9.8, doubleArrayOf(41.7, 0.0, 0.0, 0.0, 0.2, 0.0, 0.5, 5.0, 0.0)))
    data.add(
        arrayOf(
            "Sirloin Steak", "1 lb.", 39.6, doubleArrayOf(2.9, 166.0, 0.1, 34.0, 0.2, 2.1, 2.9, 69.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Round Steak", "1 lb.", 36.4, doubleArrayOf(2.2, 214.0, 0.1, 32.0, 0.4, 2.5, 2.4, 87.0, 0.0)
        )
    )
    data.add(arrayOf("Rib Roast", "1 lb.", 29.2, doubleArrayOf(3.4, 213.0, 0.1, 33.0, 0.0, 0.0, 2.0, 0.0, 0.0)))
    data.add(
        arrayOf(
            "Chuck Roast", "1 lb.", 22.6, doubleArrayOf(3.6, 309.0, 0.2, 46.0, 0.4, 1.0, 4.0, 120.0, 0.0)
        )
    )
    data.add(arrayOf("Plate", "1 lb.", 14.6, doubleArrayOf(8.5, 404.0, 0.2, 62.0, 0.0, 0.9, 0.0, 0.0, 0.0)))
    data.add(
        arrayOf(
            "Liver (Beef)",
            "1 lb.",
            26.8,
            doubleArrayOf(2.2, 333.0, 0.2, 139.0, 169.2, 6.4, 50.8, 316.0, 525.0)
        )
    )
    data.add(
        arrayOf(
            "Leg of Lamb", "1 lb.", 27.6, doubleArrayOf(3.1, 245.0, 0.1, 20.0, 0.0, 2.8, 3.9, 86.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Lamb Chops (Rib)", "1 lb.", 36.6, doubleArrayOf(3.3, 140.0, 0.1, 15.0, 0.0, 1.7, 2.7, 54.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Pork Chops", "1 lb.", 30.7, doubleArrayOf(3.5, 196.0, 0.2, 30.0, 0.0, 17.4, 2.7, 60.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Pork Loin Roast", "1 lb.", 24.2, doubleArrayOf(4.4, 249.0, 0.3, 37.0, 0.0, 18.2, 3.6, 79.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Bacon", "1 lb.", 25.6, doubleArrayOf(10.4, 152.0, 0.2, 23.0, 0.0, 1.8, 1.8, 71.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Ham, smoked", "1 lb.", 27.4, doubleArrayOf(6.7, 212.0, 0.2, 31.0, 0.0, 9.9, 3.3, 50.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Salt Pork", "1 lb.", 16, doubleArrayOf(18.8, 164.0, 0.1, 26.0, 0.0, 1.4, 1.8, 0.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Roasting Chicken",
            "1 lb.",
            30.3,
            doubleArrayOf(1.8, 184.0, 0.1, 30.0, 0.1, 0.9, 1.8, 68.0, 46.0)
        )
    )
    data.add(
        arrayOf(
            "Veal Cutlets", "1 lb.", 42.3, doubleArrayOf(1.7, 156.0, 0.1, 24.0, 0.0, 1.4, 2.4, 57.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Salmon, Pink (can)", "16 oz.", 13, doubleArrayOf(5.8, 705.0, 6.8, 45.0, 3.5, 1.0, 4.9, 209.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Apples", "1 lb.", 4.4, doubleArrayOf(5.8, 27.0, 0.5, 36.0, 7.3, 3.6, 2.7, 5.0, 544.0)
        )
    )
    data.add(
        arrayOf(
            "Bananas", "1 lb.", 6.1, doubleArrayOf(4.9, 60.0, 0.4, 30.0, 17.4, 2.5, 3.5, 28.0, 498.0)
        )
    )
    data.add(arrayOf("Lemons", "1 doz.", 26, doubleArrayOf(1.0, 21.0, 0.5, 14.0, 0.0, 0.5, 0.0, 4.0, 952.0)))
    data.add(
        arrayOf(
            "Oranges", "1 doz.", 30.9, doubleArrayOf(2.2, 40.0, 1.1, 18.0, 11.1, 3.6, 1.3, 10.0, 1998.0)
        )
    )
    data.add(
        arrayOf(
            "Green Beans", "1 lb.", 7.1, doubleArrayOf(2.4, 138.0, 3.7, 80.0, 69.0, 4.3, 5.8, 37.0, 862.0)
        )
    )
    data.add(
        arrayOf(
            "Cabbage", "1 lb.", 3.7, doubleArrayOf(2.6, 125.0, 4.0, 36.0, 7.2, 9.0, 4.5, 26.0, 5369.0)
        )
    )
    data.add(
        arrayOf(
            "Carrots", "1 bunch", 4.7, doubleArrayOf(2.7, 73.0, 2.8, 43.0, 188.5, 6.1, 4.3, 89.0, 608.0)
        )
    )
    data.add(
        arrayOf(
            "Celery", "1 stalk", 7.3, doubleArrayOf(0.9, 51.0, 3.0, 23.0, 0.9, 1.4, 1.4, 9.0, 313.0)
        )
    )
    data.add(
        arrayOf(
            "Lettuce", "1 head", 8.2, doubleArrayOf(0.4, 27.0, 1.1, 22.0, 112.4, 1.8, 3.4, 11.0, 449.0)
        )
    )
    data.add(
        arrayOf(
            "Onions", "1 lb.", 3.6, doubleArrayOf(5.8, 166.0, 3.8, 59.0, 16.6, 4.7, 5.9, 21.0, 1184.0)
        )
    )
    data.add(
        arrayOf(
            "Potatoes", "15 lb.", 34, doubleArrayOf(14.3, 336.0, 1.8, 118.0, 6.7, 29.4, 7.1, 198.0, 2522.0)
        )
    )
    data.add(
        arrayOf(
            "Spinach", "1 lb.", 8.1, doubleArrayOf(1.1, 106.0, 0.0, 138.0, 918.4, 5.7, 13.8, 33.0, 2755.0)
        )
    )
    data.add(
        arrayOf(
            "Sweet Potatoes",
            "1 lb.",
            5.1,
            doubleArrayOf(9.6, 138.0, 2.7, 54.0, 290.7, 8.4, 5.4, 83.0, 1912.0)
        )
    )
    data.add(
        arrayOf(
            "Peaches (can)",
            "No. 2 1/2",
            16.8,
            doubleArrayOf(3.7, 20.0, 0.4, 10.0, 21.5, 0.5, 1.0, 31.0, 196.0)
        )
    )
    data.add(
        arrayOf(
            "Pears (can)", "No. 2 1/2", 20.4, doubleArrayOf(3.0, 8.0, 0.3, 8.0, 0.8, 0.8, 0.8, 5.0, 81.0)
        )
    )
    data.add(
        arrayOf(
            "Pineapple (can)", "No. 2 1/2", 21.3, doubleArrayOf(2.4, 16.0, 0.4, 8.0, 2.0, 2.8, 0.8, 7.0, 399.0)
        )
    )
    data.add(
        arrayOf(
            "Asparagus (can)",
            "No. 2",
            27.7,
            doubleArrayOf(0.4, 33.0, 0.3, 12.0, 16.3, 1.4, 2.1, 17.0, 272.0)
        )
    )
    data.add(
        arrayOf(
            "Green Beans (can)", "No. 2", 10, doubleArrayOf(1.0, 54.0, 2.0, 65.0, 53.9, 1.6, 4.3, 32.0, 431.0)
        )
    )
    data.add(
        arrayOf(
            "Pork and Beans (can)",
            "16 oz.",
            7.1,
            doubleArrayOf(7.5, 364.0, 4.0, 134.0, 3.5, 8.3, 7.7, 56.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Corn (can)", "No. 2", 10.4, doubleArrayOf(5.2, 136.0, 0.2, 16.0, 12.0, 1.6, 2.7, 42.0, 218.0)
        )
    )
    data.add(
        arrayOf(
            "Peas (can)", "No. 2", 13.8, doubleArrayOf(2.3, 136.0, 0.6, 45.0, 34.9, 4.9, 2.5, 37.0, 370.0)
        )
    )
    data.add(
        arrayOf(
            "Tomatoes (can)", "No. 2", 8.6, doubleArrayOf(1.3, 63.0, 0.7, 38.0, 53.2, 3.4, 2.5, 36.0, 1253.0)
        )
    )
    data.add(
        arrayOf(
            "Tomato Soup (can)",
            "10 1/2 oz.",
            7.6,
            doubleArrayOf(1.6, 71.0, 0.6, 43.0, 57.9, 3.5, 2.4, 67.0, 862.0)
        )
    )
    data.add(
        arrayOf(
            "Peaches, Dried", "1 lb.", 15.7, doubleArrayOf(8.5, 87.0, 1.7, 173.0, 86.8, 1.2, 4.3, 55.0, 57.0)
        )
    )
    data.add(
        arrayOf(
            "Prunes, Dried", "1 lb.", 9, doubleArrayOf(12.8, 99.0, 2.5, 154.0, 85.7, 3.9, 4.3, 65.0, 257.0)
        )
    )
    data.add(
        arrayOf(
            "Raisins, Dried",
            "15 oz.",
            9.4,
            doubleArrayOf(13.5, 104.0, 2.5, 136.0, 4.5, 6.3, 1.4, 24.0, 136.0)
        )
    )
    data.add(
        arrayOf(
            "Peas, Dried", "1 lb.", 7.9, doubleArrayOf(20.0, 1367.0, 4.2, 345.0, 2.9, 28.7, 18.4, 162.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Lima Beans, Dried",
            "1 lb.",
            8.9,
            doubleArrayOf(17.4, 1055.0, 3.7, 459.0, 5.1, 26.9, 38.2, 93.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Navy Beans, Dried",
            "1 lb.",
            5.9,
            doubleArrayOf(26.9, 1691.0, 11.4, 792.0, 0.0, 38.4, 24.6, 217.0, 0.0)
        )
    )
    data.add(arrayOf("Coffee", "1 lb.", 22.4, doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 5.1, 50.0, 0.0)))
    data.add(arrayOf("Tea", "1/4 lb.", 17.4, doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.3, 42.0, 0.0)))
    data.add(arrayOf("Cocoa", "8 oz.", 8.6, doubleArrayOf(8.7, 237.0, 3.0, 72.0, 0.0, 2.0, 11.9, 40.0, 0.0)))
    data.add(
        arrayOf(
            "Chocolate", "8 oz.", 16.2, doubleArrayOf(8.0, 77.0, 1.3, 39.0, 0.0, 0.9, 3.4, 14.0, 0.0)
        )
    )
    data.add(arrayOf("Sugar", "10 lb.", 51.7, doubleArrayOf(34.9, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)))
    data.add(
        arrayOf(
            "Corn Syrup", "24 oz.", 13.7, doubleArrayOf(14.7, 0.0, 0.5, 74.0, 0.0, 0.0, 0.0, 5.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Molasses", "18 oz.", 13.6, doubleArrayOf(9.0, 0.0, 10.3, 244.0, 0.0, 1.9, 7.5, 146.0, 0.0)
        )
    )
    data.add(
        arrayOf(
            "Strawberry Preserves",
            "1 lb.",
            20.5,
            doubleArrayOf(6.4, 11.0, 0.4, 7.0, 0.2, 0.2, 0.4, 3.0, 0.0)
        )
    )
    return data
}