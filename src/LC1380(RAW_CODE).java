        List<Integer> r = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            int min = matrix[i][0];
            int colidx = 0;
            for(int j = 1; j < n; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    colidx = j;
                }
            }
            boolean luck = true;
            for(int k = 0; k < m; k++){
                if(matrix[k][colidx] > min){
                    luck = false;
                    break;
                }
            }
            if(luck){
                r.add(min);
            }
        }
        return r;
