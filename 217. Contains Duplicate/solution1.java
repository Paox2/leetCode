    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i:nums){
            
            // check if already present before adding
            if(numSet.contains(i)){
                return true;
            } 
            
            // add if not
            else{
                numSet.add(i);
            }
        }
        return false;
    }