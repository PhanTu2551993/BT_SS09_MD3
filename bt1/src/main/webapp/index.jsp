<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="CalculateDiscountServlet" method="post">
    <label for="description">Product Description:</label>
    <input type="text" id="description" name="description" required><br><br>

    <label for="price">List Price:</label>
    <input type="number" id="price" name="price" min="0" required><br><br>

    <label for="discount">Discount Percent (%):</label>
    <input type="number" id="discount" name="discount" min="0" max="100" required><br><br>

    <button type="submit">Calculate Discount</button>
</form>
</body>
</html>
