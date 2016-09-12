
public class Isosceles {
	
	public static void main(String[] args) {
		int max = 0;
		
		int coluna[] = {5, 6, 5, 8, 9, 10, 5, 8, 9, 5, 7, 9, 9, 9, 6};
		
		ajustaValorColuna(coluna);
		
		for(int i = 0; i < coluna.length; i++){
			if(max < coluna[i]){
				max = maxColuna(coluna, max, i);
			}
		}
		
		
		System.out.println(max);
	}

	
	public static void ajustaValorColuna(int coluna[]){
		int meioColuna = coluna.length/2;
		
		for(int i = 0; i < coluna.length; i++){
			if(i < meioColuna){
				if(coluna[i] > i + 1){
					coluna[i] = i + 1;
				}
			}else{				
				if(coluna[i] > coluna.length - i){
					coluna[i] = coluna.length - i;
				}
			}
		}
	}
	
	public static int maxColuna(int coluna[], int max, int pos){
		if(max > coluna[pos]){
			return max;
		}else{
			for(int ret = coluna[pos]; ret > max; ret--){
				for(int i = 1; i <= ret; i++){
					if(pos - i < 0){
						break;
					}else{
						if(coluna[pos - i] < ret - i){
							break;
						}
					}
					
					if(pos + i > coluna.length){
						break;
					}else{
						if(coluna[pos + i] < ret - i){
							break;
						}
					}
					
					if(i == ret){
						return ret;
					}
				}
			}
			return max;	
		}
		
		
	}
}
