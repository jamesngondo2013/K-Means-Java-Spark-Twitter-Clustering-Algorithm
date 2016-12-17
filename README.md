# K-Means Clustering Algorithm
## Java-Apache Spark Twitter Clustering


### About the application

A Java machine learning program which uses Spark to cluster given Twitter tweets by their geographic origins (coordinates), using the K-means clustering algorithm.
Reading data from a given data file, twitter2D.txt with (fictitious) Twitter tweets and their attributes. The first two values in each line are the world coordinates 
from which the respective tweet was posted. The other values are time stamp, user id number, an optional(!) flag 1=spam/0=no spam, and finally the actual 
tweet message. The program obtains a K-means model (with five clusters) from this file. From each line in the file, only the coordinates are required 
as features for training the model, that is, the other attributes (time stamp, spam flag, user id) and the actual tweet message can be ignored when learning 
the model. We use all coordinates in the file to train the model.
Finally, the program prints every tweet in the given file together with its respective cluster index (that is, the cluster which contain that tweet’s 
coordinates, according to the learned model). The output of the program looks like this:

    `Tweet Hey all this is what I did yesterday... is in cluster 4`
    `Tweet I don't know if I've ever been to #Hmburg is in cluster 0`
    `Tweet Aprenda hablar amigo is in cluster 2`
    `Tweet Big cash by retweeting this now! is in cluster 0 `
