package nuig.data.analytics.SparkTwitterClustering;

public class TweetClusters {

	private static String[] clusterArray;
	private static String[] msgArray;
	
	static void processingTweetsAndClusters(String clusterColumn, String tweetColumn) {
		// create string arrays from clusters and message tweets columns and split by commas
		clusterArray = clusterColumn.split(",");
        msgArray = tweetColumn.split(",");
        
        //loop through the predArray and concatenates each tweet(msgArray) with its cluster(predArray)
        //and replace all the square brackets with blank space
        for (int i = 0; i < clusterArray.length; i++) {
        	
        	String tweet= msgArray[i]       //get a tweet at a specified index of the msgArray array
           			.replaceAll("\\[", " ")
           			.replaceAll("\\]"," ")
           			.toString();
        		
        	String cluster= clusterArray[i] //get a cluster at a specified index of the msgArray array
            		.replaceAll("\\[", " ")
            		.replaceAll("\\]"," ")
            		.toString();
        		 
        	// print the tweet and its associated cluster
            System.out.println("Tweet " + tweet + " is in cluster " + cluster);	   	
		}
	}
}
