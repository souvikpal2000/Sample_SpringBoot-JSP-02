<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Bid Submitted</title>
		<link rel="stylesheet" href="/css/styles.css">
	</head>
	<body>
		<div class="container">
			<h1>Bid Submitted</h1>
			<p>Your Bid is now active. If your bid is successful, you will be notified within 24 hours of the close of bidding</p>
			<table>
				<tbody>
					<tr class="itemName">
						<td><h3>${itemName}</h3></td>
					</tr>
					<tr>
						<td><h3>Item ID: ${itemId}</h3></td>
					</tr>
					<tr>
						<td><h3>Name: ${name}</h3></td>
					</tr>
					<tr>
						<td><h3>Email address: ${email}</h3></td>
					</tr>
					<tr>
						<td><h3>Bid price: Rs${bidAmount}</h3></td>
					</tr>
					<tr>
						<td><h3>Auto-increment price: ${autoIncrement}</h3></td>
					</tr>
				<tbody>
			</table>
		</div>
	</body>
</html>