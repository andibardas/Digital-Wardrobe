import React from "react";
import { Container, Button, Grid, Typography, Box } from "@mui/material";

export default function Home() {
  return (
    <Container>
      {/* Hero Section */}
      <Box sx={{ textAlign: "center", marginTop: 4 }}>
        <Typography variant="h3" gutterBottom>
          Welcome to Your Digital Wardrobe
        </Typography>
        <Typography variant="h6" paragraph>
          Organize, Recommend, and Try On Your Outfits.
        </Typography>
        <Button variant="contained" color="primary" href="/wardrobe" sx={{ marginRight: 2 }}>
          Start Organizing
        </Button>
        <Button variant="outlined" color="primary" href="/recommend" sx={{ marginLeft: 2 }}>
          Get Outfit Suggestions
        </Button>
      </Box>

      {/* Features Section */}
      <Grid container spacing={4} sx={{ marginTop: 6 }}>
        <Grid item xs={12} sm={4} textAlign="center">
          <Typography variant="h5" gutterBottom>
            Organize Your Wardrobe
          </Typography>
          <Typography paragraph>
            Upload, categorize, and manage your clothes easily.
          </Typography>
        </Grid>
        <Grid item xs={12} sm={4} textAlign="center">
          <Typography variant="h5" gutterBottom>
            AI-Powered Recommendations
          </Typography>
          <Typography paragraph>
            Get outfit suggestions based on your preferences and trends.
          </Typography>
        </Grid>
        <Grid item xs={12} sm={4} textAlign="center">
          <Typography variant="h5" gutterBottom>
            Virtual Try-On
          </Typography>
          <Typography paragraph>
            Try on clothes virtually before making any decisions.
          </Typography>
        </Grid>
      </Grid>

      {/* Call to Action */}
      <Box sx={{ textAlign: "center", marginTop: 6 }}>
        <Typography variant="h6" paragraph>
          Ready to Get Started?
        </Typography>
        <Button variant="contained" color="primary" href="/wardrobe">
          Start Now
        </Button>
      </Box>
    </Container>
  );
}
