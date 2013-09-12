public class Workshop1 {
        /**
         * Retrieve the intensity value at location ('row', 'column') of the image 'img' and return it
         * Note: 
         * - the 2D image is stored as an 8bit, 1D, row-major array of type byte
         * - the data type byte is signed in Java
         * - Slide 27 of chapter 2 introduces the representation of an image
         * @param img in row major format
         * @param row to evaluate
         * @param column to evaluate
         * @param width of img
         * @param height of img
         * @return the intensity value at row and column if within bounds, -1 otherwise
         */
        public int getIntensityValue(byte[] img, int row, int column, int width, int height) {
                return img[row * width + column];
        }
        
        /**
         * Sets the pixels N8(row, column) to white. Note: 8-Neighbor is defined on slide 36 of chapter 2.
         * @param img with four neigbors of (row, column) set to white
         * @param row to evaluate
         * @param column to evaluate
         * @param width of img
         * @param height of img
         */
        public void setEightNeighborsToWhite(byte[] img, int row, int column, int width, int height) {
                int[][] N8 = new int[8][2];
                N8[0][0] = row - 1;
                N8[0][1] = column - 1;
                N8[1][0] = row - 1;
                N8[1][1] = column;
                N8[2][0] = row - 1;
                N8[2][1] = column + 1;
                N8[3][0] = row;
                N8[3][1] = column - 1;
                N8[4][0] = row;
                N8[4][1] = column + 1;
                N8[5][0] = row + 1;
                N8[5][1] = column - 1;
                N8[6][0] = row + 1;
                N8[6][1] = column;
                N8[7][0] = row + 1;
                N8[7][1] = column + 1;
                
                for(int i = 0; i < N8.length; i++){
                        img[N8[i][0] * width + N8[i][1]] = (byte) 255; 
                }
        }
        
        /**
         * Calculates the d4 distance between (p1Row, p1Column) and (p2Row, p2Column)
         * Note: D4 distance is defined on slide 41 of chapter 2.
         * @param img that will be unchanged
         * @param p1Row 
         * @param p1Column
         * @param p2Row
         * @param p2Column
         * @param width of img
         * @param height of img
         * @return the d4 distance between (p1Row, p1Column) and (p2Row, p2Column) 
         */
        public int getD4Distance(byte[] img, int p1Row, int p1Column, int p2Row, int p2Column, int width, int height) {
                return Math.abs(p1Row - p2Row) + Math.abs(p1Column - p2Column);
        }
        
        /**
         * Marks the shortest m-path with white intensity values.
         * Note: m-path is defined on slide 38 of chapter 2.
         * @param img with the shortest MPath set to white with V = {0, ..., 127}.
         * @param p1Row
         * @param p1Column
         * @param p2Row
         * @param p2Column
         * @param width of img
         * @param height of img
         */
        public void setShortestMPathToWhite(byte[] img, int p1Row, int p1Column, int p2Row, int p2Column, int width, int height) {
        }
}