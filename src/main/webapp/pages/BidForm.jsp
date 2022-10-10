<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Bid From</title>
		<link rel="stylesheet" href="/css/styles.css">
	</head>
	<body>
		<div class="container">
			<h1>Welcome to AP Auctions. Please Enter Bid.</h1>
			<h2><span class="alert">${alert}</span> ${message}</h2>
			<form method="post" action="submitbid">
				<p>Item ID : <input type="number" name="itemId" required/></p>
				<p>Item Name : <input type="text" name="itemName"/></p>
				<p>Your Name : <input type="text" name="name"/></p>
				<p>Your Name : <input type="text" name="name"/></p>
				<p>Your Email Address : <input type="email" name="email"/></p>
				<p>Amount Bid : <input type="number" name="bidAmount"/></p>
				<p>Auto-increment bid to match other bidders? : <input type="checkbox" name="autoIncrement" value="true"/></p>			
				<input type="submit" value="Submit Bid"/>
			</form>
		</div>
	</body>
</html>