# HotelBooking
 creating an application that will expose booking.com like REST API.

 # How to use the application 
 1. Import the maven project in eclipse.
 2. Start the postgres database.
 3. Configure the application.properties file with database url and password.
 4. Compile and run the maven project.
 5. Use postman to hit the rest api url.

 ## Service

 ### user
    1. Add user service. http://127.0.0.1:8080/adduser 
        Its a Post request which request following parameters:
        a. Username
        b.Password
        c.Fullname
        d.Email
    2.Delete user service. http://127.0.0.1:8080/deleteuser
        Its a delete request request id of the user.
    3.Update user service. http://127.0.0.1:8080/updateUser
        Its a post request which request following parameters:
        a. id 
        b. Username
        c.Password
        d.Fullname
        e.Email
    4.Fetch user servie. http://127.0.0.1:8080/fetchUser
        Its a get request to fetch all the users in database.
### hotel
       1. Add hotel service. http://127.0.0.1:8080/addHotel 
        Its a Post request which request following parameters:
        a.Name
        b.City
        c.State
        d.Street
        e.Rooms
    2.Delete hotel service. http://127.0.0.1:8080/deleteHotel
        Its a delete request request id of the user.
    3.Update hotel service. http://127.0.0.1:8080/updateHotel
        Its a post request which request following parameters:
        a. Id 
        b. Name
        c.City
        d.State
        e.Rooms
    4.Fetch hotel servie. http://127.0.0.1:8080/fetchHotel
        Its a get request to fetch all the users in database.
    5. Search hotel service. http://127.0.0.1:8080/searchHotelInArea
        Its a post request which request following parameters.
        a.City
        b.State
### Review
    1. Add review service. http://127.0.0.1:8080/addReview
        Its a post request which request following parameters.
        a. Hotelid
        b. Userid
        c. Comment
        d. Rating
    2. Update review service http://127.0.0.1:8080/updateReview
        Its a post request which request following parameter
        a. Id 
        b. Comment
        c. Rating
    3.Delete review serive http://127.0.0.1:8080/deleteReview
        Its a delete request which request for following parameter
        a. Id
    4.Fetch review of hotel service http://127.0.0.1:8080/fetchReviewOfHotel
        its a get request which request for following parameters
        a. Hotelid